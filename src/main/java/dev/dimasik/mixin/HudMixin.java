package dev.dimasik.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.render.SwingAnimations;
import dev.dimasik.client.system.Class_29BIBbZyd5QWCwS1;
import dev.dimasik.client.system.Class_BQT9PXBvcSf9Per8;
import dev.dimasik.client.system.Class_HKVFPtZz5yGHYty6;
import dev.dimasik.client.system.Class_UiQ3442HnvvsK2qb;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_nulhzpfOWV9d1NBW;
import dev.dimasik.client.system.Class_xYKqykPYp6IuC6PX;
import dev.dimasik.client.system.Class_zPTPeXzpzYUQVVGj;
import dev.dimasik.client.ui.screen.Screen_3;
import dev.dimasik.client.ui.screen.Screen_4;
import dev.dimasik.client.ui.screen.Screen_5;
import dev.dimasik.client.ui.screen.Screen_6;
import dev.dimasik.client.ui.screen.Screen_8;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.Hud;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.scores.Objective;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Hud.class)
public class HudMixin {
   @Shadow
   @Final
   private static Identifier POWDER_SNOW_OUTLINE_LOCATION;

   @Inject(method = "extractItemHotbar", at = @At("HEAD"), cancellable = true)
   private void hideVanillaHotbar(GuiGraphicsExtractor var1, DeltaTracker var2, CallbackInfo var3) {
      if (!Class_HKVFPtZz5yGHYty6.m_2883()) {
         Class_bhRaN0YSSLQRYjPo.SUSXKajFiEmtJOMn var4 = new Class_bhRaN0YSSLQRYjPo.SUSXKajFiEmtJOMn(
            (float)Minecraft.getInstance().mouseHandler.xpos(), (float)Minecraft.getInstance().mouseHandler.ypos(), var1
         );
         DimasikClient.m_9057().m_9051().m_9708(var4);
         if (var4.m_1581()) {
            var3.cancel();
         }
      }
   }

   @Inject(method = "extractTextureOverlay", at = @At("HEAD"), cancellable = true)
   private void hidePowderSnowOverlay(GuiGraphicsExtractor var1, Identifier var2, float var3, CallbackInfo var4) {
      if (var2 == POWDER_SNOW_OUTLINE_LOCATION && Class_nulhzpfOWV9d1NBW.m_7706(Class_xYKqykPYp6IuC6PX.QfQnMomAbf3hjvZP.POWDER_SNOW)) {
         var4.cancel();
      }
   }

   @Inject(method = "extractCrosshair", at = @At("HEAD"), cancellable = true)
   private void hideCrosshairInClickGui(GuiGraphicsExtractor var1, DeltaTracker var2, CallbackInfo var3) {
      if (!Class_HKVFPtZz5yGHYty6.m_2883()) {
         if (SwingAnimations.m_7265(Minecraft.getInstance().gui.screen())) {
            var3.cancel();
         } else {
            Class_bhRaN0YSSLQRYjPo.T0zcSk3flslBWOtw var4 = new Class_bhRaN0YSSLQRYjPo.T0zcSk3flslBWOtw(
               (float)Minecraft.getInstance().mouseHandler.xpos(), (float)Minecraft.getInstance().mouseHandler.ypos(), var1
            );
            DimasikClient.m_9057().m_9051().m_9708(var4);
            if (var4.m_1581()) {
               var3.cancel();
            }

            if (Minecraft.getInstance().gui.screen() instanceof Screen_8
               || Minecraft.getInstance().gui.screen() instanceof Screen_4
               || Minecraft.getInstance().gui.screen() instanceof Screen_5
               || Minecraft.getInstance().gui.screen() instanceof Screen_6) {
               var3.cancel();
            }

            if (Minecraft.getInstance().gui.screen() instanceof Screen_3) {
               var3.cancel();
            }
         }
      }
   }

   @Inject(method = "extractCameraOverlays", at = @At("HEAD"))
   private void render(GuiGraphicsExtractor var1, DeltaTracker var2, CallbackInfo var3) {
      if (!Class_HKVFPtZz5yGHYty6.m_2883()) {
         Class_bhRaN0YSSLQRYjPo var4 = new Class_bhRaN0YSSLQRYjPo(
            (float)Minecraft.getInstance().mouseHandler.xpos(), (float)Minecraft.getInstance().mouseHandler.ypos(), var1
         );
         DimasikClient.m_9057().m_9051().m_9708(var4);
      }
   }

