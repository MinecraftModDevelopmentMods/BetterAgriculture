package betteragriculture.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static Item slateItem;
	public static Item wireItem;
	public static Item helmetItem;
	public static Item chestplateItem;
	public static Item leggingsItem;
	public static Item bootsItem;


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





}


