package com.knoxhack.netherexpansion;


import com.knoxhack.netherexpansion.client.render.blocks.BlockRenderRegister;
import com.knoxhack.netherexpansion.client.render.mobs.RenderEntityBoss1;
import com.knoxhack.netherexpansion.client.render.mobs.RenderEntityBoss2;
import com.knoxhack.netherexpansion.client.render.mobs.RenderEntityMob2;
import com.knoxhack.netherexpansion.client.render.mobs.RenderEntityMob3;
import com.knoxhack.netherexpansion.client.render.mobs.RenderUndeadGhastly;
import com.knoxhack.netherexpansion.entity.entityboss.EntityBoss1;
import com.knoxhack.netherexpansion.entity.entityboss.EntityBoss2;
import com.knoxhack.netherexpansion.entity.entitymob.EntityMob2;
import com.knoxhack.netherexpansion.entity.entitymob.EntityMob3;
import com.knoxhack.netherexpansion.entity.entitymob.UndeadGhastly;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {




	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
//Render mobs
		@SuppressWarnings("unused")
		
		
		// Render Manager
		RenderManager rm = Minecraft.getMinecraft().getRenderManager();
		
		
		// Regular Mobs Render Registry, you can find the model registry inside the Render"Entityname" class
		RenderingRegistry.registerEntityRenderingHandler(UndeadGhastly.class, RenderUndeadGhastly::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityMob2.class, RenderEntityMob2::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityMob3.class, RenderEntityMob3::new);
		
		
		// Regular Boss Mobs Render Registry, you can find the model registry inside the Render"Entityname" class
		RenderingRegistry.registerEntityRenderingHandler(EntityBoss1.class, RenderEntityBoss1::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityBoss2.class, RenderEntityBoss2::new);


		
		
		
	}


	

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		



		BlockRenderRegister.registerBlockRenderer();
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
}
