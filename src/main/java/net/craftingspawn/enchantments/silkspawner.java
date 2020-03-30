package net.craftingspawn.enchantments;

import net.minecraft.enchantment.Enchantment;

// import net.minecraft.enchantment.*;

import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class silkspawner extends Enchantment {
    public silkspawner(Rarity weight,EnchantmentTarget target, EquipmentSlot[] slots){
        super(weight, target, slots);
    }

    @Override
    public int getMinimumPower(int int_1) {
        return 30;
    }

    @Override
    public int getMaximumLevel() {
        return 1;
    }
}

/*
 * @Override public void onTargetDamaged(LivingEntity user, Entity target, int
 * level) { if(target instanceof LivingEntity) { ((LivingEntity)
 * target).addPotionEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20 *
 * 2 * level, level - 1)); }
 * 
 * super.onTargetDamaged(user, target, level); }
 */