package com.knoxhack.betteragriculture.world.biome;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FarmlandBiome extends BaseBiome {

	public FarmlandBiome(String registryName, Biome.BiomeProperties properties) {
		super("FarmlandBiome");
        topBlock = Blocks.GRASS.getDefaultState();
        fillerBlock = Blocks.GRASS.getDefaultState();
        
        
        /**
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobNpcFemale1.class, 8, 1, 2));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobNpcMale.class, 8, 1, 2));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobCow1.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobCow1.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobCow1.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobCow1.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobCow1.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobCow1.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobCow1.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobCow1.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobCow1.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobCow1.class, 4, 1, 5));

        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobPig1.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobPig2.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobPig3.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobPig4.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobPig5.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobPig6.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobPig7.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobPig8.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobPig9.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobPig10.class, 4, 1, 5));

        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobSheep1.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobSheep2.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobSheep3.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobSheep4.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobSheep5.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobSheep6.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobSheep7.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobSheep8.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobSheep9.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobSheep10.class, 4, 1, 5));

        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobChicken1.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobChicken2.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobChicken3.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobChicken4.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobChicken5.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobChicken6.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobChicken7.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobChicken8.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobChicken9.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobChicken10.class, 4, 1, 5));

        
        **/
	}

	
	@Override
	@SideOnly(Side.CLIENT)
	public int getGrassColorAtPos(BlockPos pos)
	{
		return 0x00cc00;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getFoliageColorAtPos(BlockPos pos)
	{
		return 0x7d9f39;
	}


}
