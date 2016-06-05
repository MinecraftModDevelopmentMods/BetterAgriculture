package betteragriculture.client.render.mobs;

import betteragriculture.client.model.ModelEntityMobSheep3Model2;
import betteragriculture.client.render.mobs.layer.EntityLayerSheepWool3;
import betteragriculture.entity.entitymob.EntityMobSheep3;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobSheep3 extends RenderLiving<EntityMobSheep3>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/sheep3.png");
	public RenderEntityMobSheep3(RenderManager renderManager)
	{
		super(renderManager, new ModelEntityMobSheep3Model2(), 0);
        this.addLayer(new EntityLayerSheepWool3(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobSheep3 entity)
	{
		return textures;
	}
}