package net.fabricmc.yggdrasil.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.yggdrasil.YggdrasilMod;
import net.fabricmc.yggdrasil.block.custom.AncientStone;
import net.fabricmc.yggdrasil.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.ObserverBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {
    public static final Block HELHEIM_BLOCK = registerBlock("helheim_block",
            new ObserverBlock(FabricBlockSettings.of(Material.STONE).strength(-1f).luminance(10)), ModItemGroup.YGGDRASIL);

    public static final Block ANCIENT_STONE = registerBlock("ancient_stone",
            new AncientStone(FabricBlockSettings.of(Material.STONE).strength(-1f).nonOpaque()), ModItemGroup.YGGDRASIL);

    public static final Block MITHRIL_ORE = registerBlock("mithril_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f)), ModItemGroup.YGGDRASIL);

    public static final Block MITHRIL_BLOCK = registerBlock("mithril_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f)), ModItemGroup.YGGDRASIL);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(YggdrasilMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem (String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(YggdrasilMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks() {
        YggdrasilMod.LOGGER.info("Registering ModBlocks for " + YggdrasilMod.MOD_ID);
    }
}
