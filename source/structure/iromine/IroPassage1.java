package net.tslat.aoa3.structure.iromine;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.common.registration.LootSystemRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class IroPassage1 extends AoAStructure { //StructureSize: 14x6x20
	private static final IBlockState stripedBrick = BlockRegister.IRO_STRIPED_BRICKS.getDefaultState();
	private static final IBlockState dottedBrick = BlockRegister.IRO_DOTTED_BRICKS.getDefaultState();
	private static final IBlockState confusionTrap = BlockRegister.IRO_BRICK_TRAP.getDefaultState();
	private static final IBlockState enforcerSpanwer = BlockRegister.ENFORCER_SPAWNER.getDefaultState();
	private static final IBlockState mechyonSpawner = BlockRegister.MECHYON_SPAWNER.getDefaultState();
	private static final IBlockState chest = Blocks.CHEST.getDefaultState();

	public IroPassage1() {
		super("IroPassage1");
	}

	@Override
	protected boolean replacesBlocks() {
		return true;
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 1, 0, 7, dottedBrick);
		addBlock(world, basePos, 1, 0, 8, dottedBrick);
		addBlock(world, basePos, 1, 0, 9, dottedBrick);
		addBlock(world, basePos, 1, 0, 10, dottedBrick);
		addBlock(world, basePos, 1, 0, 11, dottedBrick);
		addBlock(world, basePos, 1, 0, 12, dottedBrick);
		addBlock(world, basePos, 1, 0, 13, dottedBrick);
		addBlock(world, basePos, 1, 0, 14, dottedBrick);
		addBlock(world, basePos, 1, 0, 15, dottedBrick);
		addBlock(world, basePos, 1, 0, 16, dottedBrick);
		addBlock(world, basePos, 1, 0, 17, dottedBrick);
		addBlock(world, basePos, 1, 0, 18, dottedBrick);
		addBlock(world, basePos, 2, 0, 7, dottedBrick);
		addBlock(world, basePos, 2, 0, 8, stripedBrick);
		addBlock(world, basePos, 2, 0, 9, stripedBrick);
		addBlock(world, basePos, 2, 0, 10, stripedBrick);
		addBlock(world, basePos, 2, 0, 11, stripedBrick);
		addBlock(world, basePos, 2, 0, 12, stripedBrick);
		addBlock(world, basePos, 2, 0, 13, stripedBrick);
		addBlock(world, basePos, 2, 0, 14, stripedBrick);
		addBlock(world, basePos, 2, 0, 15, stripedBrick);
		addBlock(world, basePos, 2, 0, 16, stripedBrick);
		addBlock(world, basePos, 2, 0, 17, stripedBrick);
		addBlock(world, basePos, 2, 0, 18, dottedBrick);
		addBlock(world, basePos, 3, 0, 7, dottedBrick);
		addBlock(world, basePos, 3, 0, 8, stripedBrick);
		addBlock(world, basePos, 3, 0, 9, stripedBrick);
		addBlock(world, basePos, 3, 0, 10, stripedBrick);
		addBlock(world, basePos, 3, 0, 11, stripedBrick);
		addBlock(world, basePos, 3, 0, 12, stripedBrick);
		addBlock(world, basePos, 3, 0, 13, stripedBrick);
		addBlock(world, basePos, 3, 0, 14, stripedBrick);
		addBlock(world, basePos, 3, 0, 15, stripedBrick);
		addBlock(world, basePos, 3, 0, 16, stripedBrick);
		addBlock(world, basePos, 3, 0, 17, stripedBrick);
		addBlock(world, basePos, 3, 0, 18, dottedBrick);
		addBlock(world, basePos, 4, 0, 0, dottedBrick);
		addBlock(world, basePos, 4, 0, 1, dottedBrick);
		addBlock(world, basePos, 4, 0, 2, dottedBrick);
		addBlock(world, basePos, 4, 0, 3, dottedBrick);
		addBlock(world, basePos, 4, 0, 4, dottedBrick);
		addBlock(world, basePos, 4, 0, 5, dottedBrick);
		addBlock(world, basePos, 4, 0, 6, dottedBrick);
		addBlock(world, basePos, 4, 0, 7, dottedBrick);
		addBlock(world, basePos, 4, 0, 8, stripedBrick);
		addBlock(world, basePos, 4, 0, 9, stripedBrick);
		addBlock(world, basePos, 4, 0, 10, stripedBrick);
		addBlock(world, basePos, 4, 0, 11, stripedBrick);
		addBlock(world, basePos, 4, 0, 12, stripedBrick);
		addBlock(world, basePos, 4, 0, 13, stripedBrick);
		addBlock(world, basePos, 4, 0, 14, stripedBrick);
		addBlock(world, basePos, 4, 0, 15, stripedBrick);
		addBlock(world, basePos, 4, 0, 16, stripedBrick);
		addBlock(world, basePos, 4, 0, 17, stripedBrick);
		addBlock(world, basePos, 4, 0, 18, dottedBrick);
		addBlock(world, basePos, 5, 0, 1, stripedBrick);
		addBlock(world, basePos, 5, 0, 2, confusionTrap);
		addBlock(world, basePos, 5, 0, 3, stripedBrick);
		addBlock(world, basePos, 5, 0, 4, confusionTrap);
		addBlock(world, basePos, 5, 0, 5, stripedBrick);
		addBlock(world, basePos, 5, 0, 6, confusionTrap);
		addBlock(world, basePos, 5, 0, 7, stripedBrick);
		addBlock(world, basePos, 5, 0, 8, stripedBrick);
		addBlock(world, basePos, 5, 0, 9, stripedBrick);
		addBlock(world, basePos, 5, 0, 10, stripedBrick);
		addBlock(world, basePos, 5, 0, 11, stripedBrick);
		addBlock(world, basePos, 5, 0, 12, stripedBrick);
		addBlock(world, basePos, 5, 0, 13, stripedBrick);
		addBlock(world, basePos, 5, 0, 14, stripedBrick);
		addBlock(world, basePos, 5, 0, 15, stripedBrick);
		addBlock(world, basePos, 5, 0, 16, stripedBrick);
		addBlock(world, basePos, 5, 0, 17, stripedBrick);
		addBlock(world, basePos, 5, 0, 18, dottedBrick);
		addBlock(world, basePos, 6, 0, 1, stripedBrick);
		addBlock(world, basePos, 6, 0, 2, stripedBrick);
		addBlock(world, basePos, 6, 0, 3, confusionTrap);
		addBlock(world, basePos, 6, 0, 4, stripedBrick);
		addBlock(world, basePos, 6, 0, 5, confusionTrap);
		addBlock(world, basePos, 6, 0, 6, stripedBrick);
		addBlock(world, basePos, 6, 0, 7, confusionTrap);
		addBlock(world, basePos, 6, 0, 8, stripedBrick);
		addBlock(world, basePos, 6, 0, 9, stripedBrick);
		addBlock(world, basePos, 6, 0, 10, stripedBrick);
		addBlock(world, basePos, 6, 0, 11, stripedBrick);
		addBlock(world, basePos, 6, 0, 12, stripedBrick);
		addBlock(world, basePos, 6, 0, 13, stripedBrick);
		addBlock(world, basePos, 6, 0, 14, stripedBrick);
		addBlock(world, basePos, 6, 0, 15, stripedBrick);
		addBlock(world, basePos, 6, 0, 16, stripedBrick);
		addBlock(world, basePos, 6, 0, 17, stripedBrick);
		addBlock(world, basePos, 6, 0, 18, dottedBrick);
		addBlock(world, basePos, 7, 0, 1, stripedBrick);
		addBlock(world, basePos, 7, 0, 2, confusionTrap);
		addBlock(world, basePos, 7, 0, 3, stripedBrick);
		addBlock(world, basePos, 7, 0, 4, confusionTrap);
		addBlock(world, basePos, 7, 0, 5, stripedBrick);
		addBlock(world, basePos, 7, 0, 6, confusionTrap);
		addBlock(world, basePos, 7, 0, 7, stripedBrick);
		addBlock(world, basePos, 7, 0, 8, stripedBrick);
		addBlock(world, basePos, 7, 0, 9, stripedBrick);
		addBlock(world, basePos, 7, 0, 10, stripedBrick);
		addBlock(world, basePos, 7, 0, 11, stripedBrick);
		addBlock(world, basePos, 7, 0, 12, stripedBrick);
		addBlock(world, basePos, 7, 0, 13, stripedBrick);
		addBlock(world, basePos, 7, 0, 14, stripedBrick);
		addBlock(world, basePos, 7, 0, 15, stripedBrick);
		addBlock(world, basePos, 7, 0, 16, stripedBrick);
		addBlock(world, basePos, 7, 0, 17, stripedBrick);
		addBlock(world, basePos, 7, 0, 18, dottedBrick);
		addBlock(world, basePos, 8, 0, 1, stripedBrick);
		addBlock(world, basePos, 8, 0, 2, stripedBrick);
		addBlock(world, basePos, 8, 0, 3, confusionTrap);
		addBlock(world, basePos, 8, 0, 4, stripedBrick);
		addBlock(world, basePos, 8, 0, 5, confusionTrap);
		addBlock(world, basePos, 8, 0, 6, stripedBrick);
		addBlock(world, basePos, 8, 0, 7, confusionTrap);
		addBlock(world, basePos, 8, 0, 8, stripedBrick);
		addBlock(world, basePos, 8, 0, 9, stripedBrick);
		addBlock(world, basePos, 8, 0, 10, stripedBrick);
		addBlock(world, basePos, 8, 0, 11, stripedBrick);
		addBlock(world, basePos, 8, 0, 12, stripedBrick);
		addBlock(world, basePos, 8, 0, 13, stripedBrick);
		addBlock(world, basePos, 8, 0, 14, stripedBrick);
		addBlock(world, basePos, 8, 0, 15, stripedBrick);
		addBlock(world, basePos, 8, 0, 16, stripedBrick);
		addBlock(world, basePos, 8, 0, 17, stripedBrick);
		addBlock(world, basePos, 8, 0, 18, dottedBrick);
		addBlock(world, basePos, 9, 0, 0, dottedBrick);
		addBlock(world, basePos, 9, 0, 1, dottedBrick);
		addBlock(world, basePos, 9, 0, 2, dottedBrick);
		addBlock(world, basePos, 9, 0, 3, dottedBrick);
		addBlock(world, basePos, 9, 0, 4, dottedBrick);
		addBlock(world, basePos, 9, 0, 5, dottedBrick);
		addBlock(world, basePos, 9, 0, 6, dottedBrick);
		addBlock(world, basePos, 9, 0, 7, dottedBrick);
		addBlock(world, basePos, 9, 0, 8, stripedBrick);
		addBlock(world, basePos, 9, 0, 9, stripedBrick);
		addBlock(world, basePos, 9, 0, 10, stripedBrick);
		addBlock(world, basePos, 9, 0, 11, stripedBrick);
		addBlock(world, basePos, 9, 0, 12, stripedBrick);
		addBlock(world, basePos, 9, 0, 13, stripedBrick);
		addBlock(world, basePos, 9, 0, 14, stripedBrick);
		addBlock(world, basePos, 9, 0, 15, stripedBrick);
		addBlock(world, basePos, 9, 0, 16, stripedBrick);
		addBlock(world, basePos, 9, 0, 17, stripedBrick);
		addBlock(world, basePos, 9, 0, 18, dottedBrick);
		addBlock(world, basePos, 10, 0, 7, dottedBrick);
		addBlock(world, basePos, 10, 0, 8, stripedBrick);
		addBlock(world, basePos, 10, 0, 9, stripedBrick);
		addBlock(world, basePos, 10, 0, 10, stripedBrick);
		addBlock(world, basePos, 10, 0, 11, stripedBrick);
		addBlock(world, basePos, 10, 0, 12, stripedBrick);
		addBlock(world, basePos, 10, 0, 13, stripedBrick);
		addBlock(world, basePos, 10, 0, 14, stripedBrick);
		addBlock(world, basePos, 10, 0, 15, stripedBrick);
		addBlock(world, basePos, 10, 0, 16, stripedBrick);
		addBlock(world, basePos, 10, 0, 17, stripedBrick);
		addBlock(world, basePos, 10, 0, 18, dottedBrick);
		addBlock(world, basePos, 11, 0, 7, dottedBrick);
		addBlock(world, basePos, 11, 0, 8, stripedBrick);
		addBlock(world, basePos, 11, 0, 9, stripedBrick);
		addBlock(world, basePos, 11, 0, 10, stripedBrick);
		addBlock(world, basePos, 11, 0, 11, stripedBrick);
		addBlock(world, basePos, 11, 0, 12, stripedBrick);
		addBlock(world, basePos, 11, 0, 13, stripedBrick);
		addBlock(world, basePos, 11, 0, 14, stripedBrick);
		addBlock(world, basePos, 11, 0, 15, stripedBrick);
		addBlock(world, basePos, 11, 0, 16, stripedBrick);
		addBlock(world, basePos, 11, 0, 17, stripedBrick);
		addBlock(world, basePos, 11, 0, 18, dottedBrick);
		addBlock(world, basePos, 12, 0, 7, dottedBrick);
		addBlock(world, basePos, 12, 0, 8, dottedBrick);
		addBlock(world, basePos, 12, 0, 9, dottedBrick);
		addBlock(world, basePos, 12, 0, 10, dottedBrick);
		addBlock(world, basePos, 12, 0, 11, dottedBrick);
		addBlock(world, basePos, 12, 0, 12, dottedBrick);
		addBlock(world, basePos, 12, 0, 13, dottedBrick);
		addBlock(world, basePos, 12, 0, 14, dottedBrick);
		addBlock(world, basePos, 12, 0, 15, dottedBrick);
		addBlock(world, basePos, 12, 0, 16, dottedBrick);
		addBlock(world, basePos, 12, 0, 17, dottedBrick);
		addBlock(world, basePos, 12, 0, 18, dottedBrick);
		addBlock(world, basePos, 1, 1, 7, stripedBrick);
		addBlock(world, basePos, 1, 1, 8, stripedBrick);
		addBlock(world, basePos, 1, 1, 9, stripedBrick);
		addBlock(world, basePos, 1, 1, 10, stripedBrick);
		addBlock(world, basePos, 1, 1, 11, stripedBrick);
		addBlock(world, basePos, 1, 1, 12, stripedBrick);
		addBlock(world, basePos, 1, 1, 13, stripedBrick);
		addBlock(world, basePos, 1, 1, 14, stripedBrick);
		addBlock(world, basePos, 1, 1, 15, stripedBrick);
		addBlock(world, basePos, 1, 1, 16, stripedBrick);
		addBlock(world, basePos, 1, 1, 17, stripedBrick);
		addBlock(world, basePos, 1, 1, 18, stripedBrick);
		addBlock(world, basePos, 2, 1, 7, stripedBrick);
		addBlock(world, basePos, 2, 1, 18, stripedBrick);
		addBlock(world, basePos, 3, 1, 7, stripedBrick);
		addBlock(world, basePos, 3, 1, 9, stripedBrick);
		addBlock(world, basePos, 3, 1, 18, stripedBrick);
		addBlock(world, basePos, 4, 1, 0, stripedBrick);
		addBlock(world, basePos, 4, 1, 1, stripedBrick);
		addBlock(world, basePos, 4, 1, 2, stripedBrick);
		addBlock(world, basePos, 4, 1, 3, stripedBrick);
		addBlock(world, basePos, 4, 1, 4, stripedBrick);
		addBlock(world, basePos, 4, 1, 5, stripedBrick);
		addBlock(world, basePos, 4, 1, 6, stripedBrick);
		addBlock(world, basePos, 4, 1, 7, stripedBrick);
		addBlock(world, basePos, 4, 1, 18, stripedBrick);
		addBlock(world, basePos, 5, 1, 17, stripedBrick);
		addBlock(world, basePos, 5, 1, 18, stripedBrick);
		addBlock(world, basePos, 6, 1, 16, stripedBrick);
		addBlock(world, basePos, 6, 1, 17, stripedBrick);
		addBlock(world, basePos, 6, 1, 18, stripedBrick);
		addBlock(world, basePos, 7, 1, 16, stripedBrick);
		addBlock(world, basePos, 7, 1, 17, stripedBrick);
		addBlock(world, basePos, 7, 1, 18, stripedBrick);
		addBlock(world, basePos, 8, 1, 17, stripedBrick);
		addBlock(world, basePos, 8, 1, 18, stripedBrick);
		addBlock(world, basePos, 9, 1, 0, stripedBrick);
		addBlock(world, basePos, 9, 1, 1, stripedBrick);
		addBlock(world, basePos, 9, 1, 2, stripedBrick);
		addBlock(world, basePos, 9, 1, 3, stripedBrick);
		addBlock(world, basePos, 9, 1, 4, stripedBrick);
		addBlock(world, basePos, 9, 1, 5, stripedBrick);
		addBlock(world, basePos, 9, 1, 6, stripedBrick);
		addBlock(world, basePos, 9, 1, 7, stripedBrick);
		addBlock(world, basePos, 9, 1, 18, stripedBrick);
		addBlock(world, basePos, 10, 1, 7, stripedBrick);
		addBlock(world, basePos, 10, 1, 16, stripedBrick);
		addBlock(world, basePos, 10, 1, 18, stripedBrick);
		addBlock(world, basePos, 11, 1, 7, stripedBrick);
		addBlock(world, basePos, 11, 1, 18, stripedBrick);
		addBlock(world, basePos, 12, 1, 7, stripedBrick);
		addBlock(world, basePos, 12, 1, 8, stripedBrick);
		addBlock(world, basePos, 12, 1, 9, stripedBrick);
		addBlock(world, basePos, 12, 1, 10, stripedBrick);
		addBlock(world, basePos, 12, 1, 11, stripedBrick);
		addBlock(world, basePos, 12, 1, 12, stripedBrick);
		addBlock(world, basePos, 12, 1, 13, stripedBrick);
		addBlock(world, basePos, 12, 1, 14, stripedBrick);
		addBlock(world, basePos, 12, 1, 15, stripedBrick);
		addBlock(world, basePos, 12, 1, 16, stripedBrick);
		addBlock(world, basePos, 12, 1, 17, stripedBrick);
		addBlock(world, basePos, 12, 1, 18, stripedBrick);
		addBlock(world, basePos, 0, 2, 6, stripedBrick);
		addBlock(world, basePos, 0, 2, 7, stripedBrick);
		addBlock(world, basePos, 0, 2, 8, stripedBrick);
		addBlock(world, basePos, 0, 2, 9, stripedBrick);
		addBlock(world, basePos, 0, 2, 10, stripedBrick);
		addBlock(world, basePos, 0, 2, 11, stripedBrick);
		addBlock(world, basePos, 0, 2, 12, stripedBrick);
		addBlock(world, basePos, 0, 2, 13, stripedBrick);
		addBlock(world, basePos, 0, 2, 14, stripedBrick);
		addBlock(world, basePos, 0, 2, 15, stripedBrick);
		addBlock(world, basePos, 0, 2, 16, stripedBrick);
		addBlock(world, basePos, 0, 2, 17, stripedBrick);
		addBlock(world, basePos, 0, 2, 18, stripedBrick);
		addBlock(world, basePos, 0, 2, 19, stripedBrick);
		addBlock(world, basePos, 1, 2, 6, stripedBrick);
		addBlock(world, basePos, 1, 2, 7, stripedBrick);
		addBlock(world, basePos, 1, 2, 8, stripedBrick);
		addBlock(world, basePos, 1, 2, 9, stripedBrick);
		addBlock(world, basePos, 1, 2, 10, stripedBrick);
		addBlock(world, basePos, 1, 2, 11, stripedBrick);
		addBlock(world, basePos, 1, 2, 12, stripedBrick);
		addBlock(world, basePos, 1, 2, 13, stripedBrick);
		addBlock(world, basePos, 1, 2, 14, stripedBrick);
		addBlock(world, basePos, 1, 2, 15, stripedBrick);
		addBlock(world, basePos, 1, 2, 16, stripedBrick);
		addBlock(world, basePos, 1, 2, 17, stripedBrick);
		addBlock(world, basePos, 1, 2, 18, stripedBrick);
		addBlock(world, basePos, 1, 2, 19, stripedBrick);
		addBlock(world, basePos, 2, 2, 6, stripedBrick);
		addBlock(world, basePos, 2, 2, 7, stripedBrick);
		addBlock(world, basePos, 2, 2, 18, stripedBrick);
		addBlock(world, basePos, 2, 2, 19, stripedBrick);
		addBlock(world, basePos, 3, 2, 0, stripedBrick);
		addBlock(world, basePos, 3, 2, 1, stripedBrick);
		addBlock(world, basePos, 3, 2, 2, stripedBrick);
		addBlock(world, basePos, 3, 2, 3, stripedBrick);
		addBlock(world, basePos, 3, 2, 4, stripedBrick);
		addBlock(world, basePos, 3, 2, 5, stripedBrick);
		addBlock(world, basePos, 3, 2, 6, stripedBrick);
		addBlock(world, basePos, 3, 2, 7, stripedBrick);
		addBlock(world, basePos, 3, 2, 9, enforcerSpanwer);
		addBlock(world, basePos, 3, 2, 18, stripedBrick);
		addBlock(world, basePos, 3, 2, 19, stripedBrick);
		addBlock(world, basePos, 4, 2, 0, stripedBrick);
		addBlock(world, basePos, 4, 2, 1, stripedBrick);
		addBlock(world, basePos, 4, 2, 2, stripedBrick);
		addBlock(world, basePos, 4, 2, 3, stripedBrick);
		addBlock(world, basePos, 4, 2, 4, stripedBrick);
		addBlock(world, basePos, 4, 2, 5, stripedBrick);
		addBlock(world, basePos, 4, 2, 6, stripedBrick);
		addBlock(world, basePos, 4, 2, 7, stripedBrick);
		addBlock(world, basePos, 4, 2, 18, stripedBrick);
		addBlock(world, basePos, 4, 2, 19, stripedBrick);
		addBlock(world, basePos, 5, 2, 18, stripedBrick);
		addBlock(world, basePos, 5, 2, 19, stripedBrick);
		addBlock(world, basePos, 6, 2, 17, chest);
		addBlock(world, basePos, 6, 2, 18, stripedBrick);
		addBlock(world, basePos, 6, 2, 19, stripedBrick);
		addBlock(world, basePos, 7, 2, 17, chest);
		addBlock(world, basePos, 7, 2, 18, stripedBrick);
		addBlock(world, basePos, 7, 2, 19, stripedBrick);
		addBlock(world, basePos, 8, 2, 18, stripedBrick);
		addBlock(world, basePos, 8, 2, 19, stripedBrick);
		addBlock(world, basePos, 9, 2, 0, stripedBrick);
		addBlock(world, basePos, 9, 2, 1, stripedBrick);
		addBlock(world, basePos, 9, 2, 2, stripedBrick);
		addBlock(world, basePos, 9, 2, 3, stripedBrick);
		addBlock(world, basePos, 9, 2, 4, stripedBrick);
		addBlock(world, basePos, 9, 2, 5, stripedBrick);
		addBlock(world, basePos, 9, 2, 6, stripedBrick);
		addBlock(world, basePos, 9, 2, 7, stripedBrick);
		addBlock(world, basePos, 9, 2, 18, stripedBrick);
		addBlock(world, basePos, 9, 2, 19, stripedBrick);
		addBlock(world, basePos, 10, 2, 0, stripedBrick);
		addBlock(world, basePos, 10, 2, 1, stripedBrick);
		addBlock(world, basePos, 10, 2, 2, stripedBrick);
		addBlock(world, basePos, 10, 2, 3, stripedBrick);
		addBlock(world, basePos, 10, 2, 4, stripedBrick);
		addBlock(world, basePos, 10, 2, 5, stripedBrick);
		addBlock(world, basePos, 10, 2, 6, stripedBrick);
		addBlock(world, basePos, 10, 2, 7, stripedBrick);
		addBlock(world, basePos, 10, 2, 16, mechyonSpawner);
		addBlock(world, basePos, 10, 2, 18, stripedBrick);
		addBlock(world, basePos, 10, 2, 19, stripedBrick);
		addBlock(world, basePos, 11, 2, 6, stripedBrick);
		addBlock(world, basePos, 11, 2, 7, stripedBrick);
		addBlock(world, basePos, 11, 2, 18, stripedBrick);
		addBlock(world, basePos, 11, 2, 19, stripedBrick);
		addBlock(world, basePos, 12, 2, 6, stripedBrick);
		addBlock(world, basePos, 12, 2, 7, stripedBrick);
		addBlock(world, basePos, 12, 2, 8, stripedBrick);
		addBlock(world, basePos, 12, 2, 9, stripedBrick);
		addBlock(world, basePos, 12, 2, 10, stripedBrick);
		addBlock(world, basePos, 12, 2, 11, stripedBrick);
		addBlock(world, basePos, 12, 2, 12, stripedBrick);
		addBlock(world, basePos, 12, 2, 13, stripedBrick);
		addBlock(world, basePos, 12, 2, 14, stripedBrick);
		addBlock(world, basePos, 12, 2, 15, stripedBrick);
		addBlock(world, basePos, 12, 2, 16, stripedBrick);
		addBlock(world, basePos, 12, 2, 17, stripedBrick);
		addBlock(world, basePos, 12, 2, 18, stripedBrick);
		addBlock(world, basePos, 12, 2, 19, stripedBrick);
		addBlock(world, basePos, 13, 2, 6, stripedBrick);
		addBlock(world, basePos, 13, 2, 7, stripedBrick);
		addBlock(world, basePos, 13, 2, 8, stripedBrick);
		addBlock(world, basePos, 13, 2, 9, stripedBrick);
		addBlock(world, basePos, 13, 2, 10, stripedBrick);
		addBlock(world, basePos, 13, 2, 11, stripedBrick);
		addBlock(world, basePos, 13, 2, 12, stripedBrick);
		addBlock(world, basePos, 13, 2, 13, stripedBrick);
		addBlock(world, basePos, 13, 2, 14, stripedBrick);
		addBlock(world, basePos, 13, 2, 15, stripedBrick);
		addBlock(world, basePos, 13, 2, 16, stripedBrick);
		addBlock(world, basePos, 13, 2, 17, stripedBrick);
		addBlock(world, basePos, 13, 2, 18, stripedBrick);
		addBlock(world, basePos, 13, 2, 19, stripedBrick);
		addBlock(world, basePos, 1, 3, 7, stripedBrick);
		addBlock(world, basePos, 1, 3, 8, stripedBrick);
		addBlock(world, basePos, 1, 3, 9, stripedBrick);
		addBlock(world, basePos, 1, 3, 10, stripedBrick);
		addBlock(world, basePos, 1, 3, 11, stripedBrick);
		addBlock(world, basePos, 1, 3, 12, stripedBrick);
		addBlock(world, basePos, 1, 3, 13, stripedBrick);
		addBlock(world, basePos, 1, 3, 14, stripedBrick);
		addBlock(world, basePos, 1, 3, 15, stripedBrick);
		addBlock(world, basePos, 1, 3, 16, stripedBrick);
		addBlock(world, basePos, 1, 3, 17, stripedBrick);
		addBlock(world, basePos, 1, 3, 18, stripedBrick);
		addBlock(world, basePos, 2, 3, 7, stripedBrick);
		addBlock(world, basePos, 2, 3, 18, stripedBrick);
		addBlock(world, basePos, 3, 3, 7, stripedBrick);
		addBlock(world, basePos, 3, 3, 18, stripedBrick);
		addBlock(world, basePos, 4, 3, 1, stripedBrick);
		addBlock(world, basePos, 4, 3, 2, stripedBrick);
		addBlock(world, basePos, 4, 3, 3, stripedBrick);
		addBlock(world, basePos, 4, 3, 4, stripedBrick);
		addBlock(world, basePos, 4, 3, 5, stripedBrick);
		addBlock(world, basePos, 4, 3, 6, stripedBrick);
		addBlock(world, basePos, 4, 3, 7, stripedBrick);
		addBlock(world, basePos, 4, 3, 18, stripedBrick);
		addBlock(world, basePos, 5, 3, 18, stripedBrick);
		addBlock(world, basePos, 6, 3, 18, stripedBrick);
		addBlock(world, basePos, 7, 3, 18, stripedBrick);
		addBlock(world, basePos, 8, 3, 18, stripedBrick);
		addBlock(world, basePos, 9, 3, 1, stripedBrick);
		addBlock(world, basePos, 9, 3, 2, stripedBrick);
		addBlock(world, basePos, 9, 3, 3, stripedBrick);
		addBlock(world, basePos, 9, 3, 4, stripedBrick);
		addBlock(world, basePos, 9, 3, 5, stripedBrick);
		addBlock(world, basePos, 9, 3, 6, stripedBrick);
		addBlock(world, basePos, 9, 3, 7, stripedBrick);
		addBlock(world, basePos, 9, 3, 18, stripedBrick);
		addBlock(world, basePos, 10, 3, 7, stripedBrick);
		addBlock(world, basePos, 10, 3, 18, stripedBrick);
		addBlock(world, basePos, 11, 3, 7, stripedBrick);
		addBlock(world, basePos, 11, 3, 18, stripedBrick);
		addBlock(world, basePos, 12, 3, 7, stripedBrick);
		addBlock(world, basePos, 12, 3, 8, stripedBrick);
		addBlock(world, basePos, 12, 3, 9, stripedBrick);
		addBlock(world, basePos, 12, 3, 10, stripedBrick);
		addBlock(world, basePos, 12, 3, 11, stripedBrick);
		addBlock(world, basePos, 12, 3, 12, stripedBrick);
		addBlock(world, basePos, 12, 3, 13, stripedBrick);
		addBlock(world, basePos, 12, 3, 14, stripedBrick);
		addBlock(world, basePos, 12, 3, 15, stripedBrick);
		addBlock(world, basePos, 12, 3, 16, stripedBrick);
		addBlock(world, basePos, 12, 3, 17, stripedBrick);
		addBlock(world, basePos, 12, 3, 18, stripedBrick);
		addBlock(world, basePos, 1, 4, 7, dottedBrick);
		addBlock(world, basePos, 1, 4, 8, dottedBrick);
		addBlock(world, basePos, 1, 4, 9, dottedBrick);
		addBlock(world, basePos, 1, 4, 10, dottedBrick);
		addBlock(world, basePos, 1, 4, 11, dottedBrick);
		addBlock(world, basePos, 1, 4, 12, dottedBrick);
		addBlock(world, basePos, 1, 4, 13, dottedBrick);
		addBlock(world, basePos, 1, 4, 14, dottedBrick);
		addBlock(world, basePos, 1, 4, 15, dottedBrick);
		addBlock(world, basePos, 1, 4, 16, dottedBrick);
		addBlock(world, basePos, 1, 4, 17, dottedBrick);
		addBlock(world, basePos, 1, 4, 18, dottedBrick);
		addBlock(world, basePos, 2, 4, 7, dottedBrick);
		addBlock(world, basePos, 2, 4, 18, dottedBrick);
		addBlock(world, basePos, 3, 4, 7, dottedBrick);
		addBlock(world, basePos, 3, 4, 18, dottedBrick);
		addBlock(world, basePos, 4, 4, 1, dottedBrick);
		addBlock(world, basePos, 4, 4, 2, dottedBrick);
		addBlock(world, basePos, 4, 4, 3, dottedBrick);
		addBlock(world, basePos, 4, 4, 4, dottedBrick);
		addBlock(world, basePos, 4, 4, 5, dottedBrick);
		addBlock(world, basePos, 4, 4, 6, dottedBrick);
		addBlock(world, basePos, 4, 4, 7, dottedBrick);
		addBlock(world, basePos, 4, 4, 18, dottedBrick);
		addBlock(world, basePos, 5, 4, 1, stripedBrick);
		addBlock(world, basePos, 5, 4, 2, stripedBrick);
		addBlock(world, basePos, 5, 4, 3, stripedBrick);
		addBlock(world, basePos, 5, 4, 4, stripedBrick);
		addBlock(world, basePos, 5, 4, 5, stripedBrick);
		addBlock(world, basePos, 5, 4, 6, stripedBrick);
		addBlock(world, basePos, 5, 4, 7, stripedBrick);
		addBlock(world, basePos, 5, 4, 18, dottedBrick);
		addBlock(world, basePos, 6, 4, 1, stripedBrick);
		addBlock(world, basePos, 6, 4, 2, stripedBrick);
		addBlock(world, basePos, 6, 4, 3, stripedBrick);
		addBlock(world, basePos, 6, 4, 4, stripedBrick);
		addBlock(world, basePos, 6, 4, 5, stripedBrick);
		addBlock(world, basePos, 6, 4, 6, stripedBrick);
		addBlock(world, basePos, 6, 4, 7, stripedBrick);
		addBlock(world, basePos, 6, 4, 18, dottedBrick);
		addBlock(world, basePos, 7, 4, 1, stripedBrick);
		addBlock(world, basePos, 7, 4, 2, stripedBrick);
		addBlock(world, basePos, 7, 4, 3, stripedBrick);
		addBlock(world, basePos, 7, 4, 4, stripedBrick);
		addBlock(world, basePos, 7, 4, 5, stripedBrick);
		addBlock(world, basePos, 7, 4, 6, stripedBrick);
		addBlock(world, basePos, 7, 4, 7, stripedBrick);
		addBlock(world, basePos, 7, 4, 18, dottedBrick);
		addBlock(world, basePos, 8, 4, 1, stripedBrick);
		addBlock(world, basePos, 8, 4, 2, stripedBrick);
		addBlock(world, basePos, 8, 4, 3, stripedBrick);
		addBlock(world, basePos, 8, 4, 4, stripedBrick);
		addBlock(world, basePos, 8, 4, 5, stripedBrick);
		addBlock(world, basePos, 8, 4, 6, stripedBrick);
		addBlock(world, basePos, 8, 4, 7, stripedBrick);
		addBlock(world, basePos, 8, 4, 18, dottedBrick);
		addBlock(world, basePos, 9, 4, 1, dottedBrick);
		addBlock(world, basePos, 9, 4, 2, dottedBrick);
		addBlock(world, basePos, 9, 4, 3, dottedBrick);
		addBlock(world, basePos, 9, 4, 4, dottedBrick);
		addBlock(world, basePos, 9, 4, 5, dottedBrick);
		addBlock(world, basePos, 9, 4, 6, dottedBrick);
		addBlock(world, basePos, 9, 4, 7, dottedBrick);
		addBlock(world, basePos, 9, 4, 18, dottedBrick);
		addBlock(world, basePos, 10, 4, 7, dottedBrick);
		addBlock(world, basePos, 10, 4, 18, dottedBrick);
		addBlock(world, basePos, 11, 4, 7, dottedBrick);
		addBlock(world, basePos, 11, 4, 18, dottedBrick);
		addBlock(world, basePos, 12, 4, 7, dottedBrick);
		addBlock(world, basePos, 12, 4, 8, dottedBrick);
		addBlock(world, basePos, 12, 4, 9, dottedBrick);
		addBlock(world, basePos, 12, 4, 10, dottedBrick);
		addBlock(world, basePos, 12, 4, 11, dottedBrick);
		addBlock(world, basePos, 12, 4, 12, dottedBrick);
		addBlock(world, basePos, 12, 4, 13, dottedBrick);
		addBlock(world, basePos, 12, 4, 14, dottedBrick);
		addBlock(world, basePos, 12, 4, 15, dottedBrick);
		addBlock(world, basePos, 12, 4, 16, dottedBrick);
		addBlock(world, basePos, 12, 4, 17, dottedBrick);
		addBlock(world, basePos, 12, 4, 18, dottedBrick);
		addBlock(world, basePos, 2, 5, 8, dottedBrick);
		addBlock(world, basePos, 2, 5, 9, dottedBrick);
		addBlock(world, basePos, 2, 5, 10, dottedBrick);
		addBlock(world, basePos, 2, 5, 11, dottedBrick);
		addBlock(world, basePos, 2, 5, 12, dottedBrick);
		addBlock(world, basePos, 2, 5, 13, dottedBrick);
		addBlock(world, basePos, 2, 5, 14, dottedBrick);
		addBlock(world, basePos, 2, 5, 15, dottedBrick);
		addBlock(world, basePos, 2, 5, 16, dottedBrick);
		addBlock(world, basePos, 2, 5, 17, dottedBrick);
		addBlock(world, basePos, 3, 5, 8, dottedBrick);
		addBlock(world, basePos, 3, 5, 9, stripedBrick);
		addBlock(world, basePos, 3, 5, 10, stripedBrick);
		addBlock(world, basePos, 3, 5, 11, stripedBrick);
		addBlock(world, basePos, 3, 5, 12, stripedBrick);
		addBlock(world, basePos, 3, 5, 13, stripedBrick);
		addBlock(world, basePos, 3, 5, 14, stripedBrick);
		addBlock(world, basePos, 3, 5, 15, stripedBrick);
		addBlock(world, basePos, 3, 5, 16, stripedBrick);
		addBlock(world, basePos, 3, 5, 17, dottedBrick);
		addBlock(world, basePos, 4, 5, 8, dottedBrick);
		addBlock(world, basePos, 4, 5, 9, stripedBrick);
		addBlock(world, basePos, 4, 5, 10, stripedBrick);
		addBlock(world, basePos, 4, 5, 11, stripedBrick);
		addBlock(world, basePos, 4, 5, 12, stripedBrick);
		addBlock(world, basePos, 4, 5, 13, stripedBrick);
		addBlock(world, basePos, 4, 5, 14, stripedBrick);
		addBlock(world, basePos, 4, 5, 15, stripedBrick);
		addBlock(world, basePos, 4, 5, 16, stripedBrick);
		addBlock(world, basePos, 4, 5, 17, dottedBrick);
		addBlock(world, basePos, 5, 5, 8, dottedBrick);
		addBlock(world, basePos, 5, 5, 9, stripedBrick);
		addBlock(world, basePos, 5, 5, 10, stripedBrick);
		addBlock(world, basePos, 5, 5, 11, stripedBrick);
		addBlock(world, basePos, 5, 5, 12, stripedBrick);
		addBlock(world, basePos, 5, 5, 13, stripedBrick);
		addBlock(world, basePos, 5, 5, 14, stripedBrick);
		addBlock(world, basePos, 5, 5, 15, stripedBrick);
		addBlock(world, basePos, 5, 5, 16, stripedBrick);
		addBlock(world, basePos, 5, 5, 17, dottedBrick);
		addBlock(world, basePos, 6, 5, 8, dottedBrick);
		addBlock(world, basePos, 6, 5, 9, stripedBrick);
		addBlock(world, basePos, 6, 5, 10, stripedBrick);
		addBlock(world, basePos, 6, 5, 11, stripedBrick);
		addBlock(world, basePos, 6, 5, 12, stripedBrick);
		addBlock(world, basePos, 6, 5, 13, stripedBrick);
		addBlock(world, basePos, 6, 5, 14, stripedBrick);
		addBlock(world, basePos, 6, 5, 15, stripedBrick);
		addBlock(world, basePos, 6, 5, 16, stripedBrick);
		addBlock(world, basePos, 6, 5, 17, dottedBrick);
		addBlock(world, basePos, 7, 5, 8, dottedBrick);
		addBlock(world, basePos, 7, 5, 9, stripedBrick);
		addBlock(world, basePos, 7, 5, 10, stripedBrick);
		addBlock(world, basePos, 7, 5, 11, stripedBrick);
		addBlock(world, basePos, 7, 5, 12, stripedBrick);
		addBlock(world, basePos, 7, 5, 13, stripedBrick);
		addBlock(world, basePos, 7, 5, 14, stripedBrick);
		addBlock(world, basePos, 7, 5, 15, stripedBrick);
		addBlock(world, basePos, 7, 5, 16, stripedBrick);
		addBlock(world, basePos, 7, 5, 17, dottedBrick);
		addBlock(world, basePos, 8, 5, 8, dottedBrick);
		addBlock(world, basePos, 8, 5, 9, stripedBrick);
		addBlock(world, basePos, 8, 5, 10, stripedBrick);
		addBlock(world, basePos, 8, 5, 11, stripedBrick);
		addBlock(world, basePos, 8, 5, 12, stripedBrick);
		addBlock(world, basePos, 8, 5, 13, stripedBrick);
		addBlock(world, basePos, 8, 5, 14, stripedBrick);
		addBlock(world, basePos, 8, 5, 15, stripedBrick);
		addBlock(world, basePos, 8, 5, 16, stripedBrick);
		addBlock(world, basePos, 8, 5, 17, dottedBrick);
		addBlock(world, basePos, 9, 5, 8, dottedBrick);
		addBlock(world, basePos, 9, 5, 9, stripedBrick);
		addBlock(world, basePos, 9, 5, 10, stripedBrick);
		addBlock(world, basePos, 9, 5, 11, stripedBrick);
		addBlock(world, basePos, 9, 5, 12, stripedBrick);
		addBlock(world, basePos, 9, 5, 13, stripedBrick);
		addBlock(world, basePos, 9, 5, 14, stripedBrick);
		addBlock(world, basePos, 9, 5, 15, stripedBrick);
		addBlock(world, basePos, 9, 5, 16, stripedBrick);
		addBlock(world, basePos, 9, 5, 17, dottedBrick);
		addBlock(world, basePos, 10, 5, 8, dottedBrick);
		addBlock(world, basePos, 10, 5, 9, stripedBrick);
		addBlock(world, basePos, 10, 5, 10, stripedBrick);
		addBlock(world, basePos, 10, 5, 11, stripedBrick);
		addBlock(world, basePos, 10, 5, 12, stripedBrick);
		addBlock(world, basePos, 10, 5, 13, stripedBrick);
		addBlock(world, basePos, 10, 5, 14, stripedBrick);
		addBlock(world, basePos, 10, 5, 15, stripedBrick);
		addBlock(world, basePos, 10, 5, 16, stripedBrick);
		addBlock(world, basePos, 10, 5, 17, dottedBrick);
		addBlock(world, basePos, 11, 5, 8, dottedBrick);
		addBlock(world, basePos, 11, 5, 9, dottedBrick);
		addBlock(world, basePos, 11, 5, 10, dottedBrick);
		addBlock(world, basePos, 11, 5, 11, dottedBrick);
		addBlock(world, basePos, 11, 5, 12, dottedBrick);
		addBlock(world, basePos, 11, 5, 13, dottedBrick);
		addBlock(world, basePos, 11, 5, 14, dottedBrick);
		addBlock(world, basePos, 11, 5, 15, dottedBrick);
		addBlock(world, basePos, 11, 5, 16, dottedBrick);
		addBlock(world, basePos, 11, 5, 17, dottedBrick);
	}

	@Override
	protected void doPostBuildOps(World world, Random rand, BlockPos basePos) {
		assignLootChests(world, rand, LootSystemRegister.structureIroPassageChests, basePos.add(6, 2, 17), basePos.add(7, 2, 17));
	}
}