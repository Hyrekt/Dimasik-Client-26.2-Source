package dev.dimasik.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.mojang.blaze3d.pipeline.RenderTarget;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.HpHelper;
import dev.dimasik.client.module.render.Ambience;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.SkyRenderer;
import net.minecraft.client.renderer.state.level.SkyRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SkyRenderer.class)
public abstract class SkyRendererMixin {
   @ModifyExpressionValue(
      method = {"renderSkyDisc", "renderDarkDisc", "renderSun", "renderMoon", "renderStars", "renderSunriseAndSunset", "renderEndSky", "renderEndFlash"},
      at = @At(value = "FIELD", target = "Lnet/minecraft/client/renderer/SkyRenderer;renderTarget:Lcom/mojang/blaze3d/pipeline/RenderTarget;")
   )
   private RenderTarget dimasik$currentSkyTarget(RenderTarget var1) {
      return Minecraft.getInstance().gameRenderer.mainRenderTarget();
   }

   @Inject(method = "extractRenderState", at = @At("RETURN"))
   private void dimasikSkyOverrides(ClientLevel var1, float var2, Camera var3, SkyRenderState var4, CallbackInfo var5) {
      if (HpHelper.m_7672()) {
         int var6 = HpHelper.m_7674();
         var4.skyColor = var6;
         var4.sunriseAndSunsetColor = var6;
         var4.starBrightness = 0.0F;
         var4.shouldRenderDarkDisc = false;
      } else {
         if (shouldHideVanillaStars()) {
            var4.starBrightness = 0.0F;
         }
      }
   }

   private static boolean shouldHideVanillaStars() {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
         Ambience var0 = DimasikClient.m_9057().m_9049().m_2801().m_3511();
         return var0 != null && var0.m_3052();
      } else {
         return false;
      }
   }
}
