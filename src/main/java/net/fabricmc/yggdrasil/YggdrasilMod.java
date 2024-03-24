package net.fabricmc.yggdrasil;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.yggdrasil.block.ModBlocks;
import net.fabricmc.yggdrasil.item.ModItems;
import net.fabricmc.yggdrasil.mob.ModEntities;
import net.fabricmc.yggdrasil.mob.client.RaccoonRenderer;
import net.fabricmc.yggdrasil.mob.client.ZombyRenderer;
import net.fabricmc.yggdrasil.util.ModRegistries;
import net.fabricmc.yggdrasil.world.biome.ModBiome;
import net.fabricmc.yggdrasil.world.dimension.ModDimension;
import net.fabricmc.yggdrasil.world.feature.ModConfiguredFeatures;
import net.fabricmc.yggdrasil.world.gen.ModOreGeneration;
import net.fabricmc.yggdrasil.world.gen.ModWorldGen;
import net.fabricmc.yggdrasil.world.structure.ModStructures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class YggdrasilMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "yggdrasilmod";

	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModConfiguredFeatures.registerCongiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModDimension.register();
		ModRegistries.registerModStuffs();
		EntityRendererRegistry.register(ModEntities.RACCOON, RaccoonRenderer::new);
		EntityRendererRegistry.register(ModEntities.ZOMBY, ZombyRenderer::new);
		GeckoLib.initialize();
		ModStructures.registerStructureFeatures();
		ModWorldGen.generateModWorldGen();
	}
}
