
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.obsidian_mod.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.obsidian_mod.item.ObsidianswordItem;
import net.mcreator.obsidian_mod.item.ObsidianshovelItem;
import net.mcreator.obsidian_mod.item.ObsidianpickaxeItem;
import net.mcreator.obsidian_mod.item.ObsidianingotItem;
import net.mcreator.obsidian_mod.item.ObsidianhoeItem;
import net.mcreator.obsidian_mod.item.ObsidianaxeItem;
import net.mcreator.obsidian_mod.item.ObsidianarmorItem;
import net.mcreator.obsidian_mod.ObsdianModMod;

public class ObsdianModModItems {
	public static Item OBSIDIANARMOR_HELMET;
	public static Item OBSIDIANARMOR_CHESTPLATE;
	public static Item OBSIDIANARMOR_LEGGINGS;
	public static Item OBSIDIANARMOR_BOOTS;
	public static Item OBSIDIANINGOT;
	public static Item OBSIDIANSWORD;
	public static Item OBSIDIANAXE;
	public static Item OBSIDIANHOE;
	public static Item OBSIDIANPICKAXE;
	public static Item OBSIDIANSHOVEL;

	public static void load() {
		OBSIDIANARMOR_HELMET = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ObsdianModMod.MODID, "obsidianarmor_helmet"), new ObsidianarmorItem.Helmet());
		OBSIDIANARMOR_CHESTPLATE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ObsdianModMod.MODID, "obsidianarmor_chestplate"), new ObsidianarmorItem.Chestplate());
		OBSIDIANARMOR_LEGGINGS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ObsdianModMod.MODID, "obsidianarmor_leggings"), new ObsidianarmorItem.Leggings());
		OBSIDIANARMOR_BOOTS = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ObsdianModMod.MODID, "obsidianarmor_boots"), new ObsidianarmorItem.Boots());
		OBSIDIANINGOT = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ObsdianModMod.MODID, "obsidianingot"), new ObsidianingotItem());
		OBSIDIANSWORD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ObsdianModMod.MODID, "obsidiansword"), new ObsidianswordItem());
		OBSIDIANAXE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ObsdianModMod.MODID, "obsidianaxe"), new ObsidianaxeItem());
		OBSIDIANHOE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ObsdianModMod.MODID, "obsidianhoe"), new ObsidianhoeItem());
		OBSIDIANPICKAXE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ObsdianModMod.MODID, "obsidianpickaxe"), new ObsidianpickaxeItem());
		OBSIDIANSHOVEL = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ObsdianModMod.MODID, "obsidianshovel"), new ObsidianshovelItem());
	}
}
