package dev.dimasik.client.system;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.AutoWarden;
import java.util.List;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;

public final class Class_56PWi2R0KZTyQfiX extends Class_msKbTl6QleqYGoq3 {
   private static final String f_2415 = "warden";
   private static final String f_2416 = "add";
   private static final String f_2417 = "анархия";
   private static final String f_2418 = "remove";
   private static final String f_2419 = "анархия";
   private static final String f_2420 = "list";
   private static final String f_2421 = "clear";
   private static final String f_2422 = "Можно добавить максимум 10 анархий.";
   private static final String f_2423 = "Список анархий пуст.";
   private static final String f_2424 = "Список анархий очищен.";
   private static final String f_2425 = "анархия";
   private static final String f_2426 = "анархия";

   private AutoWarden m_1456() {
      return DimasikClient.m_9057().m_9049().m_2801().m_3565();
   }

   private int m_1457() {
      this.m_1456().m_4351().clear();
      this.m_1462();
      Class_ftHu9o3WzCU3Adxm.m_6731(f_2424);
      return 1;
   }

   private int m_1458(int var1) {
      if (!this.m_1456().m_4351().remove(Integer.valueOf(var1))) {
         Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
         return 1;
      } else {
         this.m_1462();
         Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
         return 1;
      }
   }

   private int m_1459() {
      List var1 = this.m_1456().m_4351();
      if (var1.isEmpty()) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_2423);
         return 1;
      } else {
         Class_ftHu9o3WzCU3Adxm.m_6731("" + var1.size() + var1);
         return 1;
      }
   }

   public Class_56PWi2R0KZTyQfiX() {
      super(f_2415);
   }

   @Override
   public void build(LiteralArgumentBuilder<ClientSuggestionProvider> var1) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)var1.then(
                  this.m_7628(f_2416)
                     .then(
                        this.m_7624(f_2417, IntegerArgumentType.integer(1, 999)).executes(var1x -> this.m_1461(IntegerArgumentType.getInteger(var1x, f_2426)))
                     )
               ))
               .then(
                  this.m_7628(f_2418)
                     .then(
                        this.m_7624(f_2419, IntegerArgumentType.integer(1, 999)).executes(var1x -> this.m_1458(IntegerArgumentType.getInteger(var1x, f_2425)))
                     )
               ))
            .then(this.m_7628(f_2420).executes(var1x -> this.m_1459())))
         .then(this.m_7628(f_2421).executes(var1x -> this.m_1457()));
   }

   private int m_1461(int var1) {
      List var2 = this.m_1456().m_4351();
      if (var2.contains(var1)) {
         Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
         return 1;
      } else if (var2.size() >= 10) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_2422);
         return 1;
      } else {
         var2.add(var1);
         this.m_1462();
         Class_ftHu9o3WzCU3Adxm.m_6731(var1 + "");
         return 1;
      }
   }

   private void m_1462() {
      DimasikClient.m_9057().m_9049().m_2802().m_8844().m_5559();
   }
}
