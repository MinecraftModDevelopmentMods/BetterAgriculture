package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobCow6;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobCow6 extends RenderLiving<EntityMobCow6>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/cow6.png");

	public RenderEntityMobCow6(RenderManager renderManager)
	{
		super(renderManager, new ModelCow(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobCow6 entity)
	{
		return textures;
	}
}