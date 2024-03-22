package net.fabricmc.yggdrasil.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.yggdrasil.YggdrasilMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup YGGDRASIL = FabricItemGroupBuilder.build(new Identifier(YggdrasilMod.MOD_ID, "yggdrasil"),
            () -> new ItemStack(ModItems.HELHEIM_GEMSTONE));
}
