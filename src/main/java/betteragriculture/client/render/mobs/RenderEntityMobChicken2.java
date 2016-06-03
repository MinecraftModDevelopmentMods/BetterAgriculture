package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobChicken2;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobChicken2 extends RenderLiving<EntityMobChicken2>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/chicken2.png");

	public RenderEntityMobChicken2(RenderManager renderManager)
	{
		super(renderManager, new ModelChicken(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobChicken2 entity)
	{
		return textures;
	}
}