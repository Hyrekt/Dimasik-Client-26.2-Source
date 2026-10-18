package dev.dimasik.client.system;

import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Class_BRwgyCXa8ZQRcJH3 {
   private static final Logger f_5811 = LoggerFactory.getLogger(Class_BRwgyCXa8ZQRcJH3.f_5819);
   private static final ConcurrentHashMap<String, Long> f_5812 = new ConcurrentHashMap<>();
   private static final boolean f_5813 = Boolean.getBoolean(Class_BRwgyCXa8ZQRcJH3.f_5820);
   private static final long f_5814 = 1000000L;
   private static final long f_5815 = 2000L;
   private static final String f_5816 = "[PartyTrace] {} {}";
   private static final String f_5817 = "null";
   private static final String f_5818 = "no-world";
   private static final String f_5819 = "Dimasik/Party";
   private static final String f_5820 = "dimasik.partyTrace";

   public static boolean m_2270(String var0, long var1) {
      if (!f_5813) {
         return false;
      }

      long var3 = System.nanoTime();
      Long var5 = f_5812.get(var0);
      if (var5 != null && var3 - var5 < var1 * f_5814) {
         return false;
      }

      if (f_5812.size() >= 512) {
         f_5812.clear();
      }

      f_5812.put(var0, var3);
      return true;
   }

   public static boolean m_2271() {
      return f_5813;
   }

   public static String m_2272(Class_4LPzBXcCHZRVScpS var0) {
      return var0 == null ? f_5818 : var0.server() + var0.dimension() + var0.name() + var0.x() + var0.y() + var0.z();
   }

   private Class_BRwgyCXa8ZQRcJH3() {
   }

   public static void m_2273(String var0, String var1) {
      if (f_5813) {
         f_5811.info(f_5816, var0, var1 == null ? "" : var1);
      }
   }

   public static boolean m_2274(String var0, Class_qIhWiIlTIdXu1lBw var1) {
      return var1 != null && m_2270(var0 + var1.member(), f_5815);
   }

   public static String m_2275(Class_qIhWiIlTIdXu1lBw var0) {
      return var0 == null ? f_5817 : var0.party() + var0.member() + var0.session() + var0.sequence() + var0.kind();
   }
}
