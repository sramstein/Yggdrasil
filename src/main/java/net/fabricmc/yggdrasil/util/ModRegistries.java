package net.fabricmc.yggdrasil.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.yggdrasil.mob.ModEntities;
import net.fabricmc.yggdrasil.mob.custom.RaccoonEntity;

public class ModRegistries {

    public static void registerModStuffs() {
        registerAttributes();
    }
    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.RACCOON, RaccoonEntity.setAttribute());

    }
}
