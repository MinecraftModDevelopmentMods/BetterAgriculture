package betteragriculture.items;

import betteragriculture.CommonProxy;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static ToolMaterial toolmaterial;
	public static ArmorMaterial armormaterial;
	


	
	public static Item slateItem;
	public static Item wireItem;
	public static Item helmetItem;
	public static Item chestplateItem;
	public static Item leggingsItem;
	public static Item bootsItem;

	public static CommonProxy proxy;
	
	public static ItemArmor armorHelm, armorChest, armorLegs, armorBoots;
	
	
	
	

	
	
	

	@SuppressWarnings("deprecation")
	public static void createItems() {

		// Vanilla
		GameRegistry.registerItem(slateItem = new BasicItem("slate_item"), "slate_item");
		GameRegistry.registerItem(wireItem = new BasicItem("wire_item"), "wire_item");
		GameRegistry.registerItem(helmetItem = new BasicItem("helmet_item"), "helmet_item");
		GameRegistry.registerItem(chestplateItem = new BasicItem("chestplate_item"), "chestplate_item");
		GameRegistry.registerItem(leggingsItem = new BasicItem("leggings_item"), "leggings_item");
		GameRegistry.registerItem(bootsItem = new BasicItem("boots_item"), "boots_item");


		
	}

	
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {



}
}

