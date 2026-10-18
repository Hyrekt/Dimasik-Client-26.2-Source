package dev.dimasik.client.system;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import java.nio.charset.StandardCharsets;
import java.util.function.Consumer;

public final class Class_KEMhklTewkRHnUkM extends ChannelInboundHandlerAdapter {
   private final Consumer<String> f_10145;
   private final Consumer<String> f_10146;
   private final Runnable f_10147;
   private static final String f_10148 = ":";
   private static final String f_10149 = "party.";
   private static final String f_10150 = "NOTICE_RX";
   private static final String f_10151 = "PARTY_UPDATE_RX";
   private static final String f_10152 = "IRC_CHANNEL_INACTIVE";

   public void channelInactive(ChannelHandlerContext var1) throws Exception {
      Class_BRwgyCXa8ZQRcJH3.m_2273(f_10152, var1.channel().id() + "");
      this.f_10147.run();
      super.channelInactive(var1);
   }

   public Class_KEMhklTewkRHnUkM(Consumer<String> var1, Consumer<String> var2, Runnable var3) {
      this.f_10145 = var1;
      this.f_10146 = var2;
      this.f_10147 = var3;
   }

   public void channelRead(ChannelHandlerContext var1, Object var2) throws Exception {
      if (var2 instanceof Class_9m8OaCNv7wnhL0Uj var3) {
         String var5 = var3.m_5463().m_929();
         if (var5 != null) {
            String[] var6 = var5.split(f_10148, 3);
            if (var6.length >= 2) {
               String var7 = var6[1].trim();
               if (var7.startsWith(f_10149)) {
                  Class_BRwgyCXa8ZQRcJH3.m_2273(f_10150, var5 + "");
               }

               this.f_10145.accept(var7);
            }
         }
      } else if (var2 instanceof Class_0qMsczGJFOHQS58w var4) {
         Class_BRwgyCXa8ZQRcJH3.m_2273(f_10151, var4.m_5463().m_929() + "");
         this.f_10146.accept(var4.m_5463().m_929());
      }

      super.channelRead(var1, var2);
   }

   public static final class Class_2P7ina2Dxl2cTleC extends Class_F9yc8RZksnyRaiHz {
      public final Consumer<Class_qIhWiIlTIdXu1lBw> f_10126;
      public static final String f_10127 = "dimasik_party_presence_v2";
      public static final String f_10128 = "presence-dispatch";
      public static final long f_10129 = 2000L;
      public static final String f_10130 = "PRESENCE_DISPATCH";
      public static final String f_10131 = "decoded";
      public static final String f_10132 = "PRESENCE_DECODED";

      @Override
      public void m_2589() {
         if (Class_BRwgyCXa8ZQRcJH3.m_2270(f_10128, f_10129)) {
            Class_BRwgyCXa8ZQRcJH3.m_2273(f_10130, this.m_2590().m_6195() + this.m_2590().m_6194().m_2454() + (this.f_10126 != null));
         }

         Class_qIhWiIlTIdXu1lBw var1 = Class_qIhWiIlTIdXu1lBw.decode(this.m_2590().m_6193());
         if (var1 != null && this.f_10126 != null) {
            if (Class_BRwgyCXa8ZQRcJH3.m_2274(f_10131, var1)) {
               Class_BRwgyCXa8ZQRcJH3.m_2273(f_10132, Class_BRwgyCXa8ZQRcJH3.m_2275(var1));
            }

            this.f_10126.accept(var1);
         }
      }

      public Class_2P7ina2Dxl2cTleC(String var1, Consumer<Class_qIhWiIlTIdXu1lBw> var2) {
         super(new Class_cYFL1WImRhToowYo(f_10127, Class_DX04kDXg593u6q7Y.PARTY_ONLY, var1));
         this.f_10126 = var2;
      }
   }

   public static final class VIQvtvxBtvwRklt3 extends Class_kS0M4HubRdfgnz9w {
      public static final String f_10133 = "custom_";
      public static final String f_10134 = "party_update";
      public static final String f_10135 = "debug_message";
      public static final long f_10136 = 2000L;
      public static final String f_10137 = "WIRE_RX";
      public static final String f_10138 = "custom_dimasik_party_presence_v2";
      public static final String f_10139 = "party_only";
      public static final String f_10140 = "wire-error";
      public static final long f_10141 = 5000L;
      public static final String f_10142 = "WIRE_PROBE_ERROR";

      public static String field(ByteBuf var0, int var1, int var2) {
         if (var1 + 4 > var0.writerIndex()) {
            return null;
         }

         int var3 = var0.getInt(var1);
         return var3 >= 0 && var3 <= var2 && var1 + 4 + var3 <= var0.writerIndex() ? var0.toString(var1 + 4, var3, StandardCharsets.UTF_8) : null;
      }

      public static void traceFrame(ByteBuf var0) {
         try {
            int var1 = var0.readerIndex();
            String var2 = field(var0, var1, 160);
            if (var2 == null || !var2.startsWith(f_10133) && !var2.equals(f_10134) && !var2.equals(f_10135)) {
               return;
            }

            var1 += 4 + var0.getInt(var1);
            String var3 = field(var0, var1, 80);
            if (var3 == null) {
               return;
            }

            var1 += 4 + var0.getInt(var1);
            if (var1 + 4 > var0.writerIndex()) {
               return;
            }

            if (Class_BRwgyCXa8ZQRcJH3.m_2270(var2 + var3, f_10136)) {
               Class_BRwgyCXa8ZQRcJH3.m_2273(f_10137, var2 + var3 + var0.getInt(var1) + (var2.equals(f_10138) && var3.equals(f_10139)));
            }
         } catch (RuntimeException var4) {
            if (Class_BRwgyCXa8ZQRcJH3.m_2270(f_10140, f_10141)) {
               Class_BRwgyCXa8ZQRcJH3.m_2273(f_10142, var4.getClass().getSimpleName());
            }
         }
      }

      @Override
      public void channelRead(ChannelHandlerContext var1, Object var2) throws Exception {
         if (Class_BRwgyCXa8ZQRcJH3.m_2271() && var2 instanceof ByteBuf var3) {
            traceFrame(var3);
         }

         super.channelRead(var1, var2);
      }
   }

   public static final class taOOtUpmplJCspKg extends Class_F9yc8RZksnyRaiHz {
      public final Consumer<Class_YWsKkU1Pvrv9cQed> f_10143;
      public static final String f_10144 = "dimasik_party_chat_v1";

      @Override
      public void m_2589() {
         Class_YWsKkU1Pvrv9cQed var1 = Class_YWsKkU1Pvrv9cQed.decode(this.m_2590().m_6193());
         if (var1 != null && this.f_10143 != null) {
            this.f_10143.accept(var1);
         }
      }

      public taOOtUpmplJCspKg(String var1, Consumer<Class_YWsKkU1Pvrv9cQed> var2) {
         super(new Class_cYFL1WImRhToowYo(f_10144, Class_DX04kDXg593u6q7Y.PARTY_ONLY, var1));
         this.f_10143 = var2;
      }
   }
}
