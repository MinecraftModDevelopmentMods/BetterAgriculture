package betteragriculture;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class TileColorBlock2 extends Block
{
  public TileColorBlock2()
  {
    super(Material.ROCK);
    this.setCreativeTab(Main.tab);
  }

  @SideOnly(Side.CLIENT)
  public BlockRenderLayer getBlockLayer()
  {
    return BlockRenderLayer.SOLID;
  }


  @Override
  public EnumBlockRenderType getRenderType(IBlockState iBlockState) {
    return EnumBlockRenderType.MODEL;
  }

  public AxisAlignedBB getCollisionBoundingBox(IBlockState state, World worldIn, BlockPos pos)
  {
    return NULL_AABB;
  }

  public static final PropertyDirection PROPERTYFACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);
  public static final PropertyEnum PROPERTYCOLOUR = PropertyEnum.create("colour", EnumColour.class);

  @Override
  public int damageDropped(IBlockState state)
  {
    EnumColour enumColour = (EnumColour)state.getValue(PROPERTYCOLOUR);
    return enumColour.getMetadata();
  }

 
    
    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, NonNullList list){
        EnumColour[] allColours = EnumColour.values();
        for (EnumColour colour : allColours) {
          list.add(new ItemStack(item, 1, colour.getMetadata()));
        }
    }
    
    
    
  

  @Override
  public IBlockState getStateFromMeta(int meta)
  {
    EnumFacing facing = EnumFacing.getHorizontal(meta);
    int colourbits = (meta & 0x0c) >> 2; // 0x0c is hexadecimal, in binary 1100 - the upper two bits, corresponding to the colour
    EnumColour colour = EnumColour.byMetadata(colourbits);
    return this.getDefaultState().withProperty(PROPERTYCOLOUR, colour).withProperty(PROPERTYFACING, facing);
  }

  @Override
  public int getMetaFromState(IBlockState state)
  {
    EnumFacing facing = (EnumFacing)state.getValue(PROPERTYFACING);
    EnumColour colour = (EnumColour)state.getValue(PROPERTYCOLOUR);

    int facingbits = facing.getHorizontalIndex();
    int colourbits = colour.getMetadata() << 2;
    return facingbits | colourbits;
  }

  @Override
  public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
  {
    return state;
  }

  @Override
  protected BlockStateContainer createBlockState()
  {
    return new BlockStateContainer(this, new IProperty[] {PROPERTYFACING, PROPERTYCOLOUR});
  }

  @Override
  public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing blockFaceClickedOn, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
  {
    EnumColour colour = EnumColour.byMetadata(meta);
    EnumFacing enumfacing = (placer == null) ? EnumFacing.NORTH : EnumFacing.fromAngle(placer.rotationYaw);

    return this.getDefaultState().withProperty(PROPERTYFACING, enumfacing).withProperty(PROPERTYCOLOUR, colour);
  }


  public static enum EnumColour implements IStringSerializable
  {
	    BLUE(0, "blue"),
	    RED(1, "red"),
	    GREEN(2, "green"),
	    YELLOW(3, "yellow");


    public int getMetadata()
    {
      return this.meta;
    }

    @Override
    public String toString()
    {
      return this.name;
    }

    public static EnumColour byMetadata(int meta)
    {
      if (meta < 0 || meta >= META_LOOKUP.length)
      {
        meta = 0;
      }

      return META_LOOKUP[meta];
    }

    public String getName()
    {
      return this.name;
    }

    private final int meta;
    private final String name;
    private static final EnumColour[] META_LOOKUP = new EnumColour[values().length];

    private EnumColour(int i_meta, String i_name)
    {
      this.meta = i_meta;
      this.name = i_name;
    }

    static
    {
      for (EnumColour colour : values()) {
        META_LOOKUP[colour.getMetadata()] = colour;
      }
    }
  }
}