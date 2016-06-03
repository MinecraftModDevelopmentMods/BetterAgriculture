package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobCow1;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobCow1 extends RenderLiving<EntityMobCow1>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/cow2.png");

	public RenderEntityMobCow1(RenderManager renderManager)
	{
		super(renderManager, new ModelCow(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobCow1 entity)
	{
		return textures;
	}
}