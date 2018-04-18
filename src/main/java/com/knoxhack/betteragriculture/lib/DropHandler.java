package com.knoxhack.betteragriculture.lib;

import java.util.Random;

import com.knoxhack.betteragriculture.entities.pig.EntityMobPig1;
import com.knoxhack.betteragriculture.entities.pig.EntityMobPig10;
import com.knoxhack.betteragriculture.entities.pig.EntityMobPig2;
import com.knoxhack.betteragriculture.entities.pig.EntityMobPig3;
import com.knoxhack.betteragriculture.entities.pig.EntityMobPig4;
import com.knoxhack.betteragriculture.entities.pig.EntityMobPig5;
import com.knoxhack.betteragriculture.entities.pig.EntityMobPig6;
import com.knoxhack.betteragriculture.entities.pig.EntityMobPig7;
import com.knoxhack.betteragriculture.entities.pig.EntityMobPig8;
import com.knoxhack.betteragriculture.entities.pig.EntityMobPig9;
import com.knoxhack.betteragriculture.entities.sheep.EntityMobSheep1;
import com.knoxhack.betteragriculture.entities.sheep.EntityMobSheep10;
import com.knoxhack.betteragriculture.entities.sheep.EntityMobSheep2;
import com.knoxhack.betteragriculture.entities.sheep.EntityMobSheep3;
import com.knoxhack.betteragriculture.entities.sheep.EntityMobSheep4;
import com.knoxhack.betteragriculture.entities.sheep.EntityMobSheep5;
import com.knoxhack.betteragriculture.entities.sheep.EntityMobSheep6;
import com.knoxhack.betteragriculture.entities.sheep.EntityMobSheep7;
import com.knoxhack.betteragriculture.entities.sheep.EntityMobSheep8;
import com.knoxhack.betteragriculture.entities.sheep.EntityMobSheep9;
import com.knoxhack.betteragriculture.init.ModItems;

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
		  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.pigLeather), dropped);
	 
	 }
	  else if (event.getEntityLiving() instanceof EntityMobPig2) {
		  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.pigLeather), dropped);
	 
	 }
	  else if (event.getEntityLiving() instanceof EntityMobPig3) {
		  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.pigLeather), dropped);
	 
	 }
	  else if (event.getEntityLiving() instanceof EntityMobPig4) {
		  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.pigLeather), dropped);
	 
	 }
	  else if (event.getEntityLiving() instanceof EntityMobPig5) {
		  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.pigLeather), dropped);
	 
	 }  else if (event.getEntityLiving() instanceof EntityMobPig6) {
		  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.pigLeather), dropped);
		  
	}  else if (event.getEntityLiving() instanceof EntityMobPig7) {
		  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.pigLeather), dropped);
		  
	}  else if (event.getEntityLiving() instanceof EntityMobPig8) {
		  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.pigLeather), dropped);
		  
	}  else if (event.getEntityLiving() instanceof EntityMobPig9) {
		  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.pigLeather), dropped);
		  
	}  else if (event.getEntityLiving() instanceof EntityMobPig10) {
		  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.pigLeather), dropped);
	}
		  else if (event.getEntityLiving() instanceof EntityMobSheep1) {
			  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.greySheepSkin), dropped);
		 
		 }
		  else if (event.getEntityLiving() instanceof EntityMobSheep2) {
			  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.greySheepSkin), dropped);
		 
		 }
		  else if (event.getEntityLiving() instanceof EntityMobSheep3) {
			  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.greySheepSkin), dropped);
		 
		 }
		  else if (event.getEntityLiving() instanceof EntityMobSheep4) {
			  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.greySheepSkin), dropped);
		 
		 }
		  else if (event.getEntityLiving() instanceof EntityMobSheep5) {
			  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.greySheepSkin), dropped);
		 
		 }  else if (event.getEntityLiving() instanceof EntityMobSheep6) {
			  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.greySheepSkin), dropped);
			  
		}  else if (event.getEntityLiving() instanceof EntityMobSheep7) {
			  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.greySheepSkin), dropped);
			  
		}  else if (event.getEntityLiving() instanceof EntityMobSheep8) {
			  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.greySheepSkin), dropped);
			  
		}  else if (event.getEntityLiving() instanceof EntityMobSheep9) {
			  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.greySheepSkin), dropped);
			  
		}  else if (event.getEntityLiving() instanceof EntityMobSheep10) {
			  event.getEntityLiving().entityDropItem(new ItemStack(ModItems.greySheepSkin ), dropped);
		}
			  
			 
}
  
}
 
 
 
 
 
 
