package dev.dimasik.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.dimasik.client.system.Class_nulhzpfOWV9d1NBW;
import dev.dimasik.client.system.Class_xYKqykPYp6IuC6PX;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ScreenEffectRenderer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ScreenEffectRenderer.class)
public class ScreenEffectRendererMixin {
   @Inject(method = "submitFire", at = @At("HEAD"), cancellable = true)
   private static void submitFireOverlay(PoseStack var0, SubmitNodeCollector var1, TextureAtlasSprite var2, CallbackInfo var3) {
      if (Class_nulhzpfOWV9d1NBW.m_7706(Class_xYKqykPYp6IuC6PX.QfQnMomAbf3hjvZP.FIRE)) {
         var3.cancel();
      }
   }

   @Inject(method = "submitBlockSprite", at = @At("HEAD"), cancellable = true)
   private static void renderInWallOverlay(TextureAtlasSprite var0, PoseStack var1, SubmitNodeCollector var2, int var3, CallbackInfo var4) {
      if (Class_nulhzpfOWV9d1NBW.m_7706(Class_xYKqykPYp6IuC6PX.QfQnMomAbf3hjvZP.CAMERA_CLIP)) {
         var4.cancel();
      }
   }

   @Inject(method = "submitWater", at = @At("HEAD"), cancellable = true)
   private static void renderUnderwaterOverlay(Minecraft var0, PoseStack var1, SubmitNodeCollector var2, CallbackInfo var3) {
      if (Class_nulhzpfOWV9d1NBW.m_7706(Class_xYKqykPYp6IuC6PX.QfQnMomAbf3hjvZP.UNDERWATER_BLUR)) {
         var3.cancel();
      }
   }
}
