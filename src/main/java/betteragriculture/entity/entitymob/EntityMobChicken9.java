package betteragriculture.entity.entitymob;

import javax.annotation.Nullable;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;



public class EntityMobChicken9 extends EntityChicken
{

	public EntityMobChicken9(World worldIn) {
		super(worldIn);
	}

	@Override
    public EntityMobChicken9 createChild(EntityAgeable ageable)
    {
        return new EntityMobChicken9(this.worldObj);
    }
	

	@Nullable
	protected ResourceLocation getLootTable()
	{
	    return LootTableList.ENTITIES_COW;
	}


	
}


