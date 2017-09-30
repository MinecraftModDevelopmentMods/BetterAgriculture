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

@ObjectHolder(Main.MODID)
public class ModItems {
	public static final CustomEgg CUSTOMEGG = new CustomEgg("customegg");
	@Mod.EventBusSubscriber(modid = Main.MODID)
	public static class RegistrationHandler {
		public static final Set<Item> ITEMS = new HashSet<>();
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			final Item[] items = {
					//CUSTOMEGG,
			};
			final IForgeRegistry<Item> registry = event.getRegistry();

			for (final Item item : items) {
				registry.register(item);
				ITEMS.add(item);
			}
		}
	}
}