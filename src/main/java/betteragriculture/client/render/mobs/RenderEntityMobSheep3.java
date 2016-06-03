package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobSheep3;
import net.minecraft.client.model.ModelSheep1;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobSheep3 extends RenderLiving<EntityMobSheep3>
{
	private final ResourceLocation textures = new ResourceLocation("netherexpansion:textures/models/UndeadGhastly.png");

	public RenderEntityMobSheep3(RenderManager renderManager)
	{
		super(renderManager, new ModelSheep1(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobSheep3 entity)
	{
		return textures;
	}
}