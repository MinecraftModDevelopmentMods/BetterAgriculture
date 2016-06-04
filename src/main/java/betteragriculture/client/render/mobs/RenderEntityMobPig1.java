package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobPig1;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobPig1 extends RenderLiving<EntityMobPig1>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/pig1.png");

	public RenderEntityMobPig1(RenderManager renderManager)
	{
		super(renderManager, new ModelPig(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobPig1 entity)
	{
		return textures;
	}
}