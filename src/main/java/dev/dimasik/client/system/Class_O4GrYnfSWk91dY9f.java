package dev.dimasik.client.system;

import net.minecraft.util.Mth;

public final class Class_O4GrYnfSWk91dY9f {
   private static final float f_11538 = (float) (Math.PI / 180.0);
   private static final double f_11539 = 360.0;
   private static final double f_11540 = 2.0;
   private static final double f_11541 = 2.0;
   private static final float f_11542 = (float) Math.PI;
   private static final float f_11543 = (float) (180.0 / Math.PI);

   public static float m_4027(float var0) {
      return -(Mth.cos(f_11542 * var0) - 1.0F) / 2.0F;
   }

   public static double m_4028(double var0, double var2) {
      return (var0 % var2 + var2) % var2;
   }

   private static double m_4029(double var0, double var2, double var4) {
      return m_4028(var2 - var0 + var4 / f_11540, var4) - var4 / f_11541;
   }

   public static float m_4030(float var0) {
      return var0 * f_11538;
   }

   private Class_O4GrYnfSWk91dY9f() {
   }

   public static float m_4031(float var0, float var1, float var2) {
      return var2 <= 0.0F ? var0 : (var2 >= 1.0F ? var1 : var0 + (var1 - var0) * var2);
   }

   public static double m_4032(double var0, double var2, double var4) {
      return var0 + var4 * m_4029(var0, var2, f_11539);
   }

   public static float m_4033(float var0) {
      return var0 * f_11543;
   }
}
