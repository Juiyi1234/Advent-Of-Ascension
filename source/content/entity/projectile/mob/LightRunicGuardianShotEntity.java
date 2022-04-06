package net.tslat.aoa3.content.entity.projectile.mob;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.ThrowableEntity;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoAEntities;
import net.tslat.aoa3.content.entity.base.AoARangedMob;

public class LightRunicGuardianShotEntity extends BaseMobProjectile {
	public LightRunicGuardianShotEntity(EntityType<? extends ThrowableEntity> entityType, World world) {
		super(entityType, world);
	}

	public LightRunicGuardianShotEntity(World world) {
		super(AoAEntities.Projectiles.LIGHT_RUNIC_GUARDIAN_SHOT.get(), world);
	}

	public LightRunicGuardianShotEntity(AoARangedMob shooter, Type projectileType) {
		super(AoAEntities.Projectiles.LIGHT_RUNIC_GUARDIAN_SHOT.get(), shooter.level, shooter, projectileType);
	}

	@Override
	public float getGravity() {
		return 0.055f;
	}
}