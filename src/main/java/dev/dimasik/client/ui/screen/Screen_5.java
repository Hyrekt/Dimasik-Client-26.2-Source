package dev.dimasik.client.ui.screen;

import dev.dimasik.client.module.combat.AutoSwap;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_M5gOLfHTfonyKANB;
import dev.dimasik.client.system.Class_NzJrN63M7QBpmAbi;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_pgtjhKJjK46C8cZl;
import dev.dimasik.client.system.Class_ucjlq1kQnFTjSi07;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.lwjgl.glfw.GLFW;

public final class Screen_5 extends Screen implements Class_NzJrN63M7QBpmAbi {
   private static final int f_11395 = 3;
   private static final float f_11396 = (float) (Math.PI * 2);
   private final AutoSwap f_11397;
   private final int f_11398;
   private final Class_pgtjhKJjK46C8cZl f_11399 = new Class_pgtjhKJjK46C8cZl();
   private final float[] f_11400 = new float[3];
   private float f_11401;
   private float f_11402;
   private float f_11403;
   private float f_11404;
   private float f_11405;
   private float f_11406;
   private float f_11407;
   private float f_11408 = 1.0F;
   private int f_11409 = -1;
   private String f_11410 = "";
   private int f_11411 = -1;
   private boolean f_11412;
   private boolean f_11413;
   private long f_11414 = System.nanoTime();
   private static final String f_11415 = "AutoSwap";
   private static final float f_11416 = 720.0F;
   private static final float f_11417 = 0.85F;
   private static final float f_11418 = 1.55F;
   private static final float f_11419 = 0.5F;
   private static final float f_11420 = 0.5F;
   private static final float f_11421 = 132.0F;
   private static final float f_11422 = 0.008F;
   private static final float f_11423 = 255.0F;
   private static final float f_11424 = 0.78F;
   private static final float f_11425 = 0.22F;
   private static final float f_11426 = 70.0F;
   private static final float f_11427 = (float) (Math.PI * 2.0 / 3.0);
   private static final float f_11428 = 0.16F;
   private static final float f_11429 = 0.002F;
   private static final float f_11430 = 16.0F;
   private static final float f_11431 = 0.7F;
   private static final float f_11432 = 0.3F;
   private static final float f_11433 = 6.0F;
   private static final float f_11434 = (float) (-Math.PI / 2);
   private static final float f_11435 = 0.34F;
   private static final float f_11436 = 0.5F;
   private static final float f_11437 = 0.5F;
   private static final float f_11438 = 4.0F;
   private static final float f_11439 = 1.38F;
   private static final float f_11440 = 0.32F;
   private static final float f_11441 = 0.48F;
   private static final float f_11442 = 0.52F;
   private static final float f_11443 = 16.0F;
   private static final String f_11444 = "+";
   private static final float f_11445 = 0.5F;
   private static final float f_11446 = 8.0F;
   private static final float f_11447 = 8.0F;
   private static final float f_11448 = 8.0F;
   private static final float f_11449 = 46.0F;
   private static final float f_11450 = 0.82F;
   private static final float f_11451 = 0.18F;
   private static final float f_11452 = 12.0F;
   private static final float f_11453 = 14.0F;
   private static final float f_11454 = 1.55F;
   private static final float f_11455 = 0.75F;
   private static final float f_11456 = 0.25F;
   private static final float f_11457 = 8.0F;
   private static final float f_11458 = 8.0F;
   private static final float f_11459 = 0.02F;
   private static final float f_11460 = 10.0F;
   private static final float f_11461 = 28.0F;
   private static final float f_11462 = 24.0F;
   private static final float f_11463 = 0.5F;
   private static final float f_11464 = 14.0F;
   private static final float f_11465 = 12.0F;
   private static final float f_11466 = 0.5F;
   private static final double f_11467 = 230.0;
   private static final float f_11468 = 0.5F;
   private static final double f_11469 = 100.0;
   private static final float f_11470 = 0.5F;
   private static final float f_11471 = 0.5F;
   private static final float f_11472 = 0.5F;
   private static final float f_11473 = 24.0F;
   private static final float f_11474 = 18.0F;
   private static final float f_11475 = (float) (Math.PI / 2);
   private static final float f_11476 = (float) (Math.PI * 2);
   private static final float f_11477 = (float) (Math.PI * 2);
   private static final float f_11478 = 3.0F;
   private static final float f_11479 = 12.0F;
   private static final float f_11480 = 1.0E9F;
   private static final float f_11481 = 0.05F;
   private static final float f_11482 = 12.0F;
   private static final float f_11483 = 8.5F;
   private static final float f_11484 = 0.008F;
   private static final float f_11485 = 255.0F;
   private static final float f_11486 = 3.0F;
   private static final float f_11487 = 2.70158F;
   private static final float f_11488 = 1.70158F;

