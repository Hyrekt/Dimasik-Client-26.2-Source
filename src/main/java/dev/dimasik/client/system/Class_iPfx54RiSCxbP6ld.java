package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack.Pose;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public final class Class_iPfx54RiSCxbP6ld extends Class_N3SSqGnetdyAyMUH {
   private static final int f_24467 = 18;
   private static final float[][] f_24468 = new float[][]{
      {Class_iPfx54RiSCxbP6ld.f_24490, Class_iPfx54RiSCxbP6ld.f_24491, Class_iPfx54RiSCxbP6ld.f_24492},
      {Class_iPfx54RiSCxbP6ld.f_24493, Class_iPfx54RiSCxbP6ld.f_24494, Class_iPfx54RiSCxbP6ld.f_24495},
      {Class_iPfx54RiSCxbP6ld.f_24496, Class_iPfx54RiSCxbP6ld.f_24497, Class_iPfx54RiSCxbP6ld.f_24498},
      {Class_iPfx54RiSCxbP6ld.f_24499, Class_iPfx54RiSCxbP6ld.f_24500, Class_iPfx54RiSCxbP6ld.f_24501},
      {Class_iPfx54RiSCxbP6ld.f_24502, Class_iPfx54RiSCxbP6ld.f_24503, Class_iPfx54RiSCxbP6ld.f_24504},
      {Class_iPfx54RiSCxbP6ld.f_24505, Class_iPfx54RiSCxbP6ld.f_24506, Class_iPfx54RiSCxbP6ld.f_24507},
      {Class_iPfx54RiSCxbP6ld.f_24508, Class_iPfx54RiSCxbP6ld.f_24509, Class_iPfx54RiSCxbP6ld.f_24510},
      {Class_iPfx54RiSCxbP6ld.f_24511, Class_iPfx54RiSCxbP6ld.f_24512, Class_iPfx54RiSCxbP6ld.f_24513},
      {Class_iPfx54RiSCxbP6ld.f_24514, Class_iPfx54RiSCxbP6ld.f_24515, Class_iPfx54RiSCxbP6ld.f_24516},
      {Class_iPfx54RiSCxbP6ld.f_24517, Class_iPfx54RiSCxbP6ld.f_24518, Class_iPfx54RiSCxbP6ld.f_24519},
      {Class_iPfx54RiSCxbP6ld.f_24520, Class_iPfx54RiSCxbP6ld.f_24521, Class_iPfx54RiSCxbP6ld.f_24522},
      {Class_iPfx54RiSCxbP6ld.f_24523, Class_iPfx54RiSCxbP6ld.f_24524, Class_iPfx54RiSCxbP6ld.f_24525}
   };
   private static final float[][] f_24469 = m_7292(f_24468);
   private static final float[][] f_24470 = new float[][]{
      {Class_iPfx54RiSCxbP6ld.f_24526, Class_iPfx54RiSCxbP6ld.f_24527, Class_iPfx54RiSCxbP6ld.f_24528},
      {Class_iPfx54RiSCxbP6ld.f_24529, Class_iPfx54RiSCxbP6ld.f_24530, Class_iPfx54RiSCxbP6ld.f_24531},
      {Class_iPfx54RiSCxbP6ld.f_24532, Class_iPfx54RiSCxbP6ld.f_24533, Class_iPfx54RiSCxbP6ld.f_24534},
      {Class_iPfx54RiSCxbP6ld.f_24535, Class_iPfx54RiSCxbP6ld.f_24536, Class_iPfx54RiSCxbP6ld.f_24537},
      {Class_iPfx54RiSCxbP6ld.f_24538, Class_iPfx54RiSCxbP6ld.f_24539, Class_iPfx54RiSCxbP6ld.f_24540},
      {Class_iPfx54RiSCxbP6ld.f_24541, Class_iPfx54RiSCxbP6ld.f_24542, Class_iPfx54RiSCxbP6ld.f_24543},
      {Class_iPfx54RiSCxbP6ld.f_24544, Class_iPfx54RiSCxbP6ld.f_24545, Class_iPfx54RiSCxbP6ld.f_24546},
      {Class_iPfx54RiSCxbP6ld.f_24547, Class_iPfx54RiSCxbP6ld.f_24548, Class_iPfx54RiSCxbP6ld.f_24549},
      {Class_iPfx54RiSCxbP6ld.f_24550, Class_iPfx54RiSCxbP6ld.f_24551, Class_iPfx54RiSCxbP6ld.f_24552},
      {Class_iPfx54RiSCxbP6ld.f_24553, Class_iPfx54RiSCxbP6ld.f_24554, Class_iPfx54RiSCxbP6ld.f_24555},
      {Class_iPfx54RiSCxbP6ld.f_24556, Class_iPfx54RiSCxbP6ld.f_24557, Class_iPfx54RiSCxbP6ld.f_24558},
      {Class_iPfx54RiSCxbP6ld.f_24559, Class_iPfx54RiSCxbP6ld.f_24560, Class_iPfx54RiSCxbP6ld.f_24561}
   };
   private static final float[][] f_24471 = m_7292(f_24470);
   private static final float f_24472 = 1.0E9F;
   private static final float f_24473 = 1.6F;
   private static final float f_24474 = 3.2F;
   private static final float f_24475 = 4.8F;
   private static final float f_24476 = 0.215F;
   private static final float f_24477 = -0.025F;
   private static final float f_24478 = 0.38F;
   private static final float f_24479 = 0.018F;
   private static final float f_24480 = 0.035F;
   private static final float f_24481 = 0.34906587F;
   private static final float f_24482 = 0.34906587F;
   private static final float f_24483 = 18.0F;
   private static final float f_24484 = 18.0F;
   private static final float f_24485 = 18.0F;
   private static final float f_24486 = 18.0F;
   private static final float f_24487 = 0.92F;
   private static final float f_24488 = 0.018F;
   private static final float f_24489 = 0.092F;
   private static final float f_24490 = 0.08438F;
   private static final float f_24491 = 0.1F;
   private static final float f_24492 = 0.0125F;
   private static final float f_24493 = 0.14911F;
   private static final float f_24494 = 0.07842F;
   private static final float f_24495 = 0.06928F;
   private static final float f_24496 = 0.22179F;
   private static final float f_24497 = 0.04038F;
   private static final float f_24498 = 0.11723F;
   private static final float f_24499 = 0.30059F;
   private static final float f_24500 = -0.01158F;
   private static final float f_24501 = 0.15561F;
   private static final float f_24502 = 0.38368F;
   private static final float f_24503 = -0.07488F;
   private static final float f_24504 = 0.18368F;
   private static final float f_24505 = 0.46925F;
   private static final float f_24506 = -0.14701F;
   private static final float f_24507 = 0.20068F;
   private static final float f_24508 = 0.55547F;
   private static final float f_24509 = -0.22539F;
   private static final float f_24510 = 0.20586F;
   private static final float f_24511 = 0.64052F;
   private static final float f_24512 = -0.30749F;
   private static final float f_24513 = 0.19848F;
   private static final float f_24514 = 0.72257F;
   private static final float f_24515 = -0.39074F;
   private static final float f_24516 = 0.17778F;
   private static final float f_24517 = 0.79981F;
   private static final float f_24518 = -0.47261F;
   private static final float f_24519 = 0.14302F;
   private static final float f_24520 = 0.8704F;
   private static final float f_24521 = -0.55054F;
   private static final float f_24522 = 0.09344F;
   private static final float f_24523 = 0.93253F;
   private static final float f_24524 = -0.62198F;
   private static final float f_24525 = 0.02831F;
   private static final float f_24526 = 0.07813F;
   private static final float f_24527 = 0.31563F;
   private static final float f_24528 = 0.0125F;
   private static final float f_24529 = 0.14968F;
   private static final float f_24530 = 0.32694F;
   private static final float f_24531 = 0.07296F;
   private static final float f_24532 = 0.22736F;
   private static final float f_24533 = 0.35176F;
   private static final float f_24534 = 0.12276F;
   private static final float f_24535 = 0.30962F;
   private static final float f_24536 = 0.38809F;
   private static final float f_24537 = 0.16138F;
   private static final float f_24538 = 0.39491F;
   private static final float f_24539 = 0.43391F;
   private static final float f_24540 = 0.18831F;
   private static final float f_24541 = 0.48167F;
   private static final float f_24542 = 0.48724F;
   private static final float f_24543 = 0.20305F;
   private static final float f_24544 = 0.56836F;
   private static final float f_24545 = 0.54609F;
   private static final float f_24546 = 0.20508F;
   private static final float f_24547 = 0.65342F;
   private static final float f_24548 = 0.60846F;
   private static final float f_24549 = 0.19389F;
   private static final float f_24550 = 0.7353F;
   private static final float f_24551 = 0.67234F;
   private static final float f_24552 = 0.16898F;
   private static final float f_24553 = 0.81245F;
   private static final float f_24554 = 0.73574F;
   private static final float f_24555 = 0.12983F;
   private static final float f_24556 = 0.88332F;
   private static final float f_24557 = 0.79668F;
   private static final float f_24558 = 0.07594F;
   private static final float f_24559 = 0.94635F;
   private static final float f_24560 = 0.85313F;
   private static final float f_24561 = 0.00679F;

   private static float[][] m_7292(float[][] var0) {
      float[][] var1 = new float[var0.length][3];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2][0] = -var0[var2][0];
         var1[var2][1] = var0[var2][1];
         var1[var2][2] = var0[var2][2];
      }

      return var1;
   }

   private Class_iPfx54RiSCxbP6ld.pqEMMLMxCjzxG6Dc m_7293(Class_iPfx54RiSCxbP6ld.qY7EKH93mNkBpszF[] var1, int var2) {
      Class_iPfx54RiSCxbP6ld.qY7EKH93mNkBpszF var3 = var1[Math.max(0, var2 - 1)];
      Class_iPfx54RiSCxbP6ld.qY7EKH93mNkBpszF var4 = var1[Math.min(var1.length - 1, var2 + 1)];
      Vector3f var5 = new Vector3f(var4.x - var3.x, var4.y - var3.y, var4.z - var3.z).normalize();
      Vector3f var6 = Math.abs(var5.y) > f_24487 ? new Vector3f(1.0F, 0.0F, 0.0F) : new Vector3f(0.0F, 1.0F, 0.0F);
      Vector3f var7 = new Vector3f(var5).cross(var6).normalize();
      Vector3f var8 = new Vector3f(var7).cross(var5).normalize();
      return new Class_iPfx54RiSCxbP6ld.pqEMMLMxCjzxG6Dc(var7, var8);
   }

   private void m_7294(
      Pose var1,
      VertexConsumer var2,
      Class_iPfx54RiSCxbP6ld.qY7EKH93mNkBpszF var3,
      Class_iPfx54RiSCxbP6ld.pqEMMLMxCjzxG6Dc var4,
      float var5,
      float var6,
      float var7,
      float var8,
      int var9,
      int var10,
      float var11,
      float var12,
      float var13,
      float var14
   ) {
      float var15 = (float)Math.cos(var6);
      float var16 = (float)Math.sin(var6);
      Vector3f var17 = new Vector3f(var4.side).mul(var15).add(new Vector3f(var4.up).mul(var16)).normalize();
      Vector3f var18 = new Vector3f(var17).mul(var5).add(var3.x, var3.y, var3.z);
      Matrix4f var19 = var1.pose();
      Matrix3f var20 = var1.normal();
      Vector3f var21 = var19.transformPosition(var18);
      Vector3f var22 = var20.transform(var17).normalize();
      var2.addVertex(var21.x, var21.y, var21.z)
         .setColor(var11, var12, var13, var14)
         .setUv(var7 * 2.0F, var8)
         .setOverlay(var10)
         .setLight(var9)
         .setNormal(var22.x, var22.y, var22.z);
   }

   @Override
   public void m_2482(
      Class_WzqIkwE6nF1UkDXB var1, float var2, PoseStack var3, VertexConsumer var4, int var5, int var6, float var7, float var8, float var9, float var10
   ) {
      float var11 = (float)System.nanoTime() / f_24472;
      this.m_7295(var3.last(), var4, f_24468, var11, 0.0F, var5, var6, var7, var8, var9, var10);
      this.m_7295(var3.last(), var4, f_24469, var11, f_24473, var5, var6, var7, var8, var9, var10);
      this.m_7295(var3.last(), var4, f_24470, var11, f_24474, var5, var6, var7, var8, var9, var10);
      this.m_7295(var3.last(), var4, f_24471, var11, f_24475, var5, var6, var7, var8, var9, var10);
   }

   private void m_7295(
      Pose var1, VertexConsumer var2, float[][] var3, float var4, float var5, int var6, int var7, float var8, float var9, float var10, float var11
   ) {
      Class_iPfx54RiSCxbP6ld.qY7EKH93mNkBpszF[] var12 = new Class_iPfx54RiSCxbP6ld.qY7EKH93mNkBpszF[var3.length + 1];
      var12[0] = new Class_iPfx54RiSCxbP6ld.qY7EKH93mNkBpszF(0.0F, f_24476, f_24477);

      for (int var13 = 0; var13 < var3.length; var13++) {
         float var14 = (var13 + 1.0F) / var3.length;
         float var15 = (float)Math.sin(var4 * 2.0F + var5 + var13 * f_24478) * var14;
         var12[var13 + 1] = new Class_iPfx54RiSCxbP6ld.qY7EKH93mNkBpszF(var3[var13][0], var3[var13][1] + var15 * f_24479, var3[var13][2] + var15 * f_24480);
      }

      for (int var25 = 0; var25 < var12.length - 1; var25++) {
         Class_iPfx54RiSCxbP6ld.qY7EKH93mNkBpszF var26 = var12[var25];
         Class_iPfx54RiSCxbP6ld.qY7EKH93mNkBpszF var27 = var12[var25 + 1];
         Class_iPfx54RiSCxbP6ld.pqEMMLMxCjzxG6Dc var16 = this.m_7293(var12, var25);
         Class_iPfx54RiSCxbP6ld.pqEMMLMxCjzxG6Dc var17 = this.m_7293(var12, var25 + 1);
         float var18 = (float)var25 / (var12.length - 1);
         float var19 = (var25 + 1.0F) / (var12.length - 1);
         float var20 = this.m_7296(var18);
         float var21 = this.m_7296(var19);

         for (int var22 = 0; var22 < 18; var22++) {
            float var23 = var22 * f_24481;
            float var24 = (var22 + 1) * f_24482;
            this.m_7294(var1, var2, var26, var16, var20, var23, var18, var22 / f_24483, var6, var7, var8, var9, var10, var11);
            this.m_7294(var1, var2, var26, var16, var20, var24, var18, (var22 + 1.0F) / f_24484, var6, var7, var8, var9, var10, var11);
            this.m_7294(var1, var2, var27, var17, var21, var24, var19, (var22 + 1.0F) / f_24485, var6, var7, var8, var9, var10, var11);
            this.m_7294(var1, var2, var27, var17, var21, var23, var19, var22 / f_24486, var6, var7, var8, var9, var10, var11);
         }
      }
   }

   private float m_7296(float var1) {
      float var2 = 1.0F - var1 * var1;
      return f_24488 + f_24489 * var2;
   }

   private record pqEMMLMxCjzxG6Dc(Vector3f side, Vector3f up) {
      public Vector3f m_7291() {
         return this.up;
      }
   }

   private record qY7EKH93mNkBpszF(float x, float y, float z) {
   }
}
