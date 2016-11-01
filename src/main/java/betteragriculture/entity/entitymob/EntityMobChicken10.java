package betteragriculture.entity.entitymob;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.world.World;



public class EntityMobChicken10 extends EntityChicken
{

	public EntityMobChicken10(World worldIn) {
		super(worldIn);
	}

	@Override
    public EntityMobChicken10 createChild(EntityAgeable ageable)
    {
        return new EntityMobChicken10(this.worldObj);
    }
	

	
	
}