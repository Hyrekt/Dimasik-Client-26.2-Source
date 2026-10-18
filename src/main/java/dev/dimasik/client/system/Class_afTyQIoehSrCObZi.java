package dev.dimasik.client.system;

import dev.dimasik.client.module.misc.ClientSounds;
import dev.dimasik.client.setting.impl.ColorSetting;
import java.awt.Color;
import java.util.Locale;
import net.minecraft.client.Minecraft;
import org.joml.Vector4f;
import org.joml.Vector4i;
import org.lwjgl.glfw.GLFW;

public class Class_afTyQIoehSrCObZi extends Class_c7bxavYluZ02uW8X<ColorSetting> {
   private boolean f_17276;
   private boolean f_17277;
   private boolean f_17278;
   private boolean f_17279;
   private float f_17280;
   private float f_17281;
   private float f_17282;
   private float f_17283;
   private int f_17284;
   private final Class_w8fCJQ5ZtH5lQbWc f_17285;
   private final Class_w8fCJQ5ZtH5lQbWc f_17286;
   private final Class_w8fCJQ5ZtH5lQbWc f_17287;
   private final Class_w8fCJQ5ZtH5lQbWc f_17288;
   private final Class_w8fCJQ5ZtH5lQbWc f_17289;
   private final Class_w8fCJQ5ZtH5lQbWc f_17290;
   private final Class_w8fCJQ5ZtH5lQbWc f_17291;
   private final Class_w8fCJQ5ZtH5lQbWc f_17292;
   private final Class_w8fCJQ5ZtH5lQbWc f_17293;
   private final Class_w8fCJQ5ZtH5lQbWc f_17294;
   private static final float f_17295 = 20.0F;
   private static final float f_17296 = 10.0F;
   private static final float f_17297 = 10.0F;
   private static final float f_17298 = 4.0F;
   private static final float f_17299 = 3.0F;
   private static final float f_17300 = 3.0F;
   private static final float f_17301 = 4.0F;
   private static final float f_17302 = 4.0F;
   private static final float f_17303 = 8.0F;
   private static final float f_17304 = 8.0F;
   private static final float f_17305 = 8.0F;
   private static final String f_17306 = "#%02X%02X%02X%02X";
   private static final int f_17307 = -16777216;
   private static final float f_17308 = 0.65F;
   private static final double f_17309 = 255.0;
   private static final float f_17310 = 0.8F;
   private static final float f_17311 = 22.0F;
   private static final float f_17312 = 12.0F;
   private static final double f_17313 = 300.0;
   private static final double f_17314 = 0.5;
   private static final double f_17315 = 0.5;
   private static final float f_17316 = 1.5F;
   private static final float f_17317 = 5.0F;
   private static final float f_17318 = 16.0F;
   private static final float f_17319 = 7.0F;
   private static final float f_17320 = 0.3F;
   private static final float f_17321 = 0.35F;
   private static final float f_17322 = 0.3F;
   private static final float f_17323 = 0.25F;
   private static final float f_17324 = 0.55F;
   private static final float f_17325 = 0.01F;
   private static final float f_17326 = 8.0F;
   private static final float f_17327 = 0.01F;
   private static final double f_17328 = 255.0;
   private static final float f_17329 = 0.7F;
   private static final float f_17330 = 20.0F;
   private static final float f_17331 = 0.01F;
   private static final float f_17332 = 255.0F;
   private static final float f_17333 = 10.0F;
   private static final float f_17334 = 25.0F;
   private static final int f_17335 = -16777216;
   private static final int f_17336 = 16777215;
   private static final int f_17337 = -16777216;
   private static final float f_17338 = 150.0F;
   private static final float f_17339 = 16.0F;
   private static final float f_17340 = 0.3F;
   private static final float f_17341 = 150.0F;
   private static final float f_17342 = 6.0F;
   private static final float f_17343 = 150.0F;
   private static final float f_17344 = 6.0F;
   private static final float f_17345 = 0.35F;
   private static final float f_17346 = 6.0F;
   private static final float f_17347 = 6.0F;
   private static final float f_17348 = 138.0F;
   private static final float f_17349 = 80.0F;
   private static final float f_17350 = 3.0F;
   private static final int f_17351 = -16777216;
   private static final int f_17352 = -16777216;
   private static final float f_17353 = 6.0F;
   private static final float f_17354 = 6.0F;
   private static final float f_17355 = 92.0F;
   private static final float f_17356 = 6.0F;
   private static final float f_17357 = 138.0F;
   private static final double f_17358 = 255.0;
   private static final String f_17359 = "hud/hue";
   private static final int f_17360 = 16777215;
   private static final float f_17361 = 6.0F;
   private static final float f_17362 = 6.0F;
   private static final float f_17363 = 103.0F;
   private static final float f_17364 = 6.0F;
   private static final float f_17365 = 138.0F;
   private static final float f_17366 = 6.0F;
   private static final float f_17367 = 138.0F;
   private static final float f_17368 = 6.0F;
   private static final float f_17369 = 80.0F;
   private static final float f_17370 = 12.0F;
   private static final float f_17371 = 4.0F;
   private static final float f_17372 = 6.0F;
   private static final float f_17373 = 0.4F;
   private static final float f_17374 = 0.3F;
   private static final float f_17375 = 4.0F;
   private static final float f_17376 = 4.0F;
   private static final float f_17377 = 1.5F;
   private static final float f_17378 = 6.0F;
   private static final float f_17379 = 138.0F;
   private static final float f_17380 = 3.0F;
   private static final float f_17381 = 10.0F;
   private static final float f_17382 = 0.01F;
   private static final float f_17383 = 90.0F;
   private static final float f_17384 = 5.0F;
   private static final float f_17385 = 0.6F;
   private static final float f_17386 = 90.0F;
   private static final float f_17387 = 6.0F;
   private static final float f_17388 = 138.0F;
   private static final float f_17389 = 3.0F;
   private static final float f_17390 = 10.0F;
   private static final float f_17391 = 0.01F;
   private static final float f_17392 = 101.0F;
   private static final float f_17393 = 5.0F;
   private static final float f_17394 = 0.6F;
   private static final float f_17395 = 101.0F;
   private static final float f_17396 = 6.0F;
   private static final float f_17397 = 66.0F;
   private static final String f_17398 = "Копировать";
   private static final float f_17399 = 78.0F;
   private static final float f_17400 = 66.0F;
   private static final String f_17401 = "Вставить";
   private static final float f_17402 = 0.72F;
   private static final float f_17403 = 0.82F;
   private static final float f_17404 = 6.0F;
   private static final float f_17405 = 6.0F;
   private static final double f_17406 = 138.0;
   private static final double f_17407 = 80.0;
   private static final float f_17408 = 6.0F;
   private static final float f_17409 = 92.0F;
   private static final double f_17410 = 138.0;
   private static final double f_17411 = 6.0;
   private static final float f_17412 = 6.0F;
   private static final float f_17413 = 103.0F;
   private static final double f_17414 = 138.0;
   private static final double f_17415 = 6.0;
   private static final float f_17416 = 6.0F;
   private static final double f_17417 = 66.0;
   private static final double f_17418 = 18.0;
   private static final float f_17419 = 78.0F;
   private static final double f_17420 = 66.0;
   private static final double f_17421 = 18.0;
   private static final float f_17422 = 16.0F;
   private static final double f_17423 = 16.0;
   private static final double f_17424 = 16.0;
   private static final float f_17425 = 6.0F;
   private static final float f_17426 = 138.0F;
   private static final float f_17427 = 6.0F;
   private static final float f_17428 = 80.0F;
   private static final float f_17429 = 6.0F;
   private static final float f_17430 = 138.0F;
   private static final float f_17431 = 6.0F;
   private static final float f_17432 = 138.0F;
   private static final int f_17433 = 16777215;
   private static final float f_17434 = 255.0F;
   private static final float f_17435 = 255.0F;
   private static final float f_17436 = 112.0F;
   private static final float f_17437 = 150.0F;
   private static final float f_17438 = 24.0F;
   private static final float f_17439 = 25.0F;
   private static final float f_17440 = 114.0F;
   private static final float f_17441 = 103.0F;
   private static final double f_17442 = 18.0;
   private static final float f_17443 = 0.65F;
   private static final float f_17444 = 0.8F;
   private static final float f_17445 = 18.0F;
   private static final float f_17446 = 4.0F;
   private static final float f_17447 = 4.0F;
   private static final String f_17448 = "#%02X%02X%02X%02X";
   private static final String f_17449 = "#%02X%02X%02X";
   private static final float f_17450 = 0.88F;
   private static final String f_17451 = "_";
   private static final String f_17452 = " ";
   private static final String f_17453 = "0X";
   private static final String f_17454 = "[0-9A-F]{8}";
   private static final int f_17455 = -16777216;
   private static final int f_17456 = 16777215;
   private static final String f_17457 = "#";
   private static final String f_17458 = "[0-9A-F]{6}|[0-9A-F]{8}";
   private static final double f_17459 = 150.0;
   private static final float f_17460 = 25.0F;

