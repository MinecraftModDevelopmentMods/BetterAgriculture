package com.knoxhack.netherexpansion;

import com.knoxhack.netherexpansion.blocks.ModBlocks;
import com.knoxhack.netherexpansion.crafting.ModCrafting;
import com.knoxhack.netherexpansion.entity.MobEntityRegistry;
import com.knoxhack.netherexpansion.structures.TutorialWorldGenerator;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

  protected MobEntityRegistry            entityRegistry;


	public void preInit(FMLPreInitializationEvent event) {
		ModBlocks.createBlocks();
  entityRegistry.register();
		
		
 // registerEntity(UndeadGhastly.class, UNDEAD_GHASTLY, EntityLiving.SpawnPlacementType.ON_GROUND, true);
//  EntityRegistry.addSpawn(UndeadGhastly.class, 10, 1, 5, EnumCreatureType.CREATURE); //change the values to vary the spawn rarity, biome, etc. 

		
		
	}

	public void init(FMLInitializationEvent event) {
		ModCrafting.initCrafting();
		GameRegistry.registerWorldGenerator(new TutorialWorldGenerator(), 0);
	


		
	}

	
		
	

	public void postInit(FMLPostInitializationEvent event) {

	}
}
