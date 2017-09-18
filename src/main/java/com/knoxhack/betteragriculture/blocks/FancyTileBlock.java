package com.knoxhack.betteragriculture.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Comparator;
import java.util.stream.Stream;

import com.knoxhack.betteragriculture.lib.IVariant;

public class FancyTileBlock extends BlockBase {
	public static final IProperty<EnumType> VARIANT = PropertyEnum.create("variant", EnumType.class);

	public FancyTileBlock(final Material materialIn) {
		super(materialIn, "fancytile");
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, VARIANT);
	}

	@Override
	public IBlockState getStateFromMeta(final int meta) {
		return getDefaultState().withProperty(VARIANT, EnumType.byMetadata(meta));
	}

	@Override
	public int getMetaFromState(final IBlockState state) {
		return state.getValue(VARIANT).getMeta();
	}

	@Override
	public int damageDropped(final IBlockState state) {
		return getMetaFromState(state);
	}


	@Override
	public void getSubBlocks(final CreativeTabs tab, final NonNullList<ItemStack> list) {
		for (final EnumType enumType : EnumType.values()) {
			list.add(new ItemStack(this, 1, enumType.getMeta()));
		}
	}

	public String getName(final ItemStack stack) {
		final int metadata = stack.getMetadata();

		return EnumType.byMetadata(metadata).getName();
	}

	public enum EnumType implements IVariant {
		VARIANT_WHITE(0, "white"),
		VARIANT_RED(1, "red"),
		VARIANT_PURPLE(2, "purple"),
		VARIANT_PINK(3, "pink"),
		VARIANT_ORANGE(4, "orange"),
		VARIANT_MAGENTA(5, "magenta"),
		VARIANT_LIME(6, "lime"),
		VARIANT_LIGHTGREY(7, "lightgrey"),
		VARIANT_LIGHTBLUE(8, "lightblue"),
		VARIANT_GREY(9, "grey"),
		VARIANT_GREEN(10, "green"),
		VARIANT_CYAN(11, "cyan"),
		VARIANT_BROWN(12, "brown"),
		VARIANT_BLUE(13, "blue"),
		VARIANT_YELLOW(14, "yellow");

		private static final EnumType[] META_LOOKUP = Stream.of(values()).sorted(Comparator.comparing(EnumType::getMeta)).toArray(EnumType[]::new);

		private final int meta;
		private final String name;

		EnumType(final int meta, final String name) {
			this.meta = meta;
			this.name = name;
		}

		@Override
		public int getMeta() {
			return meta;
		}

		@Override
		public String getName() {
			return name;
		}

		public static EnumType byMetadata(int meta) {
			if (meta < 0 || meta >= META_LOOKUP.length) {
				meta = 0;
			}

			return META_LOOKUP[meta];
		}
		
		
		
		
	}
	

    @SideOnly(Side.CLIENT)
    public void initModel() {
      ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("betteragriculture:tinytile.blue", "inventory");
  	  ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this),
  	  FancyTileBlock.EnumType.VARIANT_BLUE.getMeta(), itemModelResourceLocation);
    } 
		
}
