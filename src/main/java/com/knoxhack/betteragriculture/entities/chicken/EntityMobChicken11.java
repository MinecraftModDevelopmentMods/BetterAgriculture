package com.knoxhack.betteragriculture.entities.chicken;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.world.World;



public class EntityMobChicken11 extends EntityChicken
{

	public EntityMobChicken11(World worldIn) {
		super(worldIn);
	}

	@Override
    public EntityMobChicken11 createChild(EntityAgeable ageable)
    {
        return new EntityMobChicken11(this.world);
    }
	

	
	
}