package betteragriculture.entity.entitymob;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.world.World;



public class EntityMobChicken6 extends EntityChicken
{

	public EntityMobChicken6(World worldIn) {
		super(worldIn);
	}

	@Override
    public EntityMobChicken6 createChild(EntityAgeable ageable)
    {
        return new EntityMobChicken6(this.worldObj);
    }
	

	
	
}