package dev.dimasik.client.system;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import dev.dimasik.client.DimasikClient;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;

public class Class_jKuy36ldPyOlDSZL extends Class_msKbTl6QleqYGoq3 {
   private final Class_qivxiwjUY0GMkVgq f_24720 = new Class_qivxiwjUY0GMkVgq();
   private final Class_gEPk7yDw6CwIte87<Class_qUEA6tS6otjuY2Wk> f_24721 = this::m_7375;
   private static final String f_24722 = "friend";
   private static final String f_24723 = "add";
   private static final String f_24724 = "name";
   private static final String f_24725 = "fakeName";
   private static final String f_24726 = "remove";
   private static final String f_24727 = "name";
   private static final String f_24728 = "list";
   private static final String f_24729 = "clear";
   private static final String f_24730 = "name";
   private static final String f_24731 = "Очистил список друзей.";
   private static final String f_24732 = " -> ";
   private static final String f_24733 = "Protected";
   private static final String f_24734 = ", ";
   private static final String f_24735 = "Список друзей пуст.";
   private static final String f_24736 = "name";
   private static final String f_24737 = "fakeName";

   private void m_7369() {
      DimasikClient.m_9057().m_9049().m_2802().m_8843().m_5559();
   }

   @Override
   public void build(LiteralArgumentBuilder<ClientSuggestionProvider> var1) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)var1.then(
                  this.m_7628(f_24723)
                     .then(
                        ((RequiredArgumentBuilder)this.m_7624(f_24724, Class_kpflxtXeu0M2qrjz.players(Class_kpflxtXeu0M2qrjz.MSZdeeOsK03SSTKV.ALL))
                              .executes(var1x -> this.m_7377(var1x, null)))
                           .then(
                              this.m_7624(f_24725, StringArgumentType.greedyString())
                                 .executes(var1x -> this.m_7377(var1x, StringArgumentType.getString(var1x, f_24737)))
                           )
                     )
               ))
               .then(this.m_7628(f_24726).then(this.m_7624(f_24727, this.f_24720).executes(var1x -> {
                  String var2 = (String)var1x.getArgument(f_24736, String.class);
                  DimasikClient.m_9057().m_9049().m_2804().removeIf(var1xx -> var1xx.m_2795().equalsIgnoreCase(var2));
                  this.m_7369();
                  Class_ftHu9o3WzCU3Adxm.m_6731(var2 + "");
                  return 1;
               }))))
            .then(this.m_7628(f_24728).executes(var0 -> {
               StringBuilder var1x = new StringBuilder();

               for (Class_GOZclSP08fljqFSO var3 : DimasikClient.m_9057().m_9049().m_2804()) {
                  var1x.append(var3.m_2795()).append(f_24732).append(var3.m_2796() ? var3.m_2797() : f_24733);
                  if (var3 != DimasikClient.m_9057().m_9049().m_2804().getLast()) {
                     var1x.append(f_24734);
                  }
               }

               if (var1x.isEmpty()) {
                  Class_ftHu9o3WzCU3Adxm.m_6731(f_24735);
               } else {
                  Class_ftHu9o3WzCU3Adxm.m_6731(var1x.toString());
               }

               return 1;
            })))
         .then(this.m_7628(f_24729).executes(var1x -> {
            DimasikClient.m_9057().m_9049().m_2804().clear();
            this.m_7369();
            Class_ftHu9o3WzCU3Adxm.m_6731(f_24731);
            return 1;
         }));
   }

   public Class_jKuy36ldPyOlDSZL() {
      super(f_24722);
   }

   public void m_7375(Class_qUEA6tS6otjuY2Wk var1) {
      this.f_24720.setList(DimasikClient.m_9057().m_9049().m_2804().m_2876());
   }

   private int m_7377(CommandContext<ClientSuggestionProvider> var1, String var2) {
      String var3 = (String)var1.getArgument(f_24730, String.class);
      DimasikClient.m_9057().m_9049().m_2804().m_2873(var3, var2);
      this.m_7369();
      if (var2 != null && !var2.isBlank()) {
         Class_ftHu9o3WzCU3Adxm.m_6731(var3 + var2);
      } else {
         Class_ftHu9o3WzCU3Adxm.m_6731(var3 + "");
      }

      return 1;
   }
}
