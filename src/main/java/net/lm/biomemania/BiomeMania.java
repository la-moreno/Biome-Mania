package net.lm.biomemania;

import net.fabricmc.api.ModInitializer;

import net.lm.biomemania.item.ModItemGroups;
import net.lm.biomemania.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BiomeMania implements ModInitializer {
	public static final String MOD_ID = "biome-mania";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
};