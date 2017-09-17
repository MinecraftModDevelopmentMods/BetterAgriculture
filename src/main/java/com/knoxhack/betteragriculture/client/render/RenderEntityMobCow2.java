package com.knoxhack.betteragriculture.client.render;

import com.knoxhack.betteragriculture.entities.cow.EntityMobCow2;

import net.minecraft.client.model.ModelCow;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobCow2 extends RenderLiving<EntityMobCow2>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/cow2.png");

	public RenderEntityMobCow2(RenderManager renderManager)
	{
		super(renderManager, new ModelCow(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobCow2 entity)
	{
		return textures;
	}
}