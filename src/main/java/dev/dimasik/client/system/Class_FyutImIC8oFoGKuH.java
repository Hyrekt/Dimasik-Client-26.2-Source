package dev.dimasik.client.system;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public final class Class_FyutImIC8oFoGKuH {
   private static final double f_7598 = 0.03;
   private static final double f_7599 = 3.0;
   private static final double f_7600 = 3.0;
   private static final float f_7601 = -90.0F;
   private static final float f_7602 = 90.0F;
   private static final double f_7603 = 0.01;
   private static final double f_7604 = 0.16;
   private static final double f_7605 = 2.0;
   private static final double f_7606 = 2.0;
   private static final double f_7607 = -0.08;
   private static final double f_7608 = 0.05;
   private static final double f_7609 = 0.2;
   private static final double f_7610 = 2.0;
   private static final double f_7611 = 0.03;
   private static final double f_7612 = -0.15;
   private static final double f_7613 = 0.15;
   private static final double f_7614 = -0.15;
   private static final double f_7615 = -0.15;
   private static final double f_7616 = 0.15;
   private static final double f_7617 = 0.25;
   private static final double f_7618 = 0.05;
   private static final double f_7619 = 0.25;
   private static final double f_7620 = 1.0E-7;
   private static final double f_7621 = 1.0E-7;
   private static final double f_7622 = 1.0E-7;
   private static final double f_7623 = 1.0E-7;
   private static final double f_7624 = 1.0E-7;
   private static final double f_7625 = 2.0;
   private static final double f_7626 = -1.0;
   private static final double f_7627 = 0.75;
   private static final double f_7628 = 1.0E-8;
   private static final double f_7629 = 0.1;
   private static final double f_7630 = 1.0E-8;
   private static final double f_7631 = 0.04;
   private static final double f_7632 = 3.2;
   private static final double f_7633 = 1.0E-8;
   private static final double f_7634 = 0.1;
   private static final double f_7635 = 0.1;
   private static final double f_7636 = 0.99F;
   private static final double f_7637 = 0.98F;
   private static final double f_7638 = 0.99F;
   private static final double f_7639 = 0.5;
   private static final double f_7640 = 0.85;
   private static final double f_7641 = 1.0E-7;
   private static final double f_7642 = 1.0E-7;

   public static Vec3 m_2701(Vec3 var0, float var1, float var2, double var3) {
      Vec3 var5 = Vec3.directionFromRotation(var2, var1);
      double var6 = var5.horizontalDistance();
      double var8 = var0.horizontalDistance();
      double var10 = Math.toRadians(var2);
      double var12 = Math.pow(Math.cos(var10), f_7625);
      Vec3 var14 = var0.add(0.0, var3 * (f_7626 + var12 * f_7627), 0.0);
      if (var14.y < 0.0 && var6 > f_7628) {
         double var15 = -var14.y * f_7629 * var12;
         var14 = var14.add(var5.x * var15 / var6, var15, var5.z * var15 / var6);
      }

      if (var2 < 0.0F && var6 > f_7630) {
         double var17 = var8 * -Math.sin(var10) * f_7631;
         var14 = var14.add(-var5.x * var17 / var6, var17 * f_7632, -var5.z * var17 / var6);
      }

      if (var6 > f_7633) {
         var14 = var14.add((var5.x / var6 * var8 - var14.x) * f_7634, 0.0, (var5.z / var6 * var8 - var14.z) * f_7635);
      }

      return var14.multiply(f_7636, f_7637, f_7638);
   }

   private static boolean m_2702(Vec3 var0, Vec3 var1) {
      return Math.abs(var0.x - var1.x) > f_7641 || Math.abs(var0.z - var1.z) > f_7642;
   }

   public static AABB m_2703(List<AABB> var0, double var1) {
      double var3 = Mth.clamp(var1, 0.0, var0.size() - 1);
      int var5 = (int)var3;
      AABB var6 = (AABB)var0.get(var5);
      if (var5 == var0.size() - 1) {
         return var6;
      }

      Vec3 var7 = ((AABB)var0.get(var5 + 1)).getCenter().subtract(var6.getCenter()).scale(var3 - var5);
      return var6.move(var7);
   }

   public static Vec3 m_2704(Vec3 var0, float var1, float var2) {
      return var0.scale(f_7639).add(Vec3.directionFromRotation(var2, var1).scale(f_7640));
   }

   public static List<AABB> m_2705(
      AABB var0,
      Class_qT3a68ZR9cAz3wbe.GHJVGUMVTdUYTniZ var1,
      Class_FyutImIC8oFoGKuH.at09eCJZBjEw7bSk var2,
      int var3,
      Class_FyutImIC8oFoGKuH.v4GJnInBNLLhf0jm var4,
      Predicate<AABB> var5
   ) {
      ArrayList var6 = new ArrayList();
      AABB var7 = var0;
      Vec3 var8 = var1.velocity();
      boolean var9 = var2.grounded() && var8.y <= f_7598;
      boolean var10 = var2.gliding();
      var6.add(var7);

      for (int var11 = 1; var11 <= Math.clamp(var3, 0, 80); var11++) {
         double var12 = f_7599 * (1.0 - Math.exp(-var11 / f_7600));
         float var14 = var2.yaw() + (float)(var1.yawRate() * var12);
         float var15 = Mth.clamp(var2.pitch() + (float)(var1.pitchRate() * var12), f_7601, f_7602);
         double var16 = var2.slowFalling() && var8.y <= 0.0 ? Math.min(f_7603, var2.gravity()) : var2.gravity();
         Vec3 var18;
         if (var10 && !var9 && !var2.fluid()) {
            if (var2.boosted() && var11 <= 8) {
               var8 = m_2704(var8, var14, var15);
            }

            var18 = m_2701(var8, var14, var15, var16);
            if (!var2.boosted()) {
               Vec3 var31 = m_2701(var1.velocity().subtract(var1.acceleration()), var2.yaw(), var2.pitch(), var16);
               Vec3 var20 = var1.velocity().subtract(var31);
               if (var20.lengthSqr() < f_7604) {
                  var18 = var18.add(var20.scale(Math.exp(-var11 / f_7605)));
               }
            }
         } else if (!var2.flying() && !var2.fluid()) {
            double var19 = var9 ? f_7607 : (var8.y - var16) * var2.verticalDrag();
            if (var2.levitation() >= 0) {
               var19 = (var8.y + (f_7608 * (var2.levitation() + 1) - var8.y) * f_7609) * var2.verticalDrag();
            }

            double var21 = Math.exp(-var11 / f_7610);
            double var23 = var9
               ? var8.x + var1.acceleration().x * var21
               : var8.x * var2.horizontalDrag() + (var1.acceleration().x + var1.velocity().x * (1.0 - var2.horizontalDrag())) * var21;
            double var25 = var9
               ? var8.z + var1.acceleration().z * var21
               : var8.z * var2.horizontalDrag() + (var1.acceleration().z + var1.velocity().z * (1.0 - var2.horizontalDrag())) * var21;
            if (var9) {
               double var27 = Math.hypot(var23, var25);
               double var29 = var1.velocity().horizontalDistance() + f_7611;
               if (var27 > var29) {
                  var23 *= var29 / var27;
                  var25 *= var29 / var27;
               }
            }

            var18 = new Vec3(var23, var19, var25);
            if (var2.climbing()) {
               var18 = new Vec3(Mth.clamp(var23, f_7612, f_7613), Math.max(var19, f_7614), Mth.clamp(var25, f_7615, f_7616));
            }
         } else {
            var18 = var8.add(var1.acceleration().scale(Math.exp(-var11 / f_7606)));
         }

         if (var5.test(var7)) {
            var18 = var18.multiply(f_7617, f_7618, f_7619);
         }

         Vec3 var32 = var4.m_2700(var7, var18);
         if (var9 && var2.stepHeight() > 0.0 && m_2702(var18, var32)) {
            Vec3 var33 = var4.m_2700(var7, new Vec3(0.0, var2.stepHeight(), 0.0));
            Vec3 var34 = var4.m_2700(var7.move(var33), new Vec3(var18.x, 0.0, var18.z));
            Vec3 var22 = var4.m_2700(var7.move(var33).move(var34), new Vec3(0.0, var18.y - var33.y, 0.0));
            Vec3 var35 = var33.add(var34).add(var22);
            if (var35.horizontalDistanceSqr() > var32.horizontalDistanceSqr() + f_7620) {
               var32 = var35;
            }
         }

         var9 = var18.y < 0.0 && var32.y > var18.y + f_7621;
         if (var9) {
            var10 = false;
         }

         var7 = var7.move(var32);
         var6.add(var7);
         var8 = new Vec3(
            Math.abs(var32.x - var18.x) > f_7622 ? 0.0 : var18.x,
            Math.abs(var32.y - var18.y) > f_7623 ? 0.0 : var18.y,
            Math.abs(var32.z - var18.z) > f_7624 ? 0.0 : var18.z
         );
      }

      return var6;
   }

   private Class_FyutImIC8oFoGKuH() {
   }

   public record at09eCJZBjEw7bSk(
      boolean grounded,
      boolean gliding,
      boolean flying,
      boolean fluid,
      boolean climbing,
      boolean slowFalling,
      int levitation,
      boolean boosted,
      double gravity,
      double horizontalDrag,
      double verticalDrag,
      double stepHeight,
      float yaw,
      float pitch
   ) {
   }

   @FunctionalInterface
   public interface v4GJnInBNLLhf0jm {
      Vec3 m_2700(AABB var1, Vec3 var2);
   }
}
