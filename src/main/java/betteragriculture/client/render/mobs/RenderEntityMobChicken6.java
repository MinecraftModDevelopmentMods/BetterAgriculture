package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobChicken6;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobChicken6 extends RenderLiving<EntityMobChicken6>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/chicken6.png");

	public RenderEntityMobChicken6(RenderManager renderManager)
	{
		super(renderManager, new ModelChicken(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobChicken6 entity)
	{
		return textures;
	}
}