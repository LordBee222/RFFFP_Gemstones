package net.lordbee222.rfffpg.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.lordbee222.rfffpg.world.feature.RFFFPGemstonesPlacedFeatures;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class RFFFPGenstonesOreGeneration {
    public static void generateOres(){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BADLANDS, BiomeKeys.ERODED_BADLANDS,BiomeKeys.WOODED_BADLANDS),
                GenerationStep.Feature.UNDERGROUND_ORES, RFFFPGemstonesPlacedFeatures.AMBER_ORE_SMALL_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BADLANDS, BiomeKeys.ERODED_BADLANDS,BiomeKeys.WOODED_BADLANDS),
                GenerationStep.Feature.UNDERGROUND_ORES, RFFFPGemstonesPlacedFeatures.AMBER_ORE_MEDIUM_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BADLANDS, BiomeKeys.ERODED_BADLANDS,BiomeKeys.WOODED_BADLANDS),
                GenerationStep.Feature.UNDERGROUND_ORES, RFFFPGemstonesPlacedFeatures.AMBER_ORE_LARGE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE, BiomeKeys.BAMBOO_JUNGLE,BiomeKeys.SPARSE_JUNGLE),
                GenerationStep.Feature.UNDERGROUND_ORES, RFFFPGemstonesPlacedFeatures.JADE_ORE_SMALL_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE, BiomeKeys.BAMBOO_JUNGLE,BiomeKeys.SPARSE_JUNGLE),
                GenerationStep.Feature.UNDERGROUND_ORES, RFFFPGemstonesPlacedFeatures.JADE_ORE_MEDIUM_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE, BiomeKeys.BAMBOO_JUNGLE,BiomeKeys.SPARSE_JUNGLE),
                GenerationStep.Feature.UNDERGROUND_ORES, RFFFPGemstonesPlacedFeatures.JADE_ORE_LARGE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MUSHROOM_FIELDS),
                GenerationStep.Feature.UNDERGROUND_ORES, RFFFPGemstonesPlacedFeatures.JASPER_ORE_SMALL_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MUSHROOM_FIELDS),
                GenerationStep.Feature.UNDERGROUND_ORES, RFFFPGemstonesPlacedFeatures.JASPER_ORE_MEDIUM_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MUSHROOM_FIELDS),
                GenerationStep.Feature.UNDERGROUND_ORES, RFFFPGemstonesPlacedFeatures.JASPER_ORE_LARGE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.UNDERGROUND_ORES, RFFFPGemstonesPlacedFeatures.RUBY_ORE_SMALL_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.UNDERGROUND_ORES, RFFFPGemstonesPlacedFeatures.RUBY_ORE_SMALL_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.UNDERGROUND_ORES, RFFFPGemstonesPlacedFeatures.RUBY_ORE_LARGE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, RFFFPGemstonesPlacedFeatures.OPAL_ORE_SMALL_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, RFFFPGemstonesPlacedFeatures.OPAL_ORE_MEDIUM_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, RFFFPGemstonesPlacedFeatures.OPAL_ORE_LARGE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.OCEAN, BiomeKeys.FROZEN_OCEAN,BiomeKeys.COLD_OCEAN, BiomeKeys.LUKEWARM_OCEAN, BiomeKeys.WARM_OCEAN
                        ,BiomeKeys.DEEP_OCEAN,BiomeKeys.DEEP_FROZEN_OCEAN,BiomeKeys.DEEP_COLD_OCEAN,BiomeKeys.DEEP_LUKEWARM_OCEAN),
                GenerationStep.Feature.UNDERGROUND_ORES, RFFFPGemstonesPlacedFeatures.SAPPHIRE_ORE_SMALL_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                        BiomeKeys.OCEAN, BiomeKeys.FROZEN_OCEAN,BiomeKeys.COLD_OCEAN, BiomeKeys.LUKEWARM_OCEAN, BiomeKeys.WARM_OCEAN
                        ,BiomeKeys.DEEP_OCEAN,BiomeKeys.DEEP_FROZEN_OCEAN,BiomeKeys.DEEP_COLD_OCEAN,BiomeKeys.DEEP_LUKEWARM_OCEAN),
                GenerationStep.Feature.UNDERGROUND_ORES, RFFFPGemstonesPlacedFeatures.SAPPHIRE_ORE_MEDIUM_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                        BiomeKeys.OCEAN, BiomeKeys.FROZEN_OCEAN,BiomeKeys.COLD_OCEAN, BiomeKeys.LUKEWARM_OCEAN, BiomeKeys.WARM_OCEAN
                        ,BiomeKeys.DEEP_OCEAN,BiomeKeys.DEEP_FROZEN_OCEAN,BiomeKeys.DEEP_COLD_OCEAN,BiomeKeys.DEEP_LUKEWARM_OCEAN),
                GenerationStep.Feature.UNDERGROUND_ORES, RFFFPGemstonesPlacedFeatures.SAPPHIRE_ORE_LARGE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.UNDERGROUND_ORES, RFFFPGemstonesPlacedFeatures.TOPAZ_ORE_SMALL_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.UNDERGROUND_ORES, RFFFPGemstonesPlacedFeatures.TOPAZ_ORE_MEDIUM_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.UNDERGROUND_ORES, RFFFPGemstonesPlacedFeatures.TOPAZ_ORE_LARGE_PLACED.getKey().get());
    }
}
