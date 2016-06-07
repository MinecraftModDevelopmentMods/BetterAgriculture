package betteragriculture.world.biome;

import betteragriculture.entity.entitymob.EntityMobChicken1;
import betteragriculture.entity.entitymob.EntityMobChicken10;
import betteragriculture.entity.entitymob.EntityMobChicken2;
import betteragriculture.entity.entitymob.EntityMobChicken3;
import betteragriculture.entity.entitymob.EntityMobChicken4;
import betteragriculture.entity.entitymob.EntityMobChicken5;
import betteragriculture.entity.entitymob.EntityMobChicken6;
import betteragriculture.entity.entitymob.EntityMobChicken7;
import betteragriculture.entity.entitymob.EntityMobChicken8;
import betteragriculture.entity.entitymob.EntityMobChicken9;
import betteragriculture.entity.entitymob.EntityMobCow1;
import betteragriculture.entity.entitymob.EntityMobNpcFemale1;
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
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FarmlandBiome extends BaseBiome {

	public FarmlandBiome() {
		super("FarmlandBiome");
        topBlock = Blocks.GRASS.getDefaultState();
        fillerBlock = Blocks.GRASS.getDefaultState();
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobNpcFemale1.class, 4, 1, 5));
        
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobCow1.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobCow1.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobCow1.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobCow1.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobCow1.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobCow1.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobCow1.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobCow1.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobCow1.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobCow1.class, 4, 1, 5));

        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobPig1.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobPig2.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobPig3.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobPig4.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobPig5.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobPig6.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobPig7.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobPig8.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobPig9.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobPig10.class, 4, 1, 5));

        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobSheep1.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobSheep2.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobSheep3.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobSheep4.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobSheep5.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobSheep6.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobSheep7.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobSheep8.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobSheep9.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobSheep10.class, 4, 1, 5));

        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobChicken1.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobChicken2.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobChicken3.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobChicken4.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobChicken5.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobChicken6.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobChicken7.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobChicken8.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobChicken9.class, 4, 1, 5));
        this.spawnableCreatureList.add(new BaseBiome.SpawnListEntry(EntityMobChicken10.class, 4, 1, 5));

        
        
	}

	
	@Override
	@SideOnly(Side.CLIENT)
	public int getGrassColorAtPos(BlockPos pos)
	{
		return 0x00cc00;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public int getFoliageColorAtPos(BlockPos pos)
	{
		return 0x7d9f39;
	}


}
