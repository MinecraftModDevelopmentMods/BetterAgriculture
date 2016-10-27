package betteragriculture.client.render.blocks;

import betteragriculture.Main;
import betteragriculture.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister {

	public static void registerBlockRenderer() {

		// Vanilla

		reg(ModBlocks.concreteBlock);
		reg(ModBlocks.redsidingBlock);
		reg(ModBlocks.slateOre);
		reg(ModBlocks.whitesidingBlock);
		reg(ModBlocks.barnroofBlock);
		reg(ModBlocks.barnroofstairBlock);
		reg(ModBlocks.rooftileBlock);

		reg(ModBlocks.rooftilestairBlock);
		reg(ModBlocks.thatchroofBlock);
        reg(ModBlocks.thatchroofstairBlock);
		
		reg(ModBlocks.accaciatroughBlock);
		reg(ModBlocks.birchroughBlock);
		reg(ModBlocks.darkoaktroughBlock);
		reg(ModBlocks.jungletroughBlock);
		reg(ModBlocks.oaktroughBlock);
		reg(ModBlocks.sprucetroughBlock);
		reg(ModBlocks.stonetroughBlock);

		reg(ModBlocks.brickwallBlock);
		reg(ModBlocks.fancytilecolorBlock, 0, "fancy_tile_color_block_blue");
		reg(ModBlocks.fancytilecolorBlock, 1, "fancy_tile_color_block_brown");


	}

	public static void reg(Block block, int meta, String file) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(Item.getItemFromBlock(block), meta, new ModelResourceLocation(modid + ":" + file, "inventory"));
	}
	
	
	
	
	public static String modid = Main.MODID;

	public static void reg(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
	
	//public static void preInit() {
	   // ModelBakery.addVariantName(Item.getItemFromBlock(ModBlocks.fancytilecolorBlock), "tutorial:block_properties_black", "tutorial:block_properties_white");
//	}
	
	
	
	
	
	
	
}
