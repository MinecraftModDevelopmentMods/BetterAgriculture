package com.knoxhack.nethermetals.blocks;

import com.knoxhack.nethermetals.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {

	public static Block nethercoalOre;
	public static Block netherdiamondOre;
	public static Block netheremeraldOre;
	public static Block nethergoldOre;
	public static Block netherironOre;
	public static Block netherlapisOre;
	public static Block netherredstoneOre;

	public static Block netherantimonyOre;
	public static Block netherbismuthOre;
	public static Block nethercopperOre;
	public static Block netherleadOre;
	public static Block nethermercuryOre;
	public static Block nethernickelOre;
	public static Block netherplatinumOre;
	public static Block nethersilverOre;
	public static Block nethertinOre;
	public static Block netherzincOre;

	public static Block netheraluminumOre;
	public static Block nethercadmiumOre;
	public static Block netherchromiumOre;
	public static Block netheriridiumOre;
	public static Block nethermagnesiumOre;
	public static Block nethermanganeseOre;
	public static Block netherosmiumOre;
	public static Block netherplutoniumOre;
	public static Block netherrutileOre;
	public static Block nethertantalumOre;
	public static Block nethertitaniumOre;
	public static Block nethertungstenOre;
	public static Block netheruraniumOre;
	public static Block netherzirconiumOre;

	public static void createBlocks() {

		// Vanilla
		GameRegistry.registerBlock(nethercoalOre = new ModBlockOre("nether_coal_ore", Material.ROCK, ModBlocks.nethercoalOre, 1, 1), "nether_coal_ore");
		GameRegistry.registerBlock(netherdiamondOre = new ModBlockOre3("nether_diamond_ore", Material.ROCK, ModBlocks.netherdiamondOre, 1, 1), "nether_diamond_ore");
		GameRegistry.registerBlock(netheremeraldOre = new ModBlockOre("nether_emerald_ore", Material.ROCK, ModBlocks.netheremeraldOre, 1, 1), "nether_emerald_ore");
		GameRegistry.registerBlock(nethergoldOre = new ModBlockOre2("nether_gold_ore", Material.ROCK, ModBlocks.nethergoldOre, 1, 1), "nether_gold_ore");
		GameRegistry.registerBlock(netherironOre = new ModBlockOre("nether_iron_ore", Material.ROCK, ModBlocks.netherironOre, 1, 1), "nether_iron_ore");
		GameRegistry.registerBlock(netherlapisOre = new ModBlockOre("nether_lapis_ore", Material.ROCK, ModBlocks.netherlapisOre, 1, 1), "nether_lapis_ore");
		GameRegistry.registerBlock(netherredstoneOre = new ModBlockOre("nether_redstone_ore", Material.ROCK, ModBlocks.netherredstoneOre, 1, 1), "nether_redstone_ore");

		// Base Metals
		GameRegistry.registerBlock(netherantimonyOre = new ModBlockOre("nether_antimony_ore", Material.ROCK, ModBlocks.netherantimonyOre, 1, 1), "nether_antimony_ore");
		GameRegistry.registerBlock(netherbismuthOre = new ModBlockOre("nether_bismuth_ore", Material.ROCK, ModBlocks.netherbismuthOre, 1, 1), "nether_bismuth_ore");
		GameRegistry.registerBlock(nethercopperOre = new ModBlockOre("nether_copper_ore", Material.ROCK, ModBlocks.nethercopperOre, 1, 1), "nether_copper_ore");
		GameRegistry.registerBlock(netherleadOre = new ModBlockOre("nether_lead_ore", Material.ROCK, ModBlocks.netherleadOre, 1, 1), "nether_lead_ore");
		GameRegistry.registerBlock(nethermercuryOre = new ModBlockOre("nether_mercury_ore", Material.ROCK, ModBlocks.nethermercuryOre, 1, 1), "nether_mercury_ore");
		GameRegistry.registerBlock(nethernickelOre = new ModBlockOre("nether_nickel_ore", Material.ROCK, ModBlocks.nethernickelOre, 1, 1), "nether_nickel_ore");
		GameRegistry.registerBlock(netherplatinumOre = new ModBlockOre("nether_platinum_ore", Material.ROCK, ModBlocks.netherplatinumOre, 1, 1), "nether_platinum_ore");
		GameRegistry.registerBlock(nethersilverOre = new ModBlockOre2("nether_silver_ore", Material.ROCK, ModBlocks.nethersilverOre, 1, 1), "nether_silver_ore");
		GameRegistry.registerBlock(nethertinOre = new ModBlockOre("nether_tin_ore", Material.ROCK, ModBlocks.nethertinOre, 1, 1), "nether_tin_ore");
		GameRegistry.registerBlock(netherzincOre = new ModBlockOre("nether_zinc_ore", Material.ROCK, ModBlocks.netherzincOre, 1, 1), "nether_zinc_ore");

		// Modern Metals
		GameRegistry.registerBlock(netheraluminumOre = new ModBlockOre("nether_aluminum_ore", Material.ROCK, ModBlocks.netheraluminumOre, 1, 1), "nether_aluminum_ore");
		GameRegistry.registerBlock(nethercadmiumOre = new ModBlockOre("nether_cadmium_ore", Material.ROCK, ModBlocks.nethercadmiumOre, 1, 1), "nether_cadmium_ore");
		GameRegistry.registerBlock(netherchromiumOre = new ModBlockOre("nether_chromium_ore", Material.ROCK, ModBlocks.netherchromiumOre, 1, 1), "nether_chromium_ore");
		GameRegistry.registerBlock(netheriridiumOre = new ModBlockOre("nether_iridium_ore", Material.ROCK, ModBlocks.netheriridiumOre, 1, 1), "nether_iridium_ore");
		GameRegistry.registerBlock(nethermagnesiumOre = new ModBlockOre("nether_magnesium_ore", Material.ROCK, ModBlocks.nethermagnesiumOre, 1, 1), "nether_magnesium_ore");
		GameRegistry.registerBlock(nethermanganeseOre = new ModBlockOre("nether_manganese_ore", Material.ROCK, ModBlocks.nethermanganeseOre, 1, 1), "nether_manganese_ore");
		GameRegistry.registerBlock(netherosmiumOre = new ModBlockOre("nether_osmium_ore", Material.ROCK, ModBlocks.netherosmiumOre, 1, 1), "nether_osmium_ore");
		GameRegistry.registerBlock(netherplutoniumOre = new ModBlockOre("nether_plutonium_ore", Material.ROCK, ModBlocks.netherplutoniumOre, 1, 1), "nether_plutonium_ore");
		GameRegistry.registerBlock(netherrutileOre = new ModBlockOre("nether_rutile_ore", Material.ROCK, ModBlocks.netherrutileOre, 1, 1), "nether_rutile_ore");
		GameRegistry.registerBlock(nethertantalumOre = new ModBlockOre("nether_tantalum_ore", Material.ROCK, ModBlocks.nethertantalumOre, 1, 1), "nether_tantalum_ore");
		GameRegistry.registerBlock(nethertitaniumOre = new ModBlockOre("nether_titanium_ore", Material.ROCK, ModBlocks.nethertitaniumOre, 1, 1), "nether_titanium_ore");
		GameRegistry.registerBlock(nethertungstenOre = new ModBlockOre("nether_tungsten_ore", Material.ROCK, ModBlocks.nethertungstenOre, 1, 1), "nether_tungsten_ore");
		GameRegistry.registerBlock(netheruraniumOre = new ModBlockOre("nether_uranium_ore", Material.ROCK, ModBlocks.netheruraniumOre, 1, 1), "nether_uranium_ore");
		GameRegistry.registerBlock(netherzirconiumOre = new ModBlockOre("nether_zirconium_ore", Material.ROCK, ModBlocks.netherzirconiumOre, 1, 1), "nether_zirconium_ore");
	}
}
