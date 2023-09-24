
package net.mcreator.obsidianmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.obsidianmod.init.ObsidianModModTabs;

public class ObsidianingotItem extends Item {
	public ObsidianingotItem() {
		super(new Item.Properties().tab(ObsidianModModTabs.TAB_OBSIDIANMOD).stacksTo(64).rarity(Rarity.COMMON));
	}
}
