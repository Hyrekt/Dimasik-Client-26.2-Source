package dev.dimasik.client.system;

import java.util.Locale;

public class Class_xQDipU5xyFVqunmD {
   private static final String f_35072 = "owner";
   private static final String f_35073 = "admin";
   private static final String f_35074 = "админ";
   private static final String f_35075 = "curator";
   private static final String f_35076 = "куратор";
   private static final String f_35077 = "moder";
   private static final String f_35078 = "модер";
   private static final String f_35079 = "helper";
   private static final String f_35080 = "хелпер";
   private static final String f_35081 = "support";
   private static final String f_35082 = "поддержка";
   private static final String f_35083 = "staff";
   private static final String f_35084 = "сотрудник";
   private static final String f_35085 = "стажер";
   private static final String f_35086 = "стажёр";

   public static int m_9498(String var0) {
      if (var0 == null) {
         return 0;
      } else {
         String var1 = var0.toLowerCase(Locale.ROOT);
         if (var1.contains(f_35072)) {
            return 10;
         } else if (var1.contains(f_35073) || var1.contains(f_35074)) {
            return 9;
         } else if (var1.contains(f_35075) || var1.contains(f_35076)) {
            return 8;
         } else if (var1.contains(f_35077) || var1.contains(f_35078)) {
            return 7;
         } else if (var1.contains(f_35079) || var1.contains(f_35080)) {
            return 6;
         } else if (var1.contains(f_35081) || var1.contains(f_35082)) {
            return 5;
         } else if (var1.contains(f_35083) || var1.contains(f_35084)) {
            return 4;
         } else {
            return !var1.contains(f_35085) && !var1.contains(f_35086) ? 0 : 3;
         }
      }
   }

   public static String m_9499(Class_jZQ0pP9BTU3L7miy var0, String var1, float var2, int var3) {
      int var4 = 0;

      while (var4 < var1.length()) {
         int var5 = var1.offsetByCodePoints(var4, 1);
         if (var0.m_7383().m_2157(var1.substring(0, var5), var3, 0.0F) > var2) {
            break;
         }

         var4 = var5;
      }

      return var1.substring(0, var4);
   }

   public static boolean m_9500(String var0) {
      return var0 != null && Class_fDYr9dPgi2Kr231m.m_6461().matcher(var0.toLowerCase(Locale.ROOT)).matches();
   }
}
