package dev.dimasik.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import dev.dimasik.client.module.misc.Optimization;
import net.minecraft.client.Options;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(Options.class)
public abstract class OptionsMixin {
   @ModifyReturnValue(method = "getEffectiveRenderDistance", at = @At("RETURN"))
   private int dimasik$capRenderDistance(int var1) {
      return Optimization.m_5845(var1);
   }
}
