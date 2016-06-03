package betteragriculture.client.render.mobs;


import betteragriculture.client.model.ModelEntityMob3;
import betteragriculture.entity.entitymob.EntityMob3;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMob3 extends RenderLiving<EntityMob3>
{
	private final ResourceLocation textures = new ResourceLocation("netherexpansion:textures/models/UndeadGhastly.png");

	public RenderEntityMob3(RenderManager renderManager)
	{
		super(renderManager, new ModelEntityMob3(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMob3 entity)
	{
		return textures;
	}
}