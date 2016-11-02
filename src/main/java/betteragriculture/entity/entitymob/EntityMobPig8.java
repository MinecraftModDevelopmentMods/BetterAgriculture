package betteragriculture.entity.entitymob;

import javax.annotation.Nullable;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;



public class EntityMobPig8 extends EntityPig
{

	public EntityMobPig8(World worldIn) {
		super(worldIn);
	}

	@Override
    public EntityMobPig8 createChild(EntityAgeable ageable)
    {
        return new EntityMobPig8(this.worldObj);
    }
	


    @Nullable
    protected ResourceLocation getLootTable()
    {
        return LootTableList.ENTITIES_PIG;
    }


	
}