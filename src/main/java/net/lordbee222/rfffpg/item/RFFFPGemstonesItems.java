package net.lordbee222.rfffpg.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.lordbee222.rfffpg.RFFFPGMod;
import net.lordbee222.rfffpg.item.custom.Gemstones.Amber.*;
import net.lordbee222.rfffpg.item.custom.Gemstones.Jade.*;
import net.lordbee222.rfffpg.item.custom.Gemstones.Jasper.*;
import net.lordbee222.rfffpg.item.custom.Gemstones.Opal.*;
import net.lordbee222.rfffpg.item.custom.Gemstones.Ruby.*;
import net.lordbee222.rfffpg.item.custom.Gemstones.Sapphire.*;
import net.lordbee222.rfffpg.item.custom.Gemstones.Topaz.*;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.lordbee222.rfffpg.item.custom.Upgraded.Amber.Rough.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Amber.Flawed.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Amber.Fine.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Amber.Flawless.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Amber.Perfect.*;


public class RFFFPGemstonesItems {
    public static final Item RFFFPG = registerItem("rfffpg",
            new RoughAmberGemstoneItem(new FabricItemSettings()));

    public static final Item ROUGH_AMBER_GEMSTONE = registerItem("rough_amber_gemstone",
            new RoughAmberGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item FLAWED_AMBER_GEMSTONE = registerItem("flawed_amber_gemstone",
            new FlawedAmberGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item FINE_AMBER_GEMSTONE = registerItem("fine_amber_gemstone",
            new FineAmberGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item FLAWLESS_AMBER_GEMSTONE = registerItem("flawless_amber_gemstone",
            new FlawlessAmberGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item PERFECT_AMBER_GEMSTONE = registerItem("perfect_amber_gemstone",
            new PerfectAmberGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));

    public static final Item ROUGH_AMBER_NETHERITE_SWORD = registerItem("rough_amber_netherite_sword",
            new RoughAmberSwordItem(RFFFPGToolMaterial.ROUGH_AMBER_NETHERITE, 7, -2.4f,
                    new FabricItemSettings()));
    public static final Item ROUGH_AMBER_NETHERITE_PICKAXE = registerItem("rough_amber_netherite_pickaxe",
            new RoughAmberPickaxeItem(RFFFPGToolMaterial.ROUGH_AMBER_NETHERITE, 5, -2.8f,
                    new FabricItemSettings()));
    public static final Item ROUGH_AMBER_NETHERITE_AXE = registerItem("rough_amber_netherite_axe",
            new RoughAmberAxeItem(RFFFPGToolMaterial.ROUGH_AMBER_NETHERITE, 9, -3f,
                    new FabricItemSettings()));
    public static final Item ROUGH_AMBER_NETHERITE_SHOVEL = registerItem("rough_amber_netherite_shovel",
            new RoughAmberShovelItem((ToolMaterial) RFFFPGToolMaterial.ROUGH_AMBER_NETHERITE, 5.5F, -3f,
                    new FabricItemSettings()));
    public static final Item ROUGH_AMBER_NETHERITE_HOE = registerItem("rough_amber_netherite_hoe",
            new RoughAmberHoeItem(RFFFPGToolMaterial.ROUGH_AMBER_NETHERITE, 0, 0f,
                    new FabricItemSettings()));

    public static final Item FLAWED_AMBER_NETHERITE_SWORD = registerItem("flawed_amber_netherite_sword",
            new FlawedAmberSwordItem(RFFFPGToolMaterial.FLAWED_AMBER_NETHERITE, 7, -2.4f,
                    new FabricItemSettings()));
    public static final Item FLAWED_AMBER_NETHERITE_PICKAXE = registerItem("flawed_amber_netherite_pickaxe",
            new FlawedAmberPickaxeItem(RFFFPGToolMaterial.FLAWED_AMBER_NETHERITE, 5, -2.8f,
                    new FabricItemSettings()));
    public static final Item FLAWED_AMBER_NETHERITE_AXE = registerItem("flawed_amber_netherite_axe",
            new FlawedAmberAxeItem(RFFFPGToolMaterial.FLAWED_AMBER_NETHERITE, 9, -3f,
                    new FabricItemSettings()));
    public static final Item FLAWED_AMBER_NETHERITE_SHOVEL = registerItem("flawed_amber_netherite_shovel",
            new FlawedAmberShovelItem((ToolMaterial) RFFFPGToolMaterial.FLAWED_AMBER_NETHERITE, 5.5F, -3f,
                    new FabricItemSettings()));
    public static final Item FLAWED_AMBER_NETHERITE_HOE = registerItem("flawed_amber_netherite_hoe",
            new FlawedAmberHoeItem(RFFFPGToolMaterial.FLAWED_AMBER_NETHERITE, 0, 0f,
                    new FabricItemSettings()));

    public static final Item FINE_AMBER_NETHERITE_SWORD = registerItem("fine_amber_netherite_sword",
            new FineAmberSwordItem(RFFFPGToolMaterial.FINE_AMBER_NETHERITE, 7, -2.4f,
                    new FabricItemSettings()));
    public static final Item FINE_AMBER_NETHERITE_PICKAXE = registerItem("fine_amber_netherite_pickaxe",
            new FineAmberPickaxeItem(RFFFPGToolMaterial.FINE_AMBER_NETHERITE, 5, -2.8f,
                    new FabricItemSettings()));
    public static final Item FINE_AMBER_NETHERITE_AXE = registerItem("fine_amber_netherite_axe",
            new FineAmberAxeItem(RFFFPGToolMaterial.FINE_AMBER_NETHERITE, 9, -3f,
                    new FabricItemSettings()));
    public static final Item FINE_AMBER_NETHERITE_SHOVEL = registerItem("fine_amber_netherite_shovel",
            new FineAmberShovelItem((ToolMaterial) RFFFPGToolMaterial.FINE_AMBER_NETHERITE, 5.5F, -3f,
                    new FabricItemSettings()));
    public static final Item FINE_AMBER_NETHERITE_HOE = registerItem("fine_amber_netherite_hoe",
            new FineAmberHoeItem(RFFFPGToolMaterial.FINE_AMBER_NETHERITE, 0, 0f,
                    new FabricItemSettings()));

    public static final Item FLAWLESS_AMBER_NETHERITE_SWORD = registerItem("flawless_amber_netherite_sword",
            new FlawlessAmberSwordItem(RFFFPGToolMaterial.FLAWLESS_AMBER_NETHERITE, 7, -2.4f,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_AMBER_NETHERITE_PICKAXE = registerItem("flawless_amber_netherite_pickaxe",
            new FlawlessAmberPickaxeItem(RFFFPGToolMaterial.FLAWLESS_AMBER_NETHERITE, 5, -2.8f,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_AMBER_NETHERITE_AXE = registerItem("flawless_amber_netherite_axe",
            new FlawlessAmberAxeItem(RFFFPGToolMaterial.FLAWLESS_AMBER_NETHERITE, 9, -3f,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_AMBER_NETHERITE_SHOVEL = registerItem("flawless_amber_netherite_shovel",
            new FlawlessAmberShovelItem((ToolMaterial) RFFFPGToolMaterial.FLAWLESS_AMBER_NETHERITE, 5.5F, -3f,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_AMBER_NETHERITE_HOE = registerItem("flawless_amber_netherite_hoe",
            new FlawlessAmberHoeItem(RFFFPGToolMaterial.FLAWLESS_AMBER_NETHERITE, 0, 0f,
                    new FabricItemSettings()));

    public static final Item PERFECT_AMBER_NETHERITE_SWORD = registerItem("perfect_amber_netherite_sword",
            new PerfectAmberSwordItem(RFFFPGToolMaterial.PERFECT_AMBER_NETHERITE, 7, -2.4f,
                    new FabricItemSettings()));
    public static final Item PERFECT_AMBER_NETHERITE_PICKAXE = registerItem("perfect_amber_netherite_pickaxe",
            new PerfectAmberPickaxeItem(RFFFPGToolMaterial.PERFECT_AMBER_NETHERITE, 5, -2.8f,
                    new FabricItemSettings()));
    public static final Item PERFECT_AMBER_NETHERITE_AXE = registerItem("perfect_amber_netherite_axe",
            new PerfectAmberAxeItem(RFFFPGToolMaterial.PERFECT_AMBER_NETHERITE, 9, -3f,
                    new FabricItemSettings()));
    public static final Item PERFECT_AMBER_NETHERITE_SHOVEL = registerItem("perfect_amber_netherite_shovel",
            new PerfectAmberShovelItem((ToolMaterial) RFFFPGToolMaterial.PERFECT_AMBER_NETHERITE, 5.5F, -3f,
                    new FabricItemSettings()));
    public static final Item PERFECT_AMBER_NETHERITE_HOE = registerItem("perfect_amber_netherite_hoe",
            new PerfectAmberHoeItem(RFFFPGToolMaterial.PERFECT_AMBER_NETHERITE, 0, 0f,
                    new FabricItemSettings()));

    public static final Item ROUGH_JADE_GEMSTONE = registerItem("rough_jade_gemstone",
            new RoughJadeGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item FLAWED_JADE_GEMSTONE = registerItem("flawed_jade_gemstone",
            new FlawedJadeGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item FINE_JADE_GEMSTONE = registerItem("fine_jade_gemstone",
            new FineJadeGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item FLAWLESS_JADE_GEMSTONE = registerItem("flawless_jade_gemstone",
            new FlawlessJadeGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item PERFECT_JADE_GEMSTONE = registerItem("perfect_jade_gemstone",
            new PerfectJadeGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));

    public static final Item ROUGH_JASPER_GEMSTONE = registerItem("rough_jasper_gemstone",
            new RoughJasperGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item FLAWED_JASPER_GEMSTONE = registerItem("flawed_jasper_gemstone",
            new FlawedJasperGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item FINE_JASPER_GEMSTONE = registerItem("fine_jasper_gemstone",
            new FineJasperGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item FLAWLESS_JASPER_GEMSTONE = registerItem("flawless_jasper_gemstone",
            new FlawlessJasperGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item PERFECT_JASPER_GEMSTONE = registerItem("perfect_jasper_gemstone",
            new PerfectJasperGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));

    public static final Item ROUGH_OPAL_GEMSTONE = registerItem("rough_opal_gemstone",
            new RoughOpalGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item FLAWED_OPAL_GEMSTONE = registerItem("flawed_opal_gemstone",
            new FlawedOpalGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item FINE_OPAL_GEMSTONE = registerItem("fine_opal_gemstone",
            new FineOpalGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item FLAWLESS_OPAL_GEMSTONE = registerItem("flawless_opal_gemstone",
            new FlawlessOpalGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item PERFECT_OPAL_GEMSTONE = registerItem("perfect_opal_gemstone",
            new PerfectOpalGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));

    public static final Item ROUGH_RUBY_GEMSTONE = registerItem("rough_ruby_gemstone",
            new RoughRubyGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item FLAWED_RUBY_GEMSTONE = registerItem("flawed_ruby_gemstone",
            new FlawedRubyGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item FINE_RUBY_GEMSTONE = registerItem("fine_ruby_gemstone",
            new FineRubyGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item FLAWLESS_RUBY_GEMSTONE = registerItem("flawless_ruby_gemstone",
            new FlawlessRubyGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item PERFECT_RUBY_GEMSTONE = registerItem("perfect_ruby_gemstone",
            new PerfectRubyGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));

    public static final Item ROUGH_SAPPHIRE_GEMSTONE = registerItem("rough_sapphire_gemstone",
            new RoughSapphireGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item FLAWED_SAPPHIRE_GEMSTONE = registerItem("flawed_sapphire_gemstone",
            new FlawedSapphireGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item FINE_SAPPHIRE_GEMSTONE = registerItem("fine_sapphire_gemstone",
            new FineSapphireGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item FLAWLESS_SAPPHIRE_GEMSTONE = registerItem("flawless_sapphire_gemstone",
            new FlawlessSapphireGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item PERFECT_SAPPHIRE_GEMSTONE = registerItem("perfect_sapphire_gemstone",
            new PerfectSapphireGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));

    public static final Item ROUGH_TOPAZ_GEMSTONE = registerItem("rough_topaz_gemstone",
            new RoughTopazGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item FLAWED_TOPAZ_GEMSTONE = registerItem("flawed_topaz_gemstone",
            new FlawedTopazGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item FINE_TOPAZ_GEMSTONE = registerItem("fine_topaz_gemstone",
            new FineTopazGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item FLAWLESS_TOPAZ_GEMSTONE = registerItem("flawless_topaz_gemstone",
            new FlawlessTopazGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));
    public static final Item PERFECT_TOPAZ_GEMSTONE = registerItem("perfect_topaz_gemstone",
            new PerfectTopazGemstoneItem(new FabricItemSettings().group(RFFFPGemstonesItemGroups.RFFFPG)));







    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(RFFFPGMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Items for " + RFFFPGMod.MOD_ID);
    }
}
