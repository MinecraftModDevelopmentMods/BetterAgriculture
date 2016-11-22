package betteragriculture.items;


import betteragriculture.CommonProxy;
import betteragriculture.Main;
import betteragriculture.blocks.BasicBlock;
import betteragriculture.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
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
	public static Item duckbreastItem;
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

	public static void createItems() {



		armorFarmerOutfitHelmet = new ArmorFarmerOutfit (ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.HEAD).setRegistryName("armorfarmeroutfit.helmet");
		GameRegistry.register(armorFarmerOutfitHelmet);

		armorFarmerOutfitChestplate = new ArmorFarmerOutfit(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.CHEST).setRegistryName("armorfarmeroutfit.chestplate");
		GameRegistry.register(armorFarmerOutfitChestplate);

		armorFarmerOutfitLeggings = new ArmorFarmerOutfit(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.LEGS).setRegistryName("armorfarmeroutfit.leggings");
		GameRegistry.register(armorFarmerOutfitLeggings);

		armorFarmerOutfitBoots = new ArmorFarmerOutfit(ItemArmor.ArmorMaterial.LEATHER, EntityEquipmentSlot.FEET).setRegistryName("armorfarmeroutfit.boots");
		GameRegistry.register(armorFarmerOutfitBoots);
		
		
		
		whitesheepskinItem = new BasicItem("white_sheep_skin");
		pigleatherItem = new BasicItem("pig_leather");
		greysheepskinItem = new BasicItem("grey_sheep_skin");
		duckfeatherItem = new BasicItem("duck_feather");
		duckeggItem = new BasicItem("duck_egg");
		duckbreastItem = new BasicItem("duck_breast");
		dicedgoatItem = new BasicItem("diced_goat");
		roastduckbreastItem = new BasicItem("roast_duck_breast");
		goatcurryItem = new BasicItem("goat_curry");
		
		slateItem = new BasicItem("slate_item");
		wireItem = new BasicItem("wire_item");

		goatmilkItem = new BasicItem("goat_milk");
		sheepmilkItem = new BasicItem("sheep_milk_item");

		
		registerItems();
	
		
	}
	public static void registerItems()  {
		
		registerItem(whitesheepskinItem,"white_sheep_skin");
		registerItem(pigleatherItem,"pig_leather");
		registerItem(greysheepskinItem,"grey_sheep_skin");
		registerItem(duckfeatherItem,"duck_feather");
		registerItem(duckeggItem,"duck_egg");
		registerItem(duckbreastItem,"duck_breast");
		registerItem(dicedgoatItem,"diced_goat");
		registerItem(roastduckbreastItem,"roast_duck_breast");
		registerItem(goatcurryItem,"goat_curry");
		registerItem(slateItem,"slate_item");
		registerItem(wireItem,"wire_item");
		registerItem(goatmilkItem,"goat_milk");
		registerItem(sheepmilkItem,"sheep_milk_item");

		
		
		
		
		
		
		
	}

	private static void registerItem(Item item, String name) {

		GameRegistry.register(item, new ResourceLocation(Main.MODID,name));

		
		
	}
	private static void registerRenders() {

    registerRender(whitesheepskinItem);
    registerRender(pigleatherItem);
    registerRender(greysheepskinItem);
    registerRender(duckfeatherItem);
    registerRender(duckeggItem);
    registerRender(duckbreastItem);
    registerRender(dicedgoatItem);
    registerRender(roastduckbreastItem);
    registerRender(goatcurryItem);
    registerRender(slateItem);
    registerRender(wireItem);
    registerRender(goatmilkItem);
    registerRender(sheepmilkItem);
		
		
	}

	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Main.MODID + ":" + item.getUnlocalizedName().substring(5),"inventory"));
		
		
	}
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
}
}

