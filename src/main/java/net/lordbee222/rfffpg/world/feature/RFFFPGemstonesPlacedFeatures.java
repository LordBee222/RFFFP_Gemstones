package net.lordbee222.rfffpg.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class RFFFPGemstonesPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> AMBER_ORE_PLACED = PlacedFeatures.register("amber_ore_placed",
            RFFFPGemstonesConfiguredFeatures.AMBER_ORE, modifiersWithCount(15,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));

    public static final RegistryEntry<PlacedFeature> JADE_ORE_PLACED = PlacedFeatures.register("jade_ore_placed",
            RFFFPGemstonesConfiguredFeatures.JADE_ORE, modifiersWithCount(15,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));

    public static final RegistryEntry<PlacedFeature> JASPER_ORE_PLACED = PlacedFeatures.register("jasper_ore_placed",
            RFFFPGemstonesConfiguredFeatures.JASPER_ORE, modifiersWithCount(15,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));

    public static final RegistryEntry<PlacedFeature> RUBY_ORE_PLACED = PlacedFeatures.register("ruby_ore_placed",
            RFFFPGemstonesConfiguredFeatures.RUBY_ORE, modifiersWithCount(15,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));

    public static final RegistryEntry<PlacedFeature> OPAL_ORE_PLACED = PlacedFeatures.register("opal_ore_placed",
            RFFFPGemstonesConfiguredFeatures.OPAL_ORE, modifiersWithCount(15,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));

    public static final RegistryEntry<PlacedFeature> SAPPHIRE_ORE_PLACED = PlacedFeatures.register("sapphire_ore_placed",
            RFFFPGemstonesConfiguredFeatures.SAPPHIRE_ORE, modifiersWithCount(15,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));


    public static final RegistryEntry<PlacedFeature> TOPAZ_ORE_PLACED = PlacedFeatures.register("topaz_ore_placed",
            RFFFPGemstonesConfiguredFeatures.TOPAZ_ORE, modifiersWithCount(10,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));

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
