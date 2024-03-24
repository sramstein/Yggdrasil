package net.fabricmc.yggdrasil.item.custom;


import net.fabricmc.yggdrasil.item.ModArmorMaterials;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ModBootsItem extends ArmorItem {
    public ModBootsItem(ModArmorMaterials material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, net.minecraft.entity.Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);

        // Appliquer l'enchantement Frost Walker aux bottes
        if (EnchantmentHelper.getLevel(Enchantments.FROST_WALKER, stack) <= 0) {
            stack.addEnchantment(Enchantments.FROST_WALKER, 10);
        }
    }
}
