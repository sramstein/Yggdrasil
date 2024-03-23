package net.fabricmc.yggdrasil.world.dimension;

import net.fabricmc.yggdrasil.YggdrasilMod;
import net.fabricmc.yggdrasil.item.ModItems;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;

public class ModDimension {
    public static void register() {
        YggdrasilMod.LOGGER.debug("Registering ModDimension for " + YggdrasilMod.MOD_ID);

        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.ICE)
                .destDimID(new Identifier("yggdrasil", "jotunheim"))
                .tintColor(153, 204, 255)
                .lightWithItem(ModItems.JOTUNHEIM_GEMSTONE)
                .onlyLightInOverworld()
                .registerPortal();

        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.NETHERRACK)
                .destDimID(new Identifier("yggdrasil", "helheim"))
                .tintColor(255, 51, 51)
                .lightWithItem(ModItems.HELHEIM_GEMSTONE)
                .onlyLightInOverworld()
                .registerPortal();

        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.GLOWSTONE)
                .destDimID(new Identifier("yggdrasil", "valholl"))
                .tintColor(224, 224, 224)
                .lightWithItem(ModItems.VALHOLL_GEMSTONE)
                .onlyLightInOverworld()
                .registerPortal();
    }
}

