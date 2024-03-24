package net.fabricmc.yggdrasil.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.yggdrasil.mob.ModEntities;
import net.fabricmc.yggdrasil.mob.custom.RaccoonEntity;
import net.fabricmc.yggdrasil.mob.custom.ZombyEntity;

public class ModRegistries {

    public static void registerModStuffs() {
        registerAttributes();
        registerAttributesZ();
    }
    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.RACCOON, RaccoonEntity.setAttribute());
    }

    private static void registerAttributesZ() {
        FabricDefaultAttributeRegistry.register(ModEntities.ZOMBY, ZombyEntity.createZombieAttributes());

    }
}
