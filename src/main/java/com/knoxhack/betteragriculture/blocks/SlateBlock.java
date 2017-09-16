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
        super(Material.ROCK);
        setUnlocalizedName(Main.MODID + ".slate");
        setRegistryName("slate");   
        setCreativeTab(Main.creativeTab);
    }
    
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }    
}