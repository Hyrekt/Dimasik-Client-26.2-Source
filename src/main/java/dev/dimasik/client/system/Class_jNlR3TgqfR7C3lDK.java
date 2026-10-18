package dev.dimasik.client.system;

import java.util.List;
import java.util.Optional;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public final class Class_jNlR3TgqfR7C3lDK {
   public static final double f_24738 = 1.5;
   public static final int f_24739 = 40;
   private static final double f_24740 = 40.0;
   private static final double f_24741 = 0.5;
   private static final double f_24742 = 0.72;
   private static final double f_24743 = 0.28;
   private static final double f_24744 = 1.0E-8;
   private static final double f_24745 = 2.25;
   private static final double f_24746 = 2.0;
   private static final double f_24747 = 1.0E-6;
   private static final double f_24748 = 1.0E-7;
   private static final double f_24749 = 1.0E-7;
   private static final double f_24750 = 1.5;
   private static final double f_24751 = 1.0E-5;
   private static final double f_24752 = 1.5;
   private static final double f_24753 = 1.0E-10;
   private static final double f_24754 = 1.0E-10;
   private static final double f_24755 = 4.0;
   private static final double f_24756 = -0.5;
   private static final double f_24757 = 1.0E-12;
   private static final double f_24758 = 2.0;
   private static final double f_24759 = 1.0E-8;
   private static final double f_24760 = 1.0E-9;
   private static final double f_24761 = 1.0E-6;
   private static final double f_24762 = 1.0E-6;
   private static final double f_24763 = 0.5;
   private static final double f_24764 = 0.5;

   private boolean m_7379(Vec3 var1, Vec3 var2, List<AABB> var3, double var4, double var6, Class_jNlR3TgqfR7C3lDK.nafCIzoP0WWTJDfN var8) {
      double var9 = 0.0;

      while (var9 < var6) {
         double var11 = Math.min(var6, Math.floor(var4 + var9 + f_24759) + 1.0 - var4);
         if (var11 <= var9) {
            return false;
         }

         Vec3 var13 = var1.add(var2.scale(var9));
         Vec3 var14 = var1.add(var2.scale(var11));
         AABB var15 = Class_FyutImIC8oFoGKuH.m_2703(var3, var4 + var9);
         AABB var16 = Class_FyutImIC8oFoGKuH.m_2703(var3, var4 + var11);
         Vec3 var17 = var14.subtract(var16.getCenter().subtract(var15.getCenter()));
         Optional var18 = var15.clip(var13, var17);
         if (var15.contains(var13)) {
            return true;
         }

         if (var18.isPresent()) {
            double var19 = var13.distanceTo(var17);
            double var21 = var19 < f_24760 ? 0.0 : var13.distanceTo((Vec3)var18.get()) / var19;
            Vec3 var23 = var13.lerp(var14, var21);
            return var8.m_7378(var13, var23) + f_24761 >= var13.distanceTo(var23);
         }

         if (var8.m_7378(var13, var14) + f_24762 < var13.distanceTo(var14)) {
            return false;
         }

         var9 = var11;
      }

      return false;
   }

   private static double[] m_7380(double var0, double var2, double var4) {
      if (Math.abs(var0) < f_24753) {
         return Math.abs(var2) < f_24754 ? new double[0] : new double[]{-var4 / var2};
      }

      double var6 = var2 * var2 - f_24755 * var0 * var4;
      if (var6 < 0.0) {
         return new double[0];
      }

      double var8 = f_24756 * (var2 + Math.copySign(Math.sqrt(var6), var2));
      return Math.abs(var8) < f_24757 ? new double[]{-var2 / (f_24758 * var0)} : new double[]{var8 / var0, var4 / var8};
   }

   private static Vec3 m_7381(AABB var0, double var1) {
      return new Vec3((var0.minX + var0.maxX) * f_24763, var0.minY + var0.getYsize() * var1, (var0.minZ + var0.maxZ) * f_24764);
   }

   public Class_jNlR3TgqfR7C3lDK.w3n44Eu0QQ7QmeOq m_7382(Vec3 var1, Vec3 var2, List<AABB> var3, double var4, Class_jNlR3TgqfR7C3lDK.nafCIzoP0WWTJDfN var6) {
      if (Double.isFinite(var1.lengthSqr()) && Double.isFinite(var2.lengthSqr()) && Double.isFinite(var4) && !(var4 < 0.0) && var3.size() >= 2) {
         double var7 = Math.min(f_24740, var3.size() - 1 - var4);
         Class_jNlR3TgqfR7C3lDK.w3n44Eu0QQ7QmeOq var9 = null;

         for (double var13 : new double[]{f_24741, f_24742, f_24743}) {
            double var15 = 0.0;

            while (var15 < var7) {
               double var17 = Math.min(var7, Math.floor(var4 + var15 + f_24744) + 1.0 - var4);
               if (var17 <= var15) {
                  break;
               }

               Vec3 var19 = m_7381(Class_FyutImIC8oFoGKuH.m_2703(var3, var4 + var15), var13);
               Vec3 var20 = m_7381(Class_FyutImIC8oFoGKuH.m_2703(var3, var4 + var17), var13).subtract(var19).scale(1.0 / (var17 - var15));
               Vec3 var21 = var19.subtract(var20.scale(var15)).subtract(var1);
               Vec3 var22 = var20.subtract(var2);
               double var23 = var22.lengthSqr() - f_24745;
               double var25 = f_24746 * var21.dot(var22);
               double var27 = var21.lengthSqr();

               for (double var32 : m_7380(var23, var25, var27)) {
                  if (Double.isFinite(var32)
                     && !(var32 <= f_24747)
                     && !(var32 < var15 - f_24748)
                     && !(var32 > var17 + f_24749)
                     && (var9 == null || !(var32 >= var9.flightTicks()))) {
                     Vec3 var34 = m_7381(Class_FyutImIC8oFoGKuH.m_2703(var3, var4 + var32), var13);
                     Vec3 var35 = var34.subtract(var1).scale(1.0 / var32).subtract(var2);
                     if (!(Math.abs(var35.length() - f_24750) > f_24751)) {
                        float var36 = (float)Math.toDegrees(Math.atan2(-var35.x, var35.z));
                        float var37 = (float)(-Math.toDegrees(Math.atan2(var35.y, var35.horizontalDistance())));
                        Class_jNlR3TgqfR7C3lDK.w3n44Eu0QQ7QmeOq var38 = new Class_jNlR3TgqfR7C3lDK.w3n44Eu0QQ7QmeOq(var36, var37, var32);
                        if (this.m_7379(var1, var38.direction().scale(f_24752).add(var2), var3, var4, var32, var6)) {
                           var9 = var38;
                        }
                     }
                  }
               }

               var15 = var17;
            }

            if (var9 != null) {
               return var9;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   @FunctionalInterface
   public interface nafCIzoP0WWTJDfN {
      double m_7378(Vec3 var1, Vec3 var2);
   }

   public record w3n44Eu0QQ7QmeOq(float yaw, float pitch, double flightTicks) {
      public Vec3 direction() {
         return Vec3.directionFromRotation(this.pitch, this.yaw).normalize();
      }
   }
}
