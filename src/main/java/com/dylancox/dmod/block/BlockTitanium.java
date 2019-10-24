package com.dylancox.dmod.block;

import java.util.Random;

import com.dylancox.dmod.Dmod;

import net.minecraft.block.BlockOre;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockTitanium extends BlockOre{
	
	public BlockTitanium() {
		super(); 
		this.setRegistryName(Dmod.MODID, "titaniumBlock");
		this.setUnlocalizedName("titaniumBlock");
		this.setHardness(3.0f);
		this.setResistance(5.0f);
		ItemBlock titaniumItemBlock = new ItemBlock(this);
		titaniumItemBlock.setRegistryName(Dmod.MODID, "titaniumBlock");
		titaniumItemBlock.setUnlocalizedName("titaniumBlock");
		GameRegistry.register(this);
		GameRegistry.register(titaniumItemBlock);
		this.setCreativeTab(Dmod.myCreativeTab);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Dmod.titaniumOre;
	}
	
	@Override
	public int quantityDropped(Random random) {
		return 3 + random.nextInt(4); 
	}

}
