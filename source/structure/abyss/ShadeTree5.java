package net.tslat.aoa3.structure.abyss;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class ShadeTree5 extends AoAStructure { //StructureSize: 5x34x5
	private static final IBlockState shadowLeaves = BlockRegister.SHADOW_LEAVES.getDefaultState();
	private static final IBlockState shadowLog = BlockRegister.SHADOW_LOG.getDefaultState();

	public ShadeTree5() {
		super("ShadeTree5");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 2, 0, 2, shadowLog);
		addBlock(world, basePos, 2, 1, 2, shadowLog);
		addBlock(world, basePos, 2, 2, 2, shadowLog);
		addBlock(world, basePos, 2, 3, 2, shadowLog);
		addBlock(world, basePos, 2, 4, 2, shadowLog);
		addBlock(world, basePos, 2, 5, 2, shadowLog);
		addBlock(world, basePos, 2, 6, 2, shadowLog);
		addBlock(world, basePos, 2, 7, 2, shadowLog);
		addBlock(world, basePos, 2, 8, 2, shadowLog);
		addBlock(world, basePos, 2, 9, 2, shadowLog);
		addBlock(world, basePos, 2, 10, 2, shadowLog);
		addBlock(world, basePos, 2, 11, 2, shadowLog);
		addBlock(world, basePos, 2, 12, 2, shadowLog);
		addBlock(world, basePos, 2, 13, 2, shadowLog);
		addBlock(world, basePos, 2, 14, 2, shadowLog);
		addBlock(world, basePos, 2, 15, 2, shadowLog);
		addBlock(world, basePos, 2, 16, 2, shadowLog);
		addBlock(world, basePos, 2, 17, 2, shadowLog);
		addBlock(world, basePos, 2, 18, 2, shadowLog);
		addBlock(world, basePos, 2, 19, 2, shadowLog);
		addBlock(world, basePos, 2, 20, 2, shadowLog);
		addBlock(world, basePos, 2, 21, 2, shadowLog);
		addBlock(world, basePos, 2, 22, 2, shadowLog);
		addBlock(world, basePos, 2, 23, 2, shadowLog);
		addBlock(world, basePos, 2, 24, 2, shadowLog);
		addBlock(world, basePos, 1, 25, 1, shadowLeaves);
		addBlock(world, basePos, 1, 25, 2, shadowLeaves);
		addBlock(world, basePos, 1, 25, 3, shadowLeaves);
		addBlock(world, basePos, 2, 25, 1, shadowLeaves);
		addBlock(world, basePos, 2, 25, 2, shadowLog);
		addBlock(world, basePos, 2, 25, 3, shadowLeaves);
		addBlock(world, basePos, 3, 25, 1, shadowLeaves);
		addBlock(world, basePos, 3, 25, 2, shadowLeaves);
		addBlock(world, basePos, 3, 25, 3, shadowLeaves);
		addBlock(world, basePos, 0, 26, 0, shadowLeaves);
		addBlock(world, basePos, 0, 26, 1, shadowLeaves);
		addBlock(world, basePos, 0, 26, 2, shadowLeaves);
		addBlock(world, basePos, 0, 26, 3, shadowLeaves);
		addBlock(world, basePos, 0, 26, 4, shadowLeaves);
		addBlock(world, basePos, 1, 26, 0, shadowLeaves);
		addBlock(world, basePos, 1, 26, 4, shadowLeaves);
		addBlock(world, basePos, 2, 26, 0, shadowLeaves);
		addBlock(world, basePos, 2, 26, 2, shadowLog);
		addBlock(world, basePos, 2, 26, 4, shadowLeaves);
		addBlock(world, basePos, 3, 26, 0, shadowLeaves);
		addBlock(world, basePos, 3, 26, 4, shadowLeaves);
		addBlock(world, basePos, 4, 26, 0, shadowLeaves);
		addBlock(world, basePos, 4, 26, 1, shadowLeaves);
		addBlock(world, basePos, 4, 26, 2, shadowLeaves);
		addBlock(world, basePos, 4, 26, 3, shadowLeaves);
		addBlock(world, basePos, 4, 26, 4, shadowLeaves);
		addBlock(world, basePos, 2, 27, 2, shadowLog);
		addBlock(world, basePos, 1, 28, 1, shadowLeaves);
		addBlock(world, basePos, 1, 28, 2, shadowLeaves);
		addBlock(world, basePos, 1, 28, 3, shadowLeaves);
		addBlock(world, basePos, 2, 28, 1, shadowLeaves);
		addBlock(world, basePos, 2, 28, 2, shadowLog);
		addBlock(world, basePos, 2, 28, 3, shadowLeaves);
		addBlock(world, basePos, 3, 28, 1, shadowLeaves);
		addBlock(world, basePos, 3, 28, 2, shadowLeaves);
		addBlock(world, basePos, 3, 28, 3, shadowLeaves);
		addBlock(world, basePos, 0, 29, 0, shadowLeaves);
		addBlock(world, basePos, 0, 29, 1, shadowLeaves);
		addBlock(world, basePos, 0, 29, 2, shadowLeaves);
		addBlock(world, basePos, 0, 29, 3, shadowLeaves);
		addBlock(world, basePos, 0, 29, 4, shadowLeaves);
		addBlock(world, basePos, 1, 29, 0, shadowLeaves);
		addBlock(world, basePos, 1, 29, 4, shadowLeaves);
		addBlock(world, basePos, 2, 29, 0, shadowLeaves);
		addBlock(world, basePos, 2, 29, 2, shadowLog);
		addBlock(world, basePos, 2, 29, 4, shadowLeaves);
		addBlock(world, basePos, 3, 29, 0, shadowLeaves);
		addBlock(world, basePos, 3, 29, 4, shadowLeaves);
		addBlock(world, basePos, 4, 29, 0, shadowLeaves);
		addBlock(world, basePos, 4, 29, 1, shadowLeaves);
		addBlock(world, basePos, 4, 29, 2, shadowLeaves);
		addBlock(world, basePos, 4, 29, 3, shadowLeaves);
		addBlock(world, basePos, 4, 29, 4, shadowLeaves);
		addBlock(world, basePos, 2, 30, 2, shadowLog);
		addBlock(world, basePos, 1, 31, 1, shadowLeaves);
		addBlock(world, basePos, 1, 31, 2, shadowLeaves);
		addBlock(world, basePos, 1, 31, 3, shadowLeaves);
		addBlock(world, basePos, 2, 31, 1, shadowLeaves);
		addBlock(world, basePos, 2, 31, 2, shadowLog);
		addBlock(world, basePos, 2, 31, 3, shadowLeaves);
		addBlock(world, basePos, 3, 31, 1, shadowLeaves);
		addBlock(world, basePos, 3, 31, 2, shadowLeaves);
		addBlock(world, basePos, 3, 31, 3, shadowLeaves);
		addBlock(world, basePos, 0, 32, 0, shadowLeaves);
		addBlock(world, basePos, 0, 32, 1, shadowLeaves);
		addBlock(world, basePos, 0, 32, 2, shadowLeaves);
		addBlock(world, basePos, 0, 32, 3, shadowLeaves);
		addBlock(world, basePos, 0, 32, 4, shadowLeaves);
		addBlock(world, basePos, 1, 32, 0, shadowLeaves);
		addBlock(world, basePos, 1, 32, 4, shadowLeaves);
		addBlock(world, basePos, 2, 32, 0, shadowLeaves);
		addBlock(world, basePos, 2, 32, 2, shadowLog);
		addBlock(world, basePos, 2, 32, 4, shadowLeaves);
		addBlock(world, basePos, 3, 32, 0, shadowLeaves);
		addBlock(world, basePos, 3, 32, 4, shadowLeaves);
		addBlock(world, basePos, 4, 32, 0, shadowLeaves);
		addBlock(world, basePos, 4, 32, 1, shadowLeaves);
		addBlock(world, basePos, 4, 32, 2, shadowLeaves);
		addBlock(world, basePos, 4, 32, 3, shadowLeaves);
		addBlock(world, basePos, 4, 32, 4, shadowLeaves);
		addBlock(world, basePos, 1, 33, 2, shadowLeaves);
		addBlock(world, basePos, 2, 33, 1, shadowLeaves);
		addBlock(world, basePos, 2, 33, 2, shadowLeaves);
		addBlock(world, basePos, 2, 33, 3, shadowLeaves);
		addBlock(world, basePos, 3, 33, 2, shadowLeaves);
	}
}