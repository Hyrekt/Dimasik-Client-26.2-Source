package dev.dimasik.client.system;

import lombok.Generated;

public final class Class_ZPRMV6aCWVosHRWh {
   private static volatile float f_16931 = 1.0F;
   private static volatile float f_16932 = 1.0F;
   private static volatile long f_16933;
   private static final long f_16934 = 1000000L;
   private static final String f_16935 = "This is a utility class and cannot be instantiated";

   public static void m_5819() {
      f_16933 = 0L;
      f_16932 = 1.0F;
   }

   public static void m_5820(float var0) {
      f_16931 = var0;
   }

   @Generated
   private Class_ZPRMV6aCWVosHRWh() {
      throw new UnsupportedOperationException(f_16935);
   }

   public static void m_5821(float var0, long var1) {
      f_16932 = var0;
      f_16933 = System.nanoTime() + var1 * f_16934;
   }

   public static float m_5822() {
      long var0 = f_16933;
      if (var0 != 0L) {
         if (System.nanoTime() < var0) {
            return f_16932;
         }

         f_16933 = 0L;
         f_16932 = 1.0F;
      }

      return f_16931;
   }
}
