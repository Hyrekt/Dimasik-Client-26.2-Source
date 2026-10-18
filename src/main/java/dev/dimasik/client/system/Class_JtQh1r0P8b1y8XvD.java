package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack.Pose;
import com.mojang.math.Axis;
import java.util.ArrayList;
import java.util.List;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public class Class_JtQh1r0P8b1y8XvD {
   public float f_10055;
   public float f_10056;
   public float f_10057;
   public float f_10058;
   public float f_10059;
   public float f_10060;
   public boolean f_10061 = true;
   protected final List<Class_JtQh1r0P8b1y8XvD> f_10062 = new ArrayList<>();
   protected final List<Class_JtQh1r0P8b1y8XvD.RvlMuAZzisl8wk9W> f_10063 = new ArrayList<>();
   protected final int f_10064;
   protected final int f_10065;
   protected final int f_10066;
   protected final int f_10067;
   private static final float f_10068 = -1.0F;
   private static final float f_10069 = -1.0F;
   private static final float f_10070 = -1.0F;
   private static final float f_10071 = 16.0F;
   private static final float f_10072 = 16.0F;
   private static final float f_10073 = 16.0F;

   public void m_3357(PoseStack var1) {
      var1.translate(this.f_10055 / f_10071, this.f_10056 / f_10072, this.f_10057 / f_10073);
      if (this.f_10060 != 0.0F) {
         var1.mulPose(Axis.ZP.rotation(this.f_10060));
      }

      if (this.f_10059 != 0.0F) {
         var1.mulPose(Axis.YP.rotation(this.f_10059));
      }

      if (this.f_10058 != 0.0F) {
         var1.mulPose(Axis.XP.rotation(this.f_10058));
      }
   }

   public void m_3358(PoseStack var1, VertexConsumer var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      if (this.f_10061) {
         var1.pushPose();
         this.m_3357(var1);
         Pose var9 = var1.last();

         for (Class_JtQh1r0P8b1y8XvD.RvlMuAZzisl8wk9W var11 : this.f_10063) {
            var11.m_3354(var9, var2, var3, var4, var5, var6, var7, var8);
         }

         for (Class_JtQh1r0P8b1y8XvD var13 : this.f_10062) {
            var13.m_3358(var1, var2, var3, var4, var5, var6, var7, var8);
         }

         var1.popPose();
      }
   }

   public void m_3359(float var1, float var2, float var3, int var4, int var5, int var6) {
      float var7 = var1 + var4;
      float var8 = var2 + var5;
      float var9 = var3 + var6;
      float[] var10 = new float[]{var1, var2, var3};
      float[] var11 = new float[]{var7, var2, var3};
      float[] var12 = new float[]{var7, var8, var3};
      float[] var13 = new float[]{var1, var8, var3};
      float[] var14 = new float[]{var1, var2, var9};
      float[] var15 = new float[]{var7, var2, var9};
      float[] var16 = new float[]{var7, var8, var9};
      float[] var17 = new float[]{var1, var8, var9};
      float var18 = this.f_10066;
      float var19 = this.f_10067;
      float var20 = var18;
      float var21 = var18 + var6;
      float var22 = var18 + var6 + var4;
      float var23 = var18 + var6 + var4 + var4;
      float var24 = var18 + var6 + var4 + var6;
      float var25 = var18 + var6 + var4 + var6 + var4;
      float var26 = var19;
      float var27 = var19 + var6;
      float var28 = var19 + var6 + var5;
      this.m_3362(new float[][]{var15, var14, var10, var11}, var21, var26, var22, var27, new Vector3f(0.0F, f_10068, 0.0F));
      this.m_3362(new float[][]{var12, var13, var17, var16}, var22, var27, var23, var26, new Vector3f(0.0F, 1.0F, 0.0F));
      this.m_3362(new float[][]{var10, var14, var17, var13}, var20, var27, var21, var28, new Vector3f(f_10069, 0.0F, 0.0F));
      this.m_3362(new float[][]{var11, var10, var13, var12}, var21, var27, var22, var28, new Vector3f(0.0F, 0.0F, f_10070));
      this.m_3362(new float[][]{var15, var11, var12, var16}, var22, var27, var24, var28, new Vector3f(1.0F, 0.0F, 0.0F));
      this.m_3362(new float[][]{var14, var15, var16, var17}, var24, var27, var25, var28, new Vector3f(0.0F, 0.0F, 1.0F));
   }

   public void m_3360(Class_JtQh1r0P8b1y8XvD var1) {
      this.f_10062.add(var1);
   }

   public Class_JtQh1r0P8b1y8XvD(int var1, int var2, int var3, int var4) {
      this.f_10064 = var1;
      this.f_10065 = var2;
      this.f_10066 = var3;
      this.f_10067 = var4;
   }

   public void m_3361(float var1, float var2, float var3) {
      this.f_10055 = var1;
      this.f_10056 = var2;
      this.f_10057 = var3;
   }

   protected void m_3362(float[][] var1, float var2, float var3, float var4, float var5, Vector3f var6) {
      Class_JtQh1r0P8b1y8XvD.bO4FEbIdTlRKrLdL[] var7 = new Class_JtQh1r0P8b1y8XvD.bO4FEbIdTlRKrLdL[]{
         new Class_JtQh1r0P8b1y8XvD.bO4FEbIdTlRKrLdL(var1[0][0], var1[0][1], var1[0][2], var4 / this.f_10064, var3 / this.f_10065),
         new Class_JtQh1r0P8b1y8XvD.bO4FEbIdTlRKrLdL(var1[1][0], var1[1][1], var1[1][2], var2 / this.f_10064, var3 / this.f_10065),
         new Class_JtQh1r0P8b1y8XvD.bO4FEbIdTlRKrLdL(var1[2][0], var1[2][1], var1[2][2], var2 / this.f_10064, var5 / this.f_10065),
         new Class_JtQh1r0P8b1y8XvD.bO4FEbIdTlRKrLdL(var1[3][0], var1[3][1], var1[3][2], var4 / this.f_10064, var5 / this.f_10065)
      };
      this.f_10063.add(new Class_JtQh1r0P8b1y8XvD.RvlMuAZzisl8wk9W(var7, var6));
   }

   protected static final class RvlMuAZzisl8wk9W {
      public final Class_JtQh1r0P8b1y8XvD.bO4FEbIdTlRKrLdL[] f_10050;
      public final Vector3f f_10051;
      public static final float f_10052 = 16.0F;
      public static final float f_10053 = 16.0F;
      public static final float f_10054 = 16.0F;

      public RvlMuAZzisl8wk9W(Class_JtQh1r0P8b1y8XvD.bO4FEbIdTlRKrLdL[] var1, Vector3f var2) {
         this.f_10050 = var1;
         this.f_10051 = var2;
      }

      public void m_3354(Pose var1, VertexConsumer var2, int var3, int var4, float var5, float var6, float var7, float var8) {
         Matrix4f var9 = var1.pose();
         Matrix3f var10 = var1.normal();
         Vector3f var11 = var10.transform(new Vector3f(this.f_10051.x, this.f_10051.y, this.f_10051.z));

         for (Class_JtQh1r0P8b1y8XvD.bO4FEbIdTlRKrLdL var15 : this.f_10050) {
            Vector3f var16 = var9.transformPosition(new Vector3f(var15.x() / f_10052, var15.y() / f_10053, var15.z() / f_10054));
            var2.addVertex(var16.x, var16.y, var16.z)
               .setColor(var5, var6, var7, var8)
               .setUv(var15.m_3356(), var15.m_3355())
               .setOverlay(var4)
               .setLight(var3)
               .setNormal(var11.x, var11.y, var11.z);
         }
      }
   }

   protected record bO4FEbIdTlRKrLdL(float x, float y, float z, float u, float v) {
      public float m_3355() {
         return this.v;
      }

      public float m_3356() {
         return this.u;
      }
   }
}
