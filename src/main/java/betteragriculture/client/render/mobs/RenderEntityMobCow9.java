package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobCow9;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobCow9 extends RenderLiving<EntityMobCow9>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/cow9.png");

	public RenderEntityMobCow9(RenderManager renderManager)
	{
		super(renderManager, new ModelCow(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobCow9 entity)
	{
		return textures;
	}
}