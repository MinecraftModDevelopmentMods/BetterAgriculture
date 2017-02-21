package betteragriculture.entity.entitymob;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.world.World;



public class EntityMobChicken2 extends EntityChicken
{

	public EntityMobChicken2(World worldIn) {
		super(worldIn);
	}

	@Override
    public EntityMobChicken2 createChild(EntityAgeable ageable)
    {
        return new EntityMobChicken2(this.worldObj);
    }
	

	
	
}