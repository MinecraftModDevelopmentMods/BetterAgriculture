package betteragriculture.client.render.mobs;

import betteragriculture.client.model.ModelEntityMobSheep6Model2;
import betteragriculture.entity.entitymob.EntityMobSheep6;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobSheep6 extends RenderLiving<EntityMobSheep6>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/sheep6.png");
	public RenderEntityMobSheep6(RenderManager renderManager)
	{
		super(renderManager, new ModelEntityMobSheep6Model2(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobSheep6 entity)
	{
		return textures;
	}
}