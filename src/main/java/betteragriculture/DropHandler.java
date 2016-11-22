package betteragriculture;

import java.util.Random;

import betteragriculture.entity.entitymob.*;
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
 if (event.getEntityLiving() instanceof EntityMobPig1) {
		  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.pigleatherItem), dropped);
	 
	 }
	  else if (event.getEntityLiving() instanceof EntityMobPig2) {
		  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.pigleatherItem), dropped);
	 
	 }
	  else if (event.getEntityLiving() instanceof EntityMobPig3) {
		  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.pigleatherItem), dropped);
	 
	 }
	  else if (event.getEntityLiving() instanceof EntityMobPig4) {
		  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.pigleatherItem), dropped);
	 
	 }
	  else if (event.getEntityLiving() instanceof EntityMobPig5) {
		  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.pigleatherItem), dropped);
	 
	 }  else if (event.getEntityLiving() instanceof EntityMobPig6) {
		  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.pigleatherItem), dropped);
		  
	}  else if (event.getEntityLiving() instanceof EntityMobPig7) {
		  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.pigleatherItem), dropped);
		  
	}  else if (event.getEntityLiving() instanceof EntityMobPig8) {
		  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.pigleatherItem), dropped);
		  
	}  else if (event.getEntityLiving() instanceof EntityMobPig9) {
		  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.pigleatherItem), dropped);
		  
	}  else if (event.getEntityLiving() instanceof EntityMobPig10) {
		  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.pigleatherItem), dropped);
	}
		  else if (event.getEntityLiving() instanceof EntityMobSheep1) {
			  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.greysheepskinItem), dropped);
		 
		 }
		  else if (event.getEntityLiving() instanceof EntityMobSheep2) {
			  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.greysheepskinItem), dropped);
		 
		 }
		  else if (event.getEntityLiving() instanceof EntityMobSheep3) {
			  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.greysheepskinItem), dropped);
		 
		 }
		  else if (event.getEntityLiving() instanceof EntityMobSheep4) {
			  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.greysheepskinItem), dropped);
		 
		 }
		  else if (event.getEntityLiving() instanceof EntityMobSheep5) {
			  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.greysheepskinItem), dropped);
		 
		 }  else if (event.getEntityLiving() instanceof EntityMobSheep6) {
			  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.greysheepskinItem), dropped);
			  
		}  else if (event.getEntityLiving() instanceof EntityMobSheep7) {
			  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.greysheepskinItem), dropped);
			  
		}  else if (event.getEntityLiving() instanceof EntityMobSheep8) {
			  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.greysheepskinItem), dropped);
			  
		}  else if (event.getEntityLiving() instanceof EntityMobSheep9) {
			  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.greysheepskinItem), dropped);
			  
		}  else if (event.getEntityLiving() instanceof EntityMobSheep10) {
			  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.greysheepskinItem ), dropped);
		}
			  
			   if (event.getEntityLiving() instanceof EntityMobSheep1) {
				  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.sheepmilkItem), dropped);
			 
			 }
			  else if (event.getEntityLiving() instanceof EntityMobSheep2) {
				  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.sheepmilkItem), dropped);
			 
			 }
			  else if (event.getEntityLiving() instanceof EntityMobSheep3) {
				  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.sheepmilkItem), dropped);
			 
			 }
			  else if (event.getEntityLiving() instanceof EntityMobSheep4) {
				  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.sheepmilkItem), dropped);
			 
			 }
			  else if (event.getEntityLiving() instanceof EntityMobSheep5) {
				  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.sheepmilkItem), dropped);
			 
			 }  else if (event.getEntityLiving() instanceof EntityMobSheep6) {
				  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.sheepmilkItem), dropped);
				  
			}  else if (event.getEntityLiving() instanceof EntityMobSheep7) {
				  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.sheepmilkItem), dropped);
				  
			}  else if (event.getEntityLiving() instanceof EntityMobSheep8) {
				  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.sheepmilkItem), dropped);
				  
			}  else if (event.getEntityLiving() instanceof EntityMobSheep9) {
				  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.sheepmilkItem), dropped);
				  
			}  else if (event.getEntityLiving() instanceof EntityMobSheep10) {
				  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.sheepmilkItem), dropped);  
			  
			  
			  
}
  
}
 
 
 
 
 
 
}