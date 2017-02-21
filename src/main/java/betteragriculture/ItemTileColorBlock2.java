package betteragriculture;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;


public class ItemTileColorBlock2 extends ItemBlock
{

  public ItemTileColorBlock2(Block block)
  {
    super(block);
    this.setMaxDamage(0);
    this.setHasSubtypes(true);
  }

  @Override
  public int getMetadata(int metadata)
  {
    return metadata;
  }

  @Override
  public String getUnlocalizedName(ItemStack stack)
  {
    TileColorBlock2.EnumColour colour = TileColorBlock2.EnumColour.byMetadata(stack.getMetadata());
    return super.getUnlocalizedName() + "." + colour.toString();
  }
}