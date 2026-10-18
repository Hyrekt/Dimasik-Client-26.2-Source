package dev.dimasik.client.system;

import java.util.Optional;
import java.util.function.DoubleFunction;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public final class Class_R2mRAo33yUF0EkU2 {
   public static final int f_12415 = 64;
   public static final double f_12416 = 0.99F;
   public static final double f_12417 = 0.6F;
   public static final double f_12418 = 0.05;
   private static final double f_12419 = 0.05;
   private static final double f_12420 = 0.3;
   private static final double f_12421 = 0.5;
   private static final double f_12422 = 0.72;
   private static final double f_12423 = 0.28;
   private static final double f_12424 = 0.025;
   private static final double f_12425 = 0.25;
   private static final double f_12426 = 64.0;
   private static final double f_12427 = 0.5;
   private static final double f_12428 = 0.5;
   private static final double f_12429 = 0.01;
   private static final double f_12430 = 0.25;
   private static final double f_12431 = 0.6F;
   private static final double f_12432 = 0.99F;
   private static final double f_12433 = 1.0E-10;
   private static final double f_12434 = 0.6F;
   private static final double f_12435 = 0.99F;
   private static final double f_12436 = 0.05;
   private static final double f_12437 = 64.0;
   private static final double f_12438 = 1.0E-9;
   private static final double f_12439 = 1.0E-5;
   private static final double f_12440 = 1.0E-5;
   private static final double f_12441 = 0.6F;
   private static final double f_12442 = 0.99F;
   private static final double f_12443 = -0.05;
   private static final double f_12444 = 0.5;
   private static final double f_12445 = 0.5;

   private Vec3 m_4479(Vec3 var1, Vec3 var2, double var3, Class_R2mRAo33yUF0EkU2.t94dxH1KOKhexedX var5) {
      Class_R2mRAo33yUF0EkU2.PE4rMdmHWzyX8PIh var6 = m_4485(var3, var5.m_4478(var1) ? f_12431 : f_12432);
      Vec3 var7 = var2.subtract(var1).add(0.0, var6.drop(), 0.0).scale(1.0 / var6.distance());

      for (int var8 = 0; var8 < 4; var8++) {
         Class_R2mRAo33yUF0EkU2.PE4rMdmHWzyX8PIh var9 = this.m_4481(var1, var7, var3, var5);
         Vec3 var10 = var2.subtract(var1).add(0.0, var9.drop(), 0.0).scale(1.0 / var9.distance());
         if (var10.distanceToSqr(var7) < f_12433) {
            return var10;
         }

         var7 = var10;
      }

      return var7;
   }

   private static boolean m_4480(Vec3 var0) {
      return Double.isFinite(var0.lengthSqr());
   }

   private Class_R2mRAo33yUF0EkU2.PE4rMdmHWzyX8PIh m_4481(Vec3 var1, Vec3 var2, double var3, Class_R2mRAo33yUF0EkU2.t94dxH1KOKhexedX var5) {
      Vec3 var6 = var1;
      double var7 = 0.0;
      double var9 = 0.0;
      double var11 = 1.0;
      double var13 = 0.0;

      for (int var15 = 0; var15 < Math.ceil(var3); var15++) {
         double var16 = Math.min(1.0, var3 - var15);
         double var18 = var5.m_4478(var6) ? f_12434 : f_12435;
         var7 += var11 * var16;
         var9 += var13 * var16;
         var6 = new Vec3(var1.x + var2.x * var7, var1.y + var2.y * var7 - var9, var1.z + var2.z * var7);
         var11 *= var18;
         var13 = var13 * var18 + f_12436;
      }

      return new Class_R2mRAo33yUF0EkU2.PE4rMdmHWzyX8PIh(var7, var9);
   }

   private static Vec3 m_4482(AABB var0, double var1) {
      return new Vec3((var0.minX + var0.maxX) * f_12444, var0.minY + var0.getYsize() * var1, (var0.minZ + var0.maxZ) * f_12445);
   }

   public boolean m_4483(Vec3 var1, Vec3 var2, DoubleFunction<AABB> var3, Class_R2mRAo33yUF0EkU2.t94dxH1KOKhexedX var4, double var5) {
      Vec3 var7 = var1;

      for (int var8 = 0; var8 < Math.min(f_12437, Math.ceil(var5)); var8++) {
         Vec3 var9 = var7.add(var2);
         AABB var10 = (AABB)var3.apply(var8);
         AABB var11 = (AABB)var3.apply(var8 + 1);
         Vec3 var12 = var11.getCenter().subtract(var10.getCenter());
         Vec3 var13 = var9.subtract(var12);
         Optional var14 = var10.clip(var7, var13);
         if (var10.contains(var7)) {
            return true;
         }

         if (var14.isPresent()) {
            double var15 = var7.distanceTo(var13);
            double var17 = var15 < f_12438 ? 0.0 : var7.distanceTo((Vec3)var14.get()) / var15;
            Vec3 var19 = var7.add(var2.scale(var17));
            return var4.m_4477(var7, var19) + f_12439 >= var7.distanceTo(var19);
         }

         if (var4.m_4477(var7, var9) < var7.distanceTo(var9) - f_12440) {
            return false;
         }

         var2 = var2.scale(var4.m_4478(var7) ? f_12441 : f_12442).add(0.0, f_12443, 0.0);
         var7 = var9;
      }

      return false;
   }

   public Class_R2mRAo33yUF0EkU2.xEuDTaYr9Z93f47d m_4484(
      Vec3 var1, Vec3 var2, double var3, DoubleFunction<AABB> var5, Class_R2mRAo33yUF0EkU2.t94dxH1KOKhexedX var6
   ) {
      if (Double.isFinite(var3) && !(var3 < f_12420) && m_4480(var1) && m_4480(var2)) {
         for (double var10 : new double[]{f_12421, f_12422, f_12423}) {
            double var12 = f_12424;
            double var14 = this.m_4486(var1, var2, var3, var5, var6, var12, var10);

            for (double var16 = f_12425; var16 <= f_12426; var16 += f_12430) {
               double var18 = this.m_4486(var1, var2, var3, var5, var6, var16, var10);
               if (Double.isFinite(var14) && Double.isFinite(var18) && (var14 <= 0.0 && var18 >= 0.0 || var14 >= 0.0 && var18 <= 0.0)) {
                  double var20 = var12;
                  double var22 = var16;
                  boolean var24 = var14 >= 0.0;

                  for (int var25 = 0; var25 < 22; var25++) {
                     double var26 = (var20 + var22) * f_12427;
                     double var28 = this.m_4486(var1, var2, var3, var5, var6, var26, var10);
                     if (var28 >= 0.0 == var24) {
                        var20 = var26;
                     } else {
                        var22 = var26;
                     }
                  }

                  double var33 = (var20 + var22) * f_12428;
                  Vec3 var27 = m_4482((AABB)var5.apply(var33), var10);
                  Vec3 var34 = this.m_4479(var1, var27, var33, var6).subtract(var2);
                  if (Math.abs(var34.length() - var3) < f_12429) {
                     Vec3 var29 = var34.normalize();
                     float var30 = (float)Math.toDegrees(Math.atan2(-var29.x, var29.z));
                     float var31 = (float)(-Math.toDegrees(Math.atan2(var29.y, var29.horizontalDistance())));
                     Class_R2mRAo33yUF0EkU2.xEuDTaYr9Z93f47d var32 = new Class_R2mRAo33yUF0EkU2.xEuDTaYr9Z93f47d(var30, var31, var27, var33);
                     if (this.m_4483(var1, var32.direction().scale(var3).add(var2), var5, var6, var33 + 1.0)) {
                        return var32;
                     }
                  }
               }

               var12 = var16;
               var14 = var18;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public static Class_R2mRAo33yUF0EkU2.PE4rMdmHWzyX8PIh m_4485(double var0, double var2) {
      int var4 = (int)Math.floor(var0);
      double var5 = var0 - var4;
      double var7 = Math.pow(var2, var4);
      double var9 = (1.0 - var7) / (1.0 - var2);
      return new Class_R2mRAo33yUF0EkU2.PE4rMdmHWzyX8PIh(var9 + var5 * var7, f_12419 / (1.0 - var2) * (var4 - var9 + var5 * (1.0 - var7)));
   }

   private double m_4486(Vec3 var1, Vec3 var2, double var3, DoubleFunction<AABB> var5, Class_R2mRAo33yUF0EkU2.t94dxH1KOKhexedX var6, double var7, double var9) {
      return this.m_4479(var1, m_4482((AABB)var5.apply(var7), var9), var7, var6).subtract(var2).length() - var3;
   }

   public record PE4rMdmHWzyX8PIh(double distance, double drop) {
   }

   public interface t94dxH1KOKhexedX {
      double m_4477(Vec3 var1, Vec3 var2);

      boolean m_4478(Vec3 var1);
   }

   public record xEuDTaYr9Z93f47d(float yaw, float pitch, Vec3 targetPosition, double flightTicks) {
      public Vec3 direction() {
         return Vec3.directionFromRotation(this.pitch, this.yaw);
      }
   }
}
