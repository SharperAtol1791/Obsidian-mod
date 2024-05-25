/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.obsidian_mod.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

import net.mcreator.obsidian_mod.item.ObsidianSwordItem;
import net.mcreator.obsidian_mod.item.ObsidianShovelItem;
import net.mcreator.obsidian_mod.item.ObsidianPickaxeItem;
import net.mcreator.obsidian_mod.item.ObsidianItem;
import net.mcreator.obsidian_mod.item.ObsidianIngotItem;
import net.mcreator.obsidian_mod.item.ObsidianHoeItem;
import net.mcreator.obsidian_mod.item.ObsidianAxeItem;
import net.mcreator.obsidian_mod.ObsdianModMod;

public class ObsdianModModItems {
	public static Item OBSIDIAN_SWORD;
	public static Item OBSIDIAN_AXE;
	public static Item OBSIDIAN_HOE;
	public static Item OBSIDIAN_PICKAXE;
	public static Item OBSIDIAN_SHOVEL;
	public static Item OBSIDIAN_INGOT;
	public static Item OBSIDIAN_HELMET;
	public static Item OBSIDIAN_CHESTPLATE;
	public static Item OBSIDIAN_LEGGINGS;
	public static Item OBSIDIAN_BOOTS;

	public static void load() {
		OBSIDIAN_SWORD = register("obsidian_sword", new ObsidianSwordItem());
		OBSIDIAN_AXE = register("obsidian_axe", new ObsidianAxeItem());
		OBSIDIAN_HOE = register("obsidian_hoe", new ObsidianHoeItem());
		OBSIDIAN_PICKAXE = register("obsidian_pickaxe", new ObsidianPickaxeItem());
		OBSIDIAN_SHOVEL = register("obsidian_shovel", new ObsidianShovelItem());
		OBSIDIAN_INGOT = register("obsidian_ingot", new ObsidianIngotItem());
		OBSIDIAN_HELMET = register("obsidian_helmet", new ObsidianItem.Helmet());
		OBSIDIAN_CHESTPLATE = register("obsidian_chestplate", new ObsidianItem.Chestplate());
		OBSIDIAN_LEGGINGS = register("obsidian_leggings", new ObsidianItem.Leggings());
		OBSIDIAN_BOOTS = register("obsidian_boots", new ObsidianItem.Boots());
	}

	public static void clientLoad() {
	}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ObsdianModMod.MODID, registryName), item);
	}

	private static void registerBlockingProperty(Item item) {
		ItemProperties.register(item, new ResourceLocation("blocking"), (ClampedItemPropertyFunction) ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
	}
}
