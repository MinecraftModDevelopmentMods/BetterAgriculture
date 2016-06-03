package betteragriculture.client.render.mobs;

import betteragriculture.client.model.ModelEntityBoss1;
import betteragriculture.client.model.ModelUndeadGhastly;
import betteragriculture.entity.entityboss.EntityBoss1;
import betteragriculture.entity.entitymob.UndeadGhastly;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobChicken5 extends RenderLiving<EntityBoss1>
{
	private final ResourceLocation textures = new ResourceLocation("netherexpansion:textures/models/UndeadGhastly.png");

	public RenderEntityMobChicken5(RenderManager renderManager)
	{
		super(renderManager, new ModelEntityBoss1(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityBoss1 entity)
	{
		return textures;
	}
}