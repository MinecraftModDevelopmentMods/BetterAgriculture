package betteragriculture.crafting;

import betteragriculture.blocks.ModBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModCrafting {

	public static void initCrafting() {
		// Vanilla
		GameRegistry.addSmelting(ModBlocks.nethercoalOre, new ItemStack(Blocks.COAL_ORE, 2), 1.0f);


		// Base Metals
		if(Loader.isModLoaded("basemetals")) {
//			GameRegistry.addSmelting(ModBlocks.netherantimonyOre, new ItemStack(BmBlocks.antimony_ore, 2), 1.0f);	// Not supported in BM 2.2.2

		}

		
	}
}
