package com.knoxhack.netherexpansion.entity;

import com.knoxhack.netherexpansion.Main;

import net.minecraft.entity.EnumCreatureType;

public class MobEntityRegistry {
 
	
	public void register()
	{
	MobEntityRegistry.registerModEntity(EntityPigZombie2.class, "UndeadGhastly", getRandomID(), Main.instance(), 250, 15, true);
	MobEntityRegistry.registerEgg(EntityPigZombie2.class, 0x000000, 0x47BEE6);
	MobEntityRegistry.addSpawn(EntityPigZombie2.class, 15, 4, 10, EnumCreatureType.CREATURE);

	}

	private static void registerModEntity(Class<EntityPigZombie2> class1, String string, Object randomID,
			Object instance, int i, int j, boolean b) {
	
		
	}

	private Object getRandomID() {

		return null;
	}

	private static void addSpawn(Class<EntityPigZombie2> class1, int i, int j, int k, EnumCreatureType creature) {

		
	}

	private static void registerEgg(Class<EntityPigZombie2> class1, int i, int j) {

		
	}


}