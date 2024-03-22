package net.fabricmc.yggdrasil.world.dimension;

import net.fabricmc.yggdrasil.YggdrasilMod;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class ModDimension {
    public static final RegistryKey<World> YGGDRASIL_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(YggdrasilMod.MOD_ID, "yggdrasil"));
    public static final RegistryKey<DimensionType> YGGDRASIL_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY,
            YGGDRASIL_DIMENSION_KEY.getValue());

    public static void register() {
        YggdrasilMod.LOGGER.debug("Registering Dimension for " + YggdrasilMod.MOD_ID);
    }
}
