package com.knoxhack.betteragriculture.entities.pig;

import javax.annotation.Nullable;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;



public class EntityMobPig1 extends EntityPig
{

	public EntityMobPig1(World worldIn) {
		super(worldIn);
	}

	@Override
    public EntityMobPig1 createChild(EntityAgeable ageable)
    {
        return new EntityMobPig1(this.world);
    }
	


    @Nullable
    protected ResourceLocation getLootTable()
    {
        return LootTableList.ENTITIES_PIG;
    }


	
}