   private Vector2f clampMouse(Vector2f var1) {
      float var2 = var1.x - this.f_11401;
      float var3 = var1.y - this.f_11402;
      float var4 = (float)Math.sqrt(var2 * var2 + var3 * var3);
      float var5 = this.f_11403 + f_11479 * this.f_11404;
      if (!(var4 <= var5) && var4 != 0.0F) {
         float var6 = this.f_11401 + var2 / var4 * var5;
         float var7 = this.f_11402 + var3 / var4 * var5;
         this.warpCursor(var6, var7);
         return new Vector2f(var6, var7);
      } else {
         return var1;
      }
   }

   public void onClose() {
      this.finish(false);
   }

   protected void extractMenuBackground(GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5) {
   }

   private float smooth(float var1) {
      float var2 = Math.clamp(var1, 0.0F, 1.0F);
      return var2 * var2 * (f_11486 - 2.0F * var2);
   }

   private int animatedColor(int var1, int var2, int var3, int var4, float var5) {
      return Class_BftdentXEtGbugJw.m_2303(var1, var2, var3, var4 * Math.clamp(var5, 0.0F, 1.0F));
   }

   public boolean keyPressed(KeyEvent var1) {
      if (var1.key() == 256) {
         this.finish(false);
         return true;
      } else {
         return super.keyPressed(var1);
      }
   }

   public void finish(boolean var1) {
      if (!this.f_11412) {
         this.f_11412 = true;
         this.f_11413 = var1;
         this.f_11397.m_7526(this);
         this.minecraft.gui.setScreen(null);
      }
   }

   protected void extractPanorama(GuiGraphicsExtractor var1, float var2) {
   }

   private void updateAnimation() {
      long var1 = System.nanoTime();
      this.f_11406 = Math.clamp((float)(var1 - this.f_11414) / f_11480, 0.0F, f_11481);
      this.f_11414 = var1;
      float var3 = this.f_11412 ? 0.0F : 1.0F;
      float var4 = this.f_11412 ? f_11482 : f_11483;
      this.f_11405 = this.f_11405 + (var3 - this.f_11405) * (1.0F - (float)Math.exp(-this.f_11406 * var4));
   }

   public void extractRenderState(GuiGraphicsExtractor var1, int var2, int var3, float var4) {
      Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
      Class_Ssh31B3ljfKeWsvS.m_4830();
      Class_Ssh31B3ljfKeWsvS.m_4844();
      float var5 = this.minecraft.getWindow().getScreenWidth();
      float var6 = this.minecraft.getWindow().getScreenHeight();
      this.f_11404 = Math.clamp(var6 / f_11416, f_11417, f_11418);
      this.f_11401 = Math.round(var5 * f_11419);
      this.f_11402 = Math.round(var6 * f_11420);
      this.f_11403 = f_11421 * this.f_11404;
      Vector2f var7 = this.clampMouse(Class_FvJXUGWpZo3zYBW4.m_2693(var2, var3));
      this.updateAnimation();
      if (this.f_11412 && this.f_11405 < f_11422) {
         int var10 = this.f_11411;
         boolean var9 = this.f_11413;
         this.minecraft.gui.setScreen(null);
         if (var9 && var10 >= 0) {
            this.f_11397.m_7503(var10);
         }
      } else {
         if (!this.f_11412) {
            this.f_11411 = this.selectedAt(var7.x, var7.y);
         }

         float var8 = this.smooth(this.f_11405);
         Class_Ssh31B3ljfKeWsvS.m_4864(f_11423 * var8);
         this.renderWheel(var1, var8);
         Class_Ssh31B3ljfKeWsvS.m_4844();
      }
   }

