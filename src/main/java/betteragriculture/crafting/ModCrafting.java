package betteragriculture.crafting;

import betteragriculture.blocks.ModBlocks;
import betteragriculture.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModCrafting {

	public static void initCrafting() {

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.concreteBlock, 6), new Object[] {Blocks.SAND, Blocks.STONE,Items.WATER_BUCKET});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.rooftileBlock, 2), new Object[] {ModItems.slateItem, ModItems.slateItem,ModItems.slateItem,ModItems.slateItem});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.wireItem, 6), new Object[] {Items.GOLD_NUGGET});
		
		
		//armor
		GameRegistry.addRecipe(new ItemStack(ModItems.armorFarmerOutfitHelmet, 1), new Object[] {"#B#", "# #", "   ", '#', new ItemStack(Blocks.WOOL, 1, 0), 'B', Items.LEATHER});
		GameRegistry.addRecipe(new ItemStack(ModItems.armorFarmerOutfitChestplate, 1), new Object[] {"# #", "#B#", "###", '#', new ItemStack(Blocks.WOOL, 1, 0), 'B', Items.LEATHER});
		GameRegistry.addRecipe(new ItemStack(ModItems.armorFarmerOutfitLeggings, 1), new Object[] {"#B#", "# #", "# #", '#', new ItemStack(Blocks.WOOL, 1, 0), 'B', Items.LEATHER});
		GameRegistry.addRecipe(new ItemStack(ModItems.armorFarmerOutfitBoots, 1), new Object[] {"   ", "# #", "#B#", '#', new ItemStack(Blocks.WOOL, 1, 0), 'B', Items.LEATHER});

		
		
		
		
		
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.redsidingBlock, 8), new Object[] {"###", "#B#", "###", '#', Blocks.PLANKS, 'B', new ItemStack(Items.DYE, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.whitesidingBlock, 8), new Object[] {"###", "#B#", "###", '#', Blocks.PLANKS, 'B', new ItemStack(Items.DYE, 1, 15)});

		GameRegistry.addRecipe(new ItemStack(ModBlocks.accaciatroughBlock, 4), new Object[] {"# #", "#B#", "###", '#',  new ItemStack(Blocks.PLANKS, 1, 4), 'B',Items.WATER_BUCKET});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.birchroughBlock, 4), new Object[] {"# #", "#B#", "###", '#',  new ItemStack(Blocks.PLANKS, 1, 2), 'B',Items.WATER_BUCKET});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.darkoaktroughBlock, 4), new Object[] {"# #", "#B#", "###", '#',  new ItemStack(Blocks.PLANKS, 1, 5), 'B',Items.WATER_BUCKET});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.jungletroughBlock, 4), new Object[] {"# #", "#B#", "###", '#',  new ItemStack(Blocks.PLANKS, 1, 3), 'B',Items.WATER_BUCKET});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.oaktroughBlock, 4), new Object[] {"# #", "#B#", "###", '#',  new ItemStack(Blocks.PLANKS, 1, 0), 'B',Items.WATER_BUCKET});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.sprucetroughBlock, 4), new Object[] {"# #", "#B#", "###", '#',  new ItemStack(Blocks.PLANKS, 1, 1), 'B',Items.WATER_BUCKET});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.stonetroughBlock, 4), new Object[] {"# #", "#B#", "###", '#',  Blocks.STONE, 'B',Items.WATER_BUCKET});

		GameRegistry.addRecipe(new ItemStack(ModBlocks.barnroofBlock, 8), new Object[] {"###", "#B#", "###", '#', Blocks.PLANKS, 'B', new ItemStack(Items.DYE, 1, 2)});	
	}
}
