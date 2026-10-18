package dev.dimasik.client.system;

import lombok.Generated;
import net.minecraft.util.Mth;

public class Class_1gO7GkQ9aEvcObZ8 {
   private float f_499;
   private float f_500;
   private float f_501;
   private float f_502;
   private float f_503;
   private float f_504;
   private static final float f_505 = 0.1F;

   public void m_843(boolean var1) {
      this.f_500 = this.f_499;
      this.f_499 = Mth.clamp(this.f_499 + (var1 ? this.f_501 : -this.f_501), this.f_502, this.f_503);
   }

   @Generated
   public float m_844() {
      return this.f_499;
   }

   @Generated
   public float m_845() {
      return this.f_504;
   }

   @Generated
   public float m_846() {
      return this.f_500;
   }

   @Generated
   public void m_847(float var1) {
      this.f_504 = var1;
   }

   public void m_848(float var1, float var2, float var3, Class_55WOGfS5cDac4HRi.BsATJwRDU1ox4gC3 var4, float var5) {
      this.f_501 = var3;
      this.f_502 = var1;
      this.f_503 = var2;
      this.f_504 = var4.m_1432(Class_3VHxwfI2NZKoxzIi.m_1309(this.f_500, this.f_499, var5));
   }

   public boolean m_849() {
      return this.f_504 > f_505;
   }

   @Generated
   public void m_850(float var1) {
      this.f_499 = var1;
   }

   @Generated
   public void m_851(float var1) {
      this.f_500 = var1;
   }
}
