package com.knoxhack.betteragriculture.entities.chicken;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.world.World;



public class EntityMobChicken1 extends EntityChicken
{

	public EntityMobChicken1(World worldIn) {
		super(worldIn);
	}

	@Override
    public EntityMobChicken1 createChild(EntityAgeable ageable)
    {
		
		
		
        return new EntityMobChicken1(this.world);
    }
	

	
	
}