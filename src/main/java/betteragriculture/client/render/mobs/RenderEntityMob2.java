package betteragriculture.client.render.mobs;



import betteragriculture.client.model.ModelEntityMob2;
import betteragriculture.entity.entitymob.EntityMob2;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMob2 extends RenderLiving<EntityMob2>
{
	private final ResourceLocation textures = new ResourceLocation("netherexpansion:textures/models/UndeadGhastly.png");

	public RenderEntityMob2(RenderManager renderManager)
	{
		super(renderManager, new ModelEntityMob2(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMob2 entity)
	{
		return textures;
	}
}