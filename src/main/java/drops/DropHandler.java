package drops;

import java.util.Random;

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
import betteragriculture.items.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DropHandler {
 
 public static Random random;
 public static int dropped;
 
 @SubscribeEvent
 public void onEntityDrop(LivingDropsEvent event) {
 random = new Random();
 dropped = random.nextInt(2) + 1;
  if(event.getEntityLiving() instanceof EntityMobCow1) {
 event.getEntityLiving().entityDropItem(new ItemStack(ModItems.slateItem), dropped);
 }
  else if (event.getEntityLiving() instanceof EntityMobCow2) {
	  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.slateItem), dropped);
 
 }
  else if (event.getEntityLiving() instanceof EntityMobCow3) {
	  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.slateItem), dropped);
 
 }
  else if (event.getEntityLiving() instanceof EntityMobCow4) {
	  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.slateItem), dropped);
 
 }
  else if (event.getEntityLiving() instanceof EntityMobCow5) {
	  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.slateItem), dropped);
 
 }
  else if (event.getEntityLiving() instanceof EntityMobCow6) {
	  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.slateItem), dropped);
 
 }  else if (event.getEntityLiving() instanceof EntityMobCow7) {
	  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.slateItem), dropped);
	  
}  else if (event.getEntityLiving() instanceof EntityMobCow8) {
	  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.slateItem), dropped);
	  
}  else if (event.getEntityLiving() instanceof EntityMobCow9) {
	  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.slateItem), dropped);
	  
}  else if (event.getEntityLiving() instanceof EntityMobCow10) {
	  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.slateItem), dropped);
	  
}
  
}
 
 
 
 
 
 
}