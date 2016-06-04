package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobChicken1;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobChicken1 extends RenderLiving<EntityMobChicken1>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/chicken1.png");

	public RenderEntityMobChicken1(RenderManager renderManager)
	{
		super(renderManager, new ModelChicken(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobChicken1 entity)
	{
		return textures;
	}
}