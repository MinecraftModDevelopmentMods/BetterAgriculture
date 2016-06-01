package com.knoxhack.netherexpansion;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler {

	public static Configuration config;
	private static int GhastlySpawnProb;
	static private boolean despawn;
	static private boolean randomScale;
	static private boolean followOwner;

	private static final String comments = Main.MODNAME + " Config\n Nether Expansion (Knoxhack)\n"
			+ " For Nether Expansion " + Main.VERSION;
	private static final String randomScaleComment = "Set to false to disable random scaling, default is true.";
	private static final String despawnComment = "Set to false to not despawn. default is true.";
	private static final String followOwnerComment = "Set to false to have tamed not follow owner, default is true.";
	private static final String spawnProbComment = "Spawn Probability\nSet to zero to disable spawning of this entity";



	public static void startConfig(FMLPreInitializationEvent event)
	{
		config = new Configuration(event.getSuggestedConfigurationFile());
		config.load(); // only need to load config once during pre initializeSoundEvents
		updateConfigInfo();
	}

	public static void updateConfigInfo()
	{
		try {
			config.addCustomCategoryComment(Configuration.CATEGORY_GENERAL, comments);

			GhastlySpawnProb = config.get(Configuration.CATEGORY_GENERAL, "GhastlySpawnProb", 10, spawnProbComment).getInt();
		
			randomScale = config.get(Configuration.CATEGORY_GENERAL, "randomScale", true, randomScaleComment).getBoolean(true);
			despawn = config.get(Configuration.CATEGORY_GENERAL, "despawn", true, despawnComment).getBoolean(true);
			followOwner = config.get(Configuration.CATEGORY_GENERAL, "followOwner", true, followOwnerComment).getBoolean(true);
		} catch (Exception e) {
			Main.proxy.info("failed to load or read the config file");
		} finally {
			if (config.hasChanged()) {
				config.save();
			}
		}
	}

	public static boolean useRandomScaling()
	{
		return randomScale;
	}

	public static boolean shouldDespawn()
	{
		return despawn;
	}

	public static boolean getFollowOwner()
	{
		return followOwner;
	}

	public static int getGhastlySpawnProb()
	{
		return GhastlySpawnProb;
	}

















}
