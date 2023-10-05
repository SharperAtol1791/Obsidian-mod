
package net.mcreator.obsidian_mod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.obsidian_mod.init.ObsdianModModTabs;
import net.mcreator.obsidian_mod.init.ObsdianModModItems;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.lang.reflect.Type;

public abstract class ObsidianarmorItem extends ArmorItem {
	public ObsidianarmorItem(Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 70;
			}

			@Override
			public int getDefenseForType(Type type) {
				return new int[]{42, 55, 72, 60}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 16;
			}

			@Override
			public SoundEvent getEquipSound() {
				return BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("item.armor.equip_diamond"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ObsdianModModItems.OBSIDIANINGOT));
			}

			@Environment(EnvType.CLIENT)
			@Override
			public String getName() {
				return "obsidian__";
			}

			@Override
			public float getToughness() {
				return 6f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, type, properties);
	}

	public static class Helmet extends ObsidianarmorItem {
		public Helmet() {
			super(Type.HELMET, new Item.Properties());
			ItemGroupEvents.modifyEntriesEvent(ObsdianModModTabs.TAB_OBSIDIANMOD).register(content -> content.accept(this));
		}

	}

	public static class Chestplate extends ObsidianarmorItem {

		public Chestplate() {
			super(Type.CHESTPLATE, new Item.Properties());
			ItemGroupEvents.modifyEntriesEvent(ObsdianModModTabs.TAB_OBSIDIANMOD).register(content -> content.accept(this));
		}

	}

	public static class Leggings extends ObsidianarmorItem {

		public Leggings() {
			super(Type.LEGGINGS, new Item.Properties());
			ItemGroupEvents.modifyEntriesEvent(ObsdianModModTabs.TAB_OBSIDIANMOD).register(content -> content.accept(this));
		}

	}

	public static class Boots extends ObsidianarmorItem {

		public Boots() {
			super(Type.BOOTS, new Item.Properties());
			ItemGroupEvents.modifyEntriesEvent(ObsdianModModTabs.TAB_OBSIDIANMOD).register(content -> content.accept(this));
		}

	}
}
