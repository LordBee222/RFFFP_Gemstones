package net.lordbee222.rfffpg.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum RFFFPGArmorMaterials implements ArmorMaterial {

    ROUGH_JADE_NETHERITE("rough_jade_netherite", 45, new int[]{3, 6, 8, 3}, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    FLAWED_JADE_NETHERITE("flawed_jade_netherite", 53, new int[]{3, 6, 8, 3}, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    FINE_JADE_NETHERITE("fine_jade_netherite", 68, new int[]{3, 6, 8, 3}, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    FLAWLESS_JADE_NETHERITE("flawless_jade_netherite", 37, new int[]{3, 6, 8, 3}, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    PERFECT_JADE_NETHERITE("perfect_jade_netherite", 99, new int[]{3, 6, 8, 3}, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    ROUGH_JASPER_NETHERITE("rough_jasper_netherite", 37, new int[]{3, 6, 8, 3}, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    FLAWED_JASPER_NETHERITE("flawed_jasper_netherite", 37, new int[]{3, 6, 8, 3}, 17,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    FINE_JASPER_NETHERITE("fine_jasper_netherite", 37, new int[]{3, 6, 8, 3}, 19,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    FLAWLESS_JASPER_NETHERITE("flawless_jasper_netherite", 37, new int[]{3, 6, 8, 3}, 23,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    PERFECT_JASPER_NETHERITE("perfect_jasper_netherite", 37, new int[]{3, 6, 8, 3}, 31,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT));



    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    private RFFFPGArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy(repairIngredientSupplier);
    }

    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredientSupplier.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
