package com.dylancox.dmod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class Generator implements IWorldGenerator{
	@Override 
	public void generate(Random random, int chunkX, int chunkZ, World world, 
			IChunkGenerator chunkGenerator,IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()) {
		case -1:
			generateNether(world, random, chunkX *16, chunkZ *16);
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
		
	}
	
	public void addOreSpawn(Block block, World world, Random random, int blockX, 
			int blockZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY){
		
		for (int k = 0; k < chanceToSpawn; k++) {
			int posX = blockX + random.nextInt(16);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZ + random.nextInt(16);
			(new WorldGenMinable(block.getDefaultState(), maxVeinSize)).generate(world,random,new BlockPos(posX, posY, posZ));
		}
		
	}
	
	public void generateEnd(World world, Random random, int i, int j) {
		
	}
	public void generateNether(World world, Random random, int i, int j) {
			
	}
	public void generateSurface(World world, Random random, int i, int j) {
		this.addOreSpawn(Dmod.titaniumBlock, world, random, i, j, 8, 400, 0, 256);
	}
	
}
