package dev.dimasik.client.system;

import dev.dimasik.client.module.misc.ClientSounds;
import net.minecraft.client.Minecraft;

public class Class_EvQFCy35Y4UubJsB extends Class_c7bxavYluZ02uW8X<Class_TwRQEhCOrGjBfPHM> {
   private final Class_w8fCJQ5ZtH5lQbWc f_7189;
   private final Class_w8fCJQ5ZtH5lQbWc f_7190;
   private final Class_w8fCJQ5ZtH5lQbWc f_7191;
   private boolean f_7192;
   private float f_7193;
   private float f_7194;
   private float f_7195;
   private float f_7196;
   private float f_7197;
   private float f_7198;
   private static final float f_7199 = 31.0F;
   private static final float f_7200 = 9.0F;
   private static final float f_7201 = 11.0F;
   private static final float f_7202 = 14.0F;
   private static final float f_7203 = 90.0F;
   private static final float f_7204 = 0.69F;
   private static final float f_7205 = 28.0F;
   private static final float f_7206 = 3.0F;
   private static final double f_7207 = 26.0;
   private static final long f_7208 = 6000L;
   private static final float f_7209 = 0.5F;
   private static final float f_7210 = -0.5F;
   private static final float f_7211 = 8.0F;
   private static final float f_7212 = 16.0F;
   private static final float f_7213 = 7.0F;
   private static final float f_7214 = 8.0F;
   private static final float f_7215 = 8.0F;
   private static final float f_7216 = 3.0F;
   private static final float f_7217 = 26.0F;
   private static final float f_7218 = 31.0F;
   private static final double f_7219 = 28.0;
   private static final String f_7220 = "Обычное";
   private static final float f_7221 = 22.0F;
   private static final double f_7222 = 44.0;
   private static final double f_7223 = 28.0;
   private static final float f_7224 = 0.5F;
   private static final float f_7225 = -0.5F;
   private static final double f_7226 = 28.0;
   private static final float f_7227 = (float) Math.PI;
   private static final float f_7228 = (float) (Math.PI * 2);

   public Class_EvQFCy35Y4UubJsB(Class_TwRQEhCOrGjBfPHM var1) {
      super(var1, f_7199);
      this.f_7189 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_7200, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_7190 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_7201, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_7191 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_7202, Class_eXr9Fra2ad3yFXY8.f_19121);
   }

   @Override
   public void m_2083(float var1, float var2, int var3) {
      if (var3 == 0) {
         this.f_7192 = false;
      }
   }

   @Override
   public void m_694() {
   }

   @Override
   public void m_700(float var1, float var2, int var3) {
      if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_7197, this.f_18144 + 2.0F, this.f_7198, f_7219)) {
         if (var3 == 1) {
            for (Class_2ZaVm8TGDJ68TnJB var5 : this.f_18147.m_8768()) {
               if (var5.m_1181().equals(f_7220)) {
                  Class_2ZaVm8TGDJ68TnJB var6 = this.f_18147.m_7564();
                  this.f_18147.m_1767(var5);
                  this.m_2586(var6);
                  return;
               }
            }
         }

         if (var3 == 0 && Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_7195 - f_7221, this.f_18144 + 2.0F, f_7222, f_7223)) {
            float var8 = this.f_7189.m_9288() - (float)Math.floor(this.f_7189.m_9288());
            this.f_7194 = var8 - this.m_2588(var1, var2);
            if (this.f_7194 > f_7224) {
               this.f_7194--;
            }

            if (this.f_7194 < f_7225) {
               this.f_7194++;
            }

            this.f_7192 = true;
            this.m_2587(var1, var2);
         } else if (var3 == 0) {
            Class_2ZaVm8TGDJ68TnJB var7 = this.f_18147.m_7564();
            this.f_18147.m_5143(1);
            this.m_2586(var7);
         }
      }
   }

   private void m_2586(Class_2ZaVm8TGDJ68TnJB var1) {
      if (this.f_18147.m_7564() != var1) {
         ClientSounds.m_9463(ClientSounds.KG2FYhAQHwVAXDJG.MODE);
      }
   }

   private void m_2587(float var1, float var2) {
      this.f_7193 = this.m_2588(var1, var2) + this.f_7194;
      this.f_7193 = this.f_7193 - (float)Math.floor(this.f_7193);
      Class_2ZaVm8TGDJ68TnJB var3 = this.f_18147.m_7564();
      this.f_18147.m_5147(this.f_7193);
      this.m_2586(var3);
   }

   private float m_2588(float var1, float var2) {
      float var3 = (float)Math.atan2(var2 - this.f_7196, var1 - this.f_7195);
      return (var3 + f_7227) / f_7228;
   }

   @Override
   public void m_701(float var1, float var2, float var3) {
      this.f_7198 = f_7203;
      this.f_7197 = this.f_18143 + this.f_18145 - this.f_7198;
      this.f_7195 = this.f_7197 + this.f_7198 * f_7204;
      this.f_7196 = this.f_18144 + f_7205;
      if (this.f_7192) {
         this.m_2587(var1, var2);
      }

      boolean var4 = Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_7197, this.f_18144 + f_7206, this.f_7198, f_7207);
      this.f_7190.m_9283(var4 ? 1.0F : 0.0F);
      this.f_7191.m_9283(this.f_7192 ? 1.0F : 0.0F);
      Minecraft var5 = Minecraft.getInstance();
      long var6 = var5.level == null ? f_7208 : var5.level.getOverworldClockTime();
      float var8 = this.f_18147.m_5146(var6);
      if (this.f_7192) {
         this.f_7189.m_9281(this.f_7193);
      } else {
         float var9 = this.f_7189.m_9288();

         while (var8 - var9 > f_7209) {
            var8--;
         }

         while (var8 - var9 < f_7210) {
            var8++;
         }

         this.f_7189.m_9283(var8);
      }

      float var17 = this.f_7189.m_9288() - (float)Math.floor(this.f_7189.m_9288());
      float var10 = Math.clamp(this.f_7190.m_9288(), 0.0F, 1.0F);
      float var11 = Math.clamp(Math.max(var10, this.f_7191.m_9288()), 0.0F, 1.0F);
      int var12 = Class_BftdentXEtGbugJw.m_2302(
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT), Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT), var10
      );
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(), Class_0p152hWffX3ippAf.m_801(this.f_18147.m_8764()), this.f_18143, this.f_18144 + f_7211, 13, var12
      );
      String var13 = Class_0p152hWffX3ippAf.m_801(this.f_18147.m_5145());
      float var14 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var13, 12) + f_7212;
      float var15 = this.f_7197 - var14 - f_7213;
      int var16 = Class_BftdentXEtGbugJw.m_2302(
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT), Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN), var10
      );
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var13, var15 + f_7214, this.f_18144 + f_7215, 12, var16);
      Class_Ssh31B3ljfKeWsvS.m_4840(this.f_7197, this.f_18144 + f_7216, this.f_7198, f_7217, var17, var11);
      this.f_18146 = f_7218;
   }

   @Override
   public boolean m_2320(float var1, float var2, double var3) {
      if (!Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_7197, this.f_18144 + 2.0F, this.f_7198, f_7226)) {
         return false;
      }

      if (var3 == 0.0) {
         return true;
      }

      Class_2ZaVm8TGDJ68TnJB var5 = this.f_18147.m_7564();
      this.f_18147.m_5143(var3 > 0.0 ? -1 : 1);
      this.m_2586(var5);
      return true;
   }
}
