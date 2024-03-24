package net.fabricmc.yggdrasil.mob;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.yggdrasil.YggdrasilMod;
import net.fabricmc.yggdrasil.mob.custom.RaccoonEntity;
import net.fabricmc.yggdrasil.mob.custom.ZombyEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<RaccoonEntity> RACCOON = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(YggdrasilMod.MOD_ID, "raccoon"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, RaccoonEntity::new)
                    .dimensions(EntityDimensions.fixed(1.0f, 1.0f)).build()
    );

    public static final EntityType<ZombyEntity> ZOMBY = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(YggdrasilMod.MOD_ID, "zomby"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, ZombyEntity::new)
                    .dimensions(EntityDimensions.fixed(1.0f, 1.0f)).build()
    );
}
