package com.knoxhack.betteragriculture.entities.pig;

import javax.annotation.Nullable;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;



public class EntityMobPig3 extends EntityPig
{

	public EntityMobPig3(World worldIn) {
		super(worldIn);
	}

	@Override
    public EntityMobPig3 createChild(EntityAgeable ageable)
    {
        return new EntityMobPig3(this.world);
    }
	


    @Nullable
    protected ResourceLocation getLootTable()
    {
        return LootTableList.ENTITIES_PIG;
    }


	
}