package dev.dimasik.client.system;

public final class Class_mWYg31oKUE0OPic4 {
   public long f_25502;
   public long f_25503;
   private static final long f_25504 = 1000000L;
   private static final long f_25505 = 1000000L;
   private static final long f_25506 = -10000000L;
   private static final long f_25507 = 10000000L;
   private static final long f_25508 = 1000000L;
   private static final long f_25509 = 180000000L;
   private static final float f_25510 = 1.0E9F;
   private static final float f_25511 = 0.18F;
   private static final float f_25512 = 1.8E8F;
   private static final float f_25513 = 3.0F;
   private static final float f_25514 = 3.0F;

   public Class_mWYg31oKUE0OPic4(long var1, long var3) {
      this.f_25502 = var1 - var3 * f_25504;
   }

   public float m_7605(long var1) {
      float var3 = (float)(var1 - this.f_25502) / f_25510;
      float var4 = Math.clamp(var3 / f_25511, 0.0F, 1.0F);
      float var5 = this.f_25503 == 0L ? 1.0F : 1.0F - Math.clamp((float)(var1 - this.f_25503) / f_25512, 0.0F, 1.0F);
      return var4 * var4 * (f_25513 - 2.0F * var4) * (var5 * var5 * (f_25514 - 2.0F * var5));
   }

   public void m_7606(long var1) {
      if (this.f_25503 == 0L) {
         this.f_25503 = var1;
      }
   }

   public void m_7607(long var1, long var3, boolean var5, long var6) {
      long var8 = var1 - var3 * f_25505;
      this.f_25502 = this.f_25502 + Math.clamp(var8 - this.f_25502, f_25506, f_25507);
      if (var5) {
         long var10 = var1 - var6 * f_25508;
         this.f_25503 = this.f_25503 == 0L ? var10 : Math.min(this.f_25503, var10);
      }
   }

   public boolean m_7608(long var1) {
      return this.f_25503 != 0L && var1 - this.f_25503 >= f_25509;
   }
}
