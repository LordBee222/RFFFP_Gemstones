package net.lordbee222.rfffpg.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.lordbee222.rfffpg.item.RFFFPGemstonesItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class RFFFPGLootTableModifiers {
    private static final Identifier ROUGH_AMBER_GEM
            = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier FLAWED_AMBER_GEM
            = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier FINE_AMBER_GEM
            = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier FLAWLESS_AMBER_GEM
            = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier PERFECT_AMBER_GEM
            = new Identifier("minecraft", "chests/end_city_treasure");


    private static final Identifier ROUGH_JADE_GEM
            = new Identifier("minecraft", "chests/jungle_temple");
    private static final Identifier FLAWED_JADE_GEM
            = new Identifier("minecraft", "chests/jungle_temple");
    private static final Identifier FINE_JADE_GEM
            = new Identifier("minecraft", "chests/jungle_temple");
    private static final Identifier FLAWLESS_JADE_GEM
            = new Identifier("minecraft", "chests/jungle_temple");
    private static final Identifier PERFECT_JADE_GEM
            = new Identifier("minecraft", "chests/jungle_temple");


    private static final Identifier ROUGH_JASPER_GEM
            = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier FLAWED_JASPER_GEM
            = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier FINE_JASPER_GEM
            = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier FLAWLESS_JASPER_GEM
            = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier PERFECT_JASPER_GEM
            = new Identifier("minecraft", "chests/end_city_treasure");


    private static final Identifier ROUGH_OPAL_GEM
            = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier FLAWED_OPAL_GEM
            = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier FINE_OPAL_GEM
            = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier FLAWLESS_OPAL_GEM
            = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier PERFECT_OPAL_GEM
            = new Identifier("minecraft", "chests/end_city_treasure");


    private static final Identifier ROUGH_RUBY_GEM
            = new Identifier("minecraft", "chests/nether_bridge");
    private static final Identifier FLAWED_RUBY_GEM
            = new Identifier("minecraft", "chests/nether_bridge");
    private static final Identifier FINE_RUBY_GEM
            = new Identifier("minecraft", "chests/nether_bridge");
    private static final Identifier FLAWLESS_RUBY_GEM
            = new Identifier("minecraft", "chests/nether_bridge");
    private static final Identifier PERFECT_RUBY_GEM
            = new Identifier("minecraft", "chests/nether_bridge");


    private static final Identifier ROUGH_SAPPHIRE_GEM_RUIN_SMALL
            = new Identifier("minecraft", "chests/underwater_ruin_small");
    private static final Identifier FLAWED_SAPPHIRE_GEM_RUIN_SMALL
            = new Identifier("minecraft", "chests/underwater_ruin_small");
    private static final Identifier FINE_SAPPHIRE_GEM_RUIN_SMALL
            = new Identifier("minecraft", "chests/underwater_ruin_small");
    private static final Identifier FLAWLESS_SAPPHIRE_GEM_RUIN_SMALL
            = new Identifier("minecraft", "chests/underwater_ruin_small");
    private static final Identifier PERFECT_SAPPHIRE_GEM_RUIN_SMALL
            = new Identifier("minecraft", "chests/underwater_ruin_small");


    private static final Identifier ROUGH_SAPPHIRE_GEM_RUIN_BIG
            = new Identifier("minecraft", "chests/underwater_ruin_big");
    private static final Identifier FLAWED_SAPPHIRE_GEM_RUIN_BIG
            = new Identifier("minecraft", "chests/underwater_ruin_big");
    private static final Identifier FINE_SAPPHIRE_GEM_RUIN_BIG
            = new Identifier("minecraft", "chests/underwater_ruin_big");
    private static final Identifier FLAWLESS_SAPPHIRE_GEM_RUIN_BIG
            = new Identifier("minecraft", "chests/underwater_ruin_big");
    private static final Identifier PERFECT_SAPPHIRE_GEM_RUIN_BIG
            = new Identifier("minecraft", "chests/underwater_ruin_big");


    private static final Identifier ROUGH_SAPPHIRE_GEM_SHIPWRECK
            = new Identifier("minecraft", "chests/shipwreck_treasure");
    private static final Identifier FLAWED_SAPPHIRE_GEM_SHIPWRECK
            = new Identifier("minecraft", "chests/shipwreck_treasure");
    private static final Identifier FINE_SAPPHIRE_GEM_SHIPWRECK
            = new Identifier("minecraft", "chests/shipwreck_treasure");
    private static final Identifier FLAWLESS_SAPPHIRE_GEM_SHIPWRECK
            = new Identifier("minecraft", "chests/shipwreck_treasure");
    private static final Identifier PERFECT_SAPPHIRE_GEM_SHIPWRECK
            = new Identifier("minecraft", "chests/shipwreck_treasure");


    private static final Identifier ROUGH_TOPAZ_GEM
            = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier FLAWED_TOPAZ_GEM
            = new Identifier("minecraft", "chests/nether_bridge");
    private static final Identifier FINE_TOPAZ_GEM
            = new Identifier("minecraft", "chests/nether_bridge");
    private static final Identifier FLAWLESS_TOPAZ_GEM
            = new Identifier("minecraft", "chests/nether_bridge");
    private static final Identifier PERFECT_TOPAZ_GEM
            = new Identifier("minecraft", "chests/nether_bridge");



    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(ROUGH_JADE_GEM.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.90f)) // Drops 90% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.ROUGH_JADE_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 10.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(FLAWED_JADE_GEM.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.30f)) // Drops 30% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.FLAWED_JADE_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 6.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(FINE_JADE_GEM.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.10f)) // Drops 10% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.FINE_JADE_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(FLAWLESS_JADE_GEM.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f)) // Drops 5% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.FLAWLESS_JADE_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(PERFECT_JADE_GEM.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f)) // Drops 1% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.PERFECT_JADE_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));



        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(ROUGH_OPAL_GEM.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.90f)) // Drops 90% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.ROUGH_OPAL_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 10.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(FLAWED_OPAL_GEM.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.30f)) // Drops 30% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.FLAWED_OPAL_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 6.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(FINE_OPAL_GEM.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.10f)) // Drops 10% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.FINE_OPAL_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(FLAWLESS_OPAL_GEM.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f)) // Drops 5% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.FLAWLESS_OPAL_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(PERFECT_OPAL_GEM.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f)) // Drops 1% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.PERFECT_OPAL_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));



        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(ROUGH_RUBY_GEM.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.90f)) // Drops 90% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.ROUGH_RUBY_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 10.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(FLAWED_RUBY_GEM.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.30f)) // Drops 30% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.FLAWED_RUBY_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 6.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(FINE_RUBY_GEM.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.10f)) // Drops 10% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.FINE_RUBY_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(FLAWLESS_RUBY_GEM.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f)) // Drops 5% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.FLAWLESS_RUBY_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(PERFECT_RUBY_GEM.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f)) // Drops 1% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.PERFECT_RUBY_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));



        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(ROUGH_SAPPHIRE_GEM_SHIPWRECK.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.90f)) // Drops 90% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.ROUGH_SAPPHIRE_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 10.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(FLAWED_SAPPHIRE_GEM_SHIPWRECK.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.30f)) // Drops 30% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.FLAWED_SAPPHIRE_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 6.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(FINE_SAPPHIRE_GEM_SHIPWRECK.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.10f)) // Drops 10% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.FINE_SAPPHIRE_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(FLAWLESS_SAPPHIRE_GEM_SHIPWRECK.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f)) // Drops 5% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.FLAWLESS_SAPPHIRE_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(PERFECT_SAPPHIRE_GEM_SHIPWRECK.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f)) // Drops 1% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.PERFECT_SAPPHIRE_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));



        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(ROUGH_SAPPHIRE_GEM_RUIN_SMALL.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.90f)) // Drops 90% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.ROUGH_SAPPHIRE_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 10.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(FLAWED_SAPPHIRE_GEM_RUIN_SMALL.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.30f)) // Drops 30% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.FLAWED_SAPPHIRE_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 6.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(FINE_SAPPHIRE_GEM_RUIN_SMALL.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.10f)) // Drops 10% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.FINE_SAPPHIRE_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(FLAWLESS_SAPPHIRE_GEM_RUIN_SMALL.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f)) // Drops 5% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.FLAWLESS_SAPPHIRE_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(PERFECT_SAPPHIRE_GEM_RUIN_SMALL.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f)) // Drops 1% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.PERFECT_SAPPHIRE_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));



        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(ROUGH_SAPPHIRE_GEM_RUIN_BIG.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.90f)) // Drops 90% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.ROUGH_SAPPHIRE_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 10.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(FLAWED_SAPPHIRE_GEM_RUIN_BIG.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.30f)) // Drops 30% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.FLAWED_SAPPHIRE_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 6.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(FINE_SAPPHIRE_GEM_RUIN_BIG.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.10f)) // Drops 10% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.FINE_SAPPHIRE_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(FLAWLESS_SAPPHIRE_GEM_RUIN_BIG.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f)) // Drops 5% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.FLAWLESS_SAPPHIRE_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));
        LootTableEvents.MODIFY.register(((resourceManager, manager, id, supplier, setter) -> {
            if(PERFECT_SAPPHIRE_GEM_RUIN_BIG.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f)) // Drops 1% of the time
                        .with(ItemEntry.builder(RFFFPGemstonesItems.PERFECT_SAPPHIRE_GEMSTONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                supplier.pool(poolBuilder.build());
            }
        }));

    }
}
