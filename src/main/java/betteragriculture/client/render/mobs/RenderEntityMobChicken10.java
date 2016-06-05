package betteragriculture.client.render.mobs;

import betteragriculture.entity.entitymob.EntityMobChicken10;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

public class RenderEntityMobChicken10 extends RenderLiving<EntityMobChicken10>
{
	private final ResourceLocation textures = new ResourceLocation("betteragriculture:textures/models/chicken10.png");

	public RenderEntityMobChicken10(RenderManager renderManager)
	{
		super(renderManager, new ModelChicken(), 0);
		this.addLayer(new LayerHeldItem(this));
	}

	

	@Override
	protected ResourceLocation getEntityTexture(EntityMobChicken10 entity)
	{
		return textures;
	}
	
	
    protected float handleRotationFloat(EntityMobChicken10 livingBase, float partialTicks)
    {
        float f = livingBase.oFlap + (livingBase.oFlap) * partialTicks;
        float f1 = livingBase.oFlapSpeed + (livingBase.destPos - livingBase.oFlapSpeed) * partialTicks;
        return (MathHelper.sin(f) + 1.0F) * f1;
    }
	
	
	
	
}