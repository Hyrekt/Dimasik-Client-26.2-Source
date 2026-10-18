package dev.dimasik.client.system;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;

public class Class_cKA8UR5jmkeiP9hs extends ChannelOutboundHandlerAdapter {
   public void flush(ChannelHandlerContext var1) throws Exception {
      super.flush(var1);
   }

   public void write(ChannelHandlerContext var1, Object var2, ChannelPromise var3) throws Exception {
      ByteBuf var4 = Class_xP6k3pdJpBKQU6jW.m_9493(var2, var1.alloc());
      if (var4 == null) {
         System.out.println("Cannot write null data!");
      } else {
         var1.write(var4, var3);
      }
   }
}
