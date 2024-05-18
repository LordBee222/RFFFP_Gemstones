package net.lordbee222.rfffpg.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.lordbee222.rfffpg.RFFFPGMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class RFFFPGemstonesItemGroups {
    public static final ItemGroup RFFFPG = FabricItemGroupBuilder.build(new Identifier(RFFFPGMod.MOD_ID, "rfffpg"),
            () -> new ItemStack(RFFFPGemstonesItems.PERFECT_AMBER_GEMSTONE));
}

