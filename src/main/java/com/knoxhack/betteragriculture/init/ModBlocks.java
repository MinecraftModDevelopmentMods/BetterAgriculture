package com.knoxhack.betteragriculture.init;


import com.google.common.base.Preconditions;
import com.knoxhack.betteragriculture.Main;
import com.knoxhack.betteragriculture.blocks.FancyTileBlock;
import com.knoxhack.betteragriculture.blocks.LargeTileBlock;
import com.knoxhack.betteragriculture.blocks.SlateBlock;
import com.knoxhack.betteragriculture.blocks.SmallTileBlock;
import com.knoxhack.betteragriculture.blocks.TinyTileBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemMultiTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.HashSet;
import java.util.Set;

@ObjectHolder(Main.MODID)
public class ModBlocks {
	
	public static final SlateBlock SLATE = new SlateBlock();
	public static final TinyTileBlock TINYTILEBLOCK = new TinyTileBlock(Material.IRON);
	public static final LargeTileBlock LARGETILEBLOCK = new LargeTileBlock(Material.IRON);
	public static final SmallTileBlock SMALLTILEBLOCK = new SmallTileBlock(Material.IRON);
	public static final FancyTileBlock FANCYTILEBLOCK = new FancyTileBlock(Material.IRON);

	@Mod.EventBusSubscriber(modid = Main.MODID)
	public static class RegistrationHandler {
	public static final Set<ItemBlock> ITEM_BLOCKS = new HashSet<>();

	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
	final IForgeRegistry<Block> registry = event.getRegistry();
    final Block[] blocks = 
    {
    SLATE,
	TINYTILEBLOCK,
	LARGETILEBLOCK,
	SMALLTILEBLOCK,
	FANCYTILEBLOCK,

    
    };
	registry.registerAll(blocks);
	}
	@SubscribeEvent
	public static void registerItemBlocks(final RegistryEvent.Register<Item> event) {
	final ItemBlock[] items = 
	{
	new ItemBlock(SLATE),
	new ItemMultiTexture(TINYTILEBLOCK, TINYTILEBLOCK, TINYTILEBLOCK::getName),
	new ItemMultiTexture(LARGETILEBLOCK, LARGETILEBLOCK, LARGETILEBLOCK::getName),
	new ItemMultiTexture(SMALLTILEBLOCK, SMALLTILEBLOCK, SMALLTILEBLOCK::getName),
	new ItemMultiTexture(FANCYTILEBLOCK, FANCYTILEBLOCK, FANCYTILEBLOCK::getName),


	
	};
	
	
	
	
	
	final IForgeRegistry<Item> registry = event.getRegistry();
	for (final ItemBlock item : items) {
	final Block block = item.getBlock();
	final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(), "Block %s has null registry name", block);
	registry.register(item.setRegistryName(registryName));
	ITEM_BLOCKS.add(item);
	}
 }
}
	
    @SideOnly(Side.CLIENT)
    public static void initModels() {
    SLATE.initModel();
    TINYTILEBLOCK.initModel();

    
    
    }
}