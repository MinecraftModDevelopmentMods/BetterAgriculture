package com.knoxhack.nethermetals.crafting;

import com.knoxhack.nethermetals.blocks.ModBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModCrafting {

	public static void initCrafting() {
		// Vanilla
		GameRegistry.addSmelting(ModBlocks.nethercoalOre, new ItemStack(Blocks.COAL_ORE, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.netherdiamondOre, new ItemStack(Blocks.DIAMOND_ORE, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.netheremeraldOre, new ItemStack(Blocks.EMERALD_ORE, 2), 1.0f); 
		GameRegistry.addSmelting(ModBlocks.nethergoldOre, new ItemStack(Blocks.GOLD_ORE, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.netherironOre, new ItemStack(Blocks.IRON_ORE, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.netherlapisOre, new ItemStack(Blocks.LAPIS_ORE, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.netherredstoneOre, new ItemStack(Blocks.REDSTONE_ORE, 2), 1.0f);

		// Base Metals
		if(Loader.isModLoaded("basemetals")) {
//			GameRegistry.addSmelting(ModBlocks.netherantimonyOre, new ItemStack(BmBlocks.antimony_ore, 2), 1.0f);	// Not supported in BM 2.2.2
//			GameRegistry.addSmelting(ModBlocks.netherbismuthOre, new ItemStack(BmBlocks.bismuth_ore, 2), 1.0f);		// Not supported in BM 2.2.2
			GameRegistry.addSmelting(ModBlocks.nethercopperOre, new ItemStack(BmBlocks.copper_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.netherleadOre, new ItemStack(BmBlocks.lead_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.nethermercuryOre, new ItemStack(BmBlocks.mercury_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.nethernickelOre, new ItemStack(BmBlocks.nickel_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.netherplatinumOre, new ItemStack(BmBlocks.platinum_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.nethersilverOre, new ItemStack(BmBlocks.silver_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.nethertinOre, new ItemStack(BmBlocks.tin_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.netherzincOre, new ItemStack(BmBlocks.zinc_ore, 2), 1.0f);
		}

		// TODO: Modern Metals
		if(Loader.isModLoaded("modernmetals")) {
			GameRegistry.addSmelting(ModBlocks.netheraluminumOre, new ItemStack(MmBlocks.aluminum_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.nethercadmiumOre, new ItemStack(MmBlocks.cadmium_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.netherchromiumOre, new ItemStack(MmBlocks.chromium_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.netheriridiumOre, new ItemStack(MmBlocks.iridium_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.nethermagnesiumOre, new ItemStack(MmBlocks.magnesium_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.nethermanganeseOre, new ItemStack(MmBlocks.manganese_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.netherosmiumOre, new ItemStack(MmBlocks.osmium_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.netherplutoniumOre, new ItemStack(MmBlocks.plutonium_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.netherrutileOre, new ItemStack(MmBlocks.rutile_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.nethertantalumOre, new ItemStack(MmBlocks.tantalum_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.nethertitaniumOre, new ItemStack(MmBlocks.titanium_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.nethertungstenOre, new ItemStack(MmBlocks.tungsten_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.netheruraniumOre, new ItemStack(MmBlocks.uranium_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.netherzirconiumOre, new ItemStack(MmBlocks.zirconium_ore, 2), 1.0f);
		}
	}
}
