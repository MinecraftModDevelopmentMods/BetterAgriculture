package com.knoxhack.betteragriculture.world.biome;

import net.minecraft.world.biome.Biome;

public class BaseBiome extends Biome{

	public BaseBiome(BiomeProperties properties, String name) {
		super(properties);
        setRegistryName(name);
	}

	
public BaseBiome (String name) {
	
	this (new BiomeProperties (name), name);
}
		
		
	}



	
	
	
	
	
	

