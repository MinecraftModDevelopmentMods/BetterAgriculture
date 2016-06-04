package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobChicken9;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobChicken9 extends RenderLiving<EntityMobChicken9>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/chicken9.png");

	public RenderEntityMobChicken9(RenderManager renderManager)
	{
		super(renderManager, new ModelChicken(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobChicken9 entity)
	{
		return textures;
	}
}