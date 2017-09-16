package com.knoxhack.betteragriculture.init;


import com.google.common.base.Preconditions;
import com.knoxhack.betteragriculture.Main;
import com.knoxhack.betteragriculture.blocks.SlateBlock;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
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

	@Mod.EventBusSubscriber(modid = Main.MODID)
	public static class RegistrationHandler {
	public static final Set<ItemBlock> ITEM_BLOCKS = new HashSet<>();

	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
	final IForgeRegistry<Block> registry = event.getRegistry();
    final Block[] blocks = 
    {
    SLATE,
    
    
    };
	registry.registerAll(blocks);
	}
	@SubscribeEvent
	public static void registerItemBlocks(final RegistryEvent.Register<Item> event) {
	final ItemBlock[] items = 
	{
	new ItemBlock(SLATE),

	
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
    
    
    }
}