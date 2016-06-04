package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobSheep1;
import net.minecraft.client.model.ModelSheep1;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobSheep1 extends RenderLiving<EntityMobSheep1>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/sheep1.png");

	public RenderEntityMobSheep1(RenderManager renderManager)
	{
		super(renderManager, new ModelSheep1(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobSheep1 entity)
	{
		return textures;
	}
}