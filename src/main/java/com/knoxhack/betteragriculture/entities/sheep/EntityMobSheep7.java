package com.knoxhack.betteragriculture.entities.sheep;
import javax.annotation.Nullable;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;



public class EntityMobSheep7 extends EntitySheep
{

	public EntityMobSheep7(World worldIn) {
		super(worldIn);
	}

	@Override
    public EntityMobSheep7 createChild(EntityAgeable ageable)
    {
        return new EntityMobSheep7(this.world);
    }
	


    @Nullable
    protected ResourceLocation getLootTable()
    {
        return LootTableList.ENTITIES_SHEEP;
    }


	
}