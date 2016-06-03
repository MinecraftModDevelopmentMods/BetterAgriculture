package betteragriculture;

import java.util.LinkedList;

import betteragriculture.entity.entitymob.UndeadGhastly;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.*;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.*;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
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

	public static final String MODID = "betteragriculture";
	public static final String MODNAME = "Better Agriculture";
	public static final String VERSION = "0.2";
	private static int entityID = 0;


	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		INSTANCE = this;

		// load config
        ConfigHandler.startConfig(event);

		
		
		//Bobregistry test
        registerEntity(UndeadGhastly.class, "UndeadGhastly", 0x006400, 0x98FB98);



		Main.proxy.preInit(event);
		
		
	}

		
	

    private void registerEntity(Class<? extends Entity> entityClass, String entityName, int bkEggColor, int fgEggColor) {
        EntityRegistry.registerModEntity(entityClass, entityName, entityID++, Main.INSTANCE, 80, 3, true, bkEggColor, fgEggColor);
    }




	@EventHandler
	public void init(FMLInitializationEvent event) {
		Main.proxy.init(event);
        MinecraftForge.EVENT_BUS.register(Main.INSTANCE);

	
	
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		Main.proxy.postInit(event);
		  proxy.info("*** Checking for monitor biomes");
	        Biome[] forestBiomes = getBiomes(Type.FOREST, Type.BEACH, Type.SWAMP, Type.PLAINS);

        addSpawn(UndeadGhastly.class, ConfigHandler.getGhastlySpawnProb(), 4, 4, forestBiomes);
	}
		
        private Biome[] getBiomes(Type... types) {
            LinkedList<Biome> list = new LinkedList<Biome>();
            for (Type t : types) {
                Biome[] biomes = BiomeDictionary.getBiomesForType(t);
                for (Biome bgb : biomes) {
                    if (BiomeDictionary.isBiomeOfType(bgb, Type.END) || BiomeDictionary.isBiomeOfType(bgb, Type.NETHER)) {
                        continue;
                    }
                    if (BiomeDictionary.isBiomeOfType(bgb, Type.SNOWY) || bgb.getTemperature() < 0.32F) { // exclude cold climates
//    					proxy.info("  <<< Excluding " + bgb.biomeName + " for spawning");
                        continue;
                    }
                    if (BiomeDictionary.isBiomeOfType(bgb, Type.WATER)) { // exclude ocean biomes
//    					proxy.info("  <<< Excluding " + bgb.biomeName + " for spawning");
                        continue;
                    }
                    if (!list.contains(bgb)) {
                        list.add(bgb);
                        proxy.info("  >>> Adding " + bgb.getBiomeName() + " for spawning");
                    }
                }
            }
            return list.toArray(new Biome[0]);
        }
        private void addSpawn(Class<? extends EntityLiving> entityClass, int spawnProb, int min, int max, Biome[] biomes) {
            if (spawnProb > 0) {
                EntityRegistry.addSpawn(entityClass, spawnProb, min, max, EnumCreatureType.CREATURE, biomes);
            }
		
		
		
		
	}

	@SidedProxy(clientSide="betteragriculture.ClientProxy", serverSide="betteragriculture.ServerProxy")
	public static CommonProxy proxy;



	
}
