package betteragriculture.client.render.items;

import betteragriculture.Main;
import betteragriculture.items.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister {

    public static void registerItemRenderer() {
    	
        reg(ModItems.modItem1);
    	
    	
    	
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(ModItems.modItem1, 0, new ModelResourceLocation("betteragriculture:mod_item", "inventory"));
    	
    	
    }
    
    public static String modid = Main.MODID;

    public static void reg(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
        .register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
    
    
    
    
    
    
    
    
    
    
    
    
}