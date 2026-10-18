package dev.dimasik.client.system;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.NameProtect;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;

public final class Class_FscpulZmHVKtCBZj extends Class_msKbTl6QleqYGoq3 {
   private static final String f_7581 = "customn";
   private static final String f_7582 = "off";
   private static final String f_7583 = "name";
   private static final String f_7584 = "Protected";
   private static final String f_7585 = "Кастомный ник сброшен. Состояние NameProtect не изменено.";
   private static final String f_7586 = "Укажите ник: .customn <ник>";
   private static final String f_7587 = "name";

   @Override
   public void build(LiteralArgumentBuilder<ClientSuggestionProvider> var1) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)var1.executes(var1x -> {
            Class_ftHu9o3WzCU3Adxm.m_6731(this.m_2684().m_2057() + "");
            return 1;
         })).then(this.m_7628(f_7582).executes(var1x -> this.m_2688())))
         .then(this.m_7624(f_7583, StringArgumentType.greedyString()).executes(var1x -> this.m_2686(StringArgumentType.getString(var1x, f_7587))));
   }

   private NameProtect m_2684() {
      return DimasikClient.m_9057().m_9049().m_2801().m_3484();
   }

   private int m_2686(String var1) {
      String var2 = var1.trim();
      if (var2.isEmpty()) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_7586);
         return 1;
      }

      NameProtect var3 = this.m_2684();
      var3.m_2056(var2);
      if (!var3.m_776()) {
         var3.m_792();
      }

      DimasikClient.m_9057().m_9049().m_2802().m_8844().m_5559();
      Class_ftHu9o3WzCU3Adxm.m_6731(var3.m_2057() + "");
      return 1;
   }

   private int m_2688() {
      NameProtect var1 = this.m_2684();
      var1.m_2056(f_7584);
      DimasikClient.m_9057().m_9049().m_2802().m_8844().m_5559();
      Class_ftHu9o3WzCU3Adxm.m_6731(f_7585);
      return 1;
   }

   public Class_FscpulZmHVKtCBZj() {
      super(f_7581);
   }
}
