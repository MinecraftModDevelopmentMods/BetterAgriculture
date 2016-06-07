package betteragriculture.world.biome;

import java.util.Random;

import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenLiquids;
import net.minecraft.world.gen.feature.WorldGenPumpkin;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate;
import net.minecraftforge.event.terraingen.TerrainGen;

public class BiomeFarmlandDecorator extends BiomeDecorator
{
	@Override
	protected void genDecorations(Biome biome, World world, Random random)
	{
		MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Pre(world, random, chunkPos));

		generateOres(world, random);

		int i;
		int j;
		int k;

		boolean doGen = TerrainGen.decorate(world, random, chunkPos, Decorate.EventType.SAND);

		for (i = 0; doGen && i < sandPerChunk2; ++i)
		{
			j = nextInt(random, 16) + 8;
			k = nextInt(random, 16) + 8;

			sandGen.generate(world, random, world.getTopSolidOrLiquidBlock(chunkPos.add(j, 0, k)));
		}

		doGen = TerrainGen.decorate(world, random, chunkPos, Decorate.EventType.CLAY);

		for (i = 0; doGen && i < clayPerChunk; ++i)
		{
			j = nextInt(random, 16) + 8;
			k = nextInt(random, 16) + 8;

			clayGen.generate(world, random, world.getTopSolidOrLiquidBlock(chunkPos.add(j, 0, k)));
		}

		doGen = TerrainGen.decorate(world, random, chunkPos, Decorate.EventType.SAND_PASS2);

		for (i = 0; doGen && i < sandPerChunk; ++i)
		{
			j = nextInt(random, 16) + 8;
			k = nextInt(random, 16) + 8;

			gravelAsSandGen.generate(world, random, world.getTopSolidOrLiquidBlock(chunkPos.add(j, 0, k)));
		}

		i = treesPerChunk;

		if (nextInt(random, 10) == 0)
		{
			++i;
		}

		int l;
		BlockPos blockpos;

		doGen = TerrainGen.decorate(world, random, chunkPos, Decorate.EventType.TREE);

		for (j = 0; doGen && j < i; ++j)
		{
			k = nextInt(random, 16) + 8;
			l = nextInt(random, 16) + 8;

			WorldGenAbstractTree treeGen = biome.genBigTreeChance(random);

			treeGen.setDecorationDefaults();
			blockpos = world.getHeight(chunkPos.add(k, 0, l));

			if (treeGen.generate(world, random, blockpos))
			{
				treeGen.generateSaplings(world, random, blockpos);
			}
		}

		int m;

		doGen = TerrainGen.decorate(world, random, chunkPos, Decorate.EventType.FLOWERS);

		for (j = 0; doGen && j < flowersPerChunk; ++j)
		{
			k = nextInt(random, 16) + 8;
			l = nextInt(random, 16) + 8;
			m = nextInt(random, world.getHeight(chunkPos.add(k, 0, l)).getY() + 32);
			blockpos = chunkPos.add(k, m, l);

			BlockFlower.EnumFlowerType type = biome.pickRandomFlower(random, blockpos);
			BlockFlower flower = type.getBlockType().getBlock();

			if (flower.getDefaultState().getMaterial() != Material.AIR)
			{
				yellowFlowerGen.setGeneratedBlock(flower, type);
				yellowFlowerGen.generate(world, random, blockpos);
			}
		}

		doGen = TerrainGen.decorate(world, random, chunkPos, Decorate.EventType.GRASS);

		for (j = 0; doGen && j < grassPerChunk; ++j)
		{
			k = nextInt(random, 16) + 8;
			l = nextInt(random, 16) + 8;
			m = nextInt(random, world.getHeight(chunkPos.add(k, 0, l)).getY() * 2);

			biome.getRandomWorldGenForGrass(random).generate(world, random, chunkPos.add(k, m, l));
		}

		j = 0;

		doGen = TerrainGen.decorate(world, random, chunkPos, Decorate.EventType.LILYPAD);

		while (doGen && j < waterlilyPerChunk)
		{
			k = nextInt(random, 16) + 8;
			l = nextInt(random, 16) + 8;
			m = nextInt(random, world.getHeight(chunkPos.add(k, 0, l)).getY() * 2);
			blockpos = chunkPos.add(k, m, l);

			while (true)
			{
				if (blockpos.getY() > 0)
				{
					BlockPos pos = blockpos.down();

					if (world.isAirBlock(pos))
					{
						blockpos = pos;
						continue;
					}
				}

				waterlilyGen.generate(world, random, blockpos);
				++j;
				break;
			}
		}

