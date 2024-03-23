package net.fabricmc.yggdrasil.block.custom;

import net.fabricmc.yggdrasil.block.ModBlocks;
import net.fabricmc.yggdrasil.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootContext;

import java.util.Collections;
import java.util.List;

public class MithrilBlock extends Block {
    public MithrilBlock(Settings settings) {
        super(settings);
    }

    @Override
    public List<ItemStack> getDroppedStacks(BlockState state, LootContext.Builder builder) {
        return Collections.singletonList(new ItemStack(ModBlocks.MITHRIL_BLOCK));
    }

}
