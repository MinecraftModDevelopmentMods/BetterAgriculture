package betteragriculture.client.render.mobs;


import betteragriculture.client.model.ModelEntityBoss2;
import betteragriculture.entity.entityboss.EntityBoss2;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityBoss2 extends RenderLiving<EntityBoss2>
{
	private final ResourceLocation textures = new ResourceLocation("netherexpansion:textures/models/UndeadGhastly.png");

	public RenderEntityBoss2(RenderManager renderManager)
	{
		super(renderManager, new ModelEntityBoss2(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityBoss2 entity)
	{
		return textures;
	}
}