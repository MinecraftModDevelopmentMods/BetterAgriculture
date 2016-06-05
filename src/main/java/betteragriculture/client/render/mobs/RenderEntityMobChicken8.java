package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobChicken8;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class RenderEntityMobChicken8 extends RenderLiving<EntityMobChicken8>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/chicken8.png");

	public RenderEntityMobChicken8(RenderManager renderManager)
	{
		super(renderManager, new ModelChicken(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobChicken8 entity)
	{
		return textures;
	}
	
	
    protected float handleRotationFloat(EntityMobChicken8 livingBase, float partialTicks)
    {
        float f = livingBase.oFlap + (livingBase.oFlap) * partialTicks;
        float f1 = livingBase.oFlapSpeed + (livingBase.destPos - livingBase.oFlapSpeed) * partialTicks;
        return (MathHelper.sin(f) + 1.0F) * f1;
    }
	
	
	
}