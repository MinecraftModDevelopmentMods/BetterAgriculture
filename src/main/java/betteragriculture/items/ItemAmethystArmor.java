package betteragriculture.items;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemAmethystArmor extends ItemArmor {


	
	public ItemAmethystArmor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		new EmeraldArmour("amethystArmor", ArmorMaterial.GOLD, 1, EntityEquipmentSlot.CHEST);
		

	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(slot == 0 || slot == 1 || slot == 3) {
			return "betteragriculture:textures/models/armor/amethyst_layer_1.png";
		} else if(slot == 2) {
			return "betteragriculture:textures/models/armor/amethyst_layer_2.png";
		} else {
			return null;
		}
	}

}
