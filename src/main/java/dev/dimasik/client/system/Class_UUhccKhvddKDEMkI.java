package dev.dimasik.client.system;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.AutoJoiner;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;

public class Class_UUhccKhvddKDEMkI extends Class_msKbTl6QleqYGoq3 {
   private static final String f_14813 = "rct";
   private static final String f_14814 = "grief";
   private static final String f_14815 = "grief";
   private static final String f_14816 = "Гриф не найден!";

   public Class_UUhccKhvddKDEMkI() {
      super(f_14813);
   }

   @Override
   public void build(LiteralArgumentBuilder<ClientSuggestionProvider> var1) {
      var1.executes(var0 -> {
         AutoJoiner var1x = DimasikClient.m_9057().m_9049().m_2801().m_3451();
         AutoJoiner.UFtxOEj3EQyyOrKf var2 = AutoJoiner.m_8827();
         if (var2 != null) {
            if (!var1x.m_8841(var2)) {
               Class_ftHu9o3WzCU3Adxm.m_6731(var2.number() + "");
               return 1;
            } else {
               Class_ftHu9o3WzCU3Adxm.m_6731(var2.category().name() + var2.number());
               return 1;
            }
         } else {
            int var3 = AutoJoiner.m_8824();
            if (var3 == -1) {
               Class_ftHu9o3WzCU3Adxm.m_6731(f_14816);
               return 1;
            } else if (!var1x.m_8812(var3)) {
               Class_ftHu9o3WzCU3Adxm.m_6731(var3 + "");
               return 1;
            } else {
               Class_ftHu9o3WzCU3Adxm.m_6731(var3 + "");
               return 1;
            }
         }
      });
      var1.then(this.m_7624(f_14814, IntegerArgumentType.integer(1, 96)).executes(var0 -> {
         int var1x = IntegerArgumentType.getInteger(var0, f_14815);
         AutoJoiner var2 = DimasikClient.m_9057().m_9049().m_2801().m_3451();
         if (!var2.m_8812(var1x)) {
            Class_ftHu9o3WzCU3Adxm.m_6731(var1x + "");
            return 1;
         } else {
            Class_ftHu9o3WzCU3Adxm.m_6731(var1x + "");
            return 1;
         }
      }));
   }
}
