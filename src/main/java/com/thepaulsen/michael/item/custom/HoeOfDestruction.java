package com.thepaulsen.michael.item.custom;

import com.thepaulsen.michael.SkcamEntry;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;


public class HoeOfDestruction extends SwordItem {

    public HoeOfDestruction(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, SkcamEntry.secondsToticks(8),2,false,false,false),target);
        return super.postHit(stack, target, attacker);
    }
}
