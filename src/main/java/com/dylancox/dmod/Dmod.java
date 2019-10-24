package com.dylancox.dmod;

import com.dylancox.dmod.block.BlockTitanium;
import com.dylancox.dmod.item.TitaniumAxe;
import com.dylancox.dmod.item.TitaniumHoe;
import com.dylancox.dmod.item.TitaniumOre;
import com.dylancox.dmod.item.TitaniumPickaxe;
import com.dylancox.dmod.item.TitaniumSpade;
import com.dylancox.dmod.item.TitaniumSword;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

//This line is not explicit in Manual but is crucial 
@Mod(modid = Dmod.MODID, version = Dmod.VERSION)
public class Dmod {
	
	public static final String MODID = "dmod";
    public static final String VERSION = "1.0";
    
    public static ToolMaterial titaniumMaterial;
    
    public static Item titaniumPickaxe;
    public static Item titaniumAxe;
    public static Item titaniumHoe;
    public static Item titaniumSword;
    public static Item titaniumSpade;
    
    public static Block titaniumBlock; 
    
    public static Item titaniumOre;
    
    Generator generator; 
    
    
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	titaniumMaterial = EnumHelper.addToolMaterial("Titanium", 3, 1561, 20f, 10f, 10);
        titaniumPickaxe = new TitaniumPickaxe(titaniumMaterial);
        titaniumAxe = new TitaniumAxe(titaniumMaterial);
        titaniumHoe = new TitaniumHoe(titaniumMaterial);
        titaniumSword = new TitaniumSword(titaniumMaterial);
        titaniumSpade = new TitaniumSpade(titaniumMaterial);
        
        titaniumBlock = new BlockTitanium();
        
        titaniumOre = new TitaniumOre();
        
        generator = new Generator(); 
        GameRegistry.registerWorldGenerator(generator, 0);

        
        if(event.getSide() == Side.CLIENT) {
        	registerItem(titaniumPickaxe);
        	registerItem(titaniumAxe);
        	registerItem(titaniumHoe);
        	registerItem(titaniumSword);
        	registerItem(titaniumSpade);
        	
        	registerBlock(titaniumBlock);
        	
        	registerItem(titaniumOre);
        }
        
        addRecipes();
        
    }
    
    public void addRecipes() {
    	GameRegistry.addRecipe(new ItemStack(titaniumPickaxe, 1), new Object[] {
        		"ttt", " s ", " s ",
        		Character.valueOf('t'), Blocks.DIRT,
        		Character.valueOf('s'), Items.STICK
        });
    	
    	GameRegistry.addRecipe(new ItemStack(titaniumAxe, 1), new Object[] {
        		"tt", "ts", " s",
        		Character.valueOf('t'), Blocks.DIRT,
        		Character.valueOf('s'), Items.STICK
        });
    	GameRegistry.addRecipe(new ItemStack(titaniumHoe, 1), new Object[] {
        		"tt", " s", " s",
        		Character.valueOf('t'), Blocks.DIRT,
        		Character.valueOf('s'), Items.STICK
        });
    	GameRegistry.addRecipe(new ItemStack(titaniumSword, 1), new Object[] {
        		"t", "t", "s",
        		Character.valueOf('t'), Blocks.DIRT,
        		Character.valueOf('s'), Items.STICK
        });
    	GameRegistry.addRecipe(new ItemStack(titaniumSpade, 1), new Object[] {
        		"t", "s", "s",
        		Character.valueOf('t'), Blocks.DIRT,
        		Character.valueOf('s'), Items.STICK
        });
    }
    
    public void registerItem(Item i) {
    	ModelLoader.setCustomModelResourceLocation(i, 0, 
    			new ModelResourceLocation(i.getRegistryName(), "inventory"));
    }
    
    public void registerBlock(Block b) {
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(b), 0, 
    			new ModelResourceLocation(b.getRegistryName(), "inventory"));
    }
    
    public static CreativeTabs myCreativeTab = new CreativeTabs("Dmodtab") {
    	@Override
    	@SideOnly(Side.CLIENT)
    	public ItemStack getTabIconItem() {
    		return new ItemStack(Dmod.titaniumPickaxe);
    	}
    };

}
