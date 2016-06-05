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
        reg(ModItems.helmetItem);
        reg(ModItems.chestplateItem);
        reg(ModItems.leggingsItem);
        reg(ModItems.bootsItem);

    	
    	
    	
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.slateItem, 0, new ModelResourceLocation("betteragriculture:slate_item", "inventory"));
        
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.wireItem, 0, new ModelResourceLocation("betteragriculture:wire_item", "inventory"));
   
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.helmetItem, 0, new ModelResourceLocation("betteragriculture:helmet_item", "inventory"));
   
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.chestplateItem, 0, new ModelResourceLocation("betteragriculture:chestplate_item", "inventory"));
   
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.leggingsItem, 0, new ModelResourceLocation("betteragriculture:leggings_item", "inventory"));
   
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.bootsItem, 0, new ModelResourceLocation("betteragriculture:boots_item", "inventory"));
   

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    public static String modid = Main.MODID;

    public static void reg(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));

    }
    
    
    
    
    
    
    
    
    
    
    
    
}