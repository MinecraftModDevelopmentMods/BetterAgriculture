package betteragriculture.blocks;



import betteragriculture.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {

	public static Block nethercoalOre;
	public static Block concreteBlock;
	public static Block redsidingBlock;
	public static Block slateOre;
	public static Block whitesidingBlock;
	
	public static Block barnroofBlock;
	public static Block barnroofstairBlock;
	public static Block rooftileBlock;
	public static Block rooftilestairBlock;
	public static Block thatchroofBlock;
	public static Block thatchroofstairBlock;
	
	public static Block accaciatroughBlock;
	public static Block birchroughBlock;
	public static Block darkoaktroughBlock;
	public static Block jungletroughBlock;
	public static Block oaktroughBlock;
	public static Block sprucetroughBlock;
	public static Block stonetroughBlock;
	
	public static Block brickwallBlock;

	
	
	

	@SuppressWarnings("deprecation")
	public static void createBlocks() {

		// Vanilla
		GameRegistry.registerBlock(concreteBlock = new BasicBlock("concrete_block", Material.ROCK, ModBlocks.concreteBlock, 1, 1), "concrete_block");
		GameRegistry.registerBlock(redsidingBlock = new BasicBlock("red_siding_block", Material.ROCK, ModBlocks.redsidingBlock, 1, 1), "red_siding_block");
		GameRegistry.registerBlock(slateOre = new ModBlockOre("slate_ore", Material.ROCK, ModItems.slateItem, 1, 1), "slate_ore");
		GameRegistry.registerBlock(whitesidingBlock = new BasicBlock("white_siding_block", Material.ROCK, ModBlocks.whitesidingBlock, 1, 1), "white_siding_block");
		
		GameRegistry.registerBlock(barnroofBlock = new BasicBlock("barn_roof_block", Material.ROCK, ModBlocks.barnroofBlock, 1, 1), "barn_roof_block");
		GameRegistry.registerBlock(barnroofstairBlock = new BasicBlock("barn_roof_stair_block", Material.ROCK, ModBlocks.barnroofstairBlock, 1, 1), "barn_roof_stair_block");
		GameRegistry.registerBlock(rooftileBlock = new BasicBlock("roof_tile_block", Material.ROCK, ModBlocks.rooftileBlock, 1, 1), "roof_tile_block");
		GameRegistry.registerBlock(rooftilestairBlock = new BasicBlock("roof_tile_stair_block", Material.ROCK, ModBlocks.rooftilestairBlock, 1, 1), "roof_tile_stair_block");
        GameRegistry.registerBlock(thatchroofBlock = new BasicBlock("thatch_roof_block", Material.ROCK, ModBlocks.thatchroofBlock, 1, 1), "thatch_roof_block");
        GameRegistry.registerBlock(thatchroofstairBlock = new BasicBlock("thatch_roof_stair_block", Material.ROCK, ModBlocks.thatchroofstairBlock, 1, 1), "thatch_roof_stair_block");

        GameRegistry.registerBlock(accaciatroughBlock = new BasicBlock("accacia_trough_block", Material.ROCK, ModBlocks.accaciatroughBlock, 1, 1), "accacia_trough_block");
        GameRegistry.registerBlock(birchroughBlock = new BasicBlock("birch_trough_block", Material.ROCK, ModBlocks.accaciatroughBlock, 1, 1), "birch_trough_block");
        GameRegistry.registerBlock(darkoaktroughBlock = new BasicBlock("darkoak_trough_block", Material.ROCK, ModBlocks.accaciatroughBlock, 1, 1), "darkoak_trough_block");
        GameRegistry.registerBlock(jungletroughBlock = new BasicBlock("jungle_trough_block", Material.ROCK, ModBlocks.accaciatroughBlock, 1, 1), "jungle_trough_block");
        GameRegistry.registerBlock(oaktroughBlock = new BasicBlock("oak_trough_block", Material.ROCK, ModBlocks.accaciatroughBlock, 1, 1), "oak_trough_block");
        GameRegistry.registerBlock(sprucetroughBlock = new BasicBlock("spruce_trough_block", Material.ROCK, ModBlocks.accaciatroughBlock, 1, 1), "spruce_trough_block");
        GameRegistry.registerBlock(stonetroughBlock = new BasicBlock("stone_trough_block", Material.ROCK, ModBlocks.accaciatroughBlock, 1, 1), "stone_trough_block");

        GameRegistry.registerBlock(brickwallBlock = new BasicBlock("brick_wall_block", Material.ROCK, ModBlocks.brickwallBlock, 1, 1), "brick_wall_block");


	}
}
