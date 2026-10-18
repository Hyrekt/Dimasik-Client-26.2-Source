package dev.dimasik.mixin;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.system.Class_3rIWKJPNF4pSLfT4;
import dev.dimasik.client.system.Class_mzQ5t1DkueICIw6Q;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.screens.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Gui.class)
public class GuiMixin {
   @ModifyVariable(method = "setScreen", at = @At("HEAD"), argsOnly = true)
   private Screen replaceTitleScreen(Screen var1) {
      Screen var2 = Class_3rIWKJPNF4pSLfT4.m_1330(var1, Minecraft.getInstance().level != null);
      return DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null
         ? DimasikClient.m_9057().m_9049().m_2801().m_3461().m_7386(var2)
         : var2;
   }

   @Inject(
      method = "extractRenderState",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/screens/Screen;extractRenderStateWithTooltipAndSubtitles(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V"
      )
   )
   private void flushHudBeforeScreen(DeltaTracker var1, boolean var2, boolean var3, CallbackInfo var4) {
      Class_mzQ5t1DkueICIw6Q.m_7638();
   }
}
