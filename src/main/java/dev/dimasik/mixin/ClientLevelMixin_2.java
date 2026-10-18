package dev.dimasik.mixin;

import dev.dimasik.client.system.Class_nulhzpfOWV9d1NBW;
import net.minecraft.client.multiplayer.ClientLevel;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientLevel.class)
public class ClientLevelMixin_2 {
   @Inject(method = "tickWeatherEffects", at = @At("HEAD"), cancellable = true)
   private void dimasik$weatherParticles(CallbackInfo var1) {
      if (Class_nulhzpfOWV9d1NBW.m_7705()) {
         var1.cancel();
      }
   }
}
