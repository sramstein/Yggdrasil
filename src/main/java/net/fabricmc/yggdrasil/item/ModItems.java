package net.fabricmc.yggdrasil.item;

import net.fabricmc.yggdrasil.YggdrasilMod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.yggdrasil.mob.ModEntities;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item JOTUNHEIM_GEMSTONE = registerItem("jotunheim_gemstone",
        new Item(new FabricItemSettings().group(ModItemGroup.YGGDRASIL)));

    public static final Item HELHEIM_GEMSTONE = registerItem("helheim_gemstone",
            new Item(new FabricItemSettings().group(ModItemGroup.YGGDRASIL)));

    public static final Item VALHOLL_GEMSTONE = registerItem("valholl_gemstone",
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
