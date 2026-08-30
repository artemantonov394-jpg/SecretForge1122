package com.secretforge;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
    public static final Item FRAGMENT = item("frontier_fragment");
    public static final Item CORE = item("ancient_core");
    public static final Item DUST = item("echo_dust");

    public static final ToolMaterial FRONTIER_MATERIAL =
        EnumHelper.addToolMaterial("FRONTIER", 3, 1850, 8.5F, 4.0F, 18);

    public static final Item SWORD = new ItemSword(FRONTIER_MATERIAL)
        .setRegistryName(SecretForge.MODID, "frontier_blade")
        .setUnlocalizedName(SecretForge.MODID + ".frontier_blade")
        .setCreativeTab(SecretForge.TAB);

    public static final Item PICKAXE = new ItemPickaxe(FRONTIER_MATERIAL)
        .setRegistryName(SecretForge.MODID, "frontier_pickaxe")
        .setUnlocalizedName(SecretForge.MODID + ".frontier_pickaxe")
        .setCreativeTab(SecretForge.TAB);

    private static Item item(String id) {
        return new Item().setRegistryName(SecretForge.MODID, id)
            .setUnlocalizedName(SecretForge.MODID + "." + id)
            .setCreativeTab(SecretForge.TAB);
    }

    public static void register(RegistryEvent.Register<Item> e) {
        e.getRegistry().registerAll(FRAGMENT, CORE, DUST, SWORD, PICKAXE);
    }
}
