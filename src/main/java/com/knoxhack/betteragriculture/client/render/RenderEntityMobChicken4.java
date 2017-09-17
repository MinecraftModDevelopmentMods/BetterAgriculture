package com.knoxhack.betteragriculture.client.render;

import com.knoxhack.betteragriculture.entities.chicken.EntityMobChicken4;

import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class RenderEntityMobChicken4 extends RenderLiving<EntityMobChicken4>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/chicken4.png");

	public RenderEntityMobChicken4(RenderManager renderManager)
	{
		super(renderManager, new ModelChicken(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobChicken4 entity)
	{
		return textures;
	}
	
	
    protected float handleRotationFloat(EntityMobChicken4 livingBase, float partialTicks)
    {
        float f = livingBase.oFlap + (livingBase.oFlap) * partialTicks;
        float f1 = livingBase.oFlapSpeed + (livingBase.destPos - livingBase.oFlapSpeed) * partialTicks;
        return (MathHelper.sin(f) + 1.0F) * f1;
    }
	
	
	
	
	
	
	
}