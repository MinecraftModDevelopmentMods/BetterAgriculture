package betteragriculture.blocks;



import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {

	public static Block nethercoalOre;
	public static Block concreteBlock;
	public static Block brickBlock;
	public static Block barnroofside1Block;
	public static Block barnroofside2Block;
	public static Block barnroofside12Block;
	public static Block barnroofside13Block;
	public static Block barnrooftopBlock;
	public static Block barnrooftop2Block;
	public static Block birchwatertroughBlock;



	@SuppressWarnings("deprecation")
	public static void createBlocks() {

		// Vanilla
		GameRegistry.registerBlock(concreteBlock = new ModBlockOre("concrete_block", Material.ROCK, ModBlocks.concreteBlock, 1, 1), "concrete_block");
		GameRegistry.registerBlock(brickBlock = new ModBlockOre("brick_block", Material.ROCK, ModBlocks.brickBlock, 1, 1), "brick_block");
		GameRegistry.registerBlock(barnroofside1Block = new ModBlockOre("barnroofside1_block", Material.ROCK, ModBlocks.barnroofside1Block, 1, 1), "barnroofside1_block");
		GameRegistry.registerBlock(barnroofside2Block = new ModBlockOre("barnroofside2_block", Material.ROCK, ModBlocks.barnroofside2Block, 1, 1), "barnroofside2_block");
		GameRegistry.registerBlock(barnroofside12Block = new ModBlockOre("barnroofside12_block", Material.ROCK, ModBlocks.barnroofside12Block, 1, 1), "barnroofside12_block");
		GameRegistry.registerBlock(barnroofside13Block = new ModBlockOre("barnroofside13_block", Material.ROCK, ModBlocks.barnroofside13Block, 1, 1), "barnroofside13_block");
		GameRegistry.registerBlock(barnrooftopBlock = new ModBlockOre("barnrooftop_block", Material.ROCK, ModBlocks.barnrooftopBlock, 1, 1), "barnrooftop_block");
		GameRegistry.registerBlock(barnrooftop2Block = new ModBlockOre("barnrooftop2block", Material.ROCK, ModBlocks.barnrooftop2Block, 1, 1), "barnrooftop2_block");
		GameRegistry.registerBlock(birchwatertroughBlock = new ModBlockOre("birchwatertrough_block", Material.ROCK, ModBlocks.birchwatertroughBlock, 1, 1), "birchwatertrough_block");


	}
}
