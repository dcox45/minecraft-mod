package com.dylancox.dmod.item;

import com.dylancox.dmod.Dmod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TitaniumAxe extends ItemAxe{

	public TitaniumAxe(ToolMaterial material) {
		super(material, 5, 1557);
		// TODO Auto-generated constructor stub
		this.setRegistryName(Dmod.MODID, "TitaniumAxe");
		this.setUnlocalizedName("titaniumAxe");
		this.setCreativeTab(Dmod.myCreativeTab);
		GameRegistry.register(this);
	}

	
		
	

}