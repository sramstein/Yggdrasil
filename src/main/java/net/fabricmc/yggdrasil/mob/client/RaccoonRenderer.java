package net.fabricmc.yggdrasil.mob.client;

import net.fabricmc.yggdrasil.mob.custom.RaccoonEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RaccoonRenderer extends GeoEntityRenderer<RaccoonEntity> {

    public RaccoonRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new RaccoonModel());
    }

    public Identifier getTextureLocation(RaccoonEntity instance) {
        return super.getTextureLocation(instance);
    }
}
