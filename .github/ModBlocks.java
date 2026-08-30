package com.secretforge;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ModBlocks {
    public static final Block RAW_CRYSTAL = block("raw_crystal", 3.0F, 6.0F);
    public static final Block ALTAR = block("frontier_altar", 5.0F, 20.0F);

    private static Block block(String id, float hardness, float resistance) {
        return new Block(Material.ROCK)
            .setRegistryName(SecretForge.MODID, id)
            .setUnlocalizedName(SecretForge.MODID + "." + id)
            .setCreativeTab(SecretForge.TAB)
            .setHardness(hardness).setResistance(resistance)
            .setSoundType(SoundType.STONE);
    }
}
