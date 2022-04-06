package net.tslat.aoa3.content.entity.tablet;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.AoAItems;
import net.tslat.aoa3.content.item.tablet.TabletItem;
import net.tslat.aoa3.library.builder.EffectBuilder;
import net.tslat.aoa3.util.EntityUtil;

public class StrengthTabletEntity extends SoulTabletEntity {
	public StrengthTabletEntity(EntityType<? extends SoulTabletEntity> entityType, World world) {
		this(entityType, world, null);
	}

	public StrengthTabletEntity(EntityType<? extends SoulTabletEntity> entityType, World world, ServerPlayerEntity placer) {
		super(entityType, world, placer);
	}

	@Override
	protected void doTickEffect() {
		EntityUtil.applyPotions(getTargetsWithinRadius(PlayerEntity.class, player -> player != null && player.isAlive()), new EffectBuilder(Effects.DAMAGE_BOOST, 10).level(2).isAmbient());
	}

	@Override
	public TabletItem getRelevantItem() {
		return (TabletItem)AoAItems.STRENGTH_TABLET.get();
	}
}