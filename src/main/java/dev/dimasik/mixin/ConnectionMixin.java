package dev.dimasik.mixin;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.system.Class_3LQSDrJ0WJYOQ7ck;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_lTzchJDbvRVrnXlw;
import dev.dimasik.client.system.Class_nCtAXu2tIwCiU5cL;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.client.Minecraft;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.Packet;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Connection.class)
public class ConnectionMixin {
   @Inject(method = "send(Lnet/minecraft/network/protocol/Packet;Lio/netty/channel/ChannelFutureListener;Z)V", at = @At("HEAD"), cancellable = true)
   private void onSend(Packet<?> var1, @Nullable ChannelFutureListener var2, boolean var3, CallbackInfo var4) {
      boolean var5 = Class_3LQSDrJ0WJYOQ7ck.m_1294().remove(var1);
      Minecraft var6 = Minecraft.getInstance();
      if (var6.player != null && var6.getConnection() != null) {
         if (!var5) {
            Class_lTzchJDbvRVrnXlw var7 = new Class_lTzchJDbvRVrnXlw(var1);
            DimasikClient.m_9057().m_9051().m_9708(var7);
            if (var7.m_1581()) {
               var4.cancel();
               return;
            }
         }

         DimasikClient.m_9057().m_9051().m_9708(new Class_nCtAXu2tIwCiU5cL(var1));
      }
   }

   @Inject(
      method = "channelRead0(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/network/protocol/Packet;)V",
      at = @At(value = "FIELD", target = "Lnet/minecraft/network/Connection;packetListener:Lnet/minecraft/network/PacketListener;", opcode = 180),
      cancellable = true
   )
   private void onReceive(ChannelHandlerContext var1, Packet<?> var2, CallbackInfo var3) {
      Minecraft var4 = Minecraft.getInstance();
      if (var4.player != null && var4.getConnection() != null) {
         Class_XzpX8S5F5zd9jbuE var5 = new Class_XzpX8S5F5zd9jbuE(var2);
         DimasikClient.m_9057().m_9051().m_9708(var5);
         if (var5.m_1581()) {
            var3.cancel();
         }
      }
   }
}
