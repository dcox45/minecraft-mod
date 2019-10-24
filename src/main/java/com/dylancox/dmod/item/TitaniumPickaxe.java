package com.dylancox.dmod.item;

import com.dylancox.dmod.Dmod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TitaniumPickaxe extends ItemPickaxe{

	public TitaniumPickaxe(ToolMaterial material) {
		super(material);
		// TODO Auto-generated constructor stub
		this.setRegistryName(Dmod.MODID, "titaniumPickaxe");
		this.setUnlocalizedName("titaniumPickaxe");
		this.setCreativeTab(Dmod.myCreativeTab);
		GameRegistry.register(this);
	}

	
		
	

}

