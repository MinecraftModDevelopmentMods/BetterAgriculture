package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobPig2;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobPig2 extends RenderLiving<EntityMobPig2>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/pig2.png");

	public RenderEntityMobPig2(RenderManager renderManager)
	{
		super(renderManager, new ModelPig(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobPig2 entity)
	{
		return textures;
	}
}