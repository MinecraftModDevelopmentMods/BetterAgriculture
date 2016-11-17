package betteragriculture.registry;

import java.util.LinkedList;

import betteragriculture.ConfigHandler;
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
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MobSpawning {

	
    public static FarmlandBiome farmlandBiome;

	public static void registerMobSpawn() {
	
		
		
		  BiomeDictionary.registerAllBiomes();
		  MobSpawning.info("*** Checking for monitor biomes");
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

		private static void info(String string) {
		// TODO Auto-generated method stub
		
	}

		private static Biome[] getBiomes(Type... types) {
          LinkedList<Biome> list = new LinkedList<Biome>();
          for (Type t : types) {
              Biome[] biomes = BiomeDictionary.getBiomesForType(t);
              for (Biome bgb : biomes) {
                  if (BiomeDictionary.isBiomeOfType(bgb, Type.END) || BiomeDictionary.isBiomeOfType(bgb, Type.NETHER)) {
                      continue;
                  }
                  if (BiomeDictionary.isBiomeOfType(bgb, Type.SNOWY) || bgb.getTemperature() < 0.32F) { // exclude cold climates
//  					proxy.info("  <<< Excluding " + bgb.biomeName + " for spawning");
                      continue;
                  }
                  if (BiomeDictionary.isBiomeOfType(bgb, Type.WATER)) { // exclude ocean biomes
//  					proxy.info("  <<< Excluding " + bgb.biomeName + " for spawning");
                      continue;
                  }
                  if (!list.contains(bgb)) {
                      list.add(bgb);
                      MobSpawning.info("  >>> Adding " + bgb.getBiomeName() + " for spawning");
                  }
              }
          }
          return list.toArray(new Biome[0]);
      }
      private static void addSpawn(Class<? extends EntityLiving> entityClass, int spawnProb, int min, int max, Biome[] biomes) {
          if (spawnProb > 0) {
              EntityRegistry.addSpawn(entityClass, spawnProb, min, max, EnumCreatureType.CREATURE, biomes);
          }
	
	}

      ///biome poetinit
      public static void registerBiome(BaseBiome biome, boolean isSpawnBiome){
   	   GameRegistry.register(biome);
   	   BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(biome, ConfigHandler.getFarmlandBiomeWeight()));
   	   if (isSpawnBiome)
   	        BiomeManager.addSpawnBiome(biome);
   	   
   	   
   	   
      }
  	public static void registerMobSpawn2() {
  		
  	     farmlandBiome = new FarmlandBiome();
         registerBiome(farmlandBiome,true);
  		
  		
  		
  	}
	
	
}
