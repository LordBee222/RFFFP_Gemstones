package net.lordbee222.rfffpg.item.custom.Upgraded.Sapphire.Flawless;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FlawlessSapphireArmorItem extends ArmorItem {

    public FlawlessSapphireArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.rfffpg.flawless_sapphire_applied.tooltip"));
    }

    @Override
    public boolean isFireproof() {
        return true;
    }
}
