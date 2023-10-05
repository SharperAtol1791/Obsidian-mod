
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.obsidian_mod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.obsidian_mod.ObsdianModMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class ObsdianModModTabs {
	public static ResourceKey<CreativeModeTab> TAB_OBSIDIANMOD = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(ObsdianModMod.MODID, "obsidianmod"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_OBSIDIANMOD,
				FabricItemGroup.builder().title(Component.translatable("item_group." + ObsdianModMod.MODID + ".obsidianmod")).icon(() -> new ItemStack(ObsdianModModItems.OBSIDIANINGOT)).build());
	}
}
