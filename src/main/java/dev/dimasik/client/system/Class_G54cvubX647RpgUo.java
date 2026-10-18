package dev.dimasik.client.system;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.combat.Aura;
import net.minecraft.ChatFormatting;
import net.minecraft.client.multiplayer.ClientSuggestionProvider;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.entity.player.Player;

public final class Class_G54cvubX647RpgUo extends Class_msKbTl6QleqYGoq3 implements Class_NzJrN63M7QBpmAbi {
   private static final String f_7645 = "target";
   private static final String f_7646 = "off";
   private static final String f_7647 = "name";
   private static final String f_7648 = "Цель не задана. ";
   private static final String f_7649 = ".target <ник>";
   private static final String f_7650 = " — зафиксировать, ";
   private static final String f_7651 = ".target off";
   private static final String f_7652 = " — снять.";
   private static final String f_7653 = "Текущая цель: ";
   private static final String f_7654 = "off";
   private static final String f_7655 = "Aura зафиксирована на ";
   private static final String f_7656 = "Цель уже снята.";
   private static final String f_7657 = "Цель снята: ";
   private static final String f_7658 = "name";

   private int m_2706(String var1) {
      String var2 = this.m_2711(var1.trim());
      if (!var2.isEmpty() && !var2.equalsIgnoreCase(f_7654)) {
         Class_Xc9oMkiIE6eeApEo.m_5568(var2);
         this.m_2712();
         Class_ftHu9o3WzCU3Adxm.m_6731(
            Component.literal(f_7655)
               .setStyle(Style.EMPTY.withColor(ChatFormatting.GRAY))
               .append(Component.literal(var2).setStyle(Style.EMPTY.withColor(ChatFormatting.RED)))
         );
         return 1;
      } else {
         return this.m_2713();
      }
   }

   private int m_2708() {
      if (!Class_Xc9oMkiIE6eeApEo.m_5567()) {
         Class_ftHu9o3WzCU3Adxm.m_6731(
            Component.literal(f_7648)
               .setStyle(Style.EMPTY.withColor(ChatFormatting.GRAY))
               .append(Component.literal(f_7649).setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)))
               .append(Component.literal(f_7650).setStyle(Style.EMPTY.withColor(ChatFormatting.GRAY)))
               .append(Component.literal(f_7651).setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)))
               .append(Component.literal(f_7652).setStyle(Style.EMPTY.withColor(ChatFormatting.GRAY)))
         );
         return 1;
      } else {
         Class_ftHu9o3WzCU3Adxm.m_6731(
            Component.literal(f_7653)
               .setStyle(Style.EMPTY.withColor(ChatFormatting.GRAY))
               .append(Component.literal(Class_Xc9oMkiIE6eeApEo.m_5566()).setStyle(Style.EMPTY.withColor(ChatFormatting.RED)))
         );
         return 1;
      }
   }

   @Override
   public void build(LiteralArgumentBuilder<ClientSuggestionProvider> var1) {
      ((LiteralArgumentBuilder)((LiteralArgumentBuilder)var1.executes(var1x -> this.m_2708())).then(this.m_7628(f_7646).executes(var1x -> this.m_2713())))
         .then(
            this.m_7624(f_7647, Class_kpflxtXeu0M2qrjz.players(Class_kpflxtXeu0M2qrjz.MSZdeeOsK03SSTKV.ALL))
               .executes(var1x -> this.m_2706((String)var1x.getArgument(f_7658, String.class)))
         );
   }

   private String m_2711(String var1) {
      if (var1.isEmpty()) {
         return var1;
      }

      if (f_11537.player != null && f_11537.player.connection != null) {
         for (PlayerInfo var3 : f_11537.player.connection.getListedOnlinePlayers()) {
            String var4 = var3.getProfile().name();
            if (var4.equalsIgnoreCase(var1)) {
               return var4;
            }
         }
      }

      if (f_11537.level != null) {
         for (Player var6 : f_11537.level.players()) {
            String var7 = var6.getGameProfile().name();
            if (var7.equalsIgnoreCase(var1)) {
               return var7;
            }
         }
      }

      return var1;
   }

   public Class_G54cvubX647RpgUo() {
      super(f_7645);
   }

   private void m_2712() {
      Aura var1 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
      if (!(var1.m_1114() instanceof Player var3 && Class_Xc9oMkiIE6eeApEo.m_5565(var3))) {
         var1.m_1040(null);
      }
   }

   private int m_2713() {
      if (!Class_Xc9oMkiIE6eeApEo.m_5567()) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_7656);
         return 1;
      } else {
         String var1 = Class_Xc9oMkiIE6eeApEo.m_5566();
         Class_Xc9oMkiIE6eeApEo.m_5571();
         Class_ftHu9o3WzCU3Adxm.m_6731(
            Component.literal(f_7657)
               .setStyle(Style.EMPTY.withColor(ChatFormatting.GRAY))
               .append(Component.literal(var1).setStyle(Style.EMPTY.withColor(ChatFormatting.WHITE)))
         );
         return 1;
      }
   }
}
