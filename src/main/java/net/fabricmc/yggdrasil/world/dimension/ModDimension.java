package net.fabricmc.yggdrasil.world.dimension;

import net.fabricmc.yggdrasil.YggdrasilMod;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class ModDimension {
    public static final RegistryKey<World> JOTUNHEIM_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(YggdrasilMod.MOD_ID, "jotunheim"));
    public static final RegistryKey<DimensionType> JOTUNHEIM_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY,
            JOTUNHEIM_DIMENSION_KEY.getValue());

    public static void register() {
        YggdrasilMod.LOGGER.debug("Registering ModDimension for " + YggdrasilMod.MOD_ID);
    }
}
