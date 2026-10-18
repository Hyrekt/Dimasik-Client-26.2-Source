package dev.dimasik.mixin;

import dev.dimasik.client.system.Class_HKVFPtZz5yGHYty6;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gui.components.DebugScreenOverlay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(DebugScreenOverlay.class)
public abstract class DebugScreenOverlayMixin {
   private static final String f_36634 = "Java:";
   private static final String f_36635 = "Java: 21";

   @ModifyVariable(method = "extractLines", at = @At("HEAD"), argsOnly = true)
   private List<String> dimasik$maskJavaVersion(List<String> var1) {
      if (Class_HKVFPtZz5yGHYty6.m_2883() && var1 != null && !var1.isEmpty()) {
         ArrayList var2 = null;

         for (int var3 = 0; var3 < var1.size(); var3++) {
            String var4 = (String)var1.get(var3);
            if (var4 != null && var4.trim().startsWith(f_36634)) {
               if (var2 == null) {
                  var2 = new ArrayList(var1);
               }

               var2.set(var3, f_36635);
            }
         }

         return var2 == null ? var1 : var2;
      } else {
         return var1;
      }
   }
}
