package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;

public final class Class_b7DtWeeAjt1vCmtH implements VertexConsumer {
   private float f_17596 = Float.POSITIVE_INFINITY;
   private float f_17597 = Float.POSITIVE_INFINITY;
   private float f_17598 = Float.POSITIVE_INFINITY;
   private float f_17599 = Float.NEGATIVE_INFINITY;
   private float f_17600 = Float.NEGATIVE_INFINITY;
   private float f_17601 = Float.NEGATIVE_INFINITY;
   private static final float f_17602 = -1.0F;
   private static final float f_17603 = 180.0F;
   private static final float f_17604 = 1.0E-4F;
   private static final float f_17605 = 1.0E-4F;
   private static final float f_17606 = 0.5F;
   private static final float f_17607 = 0.5F;
   private static final float f_17608 = 0.5F;

   public VertexConsumer setColor(int var1, int var2, int var3, int var4) {
      return this;
   }

   public static void orient(PoseStack var0, float var1, float var2, boolean var3) {
      var0.scale(1.0F, 1.0F, f_17602);
      var0.mulPose(Axis.XP.rotationDegrees(var1));
      var0.mulPose(Axis.YP.rotationDegrees(var2));
      if (var3) {
         var0.mulPose(Axis.ZP.rotationDegrees(f_17603));
      }
   }

   public VertexConsumer setLineWidth(float var1) {
      return this;
   }

   public VertexConsumer setUv2(int var1, int var2) {
      return this;
   }

   public void fit(PoseStack var1, float var2, float var3, float var4, float var5) {
      if (!Float.isFinite(this.f_17596)) {
         var1.translate(var2, var3, 0.0F);
      } else {
         float var6 = Math.min(var4 / Math.max(f_17604, this.f_17599 - this.f_17596), var5 / Math.max(f_17605, this.f_17600 - this.f_17597));
         var1.translate(
            var2 - (this.f_17596 + this.f_17599) * f_17606 * var6,
            var3 - (this.f_17597 + this.f_17600) * f_17607 * var6,
            -(this.f_17598 + this.f_17601) * f_17608 * var6
         );
         var1.scale(var6, var6, var6);
      }
   }

   public VertexConsumer setUv1(int var1, int var2) {
      return this;
   }

   public VertexConsumer setNormal(float var1, float var2, float var3) {
      return this;
   }

   public VertexConsumer setUv(float var1, float var2) {
      return this;
   }

   public VertexConsumer addVertex(float var1, float var2, float var3) {
      if (Float.isFinite(var1) && Float.isFinite(var2) && Float.isFinite(var3)) {
         this.f_17596 = Math.min(this.f_17596, var1);
         this.f_17597 = Math.min(this.f_17597, var2);
         this.f_17598 = Math.min(this.f_17598, var3);
         this.f_17599 = Math.max(this.f_17599, var1);
         this.f_17600 = Math.max(this.f_17600, var2);
         this.f_17601 = Math.max(this.f_17601, var3);
      }

      return this;
   }

   public VertexConsumer setColor(int var1) {
      return this;
   }
}
