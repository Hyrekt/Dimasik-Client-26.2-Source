package dev.dimasik.mixin;

import dev.dimasik.client.system.Class_wYdPm8P52As8DnF0;
import net.minecraft.util.FormattedCharSequence;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(targets = "net.minecraft.client.gui.components.ChatComponent$DrawingFocusedGraphicsAccess")
public abstract class ChatComponent_DrawingFocusedGraphicsAccessMixin {
   @Inject(method = "handleMessage", at = @At("RETURN"))
   private void dimas$captureHoveredLine(int var1, float var2, FormattedCharSequence var3, CallbackInfoReturnable<Boolean> var4) {
      if (Boolean.TRUE.equals(var4.getReturnValue()) && var3 != null) {
         Class_wYdPm8P52As8DnF0.m_9346(var3);
      }
   }
}
