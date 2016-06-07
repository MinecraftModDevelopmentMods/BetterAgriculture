package betteragriculture;

import java.util.LinkedList;

import betteragriculture.entity.entitymob.EntityMobChicken1;
import betteragriculture.entity.entitymob.EntityMobChicken10;
import betteragriculture.entity.entitymob.EntityMobChicken2;
import betteragriculture.entity.entitymob.EntityMobChicken3;
import betteragriculture.entity.entitymob.EntityMobChicken4;
import betteragriculture.entity.entitymob.EntityMobChicken5;
import betteragriculture.entity.entitymob.EntityMobChicken6;
import betteragriculture.entity.entitymob.EntityMobChicken7;
import betteragriculture.entity.entitymob.EntityMobChicken8;
import betteragriculture.entity.entitymob.EntityMobChicken9;
import betteragriculture.entity.entitymob.EntityMobCow1;
import betteragriculture.entity.entitymob.EntityMobCow10;
import betteragriculture.entity.entitymob.EntityMobCow2;
import betteragriculture.entity.entitymob.EntityMobCow3;
import betteragriculture.entity.entitymob.EntityMobCow4;
import betteragriculture.entity.entitymob.EntityMobCow5;
import betteragriculture.entity.entitymob.EntityMobCow6;
import betteragriculture.entity.entitymob.EntityMobCow7;
import betteragriculture.entity.entitymob.EntityMobCow8;
import betteragriculture.entity.entitymob.EntityMobCow9;
import betteragriculture.entity.entitymob.EntityMobNpcFemale1;
import betteragriculture.entity.entitymob.EntityMobPig1;
import betteragriculture.entity.entitymob.EntityMobPig10;
import betteragriculture.entity.entitymob.EntityMobPig2;
import betteragriculture.entity.entitymob.EntityMobPig3;
import betteragriculture.entity.entitymob.EntityMobPig4;
import betteragriculture.entity.entitymob.EntityMobPig5;
import betteragriculture.entity.entitymob.EntityMobPig6;
import betteragriculture.entity.entitymob.EntityMobPig7;
import betteragriculture.entity.entitymob.EntityMobPig8;
import betteragriculture.entity.entitymob.EntityMobPig9;
import betteragriculture.entity.entitymob.EntityMobSheep1;
import betteragriculture.entity.entitymob.EntityMobSheep10;
import betteragriculture.entity.entitymob.EntityMobSheep2;
import betteragriculture.entity.entitymob.EntityMobSheep3;
import betteragriculture.entity.entitymob.EntityMobSheep4;
import betteragriculture.entity.entitymob.EntityMobSheep5;
import betteragriculture.entity.entitymob.EntityMobSheep6;
import betteragriculture.entity.entitymob.EntityMobSheep7;
import betteragriculture.entity.entitymob.EntityMobSheep8;
import betteragriculture.entity.entitymob.EntityMobSheep9;
import betteragriculture.world.biome.BaseBiome;
import betteragriculture.world.biome.FarmlandBiome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.*;
import static net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.*;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
@Mod(
		modid = Main.MODID,
		name = Main.MODNAME,
		version = Main.VERSION,
		dependencies = "required-after:Forge",
		acceptedMinecraftVersions = "1.8.9,)",
		updateJSON = "https://raw.githubusercontent.com/nfinit-gaming/BetterAgriculture/master/update.json")

public class Main {

	@Instance
	public static Main INSTANCE = null;

	public static final String MODID = "betteragriculture";
	public static final String MODNAME = "Better Agriculture";
	public static final String VERSION = "0.12";
	private static int entityID = 0;

//	private FarmlandBiome farmlandBiome;

	

    public static FarmlandBiome farmlandBiome;
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		INSTANCE = this;

		// load config
        ConfigHandler.startConfig(event);

		
		
