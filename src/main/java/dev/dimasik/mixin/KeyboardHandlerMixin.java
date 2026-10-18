package dev.dimasik.mixin;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.ClientSounds;
import dev.dimasik.client.system.Class_B6JOzHnwhU3pe4AO;
import dev.dimasik.client.system.Class_BQT9PXBvcSf9Per8;
import net.minecraft.client.KeyboardHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.CharacterEvent;
import net.minecraft.client.input.KeyEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(KeyboardHandler.class)
public class KeyboardHandlerMixin {
   @Inject(method = "keyPress", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/platform/FramerateLimitTracker;onInputReceived()V"))
   private void onKey(long var1, int var3, KeyEvent var4, CallbackInfo var5) {
      Class_B6JOzHnwhU3pe4AO var6 = new Class_B6JOzHnwhU3pe4AO(var4.input(), var3);
      DimasikClient.m_9057().m_9051().m_9708(var6);
   }

   @Inject(method = "charTyped", at = @At("HEAD"), cancellable = true)
   private void onChar(long var1, CharacterEvent var3, CallbackInfo var4) {
      if (Class_BQT9PXBvcSf9Per8.m_2238(var3.codepointAsString())) {
         var4.cancel();
      } else {
         Screen var5 = Minecraft.getInstance().gui.screen();
         if (var5 != null && var5.getFocused() instanceof EditBox) {
            ClientSounds.m_9461();
         }
      }
   }
}
