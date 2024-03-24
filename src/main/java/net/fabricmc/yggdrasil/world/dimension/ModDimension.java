package net.fabricmc.yggdrasil.world.dimension;

import net.fabricmc.yggdrasil.YggdrasilMod;
import net.fabricmc.yggdrasil.item.ModItems;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.dimension.DimensionType;

public class ModDimension {

    public static final RegistryKey<World> JOTUNHEIM_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(YggdrasilMod.MOD_ID, "jotunheim"));
    public static final RegistryKey<DimensionType> JOTUNHEIM_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY,
            JOTUNHEIM_DIMENSION_KEY.getValue());
    public static void register() {
        YggdrasilMod.LOGGER.debug("Registering ModDimension for " + YggdrasilMod.MOD_ID);

        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.PACKED_ICE)
                .destDimID(new Identifier("yggdrasil", "jotunheim"))
                .tintColor(153, 204, 255)
                .lightWithItem(ModItems.JOTUNHEIM_GEMSTONE)
                .onlyLightInOverworld()
                .registerPortal();

        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.CRIMSON_HYPHAE)
                .destDimID(new Identifier("yggdrasil", "helheim"))
                .tintColor(255, 51, 51)
                .lightWithItem(ModItems.HELHEIM_GEMSTONE)
                .onlyLightInOverworld()
                .registerPortal();

        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.RAW_GOLD_BLOCK)
                .destDimID(new Identifier("yggdrasil", "valholl"))
                .tintColor(224, 224, 224)
                .lightWithItem(ModItems.VALHOLL_GEMSTONE)
                .onlyLightInOverworld()
                .registerPortal();
    }
}

