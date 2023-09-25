
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.obsidianmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.obsidianmod.item.ObsidianswordItem;
import net.mcreator.obsidianmod.item.ObsidianshovelItem;
import net.mcreator.obsidianmod.item.ObsidianpickaxeItem;
import net.mcreator.obsidianmod.item.ObsidianingotItem;
import net.mcreator.obsidianmod.item.ObsidianhoeItem;
import net.mcreator.obsidianmod.item.ObsidianaxeItem;
import net.mcreator.obsidianmod.item.ObsidianItem;
import net.mcreator.obsidianmod.ObsidianModMod;

public class ObsidianModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ObsidianModMod.MODID);
	public static final RegistryObject<Item> OBSIDIANSWORD = REGISTRY.register("obsidiansword", () -> new ObsidianswordItem());
	public static final RegistryObject<Item> OBSIDIANINGOT = REGISTRY.register("obsidianingot", () -> new ObsidianingotItem());
	public static final RegistryObject<Item> OBSIDIANSHOVEL = REGISTRY.register("obsidianshovel", () -> new ObsidianshovelItem());
	public static final RegistryObject<Item> OBSIDIANAXE = REGISTRY.register("obsidianaxe", () -> new ObsidianaxeItem());
	public static final RegistryObject<Item> OBSIDIANHOE = REGISTRY.register("obsidianhoe", () -> new ObsidianhoeItem());
	public static final RegistryObject<Item> OBSIDIANPICKAXE = REGISTRY.register("obsidianpickaxe", () -> new ObsidianpickaxeItem());
	public static final RegistryObject<Item> OBSIDIAN_HELMET = REGISTRY.register("obsidian_helmet", () -> new ObsidianItem.Helmet());
	public static final RegistryObject<Item> OBSIDIAN_CHESTPLATE = REGISTRY.register("obsidian_chestplate", () -> new ObsidianItem.Chestplate());
	public static final RegistryObject<Item> OBSIDIAN_LEGGINGS = REGISTRY.register("obsidian_leggings", () -> new ObsidianItem.Leggings());
	public static final RegistryObject<Item> OBSIDIAN_BOOTS = REGISTRY.register("obsidian_boots", () -> new ObsidianItem.Boots());
}
