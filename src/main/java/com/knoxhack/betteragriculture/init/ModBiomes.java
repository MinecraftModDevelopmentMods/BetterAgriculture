package com.knoxhack.betteragriculture.init;


import com.knoxhack.betteragriculture.world.biome.FarmlandBiome;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModBiomes {

    public static FarmlandBiome farmlandBiome = new FarmlandBiome("farmlandBiome", new Biome.BiomeProperties("Farmland")
            .setBaseBiome("ForestHills").setBaseHeight(0.45F).setHeightVariation(0.3F).setTemperature(0.7F).setRainfall(0.8F));
    public static void initBiomes()
    {
        ForgeRegistries.BIOMES.register(farmlandBiome);
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(farmlandBiome, 5));
        BiomeManager.addSpawnBiome(farmlandBiome);
        BiomeDictionary.addTypes(farmlandBiome, BiomeDictionary.Type.PLAINS);

    }
}