package dev.dimasik.client.system;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;

public class Class_5nnqHgusCl0RX1Qv extends Class_msKbTl6QleqYGoq3 {
   private static final String f_2540 = "party";
   private static final String f_2541 = "trace";
   private static final String f_2542 = "create";
   private static final String f_2543 = "join";
   private static final String f_2544 = "leave";
   private static final String f_2545 = "disband";
   private static final String f_2546 = "message";
   private static final String f_2547 = "name";
   private static final String f_2548 = "password";
   private static final String f_2549 = "name";
   private static final String f_2550 = "password";
   private static final String f_2551 = "name";
   private static final String f_2552 = "message";
   private static final String f_2553 = "MANUAL_STATUS";
   private static final String f_2554 = "включён. ";
   private static final String f_2555 = "выключен. ";

   public Class_5nnqHgusCl0RX1Qv() {
      super(f_2540);
   }

   private LiteralArgumentBuilder<ClientSuggestionProvider> m_1493(String var1, boolean var2) {
      return (LiteralArgumentBuilder<ClientSuggestionProvider>)this.m_7628(var1)
         .then(
            ((RequiredArgumentBuilder)this.m_7624(f_2547, StringArgumentType.word())
                  .executes(var1x -> Class_zZgIgQUpIcqCwBUw.m_9905().m_9908((String)var1x.getArgument(f_2551, String.class), "", var2) ? 1 : 0))
               .then(
                  this.m_7624(f_2548, StringArgumentType.word())
                     .executes(
                        var1x -> Class_zZgIgQUpIcqCwBUw.m_9905()
                              .m_9908((String)var1x.getArgument(f_2549, String.class), (String)var1x.getArgument(f_2550, String.class), var2)
                           ? 1
                           : 0
                     )
               )
         );
   }

   @Override
   public void build(LiteralArgumentBuilder<ClientSuggestionProvider> var1) {
      var1.then(this.m_7628(f_2541).executes(var0 -> {
         Class_BRwgyCXa8ZQRcJH3.m_2273(f_2553, Class_zZgIgQUpIcqCwBUw.m_9905().m_9893());
         Class_ftHu9o3WzCU3Adxm.m_6731((Class_BRwgyCXa8ZQRcJH3.m_2271() ? f_2554 : f_2555) + Class_zZgIgQUpIcqCwBUw.m_9905().m_9893());
         return 1;
      }));
      var1.then(this.m_1493(f_2542, true));
      var1.then(this.m_1493(f_2543, false));
      var1.then(this.m_7628(f_2544).executes(var0 -> Class_zZgIgQUpIcqCwBUw.m_9905().m_9915() ? 1 : 0));
      var1.then(this.m_7628(f_2545).executes(var0 -> Class_zZgIgQUpIcqCwBUw.m_9905().m_9917() ? 1 : 0));
      var1.then(
         this.m_7624(f_2546, StringArgumentType.greedyString())
            .executes(var0 -> Class_zZgIgQUpIcqCwBUw.m_9905().m_9900((String)var0.getArgument(f_2552, String.class)) ? 1 : 0)
      );
   }
}
