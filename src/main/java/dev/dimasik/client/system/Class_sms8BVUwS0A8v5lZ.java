package dev.dimasik.client.system;

import java.util.Random;
import net.minecraft.util.Mth;

public final class Class_sms8BVUwS0A8v5lZ {
   private static final float f_31138 = (float) (Math.PI * 2);
   private static final int f_31139 = 2;
   private static final int f_31140 = 3;
   private static final int f_31141 = 6;
   private static final int f_31142 = 60;
   private static final int f_31143 = 8;
   private static final int f_31144 = 100;
   private static final float f_31145 = 0.26F;
   private static final float f_31146 = 0.2F;
   private static final float f_31147 = 3.2F;
   private static final float f_31148 = 24.0F;
   private final Random f_31149 = new Random();
   private float f_31150;
   private float f_31151;
   private float f_31152;
   private float f_31153;
   private float f_31154;
   private float f_31155;
   private float f_31156;
   private float f_31157;
   private float f_31158;
   private float f_31159;
   private float f_31160;
   private float f_31161;
   private float f_31162;
   private float f_31163;
   private float f_31164;
   private float f_31165;
   private int f_31166 = 60;
   private int f_31167 = -1;
   private int f_31168 = 100;
   private int f_31169 = -1;
   private static final float f_31170 = 0.8F;
   private static final float f_31171 = 0.012F;
   private static final double f_31172 = 0.003;
   private static final float f_31173 = 0.01F;
   private static final float f_31174 = 0.22F;
   private static final float f_31175 = 0.3F;
   private static final double f_31176 = 9.0;
   private static final float f_31177 = (float) (Math.PI * 2);
   private static final float f_31178 = (float) (Math.PI * 2);
   private static final float f_31179 = (float) (Math.PI * 2);
   private static final float f_31180 = 0.085F;
   private static final float f_31181 = 0.13F;
   private static final float f_31182 = 0.22F;
   private static final float f_31183 = (float) (Math.PI * 2);
   private static final float f_31184 = (float) (Math.PI * 2);
   private static final float f_31185 = (float) (Math.PI * 2);
   private static final float f_31186 = 6.0F;
   private static final float f_31187 = 4.4F;
   private static final float f_31188 = 0.42F;
   private static final float f_31189 = 0.26F;
   private static final float f_31190 = 0.2F;
   private static final float f_31191 = 3.2F;
   private static final float f_31192 = -24.0F;
   private static final float f_31193 = 24.0F;
   private static final float f_31194 = 3.0F;
   private static final float f_31195 = 8.0F;
   private static final float f_31196 = (float) (Math.PI * 2);

   public float m_8713(float var1) {
      return Mth.lerp(var1, this.f_31163, this.f_31162);
   }

   public float m_8714(float var1) {
      return Mth.lerp(var1, this.f_31151, this.f_31150);
   }

   public void m_8715() {
      this.f_31150 = 0.0F;
      this.f_31151 = 0.0F;
      this.f_31152 = 0.0F;
      this.f_31153 = 0.0F;
      this.f_31154 = 0.0F;
      this.f_31155 = 0.0F;
      this.f_31156 = 0.0F;
      this.f_31157 = 0.0F;
      this.f_31158 = 0.0F;
      this.f_31159 = 0.0F;
      this.f_31160 = 0.0F;
      this.f_31161 = 0.0F;
      this.f_31162 = 0.0F;
      this.f_31163 = 0.0F;
      this.f_31164 = 0.0F;
      this.f_31165 = 0.0F;
      this.f_31166 = 60;
      this.f_31167 = -1;
      this.f_31168 = 100;
      this.f_31169 = -1;
   }

   private void m_8716() {
      float var1 = this.f_31154 * this.f_31154 * f_31187 + Mth.sin(this.f_31150 * 2.0F) * this.f_31152 * f_31188;
      float var2 = var1 - this.f_31165;
      this.f_31165 = var1;
      this.f_31164 = this.f_31164 + (-this.f_31160 * f_31189 - this.f_31164 * f_31190 - var2 * f_31191);
      this.f_31160 = Mth.clamp(this.f_31160 + this.f_31164, f_31192, f_31193);
   }

   private void m_8717() {
      if (this.f_31167 < 0) {
         if (--this.f_31166 <= 0) {
            this.f_31167 = 0;
         }
      } else {
         this.f_31167++;
         if (this.f_31167 <= 2) {
            this.f_31156 = this.f_31167 / 2.0F;
         } else if (this.f_31167 <= 3) {
            this.f_31156 = 1.0F;
         } else {
            this.f_31156 = Math.max(0.0F, 1.0F - (this.f_31167 - 3) / f_31194);
         }

         if (this.f_31167 >= 6) {
            this.f_31167 = -1;
            this.f_31156 = 0.0F;
            this.f_31166 = 60 + this.f_31149.nextInt(140);
         }
      }
   }

   private void m_8718() {
      if (this.f_31169 < 0) {
         if (--this.f_31168 <= 0) {
            this.f_31169 = 0;
         }
      } else {
         this.f_31169++;
         this.f_31158 = Mth.sin(this.f_31169 / f_31195 * f_31196);
         if (this.f_31169 >= 8) {
            this.f_31169 = -1;
            this.f_31158 = 0.0F;
            this.f_31168 = 100 + this.f_31149.nextInt(180);
         }
      }
   }

   public void m_8719() {
      this.f_31151 = this.f_31150;
      this.f_31153 = this.f_31152;
      this.f_31155 = this.f_31154;
      this.f_31157 = this.f_31156;
      this.f_31159 = this.f_31158;
      this.f_31161 = this.f_31160;
      this.f_31163 = this.f_31162;
   }

   public float m_8720(float var1) {
      return Mth.lerp(var1, this.f_31157, this.f_31156);
   }

   public float m_8721(float var1) {
      return Mth.lerp(var1, this.f_31159, this.f_31158);
   }

   public float m_8722(float var1) {
      return Mth.lerp(var1, this.f_31155, this.f_31154);
   }

   public float m_8723(float var1) {
      return Mth.lerp(var1, this.f_31161, this.f_31160);
   }

   public float m_8724(float var1) {
      return Mth.lerp(var1, this.f_31153, this.f_31152);
   }

   public void m_8725() {
      this.f_31154 = 1.0F;
      this.f_31164 = this.f_31164 - f_31186;
   }

   public void m_8726(double var1, float var3) {
      this.f_31154 = this.f_31154 * f_31170;
      if (this.f_31154 < f_31171) {
         this.f_31154 = 0.0F;
      }

      float var4 = var1 > f_31172 ? Mth.clamp((float)(var1 / Math.max(f_31173, var3)), f_31174, 1.0F) : 0.0F;
      this.f_31152 = this.f_31152 + (var4 - this.f_31152) * f_31175;
      this.f_31150 = this.f_31150 + (float)(var1 * f_31176);
      if (this.f_31150 > f_31177) {
         this.f_31150 = this.f_31150 - f_31178;
         this.f_31151 = this.f_31151 - f_31179;
      }

      this.f_31162 = this.f_31162 + (f_31180 + this.f_31152 * f_31181 + this.f_31154 * f_31182);
      if (this.f_31162 > f_31183) {
         this.f_31162 = this.f_31162 - f_31184;
         this.f_31163 = this.f_31163 - f_31185;
      }

      this.m_8716();
      this.m_8717();
      this.m_8718();
   }
}
