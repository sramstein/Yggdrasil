package net.fabricmc.yggdrasil.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.yggdrasil.YggdrasilMod;
import net.fabricmc.yggdrasil.world.biome.ModBiome;
import net.fabricmc.yggdrasil.world.dimension.ModDimension;
import net.fabricmc.yggdrasil.world.feature.ModPlacedFeatures;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {
    public static void generateOres() {
        RegistryKey<Biome> jotunheimIceSpikeKey = RegistryKey.of(Registry.BIOME_KEY,
                new Identifier("yggdrasil", "jotunheim_ice_spike"));
        RegistryKey<Biome> jotunheimTaiga = RegistryKey.of(Registry.BIOME_KEY,
                new Identifier("yggdrasil", "jotunheim_taiga"));
        RegistryKey<Biome> jotunheimPlains = RegistryKey.of(Registry.BIOME_KEY,
                new Identifier("yggdrasil", "jotunheim_plains"));
        RegistryKey<Biome> jotunheimSlopes = RegistryKey.of(Registry.BIOME_KEY,
                new Identifier("yggdrasil", "jotunheim_slopes"));

        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(jotunheimIceSpikeKey, jotunheimTaiga, jotunheimPlains, jotunheimSlopes),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.MITHRIL_ORE_PLACED.getKey().get());
    }
}
