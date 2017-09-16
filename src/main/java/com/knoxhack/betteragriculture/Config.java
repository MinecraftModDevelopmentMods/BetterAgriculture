package com.knoxhack.betteragriculture;

import com.knoxhack.betteragriculture.proxy.CommonProxy;

import net.minecraftforge.common.config.Configuration;

public class Config {

    private static final String CATEGORY_GENERAL = "general";
    private static final String CATEGORY_MOBS = "mobs";
    private static final String CATEGORY_SPAWNING = "spawning";

    public static boolean enabledSlateGen= true;
    public static boolean enabledChickens= true;
    public static boolean enabledCows= true;
    public static boolean enabledSheep= true;
    public static boolean enabledPigs= true;

    //Spawning    
    public static int chickensSpawnRate = 50;
    public static int chickensSpawnRateMin = 0;
    public static int chickensSpawnRateMax = 100;
    public static int chickensSpawnMinGroup = 3;
    public static int chickensSpawnMinGroupMin = 0;
    public static int chickensSpawnMinGroupMax = 10;
    public static int chickensSpawnMaxGroup = 5;
    public static int chickensSpawnMaxGroupMin = 0;
    public static int chickensSpawnMaxGroupMax = 10;

    
    //Spawning    
    public static int cowsSpawnRate = 50;
    public static int cowsSpawnRateMin = 0;
    public static int cowsSpawnRateMax = 100;
    public static int cowsSpawnMinGroup = 3;
    public static int cowsSpawnMinGroupMin = 0;
    public static int cowsSpawnMinGroupMax = 10;
    public static int cowsSpawnMaxGroup = 5;
    public static int cowsSpawnMaxGroupMin = 0;
    public static int cowsSpawnMaxGroupMax = 10;

    //Spawning    
    public static int sheepSpawnRate = 50;
    public static int sheepSpawnRateMin = 0;
    public static int sheepSpawnRateMax = 100;
    public static int sheepSpawnMinGroup = 3;
    public static int sheepSpawnMinGroupMin = 0;
    public static int sheepSpawnMinGroupMax = 10;
    public static int sheepSpawnMaxGroup = 5;
    public static int sheepSpawnMaxGroupMin = 0;
    public static int sheepSpawnMaxGroupMax = 10;

    //Spawning    
    public static int pigsSpawnRate = 50;
    public static int pigsSpawnRateMin = 0;
    public static int pigsSpawnRateMax = 100;
    public static int pigsSpawnMinGroup = 3;
    public static int pigsSpawnMinGroupMin = 0;
    public static int pigsSpawnMinGroupMax = 10;
    public static int pigsSpawnMaxGroup = 5;
    public static int pigsSpawnMaxGroupMin = 0;
    public static int pigsSpawnMaxGroupMax = 10;

    public static void readConfig() {
        Configuration cfg = CommonProxy.config;
        try {
            cfg.load();
            initGeneralConfig(cfg);
            initMobsConfig(cfg);
            initMobsSpawningConfig(cfg);
        } catch (Exception e1) {
        	
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }

    private static void initGeneralConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General configuration");
        enabledSlateGen = cfg.getBoolean("enableSlateGen", CATEGORY_GENERAL, enabledSlateGen, "Set to false to disabled Stale gen");
    }

    private static void initMobsConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(CATEGORY_MOBS, "Mobs configuration");
        enabledChickens = cfg.getBoolean("enableChickens", CATEGORY_MOBS, enabledChickens, "Set to false to disabled Chickens");
        enabledCows = cfg.getBoolean("enabledCows", CATEGORY_MOBS, enabledCows, "Set to false to disabled Cows");
        enabledSheep = cfg.getBoolean("enabledSheep", CATEGORY_MOBS, enabledSheep, "Set to false to disabled Sheep");
        enabledPigs = cfg.getBoolean("enabledPigs", CATEGORY_MOBS, enabledPigs, "Set to false to disabled Pigs");
    }
    
    private static void initMobsSpawningConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(CATEGORY_MOBS, "Mobs configuration");
        
        //Chickens
        chickensSpawnRate = cfg.getInt("chickens-mobs-spawn-rate", CATEGORY_SPAWNING, chickensSpawnRate, chickensSpawnRateMin, chickensSpawnRateMax, "Chickens spawn rate probability");
        chickensSpawnMinGroup = cfg.getInt("chickens-spawn-group-min", CATEGORY_SPAWNING, chickensSpawnMinGroup, chickensSpawnMinGroupMin, chickensSpawnMinGroupMax, "Minimum number of tier 1 Chickens to spawn in a group");
        chickensSpawnMaxGroup = cfg.getInt("chickens-spawn-group-max", CATEGORY_SPAWNING, chickensSpawnMaxGroup, chickensSpawnMaxGroupMin, chickensSpawnMaxGroupMax, "Maximum number of tier 1 Chickens to spawn in a group");
        //Cows
        cowsSpawnRate = cfg.getInt("cows-mobs-spawn-rate", CATEGORY_SPAWNING, cowsSpawnRate, cowsSpawnRateMin, cowsSpawnRateMax, "Cows spawn rate probability");
        cowsSpawnMinGroup = cfg.getInt("cows-spawn-group-min", CATEGORY_SPAWNING, cowsSpawnMinGroup, cowsSpawnMinGroupMin, cowsSpawnMinGroupMax, "Minimum number of Cows to spawn in a group");
        cowsSpawnMaxGroup = cfg.getInt("cows-spawn-group-max", CATEGORY_SPAWNING, cowsSpawnMaxGroup, cowsSpawnMaxGroupMin, cowsSpawnMaxGroupMax, "Maximum number of Cows to spawn in a group");
        //Sheep
        sheepSpawnRate = cfg.getInt("sheep-mobs-spawn-rate", CATEGORY_SPAWNING, sheepSpawnRate, sheepSpawnRateMin, sheepSpawnRateMax, "Sheep spawn rate probability");
        sheepSpawnMinGroup = cfg.getInt("sheep-spawn-group-min", CATEGORY_SPAWNING, sheepSpawnMinGroup, sheepSpawnMinGroupMin, sheepSpawnMinGroupMax, "Minimum number of Sheep to spawn in a group");
        sheepSpawnMaxGroup = cfg.getInt("sheep-spawn-group-max", CATEGORY_SPAWNING, sheepSpawnMaxGroup, sheepSpawnMaxGroupMin, sheepSpawnMaxGroupMax, "Maximum number of Sheep to spawn in a group");
        //Pigs
        pigsSpawnRate = cfg.getInt("pigs-mobs-spawn-rate", CATEGORY_SPAWNING, pigsSpawnRate, pigsSpawnMinGroupMin, pigsSpawnRateMax, "Pigs spawn rate probability");
        pigsSpawnMinGroup = cfg.getInt("pigs-spawn-group-min", CATEGORY_SPAWNING, pigsSpawnMinGroup, pigsSpawnMinGroupMin, pigsSpawnMinGroupMax, "Minimum number of Pigs to spawn in a group");
        pigsSpawnMaxGroup = cfg.getInt("pigs-spawn-group-max", CATEGORY_SPAWNING, pigsSpawnMaxGroup, pigsSpawnMaxGroupMin, pigsSpawnMaxGroupMax, "Maximum number of Pigs to spawn in a group");
    }   
}