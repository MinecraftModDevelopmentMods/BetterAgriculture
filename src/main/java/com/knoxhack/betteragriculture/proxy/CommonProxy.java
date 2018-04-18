package com.knoxhack.betteragriculture.proxy;

import java.io.File;
import com.knoxhack.betteragriculture.Config;
import com.knoxhack.betteragriculture.init.ModBiomes;
import com.knoxhack.betteragriculture.init.ModEntities;
import com.knoxhack.betteragriculture.init.Recipes;
import com.knoxhack.betteragriculture.items.ItemBase;
import com.knoxhack.betteragriculture.lib.DropHandler;
import com.knoxhack.betteragriculture.world.WorldGen;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class CommonProxy {

    public static Configuration config;
    public void preInit(FMLPreInitializationEvent e) {

    	
        File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "betteragriculture.cfg"));
        Config.readConfig();
        ModEntities.init();  
        Recipes.init();
  
        
        
        
        
        
        
        
    }
    public void init(FMLInitializationEvent e) {
        GameRegistry.registerWorldGenerator(new WorldGen(), 0);
        ModBiomes.initBiomes();
		MinecraftForge.EVENT_BUS.register(new DropHandler());

        
        
    }
    public void postInit(FMLPostInitializationEvent e) {
    }
    
    
   
	public void registerItemRenderer(Item item, int meta, String id) {
		// TODO Auto-generated method stub
		
	}
    

    
    
    
    
    
    
    
    
    
    
    
    
 }