package com.knoxhack.betteragriculture.blocks;

import com.knoxhack.betteragriculture.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SlateBlock extends Block {
    public SlateBlock () {
        super(Material.IRON);
        setUnlocalizedName(Main.MODID + ".slate");
        setRegistryName("slate");   
        setCreativeTab(Main.creativeTab);
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(1.0f);
		this.setResistance(14.0f);
    }
    
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }    
}