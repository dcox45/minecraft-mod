package com.dylancox.dmod.item;

import com.dylancox.dmod.Dmod;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TitaniumOre extends Item {
	public TitaniumOre() {
		super();
		this.setRegistryName(Dmod.MODID, "titaniumOre");
		this.setUnlocalizedName("titaniumOre");
		GameRegistry.register(this);
		this.setCreativeTab(Dmod.myCreativeTab);
	}
}
