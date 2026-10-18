package dev.dimasik.mixin;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.system.Class_i0GDVYUh4DGVWtXa;
import net.minecraft.client.gui.components.events.ContainerEventHandler;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.client.input.MouseButtonEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ContainerEventHandler.class)
public interface ContainerEventHandlerMixin {
   @Inject(method = "mouseReleased", at = @At("TAIL"))
   private void mouseReleased(MouseButtonEvent var1, CallbackInfoReturnable<Boolean> var2) {
      if (this instanceof ChatScreen && var1.button() == 0) {
         Class_i0GDVYUh4DGVWtXa var3 = new Class_i0GDVYUh4DGVWtXa();
         DimasikClient.m_9057().m_9051().m_9708(var3);
      }
   }
}
