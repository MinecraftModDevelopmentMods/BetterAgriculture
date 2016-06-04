package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobNpcMale1;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobNpcMale1 extends RenderLiving<EntityMobNpcMale1>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/npcmale1.png");

	public RenderEntityMobNpcMale1(RenderManager renderManager)
	{
		super(renderManager, new ModelBiped(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobNpcMale1 entity)
	{
		return textures;
	}
}