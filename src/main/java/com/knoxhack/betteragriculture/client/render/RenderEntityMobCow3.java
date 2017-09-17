package com.knoxhack.betteragriculture.client.render;

import com.knoxhack.betteragriculture.entities.cow.EntityMobCow3;

import net.minecraft.client.model.ModelCow;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobCow3 extends RenderLiving<EntityMobCow3>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/cow3.png");

	public RenderEntityMobCow3(RenderManager renderManager)
	{
		super(renderManager, new ModelCow(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobCow3 entity)
	{
		return textures;
	}
}