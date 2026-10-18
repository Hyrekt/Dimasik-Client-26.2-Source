package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.MusicPlayer;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.resources.Identifier;
import org.joml.Matrix4f;
import org.joml.Vector4f;

public class Class_sntt8iARozMvczqs extends Class_NO6SuGqq3FB7jQDZ implements Class_OJntZb8PWlU5XrDj {
   private static final float f_31197 = 148.0F;
   private static final float f_31198 = 36.0F;
   private static final float f_31199 = 268.0F;
   private static final float f_31200 = 148.0F;
   public static final float f_31201 = 10.0F;
   private static final float f_31202 = 14.0F;
   private static final float f_31203 = 52.0F;
   private static final float f_31204 = 22.0F;
   private static final float f_31205 = 10.0F;
   private static final float f_31206 = 3.0F;
   private static final float f_31207 = 54.0F;
   private static final float f_31208 = 18.0F;
   private static final String f_31209 = "4";
   private static final String f_31210 = "5";
   private static final String f_31211 = "6";
   private static final String f_31212 = "7";
   private static final String f_31213 = "!";
   private static final String f_31214 = "\"";
   private static final String f_31215 = "#";
   private static final float f_31216 = 14.0F;
   private static final float f_31217 = 11.0F;
   private static final float f_31218 = 0.82F;
   private static final long f_31219 = 260L;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_31220 = this::m_8753;
   private float f_31221;
   private float f_31222;
   private float f_31223;
   private String f_31224 = "";
   private long f_31225;
   private long f_31226;
   private boolean f_31227;
   private float f_31228 = Float.NaN;
   private float f_31229 = Float.NaN;
   private Class_sntt8iARozMvczqs.tEgGAVG50r7cdOtU f_31230 = Class_sntt8iARozMvczqs.tEgGAVG50r7cdOtU.NONE;
   private float f_31231;
   private static final String f_31232 = "MusicPlayer";
   private static final float f_31233 = 148.0F;
   private static final float f_31234 = 36.0F;
   private static final float f_31235 = 0.5F;
   private static final float f_31236 = 0.5F;
   private static final float f_31237 = 0.05F;
   private static final float f_31238 = 0.5F;
   private static final float f_31239 = 268.0F;
   private static final float f_31240 = 36.0F;
   private static final float f_31241 = 148.0F;
   private static final float f_31242 = 0.5F;
   private static final float f_31243 = 0.015F;
   private static final float f_31244 = 0.016F;
   private static final float f_31245 = 1.0E9F;
   private static final float f_31246 = 0.001F;
   private static final float f_31247 = 0.05F;
   private static final long f_31248 = 260L;
   private static final float f_31249 = 14.0F;
   private static final float f_31250 = 11.0F;
   private static final float f_31251 = 0.82F;
   private static final float f_31252 = 8.0E-4F;
   private static final float f_31253 = 8.0E-4F;
   private static final float f_31254 = 14.0F;
   private static final float f_31255 = 22.0F;
   private static final String f_31256 = "Ничего не играет";
   private static final float f_31257 = 13.0F;
   private static final float f_31258 = 36.0F;
   private static final float f_31259 = 54.0F;
   private static final float f_31260 = 88.0F;
   private static final float f_31261 = 148.0F;
   private static final float f_31262 = 0.02F;
   private static final float f_31263 = 0.55F;
   private static final float f_31264 = 0.5F;
   private static final float f_31265 = 6.0F;
   private static final String f_31266 = "Ничего не играет";
   private static final float f_31267 = 42.0F;
   private static final float f_31268 = 28.0F;
   private static final float f_31269 = 8.0F;
   private static final float f_31270 = 8.0F;
   private static final float f_31271 = 10.0F;
   private static final float f_31272 = 7.0F;
   private static final float f_31273 = 8.0F;
   private static final float f_31274 = 20.0F;
   private static final float f_31275 = 5.0F;
   private static final float f_31276 = 14.0F;
   private static final float f_31277 = 4.0F;
   private static final float f_31278 = 14.0F;
   private static final float f_31279 = 28.0F;
   private static final float f_31280 = 52.0F;
   private static final float f_31281 = 12.0F;
   private static final float f_31282 = 12.0F;
   private static final float f_31283 = 0.5F;
   private static final float f_31284 = 0.5F;
   private static final float f_31285 = 0.9F;
   private static final float f_31286 = 13.0F;
   private static final float f_31287 = 19.0F;
   private static final float f_31288 = 38.0F;
   private static final float f_31289 = 42.0F;
   private static final float f_31290 = 0.12F;
   private static final float f_31291 = 0.85F;
   private static final float f_31292 = 0.01F;
   private static final float f_31293 = 10.0F;
   private static final float f_31294 = 255.0F;
   private static final float f_31295 = 14.0F;
   private static final float f_31296 = 240.0F;
   private static final float f_31297 = 268.0F;
   private static final float f_31298 = 14.0F;
   private static final float f_31299 = 54.0F;
   private static final float f_31300 = 54.0F;
   private static final float f_31301 = 100.0F;
   private static final float f_31302 = 3.0F;
   private static final float f_31303 = 6.5F;
   private static final float f_31304 = 0.5F;
   private static final float f_31305 = 9.0F;
   private static final float f_31306 = 9.0F;
   private static final float f_31307 = 4.5F;
   private static final float f_31308 = 1.5F;
   private static final float f_31309 = 8.5F;
   private static final float f_31310 = 2.5F;
   private static final float f_31311 = 14.0F;
   private static final float f_31312 = 1.2F;
   private static final float f_31313 = 1.5F;
   private static final float f_31314 = 8.5F;
   private static final float f_31315 = 7.0F;
   private static final float f_31316 = 2.5F;
   private static final float f_31317 = 1.2F;
   private static final String f_31318 = "Ничего не играет";
   private static final float f_31319 = 14.0F;
   private static final float f_31320 = 52.0F;
   private static final float f_31321 = 12.0F;
   private static final float f_31322 = 176.0F;
   private static final float f_31323 = 20.0F;
   private static final float f_31324 = 40.0F;
   private static final String f_31325 = "Включите музыку в браузере";
   private static final long f_31326 = 7000L;
   private static final float f_31327 = 7000.0F;
   private static final double f_31328 = Math.PI;
   private static final double f_31329 = 2.0;
   private static final float f_31330 = 0.5F;
   private static final float f_31331 = 14.0F;
   private static final float f_31332 = 72.0F;
   private static final float f_31333 = 240.0F;
   private static final float f_31334 = 12.0F;
   private static final float f_31335 = 40.0F;
   private static final float f_31336 = 1.4F;
   private static final float f_31337 = 40.0F;
   private static final float f_31338 = 1.7F;
   private static final float f_31339 = 1.2F;
   private static final float f_31340 = 1.2F;
   private static final float f_31341 = 0.16F;
   private static final double f_31342 = 140.0;
   private static final double f_31343 = 0.55;
   private static final double f_31344 = 0.5;
   private static final double f_31345 = 0.5;
   private static final double f_31346 = 90.0;
   private static final double f_31347 = 0.31;
   private static final double f_31348 = 0.5;
   private static final double f_31349 = 0.5;
   private static final double f_31350 = 0.18;
   private static final double f_31351 = 0.82;
   private static final double f_31352 = 0.55;
   private static final double f_31353 = 0.45;
   private static final double f_31354 = 0.12;
   private static final float f_31355 = 0.12F;
   private static final float f_31356 = 2.4F;
   private static final float f_31357 = 0.5F;
   private static final float f_31358 = 14.0F;
   private static final float f_31359 = 86.0F;
   private static final float f_31360 = 240.0F;
   private static final float f_31361 = 0.14F;
   private static final float f_31362 = 3.0F;
   private static final float f_31363 = 1.5F;
   private static final float f_31364 = 3.0F;
   private static final float f_31365 = 3.0F;
   private static final float f_31366 = 1.5F;
   private static final float f_31367 = 4.0F;
   private static final float f_31368 = 2.5F;
   private static final float f_31369 = 8.0F;
   private static final float f_31370 = 8.0F;
   private static final float f_31371 = 4.0F;
   private static final String f_31372 = "live";
   private static final float f_31373 = 10.0F;
   private static final float f_31374 = 8.0F;
   private static final float f_31375 = 8.0F;
   private static final long f_31376 = 1000L;
   private static final String f_31377 = "%d:%02d";
   private static final long f_31378 = 60L;
   private static final long f_31379 = 60L;
   private static final float f_31380 = 114.0F;
   private static final double f_31381 = 22.0;
   private static final double f_31382 = 22.0;
   private static final float f_31383 = 22.0F;
   private static final float f_31384 = 22.0F;
   private static final float f_31385 = 7.0F;
   private static final float f_31386 = 0.12F;
   private static final float f_31387 = 11.0F;
   private static final float f_31388 = 11.0F;
   private static final String f_31389 = "4";
   private static final String f_31390 = "6";
   private static final String f_31391 = "7";
   private static final String f_31392 = "5";
   private static final float f_31393 = 268.0F;
   private static final float f_31394 = 14.0F;
   private static final float f_31395 = 54.0F;
   private static final float f_31396 = 114.0F;
   private static final float f_31397 = 9.5F;
   private static final float f_31398 = 4.0F;
   private static final float f_31399 = 7.0F;
   private static final double f_31400 = 62.0;
   private static final double f_31401 = 18.0;
   private static final float f_31402 = 0.35F;
   private static final float f_31403 = 0.35F;
   private static final float f_31404 = 3.0F;
   private static final float f_31405 = 54.0F;
   private static final float f_31406 = 100.0F;
   private static final float f_31407 = 9.75F;
   private static final float f_31408 = 1.5F;
   private static final float f_31409 = 54.0F;
   private static final float f_31410 = 3.0F;
   private static final float f_31411 = 1.5F;
   private static final float f_31412 = 0.14F;
   private static final float f_31413 = 3.0F;
   private static final float f_31414 = 1.5F;
   private static final float f_31415 = 3.5F;
   private static final float f_31416 = 7.0F;
   private static final float f_31417 = 7.0F;
   private static final float f_31418 = 3.5F;
   private static final String f_31419 = "!";
   private static final String f_31420 = "\"";
   private static final String f_31421 = "#";
   private static final float f_31422 = 86.0F;
   private static final float f_31423 = 268.0F;
   private static final float f_31424 = 0.5F;
   private static final float f_31425 = 24.0F;
   private static final float f_31426 = 32.0F;
   private static final float f_31427 = 0.5F;
   private static final float f_31428 = 0.55F;
   private static final float f_31429 = 114.0F;
   private static final double f_31430 = 22.0;
   private static final double f_31431 = 22.0;
   private static final float f_31432 = 86.0F;
   private static final float f_31433 = 14.0F;
   private static final float f_31434 = 3.0F;
   private static final float f_31435 = 7.0F;
   private static final double f_31436 = 246.0;
   private static final double f_31437 = 18.0;
   private static final float f_31438 = 14.0F;
   private static final float f_31439 = 240.0F;
   private static final float f_31440 = 268.0F;
   private static final float f_31441 = 14.0F;
   private static final float f_31442 = 54.0F;
   private static final float f_31443 = 9.5F;
   private static final float f_31444 = 4.0F;
   private static final float f_31445 = 7.0F;
   private static final double f_31446 = 62.0;
   private static final double f_31447 = 18.0;

