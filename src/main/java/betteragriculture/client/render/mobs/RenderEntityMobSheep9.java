package betteragriculture.client.render.mobs;

import betteragriculture.client.model.ModelEntityMobSheep9Model2;
import betteragriculture.client.render.mobs.layer.EntityLayerSheepWool9;
import betteragriculture.entity.entitymob.EntityMobSheep9;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobSheep9 extends RenderLiving<EntityMobSheep9>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/sheep9.png");
	public RenderEntityMobSheep9(RenderManager renderManager)
	{
		super(renderManager, new ModelEntityMobSheep9Model2(), 0);
        this.addLayer(new EntityLayerSheepWool9(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobSheep9 entity)
	{
		return textures;
	}
}