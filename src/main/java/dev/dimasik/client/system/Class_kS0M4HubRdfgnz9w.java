package dev.dimasik.client.system;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.CorruptedFrameException;
import io.netty.util.ReferenceCountUtil;
import java.nio.charset.StandardCharsets;

public class Class_kS0M4HubRdfgnz9w extends ChannelInboundHandlerAdapter {
   public static final int f_25016 = 1048576;

   public static void validate(ByteBuf var0) {
      if (var0.readableBytes() > 1048576) {
         throw new CorruptedFrameException("Oversized IRC frame");
      }

      ByteBuf var1 = var0.duplicate();
      int var2 = length(var1);
      String var3 = var1.readCharSequence(var2, StandardCharsets.UTF_8).toString();
      var1.skipBytes(length(var1));
      var1.skipBytes(length(var1));
      if (!var3.startsWith("custom_")) {
         ByteBuf var4 = var1.readSlice(length(var1));

         while (var4.isReadable()) {
            var4.skipBytes(length(var4));
         }
      }

      if (var1.isReadable()) {
         throw new CorruptedFrameException("Trailing IRC frame data");
      }
   }

   public void channelRead(ChannelHandlerContext var1, Object var2) throws Exception {
      try {
         if (!(var2 instanceof ByteBuf var3)) {
            throw new CorruptedFrameException("Expected IRC frame");
         }

         validate(var3);
         Object var4 = Class_xP6k3pdJpBKQU6jW.m_9494(var3);
         if (var4 != null) {
            var1.fireChannelRead(var4);
         }
      } finally {
         ReferenceCountUtil.release(var2);
      }
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
      var1.fireExceptionCaught(var2);
      var1.close();
   }

   private static int length(ByteBuf var0) {
      if (var0.readableBytes() < 4) {
         throw new CorruptedFrameException("Missing IRC field length");
      } else {
         int var1 = var0.readInt();
         if (var1 >= 0 && var1 <= var0.readableBytes() && var1 <= 1048576) {
            return var1;
         } else {
            throw new CorruptedFrameException("Invalid IRC field length");
         }
      }
   }
}
