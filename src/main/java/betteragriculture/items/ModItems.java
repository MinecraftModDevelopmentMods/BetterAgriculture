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
	
	public static Item goatmilkItem;
	public static Item sheepmilkItem;
	public static Item whitesheepskinItem;
	public static Item pigleatherItem;
	public static Item greysheepskinItem;
	public static Item duckfeatherItem;
	public static Item duckeggItem;
	public static Item duckbreatItem;
	public static Item dicedgoatItem;
	public static Item roastduckbreastItem;
	public static Item goatcurryItem;
	
	
	
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
		GameRegistry.registerItem(goatmilkItem = new BasicItem("goat_milk"), "goat_milk");
		GameRegistry.registerItem(sheepmilkItem = new BasicItem("sheep_milk"), "sheep_milk");
		GameRegistry.registerItem(whitesheepskinItem = new BasicItem("white_sheep_skin"), "white_sheep_skin");
		GameRegistry.registerItem(pigleatherItem = new BasicItem("pig_leather"), "pig_leather");
		GameRegistry.registerItem(greysheepskinItem = new BasicItem("grey_sheep_skin"), "grey_sheep_skin");
		GameRegistry.registerItem(duckfeatherItem = new BasicItem("duck_feather"), "duck_feather");
		GameRegistry.registerItem(duckeggItem = new BasicItem("duck_egg"), "duck_egg");
		GameRegistry.registerItem(duckbreatItem = new BasicItem("duck_breat"), "duck_breat");
		GameRegistry.registerItem(dicedgoatItem = new BasicItem("diced_goat"), "diced_goat");
		GameRegistry.registerItem(roastduckbreastItem = new BasicItem("roast_duck_breast"), "roast_duck_breast");
		GameRegistry.registerItem(goatcurryItem = new BasicItem("goat_curry"), "goat_curry");
		
		
		
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

