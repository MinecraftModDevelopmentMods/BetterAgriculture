package betteragriculture.blocks;



import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {

	public static Block nethercoalOre;
	public static Block concreteBlock;
	public static Block redsidingBlock;
	public static Block slateOre;
	public static Block whitesidingBlock;




	@SuppressWarnings("deprecation")
	public static void createBlocks() {

		// Vanilla
		GameRegistry.registerBlock(concreteBlock = new ModBlockOre("concrete_block", Material.ROCK, ModBlocks.concreteBlock, 1, 1), "concrete_block");
		GameRegistry.registerBlock(redsidingBlock = new ModBlockOre("red_siding_block", Material.ROCK, ModBlocks.redsidingBlock, 1, 1), "red_siding_block");
		GameRegistry.registerBlock(slateOre = new ModBlockOre("slate_ore", Material.ROCK, ModBlocks.slateOre, 1, 1), "slate_ore");
		GameRegistry.registerBlock(whitesidingBlock = new ModBlockOre("white_siding_block", Material.ROCK, ModBlocks.whitesidingBlock, 1, 1), "white_siding_block");



	}
}
