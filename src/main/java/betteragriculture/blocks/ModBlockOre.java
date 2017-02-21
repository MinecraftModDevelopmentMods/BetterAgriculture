package betteragriculture.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import betteragriculture.Main;
import betteragriculture.items.ModItems;
import net.minecraft.block.Block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class ModBlockOre extends Block {

	private int meta;
	private int least_quantity;
	private int most_quantity;
	private EntityPlayer player;

	protected ModBlockOre(String unlocalizedName, Material mat, Item nethernickelOre, int meta, int least_quantity, int most_quantity) {
		super(mat);
		this.meta = meta;
		this.least_quantity = least_quantity;
		this.most_quantity = most_quantity;
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(4.0f);
		this.setResistance(15.0f);
		this.setUnlocalizedName(unlocalizedName);
	    this.setCreativeTab(Main.tab);
	}

	protected ModBlockOre(String unlocalizedName, Material mat, Item nethernickelOre, int least_quantity, int most_quantity) {
		this(unlocalizedName, mat, nethernickelOre, 0, least_quantity, most_quantity);
	}

	protected ModBlockOre(String unlocalizedName, Material mat, Item drop) {
		this(unlocalizedName, mat, drop, 1, 1);
	}

	@Override
	public int damageDropped(IBlockState blockstate) {
		return this.meta;
	}

	
	
	
	
    @Override
    public int quantityDropped(IBlockState blockstate, int fortune, Random random) {
        return 1 + random.nextInt(3 + fortune);
    }
    
    
    @Override
    public void harvestBlock(World worldIn, EntityPlayer p, BlockPos pos, IBlockState state, @Nullable TileEntity te, @Nullable ItemStack stack) {
        this.player = p;
        if (!(this.canSilkHarvest(worldIn, pos, state, player) && EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, stack) > 0)) {
            this.dropXpOnBlockBreak(worldIn, pos, 3 + worldIn.rand.nextInt(5));
        }
        super.harvestBlock(worldIn, p, pos, state, te, stack);
    }
    
    @Override
    public void dropXpOnBlockBreak(World worldIn, BlockPos pos, int amt) {
        if (!worldIn.isRemote) {
            while (amt > 0) {
                int i = EntityXPOrb.getXPSplit(amt);
                amt -= i;
                worldIn.spawnEntityInWorld(new EntityXPOrb(worldIn, (double) pos.getX() + 0.5D, (double) pos.getY() + 0.5D, (double) pos.getZ() + 0.5D, i));
            }
        }
    }

    @Override
    public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        List<ItemStack> ret = new ArrayList<ItemStack>();
        Item item = ModItems.slateItem;
        Random rand = world instanceof World ? ((World) world).rand : RANDOM;
        int count = quantityDropped(state, fortune, rand);
        for (int i = 0; i < count; i++) {
            ret.add(new ItemStack(item, 1, this.damageDropped(state)));
        }
        return ret;
    }
    
    
    
    
}
