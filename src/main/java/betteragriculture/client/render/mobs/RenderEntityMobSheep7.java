package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobSheep7;
import net.minecraft.client.model.ModelSheep1;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobSheep7 extends RenderLiving<EntityMobSheep7>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/sheep7.png");

	public RenderEntityMobSheep7(RenderManager renderManager)
	{
		super(renderManager, new ModelSheep1(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobSheep7 entity)
	{
		return textures;
	}
}