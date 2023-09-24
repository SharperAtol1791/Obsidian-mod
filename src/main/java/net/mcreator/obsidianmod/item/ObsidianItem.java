
package net.mcreator.obsidianmod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.obsidianmod.init.ObsidianModModTabs;
import net.mcreator.obsidianmod.init.ObsidianModModItems;

public abstract class ObsidianItem extends ArmorItem {
	public ObsidianItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 37;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{26, 19, 25, 30}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ObsidianModModItems.OBSIDIANINGOT.get()));
			}

			@Override
			public String getName() {
				return "obsidian";
			}

			@Override
			public float getToughness() {
				return 5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends ObsidianItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(ObsidianModModTabs.TAB_OBSIDIANMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "obsidian_mod:textures/models/armor/obsidian__layer_1.png";
		}
	}

	public static class Chestplate extends ObsidianItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(ObsidianModModTabs.TAB_OBSIDIANMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "obsidian_mod:textures/models/armor/obsidian__layer_1.png";
		}
	}

	public static class Leggings extends ObsidianItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(ObsidianModModTabs.TAB_OBSIDIANMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "obsidian_mod:textures/models/armor/obsidian__layer_2.png";
		}
	}

	public static class Boots extends ObsidianItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(ObsidianModModTabs.TAB_OBSIDIANMOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "obsidian_mod:textures/models/armor/obsidian__layer_1.png";
		}
	}
}
