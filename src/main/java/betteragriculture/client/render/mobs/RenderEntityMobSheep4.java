package betteragriculture.client.render.mobs;

import betteragriculture.client.model.ModelEntityMobSheep4Model2;
import betteragriculture.client.render.mobs.layer.EntityLayerSheepWool4;
import betteragriculture.entity.entitymob.EntityMobSheep4;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobSheep4 extends RenderLiving<EntityMobSheep4>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/sheep4.png");
	public RenderEntityMobSheep4(RenderManager renderManager)
	{
		super(renderManager, new ModelEntityMobSheep4Model2(), 0);
        this.addLayer(new EntityLayerSheepWool4(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobSheep4 entity)
	{
		return textures;
	}
}