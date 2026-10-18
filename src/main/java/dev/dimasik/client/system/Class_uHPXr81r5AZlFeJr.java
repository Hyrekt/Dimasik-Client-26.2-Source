package dev.dimasik.client.system;

public final class Class_uHPXr81r5AZlFeJr implements Class_NzJrN63M7QBpmAbi {
   private static final String f_32793 = "Sensitivity must be within 0..1";
   private static final double f_32794 = 0.6F;
   private static final double f_32795 = 0.2F;
   private static final double f_32796 = 8.0;
   private static final float f_32797 = 0.15F;
   private static final String f_32798 = "Invalid mouse delta or gain";
   private static final double f_32799 = 0.15F;
   private static final double f_32800 = 0.15F;

   public static float m_9128(float var0) {
      return m_9133(var0);
   }

   public static float m_9129(long var0, double var2) {
      return (float)(var0 * var2) * f_32797;
   }

   public static float m_9130(float var0) {
      return m_9134(var0);
   }

   public static double m_9131(double var0, boolean var2) {
      if (Double.isFinite(var0) && !(var0 < 0.0) && !(var0 > 1.0)) {
         double var3 = var0 * f_32794 + f_32795;
         return var3 * var3 * var3 * (var2 ? 1.0 : f_32796);
      } else {
         throw new IllegalArgumentException(f_32793);
      }
   }

   public static float m_9132(float var0, double var1) {
      if (Float.isFinite(var0) && Double.isFinite(var1) && !(var1 <= 0.0)) {
         double var3 = var1 * f_32799;
         return m_9129(Math.round(var0 / var3), var1);
      } else {
         throw new IllegalArgumentException(f_32798);
      }
   }

   public static float m_9133(float var0) {
      return m_9132(var0, m_9135());
   }

   public static float m_9134(float var0) {
      return (float)Math.round(var0 / (m_9135() * f_32800));
   }

   public static double m_9135() {
      boolean var0 = f_11537.player != null && !f_11537.options.smoothCamera && f_11537.options.getCameraType().isFirstPerson() && f_11537.player.isScoping();
      return m_9131((Double)f_11537.options.sensitivity().get(), var0);
   }

   public static float m_9136() {
      return m_9137();
   }

   public static float m_9137() {
      return (float)m_9135();
   }

   private Class_uHPXr81r5AZlFeJr() {
   }

   public static float m_9138() {
      return m_9139();
   }

   public static float m_9139() {
      return m_9129(1L, m_9135());
   }
}
