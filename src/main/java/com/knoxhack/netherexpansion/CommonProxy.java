package com.knoxhack.netherexpansion;

import com.knoxhack.netherexpansion.blocks.ModBlocks;
import com.knoxhack.netherexpansion.crafting.ModCrafting;
import com.knoxhack.netherexpansion.entity.UndeadGhastly;
import com.knoxhack.netherexpansion.world.WorldGen;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLiving.SpawnPlacementType;
import net.minecraft.entity.EnumCreatureType;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {


    public static final String UNDEAD_GHASTLY = "netherexpansion.undeadGhastly";

	public void preInit(FMLPreInitializationEvent event) {
		ModBlocks.createBlocks();
	}

	public void init(FMLInitializationEvent event) {
		ModCrafting.initCrafting();
		GameRegistry.registerWorldGenerator(new WorldGen(), 0);
	       registerEntity(UndeadGhastly.class, UNDEAD_GHASTLY, EntityLiving.SpawnPlacementType.ON_GROUND, true);
	        EntityRegistry.addSpawn(UndeadGhastly.class, 10, 1, 5, EnumCreatureType.CREATURE); //change the values to vary the spawn rarity, biome, etc. 
	
		
		
	}

	private void registerEntity(Class<UndeadGhastly> class1, String undeadGhastly, SpawnPlacementType onGround,
			boolean b) {

		
	}

	public void postInit(FMLPostInitializationEvent event) {

	}
}
