package betteragriculture.client.render.items;

import betteragriculture.Main;
import betteragriculture.items.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister {

    public static void registerItemRenderer() {
    	
        reg(ModItems.slateItem);
        reg(ModItems.wireItem);
        
        reg(ModItems.goatmilkItem);
        reg(ModItems.sheepmilkItem);
        reg(ModItems.whitesheepskinItem);
        reg(ModItems.pigleatherItem);
        reg(ModItems.greysheepskinItem);
        reg(ModItems.duckfeatherItem);
        reg(ModItems.duckeggItem);
        reg(ModItems.duckbreatItem);
        reg(ModItems.dicedgoatItem);
        reg(ModItems.roastduckbreastItem);
        reg(ModItems.goatcurryItem);

	      
	      
	      
	      
	      
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.slateItem, 0, new ModelResourceLocation("betteragriculture:slate_item", "inventory"));
        
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.wireItem, 0, new ModelResourceLocation("betteragriculture:wire_item", "inventory"));
 
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.goatmilkItem, 0, new ModelResourceLocation("betteragriculture:goat_milk", "inventory"));
 
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.sheepmilkItem, 0, new ModelResourceLocation("betteragriculture:sheep_milk", "inventory"));
 
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.whitesheepskinItem, 0, new ModelResourceLocation("betteragriculture:white_sheep_skin", "inventory"));
 
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.pigleatherItem, 0, new ModelResourceLocation("betteragriculture:pig_leather", "inventory"));
 
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.greysheepskinItem, 0, new ModelResourceLocation("betteragriculture:grey_sheep_skin", "inventory"));
 
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.duckfeatherItem, 0, new ModelResourceLocation("betteragriculture:duck_feather", "inventory"));
 
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.duckeggItem, 0, new ModelResourceLocation("betteragriculture:duck_egg", "inventory"));
 
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.duckbreatItem, 0, new ModelResourceLocation("betteragriculture:duck_breat", "inventory"));
 
        
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.dicedgoatItem, 0, new ModelResourceLocation("betteragriculture:diced_goat", "inventory"));
 
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.roastduckbreastItem, 0, new ModelResourceLocation("betteragriculture:roast_duck_breast", "inventory"));
 
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.goatcurryItem, 0, new ModelResourceLocation("betteragriculture:goat_curry", "inventory"));
 
    }
    
    public static String modid = Main.MODID;

    public static void reg(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));

    }
    
 
}