package com.knoxhack.betteragriculture.client.render;

import com.knoxhack.betteragriculture.entities.EntityMobNpcMale;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobNpcMale extends RenderLiving<EntityMobNpcMale>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/npcmale.png");

	public RenderEntityMobNpcMale(RenderManager renderManager)
	{
		super(renderManager, new ModelBiped(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobNpcMale entity)
	{
		return textures;
	}
}