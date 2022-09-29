package net.lordbee222.rfffpgemstones;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RFFFPGemstonesMod implements ModInitializer {

	public static final String MOD_ID = "rfffp_gemstones";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}
