package com.knoxhack.betteragriculture.client.render;

import com.knoxhack.betteragriculture.entities.pig.EntityMobPig3;

import net.minecraft.client.model.ModelPig;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobPig3 extends RenderLiving<EntityMobPig3>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/pig3.png");

	public RenderEntityMobPig3(RenderManager renderManager)
	{
		super(renderManager, new ModelPig(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobPig3 entity)
	{
		return textures;
	}
}