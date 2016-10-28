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
		reg(ModBlocks.fancytilecolorBlock, 2, "fancy_tile_color_block_cyan");
		reg(ModBlocks.fancytilecolorBlock, 3, "fancy_tile_color_block_green");
		reg(ModBlocks.fancytilecolorBlock, 4, "fancy_tile_color_block_grey");
		reg(ModBlocks.fancytilecolorBlock, 5, "fancy_tile_color_block_lightblue");
		reg(ModBlocks.fancytilecolorBlock, 6, "fancy_tile_color_block_lightgrey");
		reg(ModBlocks.fancytilecolorBlock, 7, "fancy_tile_color_block_lime");
		reg(ModBlocks.fancytilecolorBlock, 8, "fancy_tile_color_block_magenta");
		reg(ModBlocks.fancytilecolorBlock, 9, "fancy_tile_color_block_orange");
		reg(ModBlocks.fancytilecolorBlock, 10, "fancy_tile_color_block_pink");
		reg(ModBlocks.fancytilecolorBlock, 11, "fancy_tile_color_block_purple");
		reg(ModBlocks.fancytilecolorBlock, 12, "fancy_tile_color_block_red");
		reg(ModBlocks.fancytilecolorBlock, 13, "fancy_tile_color_block_white");
		reg(ModBlocks.fancytilecolorBlock, 14, "fancy_tile_color_block_yellow");

		reg(ModBlocks.largetilecolorBlock, 0, "large_tile_color_block_blue");
		reg(ModBlocks.largetilecolorBlock, 1, "large_tile_color_block_brown");
		reg(ModBlocks.largetilecolorBlock, 2, "large_tile_color_block_cyan");
		reg(ModBlocks.largetilecolorBlock, 3, "large_tile_color_block_green");
		reg(ModBlocks.largetilecolorBlock, 4, "large_tile_color_block_grey");
		reg(ModBlocks.largetilecolorBlock, 5, "large_tile_color_block_lightblue");
		reg(ModBlocks.largetilecolorBlock, 6, "large_tile_color_block_lightgrey");
		reg(ModBlocks.largetilecolorBlock, 7, "large_tile_color_block_lime");
		reg(ModBlocks.largetilecolorBlock, 8, "large_tile_color_block_magenta");
		reg(ModBlocks.largetilecolorBlock, 9, "large_tile_color_block_orange");
		reg(ModBlocks.largetilecolorBlock, 10, "large_tile_color_block_pink");
		reg(ModBlocks.largetilecolorBlock, 11, "large_tile_color_block_purple");
		reg(ModBlocks.largetilecolorBlock, 12, "large_tile_color_block_red");
		reg(ModBlocks.largetilecolorBlock, 13, "large_tile_color_block_white");
		reg(ModBlocks.largetilecolorBlock, 14, "large_tile_color_block_yellow");
		
		reg(ModBlocks.smalltilecolorBlock, 0, "small_tile_color_block_blue");
		reg(ModBlocks.smalltilecolorBlock, 1, "small_tile_color_block_brown");
		reg(ModBlocks.smalltilecolorBlock, 2, "small_tile_color_block_cyan");
		reg(ModBlocks.smalltilecolorBlock, 3, "small_tile_color_block_green");
		reg(ModBlocks.smalltilecolorBlock, 4, "small_tile_color_block_grey");
		reg(ModBlocks.smalltilecolorBlock, 5, "small_tile_color_block_lightblue");
		reg(ModBlocks.smalltilecolorBlock, 6, "small_tile_color_block_lightgrey");
		reg(ModBlocks.smalltilecolorBlock, 7, "small_tile_color_block_lime");
		reg(ModBlocks.smalltilecolorBlock, 8, "small_tile_color_block_magenta");
		reg(ModBlocks.smalltilecolorBlock, 9, "small_tile_color_block_orange");
		reg(ModBlocks.smalltilecolorBlock, 10, "small_tile_color_block_pink");
		reg(ModBlocks.smalltilecolorBlock, 11, "small_tile_color_block_purple");
		reg(ModBlocks.smalltilecolorBlock, 12, "small_tile_color_block_red");
		reg(ModBlocks.smalltilecolorBlock, 13, "small_tile_color_block_white");
		reg(ModBlocks.smalltilecolorBlock, 14, "small_tile_color_block_yellow");
		
		reg(ModBlocks.tinytilecolorBlock, 0, "tiny_tile_color_block_blue");
		reg(ModBlocks.tinytilecolorBlock, 1, "tiny_tile_color_block_brown");
		reg(ModBlocks.tinytilecolorBlock, 2, "tiny_tile_color_block_cyan");
		reg(ModBlocks.tinytilecolorBlock, 3, "tiny_tile_color_block_green");
		reg(ModBlocks.tinytilecolorBlock, 4, "tiny_tile_color_block_grey");
		reg(ModBlocks.tinytilecolorBlock, 5, "tiny_tile_color_block_lightblue");
		reg(ModBlocks.tinytilecolorBlock, 6, "tiny_tile_color_block_lightgrey");
		reg(ModBlocks.tinytilecolorBlock, 7, "tiny_tile_color_block_lime");
		reg(ModBlocks.tinytilecolorBlock, 8, "tiny_tile_color_block_magenta");
		reg(ModBlocks.tinytilecolorBlock, 9, "tiny_tile_color_block_orange");
		reg(ModBlocks.tinytilecolorBlock, 10, "tiny_tile_color_block_pink");
		reg(ModBlocks.tinytilecolorBlock, 11, "tiny_tile_color_block_purple");
		reg(ModBlocks.tinytilecolorBlock, 12, "tiny_tile_color_block_red");
		reg(ModBlocks.tinytilecolorBlock, 13, "tiny_tile_color_block_white");
		reg(ModBlocks.tinytilecolorBlock, 14, "tiny_tile_color_block_yellow");
		
		
		
		
		
		reg(ModBlocks.fancytilematerialBlock, 0, "fancy_tile_material_block_blue");
		reg(ModBlocks.fancytilematerialBlock, 1, "fancy_tile_material_block_brown");
		reg(ModBlocks.fancytilematerialBlock, 2, "fancy_tile_material_block_cyan");
		reg(ModBlocks.fancytilematerialBlock, 3, "fancy_tile_material_block_green");


		reg(ModBlocks.largetilematerialBlock, 0, "large_tile_material_block_blue");
		reg(ModBlocks.largetilematerialBlock, 1, "large_tile_material_block_brown");
		reg(ModBlocks.largetilematerialBlock, 2, "large_tile_material_block_cyan");
		reg(ModBlocks.largetilematerialBlock, 3, "large_tile_material_block_green");

		
		reg(ModBlocks.smalltilematerialBlock, 0, "small_tile_material_block_blue");
		reg(ModBlocks.smalltilematerialBlock, 1, "small_tile_material_block_brown");
		reg(ModBlocks.smalltilematerialBlock, 2, "small_tile_material_block_cyan");
		reg(ModBlocks.smalltilematerialBlock, 3, "small_tile_material_block_green");

		
		reg(ModBlocks.tinytilematerialBlock, 0, "tiny_tile_material_block_blue");
		reg(ModBlocks.tinytilematerialBlock, 1, "tiny_tile_material_block_brown");
		reg(ModBlocks.tinytilematerialBlock, 2, "tiny_tile_material_block_cyan");
		reg(ModBlocks.tinytilematerialBlock, 3, "tiny_tile_material_block_green");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

	public static void reg(Block block, int meta, String file) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(Item.getItemFromBlock(block), meta, new ModelResourceLocation(modid + ":" + file, "inventory"));
	}
	
	
	
	
	public static String modid = Main.MODID;

	public static void reg(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
	
	
}