		doGen = TerrainGen.decorate(world, random, chunkPos, Decorate.EventType.SHROOM);

		for (j = 0; doGen && j < mushroomsPerChunk; ++j)
		{
			if (nextInt(random, 4) == 0)
			{
				k = nextInt(random, 16) + 8;
				l = nextInt(random, 16) + 8;
				blockpos = world.getHeight(chunkPos.add(k, 0, l));

				mushroomBrownGen.generate(world, random, blockpos);
			}

			if (nextInt(random, 8) == 0)
			{
				k = nextInt(random, 16) + 8;
				l = nextInt(random, 16) + 8;
				m = nextInt(random, world.getHeight(chunkPos.add(k, 0, l)).getY() * 2);
				blockpos = chunkPos.add(k, m, l);

				mushroomRedGen.generate(world, random, blockpos);
			}
		}

		if (doGen && nextInt(random, 4) == 0)
		{
			j = nextInt(random, 16) + 8;
			k = nextInt(random, 16) + 8;
			l = nextInt(random, world.getHeight(chunkPos.add(j, 0, k)).getY() * 2);
			mushroomBrownGen.generate(world, random, chunkPos.add(j, l, k));
		}

		if (doGen && nextInt(random, 8) == 0)
		{
			j = nextInt(random, 16) + 8;
			k = nextInt(random, 16) + 8;
			l = nextInt(random, world.getHeight(chunkPos.add(j, 0, k)).getY() * 2);

			mushroomRedGen.generate(world, random, chunkPos.add(j, l, k));
		}

		doGen = TerrainGen.decorate(world, random, chunkPos, Decorate.EventType.REED);

		for (j = 0; doGen && j < reedsPerChunk; ++j)
		{
			k = nextInt(random, 16) + 8;
			l = nextInt(random, 16) + 8;
			m = nextInt(random, world.getHeight(chunkPos.add(k, 0, l)).getY() * 2);

			reedGen.generate(world, random, chunkPos.add(k, m, l));
		}

		for (j = 0; doGen && j < 10; ++j)
		{
			k = nextInt(random, 16) + 8;
			l = nextInt(random, 16) + 8;
			m = nextInt(random, world.getHeight(chunkPos.add(k, 0, l)).getY() * 2);

			reedGen.generate(world, random, chunkPos.add(k, m, l));
		}

		doGen = TerrainGen.decorate(world, random, chunkPos, Decorate.EventType.PUMPKIN);

		if (doGen && nextInt(random, 32) == 0)
		{
			j = nextInt(random, 16) + 8;
			k = nextInt(random, 16) + 8;
			l = nextInt(random, world.getHeight(chunkPos.add(j, 0, k)).getY() * 2);

			new WorldGenPumpkin().generate(world, random, chunkPos.add(j, l, k));
		}

		if (generateLakes)
		{
			BlockPos blockpos1;

			doGen = TerrainGen.decorate(world, random, chunkPos, Decorate.EventType.LAKE_WATER);

			for (j = 0; doGen && j < 50; ++j)
			{
				blockpos1 = chunkPos.add(nextInt(random, 16) + 8, nextInt(random, nextInt(random, 248) + 8), nextInt(random, 16) + 8);

				new WorldGenLiquids(Blocks.FLOWING_WATER).generate(world, random, blockpos1);
			}

			doGen = TerrainGen.decorate(world, random, chunkPos, Decorate.EventType.LAKE_LAVA);

			for (j = 0; doGen && j < 20; ++j)
			{
				blockpos1 = chunkPos.add(nextInt(random, 16) + 8, nextInt(random, nextInt(random, nextInt(random, 240) + 8) + 8), nextInt(random, 16) + 8);

				new WorldGenLiquids(Blocks.FLOWING_WATER).generate(world, random, blockpos1);
			}
		}

		MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Post(world, random, chunkPos));
	}

	private int nextInt(Random random, int bound)
	{
		if (bound <= 1)
		{
			return 0;
		}

		return random.nextInt(bound);
	}
}