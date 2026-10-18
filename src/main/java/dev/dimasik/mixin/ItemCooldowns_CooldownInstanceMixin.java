package dev.dimasik.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(targets = "net.minecraft.world.item.ItemCooldowns$CooldownInstance")
public interface ItemCooldowns_CooldownInstanceMixin {
   @Accessor("endTime")
   int getEndTick();
}
