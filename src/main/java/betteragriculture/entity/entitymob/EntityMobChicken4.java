package betteragriculture.entity.entitymob;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.world.World;



public class EntityMobChicken4 extends EntityChicken
{

	public EntityMobChicken4(World worldIn) {
		super(worldIn);
	}

	@Override
    public EntityMobChicken4 createChild(EntityAgeable ageable)
    {
        return new EntityMobChicken4(this.worldObj);
    }
	

	
	
}