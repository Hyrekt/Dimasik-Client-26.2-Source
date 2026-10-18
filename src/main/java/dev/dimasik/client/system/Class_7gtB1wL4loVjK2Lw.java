package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import java.util.Comparator;
import java.util.Locale;
import lombok.Generated;

public final class Class_7gtB1wL4loVjK2Lw {
   private static final String f_3804 = "/";
   private static final String f_3805 = "tp";
   private static final String f_3806 = "tpa";
   private static final String f_3807 = "tpahere";
   private static final String f_3808 = "This is a utility class and cannot be instantiated";

   @Generated
   private Class_7gtB1wL4loVjK2Lw() {
      throw new UnsupportedOperationException(f_3808);
   }

   public static String m_1744(String var0) {
      if (var0 != null && var0.startsWith(f_3804)) {
         int var1 = var0.indexOf(32);
         String var2 = (var1 < 0 ? var0.substring(1) : var0.substring(1, var1)).toLowerCase(Locale.ROOT);
         if (!var2.equals(f_3805) && !var2.equals(f_3806) && !var2.equals(f_3807)) {
            return var0;
         }

         int var3 = var1;

         while (var3 >= 0 && var3 < var0.length() && Character.isWhitespace(var0.charAt(var3))) {
            var3++;
         }

         if (var3 >= 0 && var3 < var0.length()) {
            String var4 = var0.substring(var3);
            Class_GOZclSP08fljqFSO var5 = DimasikClient.m_9057()
               .m_9049()
               .m_2804()
               .stream()
               .filter(Class_GOZclSP08fljqFSO::m_2796)
               .filter(var1x -> m_1746(var4, var1x.m_2797()))
               .max(Comparator.comparingInt(var0x -> var0x.m_2797().length()))
               .orElse(null);
            if (var5 == null) {
               return var0;
            }

            String var6 = var5.m_2797();
            return var0.substring(0, var3) + var5.m_2795() + var4.substring(var6.length());
         } else {
            return var0;
         }
      } else {
         return var0;
      }
   }

   private static boolean m_1746(String var0, String var1) {
      return !var0.regionMatches(true, 0, var1, 0, var1.length())
         ? false
         : var0.length() == var1.length() || Character.isWhitespace(var0.charAt(var1.length()));
   }
}
