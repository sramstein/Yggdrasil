package net.fabricmc.yggdrasil.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.yggdrasil.YggdrasilMod;
import net.fabricmc.yggdrasil.world.biome.ModBiome;
import net.fabricmc.yggdrasil.world.dimension.ModDimension;
import net.fabricmc.yggdrasil.world.feature.ModPlacedFeatures;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {
    public static void generateOres() {
        // Add ore generation to the custom dimension "Jotunheim"
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiome.JOTUNHEIM_PLAINS),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.MiTHRIL_ORE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiome.JOTUNHEIM_TAIGA),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.MiTHRIL_ORE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiome.JOTUNHEIM_ICE_SPIKE),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.MiTHRIL_ORE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiome.JOTUNHEIM_SLOPES),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.MiTHRIL_ORE_PLACED.getKey().get());

        // Remove ore generation from the overworld
//        BiomeModifications.removeFeature(BiomeSelectors.foundInOverworld(),
//                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.MiTHRIL_ORE_PLACED.getKey().get());
    }
}
