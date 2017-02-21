package betteragriculture.entity.entitymob;
import javax.annotation.Nullable;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootTableList;



public class EntityMobSheep3 extends EntitySheep
{

	public EntityMobSheep3(World worldIn) {
		super(worldIn);
	}

	@Override
    public EntityMobSheep3 createChild(EntityAgeable ageable)
    {
        return new EntityMobSheep3(this.worldObj);
    }
	


    @Nullable
    protected ResourceLocation getLootTable()
    {
        return LootTableList.ENTITIES_SHEEP;
    }


	
}