   @Override
   public void m_2317(float var1, float var2, float var3) {
      this.f_17285.m_9283(this.f_17276 ? 1.0F : 0.0F);
      float var4 = this.f_17285.m_9288();
      if (!(var4 <= f_17331)) {
         Class_Ssh31B3ljfKeWsvS.m_4864(f_17332 * var4);
         if (this.f_17277) {
            this.m_5928(var1, var2);
         }

         if (this.f_17278) {
            this.m_5935(var1);
         }

         if (this.f_17279) {
            this.m_5940(var1);
         }

         this.f_17292.m_9283(this.f_17277 ? 1.0F : 0.0F);
         this.f_17293.m_9283(this.f_17278 ? 1.0F : 0.0F);
         this.f_17294.m_9283(this.f_17279 ? 1.0F : 0.0F);
         float var5 = this.m_5938();
         float var6 = this.m_5926() - f_17333 * (1.0F - var4);
         float var7 = var6 + this.m_5939();
         float var8 = this.m_5939() + f_17334;
         int var9 = f_17335 | Color.HSBtoRGB(this.f_17280, 1.0F, 1.0F) & f_17336;
         int var10 = this.f_18147.m_8768() | f_17337;
         Class_Ssh31B3ljfKeWsvS.m_4859(var5, var6, f_17338, var8, f_17339, Class_BftdentXEtGbugJw.m_2306(var10, f_17340 * var4));
         Class_Ssh31B3ljfKeWsvS.m_4817(var5, var6, f_17341, var8, f_17342, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.BACKGROUND));
         Class_Ssh31B3ljfKeWsvS.m_4854(
            var5,
            var6,
            f_17343,
            var8,
            1.0F,
            f_17344,
            Class_BftdentXEtGbugJw.m_2302(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE), var10, f_17345)
         );
         Class_Ssh31B3ljfKeWsvS.m_4843(var5 + f_17346, var6 + f_17347, f_17348, f_17349, f_17350, new Vector4i(f_17351, -1, f_17352, var9));
         float var11 = f_17353 + this.f_17293.m_9288() * 2.0F;
         Class_Ssh31B3ljfKeWsvS.m_4816(
            var5 + f_17354,
            var6 + f_17355 - (var11 - f_17356) / 2.0F,
            f_17357,
            var11,
            new Vector4f(0.0F),
            Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_17358),
            Class_wHRRCm2tlLY7DN4I.m_9311(f_17359)
         );
         if (this.f_18147.m_2447()) {
            int var12 = this.f_18147.m_8768() & f_17360;
            float var13 = f_17361 + this.f_17294.m_9288() * 2.0F;
            Class_Ssh31B3ljfKeWsvS.m_4843(
               var5 + f_17362, var6 + f_17363 - (var13 - f_17364) / 2.0F, f_17365, var13, 2.0F, new Vector4i(var10, var10, var12, var12)
            );
         }

         float var22 = var5 + f_17366 + this.f_17281 * f_17367;
         float var23 = var6 + f_17368 + (1.0F - this.f_17282) * f_17369;
         float var14 = f_17370 + this.f_17292.m_9288() * f_17371;
         float var15 = var14 / 2.0F;
         Class_Ssh31B3ljfKeWsvS.m_4859(
            var22 - var15, var23 - var15, var14, var14, f_17372, Class_BftdentXEtGbugJw.m_2306(var10, f_17373 + f_17374 * this.f_17292.m_9288())
         );
         Class_Ssh31B3ljfKeWsvS.m_4817(var22 - var15 + 2.0F, var23 - var15 + 2.0F, var14 - f_17375, var14 - f_17376, var15 - 2.0F, var10);
         Class_Ssh31B3ljfKeWsvS.m_4854(var22 - var15, var23 - var15, var14, var14, f_17377, var15 - 1.0F, -1);
         float var16 = var5 + f_17378 + this.f_17280 * f_17379;
         float var17 = f_17380 + this.f_17293.m_9288() * 2.0F;
         float var18 = f_17381 + this.f_17293.m_9288() * 2.0F;
         if (this.f_17293.m_9288() > f_17382) {
            Class_Ssh31B3ljfKeWsvS.m_4859(
               var16 - var17 / 2.0F,
               var6 + f_17383 - this.f_17293.m_9288(),
               var17,
               var18,
               f_17384,
               Class_BftdentXEtGbugJw.m_2306(var9, f_17385 * this.f_17293.m_9288())
            );
         }

         Class_Ssh31B3ljfKeWsvS.m_4817(var16 - var17 / 2.0F, var6 + f_17386 - this.f_17293.m_9288(), var17, var18, var17 / 2.0F, -1);
         if (this.f_18147.m_2447()) {
            float var19 = var5 + f_17387 + (1.0F - this.f_17283) * f_17388;
            float var20 = f_17389 + this.f_17294.m_9288() * 2.0F;
            float var21 = f_17390 + this.f_17294.m_9288() * 2.0F;
            if (this.f_17294.m_9288() > f_17391) {
               Class_Ssh31B3ljfKeWsvS.m_4859(
                  var19 - var20 / 2.0F,
                  var6 + f_17392 - this.f_17294.m_9288(),
                  var20,
                  var21,
                  f_17393,
                  Class_BftdentXEtGbugJw.m_2306(var10, f_17394 * this.f_17294.m_9288())
               );
            }

            Class_Ssh31B3ljfKeWsvS.m_4817(var19 - var20 / 2.0F, var6 + f_17395 - this.f_17294.m_9288(), var20, var21, var20 / 2.0F, -1);
         }

         this.m_5929(var1, var2, var5 + f_17396, var7, f_17397, Class_0p152hWffX3ippAf.m_801(f_17398), this.f_17290.m_9288());
         this.m_5929(var1, var2, var5 + f_17399, var7, f_17400, Class_0p152hWffX3ippAf.m_801(f_17401), this.f_17291.m_9288());
         Class_Ssh31B3ljfKeWsvS.m_4844();
      }
   }

   private float m_5926() {
      return this.m_6146(this.f_18144 + f_17438, this.m_5939() + f_17439);
   }

   public boolean m_5927(float var1, float var2) {
      return Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_18143 + this.f_18145 - f_17422, this.f_18144 + 1.0F, f_17423, f_17424);
   }

   private void m_5928(float var1, float var2) {
      this.f_17281 = Math.clamp((var1 - this.m_5938() - f_17425) / f_17426, 0.0F, 1.0F);
      this.f_17282 = 1.0F - Math.clamp((var2 - this.m_5926() - f_17427) / f_17428, 0.0F, 1.0F);
      this.m_5934();
   }

   @Override
   public void m_701(float var1, float var2, float var3) {
      this.f_17286.m_9283(!this.m_5927(var1, var2) && !this.f_17276 ? 0.0F : 1.0F);
      this.f_17287.m_9283(1.0F);
      this.f_17288.m_9283(0.0F);
      this.f_17289.m_9283(0.0F);
      this.f_17290.m_9283(0.0F);
      this.f_17291.m_9283(0.0F);
      if (this.f_18147.m_8768() != this.f_17284) {
         this.f_17284 = this.f_18147.m_8768();
         this.f_17288.m_9281(1.0F);
      }

      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         Class_0p152hWffX3ippAf.m_801(this.f_18147.m_8764()),
         this.f_18143,
         this.f_18144 + 2.0F,
         12,
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT)
      );
      Color var4 = new Color(this.f_18147.m_8768(), true);
      String var5 = String.format(f_17306, var4.getRed(), var4.getGreen(), var4.getBlue(), var4.getAlpha());
      int var6 = this.f_18147.m_8768() | f_17307;
      int var7 = Class_BftdentXEtGbugJw.m_2302(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT), var6, f_17308 * this.f_17285.m_9288());
      var7 = Class_BftdentXEtGbugJw.m_2302(var7, Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_17309), this.f_17288.m_9288() * f_17310);
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         var5,
         this.f_18143 + this.f_18145 - f_17311 - Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var5, f_17312, 0.0F),
         this.f_18144 + 2.0F,
         12,
         var7
      );
      float var8 = (float)(Math.sin(System.currentTimeMillis() / f_17313) * f_17314 + f_17315);
      float var9 = this.f_17286.m_9288() * f_17316 + (this.f_17287.m_9288() - 1.0F) * f_17317;
      float var10 = f_17318 + var9 * 2.0F;
      float var11 = this.f_18143 + this.f_18145 - var10;
      float var12 = this.f_18144 + 1.0F - var9;
      float var13 = f_17319 + var9 * f_17320;
      float var14 = Math.max(this.f_17286.m_9288() * f_17321, this.f_17285.m_9288() * (f_17322 + f_17323 * var8));
      var14 = Math.max(var14, this.f_17288.m_9288() * f_17324);
      if (var14 > f_17325) {
         Class_Ssh31B3ljfKeWsvS.m_4859(var11, var12, var10, var10, f_17326, Class_BftdentXEtGbugJw.m_2306(var6, var14));
      }

      Class_Ssh31B3ljfKeWsvS.m_4817(var11, var12, var10, var10, var13, this.f_18147.m_8768());
      if (this.f_17289.m_9288() > f_17327) {
         Class_Ssh31B3ljfKeWsvS.m_4817(
            var11,
            var12,
            var10,
            var10,
            var13,
            Class_BftdentXEtGbugJw.m_2306(Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_17328), this.f_17289.m_9288() * f_17329)
         );
      }

      this.f_18146 = f_17330;
   }

   private void m_5929(float var1, float var2, float var3, float var4, float var5, String var6, float var7) {
      boolean var8 = Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var3, var4, var5, f_17442);
      float var9 = Math.max(var8 ? f_17443 : 0.0F, var7);
      int var10 = Class_BftdentXEtGbugJw.m_2302(
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_STATE), Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_STATE), var9
      );
      int var11 = Class_BftdentXEtGbugJw.m_2302(
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT),
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT),
         Math.max(var8 ? f_17444 : 0.0F, var7)
      );
      Class_Ssh31B3ljfKeWsvS.m_4817(var3, var4, var5, f_17445, f_17446, var10);
      float var12 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var6, 9);
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var6, var3 + (var5 - var12) / 2.0F, var4 + f_17447, 9, var11);
   }

   private boolean m_5930() {
      long var1 = Minecraft.getInstance().getWindow().handle();
      return GLFW.glfwGetKey(var1, 341) == 1 || GLFW.glfwGetKey(var1, 345) == 1;
   }

   @Override
   public boolean m_2319(float var1, float var2, int var3) {
      if (!this.f_17276) {
         return false;
      }

      if (!this.m_5936(var1, var2)) {
         this.m_2322();
         return true;
      }

      if (var3 != 0) {
         return true;
      }

      float var4 = this.m_5938();
      float var5 = this.m_5926();
      this.f_17277 = false;
      this.f_17278 = false;
      this.f_17279 = false;
      if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var4 + f_17404, var5 + f_17405, f_17406, f_17407)) {
         this.f_17277 = true;
         this.m_5928(var1, var2);
      } else if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var4 + f_17408, var5 + f_17409, f_17410, f_17411)) {
         this.f_17278 = true;
         this.m_5935(var1);
      } else if (this.f_18147.m_2447() && Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var4 + f_17412, var5 + f_17413, f_17414, f_17415)) {
         this.f_17279 = true;
         this.m_5940(var1);
      } else if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var4 + f_17416, var5 + this.m_5939(), f_17417, f_17418)) {
         this.m_5931();
      } else if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var4 + f_17419, var5 + this.m_5939(), f_17420, f_17421)) {
         this.m_5937();
      }

      return true;
   }

   @Override
   public void m_2083(float var1, float var2, int var3) {
      if (this.f_17277 || this.f_17278 || this.f_17279) {
         ClientSounds.m_9463(ClientSounds.KG2FYhAQHwVAXDJG.SLIDER_RELEASE);
      }

      if (var3 == 0) {
         this.f_17277 = false;
         this.f_17278 = false;
         this.f_17279 = false;
      }
   }

   @Override
   public void m_698(int var1) {
      if (this.f_17276 && this.m_5930()) {
         if (var1 == 67) {
            this.m_5931();
         } else if (var1 == 86) {
            this.m_5937();
         }
      }
   }

   private void m_5931() {
      Color var1 = new Color(this.f_18147.m_8768(), true);
      String var2 = this.f_18147.m_2447()
         ? String.format(f_17448, var1.getRed(), var1.getGreen(), var1.getBlue(), var1.getAlpha())
         : String.format(f_17449, var1.getRed(), var1.getGreen(), var1.getBlue());
      GLFW.glfwSetClipboardString(Minecraft.getInstance().getWindow().handle(), var2);
      this.f_17290.m_9281(1.0F);
   }

   private void m_5932() {
      Color var1 = new Color(this.f_18147.m_8768(), true);
      float[] var2 = Color.RGBtoHSB(var1.getRed(), var1.getGreen(), var1.getBlue(), null);
      this.f_17280 = var2[0];
      this.f_17281 = var2[1];
      this.f_17282 = var2[2];
      this.f_17283 = this.f_18147.m_2447() ? var1.getAlpha() / f_17435 : 1.0F;
   }

   private Integer m_5933(String var1) {
      if (var1 == null) {
         return null;
      }

      String var2 = var1.trim().replace(f_17451, "").replace(f_17452, "").toUpperCase(Locale.ROOT);
      if (var2.startsWith(f_17453)) {
         String var9 = var2.substring(2);
         if (!var9.matches(f_17454)) {
            return null;
         }

         int var11 = (int)Long.parseLong(var9, 16);
         return this.f_18147.m_2447() ? var11 : f_17455 | var11 & f_17456;
      } else {
         if (var2.startsWith(f_17457)) {
            var2 = var2.substring(1);
         }

         if (!var2.matches(f_17458)) {
            return null;
         } else if (var2.length() == 6) {
            int var8 = Integer.parseInt(var2, 16);
            int var10 = this.f_18147.m_2447() ? this.f_18147.m_8768() >>> 24 & 0xFF : 255;
            return var10 << 24 | var8;
         } else {
            int var3 = Integer.parseInt(var2.substring(0, 2), 16);
            int var4 = Integer.parseInt(var2.substring(2, 4), 16);
            int var5 = Integer.parseInt(var2.substring(4, 6), 16);
            int var6 = Integer.parseInt(var2.substring(6, 8), 16);
            int var7 = this.f_18147.m_2447() ? var6 : 255;
            return var7 << 24 | var3 << 16 | var4 << 8 | var5;
         }
      }
   }

   private void m_5934() {
      int var1 = Color.HSBtoRGB(this.f_17280, this.f_17281, this.f_17282) & f_17433;
      int var2 = this.f_18147.m_2447() ? Math.round(this.f_17283 * f_17434) : 255;
      int var3 = this.f_18147.m_8768();
      this.f_18147.m_823(var2 << 24 | var1);
      if (var3 != this.f_18147.m_8768()) {
         ClientSounds.m_9462(ClientSounds.KG2FYhAQHwVAXDJG.COLOR, this.f_17278 ? this.f_17280 : (this.f_17279 ? 1.0F - this.f_17283 : this.f_17281));
      }
   }

   @Override
   public void m_2322() {
      this.f_17276 = false;
      this.f_17277 = false;
      this.f_17278 = false;
      this.f_17279 = false;
   }

   private void m_5935(float var1) {
      this.f_17280 = Math.clamp((var1 - this.m_5938() - f_17429) / f_17430, 0.0F, 1.0F);
      this.m_5934();
   }

   @Override
   public void m_694() {
   }

   private boolean m_5936(float var1, float var2) {
      return Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.m_5938(), this.m_5926(), f_17459, this.m_5939() + f_17460);
   }

   private void m_5937() {
      String var1 = GLFW.glfwGetClipboardString(Minecraft.getInstance().getWindow().handle());
      Integer var2 = this.m_5933(var1);
      if (var2 != null) {
         this.f_18147.m_823(var2);
         this.m_5932();
         this.f_17284 = var2;
         this.f_17288.m_9281(1.0F);
         this.f_17291.m_9281(1.0F);
         this.f_17287.m_9281(f_17450);
      }
   }

   @Override
   public void m_700(float var1, float var2, int var3) {
      if (this.m_5927(var1, var2)) {
         if (var3 == 0) {
            this.f_17276 = !this.f_17276;
            ClientSounds.m_9463(this.f_17276 ? ClientSounds.KG2FYhAQHwVAXDJG.PICKER_OPEN : ClientSounds.KG2FYhAQHwVAXDJG.PICKER_CLOSE);
            this.f_17277 = false;
            this.f_17278 = false;
            this.f_17279 = false;
            this.f_17287.m_9281(f_17402);
            if (this.f_17276) {
               this.m_5932();
            }
         } else if (var3 == 1) {
            this.f_18147.m_823(this.f_18147.m_2448());
            this.m_5932();
            this.f_17289.m_9281(1.0F);
            this.f_17287.m_9281(f_17403);
         }
      } else {
         if (this.f_17276 && !this.m_5936(var1, var2)) {
            this.f_17276 = false;
            this.f_17277 = false;
            this.f_17278 = false;
            this.f_17279 = false;
         }
      }
   }

   private float m_5938() {
      return this.m_6148(this.f_18143 + this.f_18145 - f_17436, f_17437);
   }

   private float m_5939() {
      return this.f_18147.m_2447() ? f_17440 : f_17441;
   }

   private void m_5940(float var1) {
      this.f_17283 = 1.0F - Math.clamp((var1 - this.m_5938() - f_17431) / f_17432, 0.0F, 1.0F);
      this.m_5934();
   }

   public Class_afTyQIoehSrCObZi(ColorSetting var1) {
      super(var1, f_17295);
      this.f_17285 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_17296, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_17286 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_17297, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_17287 = new Class_w8fCJQ5ZtH5lQbWc(1.0F, f_17298, Class_eXr9Fra2ad3yFXY8.f_19115);
      this.f_17288 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_17299, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_17289 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_17300, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_17290 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_17301, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_17291 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_17302, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_17292 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_17303, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_17293 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_17304, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_17294 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_17305, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.m_5932();
      this.f_17284 = var1.m_8768();
   }
}
