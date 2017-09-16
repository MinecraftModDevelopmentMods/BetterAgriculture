package com.knoxhack.betteragriculture.client.render;

import com.knoxhack.betteragriculture.entities.pig.EntityMobPig8;

import net.minecraft.client.model.ModelPig;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobPig8 extends RenderLiving<EntityMobPig8>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/pig8.png");

	public RenderEntityMobPig8(RenderManager renderManager)
	{
		super(renderManager, new ModelPig(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobPig8 entity)
	{
		return textures;
	}
}