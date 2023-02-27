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
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    ROUGH_OPAL_NETHERITE("rough_opal_netherite", 37, new int[]{4, 7, 9, 4}, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    FLAWED_OPAL_NETHERITE("flawed_opal_netherite", 37, new int[]{5, 8, 10, 5}, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    FINE_OPAL_NETHERITE("fine_opal_netherite", 37, new int[]{7, 10, 12, 7}, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    FLAWLESS_OPAL_NETHERITE("flawless_opal_netherite", 37, new int[]{11, 14, 16, 11}, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    PERFECT_OPAL_NETHERITE("perfect_opal_netherite", 37, new int[]{19, 22, 24, 19}, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    ROUGH_SAPPHIRE_NETHERITE("rough_sapphire_netherite", 37, new int[]{3, 6, 8, 3}, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3F, 0.2F,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    FLAWED_SAPPHIRE_NETHERITE("flawed_sapphire_netherite", 37, new int[]{3, 6, 8, 3}, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3F, 0.3F,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    FINE_SAPPHIRE_NETHERITE("fine_sapphire_netherite", 37, new int[]{3, 6, 8, 3}, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3F, 0.5F,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    FLAWLESS_SAPPHIRE_NETHERITE("flawless_sapphire_netherite", 37, new int[]{3, 6, 8, 3}, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3F, 0.9F,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    PERFECT_SAPPHIRE_NETHERITE("perfect_sapphire_netherite", 37, new int[]{3, 6, 8, 3}, 15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3F, 1.7F,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    ROUGH_JADE_DIAMOND("rough_jade_diamond", 45, new int[]{3, 6, 8, 3}, 15,
    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    FLAWED_JADE_DIAMOND("flawed_jade_diamond", 53, new int[]{3, 6, 8, 3}, 15,
    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    FINE_JADE_DIAMOND("fine_jade_diamond", 68, new int[]{3, 6, 8, 3}, 15,
    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    FLAWLESS_JADE_DIAMOND("flawless_jade_diamond", 37, new int[]{3, 6, 8, 3}, 15,
    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    PERFECT_JADE_DIAMOND("perfect_jade_diamond", 99, new int[]{3, 6, 8, 3}, 15,
    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.DIAMOND)),

    ROUGH_JASPER_DIAMOND("rough_jasper_diamond", 37, new int[]{3, 6, 8, 3}, 16,
    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    FLAWED_JASPER_DIAMOND("flawed_jasper_diamond", 37, new int[]{3, 6, 8, 3}, 17,
    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    FINE_JASPER_DIAMOND("fine_jasper_diamond", 37, new int[]{3, 6, 8, 3}, 19,
    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    FLAWLESS_JASPER_DIAMOND("flawless_jasper_diamond", 37, new int[]{3, 6, 8, 3}, 23,
    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    PERFECT_JASPER_DIAMOND("perfect_jasper_diamond", 37, new int[]{3, 6, 8, 3}, 31,
    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.DIAMOND)),

    ROUGH_OPAL_DIAMOND("rough_opal_diamond", 37, new int[]{4, 7, 9, 4}, 15,
    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    FLAWED_OPAL_DIAMOND("flawed_opal_diamond", 37, new int[]{5, 8, 10, 5}, 15,
    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    FINE_OPAL_DIAMOND("fine_opal_diamond", 37, new int[]{7, 10, 12, 7}, 15,
    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    FLAWLESS_OPAL_DIAMOND("flawless_opal_diamond", 37, new int[]{11, 14, 16, 11}, 15,
    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    PERFECT_OPAL_DIAMOND("perfect_opal_diamond", 37, new int[]{19, 22, 24, 19}, 15,
    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3F, 0.1F,
            () -> Ingredient.ofItems(Items.DIAMOND)),

    ROUGH_SAPPHIRE_DIAMOND("rough_sapphire_diamond", 37, new int[]{3, 6, 8, 3}, 15,
    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3F, 0.2F,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    FLAWED_SAPPHIRE_DIAMOND("flawed_sapphire_diamond", 37, new int[]{3, 6, 8, 3}, 15,
    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3F, 0.3F,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    FINE_SAPPHIRE_DIAMOND("fine_sapphire_diamond", 37, new int[]{3, 6, 8, 3}, 15,
    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3F, 0.5F,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    FLAWLESS_SAPPHIRE_DIAMOND("flawless_sapphire_diamond", 37, new int[]{3, 6, 8, 3}, 15,
    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3F, 0.9F,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    PERFECT_SAPPHIRE_DIAMOND("perfect_sapphire_diamond", 37, new int[]{3, 6, 8, 3}, 15,
    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3F, 1.7F,
            () -> Ingredient.ofItems(Items.DIAMOND));




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
