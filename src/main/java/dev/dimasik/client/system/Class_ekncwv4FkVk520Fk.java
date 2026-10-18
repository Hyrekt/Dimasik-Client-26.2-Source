package dev.dimasik.client.system;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.KillMessage;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;

public class Class_ekncwv4FkVk520Fk extends Class_msKbTl6QleqYGoq3 {
   private static final String f_19237 = "kill";
   private static final String f_19238 = "add";
   private static final String f_19239 = "text";
   private static final String f_19240 = "remove";
   private static final String f_19241 = "index";
   private static final String f_19242 = "list";
   private static final String f_19243 = "clear";
   private static final String f_19244 = "Сообщение уже есть или пустое.";
   private static final String f_19245 = "Список kill-сообщений пуст. Добавь: .kill add <текст>";
   private static final String f_19246 = "Kill-сообщения (ник + текст):";
   private static final String f_19247 = "\n";
   private static final String f_19248 = ". ";
   private static final String f_19249 = "index";
   private static final String f_19250 = "text";

   private int m_6399(String var1) {
      KillMessage var2 = this.m_6408();
      if (!var2.m_5119(var1)) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_19244);
         return 1;
      } else {
         this.m_6407();
         Class_ftHu9o3WzCU3Adxm.m_6731(var1.trim() + "");
         return 1;
      }
   }

   private int m_6404(int var1) {
      KillMessage var2 = this.m_6408();
      if (!var2.m_5109(var1 - 1)) {
         Class_ftHu9o3WzCU3Adxm.m_6731("" + var1 + var2.m_5118().size());
         return 1;
      } else {
         this.m_6407();
         Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
         return 1;
      }
   }

   @Override
   public void build(LiteralArgumentBuilder<ClientSuggestionProvider> var1) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)var1.executes(var1x -> this.m_6405()))
                  .then(
                     this.m_7628(f_19238)
                        .then(
                           this.m_7624(f_19239, StringArgumentType.greedyString()).executes(var1x -> this.m_6399(StringArgumentType.getString(var1x, f_19250)))
                        )
                  ))
               .then(
                  this.m_7628(f_19240)
                     .then(this.m_7624(f_19241, IntegerArgumentType.integer(1)).executes(var1x -> this.m_6404(IntegerArgumentType.getInteger(var1x, f_19249))))
               ))
            .then(this.m_7628(f_19242).executes(var1x -> this.m_6405())))
         .then(this.m_7628(f_19243).executes(var1x -> this.m_6406()));
   }

   private int m_6405() {
      KillMessage var1 = this.m_6408();
      if (var1.m_5118().isEmpty()) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_19245);
         return 1;
      }

      StringBuilder var2 = new StringBuilder(f_19246);
      int var3 = 1;

      for (String var5 : var1.m_5118()) {
         var2.append(f_19247).append(var3++).append(f_19248).append(var5);
      }

      Class_ftHu9o3WzCU3Adxm.m_6731(var2.toString());
      return 1;
   }

   private int m_6406() {
      int var1 = this.m_6408().m_5118().size();
      this.m_6408().m_5125();
      this.m_6407();
      Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
      return 1;
   }

   private void m_6407() {
      DimasikClient.m_9057().m_9049().m_2802().m_8844().m_5559();
   }

   private KillMessage m_6408() {
      return DimasikClient.m_9057().m_9049().m_2801().m_3463();
   }

   public Class_ekncwv4FkVk520Fk() {
      super(f_19237);
   }
}
