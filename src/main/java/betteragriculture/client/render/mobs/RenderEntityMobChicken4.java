package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobChicken4;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobChicken4 extends RenderLiving<EntityMobChicken4>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/chicken4.png");

	public RenderEntityMobChicken4(RenderManager renderManager)
	{
		super(renderManager, new ModelChicken(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobChicken4 entity)
	{
		return textures;
	}
}