package net.lordbee222.rfffpg.item.custom.Gemstones.Ruby;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FlawlessRubyGemstoneItem extends Item {
    public FlawlessRubyGemstoneItem(Settings settings) {
        super(settings);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.rfffpg.flawless_ruby.tooltip"));
    }
    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
