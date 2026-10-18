package dev.dimasik.mixin;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import dev.dimasik.client.system.Class_29BIBbZyd5QWCwS1;
import dev.dimasik.client.system.Class_3dmyjp6zjiPOb8Hv;
import dev.dimasik.client.system.Class_BQT9PXBvcSf9Per8;
import net.minecraft.client.gui.Font;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.FormattedText;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(Font.class)
public class FontMixin {
   @Unique
   private final Class_3dmyjp6zjiPOb8Hv<Integer> dimas$scoreboardWidths = new Class_3dmyjp6zjiPOb8Hv<>(128);

   @WrapMethod(method = "width(Lnet/minecraft/network/chat/FormattedText;)I")
   private int dimas$cacheScoreboardWidth(FormattedText var1, Operation<Integer> var2) {
      if (Class_29BIBbZyd5QWCwS1.m_974() && !Class_29BIBbZyd5QWCwS1.m_975() && var1 instanceof Component var3) {
         Component var4 = Class_BQT9PXBvcSf9Per8.m_2247(Class_29BIBbZyd5QWCwS1.m_972(var3));
         return this.dimas$scoreboardWidths.m_1318(var4, var1x -> {
            Class_29BIBbZyd5QWCwS1.m_953();

            try {
               return (Integer)var2.call(new Object[]{var1x});
            } finally {
               Class_29BIBbZyd5QWCwS1.m_934();
            }
         });
      } else {
         return (Integer)var2.call(new Object[]{var1});
      }
   }

   @ModifyVariable(
      method = {
            "width(Lnet/minecraft/network/chat/FormattedText;)I",
            "wordWrapHeight(Lnet/minecraft/network/chat/FormattedText;I)I",
            "split(Lnet/minecraft/network/chat/FormattedText;I)Ljava/util/List;",
            "splitIgnoringLanguage(Lnet/minecraft/network/chat/FormattedText;I)Ljava/util/List;"
      },
      at = @At("HEAD"),
      argsOnly = true,
      ordinal = 0
   )
   private FormattedText protectCompleteText(FormattedText var1) {
      if (Class_29BIBbZyd5QWCwS1.m_932() || Class_29BIBbZyd5QWCwS1.m_975()) {
         return var1;
      }

      if (var1 instanceof Component var2) {
         if (Class_29BIBbZyd5QWCwS1.m_974()) {
            return Class_BQT9PXBvcSf9Per8.m_2247(Class_29BIBbZyd5QWCwS1.m_972(var2));
         } else {
            return Class_BQT9PXBvcSf9Per8.m_2254() ? Class_BQT9PXBvcSf9Per8.m_2247(Class_29BIBbZyd5QWCwS1.m_989(var2)) : Class_29BIBbZyd5QWCwS1.m_933(var2);
         }
      } else {
         return var1;
      }
   }
}
