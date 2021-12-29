package net.tslat.aoa3.structure.creeponia;

import net.minecraft.block.BlockVine;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class CreepTree5 extends AoAStructure { //StructureSize: 7x11x7
	private static final IBlockState creepLeaves = BlockRegister.CREEP_LEAVES.getDefaultState();
	private static final IBlockState creepLog = BlockRegister.CREEP_LOG.getDefaultState();
	private static final IBlockState creepVineNorth = BlockRegister.CREEP_VINES.getDefaultState().withProperty(BlockVine.NORTH, true);
	private static final IBlockState creepVineSouth = BlockRegister.CREEP_VINES.getDefaultState().withProperty(BlockVine.SOUTH, true);
	private static final IBlockState creepVineWest = BlockRegister.CREEP_VINES.getDefaultState().withProperty(BlockVine.WEST, true);
	private static final IBlockState creepVineEast = BlockRegister.CREEP_VINES.getDefaultState().withProperty(BlockVine.EAST, true);

	public CreepTree5() {
		super("CreepTree5");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 3, 0, 3, creepLog);
		addBlock(world, basePos, 3, 1, 3, creepLog);
		addBlock(world, basePos, 3, 2, 3, creepLog);
		addBlock(world, basePos, 3, 3, 3, creepLog);
		addBlock(world, basePos, 3, 4, 3, creepLog);
		addBlock(world, basePos, 3, 5, 3, creepLog);
		addBlock(world, basePos, 3, 6, 3, creepLog);
		addBlock(world, basePos, 3, 7, 3, creepLog);
		addBlock(world, basePos, 1, 8, 1, creepLeaves);
		addBlock(world, basePos, 1, 8, 2, creepLeaves);
		addBlock(world, basePos, 1, 8, 3, creepLeaves);
		addBlock(world, basePos, 1, 8, 4, creepLeaves);
		addBlock(world, basePos, 1, 8, 5, creepLeaves);
		addBlock(world, basePos, 2, 8, 1, creepLeaves);
		addBlock(world, basePos, 2, 8, 2, creepLeaves);
		addBlock(world, basePos, 2, 8, 3, creepLeaves);
		addBlock(world, basePos, 2, 8, 4, creepLeaves);
		addBlock(world, basePos, 2, 8, 5, creepLeaves);
		addBlock(world, basePos, 3, 8, 1, creepLeaves);
		addBlock(world, basePos, 3, 8, 2, creepLeaves);
		addBlock(world, basePos, 3, 8, 3, creepLeaves);
		addBlock(world, basePos, 3, 8, 4, creepLeaves);
		addBlock(world, basePos, 3, 8, 5, creepLeaves);
		addBlock(world, basePos, 4, 8, 1, creepLeaves);
		addBlock(world, basePos, 4, 8, 2, creepLeaves);
		addBlock(world, basePos, 4, 8, 3, creepLeaves);
		addBlock(world, basePos, 4, 8, 4, creepLeaves);
		addBlock(world, basePos, 4, 8, 5, creepLeaves);
		addBlock(world, basePos, 5, 8, 1, creepLeaves);
		addBlock(world, basePos, 5, 8, 2, creepLeaves);
		addBlock(world, basePos, 5, 8, 3, creepLeaves);
		addBlock(world, basePos, 5, 8, 4, creepLeaves);
		addBlock(world, basePos, 5, 8, 5, creepLeaves);
		addBlock(world, basePos, 1, 9, 1, creepLeaves);
		addBlock(world, basePos, 1, 9, 2, creepLeaves);
		addBlock(world, basePos, 1, 9, 3, creepLeaves);
		addBlock(world, basePos, 1, 9, 4, creepLeaves);
		addBlock(world, basePos, 1, 9, 5, creepLeaves);
		addBlock(world, basePos, 2, 9, 1, creepLeaves);
		addBlock(world, basePos, 2, 9, 2, creepLeaves);
		addBlock(world, basePos, 2, 9, 3, creepLeaves);
		addBlock(world, basePos, 2, 9, 4, creepLeaves);
		addBlock(world, basePos, 2, 9, 5, creepLeaves);
		addBlock(world, basePos, 3, 9, 1, creepLeaves);
		addBlock(world, basePos, 3, 9, 2, creepLeaves);
		addBlock(world, basePos, 3, 9, 3, creepLeaves);
		addBlock(world, basePos, 3, 9, 4, creepLeaves);
		addBlock(world, basePos, 3, 9, 5, creepLeaves);
		addBlock(world, basePos, 4, 9, 1, creepLeaves);
		addBlock(world, basePos, 4, 9, 2, creepLeaves);
		addBlock(world, basePos, 4, 9, 3, creepLeaves);
		addBlock(world, basePos, 4, 9, 4, creepLeaves);
		addBlock(world, basePos, 4, 9, 5, creepLeaves);
		addBlock(world, basePos, 5, 9, 1, creepLeaves);
		addBlock(world, basePos, 5, 9, 2, creepLeaves);
		addBlock(world, basePos, 5, 9, 3, creepLeaves);
		addBlock(world, basePos, 5, 9, 4, creepLeaves);
		addBlock(world, basePos, 5, 9, 5, creepLeaves);
		addBlock(world, basePos, 2, 10, 2, creepLeaves);
		addBlock(world, basePos, 2, 10, 3, creepLeaves);
		addBlock(world, basePos, 2, 10, 4, creepLeaves);
		addBlock(world, basePos, 3, 10, 2, creepLeaves);
		addBlock(world, basePos, 3, 10, 3, creepLeaves);
		addBlock(world, basePos, 3, 10, 4, creepLeaves);
		addBlock(world, basePos, 4, 10, 2, creepLeaves);
		addBlock(world, basePos, 4, 10, 3, creepLeaves);
		addBlock(world, basePos, 4, 10, 4, creepLeaves);

		addBlock(world, basePos, 5, 3, 0, creepVineSouth);
		addBlock(world, basePos, 0, 4, 5, creepVineEast);
		addBlock(world, basePos, 1, 4, 0, creepVineSouth);
		addBlock(world, basePos, 1, 4, 6, creepVineNorth);
		addBlock(world, basePos, 5, 4, 0, creepVineSouth);
		addBlock(world, basePos, 5, 4, 6, creepVineNorth);
		addBlock(world, basePos, 6, 4, 5, creepVineWest);
		addBlock(world, basePos, 0, 5, 5, creepVineEast);
		addBlock(world, basePos, 1, 5, 0, creepVineSouth);
		addBlock(world, basePos, 1, 5, 6, creepVineNorth);
		addBlock(world, basePos, 5, 5, 0, creepVineSouth);
		addBlock(world, basePos, 5, 5, 6, creepVineNorth);
		addBlock(world, basePos, 6, 5, 5, creepVineWest);
		addBlock(world, basePos, 0, 6, 5, creepVineEast);
		addBlock(world, basePos, 1, 6, 0, creepVineSouth);
		addBlock(world, basePos, 1, 6, 6, creepVineNorth);
		addBlock(world, basePos, 3, 6, 0, creepVineSouth);
		addBlock(world, basePos, 3, 6, 6, creepVineNorth);
		addBlock(world, basePos, 5, 6, 0, creepVineSouth);
		addBlock(world, basePos, 5, 6, 6, creepVineNorth);
		addBlock(world, basePos, 6, 6, 5, creepVineWest);
		addBlock(world, basePos, 0, 7, 5, creepVineEast);
		addBlock(world, basePos, 1, 7, 0, creepVineSouth);
		addBlock(world, basePos, 1, 7, 6, creepVineNorth);
		addBlock(world, basePos, 2, 7, 0, creepVineSouth);
		addBlock(world, basePos, 2, 7, 6, creepVineNorth);
		addBlock(world, basePos, 3, 7, 0, creepVineSouth);
		addBlock(world, basePos, 3, 7, 6, creepVineNorth);
		addBlock(world, basePos, 4, 7, 0, creepVineSouth);
		addBlock(world, basePos, 4, 7, 6, creepVineNorth);
		addBlock(world, basePos, 5, 7, 0, creepVineSouth);
		addBlock(world, basePos, 5, 7, 6, creepVineNorth);
		addBlock(world, basePos, 6, 7, 1, creepVineWest);
		addBlock(world, basePos, 6, 7, 5, creepVineWest);
		addBlock(world, basePos, 0, 8, 1, creepVineEast);
		addBlock(world, basePos, 0, 8, 2, creepVineEast);
		addBlock(world, basePos, 0, 8, 3, creepVineEast);
		addBlock(world, basePos, 0, 8, 4, creepVineEast);
		addBlock(world, basePos, 0, 8, 5, creepVineEast);
		addBlock(world, basePos, 1, 8, 0, creepVineSouth);
		addBlock(world, basePos, 1, 8, 6, creepVineNorth);
		addBlock(world, basePos, 2, 8, 0, creepVineSouth);
		addBlock(world, basePos, 2, 8, 6, creepVineNorth);
		addBlock(world, basePos, 3, 8, 0, creepVineSouth);
		addBlock(world, basePos, 3, 8, 6, creepVineNorth);
		addBlock(world, basePos, 4, 8, 0, creepVineSouth);
		addBlock(world, basePos, 4, 8, 6, creepVineNorth);
		addBlock(world, basePos, 5, 8, 0, creepVineSouth);
		addBlock(world, basePos, 5, 8, 6, creepVineNorth);
		addBlock(world, basePos, 6, 8, 1, creepVineWest);
		addBlock(world, basePos, 6, 8, 2, creepVineWest);
		addBlock(world, basePos, 6, 8, 3, creepVineWest);
		addBlock(world, basePos, 6, 8, 4, creepVineWest);
		addBlock(world, basePos, 6, 8, 5, creepVineWest);
		addBlock(world, basePos, 2, 9, 6, creepVineNorth);
	}
}