package com.knoxhack.betteragriculture;

import com.knoxhack.betteragriculture.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTabMain extends CreativeTabs
{
    public CreativeTabMain()
    {
        super(Main.MODID);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ModItems.roastDuckBreast);
    }

}