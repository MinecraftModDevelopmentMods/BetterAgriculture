package com.knoxhack.betteragriculture.init;

import net.minecraftforge.oredict.OreDictionary;

public class Recipes {
	
    public static void init()
    {
        addOreRegistration();
        addSmeltingRecipes();
    }
	
	
	
	public static void addSmeltingRecipes() {

		//GameRegistry.addSmelting(ModItems.metallicOre, new ItemStack(Items.metallicIngot), 0.7f);
	}

    public static void addOreRegistration()
    {
        OreDictionary.registerOre("leather", ModItems.pigLeather);
        OreDictionary.registerOre("leather", ModItems.greySheepSkin);
        OreDictionary.registerOre("leather", ModItems.whiteSheepSkin);
        OreDictionary.registerOre("feather", ModItems.duckFeather);
 

    }

}         
