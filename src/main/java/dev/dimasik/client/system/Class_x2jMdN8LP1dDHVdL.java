package dev.dimasik.client.system;

import dev.dimasik.mixin.BossHealthOverlayMixin_2;
import dev.dimasik.mixin.PlayerTabOverlayMixin;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.gui.components.LerpingBossEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.world.scores.DisplaySlot;
import net.minecraft.world.scores.Objective;

public final class Class_x2jMdN8LP1dDHVdL implements Class_NzJrN63M7QBpmAbi {
   private static final Pattern f_34703 = Pattern.compile(Class_x2jMdN8LP1dDHVdL.f_34710);
   private static final Pattern f_34704 = Pattern.compile(Class_x2jMdN8LP1dDHVdL.f_34711);
   private static final Pattern f_34705 = Pattern.compile(Class_x2jMdN8LP1dDHVdL.f_34712);
   private static final Pattern f_34706 = Pattern.compile(Class_x2jMdN8LP1dDHVdL.f_34713);
   private static final String f_34707 = "pvp";
   private static final String f_34708 = "пвп";
   private static final String f_34709 = "дуэль";
   private static final String f_34710 = "Анархия-\\s*(\\d+)";
   private static final String f_34711 = "(?:-|#)(\\d+)";
   private static final String f_34712 = "(\\d+):(\\d+)";
   private static final String f_34713 = "(\\d+)";

   public static boolean m_9440() {
      return m_9442() >= 0;
   }

   public static int m_9441() {
      if (f_11537.player != null && f_11537.gui.hud != null) {
         Component var0 = ((PlayerTabOverlayMixin)f_11537.gui.hud.getTabList()).getHeader();
         if (var0 != null) {
            Matcher var1 = f_34703.matcher(var0.getString());
            if (var1.find()) {
               return Integer.parseInt(var1.group(1));
            }
         }

         if (f_11537.level == null) {
            return -1;
         }

         Objective var3 = f_11537.level.getScoreboard().getDisplayObjective(DisplaySlot.SIDEBAR);
         if (var3 == null) {
            return -1;
         }

         Matcher var2 = f_34704.matcher(var3.getDisplayName().getString());
         return var2.find() ? Integer.parseInt(var2.group(1)) : -1;
      } else {
         return -1;
      }
   }

   public static int m_9442() {
      if (f_11537.player != null && f_11537.gui.hud != null) {
         Map var0 = ((BossHealthOverlayMixin_2)f_11537.gui.hud.getBossOverlay()).getBossBars();
         if (var0 != null && !var0.isEmpty()) {
            for (Object var2_obj : var0.values()) {
               LerpingBossEvent var2 = (LerpingBossEvent)var2_obj;
               String var3 = var2.getName().getString().toLowerCase(Locale.ROOT);
               if (var3.contains(f_34707) || var3.contains(f_34708) || var3.contains(f_34709)) {
                  Matcher var4 = f_34705.matcher(var3);
                  if (var4.find()) {
                     return Integer.parseInt(var4.group(1)) * 60 + Integer.parseInt(var4.group(2));
                  }

                  Matcher var5 = f_34706.matcher(var3);
                  return var5.find() ? Integer.parseInt(var5.group(1)) : 0;
               }
            }

            return -1;
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   private Class_x2jMdN8LP1dDHVdL() {
   }
}
