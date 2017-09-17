package com.knoxhack.betteragriculture.client.render;

import com.knoxhack.betteragriculture.entities.EntityMobNpcFemale1;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobNpcFemale1 extends RenderLiving<EntityMobNpcFemale1>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/npcfemale1.png");

	public RenderEntityMobNpcFemale1(RenderManager renderManager)
	{
		super(renderManager, new ModelBiped(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobNpcFemale1 entity)
	{
		return textures;
	}
}