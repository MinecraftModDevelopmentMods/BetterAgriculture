package betteragriculture;


import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Logger;

import betteragriculture.blocks.ModBlocks;
import betteragriculture.crafting.ModCrafting;
import betteragriculture.items.ModItems;
import betteragriculture.world.WorldGen;
import drops.DropHandler;
public class CommonProxy {



	public void preInit(FMLPreInitializationEvent event) {
		ModBlocks.createBlocks();
		ModItems.createItems();
	}

	public void init(FMLInitializationEvent event) {
		ModCrafting.initCrafting();
		GameRegistry.registerWorldGenerator(new WorldGen(), 0);
		MinecraftForge.EVENT_BUS.register(new DropHandler());

		
		

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
