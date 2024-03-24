package net.fabricmc.yggdrasil.mob.client;

import net.fabricmc.yggdrasil.mob.custom.ZombyEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ZombyRenderer extends GeoEntityRenderer<ZombyEntity>  {
    public ZombyRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new ZombyModel());
    }

    public Identifier getTextureLocation(ZombyEntity instance) {
        return super.getTextureLocation(instance);
    }
}
