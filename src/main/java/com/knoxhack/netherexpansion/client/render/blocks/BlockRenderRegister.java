package com.knoxhack.nethermetals.client.render.blocks;

import com.knoxhack.nethermetals.Main;
import com.knoxhack.nethermetals.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister {

	public static void registerBlockRenderer() {

		// Vanilla
		reg(ModBlocks.nethercoalOre);
		reg(ModBlocks.netherdiamondOre);
		reg(ModBlocks.netheremeraldOre);
		reg(ModBlocks.nethergoldOre);
		reg(ModBlocks.netherironOre);
		reg(ModBlocks.netherlapisOre);
		reg(ModBlocks.netherredstoneOre);

		// Base Metals
		reg(ModBlocks.netherantimonyOre);
		reg(ModBlocks.netherbismuthOre);
		reg(ModBlocks.nethercopperOre);
		reg(ModBlocks.netherleadOre);
		reg(ModBlocks.nethermercuryOre);
		reg(ModBlocks.nethernickelOre);
		reg(ModBlocks.netherplatinumOre);
		reg(ModBlocks.nethersilverOre);
		reg(ModBlocks.nethertinOre);
		reg(ModBlocks.netherzincOre);

		// Modern Metals
		reg(ModBlocks.netheraluminumOre);
		reg(ModBlocks.nethercadmiumOre);
		reg(ModBlocks.netherchromiumOre);
		reg(ModBlocks.netheriridiumOre);
		reg(ModBlocks.nethermagnesiumOre);
		reg(ModBlocks.nethermanganeseOre);
		reg(ModBlocks.netherosmiumOre);
		reg(ModBlocks.netherplutoniumOre);
		reg(ModBlocks.netherrutileOre);
		reg(ModBlocks.nethertantalumOre);
		reg(ModBlocks.nethertitaniumOre);
		reg(ModBlocks.nethertungstenOre);
		reg(ModBlocks.netheruraniumOre);
		reg(ModBlocks.netherzirconiumOre);
	}

	public static String modid = Main.MODID;

	public static void reg(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}
