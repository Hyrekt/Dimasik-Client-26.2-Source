package dev.dimasik.client.system;

public final class Class_RVyRgqHvriBnyLPh {
   private int f_12481;
   private int f_12482;
   private float f_12483 = 1.0F;
   private String f_12484;
   private String f_12485;
   private static final String f_12486 = "0";
   private static final String f_12487 = "0";
   private static final float f_12488 = 0.14F;
   private static final float f_12489 = 0.22F;
   private static final float f_12490 = 3.0F;

   public Class_RVyRgqHvriBnyLPh() {
      this.f_12484 = f_12486;
      this.f_12485 = f_12487;
   }

   public boolean m_4500() {
      return this.f_12483 < 1.0F;
   }

   public void m_4501(int var1, float var2) {
      int var3 = Math.max(0, var1);
      if (this.f_12483 >= 1.0F && var3 != this.f_12482) {
         this.f_12481 = this.f_12482;
         this.f_12482 = var3;
         this.f_12484 = this.f_12485;
         this.f_12485 = Integer.toString(this.f_12482);
         this.f_12483 = 0.0F;
      }

      float var4 = var3 != this.f_12482 ? f_12488 : f_12489;
      this.f_12483 = Math.min(1.0F, this.f_12483 + Math.max(0.0F, var2) / var4);
   }

   public String m_4502() {
      return this.f_12484;
   }

   public float m_4503() {
      return this.f_12483 * this.f_12483 * (f_12490 - 2.0F * this.f_12483);
   }

   public void m_4504(int var1) {
      this.f_12481 = this.f_12482 = Math.max(0, var1);
      this.f_12484 = this.f_12485 = Integer.toString(this.f_12482);
      this.f_12483 = 1.0F;
   }

   public int m_4505() {
      return Integer.compare(this.f_12481, this.f_12482);
   }

   public String m_4506() {
      return this.f_12485;
   }
}
