package betteragriculture.client.render.mobs;

import betteragriculture.client.model.ModelEntityMobSheep8Model2;
import betteragriculture.entity.entitymob.EntityMobSheep8;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobSheep8 extends RenderLiving<EntityMobSheep8>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/sheep8.png");
	public RenderEntityMobSheep8(RenderManager renderManager)
	{
		super(renderManager, new ModelEntityMobSheep8Model2(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobSheep8 entity)
	{
		return textures;
	}
}