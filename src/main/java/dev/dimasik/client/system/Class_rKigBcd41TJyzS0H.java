package dev.dimasik.client.system;

public final class Class_rKigBcd41TJyzS0H {
   private static final long f_30202 = 500000L;
   private static final long f_30203 = 100000000L;
   private long f_30204;
   private static final long f_30205 = 100000000L;
   private static final long f_30206 = 16666666L;
   private static final long f_30207 = 500000L;
   private static final long f_30208 = 16666666L;
   private static final long f_30209 = 16666666L;
   private static final long f_30210 = 16666666L;

   public boolean m_8425(long var1) {
      if (this.f_30204 == 0L || var1 - this.f_30204 > f_30205) {
         this.f_30204 = var1 + f_30206;
         return true;
      }

      if (var1 + f_30207 < this.f_30204) {
         return false;
      }

      this.f_30204 = this.f_30204 + f_30208;
      if (this.f_30204 <= var1) {
         this.f_30204 = this.f_30204 + ((var1 - this.f_30204) / f_30209 + 1L) * f_30210;
      }

      return true;
   }

   public void m_8426() {
      this.f_30204 = 0L;
   }
}
