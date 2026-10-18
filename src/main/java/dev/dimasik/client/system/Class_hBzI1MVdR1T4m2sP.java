package dev.dimasik.client.system;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import dev.dimasik.client.DimasikClient;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;

public class Class_hBzI1MVdR1T4m2sP extends Class_msKbTl6QleqYGoq3 {
   private final Class_qivxiwjUY0GMkVgq f_23236 = new Class_qivxiwjUY0GMkVgq();
   private final Class_qivxiwjUY0GMkVgq f_23237 = new Class_qivxiwjUY0GMkVgq();
   private final Class_gEPk7yDw6CwIte87<Class_qUEA6tS6otjuY2Wk> f_23238 = this::m_7126;
   private static final String f_23239 = "macro";
   private static final String f_23240 = "add";
   private static final String f_23241 = "key";
   private static final String f_23242 = "command";
   private static final String f_23243 = "remove";
   private static final String f_23244 = "key";
   private static final String f_23245 = "clear";
   private static final String f_23246 = "Очистил список макросов.";
   private static final String f_23247 = "key";
   private static final String f_23248 = "key";
   private static final String f_23249 = "command";

   public Class_hBzI1MVdR1T4m2sP() {
      super(f_23239);
   }

   public void m_7126(Class_qUEA6tS6otjuY2Wk var1) {
      this.f_23236.setList(Class_AjMrqn81FAcRNmHv.f_5177.keySet().stream().toList());
      this.f_23237.setList(DimasikClient.m_9057().m_9049().m_2807().m_8351());
   }

   @Override
   public void build(LiteralArgumentBuilder<ClientSuggestionProvider> var1) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)var1.then(
               this.m_7628(f_23240).then(this.m_7624(f_23241, this.f_23236).then(this.m_7624(f_23242, StringArgumentType.greedyString()).executes(var0 -> {
                  String var1x = (String)var0.getArgument(f_23248, String.class);
                  String var2 = (String)var0.getArgument(f_23249, String.class);
                  int var3 = Class_AjMrqn81FAcRNmHv.f_5177.get(var1x);
                  DimasikClient.m_9057().m_9049().m_2807().add(new Class_q5Do365fnkZh6Wbu(var2, var3));
                  Class_ftHu9o3WzCU3Adxm.m_6731(var1x + var2);
                  return 1;
               })))
            ))
            .then(this.m_7628(f_23243).then(this.m_7624(f_23244, this.f_23237).executes(var0 -> {
               String var1x = (String)var0.getArgument(f_23247, String.class);
               int var2 = Class_AjMrqn81FAcRNmHv.f_5177.get(var1x);
               DimasikClient.m_9057().m_9049().m_2807().removeIf(var1xx -> var1xx.m_8326() == var2);
               Class_ftHu9o3WzCU3Adxm.m_6731(var1x + "");
               return 1;
            }))))
         .then(this.m_7628(f_23245).executes(var0 -> {
            DimasikClient.m_9057().m_9049().m_2807().clear();
            Class_ftHu9o3WzCU3Adxm.m_6731(f_23246);
            return 1;
         }));
   }
}
