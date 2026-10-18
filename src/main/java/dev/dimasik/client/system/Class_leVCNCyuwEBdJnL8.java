package dev.dimasik.client.system;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.ChatFormatting;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;

public final class Class_leVCNCyuwEBdJnL8 extends Class_msKbTl6QleqYGoq3 {
   public static String f_25284;
   private static final String f_25285 = "autocontract";
   private static final String f_25286 = "act";
   private static final String f_25287 = "nickname";
   private static final String f_25288 = "nickname";
   private static final String f_25289 = "Цель установлена: ";
   private static final String f_25290 = "Текущая цель: ";
   private static final String f_25291 = "не задано";

   @Override
   public void build(LiteralArgumentBuilder<ClientSuggestionProvider> var1) {
      var1.executes(
         var0 -> {
            String var1x = f_25284;
            Class_ftHu9o3WzCU3Adxm.m_6731(
               Component.literal(f_25290)
                  .setStyle(Style.EMPTY.withColor(ChatFormatting.GRAY))
                  .append(Component.literal(var1x == null ? f_25291 : var1x).setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)))
            );
            return 1;
         }
      );
      var1.then(
         this.m_7624(f_25287, StringArgumentType.greedyString())
            .executes(
               var0 -> {
                  String var1x = StringArgumentType.getString(var0, f_25288);
                  f_25284 = var1x;
                  Class_ftHu9o3WzCU3Adxm.m_6731(
                     Component.literal(f_25289)
                        .setStyle(Style.EMPTY.withColor(ChatFormatting.GRAY))
                        .append(Component.literal(var1x).setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)))
                  );
                  return 1;
               }
            )
      );
   }

   public Class_leVCNCyuwEBdJnL8() {
      super(f_25285, f_25286);
   }
}
