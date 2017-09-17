package com.knoxhack.betteragriculture.entities.sheep;
import javax.annotation.Nullable;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;



public class EntityMobSheep4 extends EntitySheep
{

	public EntityMobSheep4(World worldIn) {
		super(worldIn);
	}

	@Override
    public EntityMobSheep4 createChild(EntityAgeable ageable)
    {
        return new EntityMobSheep4(this.world);
    }
	


    @Nullable
    protected ResourceLocation getLootTable()
    {
        return LootTableList.ENTITIES_SHEEP;
    }


	
}