package com.knoxhack.nethermetals;

import com.knoxhack.nethermetals.client.render.blocks.BlockRenderRegister;


import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
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
