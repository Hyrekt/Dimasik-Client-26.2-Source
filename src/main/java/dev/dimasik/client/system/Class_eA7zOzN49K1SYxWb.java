package dev.dimasik.client.system;

import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector2f;

public class Class_eA7zOzN49K1SYxWb extends Class_kkp256olqZ4F1qt3 {
   private static final double f_19070 = 999.0;
   private static final double f_19071 = 999.0;
   private static final double f_19072 = 999.0;
   private static final double f_19073 = -999.0;
   private static final double f_19074 = 999.0;
   private static final double f_19075 = -999.0;
   private static final float f_19076 = -90.0F;
   private static final float f_19077 = 90.0F;

   @Override
   public Vector2f m_1006(Vector2f var1, Vector2f var2) {
      float var3 = var2.x;
      float var4 = var2.y;
      float var5 = var1.x;
      float var6 = var1.y;
      double var7 = Mth.wrapDegrees(var3 - var5);
      double var9 = var4 - var6;
      double var11 = f_19070;
      double var13 = f_19071;
      float var15 = (float)Math.max(Math.min(var7, f_19072), f_19073);
      float var16 = (float)Math.max(Math.min(var9, f_19074), f_19075);
      var3 = var5 + var15;
      var4 = var6 + var16;
      Vector2f var17 = new Vector2f(var3, var4);
      var3 = var17.x;
      var4 = Math.max(f_19076, Math.min(f_19077, var17.y));
      return new Vector2f(Class_uHPXr81r5AZlFeJr.m_9133(var3), Class_uHPXr81r5AZlFeJr.m_9133(var4));
   }

   public Class_eA7zOzN49K1SYxWb(Vec3 var1) {
      super(var1, Class_kkp256olqZ4F1qt3.HLSsfEOz1OozGlGI.FAST);
   }
}
