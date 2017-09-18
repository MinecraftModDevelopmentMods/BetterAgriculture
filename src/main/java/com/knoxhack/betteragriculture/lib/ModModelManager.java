package com.knoxhack.betteragriculture.lib;
import com.knoxhack.betteragriculture.Main;
import com.knoxhack.betteragriculture.blocks.FancyTileBlock;
import com.knoxhack.betteragriculture.blocks.LargeTileBlock;
import com.knoxhack.betteragriculture.blocks.SmallTileBlock;
import com.knoxhack.betteragriculture.blocks.TinyTileBlock;
import com.knoxhack.betteragriculture.init.ModBlocks;

import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import java.util.HashSet;
import java.util.Set;
import java.util.function.ToIntFunction;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = Main.MODID)
public class ModModelManager {
	public static final ModModelManager INSTANCE = new ModModelManager();


	private ModModelManager() {
	}

	@SubscribeEvent
	public static void registerAllModels(final ModelRegistryEvent event) {
		INSTANCE.registerBlockModels();
	}


	private final StateMapperBase propertyStringMapper = new StateMapperBase() {
		@Override
		protected ModelResourceLocation getModelResourceLocation(final IBlockState state) {
			return new ModelResourceLocation("minecraft:air");
		}
	};

	private void registerBlockModels() {

		registerVariantBlockItemModels(
				ModBlocks.TINYTILEBLOCK.getDefaultState(),
				TinyTileBlock.VARIANT	
		);
		registerVariantBlockItemModels(
				ModBlocks.FANCYTILEBLOCK.getDefaultState(),
				FancyTileBlock.VARIANT
			
		);	
		registerVariantBlockItemModels(
				ModBlocks.LARGETILEBLOCK.getDefaultState(),
				LargeTileBlock.VARIANT
			
		);
		registerVariantBlockItemModels(
				ModBlocks.SMALLTILEBLOCK.getDefaultState(),
				SmallTileBlock.VARIANT
			
		);



		ModBlocks.RegistrationHandler.ITEM_BLOCKS.stream().filter(item -> !itemsRegistered.contains(item)).forEach(this::registerItemModel);
	}


	private void registerBlockItemModelForMeta(final IBlockState state, final int metadata) {
		final Item item = Item.getItemFromBlock(state.getBlock());

		if (item != Items.AIR) {
			registerItemModelForMeta(item, metadata, propertyStringMapper.getPropertyString(state.getProperties()));
		}
	}


	private <T extends Comparable<T>> void registerVariantBlockItemModels(final IBlockState baseState, final IProperty<T> property, final ToIntFunction<T> getMeta) {
		property.getAllowedValues().forEach(value -> registerBlockItemModelForMeta(baseState.withProperty(property, value), getMeta.applyAsInt(value)));
	}

	private <T extends IVariant & Comparable<T>> void registerVariantBlockItemModels(final IBlockState baseState, final IProperty<T> property) {
		registerVariantBlockItemModels(baseState, property, IVariant::getMeta);
	}

	private final Set<Item> itemsRegistered = new HashSet<>();

	private void registerItemModel(final Item item) {
		registerItemModel(item, item.getRegistryName().toString());
	}

	private void registerItemModel(final Item item, final String modelLocation) {
		final ModelResourceLocation fullModelLocation = new ModelResourceLocation(modelLocation, "inventory");
		registerItemModel(item, fullModelLocation);
	}


	private void registerItemModel(final Item item, final ModelResourceLocation fullModelLocation) {
		ModelBakery.registerItemVariants(item, fullModelLocation);
		registerItemModel(item, MeshDefinitionFix.create(stack -> fullModelLocation));
	}

	private void registerItemModel(final Item item, final ItemMeshDefinition meshDefinition) {
		itemsRegistered.add(item);
		ModelLoader.setCustomMeshDefinition(item, meshDefinition);
	}

	private void registerItemModelForMeta(final Item item, final int metadata, final String variant) {
		registerItemModelForMeta(item, metadata, new ModelResourceLocation(item.getRegistryName(), variant));
	}

	private void registerItemModelForMeta(final Item item, final int metadata, final ModelResourceLocation modelResourceLocation) {
		itemsRegistered.add(item);
		ModelLoader.setCustomModelResourceLocation(item, metadata, modelResourceLocation);
	}
}