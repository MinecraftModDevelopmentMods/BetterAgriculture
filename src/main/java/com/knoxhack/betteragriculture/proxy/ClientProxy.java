package com.knoxhack.betteragriculture.proxy;

import com.knoxhack.betteragriculture.Main;
import com.knoxhack.betteragriculture.init.ModBlocks;
import com.knoxhack.betteragriculture.init.ModEntities;
import com.knoxhack.betteragriculture.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {


	@Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
		ModEntities.initModels();


    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
      // ModBlocks.initModels();
        //ModItems.initModels();

    }
    

    
    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
    	ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Main.MODID + ":" + id, "inventory"));
    }
    
    
    
}