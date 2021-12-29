package net.tslat.aoa3.structure.creeponia;

import net.minecraft.block.BlockVine;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class CreepTree3 extends AoAStructure { //StructureSize: 7x12x7
	private static final IBlockState creepLeaves = BlockRegister.CREEP_LEAVES.getDefaultState();
	private static final IBlockState creepLog = BlockRegister.CREEP_LOG.getDefaultState();
	private static final IBlockState creepVineNorth = BlockRegister.CREEP_VINES.getDefaultState().withProperty(BlockVine.NORTH, true);
	private static final IBlockState creepVineSouth = BlockRegister.CREEP_VINES.getDefaultState().withProperty(BlockVine.SOUTH, true);
	private static final IBlockState creepVineWest = BlockRegister.CREEP_VINES.getDefaultState().withProperty(BlockVine.WEST, true);
	private static final IBlockState creepVineEast = BlockRegister.CREEP_VINES.getDefaultState().withProperty(BlockVine.EAST, true);

	public CreepTree3() {
		super("CreepTree3");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 3, 0, 3, creepLog);
		addBlock(world, basePos, 3, 1, 3, creepLog);
		addBlock(world, basePos, 3, 2, 3, creepLog);
		addBlock(world, basePos, 2, 3, 2, creepLeaves);
		addBlock(world, basePos, 2, 3, 3, creepLeaves);
		addBlock(world, basePos, 2, 3, 4, creepLeaves);
		addBlock(world, basePos, 3, 3, 2, creepLeaves);
		addBlock(world, basePos, 3, 3, 3, creepLog);
		addBlock(world, basePos, 3, 3, 4, creepLeaves);
		addBlock(world, basePos, 4, 3, 2, creepLeaves);
		addBlock(world, basePos, 4, 3, 3, creepLeaves);
		addBlock(world, basePos, 4, 3, 4, creepLeaves);
		addBlock(world, basePos, 3, 4, 3, creepLog);
		addBlock(world, basePos, 3, 5, 3, creepLog);
		addBlock(world, basePos, 3, 6, 3, creepLog);
		addBlock(world, basePos, 3, 7, 3, creepLog);
		addBlock(world, basePos, 3, 8, 3, creepLog);
		addBlock(world, basePos, 3, 9, 3, creepLog);
		addBlock(world, basePos, 1, 10, 1, creepLeaves);
		addBlock(world, basePos, 1, 10, 2, creepLeaves);
		addBlock(world, basePos, 1, 10, 3, creepLeaves);
		addBlock(world, basePos, 1, 10, 4, creepLeaves);
		addBlock(world, basePos, 1, 10, 5, creepLeaves);
		addBlock(world, basePos, 2, 10, 1, creepLeaves);
		addBlock(world, basePos, 2, 10, 2, creepLeaves);
		addBlock(world, basePos, 2, 10, 3, creepLeaves);
		addBlock(world, basePos, 2, 10, 4, creepLeaves);
		addBlock(world, basePos, 2, 10, 5, creepLeaves);
		addBlock(world, basePos, 3, 10, 1, creepLeaves);
		addBlock(world, basePos, 3, 10, 2, creepLeaves);
		addBlock(world, basePos, 3, 10, 3, creepLeaves);
		addBlock(world, basePos, 3, 10, 4, creepLeaves);
		addBlock(world, basePos, 3, 10, 5, creepLeaves);
		addBlock(world, basePos, 4, 10, 1, creepLeaves);
		addBlock(world, basePos, 4, 10, 2, creepLeaves);
		addBlock(world, basePos, 4, 10, 3, creepLeaves);
		addBlock(world, basePos, 4, 10, 4, creepLeaves);
		addBlock(world, basePos, 4, 10, 5, creepLeaves);
		addBlock(world, basePos, 5, 10, 1, creepLeaves);
		addBlock(world, basePos, 5, 10, 2, creepLeaves);
		addBlock(world, basePos, 5, 10, 3, creepLeaves);
		addBlock(world, basePos, 5, 10, 4, creepLeaves);
		addBlock(world, basePos, 5, 10, 5, creepLeaves);
		addBlock(world, basePos, 2, 11, 2, creepLeaves);
		addBlock(world, basePos, 2, 11, 3, creepLeaves);
		addBlock(world, basePos, 2, 11, 4, creepLeaves);
		addBlock(world, basePos, 3, 11, 2, creepLeaves);
		addBlock(world, basePos, 3, 11, 3, creepLeaves);
		addBlock(world, basePos, 3, 11, 4, creepLeaves);
		addBlock(world, basePos, 4, 11, 2, creepLeaves);
		addBlock(world, basePos, 4, 11, 3, creepLeaves);
		addBlock(world, basePos, 4, 11, 4, creepLeaves);

		addBlock(world, basePos, 1, 1, 4, creepVineEast);
		addBlock(world, basePos, 2, 1, 1, creepVineSouth);
		addBlock(world, basePos, 2, 1, 5, creepVineNorth);
		addBlock(world, basePos, 3, 1, 1, creepVineSouth);
		addBlock(world, basePos, 3, 1, 5, creepVineNorth);
		addBlock(world, basePos, 4, 1, 1, creepVineSouth);
		addBlock(world, basePos, 4, 1, 5, creepVineNorth);
		addBlock(world, basePos, 5, 1, 4, creepVineWest);
		addBlock(world, basePos, 1, 2, 4, creepVineEast);
		addBlock(world, basePos, 2, 2, 1, creepVineSouth);
		addBlock(world, basePos, 2, 2, 5, creepVineNorth);
		addBlock(world, basePos, 3, 2, 1, creepVineSouth);
		addBlock(world, basePos, 3, 2, 5, creepVineNorth);
		addBlock(world, basePos, 4, 2, 1, creepVineSouth);
		addBlock(world, basePos, 4, 2, 5, creepVineNorth);
		addBlock(world, basePos, 5, 2, 4, creepVineWest);
		addBlock(world, basePos, 1, 3, 2, creepVineEast);
		addBlock(world, basePos, 1, 3, 3, creepVineEast);
		addBlock(world, basePos, 1, 3, 4, creepVineEast);
		addBlock(world, basePos, 2, 3, 1, creepVineSouth);
		addBlock(world, basePos, 2, 3, 5, creepVineNorth);
		addBlock(world, basePos, 3, 3, 1, creepVineSouth);
		addBlock(world, basePos, 3, 3, 5, creepVineNorth);
		addBlock(world, basePos, 4, 3, 1, creepVineSouth);
		addBlock(world, basePos, 4, 3, 5, creepVineNorth);
		addBlock(world, basePos, 5, 3, 2, creepVineWest);
		addBlock(world, basePos, 5, 3, 3, creepVineWest);
		addBlock(world, basePos, 5, 3, 4, creepVineWest);
		addBlock(world, basePos, 0, 5, 5, creepVineEast);
		addBlock(world, basePos, 1, 5, 0, creepVineSouth);
		addBlock(world, basePos, 1, 5, 6, creepVineNorth);
		addBlock(world, basePos, 2, 5, 0, creepVineSouth);
		addBlock(world, basePos, 2, 5, 6, creepVineNorth);
		addBlock(world, basePos, 3, 5, 0, creepVineSouth);
		addBlock(world, basePos, 3, 5, 6, creepVineNorth);
		addBlock(world, basePos, 4, 5, 0, creepVineSouth);
		addBlock(world, basePos, 4, 5, 6, creepVineNorth);
		addBlock(world, basePos, 5, 5, 0, creepVineSouth);
		addBlock(world, basePos, 5, 5, 6, creepVineNorth);
		addBlock(world, basePos, 6, 5, 5, creepVineWest);
		addBlock(world, basePos, 0, 6, 5, creepVineEast);
		addBlock(world, basePos, 1, 6, 0, creepVineSouth);
		addBlock(world, basePos, 1, 6, 6, creepVineNorth);
		addBlock(world, basePos, 2, 6, 0, creepVineSouth);
		addBlock(world, basePos, 2, 6, 6, creepVineNorth);
		addBlock(world, basePos, 3, 6, 0, creepVineSouth);
		addBlock(world, basePos, 3, 6, 6, creepVineNorth);
		addBlock(world, basePos, 4, 6, 0, creepVineSouth);
		addBlock(world, basePos, 4, 6, 6, creepVineNorth);
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
		addBlock(world, basePos, 6, 7, 5, creepVineWest);
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
		addBlock(world, basePos, 6, 8, 5, creepVineWest);
		addBlock(world, basePos, 0, 9, 5, creepVineEast);
		addBlock(world, basePos, 1, 9, 0, creepVineSouth);
		addBlock(world, basePos, 1, 9, 6, creepVineNorth);
		addBlock(world, basePos, 2, 9, 0, creepVineSouth);
		addBlock(world, basePos, 2, 9, 6, creepVineNorth);
		addBlock(world, basePos, 3, 9, 0, creepVineSouth);
		addBlock(world, basePos, 3, 9, 6, creepVineNorth);
		addBlock(world, basePos, 4, 9, 0, creepVineSouth);
		addBlock(world, basePos, 4, 9, 6, creepVineNorth);
		addBlock(world, basePos, 5, 9, 0, creepVineSouth);
		addBlock(world, basePos, 5, 9, 6, creepVineNorth);
		addBlock(world, basePos, 6, 9, 5, creepVineWest);
		addBlock(world, basePos, 0, 10, 1, creepVineEast);
		addBlock(world, basePos, 0, 10, 2, creepVineEast);
		addBlock(world, basePos, 0, 10, 3, creepVineEast);
		addBlock(world, basePos, 0, 10, 4, creepVineEast);
		addBlock(world, basePos, 0, 10, 5, creepVineEast);
		addBlock(world, basePos, 1, 10, 0, creepVineSouth);
		addBlock(world, basePos, 1, 10, 6, creepVineNorth);
		addBlock(world, basePos, 2, 10, 0, creepVineSouth);
		addBlock(world, basePos, 2, 10, 6, creepVineNorth);
		addBlock(world, basePos, 3, 10, 0, creepVineSouth);
		addBlock(world, basePos, 3, 10, 6, creepVineNorth);
		addBlock(world, basePos, 4, 10, 0, creepVineSouth);
		addBlock(world, basePos, 4, 10, 6, creepVineNorth);
		addBlock(world, basePos, 5, 10, 0, creepVineSouth);
		addBlock(world, basePos, 5, 10, 6, creepVineNorth);
		addBlock(world, basePos, 6, 10, 1, creepVineWest);
		addBlock(world, basePos, 6, 10, 2, creepVineWest);
		addBlock(world, basePos, 6, 10, 3, creepVineWest);
		addBlock(world, basePos, 6, 10, 4, creepVineWest);
		addBlock(world, basePos, 6, 10, 5, creepVineWest);
	}
}