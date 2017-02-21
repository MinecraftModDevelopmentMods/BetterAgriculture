package betteragriculture;


import betteragriculture.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBetterAgriculture extends CreativeTabs {
    
    public CreativeTabBetterAgriculture() {
        
        super("betteragriculture");
    }
    
    @Override
    public Item getTabIconItem () {
        
        return ModItems.armorFarmerOutfitHelmet ;
    }
}