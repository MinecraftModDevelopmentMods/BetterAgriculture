package betteragriculture.items;

import betteragriculture.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BasicItem extends Item {

	public BasicItem(String unlocalizedName) {
	    super();

	    this.setUnlocalizedName(unlocalizedName);
	    this.setCreativeTab(Main.tab);
	}

}
