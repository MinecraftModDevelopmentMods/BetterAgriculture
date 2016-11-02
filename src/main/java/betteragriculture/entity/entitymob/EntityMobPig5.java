package betteragriculture.entity.entitymob;

import javax.annotation.Nullable;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;



public class EntityMobPig5 extends EntityPig
{

	public EntityMobPig5(World worldIn) {
		super(worldIn);
	}

	@Override
    public EntityMobPig5 createChild(EntityAgeable ageable)
    {
        return new EntityMobPig5(this.worldObj);
    }
	


    @Nullable
    protected ResourceLocation getLootTable()
    {
        return LootTableList.ENTITIES_PIG;
    }


	
}