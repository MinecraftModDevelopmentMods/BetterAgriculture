package betteragriculture.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static Item modItem1;




	@SuppressWarnings("deprecation")
	public static void createBlocks() {

		// Vanilla
		GameRegistry.registerItem(modItem1 = new BasicItem("tutorial_item"), "tutorial_item");


	}
}


