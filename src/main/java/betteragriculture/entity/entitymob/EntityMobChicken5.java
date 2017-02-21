package betteragriculture.entity.entitymob;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.world.World;



public class EntityMobChicken5 extends EntityChicken
{

	public EntityMobChicken5(World worldIn) {
		super(worldIn);
	}

	@Override
    public EntityMobChicken5 createChild(EntityAgeable ageable)
    {
        return new EntityMobChicken5(this.worldObj);
    }
	

	
	
}