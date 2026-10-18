package dev.dimasik.mixin;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.system.Class_7gtB1wL4loVjK2Lw;
import dev.dimasik.client.system.Class_BQT9PXBvcSf9Per8;
import dev.dimasik.client.system.Class_CPqSaXQtUSOKX1Z4;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_HKVFPtZz5yGHYty6;
import dev.dimasik.client.system.Class_lvSdQbZIK6LWhOfu;
import dev.dimasik.client.system.Class_qUEA6tS6otjuY2Wk;
import dev.dimasik.client.system.Class_wYdPm8P52As8DnF0;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.client.input.InputQuirks;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.input.MouseButtonEvent;
import org.joml.Vector2f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ChatScreen.class)
public class ChatScreenMixin {
   @Shadow
   protected EditBox input;

   @ModifyVariable(method = "handleChatInput", at = @At("HEAD"), argsOnly = true, ordinal = 0)
   private String replaceFriendAliasInServerTeleport(String var1) {
      return Class_HKVFPtZz5yGHYty6.m_2883() ? var1 : Class_7gtB1wL4loVjK2Lw.m_1744(var1);
   }

   @Inject(method = "init", at = @At("TAIL"))
   private void onInit(CallbackInfo var1) {
      if (!Class_HKVFPtZz5yGHYty6.m_2883()) {
         Class_qUEA6tS6otjuY2Wk var2 = new Class_qUEA6tS6otjuY2Wk();
         DimasikClient.m_9057().m_9051().m_9708(var2);
      }
   }

   @Inject(
      method = "handleChatInput",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/screens/ChatScreen;normalizeChatMessage(Ljava/lang/String;)Ljava/lang/String;",
         shift = Shift.AFTER
      ),
      cancellable = true
   )
   private void sendMessage(String var1, boolean var2, CallbackInfo var3) {
      var1 = ((ChatScreen)(Object)this).normalizeChatMessage(var1);
      if (!var1.isEmpty()) {
         if (DimasikClient.m_9057().m_9049().m_2805().m_1655(var1)) {
            var3.cancel();
         } else if (!DimasikClient.m_9057().m_9049().m_2805().m_1652()) {
            if (var1.startsWith(DimasikClient.m_9057().m_9049().m_2809().m_6132().toString())) {
               if (var2) {
                  Minecraft.getInstance().gui.hud.getChat().addRecentChat(var1);
               }

               DimasikClient.m_9057().m_9049().m_2809().m_6134(var1);
               var3.cancel();
            }
         }
      }
   }

   @Inject(method = "mouseClicked", at = @At("HEAD"), cancellable = true)
   private void mouseClicked(MouseButtonEvent var1, boolean var2, CallbackInfoReturnable<Boolean> var3) {
      if (!Class_HKVFPtZz5yGHYty6.m_2883()) {
         Vector2f var4 = Class_FvJXUGWpZo3zYBW4.m_2693(var1.x(), var1.y());
         Class_CPqSaXQtUSOKX1Z4 var5 = new Class_CPqSaXQtUSOKX1Z4(var4.x, var4.y, var1.button(), var2);
         DimasikClient.m_9057().m_9051().m_9708(var5);
         if (var5.m_1581()) {
            var3.setReturnValue(true);
         } else {
            boolean var6 = var1.button() == 2;
            boolean var7 = var1.button() == 0 && (var1.buttonInfo().modifiers() & InputQuirks.EDIT_SHORTCUT_KEY_MODIFIER) != 0;
            if ((var6 || var7) && Class_wYdPm8P52As8DnF0.m_9348()) {
               var3.setReturnValue(true);
            }
         }
      }
   }

   @Inject(method = "keyPressed", at = @At("HEAD"), cancellable = true)
   private void keyPressed(KeyEvent var1, CallbackInfoReturnable<Boolean> var2) {
      if (!Class_HKVFPtZz5yGHYty6.m_2883()) {
         if (Class_BQT9PXBvcSf9Per8.m_2244(var1.key())) {
            var2.setReturnValue(true);
         } else {
            if (var1.isCopy() && !this.hasChatFieldSelection() && Class_wYdPm8P52As8DnF0.m_9348()) {
               var2.setReturnValue(true);
            }
         }
      }
   }

   private boolean hasChatFieldSelection() {
      EditBox var1 = this.input;
      if (var1 == null) {
         return false;
      }

      String var2 = var1.getHighlighted();
      return var2 != null && !var2.isEmpty();
   }

   @Inject(method = "removed", at = @At("HEAD"))
   private void removed(CallbackInfo var1) {
      if (!Class_HKVFPtZz5yGHYty6.m_2883()) {
         Class_lvSdQbZIK6LWhOfu var2 = new Class_lvSdQbZIK6LWhOfu();
         DimasikClient.m_9057().m_9051().m_9708(var2);
      }
   }
}
