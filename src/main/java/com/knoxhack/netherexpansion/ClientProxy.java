package com.knoxhack.netherexpansion;


import com.knoxhack.netherexpansion.client.render.blocks.BlockRenderRegister;
import com.knoxhack.netherexpansion.client.render.mobs.RenderUndeadGhastly;
import com.knoxhack.netherexpansion.entity.UndeadGhastly;

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
		RenderManager rm = Minecraft.getMinecraft().getRenderManager();
		RenderingRegistry.registerEntityRenderingHandler(UndeadGhastly.class, RenderUndeadGhastly::new);

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
