package dev.dimasik.client.system;

import dev.dimasik.mixin.LivingEntityMixin;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;

public final class Class_MCgcjXLZQdRybe5M {
   private static final int f_11126 = 8;
   private static final double f_11127 = 1.0E-4;
   private static final double f_11128 = 1.0E-4;
   private static final double f_11129 = 8.0;
   private static final float f_11130 = (float) (Math.PI / 180.0);
   private static final double f_11131 = -1.0;
   private static final double f_11132 = 0.75;
   private static final double f_11133 = 0.01;
   private static final double f_11134 = -0.1;
   private static final double f_11135 = 0.04;
   private static final double f_11136 = 3.2;
   private static final double f_11137 = 0.1;
   private static final double f_11138 = 0.1;
   private static final double f_11139 = 0.99F;
   private static final double f_11140 = 0.98F;
   private static final double f_11141 = 0.99F;

   public static Vec3 m_3885(LivingEntity var0, float var1) {
      if (var0 != null && Float.isFinite(var1) && var1 != 0.0F) {
         Class_lMF8QIjJz1IQgCZg var2 = (Class_lMF8QIjJz1IQgCZg)var0;
         float var3 = var2.getResolvedPitch();
         Vec3 var4 = var0.calculateViewVector(var3, var2.getResolvedYaw());
         double var5 = ((LivingEntityMixin)var0).dimasik$getEffectiveGravity();
         Vec3 var7 = m_3886(var0.getDeltaMovement(), var4, var3, var5, var0.hasEffect(MobEffects.SLOW_FALLING));
         double var8 = var7.lengthSqr();
         if (Double.isFinite(var8) && !(var8 < f_11128)) {
            double var10 = Math.sqrt(var8);
            float var12 = (float)(var10 / f_11129);
            return var7.scale(1.0 / var10).scale(var1 * var12);
         } else {
            return Vec3.ZERO;
         }
      } else {
         return Vec3.ZERO;
      }
   }

   private Class_MCgcjXLZQdRybe5M() {
   }

   private static Vec3 m_3886(Vec3 var0, Vec3 var1, float var2, double var3, boolean var5) {
      float var6 = var2 * f_11130;
      double var7 = Math.sqrt(var1.x * var1.x + var1.z * var1.z);
      boolean var9 = var7 > 0.0;
      double var10 = var9 ? var1.x / var7 : 0.0;
      double var12 = var9 ? var1.z / var7 : 0.0;
      double var14 = Mth.square(Math.cos(var6));
      double var16 = f_11131 + var14 * f_11132;
      double var18 = var3 * var16;
      double var20 = Math.min(var3, f_11133) * var16;
      double var22 = f_11134 * var14;
      boolean var24 = var6 < 0.0F && var9;
      double var25 = -Mth.sin(var6) * f_11135;
      double var27 = var0.x;
      double var29 = var0.y;
      double var31 = var0.z;
      double var33 = 0.0;
      double var35 = 0.0;
      double var37 = 0.0;

      for (int var39 = 0; var39 < 8; var39++) {
         double var40 = Math.sqrt(var27 * var27 + var31 * var31);
         var29 += var5 && var29 <= 0.0 ? var20 : var18;
         if (var9 && var29 < 0.0) {
            double var42 = var29 * var22;
            var27 += var10 * var42;
            var29 += var42;
            var31 += var12 * var42;
         }

         if (var24) {
            double var45 = var40 * var25;
            var27 -= var10 * var45;
            var29 += var45 * f_11136;
            var31 -= var12 * var45;
         }

         if (var9) {
            var27 += (var10 * var40 - var27) * f_11137;
            var31 += (var12 * var40 - var31) * f_11138;
         }

         var27 *= f_11139;
         var29 *= f_11140;
         var31 *= f_11141;
         var33 += var27;
         var35 += var29;
         var37 += var31;
      }

      return new Vec3(var33, var35, var37);
   }
}
