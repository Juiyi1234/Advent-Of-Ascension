package net.tslat.aoa3.content.block.generation.plants;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.tslat.aoa3.util.EntityUtil;
import net.tslat.effectslib.api.util.EffectBuilder;

public class MysticBush extends BushBlock {
	public MysticBush(BlockBehaviour.Properties properties) {
		super(properties);
	}

	@Override
	public void entityInside(BlockState state, Level world, BlockPos pos, Entity entity) {
		if (entity instanceof Player)
			EntityUtil.applyPotions(entity, new EffectBuilder(MobEffects.JUMP, 30).level(4));
	}
}
