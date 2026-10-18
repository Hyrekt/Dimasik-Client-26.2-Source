package dev.dimasik.client.system;

import dev.dimasik.client.module.misc.ClientSounds;
import dev.dimasik.client.setting.impl.SliderSetting;
import net.minecraft.client.Minecraft;
import org.lwjgl.glfw.GLFW;

public class Class_aYLlnnpGIkgjpBzZ extends Class_c7bxavYluZ02uW8X<SliderSetting> {
   private final Class_Uc5RGrzRMEtTSzhi f_17235 = new Class_Uc5RGrzRMEtTSzhi(Class_Uc5RGrzRMEtTSzhi.c0YnRHLCUfrljfxV.NUMBER);
   private final Class_w8fCJQ5ZtH5lQbWc f_17236;
   private final Class_w8fCJQ5ZtH5lQbWc f_17237;
   private final Class_w8fCJQ5ZtH5lQbWc f_17238;
   private final Class_w8fCJQ5ZtH5lQbWc f_17239;
   private boolean f_17240;
   private double f_17241;
   private static final float f_17242 = 34.0F;
   private static final float f_17243 = 14.0F;
   private static final float f_17244 = 12.0F;
   private static final float f_17245 = 16.0F;
   private static final float f_17246 = 6.0F;
   private static final float f_17247 = 18.0F;
   private static final double f_17248 = 18.0;
   private static final long f_17249 = 800L;
   private static final long f_17250 = 400L;
   private static final float f_17251 = 12.0F;
   private static final float f_17252 = 23.0F;
   private static final float f_17253 = 5.0F;
   private static final float f_17254 = 23.0F;
   private static final float f_17255 = 5.0F;
   private static final float f_17256 = 12.0F;
   private static final float f_17257 = 1.2F;
   private static final float f_17258 = 1.8F;
   private static final float f_17259 = 4.5F;
   private static final float f_17260 = 0.8F;
   private static final float f_17261 = 255.0F;
   private static final float f_17262 = 0.9F;
   private static final float f_17263 = 255.0F;
   private static final float f_17264 = 25.5F;
   private static final float f_17265 = 34.0F;
   private static final float f_17266 = 22.0F;
   private static final double f_17267 = 8.0;
   private static final float f_17268 = 12.0F;
   private static final float f_17269 = 18.0F;
   private static final double f_17270 = 18.0;
   private static final float f_17271 = 100.0F;

   @Override
   public void m_2935(String var1, int var2, int var3) {
      this.f_17235.m_5262(var1);
   }

