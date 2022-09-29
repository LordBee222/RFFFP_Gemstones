package net.lordbee222.rfffpgemstones.item;

import net.lordbee222.rfffpgemstones.RFFFPGemstonesMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RFFFPGemstonesItems {




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(RFFFPGemstonesMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + RFFFPGemstonesMod.MOD_ID);
    }
}
