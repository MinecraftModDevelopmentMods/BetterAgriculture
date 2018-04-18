package com.knoxhack.betteragriculture.init;
import com.knoxhack.betteragriculture.Main;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.HashSet;
import java.util.Set;

import com.knoxhack.betteragriculture.items.CustomEgg;
import com.knoxhack.betteragriculture.items.ItemBase;

@ObjectHolder(Main.MODID)
public class ModItems {
	public static final CustomEgg CUSTOMEGG = new CustomEgg("customegg");
	public static final ItemBase dicedGoat = new ItemBase("diced_goat");
	public static final ItemBase duckBreast = new ItemBase("duck_breast");
	public static final ItemBase duckEgg = new ItemBase("duck_egg");
	public static final ItemBase duckFeather = new ItemBase("duck_feather");
	public static final ItemBase goatCurry = new ItemBase("goat_curry");
	public static final ItemBase goatMilk = new ItemBase("goat_milk");
	public static final ItemBase greySheepSkin = new ItemBase("grey_sheep_skin");
	public static final ItemBase pigLeather = new ItemBase("pig_leather");
	public static final ItemBase roastDuckBreast = new ItemBase("roast_duck_breast");
	public static final ItemBase sheepMilk = new ItemBase("sheep_milk");
	public static final ItemBase whiteSheepSkin = new ItemBase("white_sheep_skin");
	public static final ItemBase wireItem = new ItemBase("wire_item");

	
	
	@Mod.EventBusSubscriber(modid = Main.MODID)
	public static class RegistrationHandler {
		public static final Set<Item> ITEMS = new HashSet<>();
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			final Item[] items = {
					//CUSTOMEGG,
					dicedGoat,
					duckBreast,
					duckEgg,
					duckFeather,
					goatCurry,
					goatMilk,
					greySheepSkin,
					pigLeather,
					roastDuckBreast,
					sheepMilk,
					whiteSheepSkin,
					wireItem
					
					
					
			};
			final IForgeRegistry<Item> registry = event.getRegistry();

			for (final Item item : items) {
				registry.register(item);
				ITEMS.add(item);
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}
		

		
	}
	public static void registerModels() {
		
		
		dicedGoat.registerItemModel();
		duckBreast.registerItemModel();
		duckEgg.registerItemModel();
		duckFeather.registerItemModel();
		goatCurry.registerItemModel();
		goatMilk.registerItemModel();
		greySheepSkin.registerItemModel();
		pigLeather.registerItemModel();
		roastDuckBreast.registerItemModel();
		sheepMilk.registerItemModel();
		whiteSheepSkin.registerItemModel();
		wireItem.registerItemModel();
		
		
	}

}