		//Bobregistry test
        registerEntity(EntityMobCow1.class, "EntityMobCow1", 0x006400, 0x98FB98);
        registerEntity(EntityMobCow2.class, "EntityMobCow2", 0x006400, 0x98FB98);
        registerEntity(EntityMobCow3.class, "EntityMobCow3", 0x006400, 0x98FB98);
        registerEntity(EntityMobCow4.class, "EntityMobCow4", 0x006400, 0x98FB98);
        registerEntity(EntityMobCow5.class, "EntityMobCow5", 0x006400, 0x98FB98);
        registerEntity(EntityMobCow6.class, "EntityMobCow6", 0x006400, 0x98FB98);
        registerEntity(EntityMobCow7.class, "EntityMobCow7", 0x006400, 0x98FB98);
        registerEntity(EntityMobCow8.class, "EntityMobCow8", 0x006400, 0x98FB98);
        registerEntity(EntityMobCow9.class, "EntityMobCow9", 0x006400, 0x98FB98);
        registerEntity(EntityMobCow10.class, "EntityMobCow10", 0x006400, 0x98FB98);

        
        
        registerEntity(EntityMobNpcFemale1.class, "EntityMobNpcFemale1", 0x006460, 0x98FB98);

        
        
        
        
        registerEntity(EntityMobSheep1.class, "EntityMobSheep1", 0x008500, 0x98FB98);
        registerEntity(EntityMobSheep2.class, "EntityMobSheep2", 0x008500, 0x98FB98);
        registerEntity(EntityMobSheep3.class, "EntityMobSheep3", 0x008500, 0x98FB98);
        registerEntity(EntityMobSheep4.class, "EntityMobSheep4", 0x008500, 0x98FB98);
        registerEntity(EntityMobSheep5.class, "EntityMobSheep5", 0x008500, 0x98FB98);
        registerEntity(EntityMobSheep6.class, "EntityMobSheep6", 0x008500, 0x98FB98);
        registerEntity(EntityMobSheep7.class, "EntityMobSheep7", 0x008500, 0x98FB98);
        registerEntity(EntityMobSheep8.class, "EntityMobSheep8", 0x008500, 0x98FB98);
        registerEntity(EntityMobSheep9.class, "EntityMobSheep9", 0x008500, 0x98FB98);
        registerEntity(EntityMobSheep10.class, "EntityMobSheep10", 0x008500, 0x98FB98);


        registerEntity(EntityMobPig1.class, "EntityMobPig1", 0x008500, 0x98FB98);
        registerEntity(EntityMobPig2.class, "EntityMobPig2", 0x008500, 0x98FB98);
        registerEntity(EntityMobPig3.class, "EntityMobPig3", 0x008500, 0x98FB98);
        registerEntity(EntityMobPig4.class, "EntityMobPig4", 0x008500, 0x98FB98);
        registerEntity(EntityMobPig5.class, "EntityMobPig5", 0x008500, 0x98FB98);
        registerEntity(EntityMobPig6.class, "EntityMobPig6", 0x009500, 0x98FB98);
        registerEntity(EntityMobPig7.class, "EntityMobPig7", 0x008500, 0x98FB98);
        registerEntity(EntityMobPig8.class, "EntityMobPig8", 0x008500, 0x98FB98);
        registerEntity(EntityMobPig9.class, "EntityMobPig9", 0x008500, 0x98FB98);
        registerEntity(EntityMobPig10.class, "EntityMobPig10", 0x008500, 0x98FB98);

        
        registerEntity(EntityMobChicken1.class, "EntityMobChicken1", 0xac9271, 0x98FB98);
        registerEntity(EntityMobChicken2.class, "EntityMobChicken2", 0xac9271, 0x98FB98);
        registerEntity(EntityMobChicken3.class, "EntityMobChicken3", 0xac9271, 0x98FB98);
        registerEntity(EntityMobChicken4.class, "EntityMobChicken4", 0xac9271, 0x98FB98);
        registerEntity(EntityMobChicken5.class, "EntityMobChicken5", 0xac9271, 0x98FB98);
        registerEntity(EntityMobChicken6.class, "EntityMobChicken6", 0xac9271, 0x98FB98);
        registerEntity(EntityMobChicken7.class, "EntityMobChicken7", 0xac9271, 0x98FB98);
        registerEntity(EntityMobChicken8.class, "EntityMobChicken8", 0xac9271, 0x98FB98);
        registerEntity(EntityMobChicken9.class, "EntityMobChicken9", 0xac9271, 0x98FB98);
        registerEntity(EntityMobChicken10.class, "EntityMobChicken10", 0xac9271, 0x98FB98);

 

