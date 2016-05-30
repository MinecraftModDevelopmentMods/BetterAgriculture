package com.knoxhack.netherexpansion;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
		modid = Main.MODID,
		name = Main.MODNAME,
		version = Main.VERSION,
		dependencies = "required-after:Forge",
		acceptedMinecraftVersions = "1.8.9,)",
		updateJSON = "https://raw.githubusercontent.com/nfinit-gaming/Nether-Expansion/master/update.json")

public class Main {

	@Instance
	public static Main INSTANCE = null;

	public static final String MODID = "netherexpansion";
	public static final String MODNAME = "Nether Expansion";
	public static final String VERSION = "0.1";

	/** All ore-spawn files discovered in the ore-spawn folder */
	public static final List<Path> NetherExpansionConfigFiles = new LinkedList<Path>();

	/** location of ore-spawn files */
	public static Path NetherExpansionFolder = null;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		INSTANCE = this;

		// load config
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();

		NetherExpansionFolder = Paths.get(event.getSuggestedConfigurationFile().toPath().getParent().toString(),"NetherExpansion");


		config.save();

		Main.proxy.preInit(event);
		
		
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		Main.proxy.init(event);
		
	
	
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		Main.proxy.postInit(event);
		
		
		
		
		
		
		
		
	}

	@SidedProxy(clientSide="com.knoxhack.netherexpansion.ClientProxy", serverSide="com.knoxhack.netherexpansion.ServerProxy")
	public static CommonProxy proxy;



	
}
