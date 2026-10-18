package dev.dimasik.client.system;

public final class Class_euFMDTGHOhdZbwzG {
   private static final float f_19301 = 1.65F;
   private static final float f_19302 = 0.15F;
   private static final float f_19303 = 0.5F;
   private static final float f_19304 = 0.7F;
   private static final float f_19305 = 0.2F;
   private static final float f_19306 = 1.7F;
   private static final double f_19307 = 1.5;
   private static final float f_19308 = 255.0F;
   private static final float f_19309 = 0.08F;
   private static final float f_19310 = 255.0F;
   private static final float f_19311 = 0.22F;
   private static final float f_19312 = 1.75F;
   private static final double f_19313 = 1.5;
   private static final double f_19314 = 30.0;
   private static final float f_19315 = 1.08F;

   public static void m_6442(float var0, float var1, double var2, float var4, float var5, int var6, Class_euFMDTGHOhdZbwzG.dVYgkAAicLJAPZh8 var7) {
      float var8 = var0 * f_19301;
      float var9 = var1 - f_19302;
      float var10 = Math.max(f_19303, f_19304 - f_19305 * var4);

      for (int var11 = 0; var11 < 360; var11 += 2) {
         double var12 = Math.toRadians(var11 + var2);
         float var14 = (float)(Math.cos(var12) * var8 * var10);
         float var15 = (float)(Math.sin(var12) * var8 * var10);

         for (int var16 = 0; var16 < var6; var16++) {
            float var17 = var9 / f_19306 + var9 / 2.0F * (float)Math.cos(Math.toRadians(var2 / f_19307 + var16 * 2));
            int var18 = Math.clamp((int)(f_19308 * var4 * ((float)var16 / var6) * f_19309), 0, 255);
            var7.m_6441(var14, var17, var15, var5, var18);
         }
      }

      int var19 = Math.clamp((int)(f_19310 * var4 * f_19311), 0, 255);

      for (int var20 = 0; var20 < 360; var20 += 2) {
         double var13 = Math.toRadians(var20 + var2);
         float var21 = (float)(Math.cos(var13) * var8 * var10);
         float var22 = (float)(Math.sin(var13) * var8 * var10);
         float var23 = var9 / f_19312 + var9 / 2.0F * (float)Math.cos(Math.toRadians(var2 / f_19313 + f_19314));
         var7.m_6441(var21, var23, var22, var5 * f_19315, var19);
      }
   }

   private Class_euFMDTGHOhdZbwzG() {
   }

   @FunctionalInterface
   public interface dVYgkAAicLJAPZh8 {
      void m_6441(float var1, float var2, float var3, float var4, int var5);
   }
}
