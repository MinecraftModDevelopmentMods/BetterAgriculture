package com.knoxhack.betteragriculture.entities.cow;

import javax.annotation.Nullable;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;



public class EntityMobCow1 extends EntityCow
{

	public EntityMobCow1(World worldIn) {
		super(worldIn);
	}




    @Nullable
    protected ResourceLocation getLootTable()
    {
        return LootTableList.ENTITIES_COW;
    }

    @Override
    public boolean isBreedingItem(ItemStack stack)
    {
     
    	return stack.getItem() == Items.FLINT;
    }
    

	@Override
    public EntityMobCow2 createChild(EntityAgeable ageable)
    {
        return new EntityMobCow2(this.world);
    }
	

    
    
    
    
    
    
    
    
    
    
    
}