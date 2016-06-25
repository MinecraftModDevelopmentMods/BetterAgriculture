package betteragriculture.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemModArmor extends ItemArmor {

	public ItemModArmor(ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorType) {
		super(material, renderIndex, armorType);
		
		switch(armorType) {
		case HEAD: setUnlocalizedName("helmetItem"); break;
		case CHEST: setUnlocalizedName("chestplateItem"); break;
		case LEGS: setUnlocalizedName("leggingsItem"); break;
		case FEET: setUnlocalizedName("bootsItem"); break;
		case MAINHAND:
			break;
		case OFFHAND:
			break;
		default:
			break;
		}
		
		setCreativeTab(CreativeTabs.MATERIALS);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(slot == 0 || slot == 1 || slot == 3) {
			return "betteragriculture:textures/items/Farmer2_layer_1.png";
		} else if(slot == 2) {
			return "betteragriculture:textures/items/Farmer_layer_2.png";
		} else {
			return null;
		}
	}

}
