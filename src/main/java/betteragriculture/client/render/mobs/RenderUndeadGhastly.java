package betteragriculture.client.render.mobs;


import betteragriculture.client.model.ModelUndeadGhastly;
import betteragriculture.entity.entitymob.UndeadGhastly;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderUndeadGhastly extends RenderLiving<UndeadGhastly>
{
	private final ResourceLocation textures = new ResourceLocation("netherexpansion:textures/models/UndeadGhastly.png");

	public RenderUndeadGhastly(RenderManager renderManager)
	{
		super(renderManager, new ModelUndeadGhastly(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(UndeadGhastly entity)
	{
		return textures;
	}
}