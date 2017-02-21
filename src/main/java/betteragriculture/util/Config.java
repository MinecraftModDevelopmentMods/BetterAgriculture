package betteragriculture.util;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;

import betteragriculture.Main;
import com.mcmoddev.basemetals.registry.CrusherRecipeRegistry;
import com.mcmoddev.basemetals.util.Config.Options;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
//import net.minecraftforge.common.config.*;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.MissingModsException;
//import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.versioning.ArtifactVersion;
//import net.minecraftforge.fml.common.versioning.*;
import net.minecraftforge.fml.common.versioning.DefaultArtifactVersion;

/**
 * @author p455w0rd
 *
 */
public class Config {

	private static Configuration configuration;
	private static final String CONFIG_FILE = "config/BetterAgriculture.cfg";
	private static final String MATERIALS_CAT = "Metals";
	private static final String ORESPAWN_CFG_PATH = "orespawn";

	@SubscribeEvent
	public void onConfigChange(ConfigChangedEvent.OnConfigChangedEvent e) {
		if (e.getModID().equals(Main.MODID)) {
			init();
		}
	}

	public static void init() {
		if (configuration == null) {
			configuration = new Configuration(new File(CONFIG_FILE));
			MinecraftForge.EVENT_BUS.register(new Config());
		}

		// METALS
		Options.enableTinyTile = configuration.getBoolean("EnableAluminumBrass", MATERIALS_CAT, true, "Enable Aluminum Brass Items and Materials");
		Options.enableSmallTile = configuration.getBoolean("EnableAluminum", MATERIALS_CAT, true, "Enable Aluminum Items and Materials");
		Options.enableLargeTile = configuration.getBoolean("EnableCadmium", MATERIALS_CAT, true, "Enable Cadmium Items and Materials");
		Options.enableSlate = configuration.getBoolean("EnableChromium", MATERIALS_CAT, true, "Enable Chromium Items and Materials");
		Options.requireMMDOreSpawn = configuration.getBoolean("using_orespawn", MATERIALS_CAT, true, "If false, then Base Metals will not require DrCyano's Ore Spawn mod. \n" + "Set to false if using another mod to manually handle ore generation.");


		if (configuration.hasChanged()) {
			configuration.save();
		}

		if (betteragriculture.util.Config.Options.requireMMDOreSpawn) {
			if (!Loader.isModLoaded("orespawn")) {
				final HashSet<ArtifactVersion> orespawnMod = new HashSet<>();
				orespawnMod.add(new DefaultArtifactVersion("1.1.0"));
				throw new MissingModsException(orespawnMod, "orespawn", "MMD Ore Spawn Mod");
			}
			final Path oreSpawnFile = Paths.get(ORESPAWN_CFG_PATH, Main.MODID + ".json");
			if (!(oreSpawnFile.toFile().exists())) {
				try {
					Files.createDirectories(oreSpawnFile.getParent());
				}
				catch (final IOException ex) {
					//Main.logger.error("Failed to write file " + oreSpawnFile, ex);
				}
			}
		}

	
		
	}

	public static class Options {

		// MATERIALS
		public static boolean enableTinyTile = true;
		public static boolean enableSmallTile = true;
		public static boolean enableLargeTile= true;
		public static boolean enableSlate = true;
		public static boolean requireMMDOreSpawn = true;


		private Options() {
			throw new IllegalAccessError("Not a instantiable class");
		}
	}

	public static void postInit() {
		CrusherRecipeRegistry.getInstance().clearCache();
	}
}
