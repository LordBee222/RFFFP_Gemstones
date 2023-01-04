package net.lordbee222.rfffpg.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.lordbee222.rfffpg.RFFFPGMod;
import net.lordbee222.rfffpg.item.RFFFPGemstonesItemGroups;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class RFFFPGemstonesBlocks {
    public static final Block AMBER_ORE = registerBlock("amber_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool(),
                    UniformIntProvider.create(3, 7)), RFFFPGemstonesItemGroups.RFFFPG);
    public static final Block DEEPSLATE_AMBER_ORE = registerBlock("deepslate_amber_ore",
            new OreBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE).strength(4.5f).requiresTool(),
                    UniformIntProvider.create(3, 7)), RFFFPGemstonesItemGroups.RFFFPG);
    public static final Block AMBER_BLOCK = registerBlock("amber_block",
            new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).strength(4.5f).requiresTool()),
            RFFFPGemstonesItemGroups.RFFFPG);

    public static final Block JADE_ORE = registerBlock("jade_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool(),
                    UniformIntProvider.create(3, 7)), RFFFPGemstonesItemGroups.RFFFPG);
    public static final Block DEEPSLATE_JADE_ORE = registerBlock("deepslate_jade_ore",
            new OreBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE).strength(4.5f).requiresTool(),
                    UniformIntProvider.create(3, 7)), RFFFPGemstonesItemGroups.RFFFPG);
    public static final Block JADE_BLOCK = registerBlock("jade_block",
            new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).strength(4.5f).requiresTool()),
            RFFFPGemstonesItemGroups.RFFFPG);

    public static final Block JASPER_ORE = registerBlock("jasper_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool(),
                    UniformIntProvider.create(3, 7)), RFFFPGemstonesItemGroups.RFFFPG);
    public static final Block DEEPSLATE_JASPER_ORE = registerBlock("deepslate_jasper_ore",
            new OreBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE).strength(4.5f).requiresTool(),
                    UniformIntProvider.create(3, 7)), RFFFPGemstonesItemGroups.RFFFPG);
    public static final Block JASPER_BLOCK = registerBlock("jasper_block",
            new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).strength(4.5f).requiresTool()),
            RFFFPGemstonesItemGroups.RFFFPG);

    public static final Block OPAL_ORE = registerBlock("opal_ore",
            new OreBlock(FabricBlockSettings.copy(Blocks.END_STONE).strength(3f).requiresTool(),
                    UniformIntProvider.create(3, 7)), RFFFPGemstonesItemGroups.RFFFPG);
    public static final Block OPAL_BLOCK = registerBlock("opal_block",
            new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).strength(4.5f).requiresTool()),
            RFFFPGemstonesItemGroups.RFFFPG);


    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new OreBlock(FabricBlockSettings.copy(Blocks.NETHERRACK).strength(0.4f).requiresTool(),
                    UniformIntProvider.create(3, 7)), RFFFPGemstonesItemGroups.RFFFPG);
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).strength(4.5f).requiresTool()),
            RFFFPGemstonesItemGroups.RFFFPG);


    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool(),
                    UniformIntProvider.create(3, 7)), RFFFPGemstonesItemGroups.RFFFPG);
    public static final Block DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            new OreBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE).strength(4.5f).requiresTool(),
                    UniformIntProvider.create(3, 7)), RFFFPGemstonesItemGroups.RFFFPG);
    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).strength(4.5f).requiresTool()),
            RFFFPGemstonesItemGroups.RFFFPG);

    public static final Block TOPAZ_ORE = registerBlock("topaz_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool(),
                    UniformIntProvider.create(3, 7)), RFFFPGemstonesItemGroups.RFFFPG);
    public static final Block DEEPSLATE_TOPAZ_ORE = registerBlock("deepslate_topaz_ore",
            new OreBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE).strength(4.5f).requiresTool(),
                    UniformIntProvider.create(3, 7)), RFFFPGemstonesItemGroups.RFFFPG);
    public static final Block TOPAZ_BLOCK = registerBlock("topaz_block",
            new Block(FabricBlockSettings.copy(Blocks.DIAMOND_BLOCK).strength(4.5f).requiresTool()),
            RFFFPGemstonesItemGroups.RFFFPG);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(RFFFPGMod.MOD_ID, name), block);}
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {

        return Registry.register(Registry.ITEM, new Identifier(RFFFPGMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));}

    public static void registerModBlocks() {
        System.out.println("Registering Blocks for " + RFFFPGMod.MOD_ID);
    }
}
