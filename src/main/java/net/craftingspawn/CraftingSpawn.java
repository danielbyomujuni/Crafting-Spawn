package net.craftingspawn;

import net.craftingspawn.enchantments.silkspawner;
import net.fabricmc.api.ModInitializer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CraftingSpawn implements ModInitializer {

	private static Enchantment silkSpawner;
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Spawning active!");
		//lootTables

		// Enchanments
		silkSpawner = Registry.register(Registry.ENCHANTMENT, new Identifier("craftingspawn", "silkspawner"),
				new silkspawner(Enchantment.Weight.VERY_RARE, EnchantmentTarget.DIGGER,
						new EquipmentSlot[] { EquipmentSlot.MAINHAND }));
	}

}
