package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobCow4;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobCow4 extends RenderLiving<EntityMobCow4>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/cow4.png");

	public RenderEntityMobCow4(RenderManager renderManager)
	{
		super(renderManager, new ModelCow(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobCow4 entity)
	{
		return textures;
	}
}