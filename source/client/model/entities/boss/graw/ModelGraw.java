package net.tslat.aoa3.client.model.entities.boss.graw;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelGraw extends ModelBase {
	private ModelRenderer shape1;
	private ModelRenderer WingL;
	private ModelRenderer shape2;
	private ModelRenderer shape3;
	private ModelRenderer shape4;
	private ModelRenderer shape5;
	private ModelRenderer shape6;
	private ModelRenderer shape7;
	private ModelRenderer shape8;
	private ModelRenderer shape9;
	private ModelRenderer WingR;
	private ModelRenderer WingR2;
	private ModelRenderer WingL2;
	private ModelRenderer WingR3;
	private ModelRenderer WingL3;
	private ModelRenderer WingR4;
	private ModelRenderer WingL4;
	private ModelRenderer shape10;
	private ModelRenderer shape11;
	private ModelRenderer shape12;
	private ModelRenderer shape13;
	private ModelRenderer shape14;
	private ModelRenderer shape15;
	private ModelRenderer shape16;
	private ModelRenderer shape17;
	private ModelRenderer shape18;
	private ModelRenderer shape19;
	private ModelRenderer shape20;
	private ModelRenderer shape21;

	public ModelGraw() {
		textureWidth = 256;
		textureHeight = 64;
		(shape1 = new ModelRenderer(this, 82, 0)).addBox(0.0f, 0.0f, 0.0f, 14, 8, 14);
		shape1.setRotationPoint(-7.0f, 3.0f, 19.0f);
		shape1.setTextureSize(256, 64);
		shape1.mirror = true;
		setRotation(shape1, 0.0f, 0.0f, 0.0f);
		(WingL = new ModelRenderer(this, 196, 10)).addBox(0.0f, 1.0f, 20.0f, 22, 1, 2);
		WingL.setRotationPoint(10.0f, 11.0f, 2.0f);
		WingL.setTextureSize(256, 64);
		WingL.mirror = true;
		setRotation(WingL, 0.0f, 0.0f, 0.0f);
		(shape2 = new ModelRenderer(this, 82, 0)).addBox(0.0f, 0.0f, 0.0f, 14, 8, 14);
		shape2.setRotationPoint(-7.0f, 3.0f, 2.0f);
		shape2.setTextureSize(256, 64);
		shape2.mirror = true;
		setRotation(shape2, 0.0f, 0.0f, 0.0f);
		(shape3 = new ModelRenderer(this, 140, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 6, 2);
		shape3.setRotationPoint(-1.0f, 17.0f, -18.0f);
		shape3.setTextureSize(256, 64);
		shape3.mirror = true;
		setRotation(shape3, 0.0f, 0.0f, 0.0f);
		(shape4 = new ModelRenderer(this, 113, 23)).addBox(0.0f, 0.0f, 0.0f, 14, 7, 14);
		shape4.setRotationPoint(-7.0f, 11.0f, -14.0f);
		shape4.setTextureSize(256, 64);
		shape4.mirror = true;
		setRotation(shape4, 0.0f, 0.0f, 0.0f);
		(shape5 = new ModelRenderer(this, 0, 39)).addBox(16.0f, 0.0f, 0.0f, 0, 2, 16);
		shape5.setRotationPoint(-8.0f, 19.0f, -16.0f);
		shape5.setTextureSize(256, 64);
		shape5.mirror = true;
		setRotation(shape5, 0.0f, 0.0f, 0.0f);
		(shape6 = new ModelRenderer(this, 140, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 6, 2);
		shape6.setRotationPoint(-8.0f, 17.0f, -18.0f);
		shape6.setTextureSize(256, 64);
		shape6.mirror = true;
		setRotation(shape6, 0.0f, 0.0f, 0.0f);
		(shape7 = new ModelRenderer(this, 140, 0)).addBox(0.0f, 0.0f, 0.0f, 2, 6, 2);
		shape7.setRotationPoint(6.0f, 17.0f, -18.0f);
		shape7.setTextureSize(256, 64);
		shape7.mirror = true;
		setRotation(shape7, 0.0f, 0.0f, 0.0f);
		(shape8 = new ModelRenderer(this, 140, 0)).addBox(0.0f, 0.0f, 0.0f, 16, 2, 16);
		shape8.setRotationPoint(-8.0f, 21.0f, -16.0f);
		shape8.setTextureSize(256, 64);
		shape8.mirror = true;
		setRotation(shape8, 0.0f, 0.0f, 0.0f);
		(shape9 = new ModelRenderer(this, 0, 39)).addBox(0.0f, 0.0f, 0.0f, 0, 2, 16);
		shape9.setRotationPoint(-8.0f, 19.0f, -16.0f);
		shape9.setTextureSize(256, 64);
		shape9.mirror = true;
		setRotation(shape9, 0.0f, 0.0f, 0.0f);
		(WingR = new ModelRenderer(this, 196, 10)).addBox(-21.0f, 1.0f, 20.0f, 22, 1, 2);
		WingR.setRotationPoint(-11.0f, 11.0f, 2.0f);
		WingR.setTextureSize(256, 64);
		WingR.mirror = true;
		setRotation(WingR, 0.0f, 0.0f, 0.0f);
		(WingR2 = new ModelRenderer(this, 159, 21)).addBox(-21.0f, 0.0f, 0.0f, 22, 5, 6);
		WingR2.setRotationPoint(-11.0f, 11.0f, 2.0f);
		WingR2.setTextureSize(256, 64);
		WingR2.mirror = true;
		setRotation(WingR2, 0.0f, 0.0f, 0.0f);
		(WingL2 = new ModelRenderer(this, 159, 21)).addBox(0.0f, 0.0f, 0.0f, 22, 5, 6);
		WingL2.setRotationPoint(10.0f, 11.0f, 2.0f);
		WingL2.setTextureSize(256, 64);
		WingL2.mirror = true;
		setRotation(WingL2, 0.0f, 0.0f, 0.0f);
		(WingR3 = new ModelRenderer(this, 102, 46)).addBox(-21.0f, 2.0f, 6.0f, 22, 1, 16);
		WingR3.setRotationPoint(-11.0f, 11.0f, 2.0f);
		WingR3.setTextureSize(256, 64);
		WingR3.mirror = true;
		setRotation(WingR3, 0.0f, 0.0f, 0.0f);
		(WingL3 = new ModelRenderer(this, 102, 46)).addBox(0.0f, 2.0f, 6.0f, 22, 1, 16);
		WingL3.setRotationPoint(10.0f, 11.0f, 2.0f);
		WingL3.setTextureSize(256, 64);
		WingL3.mirror = true;
		setRotation(WingL3, 0.0f, 0.0f, 0.0f);
		(WingR4 = new ModelRenderer(this, 196, 10)).addBox(-21.0f, 1.0f, 12.0f, 22, 1, 2);
		WingR4.setRotationPoint(-11.0f, 11.0f, 2.0f);
		WingR4.setTextureSize(256, 64);
		WingR4.mirror = true;
		setRotation(WingR4, 0.0f, 0.0f, 0.0f);
		(WingL4 = new ModelRenderer(this, 196, 10)).addBox(0.0f, 1.0f, 12.0f, 22, 1, 2);
		WingL4.setRotationPoint(10.0f, 11.0f, 2.0f);
		WingL4.setTextureSize(256, 64);
		WingL4.mirror = true;
		setRotation(WingL4, 0.0f, 0.0f, 0.0f);
		(shape10 = new ModelRenderer(this, 175, 34)).addBox(-3.0f, -12.0f, 0.0f, 6, 22, 1);
		shape10.setRotationPoint(12.0f, 10.0f, 35.0f);
		shape10.setTextureSize(256, 64);
		shape10.mirror = true;
		setRotation(shape10, 0.0f, 0.0f, 0.6981317f);
		(shape11 = new ModelRenderer(this, 202, 35)).addBox(0.0f, 0.0f, 0.0f, 8, 8, 16);
		shape11.setRotationPoint(6.0f, 14.0f, 31.0f);
		shape11.setTextureSize(256, 64);
		shape11.mirror = true;
		setRotation(shape11, 0.0f, 1.047198f, 0.0f);
		(shape12 = new ModelRenderer(this, 49, 49)).addBox(3.0f, 6.0f, 16.0f, 2, 2, 6);
		shape12.setRotationPoint(6.0f, 14.0f, 31.0f);
		shape12.setTextureSize(256, 64);
		shape12.mirror = true;
		setRotation(shape12, 0.0f, 1.047198f, 0.0f);
		(shape13 = new ModelRenderer(this, 202, 35)).addBox(0.0f, 0.0f, 0.0f, 8, 8, 16);
		shape13.setRotationPoint(-10.0f, 14.0f, 24.0f);
		shape13.setTextureSize(256, 64);
		shape13.mirror = true;
		setRotation(shape13, 0.0f, -1.047198f, 0.0f);
		(shape14 = new ModelRenderer(this, 49, 49)).addBox(6.0f, 6.0f, 16.0f, 2, 2, 6);
		shape14.setRotationPoint(-10.0f, 14.0f, 24.0f);
		shape14.setTextureSize(256, 64);
		shape14.mirror = true;
		setRotation(shape14, 0.0f, -1.047198f, 0.0f);
		(shape15 = new ModelRenderer(this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 20, 12, 35);
		shape15.setRotationPoint(-10.0f, 11.0f, 0.0f);
		shape15.setTextureSize(256, 64);
		shape15.mirror = true;
		setRotation(shape15, 0.0f, 0.0f, 0.0f);
		(shape16 = new ModelRenderer(this, 175, 34)).addBox(-3.0f, -12.0f, 0.0f, 6, 22, 1);
		shape16.setRotationPoint(0.0f, 9.0f, 35.0f);
		shape16.setTextureSize(256, 64);
		shape16.mirror = true;
		setRotation(shape16, 0.0f, 0.0f, 0.0f);
		(shape17 = new ModelRenderer(this, 175, 34)).addBox(-3.0f, -12.0f, 0.0f, 6, 22, 1);
		shape17.setRotationPoint(-12.0f, 10.0f, 35.0f);
		shape17.setTextureSize(256, 64);
		shape17.mirror = true;
		setRotation(shape17, 0.0f, 0.0f, -0.6981317f);
		(shape18 = new ModelRenderer(this, 49, 49)).addBox(6.0f, 6.0f, 16.0f, 2, 2, 6);
		shape18.setRotationPoint(6.0f, 14.0f, 31.0f);
		shape18.setTextureSize(256, 64);
		shape18.mirror = true;
		setRotation(shape18, 0.0f, 1.047198f, 0.0f);
		(shape19 = new ModelRenderer(this, 49, 49)).addBox(0.0f, 6.0f, 16.0f, 2, 2, 6);
		shape19.setRotationPoint(-10.0f, 14.0f, 24.0f);
		shape19.setTextureSize(256, 64);
		shape19.mirror = true;
		setRotation(shape19, 0.0f, -1.047198f, 0.0f);
		(shape20 = new ModelRenderer(this, 49, 49)).addBox(0.0f, 6.0f, 16.0f, 2, 2, 6);
		shape20.setRotationPoint(6.0f, 14.0f, 31.0f);
		shape20.setTextureSize(256, 64);
		shape20.mirror = true;
		setRotation(shape20, 0.0f, 1.047198f, 0.0f);
		(shape21 = new ModelRenderer(this, 49, 49)).addBox(3.0f, 6.0f, 16.0f, 2, 2, 6);
		shape21.setRotationPoint(-10.0f, 14.0f, 24.0f);
		shape21.setTextureSize(256, 64);
		shape21.mirror = true;
		setRotation(shape21, 0.0f, -1.047198f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		shape1.render(par7);
		WingL.render(par7);
		shape2.render(par7);
		shape3.render(par7);
		shape4.render(par7);
		shape5.render(par7);
		shape6.render(par7);
		shape7.render(par7);
		shape8.render(par7);
		shape9.render(par7);
		WingR.render(par7);
		WingR2.render(par7);
		WingL2.render(par7);
		WingR3.render(par7);
		WingL3.render(par7);
		WingR4.render(par7);
		WingL4.render(par7);
		shape10.render(par7);
		shape11.render(par7);
		shape12.render(par7);
		shape13.render(par7);
		shape14.render(par7);
		shape15.render(par7);
		shape16.render(par7);
		shape17.render(par7);
		shape18.render(par7);
		shape19.render(par7);
		shape20.render(par7);
		shape21.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		WingR.rotateAngleZ = MathHelper.cos(par3 * 0.1f) * 3.1415927f * 0.15f;
		WingL.rotateAngleZ = -WingR.rotateAngleZ;
		WingR2.rotateAngleZ = MathHelper.cos(par3 * 0.1f) * 3.1415927f * 0.15f;
		WingL2.rotateAngleZ = -WingR.rotateAngleZ;
		WingR3.rotateAngleZ = MathHelper.cos(par3 * 0.1f) * 3.1415927f * 0.15f;
		WingL3.rotateAngleZ = -WingR.rotateAngleZ;
		WingR4.rotateAngleZ = MathHelper.cos(par3 * 0.1f) * 3.1415927f * 0.15f;
		WingL4.rotateAngleZ = -WingR.rotateAngleZ;
	}
}