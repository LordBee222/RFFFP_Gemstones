package net.lordbee222.rfffpg.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class RFFFPGemstonesPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> AMBER_ORE_SMALL_PLACED = PlacedFeatures.register("amber_ore_small_placed",
            RFFFPGemstonesConfiguredFeatures.AMBER_ORE_SMALL, modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> AMBER_ORE_MEDIUM_PLACED = PlacedFeatures.register("amber_ore_medium_placed",
            RFFFPGemstonesConfiguredFeatures.AMBER_ORE_MEDIUM, modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> AMBER_ORE_LARGE_PLACED = PlacedFeatures.register("amber_ore_large_placed",
            RFFFPGemstonesConfiguredFeatures.AMBER_ORE_LARGE, modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

    public static final RegistryEntry<PlacedFeature> JADE_ORE_SMALL_PLACED = PlacedFeatures.register("jade_ore_small_placed",
            RFFFPGemstonesConfiguredFeatures.JADE_ORE_SMALL, modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> JADE_ORE_MEDIUM_PLACED = PlacedFeatures.register("jade_ore_medium_placed",
            RFFFPGemstonesConfiguredFeatures.JADE_ORE_MEDIUM, modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> JADE_ORE_LARGE_PLACED = PlacedFeatures.register("jade_ore_large_placed",
            RFFFPGemstonesConfiguredFeatures.JADE_ORE_LARGE, modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

    public static final RegistryEntry<PlacedFeature> JASPER_ORE_SMALL_PLACED = PlacedFeatures.register("jasper_ore_small_placed",
            RFFFPGemstonesConfiguredFeatures.JASPER_ORE_SMALL, modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> JASPER_ORE_MEDIUM_PLACED = PlacedFeatures.register("jasper_ore_medium_placed",
            RFFFPGemstonesConfiguredFeatures.JASPER_ORE_MEDIUM, modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> JASPER_ORE_LARGE_PLACED = PlacedFeatures.register("jasper_ore_large_placed",
            RFFFPGemstonesConfiguredFeatures.JASPER_ORE_LARGE, modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

    public static final RegistryEntry<PlacedFeature> RUBY_ORE_SMALL_PLACED = PlacedFeatures.register("ruby_ore_small_placed",
            RFFFPGemstonesConfiguredFeatures.RUBY_ORE_SMALL, modifiersWithCount(7,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> RUBY_ORE_MEDIUM_PLACED = PlacedFeatures.register("ruby_ore_medium_placed",
            RFFFPGemstonesConfiguredFeatures.RUBY_ORE_MEDIUM, modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> RUBY_ORE_LARGE_PLACED = PlacedFeatures.register("ruby_ore_large_placed",
            RFFFPGemstonesConfiguredFeatures.RUBY_ORE_LARGE, modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

    public static final RegistryEntry<PlacedFeature> OPAL_ORE_SMALL_PLACED = PlacedFeatures.register("opal_ore_small_placed",
            RFFFPGemstonesConfiguredFeatures.OPAL_ORE_SMALL, modifiersWithCount(7,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> OPAL_ORE_MEDIUM_PLACED = PlacedFeatures.register("opal_ore_medium_placed",
            RFFFPGemstonesConfiguredFeatures.OPAL_ORE_MEDIUM, modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> OPAL_ORE_LARGE_PLACED = PlacedFeatures.register("opal_ore_large_placed",
            RFFFPGemstonesConfiguredFeatures.OPAL_ORE_LARGE, modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

    public static final RegistryEntry<PlacedFeature> SAPPHIRE_ORE_SMALL_PLACED = PlacedFeatures.register("sapphire_ore_small_placed",
            RFFFPGemstonesConfiguredFeatures.SAPPHIRE_ORE_SMALL, modifiersWithCount(7,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> SAPPHIRE_ORE_MEDIUM_PLACED = PlacedFeatures.register("sapphire_ore_medium_placed",
            RFFFPGemstonesConfiguredFeatures.SAPPHIRE_ORE_MEDIUM, modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> SAPPHIRE_ORE_LARGE_PLACED = PlacedFeatures.register("sapphire_ore_large_placed",
            RFFFPGemstonesConfiguredFeatures.SAPPHIRE_ORE_LARGE, modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

    public static final RegistryEntry<PlacedFeature> TOPAZ_ORE_SMALL_PLACED = PlacedFeatures.register("topaz_ore_small_placed",
            RFFFPGemstonesConfiguredFeatures.TOPAZ_ORE_SMALL, modifiersWithCount(7,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> TOPAZ_ORE_MEDIUM_PLACED = PlacedFeatures.register("topaz_ore_medium_placed",
            RFFFPGemstonesConfiguredFeatures.TOPAZ_ORE_MEDIUM, modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> TOPAZ_ORE_LARGE_PLACED = PlacedFeatures.register("topaz_ore_large_placed",
            RFFFPGemstonesConfiguredFeatures.TOPAZ_ORE_LARGE, modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
