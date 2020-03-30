package net.craftingspawn;

import net.craftingspawn.enchantments.silkspawner;
import net.craftingspawn.items.golemEgg;
import net.fabricmc.api.ModInitializer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CraftingSpawn implements ModInitializer {
	private static Enchantment SilkSpawner;
	public static final golemEgg GOLEM_EGG = new golemEgg(EntityType.IRON_GOLEM, 0xf3ffff, 0xffecd4,
			new Item.Settings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Spawning active!");
		// Blocks
		// Items
		Registry.register(Registry.ITEM, new Identifier("craftingspawn", "golem_egg"), GOLEM_EGG);

		// Enchanments
		SilkSpawner = Registry.register(Registry.ENCHANTMENT, new Identifier("craftingspawn", "silkspawner"),
				new silkspawner(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.DIGGER,
						new EquipmentSlot[] { EquipmentSlot.MAINHAND }));
	}

}
