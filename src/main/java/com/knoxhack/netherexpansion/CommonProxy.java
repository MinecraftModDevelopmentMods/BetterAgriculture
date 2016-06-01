package com.knoxhack.netherexpansion;

import com.knoxhack.netherexpansion.blocks.ModBlocks;
import com.knoxhack.netherexpansion.crafting.ModCrafting;
import com.knoxhack.netherexpansion.structures.TutorialWorldGenerator;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Logger;
public class CommonProxy {



	public void preInit(FMLPreInitializationEvent event) {
		ModBlocks.createBlocks();
		
		

	}

	public void init(FMLInitializationEvent event) {
		ModCrafting.initCrafting();
		GameRegistry.registerWorldGenerator(new TutorialWorldGenerator(), 0);
	


		
	}

	
		
	private static final Logger logger = FMLLog.getLogger();
	

	public void postInit(FMLPostInitializationEvent event) {

	}

	public void info(String s)

	{
		logger.info(s);	
	}

	public void error(String s)
	{
		logger.error(s);
	}


}
