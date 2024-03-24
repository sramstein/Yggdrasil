package net.fabricmc.yggdrasil.mixin;

import net.fabricmc.yggdrasil.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.gen.feature.GeodeFeature;
import net.minecraft.world.gen.feature.GeodeFeatureConfig;
import net.minecraft.world.gen.feature.util.FeatureContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(GeodeFeature.class)
public class CustomGeodeFeature {
    @Overwrite
    public boolean generate(FeatureContext<GeodeFeatureConfig> context) {
        WorldAccess world = context.getWorld();
        BlockPos pos = context.getOrigin();
        BlockState amethysteState = Blocks.AMETHYST_BLOCK.getDefaultState();

        if (world.getBlockState(pos).isOf(amethysteState.getBlock())) {
            world.setBlockState(pos, ModBlocks.ANTARCTICITE_BLOCK.getDefaultState(), 2);
        }
        return true;
    }
}
