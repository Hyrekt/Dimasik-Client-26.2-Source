package dev.dimasik.client.system;

import lombok.Generated;
import net.minecraft.client.Camera;

public class Class_hE5HYN1IW4q63o2z extends Class_6u9LYKHM0SeJMktw implements Class_W36DTOFJFiIifzGK {
   private final Camera f_23269;
   private final float f_23270;
   private float f_23271;
   private float f_23272;
   private int f_23273;
   private boolean f_23274;
   private boolean f_23275;

   @Generated
   public boolean m_7136() {
      return this.f_23274;
   }

   @Generated
   public float m_7137() {
      return this.f_23272;
   }

   @Generated
   public boolean m_7138() {
      return this.f_23275;
   }

   @Generated
   public float m_7139() {
      return this.f_23270;
   }

   @Generated
   public int m_7140() {
      return this.f_23273;
   }

   public void m_7141(float var1, float var2) {
      this.f_23271 = var1;
      this.f_23272 = var2;
      this.f_23274 = true;
      this.m_1582(true);
   }

   public Class_hE5HYN1IW4q63o2z(Camera var1, float var2) {
      this.f_23269 = var1;
      this.f_23270 = var2;
      this.f_23272 = var2;
   }

   public void m_7142(int var1) {
      this.f_23273 = var1;
      this.f_23275 = true;
      this.m_1582(true);
   }

   @Generated
   public Camera m_7143() {
      return this.f_23269;
   }

   @Generated
   public float m_7144() {
      return this.f_23271;
   }
}
