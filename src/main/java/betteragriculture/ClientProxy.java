package betteragriculture;

import betteragriculture.client.render.blocks.BlockRenderRegister;
import betteragriculture.client.render.mobs.RenderEntityMobChicken1;
import betteragriculture.client.render.mobs.RenderEntityMobChicken10;
import betteragriculture.client.render.mobs.RenderEntityMobChicken2;
import betteragriculture.client.render.mobs.RenderEntityMobChicken3;
import betteragriculture.client.render.mobs.RenderEntityMobChicken4;
import betteragriculture.client.render.mobs.RenderEntityMobChicken5;
import betteragriculture.client.render.mobs.RenderEntityMobChicken6;
import betteragriculture.client.render.mobs.RenderEntityMobChicken7;
import betteragriculture.client.render.mobs.RenderEntityMobChicken8;
import betteragriculture.client.render.mobs.RenderEntityMobChicken9;
import betteragriculture.client.render.mobs.RenderEntityMobCow1;
import betteragriculture.client.render.mobs.RenderEntityMobCow10;
import betteragriculture.client.render.mobs.RenderEntityMobCow2;
import betteragriculture.client.render.mobs.RenderEntityMobCow3;
import betteragriculture.client.render.mobs.RenderEntityMobCow4;
import betteragriculture.client.render.mobs.RenderEntityMobCow5;
import betteragriculture.client.render.mobs.RenderEntityMobCow6;
import betteragriculture.client.render.mobs.RenderEntityMobCow7;
import betteragriculture.client.render.mobs.RenderEntityMobCow8;
import betteragriculture.client.render.mobs.RenderEntityMobCow9;
import betteragriculture.client.render.mobs.RenderEntityMobPig1;
import betteragriculture.client.render.mobs.RenderEntityMobPig10;
import betteragriculture.client.render.mobs.RenderEntityMobPig2;
import betteragriculture.client.render.mobs.RenderEntityMobPig3;
import betteragriculture.client.render.mobs.RenderEntityMobPig4;
import betteragriculture.client.render.mobs.RenderEntityMobPig5;
import betteragriculture.client.render.mobs.RenderEntityMobPig6;
import betteragriculture.client.render.mobs.RenderEntityMobPig7;
import betteragriculture.client.render.mobs.RenderEntityMobPig8;
import betteragriculture.client.render.mobs.RenderEntityMobPig9;
import betteragriculture.client.render.mobs.RenderEntityMobSheep1;
import betteragriculture.client.render.mobs.RenderEntityMobSheep10;
import betteragriculture.client.render.mobs.RenderEntityMobSheep2;
import betteragriculture.client.render.mobs.RenderEntityMobSheep3;
import betteragriculture.client.render.mobs.RenderEntityMobSheep4;
import betteragriculture.client.render.mobs.RenderEntityMobSheep5;
import betteragriculture.client.render.mobs.RenderEntityMobSheep6;
import betteragriculture.client.render.mobs.RenderEntityMobSheep7;
import betteragriculture.client.render.mobs.RenderEntityMobSheep8;
import betteragriculture.client.render.mobs.RenderEntityMobSheep9;
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
import betteragriculture.entity.entitymob.EntityMobDuck1;
import betteragriculture.entity.entitymob.EntityMobDuck2;
import betteragriculture.entity.entitymob.EntityMobDuck3;
import betteragriculture.entity.entitymob.EntityMobDuck4;
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

		RenderingRegistry.registerEntityRenderingHandler(EntityMobDuck1.class, RenderEntityMobDuck1::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityMobDuck2.class, RenderEntityMobDuck2::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityMobDuck3.class, RenderEntityMobDuck3::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityMobDuck4.class, RenderEntityMobDuck4::new);

		
		
		
		
		
		
		
		

		
		
		// Regular Boss Mobs Render Registry, you can find the model registry inside the Render"Entityname" class


		
		
		
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
