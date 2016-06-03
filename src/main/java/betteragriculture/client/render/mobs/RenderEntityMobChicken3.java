package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobChicken3;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobChicken3 extends RenderLiving<EntityMobChicken3>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/chicken2.png");

	public RenderEntityMobChicken3(RenderManager renderManager)
	{
		super(renderManager, new ModelChicken(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobChicken3 entity)
	{
		return textures;
	}
}