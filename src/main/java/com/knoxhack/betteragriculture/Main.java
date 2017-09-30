package com.knoxhack.betteragriculture;



import com.knoxhack.betteragriculture.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.MODVERSION, dependencies = "required-after:forge@[14.22.0.2467,)", useMetadata = true)
public class Main {

    public static final String MODID = "betteragriculture";
    public static final String MODNAME = "Better Agriculture";
    public static final String MODVERSION = "1.2.1";
	public static final CreativeTabMain creativeTab = new CreativeTabMain();

    @SidedProxy(clientSide = "com.knoxhack.betteragriculture.proxy.ClientProxy", serverSide = "com.knoxhack.betteragriculture.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static Main instance;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
       // logger =  (Logger) event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}