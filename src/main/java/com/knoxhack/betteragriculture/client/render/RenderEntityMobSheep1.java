package com.knoxhack.betteragriculture.client.render;

import com.knoxhack.betteragriculture.client.model.ModelEntityMobSheep1Model2;
import com.knoxhack.betteragriculture.client.render.layer.EntityLayerSheepWool;
import com.knoxhack.betteragriculture.entities.sheep.EntityMobSheep1;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobSheep1 extends RenderLiving<EntityMobSheep1>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/sheep1.png");
	public RenderEntityMobSheep1(RenderManager renderManager)
	{
		super(renderManager, new ModelEntityMobSheep1Model2(), 0);
        this.addLayer(new EntityLayerSheepWool(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobSheep1 entity)
	{
		return textures;
	}
}