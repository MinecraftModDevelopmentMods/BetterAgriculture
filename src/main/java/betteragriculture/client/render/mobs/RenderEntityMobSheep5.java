package betteragriculture.client.render.mobs;

import betteragriculture.client.model.ModelEntityMobSheep5Model2;
import betteragriculture.client.render.mobs.layer.EntityLayerSheepWool5;
import betteragriculture.entity.entitymob.EntityMobSheep5;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobSheep5 extends RenderLiving<EntityMobSheep5>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/sheep5.png");
	public RenderEntityMobSheep5(RenderManager renderManager)
	{
		super(renderManager, new ModelEntityMobSheep5Model2(), 0);
        this.addLayer(new EntityLayerSheepWool5(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobSheep5 entity)
	{
		return textures;
	}
}