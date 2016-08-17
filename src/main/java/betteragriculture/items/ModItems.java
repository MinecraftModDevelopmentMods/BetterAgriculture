package betteragriculture.items;


import betteragriculture.CommonProxy;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import betteragriculture.items.ArmorFarmerOutfit;;


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
	public static Item armorFarmerOutfitHelmet, armorFarmerOutfitChestplate, armorFarmerOutfitLeggings, armorFarmerOutfitBoots;

	@SuppressWarnings("deprecation")
	public static void createItems() {

		// Vanilla
		GameRegistry.registerItem(slateItem = new BasicItem("slate_item"), "slate_item");
		GameRegistry.registerItem(wireItem = new BasicItem("wire_item"), "wire_item");

		armorFarmerOutfitHelmet = new ArmorFarmerOutfit (ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.HEAD).setRegistryName("armorfarmeroutfit.helmet");
		GameRegistry.register(armorFarmerOutfitHelmet);

		armorFarmerOutfitChestplate = new ArmorFarmerOutfit(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.CHEST).setRegistryName("armorfarmeroutfit.chestplate");
		GameRegistry.register(armorFarmerOutfitChestplate);

		armorFarmerOutfitLeggings = new ArmorFarmerOutfit(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.LEGS).setRegistryName("armorfarmeroutfit.leggings");
		GameRegistry.register(armorFarmerOutfitLeggings);

		armorFarmerOutfitBoots = new ArmorFarmerOutfit(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.FEET).setRegistryName("armorfarmeroutfit.boots");
		GameRegistry.register(armorFarmerOutfitBoots);
		
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
}
}

