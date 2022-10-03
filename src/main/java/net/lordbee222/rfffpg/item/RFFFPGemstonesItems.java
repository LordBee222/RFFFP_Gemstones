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
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.lordbee222.rfffpg.item.custom.Upgraded.Amber.Rough.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Amber.Flawed.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Amber.Fine.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Amber.Flawless.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Amber.Perfect.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Jade.Rough.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Jade.Flawed.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Jade.Fine.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Jade.Flawless.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Jade.Perfect.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Jasper.Rough.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Jasper.Flawed.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Jasper.Fine.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Jasper.Flawless.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Jasper.Perfect.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Opal.Rough.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Opal.Flawed.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Opal.Fine.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Opal.Flawless.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Opal.Perfect.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Ruby.Rough.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Ruby.Flawed.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Ruby.Fine.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Ruby.Flawless.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Ruby.Perfect.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Sapphire.Rough.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Sapphire.Flawed.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Sapphire.Fine.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Sapphire.Flawless.*;
import net.lordbee222.rfffpg.item.custom.Upgraded.Sapphire.Perfect.*;


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
    public static final Item ROUGH_JADE_NETHERITE_SWORD = registerItem("rough_jade_netherite_sword",
            new RoughJadeSwordItem(RFFFPGToolMaterial.ROUGH_JADE_NETHERITE, 7, -2.4f,
                    new FabricItemSettings()));
    public static final Item ROUGH_JADE_NETHERITE_PICKAXE = registerItem("rough_jade_netherite_pickaxe",
            new RoughJadePickaxeItem(RFFFPGToolMaterial.ROUGH_JADE_NETHERITE, 5, -2.8f,
                    new FabricItemSettings()));
    public static final Item ROUGH_JADE_NETHERITE_AXE = registerItem("rough_jade_netherite_axe",
            new RoughJadeAxeItem(RFFFPGToolMaterial.ROUGH_JADE_NETHERITE, 9, -3f,
                    new FabricItemSettings()));
    public static final Item ROUGH_JADE_NETHERITE_SHOVEL = registerItem("rough_jade_netherite_shovel",
            new RoughJadeShovelItem((ToolMaterial) RFFFPGToolMaterial.ROUGH_JADE_NETHERITE, 5.5F, -3f,
                    new FabricItemSettings()));
    public static final Item ROUGH_JADE_NETHERITE_HOE = registerItem("rough_jade_netherite_hoe",
            new RoughJadeHoeItem(RFFFPGToolMaterial.ROUGH_JADE_NETHERITE, 0, 0f,
                    new FabricItemSettings()));
    public static final Item FLAWED_JADE_NETHERITE_SWORD = registerItem("flawed_jade_netherite_sword",
            new FlawedJadeSwordItem(RFFFPGToolMaterial.FLAWED_JADE_NETHERITE, 7, -2.4f,
                    new FabricItemSettings()));
    public static final Item FLAWED_JADE_NETHERITE_PICKAXE = registerItem("flawed_jade_netherite_pickaxe",
            new FlawedJadePickaxeItem(RFFFPGToolMaterial.FLAWED_JADE_NETHERITE, 5, -2.8f,
                    new FabricItemSettings()));
    public static final Item FLAWED_JADE_NETHERITE_AXE = registerItem("flawed_jade_netherite_axe",
            new FlawedJadeAxeItem(RFFFPGToolMaterial.FLAWED_JADE_NETHERITE, 9, -3f,
                    new FabricItemSettings()));
    public static final Item FLAWED_JADE_NETHERITE_SHOVEL = registerItem("flawed_jade_netherite_shovel",
            new FlawedJadeShovelItem((ToolMaterial) RFFFPGToolMaterial.FLAWED_JADE_NETHERITE, 5.5F, -3f,
                    new FabricItemSettings()));
    public static final Item FLAWED_JADE_NETHERITE_HOE = registerItem("flawed_jade_netherite_hoe",
            new FlawedJadeHoeItem(RFFFPGToolMaterial.FLAWED_JADE_NETHERITE, 0, 0f,
                    new FabricItemSettings()));
    public static final Item FINE_JADE_NETHERITE_SWORD = registerItem("fine_jade_netherite_sword",
            new FineJadeSwordItem(RFFFPGToolMaterial.FINE_JADE_NETHERITE, 7, -2.4f,
                    new FabricItemSettings()));
    public static final Item FINE_JADE_NETHERITE_PICKAXE = registerItem("fine_jade_netherite_pickaxe",
            new FineJadePickaxeItem(RFFFPGToolMaterial.FINE_JADE_NETHERITE, 5, -2.8f,
                    new FabricItemSettings()));
    public static final Item FINE_JADE_NETHERITE_AXE = registerItem("fine_jade_netherite_axe",
            new FineJadeAxeItem(RFFFPGToolMaterial.FINE_JADE_NETHERITE, 9, -3f,
                    new FabricItemSettings()));
    public static final Item FINE_JADE_NETHERITE_SHOVEL = registerItem("fine_jade_netherite_shovel",
            new FineJadeShovelItem((ToolMaterial) RFFFPGToolMaterial.FINE_JADE_NETHERITE, 5.5F, -3f,
                    new FabricItemSettings()));
    public static final Item FINE_JADE_NETHERITE_HOE = registerItem("fine_jade_netherite_hoe",
            new FineJadeHoeItem(RFFFPGToolMaterial.FINE_JADE_NETHERITE, 0, 0f,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_JADE_NETHERITE_SWORD = registerItem("flawless_jade_netherite_sword",
            new FlawlessJadeSwordItem(RFFFPGToolMaterial.FLAWLESS_JADE_NETHERITE, 7, -2.4f,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_JADE_NETHERITE_PICKAXE = registerItem("flawless_jade_netherite_pickaxe",
            new FlawlessJadePickaxeItem(RFFFPGToolMaterial.FLAWLESS_JADE_NETHERITE, 5, -2.8f,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_JADE_NETHERITE_AXE = registerItem("flawless_jade_netherite_axe",
            new FlawlessJadeAxeItem(RFFFPGToolMaterial.FLAWLESS_JADE_NETHERITE, 9, -3f,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_JADE_NETHERITE_SHOVEL = registerItem("flawless_jade_netherite_shovel",
            new FlawlessJadeShovelItem((ToolMaterial) RFFFPGToolMaterial.FLAWLESS_JADE_NETHERITE, 5.5F, -3f,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_JADE_NETHERITE_HOE = registerItem("flawless_jade_netherite_hoe",
            new FlawlessJadeHoeItem(RFFFPGToolMaterial.FLAWLESS_JADE_NETHERITE, 0, 0f,
                    new FabricItemSettings()));
    public static final Item PERFECT_JADE_NETHERITE_SWORD = registerItem("perfect_jade_netherite_sword",
            new PerfectJadeSwordItem(RFFFPGToolMaterial.PERFECT_JADE_NETHERITE, 7, -2.4f,
                    new FabricItemSettings()));
    public static final Item PERFECT_JADE_NETHERITE_PICKAXE = registerItem("perfect_jade_netherite_pickaxe",
            new PerfectJadePickaxeItem(RFFFPGToolMaterial.PERFECT_JADE_NETHERITE, 5, -2.8f,
                    new FabricItemSettings()));
    public static final Item PERFECT_JADE_NETHERITE_AXE = registerItem("perfect_jade_netherite_axe",
            new PerfectJadeAxeItem(RFFFPGToolMaterial.PERFECT_JADE_NETHERITE, 9, -3f,
                    new FabricItemSettings()));
    public static final Item PERFECT_JADE_NETHERITE_SHOVEL = registerItem("perfect_jade_netherite_shovel",
            new PerfectJadeShovelItem((ToolMaterial) RFFFPGToolMaterial.PERFECT_JADE_NETHERITE, 5.5F, -3f,
                    new FabricItemSettings()));
    public static final Item PERFECT_JADE_NETHERITE_HOE = registerItem("perfect_jade_netherite_hoe",
            new PerfectJadeHoeItem(RFFFPGToolMaterial.PERFECT_JADE_NETHERITE, 0, 0f,
                    new FabricItemSettings()));
    public static final Item ROUGH_JADE_NETHERITE_HELMET = registerItem("rough_jade_netherite_helmet",
            new RoughJadeArmorItem(RFFFPGArmorMaterials.ROUGH_JADE_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item ROUGH_JADE_NETHERITE_CHESTPLATE = registerItem("rough_jade_netherite_chestplate",
            new RoughJadeArmorItem(RFFFPGArmorMaterials.ROUGH_JADE_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item ROUGH_JADE_NETHERITE_LEGGINGS = registerItem("rough_jade_netherite_leggings",
            new RoughJadeArmorItem(RFFFPGArmorMaterials.ROUGH_JADE_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item ROUGH_JADE_NETHERITE_BOOTS = registerItem("rough_jade_netherite_boots",
            new RoughJadeArmorItem(RFFFPGArmorMaterials.ROUGH_JADE_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings()));
    public static final Item FLAWED_JADE_NETHERITE_HELMET = registerItem("flawed_jade_netherite_helmet",
            new FlawedJadeArmorItem(RFFFPGArmorMaterials.FLAWED_JADE_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item FLAWED_JADE_NETHERITE_CHESTPLATE = registerItem("flawed_jade_netherite_chestplate",
            new FlawedJadeArmorItem(RFFFPGArmorMaterials.FLAWED_JADE_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item FLAWED_JADE_NETHERITE_LEGGINGS = registerItem("flawed_jade_netherite_leggings",
            new FlawedJadeArmorItem(RFFFPGArmorMaterials.FLAWED_JADE_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item FLAWED_JADE_NETHERITE_BOOTS = registerItem("flawed_jade_netherite_boots",
            new FlawedJadeArmorItem(RFFFPGArmorMaterials.FLAWED_JADE_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings()));
    public static final Item FINE_JADE_NETHERITE_HELMET = registerItem("fine_jade_netherite_helmet",
            new FineJadeArmorItem(RFFFPGArmorMaterials.FINE_JADE_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item FINE_JADE_NETHERITE_CHESTPLATE = registerItem("fine_jade_netherite_chestplate",
            new FineJadeArmorItem(RFFFPGArmorMaterials.FINE_JADE_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item FINE_JADE_NETHERITE_LEGGINGS = registerItem("fine_jade_netherite_leggings",
            new FineJadeArmorItem(RFFFPGArmorMaterials.FINE_JADE_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item FINE_JADE_NETHERITE_BOOTS = registerItem("fine_jade_netherite_boots",
            new FineJadeArmorItem(RFFFPGArmorMaterials.FINE_JADE_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_JADE_NETHERITE_HELMET = registerItem("flawless_jade_netherite_helmet",
            new FlawlessJadeArmorItem(RFFFPGArmorMaterials.FLAWLESS_JADE_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_JADE_NETHERITE_CHESTPLATE = registerItem("flawless_jade_netherite_chestplate",
            new FlawlessJadeArmorItem(RFFFPGArmorMaterials.FLAWLESS_JADE_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_JADE_NETHERITE_LEGGINGS = registerItem("flawless_jade_netherite_leggings",
            new FlawlessJadeArmorItem(RFFFPGArmorMaterials.FLAWLESS_JADE_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_JADE_NETHERITE_BOOTS = registerItem("flawless_jade_netherite_boots",
            new FlawlessJadeArmorItem(RFFFPGArmorMaterials.FLAWLESS_JADE_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings()));
    public static final Item PERFECT_JADE_NETHERITE_HELMET = registerItem("perfect_jade_netherite_helmet",
            new PerfectJadeArmorItem(RFFFPGArmorMaterials.PERFECT_JADE_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item PERFECT_JADE_NETHERITE_CHESTPLATE = registerItem("perfect_jade_netherite_chestplate",
            new PerfectJadeArmorItem(RFFFPGArmorMaterials.PERFECT_JADE_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item PERFECT_JADE_NETHERITE_LEGGINGS = registerItem("perfect_jade_netherite_leggings",
            new PerfectJadeArmorItem(RFFFPGArmorMaterials.PERFECT_JADE_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item PERFECT_JADE_NETHERITE_BOOTS = registerItem("perfect_jade_netherite_boots",
            new PerfectJadeArmorItem(RFFFPGArmorMaterials.PERFECT_JADE_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings()));



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
    public static final Item ROUGH_JASPER_NETHERITE_SWORD = registerItem("rough_jasper_netherite_sword",
            new RoughJasperSwordItem(RFFFPGToolMaterial.ROUGH_JASPER_NETHERITE, 7, -2.4f,
                    new FabricItemSettings()));
    public static final Item ROUGH_JASPER_NETHERITE_PICKAXE = registerItem("rough_jasper_netherite_pickaxe",
            new RoughJasperPickaxeItem(RFFFPGToolMaterial.ROUGH_JASPER_NETHERITE, 5, -2.8f,
                    new FabricItemSettings()));
    public static final Item ROUGH_JASPER_NETHERITE_AXE = registerItem("rough_jasper_netherite_axe",
            new RoughJasperAxeItem(RFFFPGToolMaterial.ROUGH_JASPER_NETHERITE, 9, -3f,
                    new FabricItemSettings()));
    public static final Item ROUGH_JASPER_NETHERITE_SHOVEL = registerItem("rough_jasper_netherite_shovel",
            new RoughJasperShovelItem((ToolMaterial) RFFFPGToolMaterial.ROUGH_JASPER_NETHERITE, 5.5F, -3f,
                    new FabricItemSettings()));
    public static final Item ROUGH_JASPER_NETHERITE_HOE = registerItem("rough_jasper_netherite_hoe",
            new RoughJasperHoeItem(RFFFPGToolMaterial.ROUGH_JASPER_NETHERITE, 0, 0f,
                    new FabricItemSettings()));
    public static final Item FLAWED_JASPER_NETHERITE_SWORD = registerItem("flawed_jasper_netherite_sword",
            new FlawedJasperSwordItem(RFFFPGToolMaterial.FLAWED_JASPER_NETHERITE, 7, -2.4f,
                    new FabricItemSettings()));
    public static final Item FLAWED_JASPER_NETHERITE_PICKAXE = registerItem("flawed_jasper_netherite_pickaxe",
            new FlawedJasperPickaxeItem(RFFFPGToolMaterial.FLAWED_JASPER_NETHERITE, 5, -2.8f,
                    new FabricItemSettings()));
    public static final Item FLAWED_JASPER_NETHERITE_AXE = registerItem("flawed_jasper_netherite_axe",
            new FlawedJasperAxeItem(RFFFPGToolMaterial.FLAWED_JASPER_NETHERITE, 9, -3f,
                    new FabricItemSettings()));
    public static final Item FLAWED_JASPER_NETHERITE_SHOVEL = registerItem("flawed_jasper_netherite_shovel",
            new FlawedJasperShovelItem((ToolMaterial) RFFFPGToolMaterial.FLAWED_JASPER_NETHERITE, 5.5F, -3f,
                    new FabricItemSettings()));
    public static final Item FLAWED_JASPER_NETHERITE_HOE = registerItem("flawed_jasper_netherite_hoe",
            new FlawedJasperHoeItem(RFFFPGToolMaterial.FLAWED_JASPER_NETHERITE, 0, 0f,
                    new FabricItemSettings()));
    public static final Item FINE_JASPER_NETHERITE_SWORD = registerItem("fine_jasper_netherite_sword",
            new FineJasperSwordItem(RFFFPGToolMaterial.FINE_JASPER_NETHERITE, 7, -2.4f,
                    new FabricItemSettings()));
    public static final Item FINE_JASPER_NETHERITE_PICKAXE = registerItem("fine_jasper_netherite_pickaxe",
            new FineJasperPickaxeItem(RFFFPGToolMaterial.FINE_JASPER_NETHERITE, 5, -2.8f,
                    new FabricItemSettings()));
    public static final Item FINE_JASPER_NETHERITE_AXE = registerItem("fine_jasper_netherite_axe",
            new FineJasperAxeItem(RFFFPGToolMaterial.FINE_JASPER_NETHERITE, 9, -3f,
                    new FabricItemSettings()));
    public static final Item FINE_JASPER_NETHERITE_SHOVEL = registerItem("fine_jasper_netherite_shovel",
            new FineJasperShovelItem((ToolMaterial) RFFFPGToolMaterial.FINE_JASPER_NETHERITE, 5.5F, -3f,
                    new FabricItemSettings()));
    public static final Item FINE_JASPER_NETHERITE_HOE = registerItem("fine_jasper_netherite_hoe",
            new FineJasperHoeItem(RFFFPGToolMaterial.FINE_JASPER_NETHERITE, 0, 0f,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_JASPER_NETHERITE_SWORD = registerItem("flawless_jasper_netherite_sword",
            new FlawlessJasperSwordItem(RFFFPGToolMaterial.FLAWLESS_JASPER_NETHERITE, 7, -2.4f,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_JASPER_NETHERITE_PICKAXE = registerItem("flawless_jasper_netherite_pickaxe",
            new FlawlessJasperPickaxeItem(RFFFPGToolMaterial.FLAWLESS_JASPER_NETHERITE, 5, -2.8f,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_JASPER_NETHERITE_AXE = registerItem("flawless_jasper_netherite_axe",
            new FlawlessJasperAxeItem(RFFFPGToolMaterial.FLAWLESS_JASPER_NETHERITE, 9, -3f,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_JASPER_NETHERITE_SHOVEL = registerItem("flawless_jasper_netherite_shovel",
            new FlawlessJasperShovelItem((ToolMaterial) RFFFPGToolMaterial.FLAWLESS_JASPER_NETHERITE, 5.5F, -3f,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_JASPER_NETHERITE_HOE = registerItem("flawless_jasper_netherite_hoe",
            new FlawlessJasperHoeItem(RFFFPGToolMaterial.FLAWLESS_JASPER_NETHERITE, 0, 0f,
                    new FabricItemSettings()));
    public static final Item PERFECT_JASPER_NETHERITE_SWORD = registerItem("perfect_jasper_netherite_sword",
            new PerfectJasperSwordItem(RFFFPGToolMaterial.PERFECT_JASPER_NETHERITE, 7, -2.4f,
                    new FabricItemSettings()));
    public static final Item PERFECT_JASPER_NETHERITE_PICKAXE = registerItem("perfect_jasper_netherite_pickaxe",
            new PerfectJasperPickaxeItem(RFFFPGToolMaterial.PERFECT_JASPER_NETHERITE, 5, -2.8f,
                    new FabricItemSettings()));
    public static final Item PERFECT_JASPER_NETHERITE_AXE = registerItem("perfect_jasper_netherite_axe",
            new PerfectJasperAxeItem(RFFFPGToolMaterial.PERFECT_JASPER_NETHERITE, 9, -3f,
                    new FabricItemSettings()));
    public static final Item PERFECT_JASPER_NETHERITE_SHOVEL = registerItem("perfect_jasper_netherite_shovel",
            new PerfectJasperShovelItem((ToolMaterial) RFFFPGToolMaterial.PERFECT_JASPER_NETHERITE, 5.5F, -3f,
                    new FabricItemSettings()));
    public static final Item PERFECT_JASPER_NETHERITE_HOE = registerItem("perfect_jasper_netherite_hoe",
            new PerfectJasperHoeItem(RFFFPGToolMaterial.PERFECT_JASPER_NETHERITE, 0, 0f,
                    new FabricItemSettings()));
    public static final Item ROUGH_JASPER_NETHERITE_HELMET = registerItem("rough_jasper_netherite_helmet",
            new RoughJasperArmorItem(RFFFPGArmorMaterials.ROUGH_JASPER_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item ROUGH_JASPER_NETHERITE_CHESTPLATE = registerItem("rough_jasper_netherite_chestplate",
            new RoughJasperArmorItem(RFFFPGArmorMaterials.ROUGH_JASPER_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item ROUGH_JASPER_NETHERITE_LEGGINGS = registerItem("rough_jasper_netherite_leggings",
            new RoughJasperArmorItem(RFFFPGArmorMaterials.ROUGH_JASPER_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item ROUGH_JASPER_NETHERITE_BOOTS = registerItem("rough_jasper_netherite_boots",
            new RoughJasperArmorItem(RFFFPGArmorMaterials.ROUGH_JASPER_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings()));
    public static final Item FLAWED_JASPER_NETHERITE_HELMET = registerItem("flawed_jasper_netherite_helmet",
            new FlawedJasperArmorItem(RFFFPGArmorMaterials.FLAWED_JASPER_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item FLAWED_JASPER_NETHERITE_CHESTPLATE = registerItem("flawed_jasper_netherite_chestplate",
            new FlawedJasperArmorItem(RFFFPGArmorMaterials.FLAWED_JASPER_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item FLAWED_JASPER_NETHERITE_LEGGINGS = registerItem("flawed_jasper_netherite_leggings",
            new FlawedJasperArmorItem(RFFFPGArmorMaterials.FLAWED_JASPER_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item FLAWED_JASPER_NETHERITE_BOOTS = registerItem("flawed_jasper_netherite_boots",
            new FlawedJasperArmorItem(RFFFPGArmorMaterials.FLAWED_JASPER_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings()));
    public static final Item FINE_JASPER_NETHERITE_HELMET = registerItem("fine_jasper_netherite_helmet",
            new FineJasperArmorItem(RFFFPGArmorMaterials.FINE_JASPER_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item FINE_JASPER_NETHERITE_CHESTPLATE = registerItem("fine_jasper_netherite_chestplate",
            new FineJasperArmorItem(RFFFPGArmorMaterials.FINE_JASPER_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item FINE_JASPER_NETHERITE_LEGGINGS = registerItem("fine_jasper_netherite_leggings",
            new FineJasperArmorItem(RFFFPGArmorMaterials.FINE_JASPER_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item FINE_JASPER_NETHERITE_BOOTS = registerItem("fine_jasper_netherite_boots",
            new FineJasperArmorItem(RFFFPGArmorMaterials.FINE_JASPER_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_JASPER_NETHERITE_HELMET = registerItem("flawless_jasper_netherite_helmet",
            new FlawlessJasperArmorItem(RFFFPGArmorMaterials.FLAWLESS_JASPER_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_JASPER_NETHERITE_CHESTPLATE = registerItem("flawless_jasper_netherite_chestplate",
            new FlawlessJasperArmorItem(RFFFPGArmorMaterials.FLAWLESS_JASPER_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_JASPER_NETHERITE_LEGGINGS = registerItem("flawless_jasper_netherite_leggings",
            new FlawlessJasperArmorItem(RFFFPGArmorMaterials.FLAWLESS_JASPER_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_JASPER_NETHERITE_BOOTS = registerItem("flawless_jasper_netherite_boots",
            new FlawlessJasperArmorItem(RFFFPGArmorMaterials.FLAWLESS_JASPER_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings()));
    public static final Item PERFECT_JASPER_NETHERITE_HELMET = registerItem("perfect_jasper_netherite_helmet",
            new PerfectJasperArmorItem(RFFFPGArmorMaterials.PERFECT_JASPER_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item PERFECT_JASPER_NETHERITE_CHESTPLATE = registerItem("perfect_jasper_netherite_chestplate",
            new PerfectJasperArmorItem(RFFFPGArmorMaterials.PERFECT_JASPER_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item PERFECT_JASPER_NETHERITE_LEGGINGS = registerItem("perfect_jasper_netherite_leggings",
            new PerfectJasperArmorItem(RFFFPGArmorMaterials.PERFECT_JASPER_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item PERFECT_JASPER_NETHERITE_BOOTS = registerItem("perfect_jasper_netherite_boots",
            new PerfectJasperArmorItem(RFFFPGArmorMaterials.PERFECT_JASPER_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings()));



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
    public static final Item ROUGH_OPAL_NETHERITE_HELMET = registerItem("rough_opal_netherite_helmet",
            new RoughOpalArmorItem(RFFFPGArmorMaterials.ROUGH_OPAL_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item ROUGH_OPAL_NETHERITE_CHESTPLATE = registerItem("rough_opal_netherite_chestplate",
            new RoughOpalArmorItem(RFFFPGArmorMaterials.ROUGH_OPAL_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item ROUGH_OPAL_NETHERITE_LEGGINGS = registerItem("rough_opal_netherite_leggings",
            new RoughOpalArmorItem(RFFFPGArmorMaterials.ROUGH_OPAL_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item ROUGH_OPAL_NETHERITE_BOOTS = registerItem("rough_opal_netherite_boots",
            new RoughOpalArmorItem(RFFFPGArmorMaterials.ROUGH_OPAL_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings()));
    public static final Item FLAWED_OPAL_NETHERITE_HELMET = registerItem("flawed_opal_netherite_helmet",
            new FlawedOpalArmorItem(RFFFPGArmorMaterials.FLAWED_OPAL_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item FLAWED_OPAL_NETHERITE_CHESTPLATE = registerItem("flawed_opal_netherite_chestplate",
            new FlawedOpalArmorItem(RFFFPGArmorMaterials.FLAWED_OPAL_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item FLAWED_OPAL_NETHERITE_LEGGINGS = registerItem("flawed_opal_netherite_leggings",
            new FlawedOpalArmorItem(RFFFPGArmorMaterials.FLAWED_OPAL_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item FLAWED_OPAL_NETHERITE_BOOTS = registerItem("flawed_opal_netherite_boots",
            new FlawedOpalArmorItem(RFFFPGArmorMaterials.FLAWED_OPAL_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings()));
    public static final Item FINE_OPAL_NETHERITE_HELMET = registerItem("fine_opal_netherite_helmet",
            new FineOpalArmorItem(RFFFPGArmorMaterials.FINE_OPAL_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item FINE_OPAL_NETHERITE_CHESTPLATE = registerItem("fine_opal_netherite_chestplate",
            new FineOpalArmorItem(RFFFPGArmorMaterials.FINE_OPAL_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item FINE_OPAL_NETHERITE_LEGGINGS = registerItem("fine_opal_netherite_leggings",
            new FineOpalArmorItem(RFFFPGArmorMaterials.FINE_OPAL_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item FINE_OPAL_NETHERITE_BOOTS = registerItem("fine_opal_netherite_boots",
            new FineOpalArmorItem(RFFFPGArmorMaterials.FINE_OPAL_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_OPAL_NETHERITE_HELMET = registerItem("flawless_opal_netherite_helmet",
            new FlawlessOpalArmorItem(RFFFPGArmorMaterials.FLAWLESS_OPAL_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_OPAL_NETHERITE_CHESTPLATE = registerItem("flawless_opal_netherite_chestplate",
            new FlawlessOpalArmorItem(RFFFPGArmorMaterials.FLAWLESS_OPAL_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_OPAL_NETHERITE_LEGGINGS = registerItem("flawless_opal_netherite_leggings",
            new FlawlessOpalArmorItem(RFFFPGArmorMaterials.FLAWLESS_OPAL_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_OPAL_NETHERITE_BOOTS = registerItem("flawless_opal_netherite_boots",
            new FlawlessOpalArmorItem(RFFFPGArmorMaterials.FLAWLESS_OPAL_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings()));
    public static final Item PERFECT_OPAL_NETHERITE_HELMET = registerItem("perfect_opal_netherite_helmet",
            new PerfectOpalArmorItem(RFFFPGArmorMaterials.PERFECT_OPAL_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item PERFECT_OPAL_NETHERITE_CHESTPLATE = registerItem("perfect_opal_netherite_chestplate",
            new PerfectOpalArmorItem(RFFFPGArmorMaterials.PERFECT_OPAL_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item PERFECT_OPAL_NETHERITE_LEGGINGS = registerItem("perfect_opal_netherite_leggings",
            new PerfectOpalArmorItem(RFFFPGArmorMaterials.PERFECT_OPAL_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item PERFECT_OPAL_NETHERITE_BOOTS = registerItem("perfect_opal_netherite_boots",
            new PerfectOpalArmorItem(RFFFPGArmorMaterials.PERFECT_OPAL_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings()));



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
    public static final Item ROUGH_RUBY_NETHERITE_SWORD = registerItem("rough_ruby_netherite_sword",
            new RoughRubySwordItem(RFFFPGToolMaterial.ROUGH_RUBY_NETHERITE, 8, -2.4f,
                    new FabricItemSettings()));
    public static final Item ROUGH_RUBY_NETHERITE_PICKAXE = registerItem("rough_ruby_netherite_pickaxe",
            new RoughRubyPickaxeItem(RFFFPGToolMaterial.ROUGH_RUBY_NETHERITE, 6, -2.8f,
                    new FabricItemSettings()));
    public static final Item ROUGH_RUBY_NETHERITE_AXE = registerItem("rough_ruby_netherite_axe",
            new RoughRubyAxeItem(RFFFPGToolMaterial.ROUGH_RUBY_NETHERITE, 10, -3f,
                    new FabricItemSettings()));
    public static final Item ROUGH_RUBY_NETHERITE_SHOVEL = registerItem("rough_ruby_netherite_shovel",
            new RoughRubyShovelItem((ToolMaterial) RFFFPGToolMaterial.ROUGH_RUBY_NETHERITE, 6.5F, -3f,
                    new FabricItemSettings()));
    public static final Item ROUGH_RUBY_NETHERITE_HOE = registerItem("rough_ruby_netherite_hoe",
            new RoughRubyHoeItem(RFFFPGToolMaterial.ROUGH_RUBY_NETHERITE, 1, 0f,
                    new FabricItemSettings()));
    public static final Item FLAWED_RUBY_NETHERITE_SWORD = registerItem("flawed_ruby_netherite_sword",
            new FlawedRubySwordItem(RFFFPGToolMaterial.FLAWED_RUBY_NETHERITE, 9, -2.4f,
                    new FabricItemSettings()));
    public static final Item FLAWED_RUBY_NETHERITE_PICKAXE = registerItem("flawed_ruby_netherite_pickaxe",
            new FlawedRubyPickaxeItem(RFFFPGToolMaterial.FLAWED_RUBY_NETHERITE, 7, -2.8f,
                    new FabricItemSettings()));
    public static final Item FLAWED_RUBY_NETHERITE_AXE = registerItem("flawed_ruby_netherite_axe",
            new FlawedRubyAxeItem(RFFFPGToolMaterial.FLAWED_RUBY_NETHERITE, 11, -3f,
                    new FabricItemSettings()));
    public static final Item FLAWED_RUBY_NETHERITE_SHOVEL = registerItem("flawed_ruby_netherite_shovel",
            new FlawedRubyShovelItem((ToolMaterial) RFFFPGToolMaterial.FLAWED_RUBY_NETHERITE, 7.5F, -3f,
                    new FabricItemSettings()));
    public static final Item FLAWED_RUBY_NETHERITE_HOE = registerItem("flawed_ruby_netherite_hoe",
            new FlawedRubyHoeItem(RFFFPGToolMaterial.FLAWED_RUBY_NETHERITE, 2, 0f,
                    new FabricItemSettings()));
    public static final Item FINE_RUBY_NETHERITE_SWORD = registerItem("fine_ruby_netherite_sword",
            new FineRubySwordItem(RFFFPGToolMaterial.FINE_RUBY_NETHERITE, 11, -2.4f,
                    new FabricItemSettings()));
    public static final Item FINE_RUBY_NETHERITE_PICKAXE = registerItem("fine_ruby_netherite_pickaxe",
            new FineRubyPickaxeItem(RFFFPGToolMaterial.FINE_RUBY_NETHERITE, 9, -2.8f,
                    new FabricItemSettings()));
    public static final Item FINE_RUBY_NETHERITE_AXE = registerItem("fine_ruby_netherite_axe",
            new FineRubyAxeItem(RFFFPGToolMaterial.FINE_RUBY_NETHERITE, 13, -3f,
                    new FabricItemSettings()));
    public static final Item FINE_RUBY_NETHERITE_SHOVEL = registerItem("fine_ruby_netherite_shovel",
            new FineRubyShovelItem((ToolMaterial) RFFFPGToolMaterial.FINE_RUBY_NETHERITE, 9.5F, -3f,
                    new FabricItemSettings()));
    public static final Item FINE_RUBY_NETHERITE_HOE = registerItem("fine_ruby_netherite_hoe",
            new FineRubyHoeItem(RFFFPGToolMaterial.FINE_RUBY_NETHERITE, 4, 0f,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_RUBY_NETHERITE_SWORD = registerItem("flawless_ruby_netherite_sword",
            new FlawlessRubySwordItem(RFFFPGToolMaterial.FLAWLESS_RUBY_NETHERITE, 15, -2.4f,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_RUBY_NETHERITE_PICKAXE = registerItem("flawless_ruby_netherite_pickaxe",
            new FlawlessRubyPickaxeItem(RFFFPGToolMaterial.FLAWLESS_RUBY_NETHERITE, 13, -2.8f,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_RUBY_NETHERITE_AXE = registerItem("flawless_ruby_netherite_axe",
            new FlawlessRubyAxeItem(RFFFPGToolMaterial.FLAWLESS_RUBY_NETHERITE, 17, -3f,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_RUBY_NETHERITE_SHOVEL = registerItem("flawless_ruby_netherite_shovel",
            new FlawlessRubyShovelItem((ToolMaterial) RFFFPGToolMaterial.FLAWLESS_RUBY_NETHERITE, 13.5F, -3f,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_RUBY_NETHERITE_HOE = registerItem("flawless_ruby_netherite_hoe",
            new FlawlessRubyHoeItem(RFFFPGToolMaterial.FLAWLESS_RUBY_NETHERITE, 8, 0f,
                    new FabricItemSettings()));
    public static final Item PERFECT_RUBY_NETHERITE_SWORD = registerItem("perfect_ruby_netherite_sword",
            new PerfectRubySwordItem(RFFFPGToolMaterial.PERFECT_RUBY_NETHERITE, 23, -2.4f,
                    new FabricItemSettings()));
    public static final Item PERFECT_RUBY_NETHERITE_PICKAXE = registerItem("perfect_ruby_netherite_pickaxe",
            new PerfectRubyPickaxeItem(RFFFPGToolMaterial.PERFECT_RUBY_NETHERITE, 21, -2.8f,
                    new FabricItemSettings()));
    public static final Item PERFECT_RUBY_NETHERITE_AXE = registerItem("perfect_ruby_netherite_axe",
            new PerfectRubyAxeItem(RFFFPGToolMaterial.PERFECT_RUBY_NETHERITE, 25, -3f,
                    new FabricItemSettings()));
    public static final Item PERFECT_RUBY_NETHERITE_SHOVEL = registerItem("perfect_ruby_netherite_shovel",
            new PerfectRubyShovelItem((ToolMaterial) RFFFPGToolMaterial.PERFECT_RUBY_NETHERITE, 21.5F, -3f,
                    new FabricItemSettings()));
    public static final Item PERFECT_RUBY_NETHERITE_HOE = registerItem("perfect_ruby_netherite_hoe",
            new PerfectRubyHoeItem(RFFFPGToolMaterial.PERFECT_RUBY_NETHERITE, 16, 0f,
                    new FabricItemSettings()));



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
    public static final Item ROUGH_SAPPHIRE_NETHERITE_HELMET = registerItem("rough_sapphire_netherite_helmet",
            new RoughSapphireArmorItem(RFFFPGArmorMaterials.ROUGH_SAPPHIRE_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item ROUGH_SAPPHIRE_NETHERITE_CHESTPLATE = registerItem("rough_sapphire_netherite_chestplate",
            new RoughSapphireArmorItem(RFFFPGArmorMaterials.ROUGH_SAPPHIRE_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item ROUGH_SAPPHIRE_NETHERITE_LEGGINGS = registerItem("rough_sapphire_netherite_leggings",
            new RoughSapphireArmorItem(RFFFPGArmorMaterials.ROUGH_SAPPHIRE_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item ROUGH_SAPPHIRE_NETHERITE_BOOTS = registerItem("rough_sapphire_netherite_boots",
            new RoughSapphireArmorItem(RFFFPGArmorMaterials.ROUGH_SAPPHIRE_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings()));
    public static final Item FLAWED_SAPPHIRE_NETHERITE_HELMET = registerItem("flawed_sapphire_netherite_helmet",
            new FlawedSapphireArmorItem(RFFFPGArmorMaterials.FLAWED_SAPPHIRE_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item FLAWED_SAPPHIRE_NETHERITE_CHESTPLATE = registerItem("flawed_sapphire_netherite_chestplate",
            new FlawedSapphireArmorItem(RFFFPGArmorMaterials.FLAWED_SAPPHIRE_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item FLAWED_SAPPHIRE_NETHERITE_LEGGINGS = registerItem("flawed_sapphire_netherite_leggings",
            new FlawedSapphireArmorItem(RFFFPGArmorMaterials.FLAWED_SAPPHIRE_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item FLAWED_SAPPHIRE_NETHERITE_BOOTS = registerItem("flawed_sapphire_netherite_boots",
            new FlawedSapphireArmorItem(RFFFPGArmorMaterials.FLAWED_SAPPHIRE_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings()));
    public static final Item FINE_SAPPHIRE_NETHERITE_HELMET = registerItem("fine_sapphire_netherite_helmet",
            new FineSapphireArmorItem(RFFFPGArmorMaterials.FINE_SAPPHIRE_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item FINE_SAPPHIRE_NETHERITE_CHESTPLATE = registerItem("fine_sapphire_netherite_chestplate",
            new FineSapphireArmorItem(RFFFPGArmorMaterials.FINE_SAPPHIRE_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item FINE_SAPPHIRE_NETHERITE_LEGGINGS = registerItem("fine_sapphire_netherite_leggings",
            new FineSapphireArmorItem(RFFFPGArmorMaterials.FINE_SAPPHIRE_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item FINE_SAPPHIRE_NETHERITE_BOOTS = registerItem("fine_sapphire_netherite_boots",
            new FineSapphireArmorItem(RFFFPGArmorMaterials.FINE_SAPPHIRE_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_SAPPHIRE_NETHERITE_HELMET = registerItem("flawless_sapphire_netherite_helmet",
            new FlawlessSapphireArmorItem(RFFFPGArmorMaterials.FLAWLESS_SAPPHIRE_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_SAPPHIRE_NETHERITE_CHESTPLATE = registerItem("flawless_sapphire_netherite_chestplate",
            new FlawlessSapphireArmorItem(RFFFPGArmorMaterials.FLAWLESS_SAPPHIRE_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_SAPPHIRE_NETHERITE_LEGGINGS = registerItem("flawless_sapphire_netherite_leggings",
            new FlawlessSapphireArmorItem(RFFFPGArmorMaterials.FLAWLESS_SAPPHIRE_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item FLAWLESS_SAPPHIRE_NETHERITE_BOOTS = registerItem("flawless_sapphire_netherite_boots",
            new FlawlessSapphireArmorItem(RFFFPGArmorMaterials.FLAWLESS_SAPPHIRE_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings()));
    public static final Item PERFECT_SAPPHIRE_NETHERITE_HELMET = registerItem("perfect_sapphire_netherite_helmet",
            new PerfectSapphireArmorItem(RFFFPGArmorMaterials.PERFECT_SAPPHIRE_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings()));
    public static final Item PERFECT_SAPPHIRE_NETHERITE_CHESTPLATE = registerItem("perfect_sapphire_netherite_chestplate",
            new PerfectSapphireArmorItem(RFFFPGArmorMaterials.PERFECT_SAPPHIRE_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings()));
    public static final Item PERFECT_SAPPHIRE_NETHERITE_LEGGINGS = registerItem("perfect_sapphire_netherite_leggings",
            new PerfectSapphireArmorItem(RFFFPGArmorMaterials.PERFECT_SAPPHIRE_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings()));
    public static final Item PERFECT_SAPPHIRE_NETHERITE_BOOTS = registerItem("perfect_sapphire_netherite_boots",
            new PerfectSapphireArmorItem(RFFFPGArmorMaterials.PERFECT_SAPPHIRE_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings()));



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
