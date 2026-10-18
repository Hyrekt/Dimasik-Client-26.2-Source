package dev.dimasik.client.system;

import net.minecraft.util.Mth;

public class Class_w8fCJQ5ZtH5lQbWc {
   private float f_34300;
   private float f_34301;
   private float f_34302;
   private float f_34303;
   private Class_R0uU2TN2taAhKn2a f_34304;
   private long f_34305;
   private double f_34306;
   private boolean f_34307;
   private static final double f_34308 = 2.0;
   private static final double f_34309 = 1.0E9;

   public boolean m_9280() {
      return this.m_9287() >= 1.0;
   }

   public Class_w8fCJQ5ZtH5lQbWc(float var1, float var2) {
      this(var1, var2, Class_eXr9Fra2ad3yFXY8.f_19095);
   }

   public void m_9281(float var1) {
      this.f_34300 = var1;
      this.f_34301 = var1;
      this.f_34302 = var1;
      this.f_34307 = false;
   }

   public boolean m_9282() {
      return !this.m_9280();
   }

   public void m_9283(float var1) {
      if (this.f_34301 != var1 || !this.f_34307) {
         this.f_34301 = var1;
         this.f_34302 = this.f_34300;
         this.f_34305 = System.nanoTime();
         this.f_34306 = 1.0 / this.f_34303 * f_34308;
         this.f_34307 = true;
      }

      if (this.m_9280()) {
         this.f_34300 = this.f_34301;
         this.f_34307 = false;
      } else {
         double var2 = this.m_9287();
         float var4 = (float)this.f_34304.m_4476(var2);
         this.f_34300 = Mth.lerp(var4, this.f_34302, this.f_34301);
      }
   }

   public float m_9284() {
      return this.f_34301;
   }

   public void m_9285(Class_R0uU2TN2taAhKn2a var1) {
      this.f_34304 = var1 != null ? var1 : Class_eXr9Fra2ad3yFXY8.f_19095;
   }

   public void m_9286(float var1) {
      this.f_34303 = var1;
      this.f_34306 = 1.0 / var1;
   }

   private double m_9287() {
      if (!this.f_34307) {
         return 1.0;
      }

      long var1 = System.nanoTime();
      double var3 = (var1 - this.f_34305) / f_34309;
      return Mth.clamp(var3 / this.f_34306, 0.0, 1.0);
   }

   public Class_w8fCJQ5ZtH5lQbWc(float var1, float var2, Class_R0uU2TN2taAhKn2a var3) {
      this.f_34300 = var1;
      this.f_34301 = var1;
      this.f_34302 = var1;
      this.f_34303 = var2;
      this.f_34304 = var3 != null ? var3 : Class_eXr9Fra2ad3yFXY8.f_19095;
      this.f_34305 = 0L;
      this.f_34306 = 0.0;
      this.f_34307 = false;
   }

   public float m_9288() {
      return this.f_34300;
   }
}
