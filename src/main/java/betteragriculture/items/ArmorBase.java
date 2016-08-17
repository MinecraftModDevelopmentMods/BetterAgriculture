package betteragriculture.items;


import betteragriculture.Main;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor {

	public ArmorBase(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setMaxStackSize(1);
        setCreativeTab(Main.tab);	
	}

	@Override public boolean isRepairable()
	{
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
