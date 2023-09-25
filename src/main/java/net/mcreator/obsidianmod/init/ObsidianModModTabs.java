
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.obsidianmod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ObsidianModModTabs {
	public static CreativeModeTab TAB_OBSIDIANMOD;

	public static void load() {
		TAB_OBSIDIANMOD = new CreativeModeTab("tabobsidianmod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ObsidianModModItems.OBSIDIANINGOT.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
