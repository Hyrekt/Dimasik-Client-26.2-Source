package dev.dimasik.mixin;

import dev.dimasik.client.system.Class_29BIBbZyd5QWCwS1;
import dev.dimasik.client.system.Class_BQT9PXBvcSf9Per8;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.network.chat.Component;
import net.minecraft.util.FormattedCharSequence;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(GuiGraphicsExtractor.class)
public class GuiGraphicsExtractorMixin {
   @ModifyVariable(method = "text(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;IIIZ)V", at = @At("HEAD"), argsOnly = true, ordinal = 0)
   private Component protectCompleteText(Component var1) {
      if (!Class_29BIBbZyd5QWCwS1.m_932() && !Class_29BIBbZyd5QWCwS1.m_975()) {
         Component var2;
         if (Class_29BIBbZyd5QWCwS1.m_974()) {
            var2 = var1;
         } else {
            var2 = Class_29BIBbZyd5QWCwS1.m_952() ? Class_29BIBbZyd5QWCwS1.m_933(var1) : Class_29BIBbZyd5QWCwS1.m_989(var1);
         }

         return Class_BQT9PXBvcSf9Per8.m_2247(var2);
      } else {
         return var1;
      }
   }

   @ModifyVariable(method = "text(Lnet/minecraft/client/gui/Font;Ljava/lang/String;IIIZ)V", at = @At("HEAD"), argsOnly = true, ordinal = 0)
   private String protectCompleteString(String var1) {
      if (!Class_29BIBbZyd5QWCwS1.m_932() && !Class_29BIBbZyd5QWCwS1.m_975()) {
         String var2 = Class_29BIBbZyd5QWCwS1.m_952() ? Class_29BIBbZyd5QWCwS1.m_988(var1) : Class_29BIBbZyd5QWCwS1.m_945(var1);
         return Class_BQT9PXBvcSf9Per8.m_2256(var2);
      } else {
         return var1;
      }
   }

   @ModifyVariable(
      method = "text(Lnet/minecraft/client/gui/Font;Lnet/minecraft/util/FormattedCharSequence;IIIZ)V",
      at = @At("HEAD"),
      argsOnly = true,
      ordinal = 0
   )
   private FormattedCharSequence protectCompleteOrderedText(FormattedCharSequence var1) {
      if (!Class_29BIBbZyd5QWCwS1.m_932() && !Class_29BIBbZyd5QWCwS1.m_975()) {
         return Class_29BIBbZyd5QWCwS1.m_952() ? var1 : Class_29BIBbZyd5QWCwS1.m_948(var1);
      } else {
         return var1;
      }
   }
}
