package com.knoxhack.betteragriculture.entities.chicken;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.world.World;



public class EntityMobChicken3 extends EntityChicken
{

	public EntityMobChicken3(World worldIn) {
		super(worldIn);
	}

	@Override
    public EntityMobChicken3 createChild(EntityAgeable ageable)
    {
        return new EntityMobChicken3(this.world);
    }
	

	
	
}