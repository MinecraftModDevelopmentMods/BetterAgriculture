package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobPig7;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobPig7 extends RenderLiving<EntityMobPig7>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/pig7.png");

	public RenderEntityMobPig7(RenderManager renderManager)
	{
		super(renderManager, new ModelPig(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobPig7 entity)
	{
		return textures;
	}
}