package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobCow7;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobCow7 extends RenderLiving<EntityMobCow7>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/cow7.png");

	public RenderEntityMobCow7(RenderManager renderManager)
	{
		super(renderManager, new ModelCow(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobCow7 entity)
	{
		return textures;
	}
}