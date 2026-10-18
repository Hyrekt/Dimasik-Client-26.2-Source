package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.ClientSounds;
import dev.dimasik.client.setting.impl.IntegerSetting;
import java.util.Locale;

public class Class_0LsAcUGWnCQ2YU25 extends Class_c7bxavYluZ02uW8X<IntegerSetting> {
   private boolean f_179;
   private final Class_w8fCJQ5ZtH5lQbWc f_180;
   private final Class_w8fCJQ5ZtH5lQbWc f_181;
   private final Class_w8fCJQ5ZtH5lQbWc f_182;
   private final Class_w8fCJQ5ZtH5lQbWc f_183;
   private final Class_w8fCJQ5ZtH5lQbWc f_184;
   private static final float f_185 = 22.0F;
   private static final float f_186 = 6.0F;
   private static final float f_187 = 10.0F;
   private static final float f_188 = 4.0F;
   private static final float f_189 = 3.0F;
   private static final float f_190 = 2.5F;
   private static final double f_191 = 240.0;
   private static final double f_192 = 0.5;
   private static final double f_193 = 0.5;
   private static final String f_194 = "...";
   private static final float f_195 = 28.0F;
   private static final float f_196 = 12.0F;
   private static final float f_197 = 10.0F;
   private static final float f_198 = 6.0F;
   private static final float f_199 = 0.5F;
   private static final float f_200 = 0.6F;
   private static final float f_201 = 19.0F;
   private static final float f_202 = 1.2F;
   private static final float f_203 = 4.0F;
   private static final float f_204 = 0.4F;
   private static final float f_205 = 24.0F;
   private static final float f_206 = 10.0F;
   private static final float f_207 = 13.0F;
   private static final float f_208 = 4.0F;
   private static final float f_209 = 0.35F;
   private static final float f_210 = 0.4F;
   private static final float f_211 = 0.7F;
   private static final float f_212 = 0.01F;
   private static final float f_213 = 10.0F;
   private static final double f_214 = 255.0;
   private static final float f_215 = 0.45F;
   private static final float f_216 = 0.01F;
   private static final float f_217 = 0.25F;
   private static final float f_218 = 0.45F;
   private static final float f_219 = 5.0F;
   private static final float f_220 = 1.5F;
   private static final float f_221 = 0.7F;
   private static final float f_222 = 0.01F;
   private static final double f_223 = 255.0;
   private static final float f_224 = 0.6F;
   private static final float f_225 = 10.0F;
   private static final float f_226 = 4.0F;
   private static final float f_227 = 180.0F;
   private static final float f_228 = 75.0F;
   private static final float f_229 = 255.0F;
   private static final float f_230 = 0.8F;
   private static final float f_231 = 4.0F;
   private static final float f_232 = 22.0F;
   private static final String f_233 = "...";
   private static final float f_234 = 28.0F;
   private static final float f_235 = 12.0F;
   private static final double f_236 = 19.0;
   private static final float f_237 = 0.72F;
   private static final float f_238 = 0.9F;
   private static final float f_239 = 0.7F;
   private static final long f_240 = 280L;
   private static final long f_241 = 3L;
   private static final String f_242 = ".";
   private static final String f_243 = "...";
   private static final String f_244 = "None";
   private static final String f_245 = "SPACE";
   private static final String f_246 = "L-SHIFT";
   private static final String f_247 = "R-SHIFT";
   private static final String f_248 = "L-CTRL";
   private static final String f_249 = "R-CTRL";
   private static final String f_250 = "L-ALT";
   private static final String f_251 = "R-ALT";
   private static final String f_252 = "ENTER";
   private static final String f_253 = "TAB";
   private static final String f_254 = "CAPS";
   private static final String f_255 = "UP";
   private static final String f_256 = "DOWN";
   private static final String f_257 = "LEFT";
   private static final String f_258 = "RIGHT";
   private static final String f_259 = "HOME";
   private static final String f_260 = "END";
   private static final String f_261 = "INSERT";
   private static final String f_262 = "PAGE UP";
   private static final String f_263 = "PAGE DOWN";

   @Override
   public void m_694() {
   }

   private String m_695() {
      int var1 = (int)(System.currentTimeMillis() / f_240 % f_241) + 1;
      return f_242.repeat(var1);
   }

