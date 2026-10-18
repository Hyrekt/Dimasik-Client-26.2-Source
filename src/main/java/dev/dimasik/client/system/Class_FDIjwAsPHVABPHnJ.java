package dev.dimasik.client.system;

public final class Class_FDIjwAsPHVABPHnJ {
   private static final long f_7230 = 1000000000L;
   private long f_7231;
   private int f_7232;
   private int f_7233;
   private boolean f_7234 = true;
   private static final long f_7235 = 1000000000L;
   private static final double f_7236 = 1.0E9;

   public int m_2591() {
      return this.f_7233;
   }

   public boolean m_2592(long var1, int var3) {
      if (this.f_7231 == 0L) {
         this.f_7231 = var1;
      }

      this.f_7232++;
      long var4 = var1 - this.f_7231;
      if (var4 >= f_7235) {
         this.f_7233 = (int)Math.round(this.f_7232 * f_7236 / var4);
         this.f_7234 = this.f_7233 >= var3;
         this.f_7231 = var1;
         this.f_7232 = 0;
      }

      return this.f_7234;
   }

   public void m_2593() {
      this.f_7231 = 0L;
      this.f_7232 = this.f_7233 = 0;
      this.f_7234 = true;
   }
}
