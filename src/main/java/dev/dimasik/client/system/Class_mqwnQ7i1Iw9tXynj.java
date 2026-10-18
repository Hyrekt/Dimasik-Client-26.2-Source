package dev.dimasik.client.system;

import java.util.List;
import java.util.Locale;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerData;

public enum Class_mqwnQ7i1Iw9tXynj {
   FUNTIME("FunTime", "FT", "play.funtime.su", List.of("play.funtime.su", "mc.funtime.su", "funtime.su")),
   HOLY_WORLD("HolyWorld", "HW", "mc.holyworld.ru", List.of("mc.holyworld.ru", "play.holyworld.ru", "holyworld.ru")),
   REALLY_WORLD("ReallyWorld", "RW", "mc.reallyworld.ru", List.of("mc.reallyworld.ru", "play.reallyworld.ru", "reallyworld.ru"));

   private final String f_25539;
   private final String f_25540;
   private final String f_25541;
   private final List<String> f_25542;

   Class_mqwnQ7i1Iw9tXynj(String var3, String var4, String var5, List<String> var6) {
      this.f_25539 = var3;
      this.f_25540 = var4;
      this.f_25541 = var5;
      this.f_25542 = var6;
   }

   public String m_7614() {
      return this.f_25539;
   }

   public String m_7615() {
      return this.f_25540;
   }

   public String m_7616() {
      return this.f_25541;
   }

   public boolean m_7617(String var1) {
      String var2 = m_7621(var1);
      if (var2.isEmpty()) {
         return false;
      }

      for (String var4 : this.f_25542) {
         if (var2.equals(var4)) {
            return true;
         }
      }

      return false;
   }

   public boolean m_7618(String var1) {
      String var2 = m_7621(var1);
      if (var2.isEmpty()) {
         return false;
      }

      String var3 = this.f_25542.get(this.f_25542.size() - 1);
      return var2.equals(var3) || var2.endsWith("." + var3);
   }

   public static Class_mqwnQ7i1Iw9tXynj m_7619(String var0) {
      for (Class_mqwnQ7i1Iw9tXynj var4 : values()) {
         if (var4.m_7617(var0)) {
            return var4;
         }
      }

      return null;
   }

   public static Class_mqwnQ7i1Iw9tXynj m_7620() {
      Minecraft var0 = Minecraft.getInstance();
      ServerData var1 = var0.getCurrentServer();
      if (var1 == null && var0.getConnection() != null) {
         var1 = var0.getConnection().getServerData();
      }

      if (var1 == null) {
         return null;
      }

      for (Class_mqwnQ7i1Iw9tXynj var5 : values()) {
         if (var5.m_7618(var1.ip)) {
            return var5;
         }
      }

      return null;
   }

   private static String m_7621(String var0) {
      if (var0 != null && !var0.isBlank()) {
         String var1 = var0.trim().toLowerCase(Locale.ROOT);
         if (var1.startsWith("[")) {
            int var2 = var1.indexOf(93);
            if (var2 != -1) {
               var1 = var1.substring(1, var2);
            }
         } else {
            int var3 = var1.lastIndexOf(58);
            if (var3 != -1 && var1.indexOf(58) == var3) {
               var1 = var1.substring(0, var3);
            }
         }

         if (var1.endsWith(".")) {
            var1 = var1.substring(0, var1.length() - 1);
         }

         return var1;
      } else {
         return "";
      }
   }
}
