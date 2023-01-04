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

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> AMBER_ORE_SMALL =
            ConfiguredFeatures.register("amber_ore_small", Feature.ORE, new OreFeatureConfig(AMBER_ORES, 2, 0.5f));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> AMBER_ORE_MEDIUM =
            ConfiguredFeatures.register("amber_ore_medium", Feature.ORE, new OreFeatureConfig(AMBER_ORES, 4, 1f));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> AMBER_ORE_LARGE =
            ConfiguredFeatures.register("amber_ore_large", Feature.ORE, new OreFeatureConfig(AMBER_ORES, 6, 0.7f));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> JADE_ORE_SMALL =
            ConfiguredFeatures.register("jade_ore_small", Feature.ORE, new OreFeatureConfig(JADE_ORES, 2, 0.5f));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> JADE_ORE_MEDIUM =
            ConfiguredFeatures.register("jade_ore_medium", Feature.ORE, new OreFeatureConfig(JADE_ORES, 4, 1f));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> JADE_ORE_LARGE =
            ConfiguredFeatures.register("jade_ore_large", Feature.ORE, new OreFeatureConfig(JADE_ORES, 6, 0.7f));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> JASPER_ORE_SMALL =
            ConfiguredFeatures.register("jasper_ore_small", Feature.ORE, new OreFeatureConfig(JASPER_ORES, 2, 0.5f));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> JASPER_ORE_MEDIUM =
            ConfiguredFeatures.register("jasper_ore_medium", Feature.ORE, new OreFeatureConfig(JASPER_ORES, 4, 1f));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> JASPER_ORE_LARGE =
            ConfiguredFeatures.register("jasper_ore_large", Feature.ORE, new OreFeatureConfig(JASPER_ORES, 6, 0.7f));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RUBY_ORE_SMALL =
            ConfiguredFeatures.register("ruby_ore_small",Feature.ORE, new OreFeatureConfig(RUBY_ORES, 2, 0.5f));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RUBY_ORE_MEDIUM =
            ConfiguredFeatures.register("ruby_ore_medium", Feature.ORE, new OreFeatureConfig(RUBY_ORES, 4, 1f));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> RUBY_ORE_LARGE =
            ConfiguredFeatures.register("ruby_ore_large", Feature.ORE, new OreFeatureConfig(RUBY_ORES, 6, 0.7f));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> OPAL_ORE_SMALL =
            ConfiguredFeatures.register("opal_ore_small",Feature.ORE, new OreFeatureConfig(OPAL_ORES, 2, 0.5f));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> OPAL_ORE_MEDIUM =
            ConfiguredFeatures.register("opal_ore_medium", Feature.ORE, new OreFeatureConfig(OPAL_ORES, 4, 1f));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> OPAL_ORE_LARGE =
            ConfiguredFeatures.register("opal_ore_large", Feature.ORE, new OreFeatureConfig(OPAL_ORES, 6, 0.7f));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SAPPHIRE_ORE_SMALL =
            ConfiguredFeatures.register("sapphire_ore_small",Feature.ORE, new OreFeatureConfig(SAPPHIRE_ORES, 2, 0.5f));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SAPPHIRE_ORE_MEDIUM =
            ConfiguredFeatures.register("sapphire_ore_medium", Feature.ORE, new OreFeatureConfig(SAPPHIRE_ORES, 4, 1f));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SAPPHIRE_ORE_LARGE =
            ConfiguredFeatures.register("sapphire_ore_large", Feature.ORE, new OreFeatureConfig(SAPPHIRE_ORES, 6, 0.7f));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TOPAZ_ORE_SMALL =
            ConfiguredFeatures.register("topaz_ore_small",Feature.ORE, new OreFeatureConfig(TOPAZ_ORES, 2, 0.5f));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TOPAZ_ORE_MEDIUM =
            ConfiguredFeatures.register("topaz_ore_medium", Feature.ORE, new OreFeatureConfig(TOPAZ_ORES, 4, 1f));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> TOPAZ_ORE_LARGE =
            ConfiguredFeatures.register("topaz_ore_large", Feature.ORE, new OreFeatureConfig(TOPAZ_ORES, 6, 0.7f));

    public static void registerConfiguredFeatures(){
        RFFFPGMod.LOGGER.debug("Registering the Configured Features for" + RFFFPGMod.MOD_ID);
    }
}
