package net.tslat.aoa3.client.model.entity.tablet;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ResistanceTabletModel extends EntityModel<Entity> {
	private final ModelRenderer base;
	private final ModelRenderer icon;

	public ResistanceTabletModel() {
		textureWidth = 32;
		textureHeight = 32;

		base = new ModelRenderer(this);
		base.setRotationPoint(0.0F, 24.0F, 0.0F);
		base.setTextureOffset(0, 0).addBox(-4.0F, -1.05F, -4.0F, 8, 1, 5, 0.0F, false);
		base.setTextureOffset(0, 26).addBox(-4.0F, -1.04F, -4.0F, 8, 1, 5, 0.0F, false);
		base.setTextureOffset(9, 0).addBox(-3.5F, -1.05F, 1.0F, 7, 1, 4, 0.0F, false);
		base.setTextureOffset(1, 27).addBox(-3.5F, -1.04F, 1.0F, 7, 1, 4, 0.0F, false);
		base.setTextureOffset(0, 8).addBox(-4.5F, -1.0F, -4.5F, 9, 1, 1, 0.0F, false);
		base.setTextureOffset(0, 6).addBox(-0.2844F, -1.0F, 4.4658F, 4, 1, 1, 0.0F, false);
		base.setTextureOffset(0, 6).addBox(-3.7156F, -1.0F, 4.4658F, 4, 1, 1, 0.0F, false);
		base.setTextureOffset(0, 6).addBox(-3.7156F, -1.25F, 4.4658F, 4, 1, 1, 0.0F, true);
		base.setTextureOffset(10, 6).addBox(-0.2844F, -1.25F, 4.4658F, 4, 1, 1, 0.0F, true);
		base.setTextureOffset(0, 8).addBox(-4.5F, -1.25F, -4.5F, 9, 1, 1, 0.0F, false);

		ModelRenderer cube2 = new ModelRenderer(this);
		cube2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(cube2, 0.0F, 1.4835F, 0.0F);
		base.addChild(cube2);
		cube2.setTextureOffset(0, 8).addBox(-5.1211F, -1.0F, 3.1778F, 9, 1, 1, 0.0F, false);
		cube2.setTextureOffset(0, 8).addBox(-5.1211F, -1.25F, 3.1778F, 9, 1, 1, 0.0F, false);

		ModelRenderer cube3 = new ModelRenderer(this);
		cube3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(cube3, 0.0F, -1.4835F, 0.0F);
		base.addChild(cube3);
		cube3.setTextureOffset(0, 6).addBox(-3.8789F, -1.0F, 3.1778F, 9, 1, 1, 0.0F, false);
		cube3.setTextureOffset(0, 6).addBox(-3.8789F, -1.25F, 3.1778F, 9, 1, 1, 0.0F, false);

		icon = new ModelRenderer(this);
		icon.setRotationPoint(0.0F, 24.0F, 0.0F);
		icon.setTextureOffset(0, 10).addBox(-2.0F, -1.25F, -1.0F, 3, 1, 4, 0.0F, false);
		icon.setTextureOffset(6, 10).addBox(0.9837F, -1.249F, -1.0F, 1, 1, 4, 0.0F, false);

		ModelRenderer cube = new ModelRenderer(this);
		cube.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(cube, 0.0F, 0.5236F, 0.0F);
		icon.addChild(cube);
		cube.setTextureOffset(12, 12).addBox(-1.2321F, -1.2495F, -1.866F, 2, 1, 1, 0.0F, false);
		cube.setTextureOffset(0, 12).addBox(0.0679F, -1.249F, -1.866F, 1, 1, 1, 0.0F, false);

		ModelRenderer cube4 = new ModelRenderer(this);
		cube4.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(cube4, 0.0F, -0.5236F, 0.0F);
		icon.addChild(cube4);
		cube4.setTextureOffset(12, 10).addBox(-0.7821F, -1.249F, -1.8579F, 2, 1, 1, 0.0F, false);
		cube4.setTextureOffset(0, 12).addBox(-1.0821F, -1.249F, -1.8579F, 1, 1, 1, 0.0F, false);
	}

	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {}

	@Override
	public void render(MatrixStack matrix, IVertexBuilder buffer, int light, int overlay, float red, float green, float blue, float alpha) {
		base.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		icon.render(matrix, buffer, light, overlay, red, green, blue, alpha);
	}

	private void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}