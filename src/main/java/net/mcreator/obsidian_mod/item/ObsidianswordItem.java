
package net.mcreator.obsidian_mod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.obsidian_mod.init.ObsdianModModTabs;
import net.mcreator.obsidian_mod.init.ObsdianModModItems;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class ObsidianswordItem extends SwordItem {
	public ObsidianswordItem() {
		super(new Tier() {
			public int getUses() {
				return 3678;
			}

			public float getSpeed() {
				return 16f;
			}

			public float getAttackDamageBonus() {
				return 17f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 16;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ObsdianModModItems.OBSIDIANINGOT));
			}
		}, 3, -3f, new Item.Properties());
		ItemGroupEvents.modifyEntriesEvent(ObsdianModModTabs.TAB_OBSIDIANMOD).register(content -> content.accept(this));
	}
}
