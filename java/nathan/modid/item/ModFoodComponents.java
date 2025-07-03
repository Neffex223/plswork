package nathan.modid.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import oshi.driver.windows.wmi.Win32Fan;

public class ModFoodComponents {
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .build();



public static final FoodComponent PINK_GARNET_POTION = new FoodComponent.Builder().nutrition(0).saturationModifier(0)
        .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1000),100).statusEffect(new StatusEffectInstance(
        StatusEffects.REGENERATION, 200),100).alwaysEdible().build();

public static final FoodComponent GREEN_GARNET_POTION = new FoodComponent.Builder().nutrition(0).saturationModifier(0)
        .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 450),100).statusEffect(new StatusEffectInstance(
        StatusEffects.JUMP_BOOST, 450),100).alwaysEdible().build();



}






