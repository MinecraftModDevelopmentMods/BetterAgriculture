package com.knoxhack.betteragriculture.entities.chicken;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.world.World;



public class EntityMobChicken8 extends EntityChicken
{

	public EntityMobChicken8(World worldIn) {
		super(worldIn);
	}

	@Override
    public EntityMobChicken8 createChild(EntityAgeable ageable)
    {
        return new EntityMobChicken8(this.world);
    }
	

	
	
}