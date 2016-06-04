package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobCow8;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobCow8 extends RenderLiving<EntityMobCow8>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/cow8.png");

	public RenderEntityMobCow8(RenderManager renderManager)
	{
		super(renderManager, new ModelCow(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobCow8 entity)
	{
		return textures;
	}
}