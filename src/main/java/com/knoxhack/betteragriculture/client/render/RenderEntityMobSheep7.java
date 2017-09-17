package com.knoxhack.betteragriculture.client.render;

import com.knoxhack.betteragriculture.client.model.ModelEntityMobSheep7Model2;
import com.knoxhack.betteragriculture.client.render.layer.EntityLayerSheepWool7;
import com.knoxhack.betteragriculture.entities.sheep.EntityMobSheep7;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobSheep7 extends RenderLiving<EntityMobSheep7>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/sheep7.png");
	public RenderEntityMobSheep7(RenderManager renderManager)
	{
		super(renderManager, new ModelEntityMobSheep7Model2(), 0);
        this.addLayer(new EntityLayerSheepWool7(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobSheep7 entity)
	{
		return textures;
	}
}