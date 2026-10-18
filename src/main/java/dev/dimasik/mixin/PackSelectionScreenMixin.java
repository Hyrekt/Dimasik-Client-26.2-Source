package dev.dimasik.mixin;

import dev.dimasik.client.system.Class_HKVFPtZz5yGHYty6;
import dev.dimasik.client.system.Class_h8wWKghzmqgLkZHd;
import java.nio.file.Path;
import net.minecraft.client.gui.screens.packs.PackSelectionScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(PackSelectionScreen.class)
public abstract class PackSelectionScreenMixin {
   private static final String f_36613 = "resourcepacks";

   @ModifyVariable(method = "<init>", at = @At("HEAD"), argsOnly = true, ordinal = 0)
   private static Path dimasik$redirectResourcePackFolder(Path var0) {
      if (Class_HKVFPtZz5yGHYty6.m_2883() && var0 != null) {
         Path var1 = var0.getFileName();
         if (var1 != null && f_36613.equalsIgnoreCase(var1.toString())) {
            Path var2 = Class_h8wWKghzmqgLkZHd.m_7093();
            return var2 == null ? var0 : var2;
         } else {
            return var0;
         }
      } else {
         return var0;
      }
   }
}
