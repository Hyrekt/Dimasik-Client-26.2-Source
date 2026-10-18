package dev.dimasik.mixin;

import dev.dimasik.client.DimasikClient;
import io.netty.channel.Channel;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets = "net.minecraft.network.Connection$1")
public class Connection_1Mixin {
   @Inject(
      method = "initChannel",
      at = @At(
         value = "INVOKE",
         target = "Lio/netty/channel/ChannelConfig;setOption(Lio/netty/channel/ChannelOption;Ljava/lang/Object;)Z",
         shift = Shift.AFTER
      )
   )
   private void initChannel(Channel var1, CallbackInfo var2) {
      DimasikClient.m_9057().m_9049().m_2811().m_7391(var1.pipeline());
   }
}
