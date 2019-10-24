package com.dylancox.dmod.item;

import com.dylancox.dmod.Dmod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TitaniumSword extends ItemSword{

	public TitaniumSword(ToolMaterial material) {
		super(material);
		// TODO Auto-generated constructor stub
		this.setRegistryName(Dmod.MODID, "titaniumSword");
		this.setUnlocalizedName("titaniumSword");
		this.setCreativeTab(Dmod.myCreativeTab);
		GameRegistry.register(this);
	}

	
		
	

}