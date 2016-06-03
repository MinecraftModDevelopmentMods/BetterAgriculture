package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobChicken8;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobChicken8 extends RenderLiving<EntityMobChicken8>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/chicken2.png");

	public RenderEntityMobChicken8(RenderManager renderManager)
	{
		super(renderManager, new ModelChicken(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobChicken8 entity)
	{
		return textures;
	}
}