package betteragriculture;


import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Logger;



import betteragriculture.init.Blocks;
import betteragriculture.init.ItemGroups;
import betteragriculture.init.Materials;
import betteragriculture.items.ModItems;
import betteragriculture.util.Config;

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

	   
		Config.init();

		Materials.init();
		ItemGroups.init();
		Blocks.init();
		
		//ModBlocks.createBlocks();
		ModItems.createItems();
	}

	public void init(FMLInitializationEvent event) {
		//ModCrafting.initCrafting();
		//GameRegistry.registerWorldGenerator(new WorldGen(), 0);
		//MinecraftForge.EVENT_BUS.register(new DropHandler());

		
		

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
