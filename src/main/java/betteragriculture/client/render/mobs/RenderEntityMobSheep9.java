package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobSheep9;
import net.minecraft.client.model.ModelSheep1;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobSheep9 extends RenderLiving<EntityMobSheep9>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/sheep9.png");

	public RenderEntityMobSheep9(RenderManager renderManager)
	{
		super(renderManager, new ModelSheep1(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobSheep9 entity)
	{
		return textures;
	}
}