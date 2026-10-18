package dev.dimasik.client.system;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.KillMessage;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;

public class Class_xK1Qs7RDmmUxLgFq extends Class_msKbTl6QleqYGoq3 {
   private static final String f_35017 = "pt";
   private static final String f_35018 = "add";
   private static final String f_35019 = "text";
   private static final String f_35020 = "remove";
   private static final String f_35021 = "index";
   private static final String f_35022 = "list";
   private static final String f_35023 = "clear";
   private static final String f_35024 = "Сообщение уже есть или пустое.";
   private static final String f_35025 = "Список pt-сообщений пуст. Добавь: .pt add <текст>";
   private static final String f_35026 = "Pt-сообщения (ник + текст):";
   private static final String f_35027 = "\n";
   private static final String f_35028 = ". ";
   private static final String f_35029 = "index";
   private static final String f_35030 = "text";

   private int m_9465() {
      KillMessage var1 = this.m_9470();
      if (var1.m_5112().isEmpty()) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_35025);
         return 1;
      }

      StringBuilder var2 = new StringBuilder(f_35026);
      int var3 = 1;

      for (String var5 : var1.m_5112()) {
         var2.append(f_35027).append(var3++).append(f_35028).append(var5);
      }

      Class_ftHu9o3WzCU3Adxm.m_6731(var2.toString());
      return 1;
   }

   private int m_9467(int var1) {
      KillMessage var2 = this.m_9470();
      if (!var2.m_5106(var1 - 1)) {
         Class_ftHu9o3WzCU3Adxm.m_6731("" + var1 + var2.m_5112().size());
         return 1;
      } else {
         this.m_9474();
         Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
         return 1;
      }
   }

   private KillMessage m_9470() {
      return DimasikClient.m_9057().m_9049().m_2801().m_3463();
   }

   public Class_xK1Qs7RDmmUxLgFq() {
      super(f_35017);
   }

   @Override
   public void build(LiteralArgumentBuilder<ClientSuggestionProvider> var1) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)var1.executes(var1x -> this.m_9465()))
                  .then(
                     this.m_7628(f_35018)
                        .then(
                           this.m_7624(f_35019, StringArgumentType.greedyString()).executes(var1x -> this.m_9473(StringArgumentType.getString(var1x, f_35030)))
                        )
                  ))
               .then(
                  this.m_7628(f_35020)
                     .then(this.m_7624(f_35021, IntegerArgumentType.integer(1)).executes(var1x -> this.m_9467(IntegerArgumentType.getInteger(var1x, f_35029))))
               ))
            .then(this.m_7628(f_35022).executes(var1x -> this.m_9465())))
         .then(this.m_7628(f_35023).executes(var1x -> this.m_9475()));
   }

   private int m_9473(String var1) {
      KillMessage var2 = this.m_9470();
      if (!var2.m_5138(var1)) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_35024);
         return 1;
      } else {
         this.m_9474();
         Class_ftHu9o3WzCU3Adxm.m_6731(var1.trim() + "");
         return 1;
      }
   }

   private void m_9474() {
      DimasikClient.m_9057().m_9049().m_2802().m_8844().m_5559();
   }

   private int m_9475() {
      int var1 = this.m_9470().m_5112().size();
      this.m_9470().m_5136();
      this.m_9474();
      Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
      return 1;
   }
}
