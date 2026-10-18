package dev.dimasik.mixin;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.render.Ambience;
import dev.dimasik.client.module.render.Rain;
import dev.dimasik.client.system.Class_nulhzpfOWV9d1NBW;
import dev.dimasik.client.system.Class_xYKqykPYp6IuC6PX;
import net.minecraft.client.renderer.WeatherEffectRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WeatherEffectRenderer.class)
public abstract class WeatherEffectRendererMixin {
   @Inject(method = "render", at = @At("HEAD"), cancellable = true)
   private void cancelVanillaPrecipitation(CallbackInfo var1) {
      if (shouldSuppressVanillaWeather()) {
         var1.cancel();
      }
   }

   private static boolean shouldSuppressVanillaWeather() {
      if (DimasikClient.m_9057() == null) {
         return false;
      }

      Ambience var0 = DimasikClient.m_9057().m_9049().m_2801().m_3511();
      return Rain.m_6679() || Class_nulhzpfOWV9d1NBW.m_7706(Class_xYKqykPYp6IuC6PX.QfQnMomAbf3hjvZP.RAIN) || var0 != null && var0.m_3012();
   }
}
