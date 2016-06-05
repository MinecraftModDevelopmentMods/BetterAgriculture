package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobCow10;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobCow10 extends RenderLiving<EntityMobCow10>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/cow10.png");

	public RenderEntityMobCow10(RenderManager renderManager)
	{
		super(renderManager, new ModelCow(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobCow10 entity)
	{
		return textures;
	}
}