package betteragriculture.client.render.mobs;

import betteragriculture.client.model.ModelEntityMobSheep10Model2;
import betteragriculture.entity.entitymob.EntityMobSheep10;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobSheep10 extends RenderLiving<EntityMobSheep10>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/sheep10.png");
	public RenderEntityMobSheep10(RenderManager renderManager)
	{
		super(renderManager, new ModelEntityMobSheep10Model2(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobSheep10 entity)
	{
		return textures;
	}
}