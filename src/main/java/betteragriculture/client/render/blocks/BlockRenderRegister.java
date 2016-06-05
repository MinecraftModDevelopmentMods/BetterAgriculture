package betteragriculture.client.render.blocks;

import betteragriculture.Main;
import betteragriculture.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister {

	public static void registerBlockRenderer() {

		// Vanilla

		reg(ModBlocks.concreteBlock);
		reg(ModBlocks.redsidingBlock);
		reg(ModBlocks.slateOre);
		reg(ModBlocks.whitesidingBlock);

	}

	public static String modid = Main.MODID;

	public static void reg(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}
