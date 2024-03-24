package net.fabricmc.yggdrasil.item;

import net.fabricmc.yggdrasil.YggdrasilMod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.yggdrasil.item.custom.*;
import net.fabricmc.yggdrasil.mob.ModEntities;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item JOTUNHEIM_GEMSTONE = registerItem("jotunheim_gemstone",
        new Item(new FabricItemSettings().group(ModItemGroup.YGGDRASIL)));

    public static final Item HELHEIM_GEMSTONE = registerItem("helheim_gemstone",
            new Item(new FabricItemSettings().group(ModItemGroup.YGGDRASIL)));

    public static final Item VALHOLL_GEMSTONE = registerItem("valholl_gemstone",
            new Item(new FabricItemSettings().group(ModItemGroup.YGGDRASIL)));

    public static final Item MITHRIL = registerItem("mithril",
            new Item(new FabricItemSettings().group(ModItemGroup.YGGDRASIL)));

    public static final Item MITHRIL_SWORD = registerItem("mithril_sword",
            new SwordItem(ModToolMaterials.MITHRIL, 1, 2f,
                    new FabricItemSettings().group(ModItemGroup.YGGDRASIL)));

    public static final Item MITHRIL_AXE = registerItem("mithril_axe",
            new ModAxeItem(ModToolMaterials.MITHRIL, 3, 1f,
                    new FabricItemSettings().group(ModItemGroup.YGGDRASIL)));

    public static final Item MITHRIL_HOE = registerItem("mithril_hoe",
            new ModHoeItem(ModToolMaterials.MITHRIL, 0, 0f,
                    new FabricItemSettings().group(ModItemGroup.YGGDRASIL)));
    public static final Item MITHRIL_PICKAXE = registerItem("mithril_pickaxe",
            new ModPickaxeItem(ModToolMaterials.MITHRIL, 1, 0f,
                    new FabricItemSettings().group(ModItemGroup.YGGDRASIL)));
    public static final Item MITHRIL_SHOVEL = registerItem("mithril_shovel",
            new ShovelItem(ModToolMaterials.MITHRIL, 0, 1f,
                    new FabricItemSettings().group(ModItemGroup.YGGDRASIL)));
    public static final Item MITHRIL_HELMET = registerItem("mithril_helmet",
            new ModArmorItem(ModArmorMaterials.MITHRIL, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.YGGDRASIL)));
    public static final Item MITHRIL_CHESTPLATE = registerItem("mithril_chestplate",
            new ArmorItem(ModArmorMaterials.MITHRIL, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.YGGDRASIL)));
    public static final Item MITHRIL_LEGGINGS = registerItem("mithril_leggings",
            new ArmorItem(ModArmorMaterials.MITHRIL, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.YGGDRASIL)));
    public static final Item MITHRIL_BOOTS = registerItem("mithril_boots",
            new ModBootsItem(ModArmorMaterials.MITHRIL, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.YGGDRASIL)));

    public static final Item ANTARCTICITE = registerItem("antarcticite",
            new Item(new FabricItemSettings().group(ModItemGroup.YGGDRASIL)));



    public static final Item RACCOON_SPAWN_EGG = registerItem("raccoon_spawn_egg",
            new SpawnEggItem(ModEntities.RACCOON, 0x948e8d, 0x3b3635,
                    new FabricItemSettings().group(ModItemGroup.YGGDRASIL)));
    private static Item registerItem (String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(YggdrasilMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        YggdrasilMod.LOGGER.info("Registering Mod for items " + YggdrasilMod.MOD_ID);
    }
}
