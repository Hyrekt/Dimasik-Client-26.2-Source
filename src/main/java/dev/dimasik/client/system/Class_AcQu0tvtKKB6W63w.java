package dev.dimasik.client.system;

import net.minecraft.world.phys.Vec3;

public final class Class_AcQu0tvtKKB6W63w implements Class_WzqIkwE6nF1UkDXB {
   private float f_5167;
   private float f_5168;
   private float f_5169;
   private float f_5170;
   private static final float f_5171 = 0.05F;
   private static final float f_5172 = 0.05F;
   private static final float f_5173 = 1.2F;
   private static final double f_5174 = 35.0;
   private static final double f_5175 = 42.0;
   private static final float f_5176 = 0.4F;

   public Vec3 m_2093(float var1) {
      return new Vec3(0.0, Math.sin(Class_O4GrYnfSWk91dY9f.m_4031(this.f_5169, this.f_5170, var1)) * f_5174 - f_5175, 0.0);
   }

   @Override
   public void m_2094() {
      this.f_5167 = f_5173;
   }

   public Class_AcQu0tvtKKB6W63w() {
      this.f_5167 = f_5171;
   }

   @Override
   public void m_2095() {
      this.f_5167 = f_5172;
   }

   @Override
   public void m_2096() {
      this.m_2094();
   }

   @Override
   public void m_2097() {
      this.m_2094();
   }

   @Override
   public void m_2098() {
      this.f_5169 = this.f_5170;
      this.f_5170 = this.f_5170 + this.f_5168;
      this.f_5168 = this.f_5168 + (this.f_5167 - this.f_5168) * f_5176;
   }

   @Override
   public void m_2099() {
      this.m_2095();
   }
}
