package net.fabricmc.yggdrasil.world.biome;

import net.fabricmc.yggdrasil.YggdrasilMod;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

public class ModBiome {
    public static final RegistryKey<Biome> JOTUNHEIM_PLAINS = RegistryKey.of(Registry.BIOME_KEY,
            new Identifier(YggdrasilMod.MOD_ID, "jotunheim_plains"));
    public static final RegistryKey<Biome> JOTUNHEIM_ICE_SPIKE = RegistryKey.of(Registry.BIOME_KEY,
            new Identifier(YggdrasilMod.MOD_ID, "jotunheim_ice_spike"));
    public static final RegistryKey<Biome> JOTUNHEIM_TAIGA = RegistryKey.of(Registry.BIOME_KEY,
            new Identifier(YggdrasilMod.MOD_ID, "jotunheim_taiga"));
    public static final RegistryKey<Biome> JOTUNHEIM_SLOPES = RegistryKey.of(Registry.BIOME_KEY,
            new Identifier(YggdrasilMod.MOD_ID, "jotunheim_slopes"));
    public static void register() {
        YggdrasilMod.LOGGER.debug("Registering ModBiome for " + YggdrasilMod.MOD_ID);
    }
}
