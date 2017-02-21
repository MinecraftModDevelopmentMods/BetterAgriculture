package betteragriculture;

import java.util.List;
import java.util.Random;

import betteragriculture.entity.entitymob.EntityMobNpcMale;
import betteragriculture.items.ModItems;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.StructureVillagePieces.PieceWeight;
import net.minecraft.world.gen.structure.StructureVillagePieces.Start;
import net.minecraft.world.gen.structure.StructureVillagePieces.Village;
import net.minecraftforge.fml.common.registry.VillagerRegistry.IVillageCreationHandler;

public class TradeHandler implements IVillageCreationHandler
{
	public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random)
	{
		switch(villager.getProfession()) {
		case 0:

			recipeList.add(new MerchantRecipe(new ItemStack(ModItems.wireItem, 2), new ItemStack(ModItems.slateItem)));
			break;

		default:
			break;
		}
	}

	@Override
	public PieceWeight getVillagePieceWeight(Random random, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getComponentClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Village buildComponent(PieceWeight villagePiece, Start startPiece, List<StructureComponent> pieces,
			Random random, int p1, int p2, int p3, EnumFacing facing, int p5) {
		// TODO Auto-generated method stub
		return null;
	}
}