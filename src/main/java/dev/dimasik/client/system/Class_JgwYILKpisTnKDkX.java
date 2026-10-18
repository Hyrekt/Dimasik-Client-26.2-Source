package dev.dimasik.client.system;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import dev.dimasik.client.DimasikClient;
import java.util.Arrays;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;

public class Class_JgwYILKpisTnKDkX extends Class_msKbTl6QleqYGoq3 {
   private static final String f_9991 = "help";
   private static final String f_9992 = "Команды клиента:";
   private static final String f_9993 = ", ";
   private static final String f_9994 = "Описание отсутствует";

   @Override
   public void build(LiteralArgumentBuilder<ClientSuggestionProvider> var1) {
      var1.executes(var0 -> {
         Class_c6i2P72oNwZ6hSNj var1x = DimasikClient.m_9057().m_9049().m_2809();
         String var2 = var1x.m_6132().toString();
         Class_ftHu9o3WzCU3Adxm.m_6731(f_9992);
         Class_ftHu9o3WzCU3Adxm.m_6731(var2 + "");

         for (Class_msKbTl6QleqYGoq3 var4 : var1x) {
            String var5 = var4.m_7626().length == 0 ? "" : String.join(f_9993, Arrays.stream(var4.m_7626()).map(var1xx -> var2 + var1xx).toList()) + "";
            String var6 = var4.m_7634() != null && !var4.m_7634().isBlank() ? var4.m_7634() : f_9994;
            Class_ftHu9o3WzCU3Adxm.m_6731(var2 + var4.m_7629() + var5 + var6);
         }

         return 1;
      });
   }

   public Class_JgwYILKpisTnKDkX() {
      super(f_9991);
   }
}
