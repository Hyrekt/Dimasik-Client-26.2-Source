package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.util.Mth;
import org.joml.Matrix4f;

public class Class_gDV1EanNF5x4bJxz {
   @Class_FUILRKIQ6wtWry59("PI")
   public double f_20858;
   private static final double f_20859 = (float) Math.PI;

   @Class_FUILRKIQ6wtWry59("rotateY")
   public void m_6761(PoseStack var1, double var2) {
      var1.mulPose(Axis.YP.rotationDegrees((float)var2));
   }

   @Class_FUILRKIQ6wtWry59("clamp")
   public double m_6762(double var1, double var3, double var5) {
      return Math.clamp(var1, var3, var5);
   }

   @Class_FUILRKIQ6wtWry59("pow")
   public double m_6763(double var1, double var3) {
      return Math.pow(var1, var3);
   }

   @Class_FUILRKIQ6wtWry59("cos")
   public double m_6764(double var1) {
      return Math.cos(var1);
   }

   @Class_FUILRKIQ6wtWry59("abs")
   public double m_6765(double var1) {
      return Math.abs(var1);
   }

   @Class_FUILRKIQ6wtWry59("moveX")
   public void m_6766(PoseStack var1, double var2) {
      var1.translate(var2, 0.0, 0.0);
   }

   @Class_FUILRKIQ6wtWry59("push")
   public void m_6767(PoseStack var1) {
      var1.pushPose();
   }

   @Class_FUILRKIQ6wtWry59("moveY")
   public void m_6768(PoseStack var1, double var2) {
      var1.translate(0.0, var2, 0.0);
   }

   @Class_FUILRKIQ6wtWry59
   public double m_6769(double var1) {
      return Math.round(var1);
   }

   @Class_FUILRKIQ6wtWry59("moveZ")
   public void m_6770(PoseStack var1, double var2) {
      var1.translate(0.0, 0.0, var2);
   }

   @Class_FUILRKIQ6wtWry59
   public double m_6771(double var1) {
      return Math.ceil(var1);
   }

   @Class_FUILRKIQ6wtWry59("rotateZ")
   public void m_6772(PoseStack var1, double var2, double var4, double var6, double var8) {
      var1.rotateAround(Axis.ZP.rotationDegrees((float)var2), (float)var4, (float)var6, (float)var8);
   }

   @Class_FUILRKIQ6wtWry59("translate")
   public void m_6773(PoseStack var1, double var2, double var4, double var6) {
      var1.translate(var2, var4, var6);
   }

   @Class_FUILRKIQ6wtWry59("shear")
   public void m_6774(PoseStack var1, double var2, double var4, double var6) {
      Matrix4f var8 = new Matrix4f(
         1.0F, (float)var2, (float)var2, 0.0F, (float)var4, 1.0F, (float)var4, 0.0F, (float)var6, (float)var6, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F
      );
      var1.last().pose().mul(var8);
   }

   @Class_FUILRKIQ6wtWry59("pop")
   public void m_6775(PoseStack var1) {
      var1.popPose();
   }

   @Class_FUILRKIQ6wtWry59
   public double m_6776(double var1) {
      return Math.floor(var1);
   }

   @Class_FUILRKIQ6wtWry59("rotateX")
   public void m_6777(PoseStack var1, double var2) {
      var1.mulPose(Axis.XP.rotationDegrees((float)var2));
   }

   @Class_FUILRKIQ6wtWry59("scale")
   public void m_6778(PoseStack var1, double var2, double var4, double var6) {
      var1.scale((float)var2, (float)var4, (float)var6);
   }

   public Class_gDV1EanNF5x4bJxz() {
      this.f_20858 = f_20859;
   }

   @Class_FUILRKIQ6wtWry59("sin")
   public double m_6779(double var1) {
      return Math.sin(var1);
   }

   @Class_FUILRKIQ6wtWry59("rotateY")
   public void m_6780(PoseStack var1, double var2, double var4, double var6, double var8) {
      var1.rotateAround(Axis.YP.rotationDegrees((float)var2), (float)var4, (float)var6, (float)var8);
   }

   @Class_FUILRKIQ6wtWry59("rotateX")
   public void m_6781(PoseStack var1, double var2, double var4, double var6, double var8) {
      var1.rotateAround(Axis.XP.rotationDegrees((float)var2), (float)var4, (float)var6, (float)var8);
   }

   @Class_FUILRKIQ6wtWry59("lerp")
   public double m_6782(double var1, double var3, double var5) {
      return Mth.lerp(var1, var3, var5);
   }

   @Class_FUILRKIQ6wtWry59("rotateZ")
   public void m_6783(PoseStack var1, double var2) {
      var1.mulPose(Axis.ZP.rotationDegrees((float)var2));
   }
}
