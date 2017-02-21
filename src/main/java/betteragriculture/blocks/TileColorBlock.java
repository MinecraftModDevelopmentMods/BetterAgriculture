package betteragriculture.blocks;

import java.util.List;

import betteragriculture.CreativeTabBetterAgriculture;
import betteragriculture.Main;
import betteragriculture.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TileColorBlock<MovingObjectPosition> extends Block implements IMetaBlockName {

	
	public static final PropertyEnum<ColorEnum> COLOR = PropertyEnum.create("color", ColorEnum.class);

	public TileColorBlock(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
	    this.setCreativeTab(Main.tab);
		this.setHardness(hardness);
		this.setResistance(resistance);
	    this.setDefaultState(this.blockState.getBaseState().withProperty(COLOR, ColorEnum.WHITE));

	}





@Override
protected BlockStateContainer createBlockState() {
    return new BlockStateContainer(this, new IProperty[] { COLOR });
}



@Override
public IBlockState getStateFromMeta(int meta) {


if (meta == 0)
return getDefaultState().withProperty(COLOR,ColorEnum.BLUE);
else if (meta == 1)
return getDefaultState().withProperty(COLOR,ColorEnum.BROWN);
else if (meta == 2)
return getDefaultState().withProperty(COLOR,ColorEnum.CYAN);
else if (meta == 3)
return getDefaultState().withProperty(COLOR,ColorEnum.GREEN);
else if (meta == 4)
return getDefaultState().withProperty(COLOR,ColorEnum.GREY);
else if (meta == 5)
return getDefaultState().withProperty(COLOR,ColorEnum.LIGHTBLUE);
else if (meta == 6)
return getDefaultState().withProperty(COLOR,ColorEnum.LIGHTGREY);
else if (meta == 7)
return getDefaultState().withProperty(COLOR,ColorEnum.LIME);
else if (meta == 8)
return getDefaultState().withProperty(COLOR,ColorEnum.MAGENTA);
else if (meta == 9)
return getDefaultState().withProperty(COLOR,ColorEnum.ORANGE);
else if (meta == 10)
return getDefaultState().withProperty(COLOR,ColorEnum.PINK);
else if (meta == 11)
return getDefaultState().withProperty(COLOR,ColorEnum.PURPLE);
else if (meta == 12)
return getDefaultState().withProperty(COLOR,ColorEnum.RED);
else if (meta == 13)
return getDefaultState().withProperty(COLOR,ColorEnum.WHITE);
else 
return getDefaultState().withProperty(COLOR,ColorEnum.YELLOW);
}



@Override
public int getMetaFromState(IBlockState state) {
	ColorEnum type = (ColorEnum) state.getValue(COLOR);
    return type.getID();




}



@Override
public int damageDropped(IBlockState state) {
    return getMetaFromState(state);
}

public String getSpecialName(ItemStack stack) {
	if (stack.getItemDamage() == 0)
		return "blue";
	if (stack.getItemDamage() == 1)
		return "brown";
	if (stack.getItemDamage() == 2)
		return "cyan";
	if (stack.getItemDamage() == 3)
		return "green";
	if (stack.getItemDamage() == 4)
		return "grey";
	if (stack.getItemDamage() == 5)
		return "lightblue";
	if (stack.getItemDamage() == 6)
		return "lightgrey";
	if (stack.getItemDamage() == 7)
		return "lime";
	if (stack.getItemDamage() == 8)
		return "magenta";
	if (stack.getItemDamage() == 9)
		return "orange";
	if (stack.getItemDamage() == 10)
		return "pink";
	if (stack.getItemDamage() == 11)
		return "purple";
	if (stack.getItemDamage() == 12)
		return "red";
	if (stack.getItemDamage() == 13)
		return "white";
	else
		return "yellow";

}

public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos) {
    return new ItemStack(Item.getItemFromBlock(this), 1, this.getMetaFromState(world.getBlockState(pos)));
}




@SideOnly(Side.CLIENT)
public void initModel() {
    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 1, new ModelResourceLocation(getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 2, new ModelResourceLocation(getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 3, new ModelResourceLocation(getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 4, new ModelResourceLocation(getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 5, new ModelResourceLocation(getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 6, new ModelResourceLocation(getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 7, new ModelResourceLocation(getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 8, new ModelResourceLocation(getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 9, new ModelResourceLocation(getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 10, new ModelResourceLocation(getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 11, new ModelResourceLocation(getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 12, new ModelResourceLocation(getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 13, new ModelResourceLocation(getRegistryName(), "inventory"));
    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 14, new ModelResourceLocation(getRegistryName(), "inventory"));



}

public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list) {
    list.add(new ItemStack(itemIn, 1, 0)); //Meta 0
    list.add(new ItemStack(itemIn, 1, 1)); //Meta 1
    list.add(new ItemStack(itemIn, 1, 2)); //Meta 2
    list.add(new ItemStack(itemIn, 1, 3)); //Meta 3
    list.add(new ItemStack(itemIn, 1, 4)); //Meta 4
    list.add(new ItemStack(itemIn, 1, 5)); //Meta 5
    list.add(new ItemStack(itemIn, 1, 6)); //Meta 6
    list.add(new ItemStack(itemIn, 1, 7)); //Meta 7
    list.add(new ItemStack(itemIn, 1, 8)); //Meta 8
    list.add(new ItemStack(itemIn, 1, 9)); //Meta 9
    list.add(new ItemStack(itemIn, 1, 10)); //Meta 10
    list.add(new ItemStack(itemIn, 1, 11)); //Meta 11
    list.add(new ItemStack(itemIn, 1, 12)); //Meta 12
    list.add(new ItemStack(itemIn, 1, 13)); //Meta 13
    list.add(new ItemStack(itemIn, 1, 14)); //Meta 14
}
}