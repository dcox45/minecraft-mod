package com.dylancox.dmod.item;

import com.dylancox.dmod.Dmod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TitaniumHoe extends ItemHoe{

	public TitaniumHoe(ToolMaterial material) {
		super(material);
		// TODO Auto-generated constructor stub
		this.setRegistryName(Dmod.MODID, "titaniumHoe");
		this.setUnlocalizedName("titaniumHoe");
		this.setCreativeTab(Dmod.myCreativeTab);
		GameRegistry.register(this);
	}

	
		
	

}