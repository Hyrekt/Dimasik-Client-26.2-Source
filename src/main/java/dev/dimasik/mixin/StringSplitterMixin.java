package dev.dimasik.mixin;

import dev.dimasik.client.system.Class_29BIBbZyd5QWCwS1;
import net.minecraft.client.StringSplitter;
import net.minecraft.network.chat.Style;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(StringSplitter.class)
public abstract class StringSplitterMixin {
   @Inject(
      method = {
            "plainIndexAtWidth(Ljava/lang/String;ILnet/minecraft/network/chat/Style;)I",
            "findLineBreak(Ljava/lang/String;ILnet/minecraft/network/chat/Style;)I"
      },
      at = @At("HEAD")
   )
   private void dimas$beginIndexOperation(String var1, int var2, Style var3, CallbackInfoReturnable<Integer> var4) {
      Class_29BIBbZyd5QWCwS1.m_982();
   }

   @Inject(
      method = {
            "plainIndexAtWidth(Ljava/lang/String;ILnet/minecraft/network/chat/Style;)I",
            "findLineBreak(Ljava/lang/String;ILnet/minecraft/network/chat/Style;)I"
      },
      at = @At("RETURN")
   )
   private void dimas$endIndexOperation(String var1, int var2, Style var3, CallbackInfoReturnable<Integer> var4) {
      Class_29BIBbZyd5QWCwS1.m_977();
   }

   @Inject(
      method = {
            "plainHeadByWidth(Ljava/lang/String;ILnet/minecraft/network/chat/Style;)Ljava/lang/String;",
            "plainTailByWidth(Ljava/lang/String;ILnet/minecraft/network/chat/Style;)Ljava/lang/String;"
      },
      at = @At("HEAD")
   )
   private void dimas$beginSubstringOperation(String var1, int var2, Style var3, CallbackInfoReturnable<String> var4) {
      Class_29BIBbZyd5QWCwS1.m_982();
   }

   @Inject(
      method = {
            "plainHeadByWidth(Ljava/lang/String;ILnet/minecraft/network/chat/Style;)Ljava/lang/String;",
            "plainTailByWidth(Ljava/lang/String;ILnet/minecraft/network/chat/Style;)Ljava/lang/String;"
      },
      at = @At("RETURN")
   )
   private void dimas$endSubstringOperation(String var1, int var2, Style var3, CallbackInfoReturnable<String> var4) {
      Class_29BIBbZyd5QWCwS1.m_977();
   }
}
