
package net.mcreator.obsidian_mod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.obsidian_mod.init.ObsdianModModTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import java.util.List;

public class ObsidianIngotItem extends Item {
	public ObsidianIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
		ItemGroupEvents.modifyEntriesEvent(ObsdianModModTabs.TAB_OBSIDIAN_MOD).register(content -> content.accept(this));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
