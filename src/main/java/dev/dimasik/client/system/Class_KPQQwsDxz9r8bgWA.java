package dev.dimasik.client.system;

import dev.dimasik.client.setting.impl.ModeSetting;

public class Class_KPQQwsDxz9r8bgWA extends Class_c7bxavYluZ02uW8X<ModeSetting> {
   private final Class_1gO7GkQ9aEvcObZ8 f_10180 = new Class_1gO7GkQ9aEvcObZ8();
   private boolean f_10181 = false;
   private float f_10182;
   private long f_10183;
   private static final float f_10184 = 22.0F;
   private static final float f_10185 = 0.2F;
   private static final double f_10186 = 255.0;
   private static final double f_10187 = 255.0;
   private static final double f_10188 = 255.0;
   private static final double f_10189 = 255.0;
   private static final float f_10190 = 96.0F;
   private static final float f_10191 = 96.0F;
   private static final float f_10192 = 6.0F;
   private static final double f_10193 = 12.0;
   private static final float f_10194 = 88.0F;
   private static final float f_10195 = 80.0F;
   private static final float f_10196 = 96.0F;
   private static final double f_10197 = 96.0;
   private static final float f_10198 = 0.016666668F;
   private static final float f_10199 = 1.0E9F;
   private static final float f_10200 = 0.05F;
   private static final float f_10201 = 38.0F;
   private static final float f_10202 = 80.0F;
   private static final float f_10203 = 32.0F;
   private static final float f_10204 = 4.0F;
   private static final float f_10205 = 4.0F;
   private static final float f_10206 = 4.0F;
   private static final float f_10207 = 22.0F;
   private static final float f_10208 = 96.0F;
   private static final double f_10209 = 96.0;
   private static final double f_10210 = 20.0;

   @Override
   public void m_698(int var1) {
      if (var1 == 257) {
         this.f_10181 = false;
      } else if (var1 == 259 && this.f_10181 && !this.f_18147.m_8768().isEmpty()) {
         this.f_18147.m_823(this.f_18147.m_8768().substring(0, this.f_18147.m_8768().length() - 1));
      }
   }

   @Override
   public void m_701(float var1, float var2, float var3) {
      this.f_10180.m_848(0.0F, 1.0F, f_10185, Class_55WOGfS5cDac4HRi.f_2285, var3);
      int var4 = Class_BftdentXEtGbugJw.m_2302(
         Class_BftdentXEtGbugJw.m_2303(55, 58, 65, f_10186), Class_BftdentXEtGbugJw.m_2303(75, 78, 85, f_10187), this.f_10180.m_845()
      );
      int var5 = Class_BftdentXEtGbugJw.m_2302(
         Class_BftdentXEtGbugJw.m_2303(133, 136, 142, f_10188), Class_BftdentXEtGbugJw.m_2303(236, 236, 237, f_10189), this.f_10180.m_845()
      );
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         Class_0p152hWffX3ippAf.m_801(this.f_18147.m_8764()),
         this.f_18143,
         this.f_18144 + 1.0F,
         13,
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT)
      );
      Class_Ssh31B3ljfKeWsvS.m_4854(
         this.f_18143 + this.f_18145 - f_10190, this.f_18144, f_10191, this.f_18146, 1.0F, f_10192, Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_10193)
      );
      float var6 = this.f_18143 + this.f_18145 - f_10194;
      float var7 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), this.f_18147.m_8768(), 11);
      boolean var8 = var7 > f_10195;
      boolean var9 = Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_18143 + this.f_18145 - f_10196, this.f_18144, f_10197, this.f_18146);
      long var10 = System.nanoTime();
      float var12 = this.f_10183 == 0L ? f_10198 : Math.clamp((float)(var10 - this.f_10183) / f_10199, 0.0F, f_10200);
      this.f_10183 = var10;
      if (!var8 || !var9 && !this.f_10181) {
         this.f_10182 = 0.0F;
      } else {
         this.f_10182 = this.f_10182 + var12 * f_10201;
      }

      Class_Ssh31B3ljfKeWsvS.m_4860(var6, this.f_18144, f_10202, this.f_18146);
      if (!var8 || !var9 && !this.f_10181) {
         Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), this.f_18147.m_8768(), var6, this.f_18144 + f_10206, 11, var5);
      } else {
         float var13 = var7 + f_10203;
         float var14 = var6 - this.f_10182 % var13;
         Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), this.f_18147.m_8768(), var14, this.f_18144 + f_10204, 11, var5);
         Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), this.f_18147.m_8768(), var14 + var13, this.f_18144 + f_10205, 11, var5);
      }

      Class_Ssh31B3ljfKeWsvS.m_4828();
      this.f_18146 = f_10207;
   }

   @Override
   public void m_2935(String var1, int var2, int var3) {
      if (this.f_10181) {
         this.f_18147.m_823(this.f_18147.m_8768() + var1);
      }
   }

   @Override
   public void m_700(float var1, float var2, int var3) {
      if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_18143 + this.f_18145 - f_10208, this.f_18144, f_10209, f_10210) && var3 == 0) {
         this.f_10181 = !this.f_10181;
      } else {
         this.f_10181 = false;
      }
   }

   @Override
   public void m_694() {
      this.f_10180.m_843(this.f_10181);
   }

   public Class_KPQQwsDxz9r8bgWA(ModeSetting var1) {
      super(var1, f_10184);
   }
}
