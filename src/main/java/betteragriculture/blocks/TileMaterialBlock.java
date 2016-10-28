package betteragriculture.blocks;

import java.util.List;

import betteragriculture.CreativeTabBetterAgriculture;
import betteragriculture.Main;
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

public class TileMaterialBlock<MovingObjectPosition> extends Block implements IMetaBlockName {

	
	public static final PropertyEnum<MaterialEnum> MATERIAL = PropertyEnum.create("material", MaterialEnum.class);

	public TileMaterialBlock(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
	    this.setCreativeTab(Main.tab);
		this.setHardness(hardness);
		this.setResistance(resistance);
	    this.setDefaultState(this.blockState.getBaseState().withProperty(MATERIAL, MaterialEnum.CLAY));

	}

	public TileMaterialBlock(String unlocalizedName, float hardness, float resistance) {
		this(unlocalizedName, Material.ROCK, hardness, resistance);
	}

	public TileMaterialBlock(String unlocalizedName, Material rock,Class<ItemBlockMeta> class1, Block whitesidingBlock, int i, int j) {
		this(unlocalizedName, 2.0f, 10.0f);
	}





@Override
protected BlockStateContainer createBlockState() {
    return new BlockStateContainer(this, new IProperty[] { MATERIAL });
}



@Override
public IBlockState getStateFromMeta(int meta) {


if (meta == 0)
return getDefaultState().withProperty(MATERIAL,MaterialEnum.CLAY);
else if (meta == 1)
return getDefaultState().withProperty(MATERIAL,MaterialEnum.CONCRETE);
else if (meta == 2)
return getDefaultState().withProperty(MATERIAL,MaterialEnum.QUARTZ);
else 
return getDefaultState().withProperty(MATERIAL,MaterialEnum.SLATE);
}



@Override
public int getMetaFromState(IBlockState state) {
	MaterialEnum type = (MaterialEnum) state.getValue(MATERIAL);
    return type.getID();




}

@Override
public int damageDropped(IBlockState state) {
    return getMetaFromState(state);
}

public String getSpecialName(ItemStack stack) {
	if (stack.getItemDamage() == 0)
		return "clay";
	if (stack.getItemDamage() == 1)
		return "concrete";
	if (stack.getItemDamage() == 2)
		return "quarts";
	else
		return "slate";

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


}

public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list) {
    list.add(new ItemStack(itemIn, 1, 0)); //Meta 0
    list.add(new ItemStack(itemIn, 1, 1)); //Meta 1
    list.add(new ItemStack(itemIn, 1, 2)); //Meta 2
    list.add(new ItemStack(itemIn, 1, 3)); //Meta 3
}
}