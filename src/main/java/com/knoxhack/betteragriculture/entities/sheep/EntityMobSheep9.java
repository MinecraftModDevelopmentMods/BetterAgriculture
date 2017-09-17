package com.knoxhack.betteragriculture.entities.sheep;
import javax.annotation.Nullable;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;



public class EntityMobSheep9 extends EntitySheep
{

	public EntityMobSheep9(World worldIn) {
		super(worldIn);
	}

	@Override
    public EntityMobSheep9 createChild(EntityAgeable ageable)
    {
        return new EntityMobSheep9(this.world);
    }
	


    @Nullable
    protected ResourceLocation getLootTable()
    {
        return LootTableList.ENTITIES_SHEEP;
    }


	
}