package com.knoxhack.betteragriculture.entities.chicken;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.world.World;



public class EntityMobChicken7 extends EntityChicken
{

	public EntityMobChicken7(World worldIn) {
		super(worldIn);
	}

	@Override
    public EntityMobChicken7 createChild(EntityAgeable ageable)
    {
        return new EntityMobChicken7(this.world);
    }
	

	
	
}