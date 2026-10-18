package dev.dimasik.client.system;

public class Class_2qQelPM41kDnHHzu implements Class_NzJrN63M7QBpmAbi {
   private static final double f_1229 = 0.502112676056338;
   private static final double f_1230 = 1.2;

   public static float m_1200(float var0) {
      return m_1201(var0);
   }

   public static float m_1201(float var0) {
      double var1 = m_1202();
      return var1 <= 0.0 ? var0 : (float)(Math.round(var0 / var1) * var1);
   }

   public static double m_1202() {
      double var0 = (Double)f_11537.options.sensitivity().get();
      double var2 = f_1229;
      return var2 * var2 * var2 * f_1230;
   }
}
