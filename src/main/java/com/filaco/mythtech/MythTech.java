package com.filaco.mythtech;

import com.filaco.mythtech.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MythTech implements ModInitializer {
	public static final String MOD_ID = "mythtech";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		MythTech.LOGGER.info("Initializing MythTech");

		ModItems.register();


	}
}