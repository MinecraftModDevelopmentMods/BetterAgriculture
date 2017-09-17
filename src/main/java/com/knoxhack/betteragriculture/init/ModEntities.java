package com.knoxhack.betteragriculture.init;

import com.knoxhack.betteragriculture.Config;
import com.knoxhack.betteragriculture.Main;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobChicken1;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobChicken10;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobChicken2;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobChicken3;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobChicken4;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobChicken5;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobChicken6;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobChicken7;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobChicken8;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobChicken9;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobCow1;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobCow10;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobCow2;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobCow3;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobCow4;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobCow5;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobCow6;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobCow7;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobCow8;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobCow9;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobPig1;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobPig10;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobPig2;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobPig3;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobPig4;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobPig5;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobPig6;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobPig7;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobPig8;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobPig9;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobSheep1;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobSheep10;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobSheep2;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobSheep3;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobSheep4;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobSheep5;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobSheep6;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobSheep7;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobSheep8;
import com.knoxhack.betteragriculture.client.render.RenderEntityMobSheep9;
import com.knoxhack.betteragriculture.entities.chicken.EntityMobChicken1;
import com.knoxhack.betteragriculture.entities.chicken.EntityMobChicken10;
import com.knoxhack.betteragriculture.entities.chicken.EntityMobChicken2;
import com.knoxhack.betteragriculture.entities.chicken.EntityMobChicken3;
import com.knoxhack.betteragriculture.entities.chicken.EntityMobChicken4;
import com.knoxhack.betteragriculture.entities.chicken.EntityMobChicken5;
import com.knoxhack.betteragriculture.entities.chicken.EntityMobChicken6;
import com.knoxhack.betteragriculture.entities.chicken.EntityMobChicken7;
import com.knoxhack.betteragriculture.entities.chicken.EntityMobChicken8;
import com.knoxhack.betteragriculture.entities.chicken.EntityMobChicken9;
import com.knoxhack.betteragriculture.entities.cow.EntityMobCow1;
import com.knoxhack.betteragriculture.entities.cow.EntityMobCow10;
import com.knoxhack.betteragriculture.entities.cow.EntityMobCow2;
import com.knoxhack.betteragriculture.entities.cow.EntityMobCow3;
import com.knoxhack.betteragriculture.entities.cow.EntityMobCow4;
import com.knoxhack.betteragriculture.entities.cow.EntityMobCow5;
import com.knoxhack.betteragriculture.entities.cow.EntityMobCow6;
import com.knoxhack.betteragriculture.entities.cow.EntityMobCow7;
import com.knoxhack.betteragriculture.entities.cow.EntityMobCow8;
import com.knoxhack.betteragriculture.entities.cow.EntityMobCow9;
import com.knoxhack.betteragriculture.entities.pig.EntityMobPig1;
import com.knoxhack.betteragriculture.entities.pig.EntityMobPig10;
import com.knoxhack.betteragriculture.entities.pig.EntityMobPig2;
import com.knoxhack.betteragriculture.entities.pig.EntityMobPig3;
import com.knoxhack.betteragriculture.entities.pig.EntityMobPig4;
import com.knoxhack.betteragriculture.entities.pig.EntityMobPig5;
import com.knoxhack.betteragriculture.entities.pig.EntityMobPig6;
import com.knoxhack.betteragriculture.entities.pig.EntityMobPig7;
import com.knoxhack.betteragriculture.entities.pig.EntityMobPig8;
import com.knoxhack.betteragriculture.entities.pig.EntityMobPig9;
import com.knoxhack.betteragriculture.entities.sheep.EntityMobSheep1;
import com.knoxhack.betteragriculture.entities.sheep.EntityMobSheep10;
import com.knoxhack.betteragriculture.entities.sheep.EntityMobSheep2;
import com.knoxhack.betteragriculture.entities.sheep.EntityMobSheep3;
import com.knoxhack.betteragriculture.entities.sheep.EntityMobSheep4;
import com.knoxhack.betteragriculture.entities.sheep.EntityMobSheep5;
import com.knoxhack.betteragriculture.entities.sheep.EntityMobSheep6;
import com.knoxhack.betteragriculture.entities.sheep.EntityMobSheep7;
import com.knoxhack.betteragriculture.entities.sheep.EntityMobSheep8;
import com.knoxhack.betteragriculture.entities.sheep.EntityMobSheep9;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {

    public static void init() {
    	
        int id = 1;
        
        if (Config.enabledChickens) {
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Chicken1"), EntityMobChicken1.class, "Chicken1", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Chicken2"), EntityMobChicken2.class, "Chicken2", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Chicken3"), EntityMobChicken3.class, "Chicken3", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Chicken4"), EntityMobChicken4.class, "Chicken4", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Chicken5"), EntityMobChicken5.class, "Chicken5", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Chicken6"), EntityMobChicken6.class, "Chicken6", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Chicken7"), EntityMobChicken7.class, "Chicken7", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Chicken8"), EntityMobChicken8.class, "Chicken8", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Chicken9"), EntityMobChicken9.class, "Chicken9", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Chicken10"), EntityMobChicken10.class, "Chicken10", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);

        //Spawning Registry Chicken
        EntityRegistry.addSpawn(EntityMobChicken1.class, Config.chickensSpawnRate, Config.chickensSpawnMinGroup, Config.chickensSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST, Biomes.JUNGLE);
        EntityRegistry.addSpawn(EntityMobChicken2.class, Config.chickensSpawnRate, Config.chickensSpawnMinGroup, Config.chickensSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST, Biomes.JUNGLE);
        EntityRegistry.addSpawn(EntityMobChicken3.class, Config.chickensSpawnRate, Config.chickensSpawnMinGroup, Config.chickensSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST, Biomes.JUNGLE);
        EntityRegistry.addSpawn(EntityMobChicken4.class, Config.chickensSpawnRate, Config.chickensSpawnMinGroup, Config.chickensSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST, Biomes.JUNGLE);
        EntityRegistry.addSpawn(EntityMobChicken5.class, Config.chickensSpawnRate, Config.chickensSpawnMinGroup, Config.chickensSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST, Biomes.JUNGLE);
        EntityRegistry.addSpawn(EntityMobChicken6.class, Config.chickensSpawnRate, Config.chickensSpawnMinGroup, Config.chickensSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST, Biomes.JUNGLE);
        EntityRegistry.addSpawn(EntityMobChicken7.class, Config.chickensSpawnRate, Config.chickensSpawnMinGroup, Config.chickensSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST, Biomes.JUNGLE);
        EntityRegistry.addSpawn(EntityMobChicken8.class, Config.chickensSpawnRate, Config.chickensSpawnMinGroup, Config.chickensSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST, Biomes.JUNGLE);
        EntityRegistry.addSpawn(EntityMobChicken9.class, Config.chickensSpawnRate, Config.chickensSpawnMinGroup, Config.chickensSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST, Biomes.JUNGLE);
        EntityRegistry.addSpawn(EntityMobChicken10.class, Config.chickensSpawnRate, Config.chickensSpawnMinGroup, Config.chickensSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST, Biomes.JUNGLE);
        }
        
        if (Config.enabledCows) {
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Cow1"), EntityMobCow1.class, "Cow1", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Cow2"), EntityMobCow2.class, "Cow2", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Cow3"), EntityMobCow3.class, "Cow3", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Cow4"), EntityMobCow4.class, "Cow4", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Cow5"), EntityMobCow5.class, "Cow5", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Cow6"), EntityMobCow6.class, "Cow6", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Cow7"), EntityMobCow7.class, "Cow7", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Cow8"), EntityMobCow8.class, "Cow8", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Cow9"), EntityMobCow9.class, "Cow9", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Cow10"), EntityMobCow10.class, "Cow10", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        
        //Spawning Registry Cow
        EntityRegistry.addSpawn(EntityMobCow1.class, Config.cowsSpawnRate, Config.cowsSpawnMinGroup,Config.cowsSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST);
        EntityRegistry.addSpawn(EntityMobCow2.class, Config.cowsSpawnRate, Config.cowsSpawnMinGroup,Config.cowsSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST);
        EntityRegistry.addSpawn(EntityMobCow3.class, Config.cowsSpawnRate, Config.cowsSpawnMinGroup,Config.cowsSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST);
        EntityRegistry.addSpawn(EntityMobCow4.class, Config.cowsSpawnRate, Config.cowsSpawnMinGroup,Config.cowsSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST);
        EntityRegistry.addSpawn(EntityMobCow5.class, Config.cowsSpawnRate, Config.cowsSpawnMinGroup,Config.cowsSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST);
        EntityRegistry.addSpawn(EntityMobCow6.class, Config.cowsSpawnRate, Config.cowsSpawnMinGroup,Config.cowsSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST);
        EntityRegistry.addSpawn(EntityMobCow7.class, Config.cowsSpawnRate, Config.cowsSpawnMinGroup,Config.cowsSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST);
        EntityRegistry.addSpawn(EntityMobCow8.class, Config.cowsSpawnRate, Config.cowsSpawnMinGroup,Config.cowsSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST);
        EntityRegistry.addSpawn(EntityMobCow9.class, Config.cowsSpawnRate, Config.cowsSpawnMinGroup,Config.cowsSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST);
        EntityRegistry.addSpawn(EntityMobCow10.class, Config.cowsSpawnRate, Config.cowsSpawnMinGroup,Config.cowsSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST);
        }
        
        //Registry Sheep
        if (Config.enabledSheep) {
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Sheep1"), EntityMobSheep1.class, "Sheep1", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Sheep2"), EntityMobSheep2.class, "Sheep2", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Sheep3"), EntityMobSheep3.class, "Sheep3", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Sheep4"), EntityMobSheep4.class, "Sheep4", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Sheep5"), EntityMobSheep5.class, "Sheep5", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Sheep6"), EntityMobSheep6.class, "Sheep6", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Sheep7"), EntityMobSheep7.class, "Sheep7", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Sheep8"), EntityMobSheep8.class, "Sheep8", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Sheep9"), EntityMobSheep9.class, "Sheep9", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Sheep10"), EntityMobSheep10.class, "Sheep10", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);

        //Spawning Registry Sheep
        EntityRegistry.addSpawn(EntityMobSheep1.class, Config.sheepSpawnRate, Config.sheepSpawnMinGroup, Config.sheepSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST);
        EntityRegistry.addSpawn(EntityMobSheep2.class, Config.sheepSpawnRate, Config.sheepSpawnMinGroup, Config.sheepSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST);
        EntityRegistry.addSpawn(EntityMobSheep3.class, Config.sheepSpawnRate, Config.sheepSpawnMinGroup, Config.sheepSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST);
        EntityRegistry.addSpawn(EntityMobSheep4.class, Config.sheepSpawnRate, Config.sheepSpawnMinGroup, Config.sheepSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST);
        EntityRegistry.addSpawn(EntityMobSheep5.class, Config.sheepSpawnRate, Config.sheepSpawnMinGroup, Config.sheepSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST);
        EntityRegistry.addSpawn(EntityMobSheep6.class, Config.sheepSpawnRate, Config.sheepSpawnMinGroup, Config.sheepSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST);
        EntityRegistry.addSpawn(EntityMobSheep7.class, Config.sheepSpawnRate, Config.sheepSpawnMinGroup, Config.sheepSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST);
        EntityRegistry.addSpawn(EntityMobSheep8.class, Config.sheepSpawnRate, Config.sheepSpawnMinGroup, Config.sheepSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST);
        EntityRegistry.addSpawn(EntityMobSheep9.class, Config.sheepSpawnRate, Config.sheepSpawnMinGroup, Config.sheepSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST);
        EntityRegistry.addSpawn(EntityMobSheep10.class, Config.sheepSpawnRate, Config.sheepSpawnMinGroup, Config.sheepSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST);

        }
        //Registry Pig
        if (Config.enabledPigs) {
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Pig1"), EntityMobPig1.class, "Pig1", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Pig2"), EntityMobPig2.class, "Pig2", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Pig3"), EntityMobPig3.class, "Pig3", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Pig4"), EntityMobPig4.class, "Pig4", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Pig5"), EntityMobPig5.class, "Pig5", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Pig6"), EntityMobPig6.class, "Pig6", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Pig7"), EntityMobPig7.class, "Pig7", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Pig8"), EntityMobPig8.class, "Pig8", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Pig9"), EntityMobPig9.class, "Pig9", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.registerModEntity (new ResourceLocation(Main.MODID, "Pig10"), EntityMobPig10.class, "Pig 10", id++, Main.instance, 64, 3, true, 0x996600, 0x00ff00);
       
        //Spawning Registry Pig
        EntityRegistry.addSpawn(EntityMobPig1.class, Config.pigsSpawnRate, Config.pigsSpawnMinGroup, Config.pigsSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST, Biomes.SWAMPLAND);
        EntityRegistry.addSpawn(EntityMobPig2.class, Config.pigsSpawnRate, Config.pigsSpawnMinGroup, Config.pigsSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST, Biomes.SWAMPLAND);
        EntityRegistry.addSpawn(EntityMobPig3.class, Config.pigsSpawnRate, Config.pigsSpawnMinGroup, Config.pigsSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST, Biomes.SWAMPLAND);
        EntityRegistry.addSpawn(EntityMobPig4.class, Config.pigsSpawnRate, Config.pigsSpawnMinGroup, Config.pigsSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST, Biomes.SWAMPLAND);
        EntityRegistry.addSpawn(EntityMobPig5.class, Config.pigsSpawnRate, Config.pigsSpawnMinGroup, Config.pigsSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST, Biomes.SWAMPLAND);
        EntityRegistry.addSpawn(EntityMobPig6.class, Config.pigsSpawnRate, Config.pigsSpawnMinGroup, Config.pigsSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST, Biomes.SWAMPLAND);
        EntityRegistry.addSpawn(EntityMobPig7.class, Config.pigsSpawnRate, Config.pigsSpawnMinGroup, Config.pigsSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST, Biomes.SWAMPLAND);
        EntityRegistry.addSpawn(EntityMobPig8.class, Config.pigsSpawnRate, Config.pigsSpawnMinGroup, Config.pigsSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST, Biomes.SWAMPLAND);
        EntityRegistry.addSpawn(EntityMobPig9.class, Config.pigsSpawnRate, Config.pigsSpawnMinGroup, Config.pigsSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST, Biomes.SWAMPLAND);
        EntityRegistry.addSpawn(EntityMobPig10.class, Config.pigsSpawnRate, Config.pigsSpawnMinGroup, Config.pigsSpawnMaxGroup, EnumCreatureType.CREATURE, Biomes.PLAINS, Biomes.FOREST, Biomes.SWAMPLAND);
        }
    }
        public static void initModels() {
        	
        	//Render Registry Chicken
        	if (Config.enabledChickens) {
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobChicken1.class, RenderEntityMobChicken1::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobChicken2.class, RenderEntityMobChicken2::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobChicken3.class, RenderEntityMobChicken3::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobChicken4.class, RenderEntityMobChicken4::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobChicken5.class, RenderEntityMobChicken5::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobChicken6.class, RenderEntityMobChicken6::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobChicken7.class, RenderEntityMobChicken7::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobChicken8.class, RenderEntityMobChicken8::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobChicken9.class, RenderEntityMobChicken9::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobChicken10.class, RenderEntityMobChicken10::new);
        	}
        	
        	//Render Registry Cow
        	if (Config.enabledCows) {
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobCow1.class, RenderEntityMobCow1::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobCow2.class, RenderEntityMobCow2::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobCow3.class, RenderEntityMobCow3::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobCow4.class, RenderEntityMobCow4::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobCow5.class, RenderEntityMobCow5::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobCow6.class, RenderEntityMobCow6::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobCow7.class, RenderEntityMobCow7::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobCow8.class, RenderEntityMobCow8::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobCow9.class, RenderEntityMobCow9::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobCow10.class, RenderEntityMobCow10::new);
        	}
        	
        	//Render Registry Sheep
        	if (Config.enabledSheep) {
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobSheep1.class, RenderEntityMobSheep1::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobSheep2.class, RenderEntityMobSheep2::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobSheep3.class, RenderEntityMobSheep3::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobSheep4.class, RenderEntityMobSheep4::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobSheep5.class, RenderEntityMobSheep5::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobSheep6.class, RenderEntityMobSheep6::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobSheep7.class, RenderEntityMobSheep7::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobSheep8.class, RenderEntityMobSheep8::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobSheep9.class, RenderEntityMobSheep9::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobSheep10.class, RenderEntityMobSheep10::new);
        	}
        	
        	//Render Registry Pig
        	if (Config.enabledPigs) {
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobPig1.class, RenderEntityMobPig1::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobPig2.class, RenderEntityMobPig2::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobPig3.class, RenderEntityMobPig3::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobPig4.class, RenderEntityMobPig4::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobPig5.class, RenderEntityMobPig5::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobPig6.class, RenderEntityMobPig6::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobPig7.class, RenderEntityMobPig7::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobPig8.class, RenderEntityMobPig8::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobPig9.class, RenderEntityMobPig9::new);
    		RenderingRegistry.registerEntityRenderingHandler(EntityMobPig10.class, RenderEntityMobPig10::new);
        	}
        	
        	}
     }