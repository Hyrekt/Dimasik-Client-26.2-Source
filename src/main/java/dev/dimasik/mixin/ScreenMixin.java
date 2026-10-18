package dev.dimasik.mixin;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.system.Class_HKVFPtZz5yGHYty6;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.player.LocalPlayer;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Screen.class)
public class ScreenMixin {
   private static final String f_36615 = "/";

   @Inject(method = "clickCommandAction", at = @At("HEAD"), cancellable = true)
   private static void dimasik$runClientCommand(LocalPlayer var0, String var1, @Nullable Screen var2, CallbackInfo var3) {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null) {
         String var4 = var1.startsWith(f_36615) ? var1.substring(1) : var1;
         String var5 = DimasikClient.m_9057().m_9049().m_2809().m_6132().toString();
         if (var4.startsWith(var5)) {
            if (!Class_HKVFPtZz5yGHYty6.m_2883()) {
               DimasikClient.m_9057().m_9049().m_2809().m_6134(var4);
               var3.cancel();
            }
         }
      }
   }
}
