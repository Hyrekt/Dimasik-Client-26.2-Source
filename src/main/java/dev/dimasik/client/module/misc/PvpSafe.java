package dev.dimasik.client.module.misc;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_lTzchJDbvRVrnXlw;
import dev.dimasik.mixin.BossHealthOverlayMixin_2;
import net.minecraft.client.gui.components.LerpingBossEvent;
import net.minecraft.network.protocol.game.ServerboundChatCommandPacket;
import net.minecraft.network.protocol.game.ServerboundChatCommandSignedPacket;
import net.minecraft.network.protocol.game.ServerboundChatPacket;

public final class PvpSafe extends Module {
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_25478 = this::m_7581;
   private final Class_gEPk7yDw6CwIte87<Class_lTzchJDbvRVrnXlw> f_25479 = this::m_7584;
   private long f_25480;
   private static final String f_25481 = "Pvp Safe";
   private static final String f_25482 = "Во время ПВП блокирует выход с сервера и команды выхода (/hub /limbo /an /anarchy)";
   private static final String f_25483 = "/";
   private static final String f_25484 = "\\s+";
   private static final String f_25485 = "hub";
   private static final String f_25486 = "limbo";
   private static final String f_25487 = "anarchy";
   private static final String f_25488 = "an";
   private static final String f_25489 = ".*\\b(hub|limbo|anarchy)\\b.*";
   private static final long f_25490 = 500L;
   private static final String f_25491 = "pvp";
   private static final String f_25492 = "пвп";

   private void m_7581(Class_Xu9btcIeUN33XnMK var1) {
      this.m_7586();
   }

   private boolean m_7582() {
      this.m_7586();
      return System.currentTimeMillis() - this.f_25480 < f_25490;
   }

   public PvpSafe() {
      super(f_25481, f_25482, Category.MISC);
   }

   public static boolean m_7583(String var0) {
      if (var0 != null && !var0.isEmpty()) {
         String var1 = var0.toLowerCase().trim();
         if (var1.startsWith(f_25483)) {
            var1 = var1.substring(1).trim();
         }

         String var2 = var1.split(f_25484, 2)[0];
         return !var2.equals(f_25485) && !var2.equals(f_25486) && !var2.equals(f_25487) && !var2.startsWith(f_25488) ? var1.matches(f_25489) : true;
      } else {
         return false;
      }
   }

   private void m_7584(Class_lTzchJDbvRVrnXlw var1) {
      if (this.m_7582()) {
         String var2 = null;
         if (var1.m_7532() instanceof ServerboundChatPacket var3) {
            var2 = var3.message();
         } else if (var1.m_7532() instanceof ServerboundChatCommandSignedPacket var4) {
            var2 = var4.command();
         } else if (var1.m_7532() instanceof ServerboundChatCommandPacket var5) {
            var2 = var5.command();
         }

         if (var2 != null && m_7583(var2)) {
            var1.m_1582(true);
         }
      }
   }

   public static boolean m_7585() {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
         PvpSafe var0 = DimasikClient.m_9057().m_9049().m_2801().m_3568();
         return var0 != null && var0.m_776() && var0.m_7582();
      } else {
         return false;
      }
   }

   private void m_7586() {
      if (f_11537.gui.hud != null) {
         for (LerpingBossEvent var2 : ((BossHealthOverlayMixin_2)f_11537.gui.hud.getBossOverlay()).getBossBars().values()) {
            String var3 = var2.getName().getString().toLowerCase();
            if (var3.contains(f_25491) || var3.contains(f_25492)) {
               this.f_25480 = System.currentTimeMillis();
               return;
            }
         }
      }
   }
}
