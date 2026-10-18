package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack.Pose;
import com.mojang.math.Axis;
import java.util.Collection;
import org.joml.Vector3f;

public final class Class_rlEjoVq6UqFoLGoE {
   private static final float f_30303 = 16.0F;
   private static final float f_30304 = 16.0F;
   private static final float f_30305 = 16.0F;
   private static final float f_30306 = 16.0F;
   private static final float f_30307 = 16.0F;
   private static final float f_30308 = 16.0F;
   private static final float f_30309 = 16.0F;
   private static final float f_30310 = 16.0F;
   private static final float f_30311 = 16.0F;
   private static final float f_30312 = 16.0F;
   private static final float f_30313 = 16.0F;
   private static final float f_30314 = 16.0F;
   private static final float f_30315 = 16.0F;
   private static final float f_30316 = 16.0F;
   private static final float f_30317 = 16.0F;
   private static final float f_30318 = 16.0F;
   private static final float f_30319 = 16.0F;
   private static final float f_30320 = 16.0F;
   private static final float f_30321 = 255.0F;
   private static final float f_30322 = 255.0F;
   private static final float f_30323 = 255.0F;
   private static final float f_30324 = 16.0F;
   private static final float f_30325 = 16.0F;
   private static final float f_30326 = 16.0F;
   private static final float f_30327 = 16.0F;
   private static final float f_30328 = 16.0F;
   private static final float f_30329 = 16.0F;
   private static final float f_30330 = 16.0F;
   private static final float f_30331 = 16.0F;
   private static final float f_30332 = 16.0F;
   private static final float f_30333 = 16.0F;
   private static final float f_30334 = 16.0F;
   private static final float f_30335 = 5.0E-5F;
   private static final float f_30336 = 1.0E-4F;
   private static final float f_30337 = 5.0E-5F;
   private static final float f_30338 = 1.0E-4F;
   private static final float f_30339 = 5.0E-5F;
   private static final float f_30340 = 1.0E-4F;
   private static final String f_30341 = "north";
   private static final float f_30342 = -1.0F;
   private static final String f_30343 = "south";
   private static final String f_30344 = "west";
   private static final float f_30345 = -1.0F;
   private static final String f_30346 = "east";
   private static final String f_30347 = "up";
   private static final String f_30348 = "down";
   private static final float f_30349 = -1.0F;
   private static final float f_30350 = -1.0F;
   private static final float f_30351 = -1.0F;
   private static final float f_30352 = -1.0F;
   private static final float f_30353 = -1.0F;

   private static void m_8452(
      Class_oAq4PeD1FSXoIaXR.OEWgHNBow2JGSUTl var0,
      PoseStack var1,
      VertexConsumer var2,
      int var3,
      int var4,
      boolean var5,
      int var6,
      int var7,
      float var8,
      float var9,
      float var10,
      float var11,
      boolean var12
   ) {
      float var13 = var0.f_26046 / f_30324;
      float var14 = var12 ? -var0.f_26047 / f_30325 - var0.f_26050 / f_30326 : var0.f_26047 / f_30327;
      float var15 = var0.f_26048 / f_30328;
      float var16 = var0.f_26049 / f_30329;
      float var17 = var0.f_26050 / f_30330;
      float var18 = var0.f_26051 / f_30331;
      float var19 = var0.f_26060 / f_30332;
      float var20 = var0.f_26061 / f_30333;
      float var21 = var0.f_26062 / f_30334;
      boolean var22 = var16 == 0.0F;
      boolean var23 = var17 == 0.0F;
      boolean var24 = var18 == 0.0F;
      if (var22) {
         var13 -= f_30335;
         var16 = f_30336;
      }

      if (var23) {
         var14 -= f_30337;
         var17 = f_30338;
      }

      if (var24) {
         var15 -= f_30339;
         var18 = f_30340;
      }

      if (!var0.f_26064.isEmpty()) {
         m_8457(var1, var2, var0, var13, var14, var15, var16, var17, var18, var19, var20, var21, var6, var7, var3, var4, var8, var9, var10, var11, var5);
      } else {
         m_8462(
            var1,
            var2,
            var13,
            var14,
            var15,
            var16,
            var17,
            var18,
            var19,
            var20,
            var21,
            var0.f_26052,
            var0.f_26053,
            var0.f_26049,
            var0.f_26050,
            var0.f_26051,
            var6,
            var7,
            var3,
            var4,
            var8,
            var9,
            var10,
            var11,
            var5,
            var22,
            var23,
            var24
         );
      }
   }

