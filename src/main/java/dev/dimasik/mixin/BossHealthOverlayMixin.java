package dev.dimasik.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import dev.dimasik.client.system.Class_nulhzpfOWV9d1NBW;
import dev.dimasik.client.system.Class_w94t5R4ZHRA02uGb;
import dev.dimasik.client.system.Class_xYKqykPYp6IuC6PX;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.BossHealthOverlay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BossHealthOverlay.class)
public class BossHealthOverlayMixin {
   private static final float f_36499 = 9.0F;
   private static final float f_36500 = 19.0F;

   @Inject(method = "extractRenderState", at = @At("HEAD"), cancellable = true)
   private void render(GuiGraphicsExtractor var1, CallbackInfo var2) {
      if (Class_nulhzpfOWV9d1NBW.m_7706(Class_xYKqykPYp6IuC6PX.QfQnMomAbf3hjvZP.BOSSBAR)) {
         var2.cancel();
      }
   }

   @ModifyConstant(method = "extractRenderState", constant = @Constant(intValue = 12))
   private int dimas$shiftBossBarY(int var1) {
      Class_w94t5R4ZHRA02uGb.m_9301();
      int var2 = Math.max(1, ((BossHealthOverlayMixin_2)this).getBossBars().size());
      return var1 + Math.round(Class_w94t5R4ZHRA02uGb.m_9304(var1 - f_36499, var2 * f_36500));
   }

   @ModifyExpressionValue(method = "extractRenderState", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiGraphicsExtractor;guiHeight()I"))
   private int dimas$allowBossBarBelowTab(int var1) {
      return Class_w94t5R4ZHRA02uGb.m_9300() ? var1 * 3 : var1;
   }
}
