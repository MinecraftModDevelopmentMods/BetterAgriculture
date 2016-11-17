package betteragriculture;


import betteragriculture.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabBetterAgriculture extends CreativeTabs {
    
    public CreativeTabBetterAgriculture() {
        
        super("betteragriculture");
    }

	@Override
	public ItemStack getTabIconItem() {
		
		return ItemStack.field_190927_a;
	

}}