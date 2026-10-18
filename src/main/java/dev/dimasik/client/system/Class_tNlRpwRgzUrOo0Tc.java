package dev.dimasik.client.system;

import org.joml.Vector3f;

public final class Class_tNlRpwRgzUrOo0Tc extends Class_JtQh1r0P8b1y8XvD {
   private static final float f_31825 = -1.0F;
   private static final float f_31826 = 0.5F;
   private static final float f_31827 = 0.5F;
   private static final float f_31828 = -1.0F;
   private static final float f_31829 = -1.0F;

   public static Class_tNlRpwRgzUrOo0Tc m_8864(float var0, float var1, float var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      return new Class_tNlRpwRgzUrOo0Tc(var0, var1, var2, var3, var4, var5, var6, var5 + var3, var6 + var4, var7, var8);
   }

   private Class_tNlRpwRgzUrOo0Tc(float var1, float var2, float var3, int var4, int var5, float var6, float var7, float var8, float var9, int var10, int var11) {
      super(var10, var11, 0, 0);
      float var12 = var1;
      float var13 = var1 + var4;
      float var14 = var2;
      float var15 = var2 + var5;
      float var16 = var3;
      float var17 = var3 + 1.0F;
      this.m_8865(var12, var14, var16, var13, var15, var16, var6, var7, var8, var9, new Vector3f(0.0F, 0.0F, f_31825), false);
      this.m_8865(var12, var15, var17, var13, var14, var17, var6, var9, var8, var7, new Vector3f(0.0F, 0.0F, 1.0F), false);
      float var18 = f_31826 * (var6 - var8) / var4;
      float var19 = f_31827 * (var7 - var9) / var5;

      for (int var20 = 0; var20 < var4; var20++) {
         float var21 = var12 + var20;
         float var22 = var6 + (var8 - var6) * ((float)var20 / var4) - var18;
         this.m_8865(var21, var14, var16, var21, var15, var17, var22, var7, var22, var9, new Vector3f(f_31828, 0.0F, 0.0F), false);
      }

      for (int var23 = 0; var23 < var4; var23++) {
         float var26 = var6 + (var8 - var6) * ((float)var23 / var4) - var18;
         float var29 = var12 + (var23 + 1);
         this.m_8865(var29, var15, var16, var29, var14, var17, var26, var9, var26, var7, new Vector3f(1.0F, 0.0F, 0.0F), false);
      }

      for (int var24 = 0; var24 < var5; var24++) {
         float var27 = var7 + (var9 - var7) * ((float)var24 / var5) - var19;
         float var30 = var14 + (var24 + 1);
         this.m_8865(var12, var30, var16, var13, var30, var17, var6, var27, var8, var27, new Vector3f(0.0F, 1.0F, 0.0F), true);
      }

      for (int var25 = 0; var25 < var5; var25++) {
         float var28 = var14 + var25;
         float var31 = var7 + (var9 - var7) * ((float)var25 / var5) - var19;
         this.m_8865(var13, var28, var16, var12, var28, var17, var8, var31, var6, var31, new Vector3f(0.0F, f_31829, 0.0F), true);
      }
   }

   private void m_8865(
      float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, Vector3f var11, boolean var12
   ) {
      float[][] var13 = new float[][]{{var4, var2, var3}, {var1, var2, var12 ? var3 : var6}, {var1, var5, var6}, {var4, var5, var12 ? var6 : var3}};
      this.m_3362(var13, var7, var8, var9, var10, var11);
   }
}
