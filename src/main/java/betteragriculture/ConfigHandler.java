package betteragriculture;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler {

	public static Configuration config;
	private static int GhastlySpawnProb;
	static private boolean despawn;
	static private boolean randomScale;
	static private boolean followOwner;

	private static final String comments = Main.MODNAME + " Config\n Better Agriculture \n"
			+ " For Better Agriculture " + Main.VERSION;
	private static final String randomScaleComment = "Set to false to disable random scaling, default is true.";
	private static final String despawnComment = "Set to false to not despawn. default is true.";
	private static final String followOwnerComment = "Set to false to have tamed not follow owner, default is true.";
	private static final String spawnProbComment = "Spawn Probability\nSet to zero to disable spawning of this entity";
	
	private static final String biomeWeightComment = "Spawn Probability\nSet to zero to disable spawning of this entity";

	
	
	
	private static final String slateorespawnProbComment = "Spawn Probability\nSet to zero to disable ore spawning of this type";

	
	
	
	
	private static  int FarmlandBiomeWeight = 0;

	
	private static  int EntityMobCow1SpawnProb = 0;
	private static  int EntityMobCow2SpawnProb = 0;
	private static  int EntityMobCow3SpawnProb = 0;
	private static  int EntityMobCow4SpawnProb = 0;
	private static  int EntityMobCow5SpawnProb = 0;
	private static  int EntityMobCow6SpawnProb = 0;
	private static  int EntityMobCow7SpawnProb = 0;
	private static  int EntityMobCow8SpawnProb = 0;
	private static  int EntityMobCow9SpawnProb = 0;
	private static  int EntityMobCow10SpawnProb = 0;
	
	private static  int EntityMobChicken1SpawnProb = 0;
	private static  int EntityMobChicken2SpawnProb = 0;
	private static  int EntityMobChicken3SpawnProb = 0;
	private static  int EntityMobChicken4SpawnProb = 0;
	private static  int EntityMobChicken5SpawnProb = 0;
	private static  int EntityMobChicken6SpawnProb = 0;
	private static  int EntityMobChicken7SpawnProb = 0;
	private static  int EntityMobChicken8SpawnProb = 0;
	private static  int EntityMobChicken9SpawnProb = 0;
	private static  int EntityMobChicken10SpawnProb = 0;
	
	private static  int EntityMobPig1SpawnProb = 0;
	private static  int EntityMobPig2SpawnProb = 0;
	private static  int EntityMobPig3SpawnProb = 0;
	private static  int EntityMobPig4SpawnProb = 0;
	private static  int EntityMobPig5SpawnProb = 0;
	private static  int EntityMobPig6SpawnProb = 0;
	private static  int EntityMobPig7SpawnProb = 0;
	private static  int EntityMobPig8SpawnProb = 0;
	private static  int EntityMobPig9SpawnProb = 0;
	private static  int EntityMobPig10SpawnProb = 0;
	
	private static  int EntityMobSheep1SpawnProb = 0;
	private static  int EntityMobSheep2SpawnProb = 0;
	private static  int EntityMobSheep3SpawnProb = 0;
	private static  int EntityMobSheep4SpawnProb = 0;
	private static  int EntityMobSheep5SpawnProb = 0;
	private static  int EntityMobSheep6SpawnProb = 0;
	private static  int EntityMobSheep7SpawnProb = 0;
	private static  int EntityMobSheep8SpawnProb = 0;
	private static  int EntityMobSheep9SpawnProb = 0;
	private static  int EntityMobSheep10SpawnProb = 0;

	private static  int EntityMobNpcFemale1SpawnProb = 0;
	private static  int EntityMobNpcMale1SpawnProb = 0;
	
	
	private static  int SlateOreSpawnProb = 0;

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
			
	

			
			
			FarmlandBiomeWeight = config.get(Configuration.CATEGORY_GENERAL, "FarmlandBiomeWeight", 15, biomeWeightComment).getInt();


			GhastlySpawnProb = config.get(Configuration.CATEGORY_GENERAL, "GhastlySpawnProb", 10, spawnProbComment).getInt();
			EntityMobCow1SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobCow1SpawnProb", 10, spawnProbComment).getInt();
			EntityMobCow2SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobCow2SpawnProb", 10, spawnProbComment).getInt();
			EntityMobCow3SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobCow3SpawnProb", 10, spawnProbComment).getInt();
			EntityMobCow4SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobCow4SpawnProb", 10, spawnProbComment).getInt();
			EntityMobCow5SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobCow5SpawnProb", 10, spawnProbComment).getInt();
			EntityMobCow6SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobCow6SpawnProb", 10, spawnProbComment).getInt();
			EntityMobCow7SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobCow7SpawnProb", 10, spawnProbComment).getInt();
			EntityMobCow8SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobCow8SpawnProb", 10, spawnProbComment).getInt();
			EntityMobCow9SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobCow9SpawnProb", 10, spawnProbComment).getInt();
			EntityMobCow10SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobCow10SpawnProb", 10, spawnProbComment).getInt();

			EntityMobPig1SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobPig2SpawnProb", 10, spawnProbComment).getInt();
			EntityMobPig2SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobPig2SpawnProb", 10, spawnProbComment).getInt();
			EntityMobPig3SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobPig3SpawnProb", 10, spawnProbComment).getInt();
			EntityMobPig4SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobPig4SpawnProb", 10, spawnProbComment).getInt();
			EntityMobPig5SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobPig5SpawnProb", 10, spawnProbComment).getInt();
			EntityMobPig6SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobPig6SpawnProb", 10, spawnProbComment).getInt();
			EntityMobPig7SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobPig7SpawnProb", 10, spawnProbComment).getInt();
			EntityMobPig8SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobPig8SpawnProb", 10, spawnProbComment).getInt();
			EntityMobPig9SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobPig9SpawnProb", 10, spawnProbComment).getInt();
			EntityMobPig10SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobPig10SpawnProb", 10, spawnProbComment).getInt();
			
			EntityMobChicken1SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobChicken1SpawnProb", 10, spawnProbComment).getInt();
			EntityMobChicken2SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobChicken2SpawnProb", 10, spawnProbComment).getInt();
			EntityMobChicken3SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobChicken3SpawnProb", 10, spawnProbComment).getInt();
			EntityMobChicken4SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobChicken4SpawnProb", 10, spawnProbComment).getInt();
			EntityMobChicken5SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobChicken5SpawnProb", 10, spawnProbComment).getInt();
			EntityMobChicken6SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobChicken6SpawnProb", 10, spawnProbComment).getInt();
			EntityMobChicken7SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobChicken7SpawnProb", 10, spawnProbComment).getInt();
			EntityMobChicken8SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobChickne8SpawnProb", 10, spawnProbComment).getInt();
			EntityMobChicken9SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobChicken9SpawnProb", 10, spawnProbComment).getInt();
			EntityMobChicken10SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobChicken10SpawnProb", 10, spawnProbComment).getInt();
			
			EntityMobSheep1SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobSheep1SpawnProb", 10, spawnProbComment).getInt();
			EntityMobSheep2SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobSheep2SpawnProb", 10, spawnProbComment).getInt();
			EntityMobSheep3SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobSheep3SpawnProb", 10, spawnProbComment).getInt();
			EntityMobSheep4SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobSheep4SpawnProb", 10, spawnProbComment).getInt();
			EntityMobSheep5SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobSheepSpawnProb", 10, spawnProbComment).getInt();
			EntityMobSheep6SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobSheepSpawnProb", 10, spawnProbComment).getInt();
			EntityMobSheep7SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobSheep7SpawnProb", 10, spawnProbComment).getInt();
			EntityMobSheep8SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobSheep8SpawnProb", 10, spawnProbComment).getInt();
			EntityMobSheep9SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobSheep9SpawnProb", 10, spawnProbComment).getInt();
			EntityMobSheep10SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobSheep10SpawnProb", 10, spawnProbComment).getInt();
			
			
			EntityMobNpcFemale1SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobNpcFemale1SpawnProb", 10, spawnProbComment).getInt();
			EntityMobNpcMale1SpawnProb = config.get(Configuration.CATEGORY_GENERAL, "EntityMobNpcMale1SpawnProb", 10, spawnProbComment).getInt();

			SlateOreSpawnProb = config.get(Configuration.CATEGORY_GENERAL, "SlateOreSpawnProb", 10, slateorespawnProbComment).getInt();

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			config.get(Configuration.CATEGORY_GENERAL, "FarmlandBiomeWeight", 15, biomeWeightComment).getInt();

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobCow1SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobCow2SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobCow3SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobCow4SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobCow5SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobCow6SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobCow7SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobCow8SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobCow9SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobCow10SpawnProb", 10, spawnProbComment).getInt();
			
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobChicken1SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobChicken2SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobChicken3SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobChicken4SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobChicken5SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobChicken6SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobChicken7SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobChicken8SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobChicken9SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobChicken10SpawnProb", 10, spawnProbComment).getInt();
			
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobSheep1SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobSheep2SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobSheep3SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobSheepSpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobSheep5SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobSheep6SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobSheep7SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobSheep8SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobSheep9SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobSheep10SpawnProb", 10, spawnProbComment).getInt();
			
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobPig1SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobPig2SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobPig3SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobPig4SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobPig5SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobPig6SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobPig7SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobPig8SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobPig9SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobPig10SpawnProb", 10, spawnProbComment).getInt();

			config.get(Configuration.CATEGORY_GENERAL, "EnityMobNpcFemale1SpawnProb", 10, spawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "EnityMobNpcMale1SpawnProb", 10, spawnProbComment).getInt();

			config.get(Configuration.CATEGORY_GENERAL, "SlateOreSpawnProb", 10, slateorespawnProbComment).getInt();

			
			
			
			
			
			
			
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


	public static int getEntityMobCow1SpawnProb()
	{
		return EntityMobCow1SpawnProb;
		
	}


	public static int getEntityMobCow2SpawnProb()
	{
		return EntityMobCow2SpawnProb;
		
	}


	public static int getEntityMobCow3SpawnProb()
	{
		return EntityMobCow3SpawnProb;
		
	}


	public static int getEntityMobCow4SpawnProb()
	{
		return EntityMobCow4SpawnProb;
		
	}


	public static int getEntityMobCow5SpawnProb()
	{
		return EntityMobCow5SpawnProb;
		
	}


	public static int getEntityMobCow6SpawnProb()
	{
		return EntityMobCow6SpawnProb;
		
	}


	public static int getEntityMobCow7SpawnProb()
	{
		return EntityMobCow7SpawnProb;
		
	}


	public static int getEntityMobCow8SpawnProb()
	{
		return EntityMobCow8SpawnProb;
		
	}


	public static int getEntityMobCow9SpawnProb()
	{
		return EntityMobCow9SpawnProb;
		
	}


	public static int getEntityMobCow10SpawnProb()
	{
		return EntityMobCow10SpawnProb;
		
	}


	public static int getEntityMobChicken1SpawnProb()
	{
		return EntityMobChicken1SpawnProb;
		
	}


	public static int getEntityMobChicken2SpawnProb()
	{
		return EntityMobChicken2SpawnProb;
		
	}
	public static int getEntityMobChicken3SpawnProb()
	{
		return EntityMobChicken3SpawnProb;
		
	}
	public static int getEntityMobChicken4SpawnProb()
	{
		return EntityMobChicken4SpawnProb;
		
	}
	public static int getEntityMobChicken5SpawnProb()
	{
		return EntityMobChicken5SpawnProb;
		
	}
	public static int getEntityMobChicken6SpawnProb()
	{
		return EntityMobChicken6SpawnProb;
		
	}
	public static int getEntityMobChicken7SpawnProb()
	{
		return EntityMobChicken7SpawnProb;
		
	}
	public static int getEntityMobChicken8SpawnProb()
	{
		return EntityMobChicken8SpawnProb;
		
	}
	public static int getEntityMobChicken9SpawnProb()
	{
		return EntityMobChicken9SpawnProb;
		
	}
	public static int getEntityMobChicken10SpawnProb()
	{
		return EntityMobChicken10SpawnProb;
		
	}

	public static int getEntityMobPig1SpawnProb()
	{
		return EntityMobPig1SpawnProb;
		
	}

	public static int getEntityMobPig2SpawnProb()
	{
		return EntityMobPig2SpawnProb;
		
	}
	public static int getEntityMobPig3SpawnProb()
	{
		return EntityMobPig3SpawnProb;
		
	}
	public static int getEntityMobPig4SpawnProb()
	{
		return EntityMobPig4SpawnProb;
		
	}
	public static int getEntityMobPig5SpawnProb()
	{
		return EntityMobPig5SpawnProb;
		
	}
	public static int getEntityMobPig6SpawnProb()
	{
		return EntityMobPig6SpawnProb;
		
	}
	public static int getEntityMobPig7SpawnProb()
	{
		return EntityMobPig7SpawnProb;
		
	}
	public static int getEntityMobPig8SpawnProb()
	{
		return EntityMobPig8SpawnProb;
		
	}
	public static int getEntityMobPig9SpawnProb()
	{
		return EntityMobPig9SpawnProb;
		
	}
	public static int getEntityMobPig10SpawnProb()
	{
		return EntityMobPig10SpawnProb;
		
	}

	public static int getEntityMobSheep1SpawnProb()
	{
		return EntityMobSheep1SpawnProb;
		
	}

	
	public static int getEntityMobSheep2SpawnProb()
	{
		return EntityMobSheep2SpawnProb;
		
	}
	public static int getEntityMobSheep3SpawnProb()
	{
		return EntityMobSheep3SpawnProb;
		
	}
	public static int getEntityMobSheep4SpawnProb()
	{
		return EntityMobSheep4SpawnProb;
		
	}
	public static int getEntityMobSheep5SpawnProb()
	{
		return EntityMobSheep5SpawnProb;
		
	}
	public static int getEntityMobSheep6SpawnProb()
	{
		return EntityMobSheep6SpawnProb;
		
	}
	public static int getEntityMobSheep7SpawnProb()
	{
		return EntityMobSheep7SpawnProb;
		
	}
	public static int getEntityMobSheep8SpawnProb()
	{
		return EntityMobSheep8SpawnProb;
		
	}
	public static int getEntityMobSheep9SpawnProb()
	{
		return EntityMobSheep9SpawnProb;
		
	}
	public static int getEntityMobSheep10SpawnProb()
	{
		return EntityMobSheep10SpawnProb;
		
	}

	
	public static int getEntityMobNpcFemale1SpawnProb()
	{
		return EntityMobNpcFemale1SpawnProb;
		
	}
	public static int getEntityMobNpcMale1SpawnProb()
	{
		return EntityMobNpcMale1SpawnProb;
		
	}
	public static int getSlateOreSpawnProb()
	{
		return SlateOreSpawnProb;
		
	}

		public static int getFarmlandBiomeWeight()
	{
		return FarmlandBiomeWeight;
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}