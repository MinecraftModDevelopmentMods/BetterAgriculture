package betteragriculture.items;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;

public class ArmorFarmerOutfit extends ArmorBase {

	public ArmorFarmerOutfit(ArmorMaterial material, EntityEquipmentSlot slot) {
		super(material, material.getDamageReductionAmount(slot), slot);
		if (slot == EntityEquipmentSlot.HEAD)
			setUnlocalizedName( "betteragriculture.armorfarmeroutfit.helmet");
		if (slot == EntityEquipmentSlot.CHEST)
			setUnlocalizedName( "betteragriculture.armorfarmeroutfit.chestplate");
		if (slot == EntityEquipmentSlot.LEGS)
			setUnlocalizedName( "betteragriculture.armorfarmeroutfit.leggings");
		if (slot == EntityEquipmentSlot.FEET)
			setUnlocalizedName( "betteragriculture.armorfarmeroutfit.boots");
	}

	@Override
	public String getArmorTexture(ItemStack itemStack, Entity entity, EntityEquipmentSlot slot, String layer)
	{
		if(armorType == EntityEquipmentSlot.LEGS)
		{
			return "betteragriculture:textures/armor/Farmer_layer_2.png";
		}
		return "betteragriculture:textures/armor/Farmer2_layer_1.png";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
