package dev.dimasik.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import dev.dimasik.client.module.render.KillEffects;
import dev.dimasik.client.system.Class_nulhzpfOWV9d1NBW;
import dev.dimasik.client.system.Class_xYKqykPYp6IuC6PX;
import net.minecraft.client.player.AbstractClientPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(AbstractClientPlayer.class)
public class AbstractClientPlayerMixin {
   @ModifyReturnValue(method = "getFieldOfViewModifier", at = @At("RETURN"))
   private float staticFov(float var1) {
      float var2 = Class_nulhzpfOWV9d1NBW.m_7706(Class_xYKqykPYp6IuC6PX.QfQnMomAbf3hjvZP.DYNAMIC_FOV) ? 1.0F : var1;
      return var2 * KillEffects.m_9733();
   }
}
