package betteragriculture.registry;

import betteragriculture.Main;
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
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class RegistryMobs {
	private static int entityID = 0;
	
	
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		registerEntity(EntityMobCow1.class, "EntityMobCow1", 0x006400, 0x98FB98);
		registerEntity(EntityMobCow2.class, "EntityMobCow2", 0x006400, 0x98FB98);
		registerEntity(EntityMobCow3.class, "EntityMobCow3", 0x006400, 0x98FB98);
		registerEntity(EntityMobCow4.class, "EntityMobCow4", 0x006400, 0x98FB98);
		registerEntity(EntityMobCow5.class, "EntityMobCow5", 0x006400, 0x98FB98);
		registerEntity(EntityMobCow6.class, "EntityMobCow6", 0x006400, 0x98FB98);
		registerEntity(EntityMobCow7.class, "EntityMobCow7", 0x006400, 0x98FB98);
		registerEntity(EntityMobCow8.class, "EntityMobCow8", 0x006400, 0x98FB98);
		registerEntity(EntityMobCow9.class, "EntityMobCow9", 0x006400, 0x98FB98);
		registerEntity(EntityMobCow10.class, "EntityMobCow10", 0x006400, 0x98FB98);
		registerEntity(EntityMobNpcFemale1.class, "EntityMobNpcFemale1", 0x006460, 0x98FB98);
		registerEntity(EntityMobNpcMale.class, "EntityMobNpcMale", 0x006460, 0x98FB98);
		registerEntity(EntityMobSheep1.class, "EntityMobSheep1", 0x008500, 0x98FB98);
		registerEntity(EntityMobSheep2.class, "EntityMobSheep2", 0x008500, 0x98FB98);
		registerEntity(EntityMobSheep3.class, "EntityMobSheep3", 0x008500, 0x98FB98);
		registerEntity(EntityMobSheep4.class, "EntityMobSheep4", 0x008500, 0x98FB98);
		registerEntity(EntityMobSheep5.class, "EntityMobSheep5", 0x008500, 0x98FB98);
		registerEntity(EntityMobSheep6.class, "EntityMobSheep6", 0x008500, 0x98FB98);
		registerEntity(EntityMobSheep7.class, "EntityMobSheep7", 0x008500, 0x98FB98);
		registerEntity(EntityMobSheep8.class, "EntityMobSheep8", 0x008500, 0x98FB98);
		registerEntity(EntityMobSheep9.class, "EntityMobSheep9", 0x008500, 0x98FB98);
		registerEntity(EntityMobSheep10.class, "EntityMobSheep10", 0x008500, 0x98FB98);
		registerEntity(EntityMobPig1.class, "EntityMobPig1", 0x008500, 0x98FB98);
		registerEntity(EntityMobPig2.class, "EntityMobPig2", 0x008500, 0x98FB98);
		registerEntity(EntityMobPig3.class, "EntityMobPig3", 0x008500, 0x98FB98);
		registerEntity(EntityMobPig4.class, "EntityMobPig4", 0x008500, 0x98FB98);
		registerEntity(EntityMobPig5.class, "EntityMobPig5", 0x008500, 0x98FB98);
		registerEntity(EntityMobPig6.class, "EntityMobPig6", 0x009500, 0x98FB98);
		registerEntity(EntityMobPig7.class, "EntityMobPig7", 0x008500, 0x98FB98);
		registerEntity(EntityMobPig8.class, "EntityMobPig8", 0x008500, 0x98FB98);
		registerEntity(EntityMobPig9.class, "EntityMobPig9", 0x008500, 0x98FB98);
		registerEntity(EntityMobPig10.class, "EntityMobPig10", 0x008500, 0x98FB98);
		registerEntity(EntityMobChicken1.class, "EntityMobChicken1", 0xac9271, 0x98FB98);
		registerEntity(EntityMobChicken2.class, "EntityMobChicken2", 0xac9271, 0x98FB98);
		registerEntity(EntityMobChicken3.class, "EntityMobChicken3", 0xac9271, 0x98FB98);
		registerEntity(EntityMobChicken4.class, "EntityMobChicken4", 0xac9271, 0x98FB98);
		registerEntity(EntityMobChicken5.class, "EntityMobChicken5", 0xac9271, 0x98FB98);
		registerEntity(EntityMobChicken6.class, "EntityMobChicken6", 0xac9271, 0x98FB98);
		registerEntity(EntityMobChicken7.class, "EntityMobChicken7", 0xac9271, 0x98FB98);
		registerEntity(EntityMobChicken8.class, "EntityMobChicken8", 0xac9271, 0x98FB98);
		registerEntity(EntityMobChicken9.class, "EntityMobChicken9", 0xac9271, 0x98FB98);
		registerEntity(EntityMobChicken10.class, "EntityMobChicken10", 0xac9271, 0x98FB98);
		registerEntity(EntityMobChicken11.class, "EntityMobChicken11", 0xac9271, 0x98FB98);
	}
	private static void registerEntity(Class<? extends Entity> entityClass, String entityName, int bkEggColor, int fgEggColor) {
	       EntityRegistry.registerModEntity(entityClass, entityName, entityID++, Main.INSTANCE, 80, 3, true, bkEggColor, fgEggColor);
	   }
}
