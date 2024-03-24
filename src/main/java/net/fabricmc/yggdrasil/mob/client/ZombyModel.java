package net.fabricmc.yggdrasil.mob.client;

import net.fabricmc.yggdrasil.YggdrasilMod;

import net.fabricmc.yggdrasil.mob.custom.ZombyEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class ZombyModel extends AnimatedGeoModel<ZombyEntity> {
    public Identifier getModelLocation(ZombyEntity object) {
        return new Identifier(YggdrasilMod.MOD_ID, "geo/zomby.geo.json");
    }

    @Override
    public Identifier getTextureLocation(ZombyEntity object) {
        return new Identifier(YggdrasilMod.MOD_ID, "textures/entity/zombie/zomby.png");
    }

    @Override
    public Identifier getAnimationFileLocation(ZombyEntity animatable) {
        return new Identifier(YggdrasilMod.MOD_ID, "animations/zomby.animation.json");
    }
}
