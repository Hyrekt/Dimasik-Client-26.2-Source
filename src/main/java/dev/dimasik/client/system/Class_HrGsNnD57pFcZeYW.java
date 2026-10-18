package dev.dimasik.client.system;

import java.util.List;
import java.util.Locale;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.ServerData.Type;

public final class Class_HrGsNnD57pFcZeYW {
   private static final List<Class_HrGsNnD57pFcZeYW.QPY9W1Ao0SDOhQxo> f_8244 = List.of(
      new Class_HrGsNnD57pFcZeYW.QPY9W1Ao0SDOhQxo(Class_HrGsNnD57pFcZeYW.f_8246, Class_HrGsNnD57pFcZeYW.f_8247, Class_HrGsNnD57pFcZeYW.f_8248)
   );
   private static final String f_8245 = ":25565";
   private static final String f_8246 = "БравоХвХ";
   private static final String f_8247 = "mc.bravohvh.ru";
   private static final int f_8248 = 1726298421;

   private static boolean m_2936(List<ServerData> var0) {
      if (var0.size() < f_8244.size()) {
         return false;
      }

      for (int var1 = 0; var1 < f_8244.size(); var1++) {
         Class_HrGsNnD57pFcZeYW.QPY9W1Ao0SDOhQxo var2 = f_8244.get(var1);
         ServerData var3 = (ServerData)var0.get(var1);
         if (!m_2941(var3.ip, var2.address()) || !var2.name().equals(var3.name)) {
            return false;
         }
      }

      return true;
   }

   public static boolean m_2937(List<ServerData> var0) {
      if (var0 != null && !m_2936(var0)) {
         ServerData[] var1 = new ServerData[f_8244.size()];

         for (int var2 = 0; var2 < f_8244.size(); var2++) {
            Class_HrGsNnD57pFcZeYW.QPY9W1Ao0SDOhQxo var3 = f_8244.get(var2);
            ServerData var4 = m_2938(var0, var3.address());
            if (var4 != null) {
               var4.name = var3.name();
               var1[var2] = var4;
            } else {
               var1[var2] = new ServerData(var3.name(), var3.address(), Type.OTHER);
            }
         }

         for (int var5 = var1.length - 1; var5 >= 0; var5--) {
            var0.add(0, var1[var5]);
         }

         return true;
      } else {
         return false;
      }
   }

   private static ServerData m_2938(List<ServerData> var0, String var1) {
      ServerData var2 = null;
      int var3 = 0;

      while (var3 < var0.size()) {
         ServerData var4 = (ServerData)var0.get(var3);
         if (!m_2941(var4.ip, var1)) {
            var3++;
         } else {
            ServerData var5 = (ServerData)var0.remove(var3);
            if (var2 == null) {
               var2 = var5;
            }
         }
      }

      return var2;
   }

   public static Class_HrGsNnD57pFcZeYW.FFaLNU4IbnkHPl5I m_2939(ServerData var0) {
      if (var0 == null) {
         return null;
      }

      for (Class_HrGsNnD57pFcZeYW.QPY9W1Ao0SDOhQxo var2 : f_8244) {
         if (m_2941(var0.ip, var2.address())) {
            return new Class_HrGsNnD57pFcZeYW.FFaLNU4IbnkHPl5I(var2.fill());
         }
      }

      return null;
   }

   public static boolean m_2940(ServerData var0) {
      return var0 != null && m_2942(var0.ip);
   }

   private Class_HrGsNnD57pFcZeYW() {
   }

   private static boolean m_2941(String var0, String var1) {
      return m_2943(var0).equals(m_2943(var1));
   }

   private static boolean m_2942(String var0) {
      for (Class_HrGsNnD57pFcZeYW.QPY9W1Ao0SDOhQxo var2 : f_8244) {
         if (m_2941(var0, var2.address())) {
            return true;
         }
      }

      return false;
   }

   private static String m_2943(String var0) {
      if (var0 == null) {
         return "";
      }

      String var1 = var0.trim().toLowerCase(Locale.ROOT);
      return var1.endsWith(f_8245) ? var1.substring(0, var1.length() - 6) : var1;
   }

   public record FFaLNU4IbnkHPl5I(int fill) {
      public int fill(boolean var1) {
         if (!var1) {
            return this.fill;
         }

         int var2 = Math.min(255, (this.fill >>> 24 & 0xFF) + 34);
         return var2 << 24 | this.fill & 16777215;
      }
   }

   private record QPY9W1Ao0SDOhQxo(String name, String address, int fill) {
   }
}
