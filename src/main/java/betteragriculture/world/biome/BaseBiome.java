package betteragriculture.world.biome;

import net.minecraft.world.biome.BiomeGenBase;

public class BaseBiome extends BiomeGenBase{

	public BaseBiome(BiomeProperties properties, String name) {
		super(properties);
        setRegistryName(name);
	}

	
public BaseBiome (String name) {
	
	this (new BiomeProperties (name), name);
}
		
		
	}



	
	
	
	
	
	

