package com.knoxhack.betteragriculture.client.render;

import com.knoxhack.betteragriculture.entities.pig.EntityMobPig4;

import net.minecraft.client.model.ModelPig;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobPig4 extends RenderLiving<EntityMobPig4>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/pig4.png");

	public RenderEntityMobPig4(RenderManager renderManager)
	{
		super(renderManager, new ModelPig(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobPig4 entity)
	{
		return textures;
	}
}