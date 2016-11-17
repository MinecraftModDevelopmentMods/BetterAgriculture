package betteragriculture;

import java.util.LinkedList;

import betteragriculture.entity.entitymob.EntityMobChicken1;
import betteragriculture.entity.entitymob.EntityMobChicken10;
import betteragriculture.entity.entitymob.EntityMobChicken11;
import betteragriculture.entity.entitymob.EntityMobChicken2;
import betteragriculture.entity.entitymob.EntityMobChicken3;
import betteragriculture.entity.entitymob.EntityMobChicken4;
import betteragriculture.entity.entitymob.EntityMobChicken5;
import betteragriculture.entity.entitymob.EntityMobChicken6;
import betteragriculture.entity.entitymob.EntityMobChicken7;
import betteragriculture.entity.entitymob.EntityMobChicken8;
import betteragriculture.entity.entitymob.EntityMobChicken9;
import betteragriculture.entity.entitymob.EntityMobCow1;
import betteragriculture.entity.entitymob.EntityMobCow10;
import betteragriculture.entity.entitymob.EntityMobCow2;
import betteragriculture.entity.entitymob.EntityMobCow3;
import betteragriculture.entity.entitymob.EntityMobCow4;
import betteragriculture.entity.entitymob.EntityMobCow5;
import betteragriculture.entity.entitymob.EntityMobCow6;
import betteragriculture.entity.entitymob.EntityMobCow7;
import betteragriculture.entity.entitymob.EntityMobCow8;
import betteragriculture.entity.entitymob.EntityMobCow9;
import betteragriculture.entity.entitymob.EntityMobNpcFemale1;
import betteragriculture.entity.entitymob.EntityMobNpcMale;
import betteragriculture.entity.entitymob.EntityMobPig1;
import betteragriculture.entity.entitymob.EntityMobPig10;
import betteragriculture.entity.entitymob.EntityMobPig2;
import betteragriculture.entity.entitymob.EntityMobPig3;
import betteragriculture.entity.entitymob.EntityMobPig4;
import betteragriculture.entity.entitymob.EntityMobPig5;
import betteragriculture.entity.entitymob.EntityMobPig6;
import betteragriculture.entity.entitymob.EntityMobPig7;
import betteragriculture.entity.entitymob.EntityMobPig8;
import betteragriculture.entity.entitymob.EntityMobPig9;
import betteragriculture.entity.entitymob.EntityMobSheep1;
import betteragriculture.entity.entitymob.EntityMobSheep10;
import betteragriculture.entity.entitymob.EntityMobSheep2;
import betteragriculture.entity.entitymob.EntityMobSheep3;
import betteragriculture.entity.entitymob.EntityMobSheep4;
import betteragriculture.entity.entitymob.EntityMobSheep5;
import betteragriculture.entity.entitymob.EntityMobSheep6;
import betteragriculture.entity.entitymob.EntityMobSheep7;
import betteragriculture.entity.entitymob.EntityMobSheep8;
import betteragriculture.entity.entitymob.EntityMobSheep9;
import betteragriculture.registry.MobSpawning;
import betteragriculture.registry.RegistryMobs;
import betteragriculture.world.biome.BaseBiome;
import betteragriculture.world.biome.FarmlandBiome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.*;
import static net.minecraftforge.common.BiomeDictionary.Type;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.*;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
@Mod(
		modid = Main.MODID,
		name = Main.MODNAME,
		version = Main.VERSION,
		dependencies = "",
		acceptedMinecraftVersions = "1.8.9,)",
		updateJSON = "https://raw.githubusercontent.com/nfinit-gaming/BetterAgriculture/master/update.json")

public class Main {
	public static VillagerRegistry.VillagerProfession villagerProfession_farmhand;

	@Instance
	public static Main INSTANCE = null;
    public static CreativeTabs tab;
	public static final String MODID = "betteragriculture";
	public static final String MODNAME = "Better Agriculture";
	public static final String VERSION = "1.0";
	private static int entityID = 0;
    public static FarmlandBiome farmlandBiome;

//	private VillagerRegistry villageRegistry;
    @EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		INSTANCE = this;
		// load config
        ConfigHandler.startConfig(event);
        tab = new CreativeTabBetterAgriculture();
    //	for (int i = 0; i < 5; ++i) {
    //	VillagerRegistry.instance().registerVillageCreationHandler(new TradeHandler());
    //	}
Main.proxy.preInit(event);

//Mob Entities Registry
RegistryMobs.preInit(event);

    }
    
	@EventHandler
	public void init(FMLInitializationEvent event) {
		Main.proxy.init(event);
        MinecraftForge.EVENT_BUS.register(Main.INSTANCE);

           MobSpawning.registerMobSpawn2();
		
		//villagerProfession_farmhand = new VillagerRegistry.VillagerProfession("betteragriculture:farmhand", "betteragriculture:textures/models/villager_farmhand.png", "betteragriculture:textures/models/villager_farmhand_zombie.png");
		//villageRegistry.register(villagerProfession_farmhand);
		//VillagerRegistry.VillagerCareer career_farmhand = new VillagerRegistry.VillagerCareer(villagerProfession_farmhand, "betteragriculture:farmhand");
		//career_farmhand.addTrade(1,
		//new BAVillagerTrades.EmeraldForItemstack(new ItemStack(ModItems.slateItem), new EntityVillager.PriceInfo(8, 16)),
		//new BAVillagerTrades.ItemstackForEmerald(new ItemStack(ModItems.wireItem), new EntityVillager.PriceInfo(-10, -6))
		//);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		  Main.proxy.postInit(event);
		  //Mob Entities Spawning Registry
		  MobSpawning.registerMobSpawn();}

	@SidedProxy(clientSide="betteragriculture.ClientProxy", serverSide="betteragriculture.ServerProxy")
	public static CommonProxy proxy;
}
