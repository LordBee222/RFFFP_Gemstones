package net.lordbee222.rfffpg.item.custom.Upgraded.Topaz.Rough;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RoughTopazAxeItem extends AxeItem {
    public RoughTopazAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.rfffpg.rough_topaz_applied.tooltip"));
    }

    @Override
    public boolean isFireproof() {
        return true;
    }
}
