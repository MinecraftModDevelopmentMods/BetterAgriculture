package com.knoxhack.betteragriculture.blocks;

import com.knoxhack.betteragriculture.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockBase extends Block {
	public BlockBase(final Material material, final MapColor mapColor, final String blockName) {
		super(material, mapColor);
		setBlockName(this, blockName);
		setCreativeTab(Main.creativeTab);
	}

	public BlockBase(final Material materialIn, final String blockName) {
		this(materialIn, materialIn.getMaterialMapColor(), blockName);
	}

	public static void setBlockName(final Block block, final String blockName) {
		block.setRegistryName(Main.MODID, blockName);
		block.setUnlocalizedName(block.getRegistryName().toString());
	}
}