   private String m_696(String var1, float var2, float var3) {
      if (var1 != null && !var1.isEmpty()) {
         if (Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var1, (int)var3) <= var2) {
            return var1;
         }

         String var4 = f_243;
         float var5 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var4, (int)var3);
         if (var5 >= var2) {
            return var4;
         }

         int var6 = var1.length();

         while (var6 > 0) {
            var6 = var1.offsetByCodePoints(var6, -1);
            String var7 = var1.substring(0, var6) + var4;
            if (Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var7, (int)var3) <= var2) {
               return var7;
            }
         }

         return var4;
      } else {
         return "";
      }
   }

   private void m_697() {
      DimasikClient.m_9057().m_9049().m_2802().m_8844().m_5559();
   }

   @Override
   public void m_698(int var1) {
      if (this.f_179) {
         if (var1 == 256) {
            this.f_179 = false;
            this.f_182.m_9281(f_238);
         } else if (var1 != 261 && var1 != 259) {
            this.f_18147.m_823(var1);
            this.f_179 = false;
            this.m_699();
            Class_5SHCkqfIMPKgkAV5.m_1480(var1);
            this.m_697();
         } else {
            this.f_18147.m_823(-1);
            this.f_179 = false;
            this.m_699();
            this.m_697();
         }
      }
   }

   public Class_0LsAcUGWnCQ2YU25(IntegerSetting var1) {
      super(var1, f_185);
      this.f_180 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_186, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_181 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_187, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_182 = new Class_w8fCJQ5ZtH5lQbWc(1.0F, f_188, Class_eXr9Fra2ad3yFXY8.f_19115);
      this.f_183 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_189, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_184 = new Class_w8fCJQ5ZtH5lQbWc(1.0F, f_190, Class_eXr9Fra2ad3yFXY8.f_19100);
   }

   private void m_699() {
      ClientSounds.m_9463(this.f_18147.m_8768() < 0 ? ClientSounds.KG2FYhAQHwVAXDJG.BIND_RESET : ClientSounds.KG2FYhAQHwVAXDJG.BIND_SET);
      this.f_183.m_9281(1.0F);
      this.f_184.m_9281(0.0F);
      this.f_182.m_9281(f_239);
   }

   @Override
   public void m_700(float var1, float var2, int var3) {
      String var4 = this.f_179 ? f_233 : this.m_703(this.f_18147.m_8768());
      float var5 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var4, 12);
      float var6 = Math.max(this.f_181.m_9288(), Math.max(f_234, var5 + f_235));
      float var7 = this.f_18143 + this.f_18145 - var6;
      if (this.f_179) {
         if (var3 != 0) {
            this.f_18147.m_823(var3);
            this.f_179 = false;
            this.m_699();
            Class_5SHCkqfIMPKgkAV5.m_1480(var3);
            this.m_697();
         }
      } else {
         if (var3 == 0 && Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var7, this.f_18144 + 1.0F, var6, f_236)) {
            this.f_179 = true;
            ClientSounds.m_9463(ClientSounds.KG2FYhAQHwVAXDJG.BIND_START);
            this.f_182.m_9281(f_237);
         }
      }
   }

   @Override
   public void m_701(float var1, float var2, float var3) {
      this.f_180.m_9283(this.f_179 ? 1.0F : 0.0F);
      this.f_182.m_9283(1.0F);
      this.f_183.m_9283(0.0F);
      this.f_184.m_9283(1.0F);
      float var4 = this.f_180.m_9288();
      float var5 = (float)(Math.sin(System.currentTimeMillis() / f_191) * f_192 + f_193);
      String var6 = this.f_179 ? this.m_695() : this.m_703(this.f_18147.m_8768());
      float var7 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), this.f_179 ? f_194 : var6, 12);
      float var8 = Math.max(f_195, var7 + f_196) + var4 * f_197;
      if (this.f_181.m_9288() <= 0.0F) {
         this.f_181.m_9281(var8);
      }

      this.f_181.m_9283(var8);
      float var9 = this.f_181.m_9288();
      float var10 = (this.f_182.m_9288() - 1.0F) * f_198 + var4 * (f_199 + var5);
      float var11 = this.f_18143 + this.f_18145 - var9;
      float var12 = var11 - var10 * 2.0F;
      float var13 = this.f_18144 + 1.0F - var10 * f_200;
      float var14 = var9 + var10 * 2.0F;
      float var15 = f_201 + var10 * f_202;
      float var16 = f_203 + var10 * f_204;
      int var17 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
      int var18 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT);
      float var19 = Math.max(f_205, var11 - this.f_18143 - f_206);
      String var20 = this.m_696(Class_0p152hWffX3ippAf.m_801(this.f_18147.m_8764()), var19, f_207);
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var20, this.f_18143, this.f_18144 + f_208, 13, var18);
      float var21 = Math.max(var4 * (f_209 + f_210 * var5), this.f_183.m_9288() * f_211);
      if (var21 > f_212) {
         Class_Ssh31B3ljfKeWsvS.m_4859(var12, var13, var14, var15, f_213, Class_BftdentXEtGbugJw.m_2306(var17, var21));
      }

      int var22 = Class_BftdentXEtGbugJw.m_2302(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.BACKGROUND), var17, var4);
      if (!this.f_179 && Class_5SHCkqfIMPKgkAV5.m_1478(this.f_18147.m_8768(), this.f_18147)) {
         var22 = Class_BftdentXEtGbugJw.m_2302(var22, Class_BftdentXEtGbugJw.m_2303(255, 78, 78, f_214), f_215);
      }

      Class_Ssh31B3ljfKeWsvS.m_4817(var12, var13, var14, var15, var16, var22);
      if (var4 > f_216) {
         Class_Ssh31B3ljfKeWsvS.m_4854(var12, var13, var14, var15, 1.0F, var16, Class_BftdentXEtGbugJw.m_2306(var18, (f_217 + f_218 * var5) * var4));
      }

      float var23 = this.f_184.m_9288();
      if (var23 < 1.0F) {
         float var24 = 2.0F + var23 * f_219;
         Class_Ssh31B3ljfKeWsvS.m_4854(
            var12 - var24,
            var13 - var24,
            var14 + var24 * 2.0F,
            var15 + var24 * 2.0F,
            f_220,
            var16 + var24,
            Class_BftdentXEtGbugJw.m_2306(var17, (1.0F - var23) * f_221)
         );
      }

      float var28 = this.f_183.m_9288();
      if (var28 > f_222) {
         Class_Ssh31B3ljfKeWsvS.m_4817(
            var12, var13, var14, var15, var16, Class_BftdentXEtGbugJw.m_2306(Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_223), var28 * f_224)
         );
      }

      float var25 = Math.clamp((var9 - var7) / f_225, 0.0F, 1.0F);
      float var26 = Math.min(var11 + var9 / 2.0F - var7 / 2.0F, this.f_18143 + this.f_18145 - var7 - f_226);
      int var27 = this.f_179
         ? Class_BftdentXEtGbugJw.m_2303(255, 255, 255, (int)((f_227 + f_228 * var5) * var25))
         : Class_BftdentXEtGbugJw.m_2306(var18, Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT) / f_229 * f_230 * var25);
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var6, var26, this.f_18144 + f_231, 12, var27);
      this.f_18146 = f_232;
   }

   @Override
   public boolean m_702() {
      return this.f_179;
   }

   private String m_703(int var1) {
      if (var1 == -1) {
         return f_244;
      }

      if (var1 >= 0 && var1 <= 7) {
         return var1 + 1 + "";
      }

      return switch (var1) {
         case 32 -> f_245;
         case 257 -> f_252;
         case 258 -> f_253;
         case 260 -> f_261;
         case 262 -> f_258;
         case 263 -> f_257;
         case 264 -> f_256;
         case 265 -> f_255;
         case 266 -> f_262;
         case 267 -> f_263;
         case 268 -> f_259;
         case 269 -> f_260;
         case 280 -> f_254;
         case 340 -> f_246;
         case 341 -> f_248;
         case 342 -> f_250;
         case 344 -> f_247;
         case 345 -> f_249;
         case 346 -> f_251;
         default -> {
            String var2 = Class_vAC0cSmAiUV3cskz.m_9251(var1);
            yield !var2.isEmpty() ? var2.toUpperCase(Locale.ROOT) : var1 + "";
         }
      };
   }
}
