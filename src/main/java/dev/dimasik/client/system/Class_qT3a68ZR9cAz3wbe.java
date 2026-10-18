package dev.dimasik.client.system;

import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;

public final class Class_qT3a68ZR9cAz3wbe {
   private int f_29897;
   private int f_29898;
   private int f_29899;
   private int f_29900;
   private Vec3 f_29901;
   private Vec3 f_29902;
   private Vec3 f_29903;
   private float f_29904;
   private float f_29905;
   private float f_29906;
   private float f_29907;
   private static final int f_29908 = Integer.MIN_VALUE;
   private static final double f_29909 = 256.0;
   private static final double f_29910 = 8.0;
   private static final double f_29911 = 1.0E-8;
   private static final double f_29912 = 8.0;
   private static final double f_29913 = 0.6;
   private static final double f_29914 = 1.0E-8;
   private static final double f_29915 = 1.0E-4;
   private static final double f_29916 = 1.0E-4;
   private static final float f_29917 = -15.0F;
   private static final float f_29918 = 15.0F;
   private static final float f_29919 = -10.0F;
   private static final float f_29920 = 10.0F;
   private static final double f_29921 = 1.0E-8;
   private static final int f_29922 = Integer.MIN_VALUE;

   private static Vec3 m_8330(Vec3 var0, double var1) {
      double var3 = var0.length();
      if (!Double.isFinite(var3)) {
         return Vec3.ZERO;
      } else {
         return var3 > var1 ? var0.scale(var1 / var3) : var0;
      }
   }

   public Class_qT3a68ZR9cAz3wbe() {
      this.f_29897 = f_29908;
      this.f_29898 = -1;
      this.f_29899 = -1;
      this.f_29900 = -1;
      this.f_29902 = Vec3.ZERO;
      this.f_29903 = Vec3.ZERO;
   }

   private Class_qT3a68ZR9cAz3wbe.GHJVGUMVTdUYTniZ m_8331(int var1) {
      return new Class_qT3a68ZR9cAz3wbe.GHJVGUMVTdUYTniZ(
         this.f_29901, this.f_29902, this.f_29903, this.f_29906, this.f_29907, this.f_29902.lengthSqr() < f_29921 ? 0 : Math.clamp(var1 - this.f_29899, 0, 2)
      );
   }

   public Class_qT3a68ZR9cAz3wbe.GHJVGUMVTdUYTniZ m_8332(int var1, int var2, Vec3 var3, Vec3 var4, float var5, float var6) {
      if (var1 != this.f_29897 || this.f_29901 == null || var2 < this.f_29898 || var2 - this.f_29898 > 10 || var3.distanceToSqr(this.f_29901) > f_29909) {
         this.m_8333();
         this.f_29897 = var1;
         this.f_29901 = var3;
         this.f_29902 = m_8330(var4, f_29910);
         this.f_29899 = this.f_29900 = this.f_29898 = var2;
         this.f_29904 = var5;
         this.f_29905 = var6;
         return this.m_8331(var2);
      }

      if (var2 == this.f_29898) {
         return this.m_8331(var2);
      }

      Vec3 var7 = var3.subtract(this.f_29901);
      if (var7.lengthSqr() > f_29911) {
         int var8 = Math.max(1, var2 - this.f_29899);
         Vec3 var9 = m_8330(var7.scale(1.0 / var8), f_29912);
         Vec3 var10 = var9.subtract(this.f_29902).scale(1.0 / var8);
         this.f_29903 = m_8330(var10, f_29913);
         this.f_29902 = var9;
         this.f_29901 = var3;
         this.f_29899 = var2;
      } else {
         this.f_29903 = Vec3.ZERO;
         if (var2 - this.f_29899 >= 3) {
            this.f_29902 = Vec3.ZERO;
         }

         if (this.f_29902.lengthSqr() < f_29914) {
            this.f_29899 = var2;
         }
      }

      float var11 = Mth.wrapDegrees(var5 - this.f_29904);
      float var12 = var6 - this.f_29905;
      if (!(Math.abs(var11) > f_29915) && !(Math.abs(var12) > f_29916)) {
         if (var2 - this.f_29900 >= 3) {
            this.f_29906 = this.f_29907 = 0.0F;
         }

         if (this.f_29906 == 0.0F && this.f_29907 == 0.0F) {
            this.f_29900 = var2;
         }
      } else {
         int var13 = Math.max(1, var2 - this.f_29900);
         this.f_29906 = Mth.clamp(var11 / var13, f_29917, f_29918);
         this.f_29907 = Mth.clamp(var12 / var13, f_29919, f_29920);
         this.f_29904 = var5;
         this.f_29905 = var6;
         this.f_29900 = var2;
      }

      this.f_29898 = var2;
      return this.m_8331(var2);
   }

   public void m_8333() {
      this.f_29897 = f_29922;
      this.f_29898 = this.f_29899 = this.f_29900 = -1;
      this.f_29901 = null;
      this.f_29902 = this.f_29903 = Vec3.ZERO;
      this.f_29906 = this.f_29907 = 0.0F;
   }

   public record GHJVGUMVTdUYTniZ(Vec3 position, Vec3 velocity, Vec3 acceleration, float yawRate, float pitchRate, int age) {
   }
}
