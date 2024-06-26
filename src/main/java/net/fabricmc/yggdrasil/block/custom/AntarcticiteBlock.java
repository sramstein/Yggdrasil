package net.fabricmc.yggdrasil.block.custom;

import net.fabricmc.yggdrasil.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;

import java.util.Collections;
import java.util.List;

public class AntarcticiteBlock extends OreBlock {
    public AntarcticiteBlock(Settings settings, UniformIntProvider experienceDropped) {
        super(settings, experienceDropped);
    }

    @Override
    public List<ItemStack> getDroppedStacks(BlockState state, LootContext.Builder builder) {
        return Collections.singletonList(new ItemStack(ModItems.ANTARCTICITE));
    }
}
