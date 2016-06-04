package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobPig9;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobPig9 extends RenderLiving<EntityMobPig9>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/pig9.png");

	public RenderEntityMobPig9(RenderManager renderManager)
	{
		super(renderManager, new ModelPig(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobPig9 entity)
	{
		return textures;
	}
}