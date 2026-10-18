package dev.dimasik.client.system;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import dev.dimasik.client.DimasikClient;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;

public class Class_0cTrLQ0cZeOKj0Wa extends Class_msKbTl6QleqYGoq3 {
   private static final long f_382 = 2000000000L;
   private long f_383;
   private static final String f_384 = "irc";
   private static final String f_385 = "string";
   private static final String f_386 = "string";
   private static final String f_387 = "Модуль IRC выключен.";
   private static final long f_388 = 2000000000L;
   private static final long f_389 = 999999L;
   private static final long f_390 = 1000000L;

   public Class_0cTrLQ0cZeOKj0Wa() {
      super(f_384);
   }

   @Override
   public void build(LiteralArgumentBuilder<ClientSuggestionProvider> var1) {
      var1.then(this.m_7624(f_385, StringArgumentType.greedyString()).executes(var1x -> {
         String var2 = (String)var1x.getArgument(f_386, String.class);
         if (!DimasikClient.m_9057().m_9049().m_2801().m_3416().m_776()) {
            Class_ftHu9o3WzCU3Adxm.m_6731(f_387);
            return 0;
         }

         long var3 = System.nanoTime();
         if (!Class_tjZiOwNclsIk6HpU.m_8939() && this.f_383 != 0L) {
            long var5 = f_388 - (var3 - this.f_383);
            if (var5 > 0L) {
               long var7 = (var5 + f_389) / f_390;
               Class_ftHu9o3WzCU3Adxm.m_6731(var7 + "");
               return 0;
            }
         }

         if (!Class_zZgIgQUpIcqCwBUw.m_9905().m_9897(var2)) {
            return 0;
         }

         if (!Class_tjZiOwNclsIk6HpU.m_8939()) {
            this.f_383 = var3;
         }

         return 1;
      }));
   }
}