   private static void m_8453(
      PoseStack var0,
      VertexConsumer var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16,
      float var17,
      float var18,
      float var19,
      float var20,
      int var21,
      int var22,
      float var23,
      float var24,
      float var25,
      float var26
   ) {
      Pose var27 = var0.last();
      Vector3f var28 = var27.normal().transform(new Vector3f(var18, var19, var20)).normalize();
      m_8460(var27, var1, var2, var3, var4, var14, var15, var28, var21, var22, var23, var24, var25, var26);
      m_8460(var27, var1, var5, var6, var7, var14, var17, var28, var21, var22, var23, var24, var25, var26);
      m_8460(var27, var1, var8, var9, var10, var16, var17, var28, var21, var22, var23, var24, var25, var26);
      m_8460(var27, var1, var11, var12, var13, var16, var15, var28, var21, var22, var23, var24, var25, var26);
   }

   private Class_rlEjoVq6UqFoLGoE() {
   }

   private static void m_8454(
      Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl var0,
      PoseStack var1,
      VertexConsumer var2,
      int var3,
      int var4,
      int var5,
      int var6,
      float var7,
      float var8,
      float var9,
      float var10,
      Class_vhSU9kAizeRReaAF var11,
      float var12,
      Collection<String> var13
   ) {
      if (var13 == null || !var13.contains(var0.f_26035)) {
         var1.pushPose();
         Class_vhSU9kAizeRReaAF.rzuGHwCVMAX16TP6 var14 = var11 == null ? null : var11.m_9260(var0.f_26035, var12);
         float[] var15 = var14 == null ? null : var14.position();
         float[] var16 = var14 == null ? null : var14.rotation();
         float[] var17 = var14 == null ? null : var14.scale();
         float var18 = var15 == null ? 0.0F : -var15[0];
         float var19 = var15 == null ? 0.0F : var15[1];
         float var20 = var15 == null ? 0.0F : var15[2];
         float var21 = var0.f_26039 + (var16 == null ? 0.0F : -var16[0]);
         float var22 = var0.f_26040 + (var16 == null ? 0.0F : -var16[1]);
         float var23 = var0.f_26041 + (var16 == null ? 0.0F : var16[2]);
         var1.translate(var18 / f_30306, var19 / f_30307, var20 / f_30308);
         var1.translate(var0.f_26036 / f_30309, var0.f_26037 / f_30310, var0.f_26038 / f_30311);
         if (var23 != 0.0F) {
            var1.mulPose(Axis.ZP.rotationDegrees(var23));
         }

         if (var22 != 0.0F) {
            var1.mulPose(Axis.YP.rotationDegrees(var22));
         }

         if (var21 != 0.0F) {
            var1.mulPose(Axis.XP.rotationDegrees(var21));
         }

         if (var17 != null) {
            var1.scale(var17[0], var17[1], var17[2]);
         }

         var1.translate(-var0.f_26036 / f_30312, -var0.f_26037 / f_30313, -var0.f_26038 / f_30314);

         for (Class_oAq4PeD1FSXoIaXR.OEWgHNBow2JGSUTl var25 : var0.f_26043) {
            var1.pushPose();
            var1.translate(var25.f_26054 / f_30315, var25.f_26055 / f_30316, var25.f_26056 / f_30317);
            if (var25.f_26059 != 0.0F) {
               var1.mulPose(Axis.ZP.rotationDegrees(var25.f_26059));
            }

            if (var25.f_26058 != 0.0F) {
               var1.mulPose(Axis.YP.rotationDegrees(var25.f_26058));
            }

            if (var25.f_26057 != 0.0F) {
               var1.mulPose(Axis.XP.rotationDegrees(var25.f_26057));
            }

            var1.translate(-var25.f_26054 / f_30318, -var25.f_26055 / f_30319, -var25.f_26056 / f_30320);
            m_8452(
               var25,
               var1,
               var2,
               var3,
               var4,
               var0.f_26042 || var25.f_26063,
               var5,
               var6,
               var7 * ((var0.f_26034 >> 16 & 0xFF) / f_30321),
               var8 * ((var0.f_26034 >> 8 & 0xFF) / f_30322),
               var9 * ((var0.f_26034 & 0xFF) / f_30323),
               var10,
               false
            );
            var1.popPose();
         }

         for (Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl var27 : var0.f_26044) {
            m_8454(var27, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
         }

         var1.popPose();
      }
   }

   private static void m_8455(
      Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl var0,
      PoseStack var1,
      VertexConsumer var2,
      int var3,
      int var4,
      int var5,
      int var6,
      float var7,
      float var8,
      float var9,
      float var10
   ) {
      var1.pushPose();
      var1.translate(var0.f_26036 / f_30303, -var0.f_26037 / f_30304, var0.f_26038 / f_30305);
      if (var0.f_26041 != 0.0F) {
         var1.mulPose(Axis.ZP.rotationDegrees(var0.f_26041));
      }

      if (var0.f_26040 != 0.0F) {
         var1.mulPose(Axis.YP.rotationDegrees(var0.f_26040));
      }

      if (var0.f_26039 != 0.0F) {
         var1.mulPose(Axis.XP.rotationDegrees(var0.f_26039));
      }

      for (Class_oAq4PeD1FSXoIaXR.OEWgHNBow2JGSUTl var12 : var0.f_26043) {
         m_8452(var12, var1, var2, var3, var4, var0.f_26042 || var12.f_26063, var5, var6, var7, var8, var9, var10, true);
      }

      for (Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl var14 : var0.f_26044) {
         m_8455(var14, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
      }

      var1.popPose();
   }

   private static void m_8456(
      Class_oAq4PeD1FSXoIaXR.FGPGl1GV3jp5WJ2z var0,
      PoseStack var1,
      VertexConsumer var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16,
      float var17,
      int var18,
      int var19,
      int var20,
      int var21,
      float var22,
      float var23,
      float var24,
      float var25,
      boolean var26
   ) {
      if (var0 != null) {
         float var27 = var0.m_7714() / var18;
         float var28 = var0.m_7715() / var19;
         float var29 = (var0.m_7714() + var0.width()) / var18;
         float var30 = (var0.m_7715() + var0.height()) / var19;
         if (var26) {
            float var31 = var27;
            var27 = var29;
            var29 = var31;
         }

         m_8453(
            var1,
            var2,
            var3,
            var4,
            var5,
            var6,
            var7,
            var8,
            var9,
            var10,
            var11,
            var12,
            var13,
            var14,
            var27,
            var28,
            var29,
            var30,
            var15,
            var16,
            var17,
            var20,
            var21,
            var22,
            var23,
            var24,
            var25
         );
      }
   }

   private static void m_8457(
      PoseStack var0,
      VertexConsumer var1,
      Class_oAq4PeD1FSXoIaXR.OEWgHNBow2JGSUTl var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      int var12,
      int var13,
      int var14,
      int var15,
      float var16,
      float var17,
      float var18,
      float var19,
      boolean var20
   ) {
      float var21 = var3 - var9;
      float var22 = var4 - var10;
      float var23 = var5 - var11;
      float var24 = var3 + var6 + var9;
      float var25 = var4 + var7 + var10;
      float var26 = var5 + var8 + var11;
      m_8456(
         var2.f_26064.get(f_30341),
         var0,
         var1,
         var24,
         var25,
         var23,
         var24,
         var22,
         var23,
         var21,
         var22,
         var23,
         var21,
         var25,
         var23,
         0.0F,
         0.0F,
         f_30342,
         var12,
         var13,
         var14,
         var15,
         var16,
         var17,
         var18,
         var19,
         var20
      );
      m_8456(
         var2.f_26064.get(f_30343),
         var0,
         var1,
         var21,
         var25,
         var26,
         var21,
         var22,
         var26,
         var24,
         var22,
         var26,
         var24,
         var25,
         var26,
         0.0F,
         0.0F,
         1.0F,
         var12,
         var13,
         var14,
         var15,
         var16,
         var17,
         var18,
         var19,
         var20
      );
      m_8456(
         var2.f_26064.get(f_30344),
         var0,
         var1,
         var21,
         var25,
         var23,
         var21,
         var22,
         var23,
         var21,
         var22,
         var26,
         var21,
         var25,
         var26,
         f_30345,
         0.0F,
         0.0F,
         var12,
         var13,
         var14,
         var15,
         var16,
         var17,
         var18,
         var19,
         var20
      );
      m_8456(
         var2.f_26064.get(f_30346),
         var0,
         var1,
         var24,
         var25,
         var26,
         var24,
         var22,
         var26,
         var24,
         var22,
         var23,
         var24,
         var25,
         var23,
         1.0F,
         0.0F,
         0.0F,
         var12,
         var13,
         var14,
         var15,
         var16,
         var17,
         var18,
         var19,
         var20
      );
      m_8456(
         var2.f_26064.get(f_30347),
         var0,
         var1,
         var21,
         var25,
         var23,
         var21,
         var25,
         var26,
         var24,
         var25,
         var26,
         var24,
         var25,
         var23,
         0.0F,
         1.0F,
         0.0F,
         var12,
         var13,
         var14,
         var15,
         var16,
         var17,
         var18,
         var19,
         var20
      );
      m_8456(
         var2.f_26064.get(f_30348),
         var0,
         var1,
         var24,
         var22,
         var23,
         var24,
         var22,
         var26,
         var21,
         var22,
         var26,
         var21,
         var22,
         var23,
         0.0F,
         f_30349,
         0.0F,
         var12,
         var13,
         var14,
         var15,
         var16,
         var17,
         var18,
         var19,
         var20
      );
   }

   public static void m_8458(
      PoseStack var0,
      VertexConsumer var1,
      Class_oAq4PeD1FSXoIaXR var2,
      Class_vhSU9kAizeRReaAF var3,
      float var4,
      int var5,
      int var6,
      float var7,
      float var8,
      float var9,
      float var10
   ) {
      m_8459(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, null);
   }

   public static void m_8459(
      PoseStack var0,
      VertexConsumer var1,
      Class_oAq4PeD1FSXoIaXR var2,
      Class_vhSU9kAizeRReaAF var3,
      float var4,
      int var5,
      int var6,
      float var7,
      float var8,
      float var9,
      float var10,
      Collection<String> var11
   ) {
      if (!var2.f_26067) {
         for (Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl var15 : var2.f_26068) {
            m_8455(var15, var0, var1, var5, var6, var2.f_26065, var2.f_26066, var7, var8, var9, var10);
         }
      } else {
         for (Class_oAq4PeD1FSXoIaXR.Class_35mRGIE8PAfJVyZl var13 : var2.f_26068) {
            m_8454(var13, var0, var1, var5, var6, var2.f_26065, var2.f_26066, var7, var8, var9, var10, var3, var4, var11);
         }
      }
   }

   private static void m_8460(
      Pose var0,
      VertexConsumer var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      Vector3f var7,
      int var8,
      int var9,
      float var10,
      float var11,
      float var12,
      float var13
   ) {
      Vector3f var14 = var0.pose().transformPosition(new Vector3f(var2, var3, var4));
      var1.addVertex(var14.x, var14.y, var14.z)
         .setColor(var10, var11, var12, var13)
         .setUv(var5, var6)
         .setOverlay(var9)
         .setLight(var8)
         .setNormal(var7.x, var7.y, var7.z);
   }

   public static void m_8461(
      PoseStack var0, VertexConsumer var1, Class_oAq4PeD1FSXoIaXR var2, int var3, int var4, float var5, float var6, float var7, float var8
   ) {
      m_8458(var0, var1, var2, null, 0.0F, var3, var4, var5, var6, var7, var8);
   }

   private static void m_8462(
      PoseStack var0,
      VertexConsumer var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      int var16,
      int var17,
      int var18,
      int var19,
      float var20,
      float var21,
      float var22,
      float var23,
      boolean var24,
      boolean var25,
      boolean var26,
      boolean var27
   ) {
      float var28 = 1.0F / var16;
      float var29 = 1.0F / var17;
      float var30 = var2 - var8;
      float var31 = var3 - var9;
      float var32 = var4 - var10;
      float var33 = var2 + var5 + var8;
      float var34 = var3 + var6 + var9;
      float var35 = var4 + var7 + var10;
      float var36 = (var11 + var15) * var28;
      float var37 = (var11 + var15 + var13) * var28;
      float var38 = var12 * var29;
      float var39 = (var12 + var15) * var29;
      float var40 = (var11 + var15 + var13) * var28;
      float var41 = (var11 + var15 + var13 * 2.0F) * var28;
      float var42 = var12 * var29;
      float var43 = (var12 + var15) * var29;
      float var44 = (var11 + var15) * var28;
      float var45 = (var11 + var15 + var13) * var28;
      float var46 = (var12 + var15) * var29;
      float var47 = (var12 + var15 + var14) * var29;
      float var48 = (var11 + var15 + var13 + var15) * var28;
      float var49 = (var11 + var15 + var13 + var15 + var13) * var28;
      float var50 = (var12 + var15) * var29;
      float var51 = (var12 + var15 + var14) * var29;
      float var52 = (var11 + var15 + var13) * var28;
      float var53 = (var11 + var15 + var13 + var15) * var28;
      float var54 = (var12 + var15) * var29;
      float var55 = (var12 + var15 + var14) * var29;
      float var56 = var11 * var28;
      float var57 = (var11 + var15) * var28;
      float var58 = (var12 + var15) * var29;
      float var59 = (var12 + var15 + var14) * var29;
      if (var24) {
         float var60 = var56;
         var56 = var57;
         var57 = var60;
         var60 = var52;
         var52 = var53;
         var53 = var60;
         var60 = var44;
         var44 = var45;
         var45 = var60;
         var60 = var48;
         var48 = var49;
         var49 = var60;
         var60 = var36;
         var36 = var37;
         var37 = var60;
         var60 = var40;
         var40 = var41;
         var41 = var60;
      }

      if (var26) {
         m_8453(
            var0,
            var1,
            var30,
            var34,
            var35,
            var30,
            var34,
            var32,
            var33,
            var34,
            var32,
            var33,
            var34,
            var35,
            var36,
            var38,
            var37,
            var39,
            0.0F,
            1.0F,
            0.0F,
            var18,
            var19,
            var20,
            var21,
            var22,
            var23
         );
         m_8453(
            var0,
            var1,
            var30,
            var31,
            var35,
            var30,
            var31,
            var32,
            var33,
            var31,
            var32,
            var33,
            var31,
            var35,
            var36,
            var38,
            var37,
            var39,
            0.0F,
            f_30350,
            0.0F,
            var18,
            var19,
            var20,
            var21,
            var22,
            var23
         );
      } else {
         m_8453(
            var0,
            var1,
            var30,
            var34,
            var32,
            var30,
            var34,
            var35,
            var33,
            var34,
            var35,
            var33,
            var34,
            var32,
            var40,
            var42,
            var41,
            var43,
            0.0F,
            1.0F,
            0.0F,
            var18,
            var19,
            var20,
            var21,
            var22,
            var23
         );
         m_8453(
            var0,
            var1,
            var30,
            var31,
            var35,
            var30,
            var31,
            var32,
            var33,
            var31,
            var32,
            var33,
            var31,
            var35,
            var36,
            var38,
            var37,
            var39,
            0.0F,
            f_30351,
            0.0F,
            var18,
            var19,
            var20,
            var21,
            var22,
            var23
         );
      }

      m_8453(
         var0,
         var1,
         var30,
         var31,
         var32,
         var30,
         var34,
         var32,
         var33,
         var34,
         var32,
         var33,
         var31,
         var32,
         var44,
         var46,
         var45,
         var47,
         0.0F,
         0.0F,
         f_30352,
         var18,
         var19,
         var20,
         var21,
         var22,
         var23
      );
      if (var27) {
         m_8453(
            var0,
            var1,
            var30,
            var31,
            var35,
            var30,
            var34,
            var35,
            var33,
            var34,
            var35,
            var33,
            var31,
            var35,
            var44,
            var46,
            var45,
            var47,
            0.0F,
            0.0F,
            1.0F,
            var18,
            var19,
            var20,
            var21,
            var22,
            var23
         );
      } else {
         m_8453(
            var0,
            var1,
            var33,
            var31,
            var35,
            var33,
            var34,
            var35,
            var30,
            var34,
            var35,
            var30,
            var31,
            var35,
            var48,
            var50,
            var49,
            var51,
            0.0F,
            0.0F,
            1.0F,
            var18,
            var19,
            var20,
            var21,
            var22,
            var23
         );
      }

      m_8453(
         var0,
         var1,
         var30,
         var31,
         var35,
         var30,
         var34,
         var35,
         var30,
         var34,
         var32,
         var30,
         var31,
         var32,
         var56,
         var58,
         var57,
         var59,
         f_30353,
         0.0F,
         0.0F,
         var18,
         var19,
         var20,
         var21,
         var22,
         var23
      );
      if (var25) {
         m_8453(
            var0,
            var1,
            var33,
            var31,
            var35,
            var33,
            var34,
            var35,
            var33,
            var34,
            var32,
            var33,
            var31,
            var32,
            var56,
            var58,
            var57,
            var59,
            1.0F,
            0.0F,
            0.0F,
            var18,
            var19,
            var20,
            var21,
            var22,
            var23
         );
      } else {
         m_8453(
            var0,
            var1,
            var33,
            var31,
            var32,
            var33,
            var34,
            var32,
            var33,
            var34,
            var35,
            var33,
            var31,
            var35,
            var52,
            var54,
            var53,
            var55,
            1.0F,
            0.0F,
            0.0F,
            var18,
            var19,
            var20,
            var21,
            var22,
            var23
         );
      }
   }
}
