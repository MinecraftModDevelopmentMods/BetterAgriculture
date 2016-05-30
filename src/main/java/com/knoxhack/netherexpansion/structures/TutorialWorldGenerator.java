package com.knoxhack.netherexpansion.structures;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class TutorialWorldGenerator implements IWorldGenerator
{
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		// these are important!
		int blockX = chunkX * 16;
		int blockZ = chunkZ * 16;
		// generate differently based on dimension
		switch(world.provider.getDimension())
		{
		case -1: generateNether(world, random, blockX, blockZ);
		break;
		case 0: generateOverworld(world, random, blockX, blockZ);
		break;
		case 1: generateEnd(world, random, blockX, blockZ);
		break;
		}

	}

	private void generateNether(World world, Random rand, int blockX, int blockZ) 
	{
		// leaving blank for now		
	}

	private void generateOverworld(World world, Random rand, int blockX, int blockZ) 
	{

		WorldGenerator genCabin = new StructureCabin();
		// 25% of chunks can have a cabin
		final int CABIN_CHANCE = 25;
		if(rand.nextInt(100) < CABIN_CHANCE)
		{
			// get a random position in the chunk
			int randX = blockX + rand.nextInt(16);
			int randZ = blockZ + rand.nextInt(16);
			// use our custom function to get the ground height
			int groundY = getGroundFromAbove(world, randX, randZ);
			genCabin.generate(world, rand, new net.minecraft.util.math.BlockPos(randX, groundY + 1, randZ));
		}
		/** END CABIN GEN **/
	}

	private void generateEnd(World world, Random rand, int blockX, int blockZ) 
	{
		// leaving blank for now
	}

	/** HELPER METHODS **/

	// find a grass or dirt block to place the bush on
	public static int getGroundFromAbove(World world, int x, int z)
	{
		int y = 255;
		boolean foundGround = false;
		while(!foundGround && y-- >= 0)
		{
			Block blockAt = world.getBlockState(new net.minecraft.util.math.BlockPos(x,y,z)).getBlock();
			// "ground" for our bush is grass or dirt
			foundGround = blockAt == Blocks.DIRT || blockAt == Blocks.GRASS;
		}

		return y;
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		// TODO Auto-generated method stub
		
	}
}