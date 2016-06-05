package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobChicken7;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class RenderEntityMobChicken7 extends RenderLiving<EntityMobChicken7>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/chicken7.png");

	public RenderEntityMobChicken7(RenderManager renderManager)
	{
		super(renderManager, new ModelChicken(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobChicken7 entity)
	{
		return textures;
	}
	
    protected float handleRotationFloat(EntityMobChicken7 livingBase, float partialTicks)
    {
        float f = livingBase.oFlap + (livingBase.oFlap) * partialTicks;
        float f1 = livingBase.oFlapSpeed + (livingBase.destPos - livingBase.oFlapSpeed) * partialTicks;
        return (MathHelper.sin(f) + 1.0F) * f1;
    }
	
	
	
	
}