		Main.proxy.preInit(event);
		
		
	}

		
	

  // private void registerBiomeWithTypes(FarmlandBiome farmlandBiome, String string, BiomeType warm, Type forest) {

		
	




private void registerEntity(Class<? extends Entity> entityClass, String entityName, int bkEggColor, int fgEggColor) {
       EntityRegistry.registerModEntity(entityClass, entityName, entityID++, Main.INSTANCE, 80, 3, true, bkEggColor, fgEggColor);
   }



  
        
	@EventHandler
	public void init(FMLInitializationEvent event) {
		Main.proxy.init(event);
        MinecraftForge.EVENT_BUS.register(Main.INSTANCE);

        farmlandBiome = new FarmlandBiome();
        registerBiome(farmlandBiome,true);
        
        
	}




	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
				Main.proxy.postInit(event);

				BiomeDictionary.registerAllBiomes();
       
       
	

		
		  proxy.info("*** Checking for monitor biomes");
	        Biome[] sheepBiomes = getBiomes(Type.HILLS,Type.FOREST);
	        Biome[] chickenBiomes = getBiomes(Type.JUNGLE,Type.FOREST);
	        Biome[] cowBiomes = getBiomes(Type.PLAINS,Type.SAVANNA,Type.FOREST);
	        Biome[] pigBiomes = getBiomes(Type.SWAMP,Type.FOREST);

	        
	        
		  
	
	        
	        


        addSpawn(EntityMobCow1.class, ConfigHandler.getEntityMobCow1SpawnProb(), 2, 4, cowBiomes);
        addSpawn(EntityMobCow2.class, ConfigHandler.getEntityMobCow2SpawnProb(), 2, 4, cowBiomes);
        addSpawn(EntityMobCow3.class, ConfigHandler.getEntityMobCow3SpawnProb(), 2, 4, cowBiomes);
        addSpawn(EntityMobCow4.class, ConfigHandler.getEntityMobCow4SpawnProb(), 2, 4, cowBiomes);
        addSpawn(EntityMobCow5.class, ConfigHandler.getEntityMobCow5SpawnProb(), 2, 4, cowBiomes);
        addSpawn(EntityMobCow6.class, ConfigHandler.getEntityMobCow6SpawnProb(), 2, 4, cowBiomes);
        addSpawn(EntityMobCow7.class, ConfigHandler.getEntityMobCow7SpawnProb(), 2, 4, cowBiomes);
        addSpawn(EntityMobCow8.class, ConfigHandler.getEntityMobCow8SpawnProb(), 2, 4, cowBiomes);
        addSpawn(EntityMobCow9.class, ConfigHandler.getEntityMobCow9SpawnProb(), 2, 4, cowBiomes);
        addSpawn(EntityMobCow10.class, ConfigHandler.getEntityMobCow10SpawnProb(), 2, 4, cowBiomes);

        addSpawn(EntityMobChicken1.class, ConfigHandler.getEntityMobChicken1SpawnProb(), 2, 4, chickenBiomes);
        addSpawn(EntityMobChicken2.class, ConfigHandler.getEntityMobChicken2SpawnProb(), 2, 4, chickenBiomes);
        addSpawn(EntityMobChicken3.class, ConfigHandler.getEntityMobChicken3SpawnProb(), 2, 4, chickenBiomes);
        addSpawn(EntityMobChicken4.class, ConfigHandler.getEntityMobChicken4SpawnProb(), 2, 4, chickenBiomes);
        addSpawn(EntityMobChicken5.class, ConfigHandler.getEntityMobChicken5SpawnProb(), 2, 4, chickenBiomes);
        addSpawn(EntityMobChicken6.class, ConfigHandler.getEntityMobChicken6SpawnProb(), 2, 4, chickenBiomes);
        addSpawn(EntityMobChicken7.class, ConfigHandler.getEntityMobChicken7SpawnProb(), 2, 4, chickenBiomes);
        addSpawn(EntityMobChicken8.class, ConfigHandler.getEntityMobChicken8SpawnProb(), 2, 4, chickenBiomes);
        addSpawn(EntityMobChicken9.class, ConfigHandler.getEntityMobChicken9SpawnProb(), 2, 4, chickenBiomes);
        addSpawn(EntityMobChicken10.class, ConfigHandler.getEntityMobChicken10SpawnProb(), 2, 4, chickenBiomes);

        addSpawn(EntityMobPig1.class, ConfigHandler.getEntityMobPig1SpawnProb(), 2, 4, pigBiomes);
        addSpawn(EntityMobPig2.class, ConfigHandler.getEntityMobPig2SpawnProb(), 2, 4, pigBiomes);
        addSpawn(EntityMobPig3.class, ConfigHandler.getEntityMobPig3SpawnProb(), 2, 4, pigBiomes);
        addSpawn(EntityMobPig4.class, ConfigHandler.getEntityMobPig4SpawnProb(), 2, 4, pigBiomes);
        addSpawn(EntityMobPig5.class, ConfigHandler.getEntityMobPig5SpawnProb(), 2, 4, pigBiomes);
        addSpawn(EntityMobPig6.class, ConfigHandler.getEntityMobPig6SpawnProb(), 2, 4, pigBiomes);
       addSpawn(EntityMobPig7.class, ConfigHandler.getEntityMobPig7SpawnProb(), 2, 4, pigBiomes);
        addSpawn(EntityMobPig8.class, ConfigHandler.getEntityMobPig8SpawnProb(), 2, 4, pigBiomes);
        addSpawn(EntityMobPig9.class, ConfigHandler.getEntityMobPig9SpawnProb(), 2, 4, pigBiomes);
        addSpawn(EntityMobPig10.class, ConfigHandler.getEntityMobPig10SpawnProb(), 2, 4, pigBiomes);

        addSpawn(EntityMobSheep1.class, ConfigHandler.getEntityMobSheep1SpawnProb(), 2, 4, sheepBiomes);
        addSpawn(EntityMobSheep2.class, ConfigHandler.getEntityMobSheep2SpawnProb(), 2, 4, sheepBiomes);
        addSpawn(EntityMobSheep3.class, ConfigHandler.getEntityMobSheep3SpawnProb(), 2, 4, sheepBiomes);
        addSpawn(EntityMobSheep4.class, ConfigHandler.getEntityMobSheep4SpawnProb(), 2, 4, sheepBiomes);
        addSpawn(EntityMobSheep5.class, ConfigHandler.getEntityMobSheep5SpawnProb(), 2, 4, sheepBiomes);
        addSpawn(EntityMobSheep6.class, ConfigHandler.getEntityMobSheep6SpawnProb(), 2, 4, sheepBiomes);
        addSpawn(EntityMobSheep7.class, ConfigHandler.getEntityMobSheep7SpawnProb(), 2, 4, sheepBiomes);
        addSpawn(EntityMobSheep8.class, ConfigHandler.getEntityMobSheep8SpawnProb(), 2, 4, sheepBiomes);
        addSpawn(EntityMobSheep9.class, ConfigHandler.getEntityMobSheep9SpawnProb(), 2, 4, sheepBiomes);
        addSpawn(EntityMobSheep10.class, ConfigHandler.getEntityMobSheep10SpawnProb(), 2, 4, sheepBiomes);

        

        
       
        
        
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
        
        
        
        ///biome poetinit
        public static void registerBiome(BaseBiome biome, boolean isSpawnBiome){
     	   GameRegistry.register(biome);
     	   BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(biome, 50));
     	   if (isSpawnBiome)
     	        BiomeManager.addSpawnBiome(biome);
     	   
     	   
     	   
        }
	@SidedProxy(clientSide="betteragriculture.ClientProxy", serverSide="betteragriculture.ServerProxy")
	public static CommonProxy proxy;



	
}
