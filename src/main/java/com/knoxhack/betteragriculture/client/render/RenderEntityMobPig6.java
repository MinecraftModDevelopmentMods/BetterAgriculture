package com.knoxhack.betteragriculture.client.render;

import com.knoxhack.betteragriculture.entities.pig.EntityMobPig6;

import net.minecraft.client.model.ModelPig;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobPig6 extends RenderLiving<EntityMobPig6>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/pig6.png");

	public RenderEntityMobPig6(RenderManager renderManager)
	{
		super(renderManager, new ModelPig(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobPig6 entity)
	{
		return textures;
	}
}