   private String m_8727(int var1) {
      if (var1 < 34) {
         return f_31419;
      } else {
         return var1 < 67 ? f_31420 : f_31421;
      }
   }

   @Override
   public boolean m_1340(float var1, float var2, int var3) {
      if (this.m_8742() && var3 == 0) {
         if (!Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_11518, this.m_3993(), this.m_1757(), this.m_1758())) {
            return false;
         }

         var1 = Class_qyFZUkNc6oUs6ojL.m_8353(var1, this.f_11518);
         var2 = Class_qyFZUkNc6oUs6ojL.m_8352(var2, this.m_3993());
         if (!this.m_8750()) {
            return false;
         }

         MusicPlayer var4 = m_8754();
         if (var4 == null) {
            return false;
         }

         float var5 = this.m_3993() + f_31429;

         for (int var6 = 0; var6 < 3; var6++) {
            if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.m_8759(var6), var5, f_31430, f_31431)) {
               switch (var6) {
                  case 0:
                     var4.m_8696();
                     break;
                  case 1:
                     var4.m_8694();
                     break;
                  default:
                     var4.m_8692();
               }

               return true;
            }
         }

         Class_JG8EQkxMGm8yNbUr var12 = Class_JG8EQkxMGm8yNbUr.m_3226();
         float var7 = this.m_3993() + f_31432;
         if (var12.m_3202() && Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_11518 + f_31433 - f_31434, var7 - f_31435, f_31436, f_31437)) {
            this.f_31230 = Class_sntt8iARozMvczqs.tEgGAVG50r7cdOtU.SEEK;
            this.f_31231 = m_8747(var1, this.f_11518 + f_31438, f_31439);
            return true;
         } else {
            float var8 = this.f_11518 + f_31440 - f_31441 - f_31442;
            float var9 = var5 + f_31443;
            if (var12.m_3225() && Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var8 - f_31444, var9 - f_31445, f_31446, f_31447)) {
               this.f_31230 = Class_sntt8iARozMvczqs.tEgGAVG50r7cdOtU.VOLUME;
               this.m_8739(var12, var1);
               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private int m_8728() {
      return Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT);
   }

   @Override
   public void m_1333() {
      this.f_31230 = Class_sntt8iARozMvczqs.tEgGAVG50r7cdOtU.NONE;
      this.f_31221 = this.f_31222 = 0.0F;
      this.f_31225 = 0L;
   }

   private float m_8729(Class_JG8EQkxMGm8yNbUr var1) {
      String var2 = var1.m_3213() ? var1.m_3237() : f_31256;
      float var3 = Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var2, f_31257, 0.0F);
      float var4 = var1.m_3245() ? f_31258 : 0.0F;
      return Math.clamp(var3 + f_31259 + var4, f_31260, f_31261 + var4);
   }

   private void m_8730(float var1, float var2, float var3, float var4, Class_JG8EQkxMGm8yNbUr var5, float var6) {
      this.m_8760(var1, var2, var3, var4, var5, var6);
   }

   public Class_sntt8iARozMvczqs() {
      super(f_31232, 0.0F, 0.0F, f_31233, f_31234);
   }

   private void m_8731(float var1) {
      boolean var2 = this.f_31226 != 0L && System.currentTimeMillis() - this.f_31226 < f_31248;
      boolean var3 = (this.f_31227 || var2) && f_11537.gui.screen() instanceof ChatScreen;
      float var4 = var3 ? 1.0F : 0.0F;
      float var5 = var3 ? f_31249 : f_31250;
      this.f_31221 = m_8740(this.f_31221, var4, var5, var1);
      this.f_31222 = m_8740(this.f_31222, var3 ? 1.0F : 0.0F, var5 * f_31251, var1);
      if (Math.abs(this.f_31221 - var4) < f_31252) {
         this.f_31221 = var4;
      }

      if (Math.abs(this.f_31222 - (var3 ? 1.0F : 0.0F)) < f_31253) {
         this.f_31222 = var3 ? 1.0F : 0.0F;
      }
   }

   private void m_8732(float var1, float var2) {
      this.f_31227 = Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_11518, this.m_3993(), this.m_4009(), this.m_4010())
         || this.f_31230 != Class_sntt8iARozMvczqs.tEgGAVG50r7cdOtU.NONE;
      if (this.f_31227) {
         this.f_31226 = 0L;
      } else if (this.f_31226 == 0L) {
         this.f_31226 = System.currentTimeMillis();
      }
   }

   private static float m_8733(float var0, float var1, float var2) {
      return var0 + (var1 - var0) * var2;
   }

   private void m_8734(float var1, float var2, int var3) {
      Class_Ssh31B3ljfKeWsvS.m_4817(var1 - f_31303, var2 + f_31304, f_31305, f_31306, f_31307, var3);
      Class_Ssh31B3ljfKeWsvS.m_4817(var1 + f_31308, var2 - f_31309, f_31310, f_31311, f_31312, var3);
      Class_Ssh31B3ljfKeWsvS.m_4817(var1 + f_31313, var2 - f_31314, f_31315, f_31316, f_31317, var3);
   }

   private void m_8735(Class_JG8EQkxMGm8yNbUr var1) {
      float var2 = m_8733(this.f_11518 + f_31275, this.f_11518 + f_31276, this.f_31221);
      float var3 = m_8733(this.m_3993() + f_31277, this.m_3993() + f_31278 + 2.0F, this.f_31221);
      float var4 = m_8733(f_31279, f_31280, this.f_31221);
      Identifier var5 = var1.m_3224();
      Class_Ssh31B3ljfKeWsvS.m_4817(var2, var3, var4, var4, f_31281, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_BACKGROUND_TWO));
      if (var5 != null) {
         Class_Ssh31B3ljfKeWsvS.m_4806(var2, var3, var4, var4, f_31282, new Vector4f(1.0F), -1, var5);
      } else {
         this.m_8734(var2 + var4 * f_31283, var3 + var4 * f_31284, Class_BftdentXEtGbugJw.m_2306(this.m_8744(), f_31285));
      }
   }

   private static String m_8736(long var0) {
      long var2 = Math.max(0L, var0) / f_31376;
      return String.format(f_31377, var2 / f_31378, var2 % f_31379);
   }

   private void m_8737(Class_JG8EQkxMGm8yNbUr var1) {
      String var2 = var1.m_3213() ? var1.m_3237() : f_31318;
      String var3 = var1.m_3213() ? this.m_8738(var1) : this.m_8752(var1);
      float var4 = this.f_11518 + f_31319 + f_31320 + f_31321;
      float var5 = f_31322;
      this.m_8758(var2, var4, this.m_3993() + f_31323, 14, var5, this.m_8748());
      this.m_8758(var3, var4, this.m_3993() + f_31324, 12, var5, this.m_8728());
   }

   private String m_8738(Class_JG8EQkxMGm8yNbUr var1) {
      String var2 = var1.m_3239();
      return var2.isBlank() ? var1.m_3223() : var2;
   }

   private void m_8739(Class_JG8EQkxMGm8yNbUr var1, float var2) {
      if (this.f_31230 == Class_sntt8iARozMvczqs.tEgGAVG50r7cdOtU.SEEK) {
         this.f_31231 = m_8747(var2, this.f_11518 + f_31295, f_31296);
      } else {
         MusicPlayer var3 = m_8754();
         if (var3 != null) {
            float var4 = this.f_11518 + f_31297 - f_31298 - f_31299;
            var3.m_8695(Math.round(m_8747(var2, var4, f_31300) * f_31301));
         }
      }
   }

   private static float m_8740(float var0, float var1, float var2, float var3) {
      return var0 + (var1 - var0) * (1.0F - (float)Math.exp(-var2 * var3));
   }

   private void m_8741(float var1, float var2, float var3, Class_JG8EQkxMGm8yNbUr var4, float var5) {
      if (!(var3 <= f_31262)) {
         float var6 = m_8761(0.0F, f_31263, var3);
         float var7 = this.m_3993() + var2 * f_31264;
         float var8 = (1.0F - var6) * f_31265;
         String var9 = var4.m_3213() ? var4.m_3237() : f_31266;
         float var10 = this.f_11518 + f_31267;
         boolean var11 = var4.m_3245();
         float var12 = var11 ? f_31268 : 0.0F;
         float var13 = this.f_11518 + var1 - f_31269 - var12;
         float var14 = Math.max(1.0F, var13 - (var11 ? f_31270 : f_31271) - var10);
         this.m_8745(var9, var10, var7 - f_31272 - var8, var14, Class_BftdentXEtGbugJw.m_2306(this.m_8748(), var6), var5);
         if (var11) {
            this.m_8730(var13, this.m_3993() + f_31273, var12, f_31274, var4, var6);
         }
      }
   }

   @Override
   public void m_3992() {
      if (this.f_31230 == Class_sntt8iARozMvczqs.tEgGAVG50r7cdOtU.SEEK) {
         Class_JG8EQkxMGm8yNbUr var1 = Class_JG8EQkxMGm8yNbUr.m_3226();
         long var2 = var1.m_3252();
         if (var2 > 0L) {
            var1.m_3244((long)((float)var2 * this.f_31231));
         }
      }

      this.f_31230 = Class_sntt8iARozMvczqs.tEgGAVG50r7cdOtU.NONE;
   }

   private boolean m_8742() {
      MusicPlayer var1 = m_8754();
      return var1 != null && var1.m_776();
   }

   private void m_8743(String var1, float var2, float var3, int var4, int var5) {
      float var6 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9591(), var1, var4);
      float var7 = Class_Ssh31B3ljfKeWsvS.m_4863(Class_y1y6QpONhWEUIdEB.m_9591(), var1, var3, var4);
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9591(), var1, var2 - var6 * f_31427, var7, var4, var5);
   }

   private int m_8744() {
      return Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
   }

   private void m_8745(String var1, float var2, float var3, float var4, int var5, float var6) {
      if (!var1.equals(this.f_31224)) {
         this.f_31224 = var1;
         this.f_31223 = 0.0F;
      }

      float var7 = Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var1, f_31286, 0.0F);
      Class_Ssh31B3ljfKeWsvS.m_4860(var2, var3 - 2.0F, var4, f_31287);
      if (var7 <= var4) {
         this.f_31223 = 0.0F;
         Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var1, var2, var3, 13, var5);
      } else {
         this.f_31223 = this.f_31223 + var6 * f_31288;
         float var8 = var7 + f_31289;
         float var9 = var2 + this.f_31223 % var8;
         int var10 = (int)Math.ceil(var4 / var8) + 3;

         for (int var11 = -var10; var11 <= 1; var11++) {
            Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var1, var9 + var11 * var8, var3, 13, var5);
         }
      }

      Class_Ssh31B3ljfKeWsvS.m_4828();
   }

   private void m_8746(Class_JG8EQkxMGm8yNbUr var1, float var2, float var3) {
      float var4 = this.m_3993() + f_31380;

      for (int var5 = 0; var5 < 3; var5++) {
         float var6 = this.m_8759(var5);
         boolean var7 = Class_FvJXUGWpZo3zYBW4.m_2697(var2, var3, var6, var4, f_31381, f_31382);
         int var8 = var7 ? this.m_8744() : this.m_8748();
         if (var7) {
            Class_Ssh31B3ljfKeWsvS.m_4817(var6, var4, f_31383, f_31384, f_31385, Class_BftdentXEtGbugJw.m_2306(this.m_8744(), f_31386));
         }

         float var9 = var6 + f_31387;
         float var10 = var4 + f_31388;
         switch (var5) {
            case 0:
               this.m_8743(f_31389, var9, var10, 10, var8);
               break;
            case 1:
               this.m_8743(var1.m_3245() ? f_31390 : f_31391, var9, var10, 10, var8);
               break;
            default:
               this.m_8743(f_31392, var9, var10, 10, var8);
         }
      }
   }

   private static float m_8747(float var0, float var1, float var2) {
      return Math.clamp((var0 - var1) / var2, 0.0F, 1.0F);
   }

   private int m_8748() {
      return Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT);
   }

   private void m_8749(Class_JG8EQkxMGm8yNbUr var1) {
      float var2 = this.f_11518 + f_31358;
      float var3 = this.m_3993() + f_31359;
      float var4 = f_31360;
      long var5 = var1.m_3252();
      long var7 = var1.m_3218();
      float var9 = var5 > 0L ? Math.clamp((float)var7 / (float)var5, 0.0F, 1.0F) : 0.0F;
      if (this.f_31230 == Class_sntt8iARozMvczqs.tEgGAVG50r7cdOtU.SEEK) {
         var9 = this.f_31231;
         var7 = (long)((float)var5 * this.f_31231);
      }

      int var10 = Class_BftdentXEtGbugJw.m_2306(this.m_8748(), f_31361);
      int var11 = this.m_8744();
      Class_Ssh31B3ljfKeWsvS.m_4817(var2, var3, var4, f_31362, f_31363, var10);
      if (var9 > 0.0F) {
         float var12 = Math.max(f_31364, var4 * var9);
         Class_Ssh31B3ljfKeWsvS.m_4817(var2, var3, var12, f_31365, f_31366, var11);
         Class_Ssh31B3ljfKeWsvS.m_4817(var2 + var12 - f_31367, var3 - f_31368, f_31369, f_31370, f_31371, var11);
      }

      String var15 = m_8736(var7);
      String var13 = var5 > 0L ? m_8736(var5 - var7) + "" : f_31372;
      float var14 = Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var13, f_31373, 0.0F);
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var15, var2, var3 + f_31374, 10, this.m_8728());
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var13, var2 + var4 - var14, var3 + f_31375, 10, this.m_8728());
   }

   private boolean m_8750() {
      return this.f_31221 > f_31428;
   }

   private float m_8751() {
      long var1 = System.nanoTime();
      float var3 = this.f_31225 == 0L ? f_31244 : (float)(var1 - this.f_31225) / f_31245;
      this.f_31225 = var1;
      return Math.clamp(var3, f_31246, f_31247);
   }

   private String m_8752(Class_JG8EQkxMGm8yNbUr var1) {
      String var2 = var1.m_3208();
      return var2.isBlank() ? f_31325 : var2;
   }

   public void m_8753(Class_bhRaN0YSSLQRYjPo var1) {
      if (!this.m_8742()) {
         this.f_31221 = this.f_31222 = 0.0F;
         this.f_31225 = 0L;
         this.m_4012(0.0F);
         this.m_4007(0.0F);
      } else {
         float var2 = var1.m_6082();
         float var3 = var1.m_6084();
         float var4 = Class_qyFZUkNc6oUs6ojL.m_8353(var2, this.m_3998());
         float var5 = Class_qyFZUkNc6oUs6ojL.m_8352(var3, this.m_3993());
         float var6 = Class_qyFZUkNc6oUs6ojL.m_8354();
         float var7 = this.m_8751();
         float var8 = f_11537.getWindow().getScreenWidth();
         Class_JG8EQkxMGm8yNbUr var9 = Class_JG8EQkxMGm8yNbUr.m_3226();
         float var10 = this.m_8729(var9);
         float var11 = this.m_4009() > 1.0F ? this.m_4009() : var10;
         float var12 = var11 * var6;
         if (!Float.isFinite(this.f_31228)) {
            this.f_31228 = Float.isFinite(this.f_11518) && !(this.f_11518 <= 1.0F) ? this.f_11518 + var12 * f_31236 : var8 * f_31235;
         } else if (Float.isFinite(this.f_31229) && Math.abs(this.f_11518 - this.f_31229) > f_31237) {
            this.f_31228 = this.f_11518 + var12 * f_31238;
         }

         this.m_8732(var4, var5);
         this.m_8731(var7);
         float var13 = m_8733(var10, f_31239, this.f_31221);
         float var14 = m_8733(f_31240, f_31241, this.f_31221);
         float var15 = var13 * var6;
         this.f_11518 = Math.clamp(this.f_31228 - var15 * f_31242, 0.0F, Math.max(0.0F, var8 - var15));
         this.f_31229 = this.f_11518;
         this.m_4012(var13);
         this.m_4007(var14);
         this.m_4013();

         try {
            Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
            float var16 = Class_qyFZUkNc6oUs6ojL.m_8353(var2, this.m_3998());
            float var17 = Class_qyFZUkNc6oUs6ojL.m_8352(var3, this.m_3993());
            if (this.f_31230 != Class_sntt8iARozMvczqs.tEgGAVG50r7cdOtU.NONE) {
               this.m_8739(var9, var16);
            }

            this.m_8757(var13, var14);
            Class_Ssh31B3ljfKeWsvS.m_4860(this.f_11518, this.m_3993(), var13, var14);
            this.m_8735(var9);
            this.m_8741(var13, var14, 1.0F - this.f_31222, var9, var7);
            if (this.f_31222 > f_31243) {
               this.m_8756(var9, var16, var17);
            }

            Class_Ssh31B3ljfKeWsvS.m_4828();
         } finally {
            this.m_4005();
         }
      }
   }

   private static MusicPlayer m_8754() {
      return DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null
         ? DimasikClient.m_9057().m_9049().m_2801().m_3582()
         : null;
   }

   private void m_8755(Class_JG8EQkxMGm8yNbUr var1) {
      float var2 = this.f_11518 + f_31331;
      float var3 = this.m_3993() + f_31332;
      float var4 = f_31333;
      this.m_8760(var2, var3, var4, f_31334, var1, 1.0F);
   }

   private void m_8756(Class_JG8EQkxMGm8yNbUr var1, float var2, float var3) {
      float var4 = m_8761(f_31290, f_31291, this.f_31222);
      if (!(var4 <= f_31292)) {
         float var5 = (1.0F - var4) * f_31293;
         float var6 = this.f_11519;
         this.f_11519 += var5;
         Class_Ssh31B3ljfKeWsvS.m_4864(f_31294 * var4);

         try {
            this.m_8737(var1);
            this.m_8755(var1);
            this.m_8749(var1);
            this.m_8746(var1, var2, var3);
            this.m_8762(var1, var2, var3);
         } finally {
            Class_Ssh31B3ljfKeWsvS.m_4844();
            this.f_11519 = var6;
         }
      }
   }

   private void m_8757(float var1, float var2) {
      float var3 = m_8733(f_31254, f_31255, this.f_31221);
      Class_Ssh31B3ljfKeWsvS.m_4848(this.f_11518, this.m_3993(), var1, var2, var3);
   }

   private void m_8758(String var1, float var2, float var3, int var4, float var5, int var6) {
      if (var1 != null && !var1.isEmpty()) {
         float var7 = Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var1, var4, 0.0F);
         float var8 = 0.0F;
         if (var7 > var5) {
            float var9 = var7 - var5;
            float var10 = (float)(System.currentTimeMillis() % f_31326) / f_31327;
            float var11 = (1.0F - (float)Math.cos(var10 * f_31328 * f_31329)) * f_31330;
            var8 = -var9 * var11;
         }

         Class_Ssh31B3ljfKeWsvS.m_4860(var2, var3 - 2.0F, var5, var4 + 6);
         Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var1, var2 + var8, var3, var4, var6);
         Class_Ssh31B3ljfKeWsvS.m_4828();
      }
   }

   private float m_8759(int var1) {
      float var2 = f_31422;
      return this.f_11518 + (f_31423 - var2) * f_31424 - f_31425 + var1 * f_31426;
   }

   private void m_8760(float var1, float var2, float var3, float var4, Class_JG8EQkxMGm8yNbUr var5, float var6) {
      if (!(var3 <= 2.0F) && !(var4 <= 2.0F)) {
         float var7 = var3 < f_31335 ? f_31336 : 2.0F;
         float var8 = var3 < f_31337 ? f_31338 : 2.0F;
         int var9 = Math.max(4, Math.min(18, (int)((var3 + var7) / (var8 + var7))));
         float var10 = (var3 - var7 * (var9 - 1)) / var9;
         if (var10 < f_31339) {
            var9 = Math.max(4, (int)((var3 + var7) / (f_31340 + var7)));
            var10 = (var3 - var7 * (var9 - 1)) / var9;
         }

         long var11 = System.currentTimeMillis();
         boolean var13 = var5.m_3245() && var5.m_3213();
         int var14 = (var5.m_3237() + var5.m_3239()).hashCode();
         int var15 = Class_BftdentXEtGbugJw.m_2306(this.m_8744(), var6);
         int var16 = Class_BftdentXEtGbugJw.m_2306(this.m_8748(), f_31341 * var6);
         Class_Ssh31B3ljfKeWsvS.m_4860(var1, var2, var3, var4);

         try {
            for (int var17 = 0; var17 < var9; var17++) {
               double var18 = Math.sin(var11 / f_31342 + var17 * f_31343 + (var14 & 15)) * f_31344 + f_31345;
               double var20 = Math.sin(var11 / f_31346 + var17 * f_31347) * f_31348 + f_31349;
               float var22 = var13 ? (float)Math.clamp(f_31350 + f_31351 * (f_31352 * var18 + f_31353 * var20), f_31354, 1.0) : f_31355;
               float var23 = Math.max(f_31356, var4 * var22);
               float var24 = var1 + var17 * (var10 + var7);
               float var25 = var2 + var4 - var23;
               Class_Ssh31B3ljfKeWsvS.m_4817(var24, var25, var10, var23, Math.min(2.0F, var10 * f_31357), var13 ? var15 : var16);
            }
         } finally {
            Class_Ssh31B3ljfKeWsvS.m_4828();
         }
      }
   }

   private static float m_8761(float var0, float var1, float var2) {
      float var3 = Math.clamp((var2 - var0) / (var1 - var0), 0.0F, 1.0F);
      return var3 * var3 * (f_31302 - 2.0F * var3);
   }

   private void m_8762(Class_JG8EQkxMGm8yNbUr var1, float var2, float var3) {
      float var4 = this.f_11518 + f_31393 - f_31394 - f_31395;
      float var5 = this.m_3993() + f_31396 + f_31397;
      boolean var6 = var1.m_3225();
      boolean var7 = var6
         && (
            this.f_31230 == Class_sntt8iARozMvczqs.tEgGAVG50r7cdOtU.VOLUME
               || Class_FvJXUGWpZo3zYBW4.m_2697(var2, var3, var4 - f_31398, var5 - f_31399, f_31400, f_31401)
         );
      int var8 = Class_BftdentXEtGbugJw.m_2306(var7 ? this.m_8744() : this.m_8728(), var6 ? 1.0F : f_31402);
      int var9 = Class_BftdentXEtGbugJw.m_2306(this.m_8744(), var6 ? 1.0F : f_31403);
      float var10 = Math.max(f_31404, f_31405 * (var1.m_3233() / f_31406));
      this.m_8743(this.m_8727(var1.m_3233()), var4 - f_31407, var5 + f_31408, 9, var8);
      Class_Ssh31B3ljfKeWsvS.m_4817(var4, var5, f_31409, f_31410, f_31411, Class_BftdentXEtGbugJw.m_2306(this.m_8748(), f_31412));
      Class_Ssh31B3ljfKeWsvS.m_4817(var4, var5, var10, f_31413, f_31414, var9);
      if (var6) {
         Class_Ssh31B3ljfKeWsvS.m_4817(var4 + var10 - f_31415, var5 - 2.0F, f_31416, f_31417, f_31418, var9);
      }
   }

   private enum tEgGAVG50r7cdOtU {
      NONE,
      SEEK,
      VOLUME;
   }
}
