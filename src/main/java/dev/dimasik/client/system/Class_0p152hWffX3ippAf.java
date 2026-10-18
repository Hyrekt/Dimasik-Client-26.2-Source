package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.render.ClickGui;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class Class_0p152hWffX3ippAf {
   public static final String f_441 = "Русский";
   public static final String f_442 = "English";
   private static final Map<String, String> f_443 = new ConcurrentHashMap<>();
   private static volatile boolean f_444;

   public static void m_796(Map<String, String> var0) {
      f_443.clear();
      if (var0 != null) {
         f_443.putAll(var0);
      }
   }

   public static boolean m_797() {
      return f_444;
   }

   public static boolean m_798(String var0, String var1) {
      return Class_S28VNLa83ybs05Nf.m_4661(var0, var1);
   }

   public static boolean m_799() {
      return !f_444;
   }

   public static void m_800() {
      try {
         ClickGui var0 = DimasikClient.m_9057().m_9049().m_2801().m_3442();
         f_444 = var0 != null && var0.m_8284();
      } catch (Throwable var1) {
         f_444 = false;
      }
   }

   public static String m_801(String var0) {
      if (var0 != null && !var0.isEmpty() && f_444) {
         String var1 = f_443.get(var0);
         return var1 != null ? var1 : var0;
      } else {
         return var0;
      }
   }

   public static int m_802(String var0, String... var1) {
      int var2 = Class_S28VNLa83ybs05Nf.m_4679(var0, var1);
      if (var2 < 0) {
         return 0;
      } else if (var2 >= 1000) {
         return 100;
      } else if (var2 >= 800) {
         return 80;
      } else {
         return var2 >= 600 ? 60 : 40;
      }
   }

   public static void m_803(boolean var0) {
      f_444 = var0;
   }

   private Class_0p152hWffX3ippAf() {
   }

   public static String m_804(String var0, String var1) {
      return f_444 ? var1 : var0;
   }
}