   private void renderWheel(GuiGraphicsExtractor var1, float var2) {
      float var3 = this.minecraft.getWindow().getScreenWidth();
      float var4 = this.minecraft.getWindow().getScreenHeight();
      Class_M5gOLfHTfonyKANB.m_3876(var3, var4);
      float var5 = this.outBack(var2);
      float var6 = this.f_11403 * (f_11424 + f_11425 * var5);
      float var7 = f_11426 * this.f_11404;
      float var8 = f_11427;
      this.f_11399.m_8199();

      for (int var9 = 0; var9 < 3; var9++) {
         float var10 = f_11428 * var9 / 2.0F;
         float var11 = Math.clamp((this.f_11405 - var10) / (1.0F - var10), 0.0F, 1.0F);
         float var12 = this.smooth(var11);
         if (!(var12 < f_11429)) {
            float var13 = this.outBack(var11);
            float var14 = var9 == this.f_11411 ? 1.0F : 0.0F;
            this.f_11400[var9] = this.f_11400[var9] + (var14 - this.f_11400[var9]) * (1.0F - (float)Math.exp(-this.f_11406 * f_11430));
            float var15 = this.f_11400[var9];
            float var16 = f_11431 + f_11432 * var13;
            float var17 = var7 * var16;
            float var18 = var6 * var16 + var15 * f_11433 * this.f_11404;
            float var19 = f_11434 + var9 * var8 - (1.0F - var12) * f_11435;
            boolean var20 = this.f_11397.m_7500(var9);
            float var21 = var19 + var8 * f_11436;
            Class_M5gOLfHTfonyKANB.m_3878(this.f_11399, this.f_11401, this.f_11402, var17, var18, var19, var8, var20, var12, var15, this.f_11404);
            float var22 = (var17 + var18) * f_11437 + var15 * f_11438 * this.f_11404;
            float var23 = this.f_11401 + (float)Math.cos(var21) * var22;
            float var24 = this.f_11402 + (float)Math.sin(var21) * var22;
            ItemStack var25 = this.f_11397.m_7515(var9);
            float var26 = this.f_11404 * (f_11439 + var15 * f_11440) * (f_11441 + f_11442 * var13);
            if (var25.isEmpty()) {
               int var27 = Math.max(12, Math.round(f_11443 * this.f_11404));
               String var28 = f_11444;
               Class_Ssh31B3ljfKeWsvS.m_4866(
                  Class_y1y6QpONhWEUIdEB.m_9588(),
                  var28,
                  var23 - Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var28, var27) * f_11445,
                  var24 - f_11446 * this.f_11404,
                  var27,
                  Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT), var12)
               );
            } else {
               Class_Ssh31B3ljfKeWsvS.m_4832(var1, var25, var23 - f_11447 * var26, var24 - f_11448 * var26, var26, false);
            }
         }
      }

      float var29 = f_11449 * this.f_11404 * (f_11450 + f_11451 * var5);
      Class_M5gOLfHTfonyKANB.m_3879(this.f_11401, this.f_11402, var29, this.f_11404, var2);
      if (this.f_11411 != this.f_11409) {
         this.f_11409 = this.f_11411;
         if (this.f_11411 >= 0) {
            this.f_11408 = 0.0F;
         }
      }

      this.f_11408 = this.f_11408 + (1.0F - this.f_11408) * (1.0F - (float)Math.exp(-this.f_11406 * f_11452));
      ItemStack var30 = this.f_11411 >= 0 ? this.f_11397.m_7515(this.f_11411) : ItemStack.EMPTY;
      if (!var30.isEmpty()) {
         this.f_11410 = var30.getHoverName().getString();
      }

      float var31 = var30.isEmpty() ? 0.0F : 1.0F;
      this.f_11407 = this.f_11407 + (var31 - this.f_11407) * (1.0F - (float)Math.exp(-this.f_11406 * f_11453));
      if (!var30.isEmpty()) {
         float var32 = this.smooth(this.f_11408);
         float var34 = f_11454 * this.f_11404 * (f_11455 + f_11456 * this.outBack(var32));
         Class_Ssh31B3ljfKeWsvS.m_4832(var1, var30, this.f_11401 - f_11457 * var34, this.f_11402 - f_11458 * var34, var34, false);
      }

      if (this.f_11407 > f_11459 && !this.f_11410.isEmpty()) {
         int var33 = Math.max(9, Math.round(f_11460 * this.f_11404));
         float var35 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), this.f_11410, var33);
         float var36 = var35 + f_11461 * this.f_11404;
         float var37 = f_11462 * this.f_11404;
         float var38 = this.f_11401 - var36 * f_11463;
         float var39 = this.f_11402 + this.f_11403 + f_11464 * this.f_11404;
         float var40 = Class_Ssh31B3ljfKeWsvS.m_4821();
         Class_Ssh31B3ljfKeWsvS.m_4864(var40 * this.f_11407);
         Class_Ssh31B3ljfKeWsvS.m_4858(var38, var39, var36, var37, f_11465, var37 * f_11466, Class_BftdentXEtGbugJw.m_2303(222, 229, 242, f_11467));
         Class_Ssh31B3ljfKeWsvS.m_4817(var38, var39, var36, var37, var37 * f_11468, Class_BftdentXEtGbugJw.m_2303(7, 11, 19, f_11469));
         Class_Ssh31B3ljfKeWsvS.m_4866(
            Class_y1y6QpONhWEUIdEB.m_9588(),
            this.f_11410,
            this.f_11401 - var35 * f_11470,
            var39 + var37 * f_11471 - var33 * f_11472 - 1.0F,
            var33,
            this.f_11411 >= 0 && !this.f_11397.m_7500(this.f_11411)
               ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT)
               : Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT)
         );
         Class_Ssh31B3ljfKeWsvS.m_4864(var40);
      }
   }

   public boolean isPauseScreen() {
      return false;
   }

   private float outBack(float var1) {
      float var2 = Math.clamp(var1, 0.0F, 1.0F) - 1.0F;
      return 1.0F + f_11487 * var2 * var2 * var2 + f_11488 * var2 * var2;
   }

   public boolean renderClosing(GuiGraphicsExtractor var1) {
      Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
      Class_Ssh31B3ljfKeWsvS.m_4830();
      Class_Ssh31B3ljfKeWsvS.m_4844();
      this.updateAnimation();
      if (this.f_11405 < f_11484) {
         if (this.f_11413 && this.f_11411 >= 0) {
            this.f_11397.m_7503(this.f_11411);
         }

         return true;
      } else {
         float var2 = this.smooth(this.f_11405);
         Class_Ssh31B3ljfKeWsvS.m_4864(f_11485 * var2);
         this.renderWheel(var1, var2);
         Class_Ssh31B3ljfKeWsvS.m_4844();
         return false;
      }
   }

   public Screen_5(AutoSwap var1, int var2) {
      super(Component.literal(f_11415));
      this.f_11397 = var1;
      this.f_11398 = var2;
   }

   public boolean keyReleased(KeyEvent var1) {
      if (var1.key() == this.f_11398) {
         this.finish(true);
         return true;
      } else {
         return super.keyReleased(var1);
      }
   }

   public boolean mouseClicked(MouseButtonEvent var1, boolean var2) {
      if ((var1.button() == 0 || var1.button() == 1) && this.f_11411 >= 0) {
         this.minecraft.gui.setScreen(new Class_ucjlq1kQnFTjSi07(this.f_11397, this.f_11411, this, this.f_11398));
      }

      return true;
   }

   private int selectedAt(float var1, float var2) {
      float var3 = var1 - this.f_11401;
      float var4 = var2 - this.f_11402;
      float var5 = (float)Math.sqrt(var3 * var3 + var4 * var4);
      if (!(var5 < f_11473 * this.f_11404) && !(var5 > this.f_11403 + f_11474 * this.f_11404)) {
         float var6 = (float)Math.atan2(var4, var3) + f_11475;
         if (var6 < 0.0F) {
            var6 += f_11476;
         }

         return Math.min(2, (int)(var6 / f_11477 * f_11478));
      } else {
         return -1;
      }
   }

   private void warpCursor(float var1, float var2) {
      double var3 = var1 * this.minecraft.getWindow().getScreenWidth() / Math.max(1.0, this.minecraft.getWindow().getWidth());
      double var5 = var2 * this.minecraft.getWindow().getScreenHeight() / Math.max(1.0, this.minecraft.getWindow().getHeight());
      GLFW.glfwSetCursorPos(this.minecraft.getWindow().handle(), var3, var5);
   }
}
