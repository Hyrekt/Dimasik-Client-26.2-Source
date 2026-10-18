package dev.dimasik.mixin;

import dev.dimasik.client.system.Class_7dCjHrlQt8mkhswh;
import net.minecraft.client.gui.screens.ConnectScreen;
import net.minecraft.client.multiplayer.resolver.ServerAddress;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ConnectScreen.class)
public class ConnectScreenMixin {
   @ModifyVariable(
      method = "startConnecting(Lnet/minecraft/client/gui/screens/Screen;Lnet/minecraft/client/Minecraft;Lnet/minecraft/client/multiplayer/resolver/ServerAddress;Lnet/minecraft/client/multiplayer/ServerData;ZLnet/minecraft/client/multiplayer/TransferState;)V",
      at = @At("HEAD"),
      argsOnly = true
   )
   private static ServerAddress dimasik$redirectConnect(ServerAddress var0) {
      return Class_7dCjHrlQt8mkhswh.m_1743(var0);
   }
}
