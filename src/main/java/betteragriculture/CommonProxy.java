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

public class CommonProxy {

	  public static TileColorBlock2 tilecolorBlock;  
	  public static ItemTileColorBlock2 itemtilecolorBlock; 
	  public static TileColorBlock2 largetilecolorBlock;  
	  public static ItemTileColorBlock2 largeitemtilecolorBlock; 
	  public static TileColorBlock2 smalltilecolorBlock;  
	  public static ItemTileColorBlock2 smallitemtilecolorBlock;  
	  public static TileColorBlock2 tinytilecolorBlock;  
	  public static ItemTileColorBlock2 tinyitemtilecolorBlock;  

	public void preInit(FMLPreInitializationEvent event) {

 
	   tilecolorBlock = (TileColorBlock2)(new TileColorBlock2().setUnlocalizedName("fancy_tile_color_block"));
	   tilecolorBlock.setRegistryName("fancy_tile_color_block");
	   GameRegistry.register(tilecolorBlock);
	   itemtilecolorBlock = new ItemTileColorBlock2(tilecolorBlock);
	   itemtilecolorBlock.setRegistryName(tilecolorBlock.getRegistryName());
	   GameRegistry.register(itemtilecolorBlock);
	
	   	 
	   
	   largetilecolorBlock = (TileColorBlock2)(new TileColorBlock2().setUnlocalizedName("large_tile_color_block"));
	   largetilecolorBlock.setRegistryName("large_tile_color_block");
	   GameRegistry.register(largetilecolorBlock);
	   largeitemtilecolorBlock = new ItemTileColorBlock2(largetilecolorBlock);
	   largeitemtilecolorBlock.setRegistryName(largetilecolorBlock.getRegistryName());
	   GameRegistry.register(largeitemtilecolorBlock);
	   
	   smalltilecolorBlock = (TileColorBlock2)(new TileColorBlock2().setUnlocalizedName("small_tile_color_block"));
	   smalltilecolorBlock.setRegistryName("small_tile_color_block");
	   GameRegistry.register(smalltilecolorBlock);
	   
	   smallitemtilecolorBlock = new ItemTileColorBlock2(smalltilecolorBlock);
	   smallitemtilecolorBlock.setRegistryName(smalltilecolorBlock.getRegistryName());
	   GameRegistry.register(smallitemtilecolorBlock);
	   
	   tinytilecolorBlock = (TileColorBlock2)(new TileColorBlock2().setUnlocalizedName("tiny_tile_color_block"));
	   tinytilecolorBlock.setRegistryName("tiny_tile_color_block");
	   GameRegistry.register(tinytilecolorBlock);
	   
	   tinyitemtilecolorBlock = new ItemTileColorBlock2(tinytilecolorBlock);
	   tinyitemtilecolorBlock.setRegistryName(tinytilecolorBlock.getRegistryName());
	   GameRegistry.register(tinyitemtilecolorBlock);

		
		
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
