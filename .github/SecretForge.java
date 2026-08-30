package com.secretforge;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = SecretForge.MODID, name = SecretForge.NAME, version = SecretForge.VERSION)
public class SecretForge {
    public static final String MODID = "secretforge";
    public static final String NAME = "Secret Frontier";
    public static final String VERSION = "1.0.0";

    public static final CreativeTabs TAB = new CreativeTabs(MODID) {
        @Override public ItemStack createIcon() {
            return new ItemStack(ModItems.FRAGMENT);
        }
    };

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        GameRegistry.addSmelting(ModBlocks.RAW_CRYSTAL, new ItemStack(ModItems.FRAGMENT, 2), 0.6f);
    }

    @Mod.EventBusSubscriber(modid = MODID)
    public static class Registration {
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> e) {
            ModItems.register(e);
            e.getRegistry().register(new ItemBlock(ModBlocks.RAW_CRYSTAL).setRegistryName(ModBlocks.RAW_CRYSTAL.getRegistryName()));
            e.getRegistry().register(new ItemBlock(ModBlocks.ALTAR).setRegistryName(ModBlocks.ALTAR.getRegistryName()));
        }

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> e) {
            e.getRegistry().registerAll(ModBlocks.RAW_CRYSTAL, ModBlocks.ALTAR);
        }
    }
}
