package com.knoxhack.betteragriculture.items;


import com.knoxhack.betteragriculture.Main;

import net.minecraft.item.Item;

public class ItemBase extends Item {

	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
        this.setCreativeTab(Main.creativeTab);

	}
	
	public void registerItemModel() {
		Main.proxy.registerItemRenderer(this, 0, name);
	}
	


}
    


