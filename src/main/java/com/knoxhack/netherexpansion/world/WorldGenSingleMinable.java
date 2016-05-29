package com.knoxhack.nethermetals.world;

import java.util.Random;

import com.google.common.base.Predicate;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenSingleMinable extends WorldGenerator {

	private IBlockState block;
	private Predicate<IBlockState> target;

	public WorldGenSingleMinable(IBlockState block, Predicate<IBlockState> target) {
		this.block = block;
		this.target = target;
	}

	public WorldGenSingleMinable(IBlockState block) {
		this(block, (Predicate<IBlockState>) BlockMatcher.forBlock(Blocks.NETHERRACK));
	}

	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) {
		if (worldIn.getBlockState(position).getBlock().isReplaceableOreGen(this.block, worldIn, position, (com.google.common.base.Predicate<IBlockState>) this.target))
			worldIn.setBlockState(position, this.block);
		return true;
	}
}
