package net.lordbee222.rfffpg;

import net.fabricmc.api.ModInitializer;
import net.lordbee222.rfffpg.block.RFFFPGemstonesBlocks;
import net.lordbee222.rfffpg.item.RFFFPGemstonesItems;
import net.lordbee222.rfffpg.util.RFFFPGLootTableModifiers;
import net.lordbee222.rfffpg.world.feature.RFFFPGemstonesConfiguredFeatures;
import net.lordbee222.rfffpg.world.gen.RFFFPGenstonesOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RFFFPGMod implements ModInitializer {

	public static final String MOD_ID = "rfffpg";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		RFFFPGemstonesConfiguredFeatures.registerConfiguredFeatures();
		LOGGER.info("Hello Fabric world!");
		RFFFPGemstonesItems.registerModItems();
		RFFFPGemstonesBlocks.registerModBlocks();
		RFFFPGenstonesOreGeneration.generateOres();
		RFFFPGLootTableModifiers.modifyLootTables();

	}
}
