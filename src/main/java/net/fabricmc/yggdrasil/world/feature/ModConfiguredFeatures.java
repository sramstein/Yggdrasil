package net.fabricmc.yggdrasil.world.feature;

import net.fabricmc.yggdrasil.YggdrasilMod;
import net.fabricmc.yggdrasil.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> JOTUNHEIM_MITHRIL_ORE = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MITHRIL_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_MITHRIL_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> MITHRIL_ORE =
            ConfiguredFeatures.register("mythril_ore", Feature.ORE, new OreFeatureConfig(JOTUNHEIM_MITHRIL_ORE, 9));

    public static void registerCongiguredFeatures() {
        YggdrasilMod.LOGGER.info("Registering ModConfiguredFeatures for " + YggdrasilMod.MOD_ID);
    }
}
