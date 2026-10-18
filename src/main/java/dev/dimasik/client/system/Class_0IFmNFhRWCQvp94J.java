package dev.dimasik.client.system;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.RgExploit;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;
import net.minecraft.commands.SharedSuggestionProvider;

public final class Class_0IFmNFhRWCQvp94J extends Class_msKbTl6QleqYGoq3 {
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_170 = var0 -> {
      RgExploit var1 = m_693();
      if (var1.m_5338() && !var1.m_776()) {
         var1.m_5347(var0);
      }
   };
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_171 = var0 -> {
      RgExploit var1 = m_693();
      if (var1.m_5338() && !var1.m_776()) {
         var1.m_5352(var0);
      }
   };
   private static final String f_172 = "rg";
   private static final String f_173 = "nickname";
   private static final String f_174 = "radius";
   private static final String f_175 = "Сначала подключитесь к миру.";
   private static final String f_176 = "Нет подтверждённой IRC-пати или соединение с IRC потеряно.";
   private static final String f_177 = "nickname";
   private static final String f_178 = "radius";

   private int m_687(String var1, int var2) {
      Minecraft var3 = Minecraft.getInstance();
      if (var3.player != null && var3.level != null && var3.getConnection() != null) {
         Class_zZgIgQUpIcqCwBUw var4 = Class_zZgIgQUpIcqCwBUw.m_9905();
         if (var4.m_9934().isEmpty()) {
            return this.m_692(f_176);
         }

         if (!var4.m_9902(var1)) {
            return this.m_692(var1 + "");
         }

         Class_4LPzBXcCHZRVScpS var5 = var4.m_9931(var1);
         if (var5 == null) {
            return this.m_692(var1 + "");
         }

         if (m_693().m_5344(var5.x(), var5.y(), var5.z(), var2, var5.name())) {
            Class_ftHu9o3WzCU3Adxm.m_6731(var5.name() + var2);
         }

         return 1;
      } else {
         return this.m_692(f_175);
      }
   }

   public Class_0IFmNFhRWCQvp94J() {
      super(f_172);
   }

   private int m_692(String var1) {
      Class_ftHu9o3WzCU3Adxm.m_6731(var1);
      return 1;
   }

   private static RgExploit m_693() {
      return DimasikClient.m_9057().m_9049().m_2801().m_3428();
   }

   @Override
   public void build(LiteralArgumentBuilder<ClientSuggestionProvider> var1) {
      var1.then(
         this.m_7624(f_173, StringArgumentType.word())
            .suggests((var0, var1x) -> SharedSuggestionProvider.suggest(Class_zZgIgQUpIcqCwBUw.m_9905().m_9885(), var1x))
            .then(
               this.m_7624(f_174, IntegerArgumentType.integer(1))
                  .executes(var1x -> this.m_687(StringArgumentType.getString(var1x, f_177), IntegerArgumentType.getInteger(var1x, f_178)))
            )
      );
   }
}
