package betteragriculture;



import betteragriculture.items.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeTabBetterAgriculture extends CreativeTabs {
    
    public CreativeTabBetterAgriculture() {
        
        super("betteragriculture");
    }
    
	@Override
	public ItemStack getIconItemStack() {
	     return new ItemStack(CommonProxy.itemtilecolorBlock);	}
    

	
	
    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getTabIconItem() {
        return getIconItemStack();
    }
	
}