package betteragriculture.blocks;



import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {

	public static Block nethercoalOre;


	@SuppressWarnings("deprecation")
	public static void createBlocks() {

		// Vanilla
		GameRegistry.registerBlock(nethercoalOre = new ModBlockOre("nether_coal_ore", Material.ROCK, ModBlocks.nethercoalOre, 1, 1), "nether_coal_ore");
	}
}