   @Override
   public boolean m_2320(float var1, float var2, double var3) {
      if (this.m_5914() && Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_18143, this.f_18144 + f_17269, this.f_18145, f_17270)) {
         this.f_17241 += var3;
         int var5 = (int)this.f_17241;
         if (var5 == 0) {
            return true;
         }

         this.f_17241 -= var5;
         this.m_5915(this.f_18147.m_8768() + this.m_5911() * var5, false);
         return true;
      } else {
         this.f_17241 = 0.0;
         return false;
      }
   }

   private float m_5911() {
      if (this.f_18147.m_817() > 0.0F) {
         return this.f_18147.m_817();
      }

      float var1 = this.f_18147.m_813() - this.f_18147.m_824();
      return var1 > 0.0F ? var1 / f_17271 : 1.0F;
   }

   @Override
   public void m_694() {
   }

   private float m_5912(float var1, float var2) {
      float var3 = (var2 - var1) / this.f_18145 * (this.f_18147.m_813() - this.f_18147.m_824()) + this.f_18147.m_824();
      var3 = (float)Class_3VHxwfI2NZKoxzIi.m_1308(var3, this.f_18147.m_817());
      return Math.clamp(var3, this.f_18147.m_824(), this.f_18147.m_813());
   }

   private boolean m_5914() {
      long var1 = Minecraft.getInstance().getWindow().handle();
      return GLFW.glfwGetKey(var1, 341) == 1 || GLFW.glfwGetKey(var1, 345) == 1;
   }

   @Override
   public void m_700(float var1, float var2, int var3) {
      if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_18143, this.f_18144 + f_17266, this.f_18145, f_17267)) {
         this.f_17240 = true;
         ClientSounds.m_9463(ClientSounds.KG2FYhAQHwVAXDJG.SLIDER_GRAB);
      }

      String var4 = this.f_17235.m_5261() ? this.f_17235.m_5254() : this.f_18147.m_8768() + "";
      this.f_17235.m_5257(() -> this.m_5915(this.f_17235.m_5255(this.f_18147.m_8768()), true));
      this.f_17235
         .m_5260(
            var1,
            var2,
            this.f_18143 + this.f_18145 - Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var4, 12),
            this.f_18144,
            Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var4, 12),
            f_17268,
            this.f_18147.m_8768() + "",
            var3
         );
   }

   private void m_5915(float var1, boolean var2) {
      float var3 = this.f_18147.m_8768();
      if (var2) {
         this.f_18147.m_818(var1);
      } else {
         this.f_18147.m_823(var1);
      }

      if (!var2 && Float.compare(var3, this.f_18147.m_8768()) != 0) {
         ClientSounds.m_9462(ClientSounds.KG2FYhAQHwVAXDJG.SLIDER, this.m_5917());
      }
   }

   public Class_aYLlnnpGIkgjpBzZ(SliderSetting var1) {
      super(var1, f_17242);
      this.f_17236 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_17243, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_17237 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_17244, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_17238 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_17245, Class_eXr9Fra2ad3yFXY8.f_19121);
      this.f_17239 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_17246, Class_eXr9Fra2ad3yFXY8.f_19100);
   }

   @Override
   public void m_701(float var1, float var2, float var3) {
      if (this.f_17240) {
         this.m_5915(this.m_5912(this.f_18143, var1), false);
      }

      boolean var4 = Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_18143, this.f_18144 + f_17247, this.f_18145, f_17248);
      this.f_17236.m_9283(this.m_5917());
      this.f_17237.m_9283(!var4 && !this.f_17235.m_5261() ? 0.0F : 1.0F);
      this.f_17238.m_9283(this.f_17240 ? 1.0F : 0.0F);
      this.f_17239.m_9283(this.f_17235.m_5261() && System.currentTimeMillis() % f_17249 <= f_17250 ? 1.0F : 0.0F);
      float var5 = Math.clamp(this.f_17236.m_9288(), 0.0F, 1.0F);
      float var6 = this.f_17237.m_9288();
      float var7 = this.f_17238.m_9288();
      float var8 = Math.clamp(Math.max(var6, var7), 0.0F, 1.0F);
      String var9 = this.f_17235.m_5261() ? this.f_17235.m_5254() : this.f_18147.m_8768() + "";
      int var10 = Class_BftdentXEtGbugJw.m_2302(
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT), Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT), var6
      );
      int var11 = Class_BftdentXEtGbugJw.m_2302(
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT), Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT), var8
      );
      int var12 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.BACKGROUND);
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), Class_0p152hWffX3ippAf.m_801(this.f_18147.m_8764()), this.f_18143, this.f_18144, 13, var10);
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         var9,
         this.f_18143 + this.f_18145 - Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var9, 12),
         this.f_18144,
         12,
         var11
      );
      Class_Ssh31B3ljfKeWsvS.m_4817(
         this.f_18143
            + this.f_18145
            - Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var9, 12)
            + Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var9, 12),
         this.f_18144,
         1.0F,
         f_17251,
         0.0F,
         Class_BftdentXEtGbugJw.m_2306(var11, this.f_17239.m_9288())
      );
      Class_Ssh31B3ljfKeWsvS.m_4817(this.f_18143, this.f_18144 + f_17252, this.f_18145, f_17253, 2.0F, var12);
      Class_Ssh31B3ljfKeWsvS.m_4817(
         this.f_18143, this.f_18144 + f_17254, this.f_18145 * var5, f_17255, 2.0F, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN)
      );
      float var13 = f_17256 + var6 * f_17257 + var7 * f_17258;
      float var14 = f_17259 + var6 * f_17260;
      float var15 = this.f_18143 + this.f_18145 * var5 - var13 / 2.0F;
      int var16 = Class_BftdentXEtGbugJw.m_2302(
         Class_BftdentXEtGbugJw.m_2306(
            Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.CIRCLE), Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.CIRCLE) / f_17261 * f_17262
         ),
         Class_BftdentXEtGbugJw.m_2306(
            Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.CIRCLE), Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.CIRCLE) / f_17263
         ),
         var8
      );
      Class_Ssh31B3ljfKeWsvS.m_4817(var15, this.f_18144 + f_17264 - var13 / 2.0F, var13, var13, var14, var16);
      this.f_18146 = f_17265;
   }

   @Override
   public void m_698(int var1) {
      this.f_17235.m_5256(var1);
   }

   @Override
   public void m_5916(int var1) {
      this.f_17235.m_5264(var1);
   }

   private float m_5917() {
      float var1 = this.f_18147.m_813() - this.f_18147.m_824();
      return var1 == 0.0F ? 0.0F : (this.f_18147.m_8768() - this.f_18147.m_824()) / var1;
   }

   @Override
   public void m_2083(float var1, float var2, int var3) {
      if (this.f_17240) {
         ClientSounds.m_9463(ClientSounds.KG2FYhAQHwVAXDJG.SLIDER_RELEASE);
      }

      this.f_17240 = false;
   }
}
