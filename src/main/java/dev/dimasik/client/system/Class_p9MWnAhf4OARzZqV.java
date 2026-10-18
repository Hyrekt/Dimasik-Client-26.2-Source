package dev.dimasik.client.system;

public final class Class_p9MWnAhf4OARzZqV {
   private boolean f_28135;
   private long f_28136;
   private float f_28137;
   private float f_28138;
   private float f_28139;
   private float f_28140;
   private float f_28141;
   private float f_28142;
   private float f_28143;
   private float f_28144;
   private float f_28145;
   private float f_28146;
   private float f_28147;
   private float f_28148 = 1.0F;
   private static final float f_28149 = 100.0F;
   private static final float f_28150 = 7.2E8F;
   private static final float f_28151 = 0.82F;
   private static final float f_28152 = 0.68F;
   private static final float f_28153 = 62.0F;
   private static final float f_28154 = 100.0F;
   private static final float f_28155 = 0.3F;
   private static final float f_28156 = 0.2F;
   private static final float f_28157 = 0.6F;
   private static final float f_28158 = 3.0F;
   private static final float f_28159 = 9.0F;
   private static final float f_28160 = 0.72F;
   private static final float f_28161 = 0.028F;
   private static final float f_28162 = 0.42F;

   public float m_8037() {
      return this.f_28148;
   }

   public float m_8038() {
      return this.f_28139;
   }

   public void m_8039(float var1, float var2, float var3) {
      long var4 = System.nanoTime();
      if (!this.f_28135) {
         this.f_28135 = true;
         this.f_28137 = this.f_28145 = var1;
         this.f_28138 = this.f_28146 = var2;
         this.f_28139 = this.f_28147 = var3;
         this.f_28140 = var3 < f_28149 ? 0.0F : 1.0F;
      } else {
         this.m_8044(var4);
         if (var1 != this.f_28145 || var2 != this.f_28146 || var3 != this.f_28147) {
            this.f_28141 = this.f_28137;
            this.f_28142 = this.f_28138;
            this.f_28143 = this.f_28139;
            this.f_28144 = this.f_28140;
            this.f_28145 = var1;
            this.f_28146 = var2;
            this.f_28147 = var3;
            this.f_28136 = var4;
            this.f_28148 = 0.0F;
         }
      }
   }

   public float m_8040() {
      return this.f_28138;
   }

   public float m_8041() {
      return this.f_28137;
   }

   public float m_8042() {
      return this.f_28140;
   }

   private float m_8043(float var1) {
      if (var1 >= 1.0F) {
         return 1.0F;
      }

      double var2 = var1 * f_28159;
      return (float)(1.0 - Math.exp(-var2) * (Math.cos(var2) + Math.sin(var2)));
   }

   private void m_8044(long var1) {
      if (!(this.f_28148 >= 1.0F)) {
         this.f_28148 = Math.clamp((float)(var1 - this.f_28136) / f_28150, 0.0F, 1.0F);
         float var3 = this.m_8043(Math.clamp(this.f_28148 / f_28151, 0.0F, 1.0F));
         float var4 = this.m_8043(Math.clamp(this.f_28148 / f_28152, 0.0F, 1.0F));
         this.f_28137 = this.f_28141 + (this.f_28145 - this.f_28141) * var3;
         this.f_28138 = this.f_28142 + (this.f_28146 - this.f_28142) * var3;
         this.f_28139 = Math.max(f_28153, this.f_28143 + (this.f_28147 - this.f_28143) * var4);
         float var5 = this.f_28147 < f_28154 ? 0.0F : 1.0F;
         float var6 = var5 == 0.0F ? Math.clamp(this.f_28148 / f_28155, 0.0F, 1.0F) : Math.clamp((this.f_28148 - f_28156) / f_28157, 0.0F, 1.0F);
         var6 = var6 * var6 * (f_28158 - 2.0F * var6);
         this.f_28140 = this.f_28144 + (var5 - this.f_28144) * var6;
      }
   }

   public float m_8045(int var1) {
      return this.f_28148 >= 1.0F ? 1.0F : Math.clamp((this.f_28148 * f_28160 - Math.min(var1, 8) * f_28161) / f_28162, 0.0F, 1.0F);
   }
}
