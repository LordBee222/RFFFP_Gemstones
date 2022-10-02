package net.lordbee222.rfffpg.world.feature;

import net.lordbee222.rfffpg.RFFFPGMod;
import net.lordbee222.rfffpg.block.RFFFPGemstonesBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class RFFFPGemstonesConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> AMBER_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, RFFFPGemstonesBlocks.AMBER_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, RFFFPGemstonesBlocks.DEEPSLATE_AMBER_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> JADE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, RFFFPGemstonesBlocks.JADE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, RFFFPGemstonesBlocks.DEEPSLATE_JADE_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> JASPER_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, RFFFPGemstonesBlocks.JASPER_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, RFFFPGemstonesBlocks.DEEPSLATE_JASPER_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> RUBY_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, RFFFPGemstonesBlocks.RUBY_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> OPAL_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), RFFFPGemstonesBlocks.OPAL_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> SAPPHIRE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, RFFFPGemstonesBlocks.SAPPHIRE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, RFFFPGemstonesBlocks.DEEPSLATE_SAPPHIRE_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> TOPAZ_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, RFFFPGemstonesBlocks.TOPAZ_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, RFFFPGemstonesBlocks.DEEPSLATE_TOPAZ_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> AMBER_ORE =
            ConfiguredFeatures.register("amber_ore", Feature.ORE, new OreFeatureConfig(AMBER_ORES, 12));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> JADE_ORE =
            ConfiguredFeatures.register("jade_ore", Feature.ORE, new OreFeatureConfig(JADE_ORES, 12));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> JASPER_ORE =
            ConfiguredFeatures.register("jasper_ore", Feature.ORE, new OreFeatureConfig(JASPER_ORES, 12));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RUBY_ORE =
            ConfiguredFeatures.register("ruby_ore",Feature.ORE, new OreFeatureConfig(RUBY_ORES, 12));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> OPAL_ORE =
            ConfiguredFeatures.register("opal_ore",Feature.ORE, new OreFeatureConfig(OPAL_ORES, 12));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SAPPHIRE_ORE =
            ConfiguredFeatures.register("sapphire_ore",Feature.ORE, new OreFeatureConfig(SAPPHIRE_ORES, 12));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TOPAZ_ORE =
            ConfiguredFeatures.register("topaz_ore",Feature.ORE, new OreFeatureConfig(TOPAZ_ORES, 12));


    public static void registerConfiguredFeatures(){
        RFFFPGMod.LOGGER.debug("Registering the Configured Features for" + RFFFPGMod.MOD_ID);
    }
}
