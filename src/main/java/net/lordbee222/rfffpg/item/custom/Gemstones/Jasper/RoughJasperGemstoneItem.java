package net.lordbee222.rfffpg.item.custom.Gemstones.Jasper;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RoughJasperGemstoneItem extends Item {
    public RoughJasperGemstoneItem(Settings settings) {
        super(settings);
    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.rfffpg.rough_jasper.tooltip"));
    }
    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