   @Inject(method = "extractVignette", at = @At("HEAD"), cancellable = true)
   private void renderVignetteOverlay(GuiGraphicsExtractor var1, Entity var2, CallbackInfo var3) {
      if (Class_nulhzpfOWV9d1NBW.m_7706(Class_xYKqykPYp6IuC6PX.QfQnMomAbf3hjvZP.VIGNETTE)) {
         var3.cancel();
      }
   }

   @Inject(method = "extractTitle", at = @At("HEAD"), cancellable = true)
   private void renderTitleAndSubtitle(GuiGraphicsExtractor var1, DeltaTracker var2, CallbackInfo var3) {
      if (Class_nulhzpfOWV9d1NBW.m_7706(Class_xYKqykPYp6IuC6PX.QfQnMomAbf3hjvZP.TITLE)) {
         var3.cancel();
      }
   }

   @Inject(
      method = "displayScoreboardSidebar(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/world/scores/Objective;)V",
      at = @At("HEAD"),
      cancellable = true
   )
   private void renderScoreboardSidebar(GuiGraphicsExtractor var1, Objective var2, CallbackInfo var3) {
      Class_29BIBbZyd5QWCwS1.m_963();
      Class_BQT9PXBvcSf9Per8.m_2246();
      if (Class_nulhzpfOWV9d1NBW.m_7706(Class_xYKqykPYp6IuC6PX.QfQnMomAbf3hjvZP.SCOREBOARD)) {
         Class_UiQ3442HnvvsK2qb var5 = Class_UiQ3442HnvvsK2qb.m_5279();
         if (var5 != null) {
            var5.m_5286();
         }

         Class_BQT9PXBvcSf9Per8.m_2251();
         Class_29BIBbZyd5QWCwS1.m_943();
         var3.cancel();
      } else {
         Class_UiQ3442HnvvsK2qb var4 = Class_UiQ3442HnvvsK2qb.m_5279();
         if (var4 != null) {
            var4.m_5273(var1);
         }
      }
   }

   @Inject(method = "displayScoreboardSidebar(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/world/scores/Objective;)V", at = @At("RETURN"))
   private void endScoreboardSidebar(GuiGraphicsExtractor var1, Objective var2, CallbackInfo var3) {
      Class_UiQ3442HnvvsK2qb var4 = Class_UiQ3442HnvvsK2qb.m_5279();
      if (var4 != null) {
         var4.m_5276(var1);
      }

      Class_BQT9PXBvcSf9Per8.m_2251();
      Class_29BIBbZyd5QWCwS1.m_943();
   }

   @WrapOperation(
      method = "displayScoreboardSidebar(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/world/scores/Objective;)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiGraphicsExtractor;fill(IIIII)V")
   )
   private void captureScoreboardFill(GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5, int var6, Operation<Void> var7) {
      Class_UiQ3442HnvvsK2qb var8 = Class_UiQ3442HnvvsK2qb.m_5279();
      if (var8 != null) {
         var8.m_5268(var2, var3, var4, var5);
      }

      var7.call(new Object[]{var1, var2, var3, var4, var5, var6});
   }

   @WrapOperation(
      method = "displayScoreboardSidebar(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/world/scores/Objective;)V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/GuiGraphicsExtractor;text(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;IIIZ)V"
      )
   )
   private void decorateScoreboardText(GuiGraphicsExtractor var1, Font var2, Component var3, int var4, int var5, int var6, boolean var7, Operation<Void> var8) {
      Component var9 = Class_29BIBbZyd5QWCwS1.m_972(var3);
      Class_BQT9PXBvcSf9Per8.m_2242(var1, var2, var9, var4, var5);
      Component var10 = Class_BQT9PXBvcSf9Per8.m_2247(var9);
      Class_29BIBbZyd5QWCwS1.m_953();

      try {
         var8.call(new Object[]{var1, var2, var10, var4, var5, var6, var7});
      } finally {
         Class_29BIBbZyd5QWCwS1.m_934();
      }
   }

   @ModifyExpressionValue(method = "extractItemHotbar", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/player/Inventory;getSelectedSlot()I"))
   private int replaceRenderedHotbarSlot(int var1) {
      if (Class_HKVFPtZz5yGHYty6.m_2883()) {
         return var1;
      }

      Class_zPTPeXzpzYUQVVGj var2 = Class_zPTPeXzpzYUQVVGj.f_36113.m_9809(var1);
      DimasikClient.m_9057().m_9051().m_9708(var2);
      return var2.m_9821();
   }
}
