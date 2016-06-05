package betteragriculture.client.render.mobs;

import betteragriculture.client.model.ModelEntityMobSheep7Model2;
import betteragriculture.client.render.mobs.layer.EntityLayerSheepWool7;
import betteragriculture.entity.entitymob.EntityMobSheep7;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobSheep7 extends RenderLiving<EntityMobSheep7>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/sheep7.png");
	public RenderEntityMobSheep7(RenderManager renderManager)
	{
		super(renderManager, new ModelEntityMobSheep7Model2(), 0);
        this.addLayer(new EntityLayerSheepWool7(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobSheep7 entity)
	{
		return textures;
	}
}