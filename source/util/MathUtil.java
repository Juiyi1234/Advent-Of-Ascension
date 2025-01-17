package net.tslat.aoa3.util;

import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

/**
 * You're welcome to copy/use this code in its entirety as needed!<br>
 * Just credit me (Tslat) if you do :)
 */
public final class MathUtil {
	public static Iterable<Vec3> inLateralCircle(Vec3 center, double radius, double granularity) {
		return new Iterable<>() {
			@NotNull
			@Override
			public Iterator<Vec3> iterator() {
				return new Iterator<>() {
					private final double increment = Mth.TWO_PI / granularity;
					private double theta = 0;

					@Override
					public boolean hasNext() {
						return this.theta < Mth.TWO_PI;
					}

					@Override
					public Vec3 next() {
						double angle = this.theta;
						this.theta += this.increment;

						return center.add(Math.cos(angle) * radius, 0, Math.sin(angle) * radius);
					}
				};
			}
		};
	}

	public static Iterable<Vec3> inLine(Vec3 start, Vec3 end, double granularity) {
		return new Iterable<>() {
			@NotNull
			@Override
			public Iterator<Vec3> iterator() {
				return new Iterator<>() {
					private final Vec3 angle = start.vectorTo(end).normalize();
					private final double length = start.distanceTo(end);
					private final double increment = this.length / granularity;
					private double step = 0;

					@Override
					public boolean hasNext() {
						return this.step <= this.length;
					}

					@Override
					public Vec3 next() {
						double scale = this.step;
						this.step += this.increment;

						return start.add(this.angle.multiply(scale, scale, scale));
					}
				};
			}
		};
	}

	public static Iterable<Vec3> inSphere(Vec3 center, double radius, double granularity) {
		return new Iterable<>() {
			@NotNull
			@Override
			public Iterator<Vec3> iterator() {
				return new Iterator<>() {
					private final double increment = Mth.PI / granularity;
					private double theta = -Mth.HALF_PI;
					private double phi = 0;

					@Override
					public boolean hasNext() {
						return this.theta < Mth.HALF_PI || this.phi < Mth.TWO_PI;
					}

					@Override
					public Vec3 next() {
						double currentTheta = this.theta;
						double currentPhi = this.phi;

						if (this.phi >= Mth.TWO_PI) {
							this.theta += this.increment;
							this.phi = 0;
						}

						this.phi += this.increment;

						return center.add(Math.cos(currentTheta) * Math.sin(currentPhi) * radius, Math.cos(currentTheta) * Math.cos(currentPhi) * radius, Math.sin(currentTheta) * radius);
					}
				};
			}
		};
	}
}
