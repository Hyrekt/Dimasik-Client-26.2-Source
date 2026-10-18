package dev.dimasik.client.system;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.handler.codec.CorruptedFrameException;
import java.nio.charset.StandardCharsets;

public final class Class_xP6k3pdJpBKQU6jW {
   public static ByteBuf m_9493(Object var0, ByteBufAllocator var1) {
      ByteBuf var2 = var1.buffer();

      try {
         if (var0 instanceof Class_WWrbI1EUeG9pWFgH var4) {
            m_9497(var2, var4.m_5463().m_927());
            m_9497(var2, var4.m_5463().m_928().m_1343());
            m_9497(var2, var4.m_5463().m_929());
            ByteBuf var5 = var4.m_5465();
            var2.writeInt(var5.readableBytes());
            var2.writeBytes(var5);
            var5.clear();
         } else {
            if (!(var0 instanceof Class_F9yc8RZksnyRaiHz var3)) {
               throw new IllegalArgumentException("Unsupported IRC packet");
            }

            m_9497(var2, var3.m_2590().m_6195());
            m_9497(var2, var3.m_2590().m_6194().m_2454());
            m_9497(var2, var3.m_2590().m_6193());
         }

         return var2;
      } catch (Throwable var6) {
         var2.release();
         throw var6;
      }
   }

   public static Object m_9494(ByteBuf var0) {
      String var1 = m_9496(var0);
      String var2 = m_9496(var0);
      String var3 = m_9496(var0);
      Class_wOPwT7J4giBZsk46 var4 = Class_wOPwT7J4giBZsk46.m_9320();
      if (var4 == null) {
         return null;
      }

      if (var1.startsWith("custom_")) {
         Class_DX04kDXg593u6q7Y var5 = Class_DX04kDXg593u6q7Y.m_2453(var2);
         if (var5 == null) {
            return null;
         }

         for (Class_F9yc8RZksnyRaiHz var7 : var4.m_9319().m_2110()) {
            if (var7.m_2590().m_6195().equals(var1) && var7.m_2590().m_6194() == var5) {
               var7.m_2590().m_6192(var3);
               return var7;
            }
         }
      } else {
         int var8 = m_9495(var0);

         for (Class_WWrbI1EUeG9pWFgH var10 : var4.m_9319().m_2107()) {
            if (var10.m_5463().m_927().equals(var1) && var10.m_5463().m_928().m_1343().equals(var2)) {
               var10.m_5463().m_926(var3);
               var10.m_5465().clear().writeBytes(var0, var8);
               return var10;
            }
         }
      }

      return null;
   }

   private static int m_9495(ByteBuf var0) {
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

   private static String m_9496(ByteBuf var0) {
      return var0.readCharSequence(m_9495(var0), StandardCharsets.UTF_8).toString();
   }

   private static void m_9497(ByteBuf var0, String var1) {
      byte[] var2 = var1.getBytes(StandardCharsets.UTF_8);
      var0.writeInt(var2.length);
      var0.writeBytes(var2);
   }

   private Class_xP6k3pdJpBKQU6jW() {
   }
}
