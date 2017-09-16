package com.knoxhack.betteragriculture.world;

import java.util.Random;

import com.knoxhack.betteragriculture.Config;
import com.knoxhack.betteragriculture.init.ModBlocks;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator {

	private WorldGenerator slateGen;		
	public WorldGen() {
		slateGen = new WorldGenMinable(ModBlocks.SLATE.getDefaultState(), 15, BlockMatcher.forBlock(Blocks.STONE));

	  
	}
    private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
	    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) {
	        int x = chunk_X * 16 + rand.nextInt(16);
	        int y = minHeight + rand.nextInt(heightDiff);
	        int z = chunk_Z * 16 + rand.nextInt(16);
	        generator.generate(world, rand, new BlockPos(x, y, z));
	    }
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		  switch (world.provider.getDimension()) {
		    case 0: 
		    	
                 if (Config.enabledSlateGen)
                 {
		        this.runGenerator(this.slateGen, world, random, chunkX, chunkZ, 15, 0, 120);
                 }
                 
                 else 
                
		        break;
			case -1: 

				break;
			case 1:
				break;
			}
		  
	}
}
