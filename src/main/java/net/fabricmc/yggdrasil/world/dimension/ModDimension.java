package net.fabricmc.yggdrasil.world.dimension;

import net.fabricmc.yggdrasil.YggdrasilMod;
import net.fabricmc.yggdrasil.item.ModItems;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
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

//    public static final RegistryKey<World> HELHEIM_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
//            new Identifier(YggdrasilMod.MOD_ID, "helheim"));
//    public static final RegistryKey<DimensionType> HELHEIM_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY,
//            HELHEIM_DIMENSION_KEY.getValue());

//    public static final RegistryKey<World> VALHOLL_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
//            new Identifier(YggdrasilMod.MOD_ID, "valholl"));
//    public static final RegistryKey<DimensionType> VALHOLL_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY,
//            VALHOLL_DIMENSION_KEY.getValue());

    public static void register() {
        YggdrasilMod.LOGGER.debug("Registering ModDimension for " + YggdrasilMod.MOD_ID);

        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.ICE)
                .destDimID(JOTUNHEIM_DIMENSION_KEY.getValue())
                .tintColor(153, 204, 255)
                .lightWithItem(ModItems.JOTUNHEIM_GEMSTONE)
                .onlyLightInOverworld()
                .registerPortal();

//        CustomPortalBuilder.beginPortal()
//                .frameBlock(Blocks.NETHERRACK)
//                .destDimID(HELHEIM_DIMENSION_KEY.getValue())
//                .tintColor(255, 51, 51)
//                .lightWithItem(ModItems.HELHEIM_GEMSTONE)
//                .onlyLightInOverworld()
//                .registerPortal();
//
//        CustomPortalBuilder.beginPortal()
//                .frameBlock(Blocks.GLOWSTONE)
//                .destDimID(VALHOLL_DIMENSION_KEY.getValue())
//                .tintColor(224, 224, 224)
//                .lightWithItem(ModItems.VALHOLL_GEMSTONE)
//                .onlyLightInOverworld()
//                .registerPortal();
    }
}

