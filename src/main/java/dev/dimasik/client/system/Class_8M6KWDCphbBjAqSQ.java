package dev.dimasik.client.system;

public class Class_8M6KWDCphbBjAqSQ extends Class_NO6SuGqq3FB7jQDZ {
   private boolean f_3826;
   private float f_3827;
   private float f_3828;
   private static final String f_3829 = "KillCards";
   private static final float f_3830 = 0.5F;
   private static final float f_3831 = 0.5F;
   private static final float f_3832 = 80.0F;
   private static final float f_3833 = 80.0F;

   @Override
   public float m_1757() {
      return this.m_4009();
   }

   public Class_8M6KWDCphbBjAqSQ() {
      super(f_3829, 0.0F, 0.0F, 0.0F, 0.0F);
   }

   @Override
   public float m_1758() {
      return this.m_4010();
   }

   public boolean m_1759() {
      return this.f_3826 && (Math.abs(this.f_11518 - this.f_3827) > 2.0F || Math.abs(this.f_11519 - this.f_3828) > 2.0F);
   }

   public void m_1760(float var1, float var2, float var3, float var4) {
      float var5 = this.m_4009() > 0.0F ? this.m_4009() : var3;
      float var6 = this.f_11518 + var5 * f_3830;
      float var7 = var1 + var3 * f_3831;
      boolean var8 = this.f_11518 == 0.0F && this.f_11519 == 0.0F || Math.abs(var6 - var7) < f_3832 && Math.abs(this.f_11519 - var2) < f_3833;
      boolean var9 = this.f_3826 && Math.abs(this.f_11518 - this.f_3827) < 2.0F && Math.abs(this.f_11519 - this.f_3828) < 2.0F;
      if (!this.f_3826 && var8 || var9) {
         this.f_11518 = var1;
         this.f_11519 = var2;
      }

      this.f_3827 = var1;
      this.f_3828 = var2;
      this.f_3826 = true;
      if (var3 > 0.0F && var4 > 0.0F) {
         this.m_4012(var3);
         this.m_4007(var4);
      } else {
         this.m_4012(0.0F);
         this.m_4007(0.0F);
      }
   }
}
