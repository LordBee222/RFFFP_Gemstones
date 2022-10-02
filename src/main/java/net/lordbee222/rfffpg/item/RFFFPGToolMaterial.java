package net.lordbee222.rfffpg.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum RFFFPGToolMaterial implements ToolMaterial {
    ROUGH_AMBER_NETHERITE(MiningLevels.NETHERITE, 2031, 10F, 0, 15, () ->
            Ingredient.ofItems(Items.NETHERITE_INGOT)),
    FLAWED_AMBER_NETHERITE(MiningLevels.NETHERITE, 2031, 11F, 0, 15, () ->
            Ingredient.ofItems(Items.NETHERITE_INGOT)),
    FINE_AMBER_NETHERITE(MiningLevels.NETHERITE, 2031, 13F, 0, 15, () ->
            Ingredient.ofItems(Items.NETHERITE_INGOT)),
    FLAWLESS_AMBER_NETHERITE(MiningLevels.NETHERITE, 2031, 17F, 0, 15, () ->
            Ingredient.ofItems(Items.NETHERITE_INGOT)),
    PERFECT_AMBER_NETHERITE(MiningLevels.NETHERITE, 2031, 25F, 0, 15, () ->
            Ingredient.ofItems(Items.NETHERITE_INGOT)),

    ROUGH_JADE_NETHERITE(MiningLevels.NETHERITE, 2131, 9F, 0, 15, () ->
            Ingredient.ofItems(Items.NETHERITE_INGOT)),
    FLAWED_JADE_NETHERITE(MiningLevels.NETHERITE, 2231, 9F, 0, 15, () ->
            Ingredient.ofItems(Items.NETHERITE_INGOT)),
    FINE_JADE_NETHERITE(MiningLevels.NETHERITE, 2431, 9F, 0, 15, () ->
            Ingredient.ofItems(Items.NETHERITE_INGOT)),
    FLAWLESS_JADE_NETHERITE(MiningLevels.NETHERITE, 2831, 9F, 0, 15, () ->
            Ingredient.ofItems(Items.NETHERITE_INGOT)),
    PERFECT_JADE_NETHERITE(MiningLevels.NETHERITE, 3631, 9F, 0, 15, () ->
            Ingredient.ofItems(Items.NETHERITE_INGOT)),

    ROUGH_JASPER_NETHERITE(MiningLevels.NETHERITE, 2031, 9F, 0, 16, () ->
            Ingredient.ofItems(Items.NETHERITE_INGOT)),
    FLAWED_JASPER_NETHERITE(MiningLevels.NETHERITE, 2031, 9F, 0, 17, () ->
            Ingredient.ofItems(Items.NETHERITE_INGOT)),
    FINE_JASPER_NETHERITE(MiningLevels.NETHERITE, 2031, 9F, 0, 19, () ->
            Ingredient.ofItems(Items.NETHERITE_INGOT)),
    FLAWLESS_JASPER_NETHERITE(MiningLevels.NETHERITE, 2031, 9F, 0, 23, () ->
            Ingredient.ofItems(Items.NETHERITE_INGOT)),
    PERFECT_JASPER_NETHERITE(MiningLevels.NETHERITE, 2031, 9F, 0, 31, () ->
            Ingredient.ofItems(Items.NETHERITE_INGOT));


    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    RFFFPGToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage,
                        int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}