package com.knoxhack.betteragriculture.client.render;


import com.knoxhack.betteragriculture.client.model.ModelEntityMobSheep2Model2;
import com.knoxhack.betteragriculture.client.render.layer.EntityLayerSheepWool2;
import com.knoxhack.betteragriculture.entities.sheep.EntityMobSheep2;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobSheep2 extends RenderLiving<EntityMobSheep2>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/sheep2.png");

	public RenderEntityMobSheep2(RenderManager renderManager)
	{
		
		
		//Model Registry   "ModelSheep1= Vanilla Minecraft Sheep 1 model"
		super(renderManager, new ModelEntityMobSheep2Model2(), 0);
        this.addLayer(new EntityLayerSheepWool2(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobSheep2 entity)
	{
		return textures;
	}
}