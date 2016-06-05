package betteragriculture.crafting;

import betteragriculture.blocks.ModBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModCrafting {

	public static void initCrafting() {
		// Vanilla
		GameRegistry.addSmelting(ModBlocks.nethercoalOre, new ItemStack(Blocks.COAL_ORE, 2), 1.0f);

		
		
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.concreteBlock, 6), new Object[] {Blocks.SAND, Blocks.STONE,Items.WATER_BUCKET});

		GameRegistry.addRecipe(new ItemStack(ModBlocks.redsidingBlock, 8), new Object[] {"###", "#B#", "###", '#', Blocks.PLANKS, 'B', new ItemStack(Items.DYE, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.whitesidingBlock, 8), new Object[] {"###", "#B#", "###", '#', Blocks.PLANKS, 'B', new ItemStack(Items.DYE, 1, 15)});

		
		
		

		// Base Metals
		if(Loader.isModLoaded("basemetals")) {
//			GameRegistry.addSmelting(ModBlocks.netherantimonyOre, new ItemStack(BmBlocks.antimony_ore, 2), 1.0f);	// Not supported in BM 2.2.2

		}

		
	}
}
