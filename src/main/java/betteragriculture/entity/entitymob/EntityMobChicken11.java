package betteragriculture.entity.entitymob;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;



public class EntityMobChicken11 extends EntityChicken
{

	public EntityMobChicken11(World worldIn) {
		super(worldIn);
	}

	@Override
    public EntityMobChicken11 createChild(EntityAgeable ageable)
    {
        return new EntityMobChicken11(this.worldObj);
    }
	

	
	
}