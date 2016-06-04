package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobSheep2;
import net.minecraft.client.model.ModelSheep1;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;

public class RenderEntityMobSheep2 extends RenderLiving<EntityMobSheep2>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/sheep2.png");

	public RenderEntityMobSheep2(RenderManager renderManager)
	{
		
		
		//Model Registry   "ModelSheep1= Vanilla Minecraft Sheep 1 model"
		super(renderManager, new ModelSheep1(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobSheep2 entity)
	{
		return textures;
	}
}