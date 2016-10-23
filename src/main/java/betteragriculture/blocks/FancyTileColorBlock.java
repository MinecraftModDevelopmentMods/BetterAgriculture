package betteragriculture.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class FancyTileColorBlock extends Block {

	public FancyTileColorBlock(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setHardness(hardness);
		this.setResistance(resistance);
	}

	public FancyTileColorBlock(String unlocalizedName, float hardness, float resistance) {
		this(unlocalizedName, Material.ROCK, hardness, resistance);
	}

	public FancyTileColorBlock(String unlocalizedName, Material rock, Block whitesidingBlock, int i, int j) {
		this(unlocalizedName, 2.0f, 10.0f);
	}
}
