package com.dylancox.dmod.item;

import com.dylancox.dmod.Dmod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TitaniumSpade extends ItemSpade{

	public TitaniumSpade(ToolMaterial material) {
		super(material);
		// TODO Auto-generated constructor stub
		this.setRegistryName(Dmod.MODID, "titaniumSpade");
		this.setUnlocalizedName("titaniumSpade");
		this.setCreativeTab(Dmod.myCreativeTab);
		GameRegistry.register(this);
	}

	
		
	

}