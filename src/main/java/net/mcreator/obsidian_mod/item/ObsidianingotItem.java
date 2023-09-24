
package net.mcreator.obsidian_mod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.obsidian_mod.init.ObsdianModModTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class ObsidianingotItem extends Item {
	public ObsidianingotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
		ItemGroupEvents.modifyEntriesEvent(ObsdianModModTabs.TAB_OBSIDIANMOD).register(content -> content.accept(this));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
