package dev.dimasik.client.system;

import net.minecraft.client.Minecraft;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector2f;

public class Class_hL9Q4xFNrT4cGFQq extends Class_kkp256olqZ4F1qt3 {
   private static final double f_23279 = 360.0;
   private static final double f_23280 = 360.0;
   private static final float f_23281 = 5.0F;
   private static final float f_23282 = 4.0F;
   private static final float f_23283 = 20.0F;
   private static final double f_23284 = 20.0;
   private static final double f_23285 = 0.5;
   private static final double f_23286 = 900.0;
   private static final double f_23287 = 100.0;
   private static final float f_23288 = -90.0F;
   private static final float f_23289 = 90.0F;

   public Class_hL9Q4xFNrT4cGFQq(Vec3 var1) {
      super(var1, Class_kkp256olqZ4F1qt3.HLSsfEOz1OozGlGI.SLOW);
   }

   @Override
   public Vector2f m_1006(Vector2f var1, Vector2f var2) {
      float var3 = var2.x;
      float var4 = var2.y;
      float var5 = var1.x;
      float var6 = var1.y;
      double var7 = Mth.wrapDegrees(var3 - var5);
      double var9 = var4 - var6;
      double var11 = Math.sqrt(var7 * var7 + var9 * var9);
      if (var11 == 0.0) {
         return new Vector2f(var1.x, var1.y);
      }

      double var13 = Math.abs(var7 / var11);
      double var15 = Math.abs(var9 / var11);
      double var17 = f_23279 * var13;
      double var19 = f_23280 * var15;
      float var21 = (float)Math.max(Math.min(var7, var17), -var17);
      float var22 = (float)Math.max(Math.min(var9, var19), -var19);
      float var23 = !this.f_25114 ? this.m_4026(f_23281) : 0.0F;
      float var24 = !this.f_25114 ? this.m_4026(f_23282) : 0.0F;
      var3 = var5 + var21 + var23;
      var4 = var6 + var22 + var24;

      for (int var25 = 1; var25 <= (int)(Minecraft.getInstance().getFps() / f_23283 + Math.random() * f_23284); var25++) {
         if (Math.abs(var21) + Math.abs(var22) > 1.0F) {
            var3 += (float)((Math.random() - f_23285) / f_23286);
            var4 -= (float)(Math.random() / f_23287);
         }

         Vector2f var26 = new Vector2f(var3, var4);
         var3 = var26.x;
         var4 = Math.max(f_23288, Math.min(f_23289, var26.y));
      }

      return new Vector2f(Class_uHPXr81r5AZlFeJr.m_9133(var3), Class_uHPXr81r5AZlFeJr.m_9133(var4));
   }
}
