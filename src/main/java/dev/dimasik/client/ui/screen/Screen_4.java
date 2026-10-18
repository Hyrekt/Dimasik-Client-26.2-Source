package dev.dimasik.client.ui.screen;

import dev.dimasik.client.module.misc.PotionSwap;
import dev.dimasik.client.system.Class_0p152hWffX3ippAf;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_M5gOLfHTfonyKANB;
import dev.dimasik.client.system.Class_NzJrN63M7QBpmAbi;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_pgtjhKJjK46C8cZl;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import java.util.List;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.lwjgl.glfw.GLFW;

public final class Screen_4 extends Screen implements Class_NzJrN63M7QBpmAbi {
   private static final float f_8287 = (float) (Math.PI * 2);
   private final PotionSwap f_8288;
   private final int f_8289;
   private final Class_pgtjhKJjK46C8cZl f_8290 = new Class_pgtjhKJjK46C8cZl();
   private final float[] f_8291 = new float[8];
   private float f_8292;
   private float f_8293;
   private float f_8294;
   private float f_8295;
   private float f_8296;
   private float f_8297;
   private float f_8298;
   private int f_8299 = -1;
   private int f_8300 = -1;
   private boolean f_8301;
   private boolean f_8302;
   private boolean f_8303;
   private float f_8304;
   private long f_8305 = System.nanoTime();
   private static final String f_8306 = "PotionSwap";
   private static final float f_8307 = 720.0F;
   private static final float f_8308 = 0.85F;
   private static final float f_8309 = 1.65F;
   private static final float f_8310 = 0.5F;
   private static final float f_8311 = 0.5F;
   private static final float f_8312 = 116.0F;
   private static final float f_8313 = 0.008F;
   private static final float f_8314 = 255.0F;
   private static final float f_8315 = 0.76F;
   private static final float f_8316 = 0.24F;
   private static final float f_8317 = 76.0F;
   private static final float f_8318 = (float) (Math.PI * 2);
   private static final float f_8319 = 0.16F;
   private static final float f_8320 = 0.002F;
   private static final float f_8321 = 15.0F;
   private static final float f_8322 = 0.7F;
   private static final float f_8323 = 0.3F;
   private static final float f_8324 = 6.0F;
   private static final float f_8325 = (float) (-Math.PI / 2);
   private static final float f_8326 = 0.34F;
   private static final float f_8327 = 0.5F;
   private static final float f_8328 = 0.5F;
   private static final float f_8329 = 1.22F;
   private static final float f_8330 = 0.48F;
   private static final float f_8331 = 0.52F;
   private static final float f_8332 = 0.27F;
   private static final String f_8333 = "+";
   private static final float f_8334 = 8.0F;
   private static final float f_8335 = 16.0F;
   private static final float f_8336 = 8.0F;
   private static final float f_8337 = 8.0F;
   private static final float f_8338 = 0.78F;
   private static final float f_8339 = 0.22F;
   private static final float f_8340 = 8.0F;
   private static final float f_8341 = 0.5F;
   private static final double f_8342 = 4.2E8;
   private static final float f_8343 = 0.035F;
   private static final float f_8344 = 1.9F;
   private static final float f_8345 = 8.0F;
   private static final float f_8346 = 13.0F;
   private static final float f_8347 = 8.0F;
   private static final String f_8348 = "нет в инвентаре";
   private static final String f_8349 = "отпусти для броска";
   private static final float f_8350 = 26.0F;
   private static final float f_8351 = 8.0F;
   private static final String f_8352 = "СКМ — добавить   •   ЛКМ — удалить   •   ПКМ — выбрать";
   private static final float f_8353 = 25.0F;
   private static final float f_8354 = 9.0F;
   private static final float f_8355 = 22.0F;
   private static final float f_8356 = 13.0F;
   private static final double f_8357 = 220.0;
   private static final float f_8358 = 13.0F;
   private static final double f_8359 = 202.0;
   private static final float f_8360 = 13.0F;
   private static final double f_8361 = 34.0;
   private static final String f_8362 = "Выбери зелье";
   private static final float f_8363 = 12.0F;
   private static final float f_8364 = 10.0F;
   private static final float f_8365 = 10.0F;
   private static final double f_8366 = 245.0;
   private static final String f_8367 = "В инвентаре нет метательных зелий";
   private static final float f_8368 = 0.5F;
   private static final float f_8369 = 43.0F;
   private static final float f_8370 = 8.0F;
   private static final double f_8371 = 230.0;
   private static final float f_8372 = 8.0F;
   private static final double f_8373 = 235.0;
   private static final float f_8374 = 1.32F;
   private static final float f_8375 = 1.14F;
   private static final float f_8376 = 0.5F;
   private static final float f_8377 = 8.0F;
   private static final float f_8378 = 0.5F;
   private static final float f_8379 = 8.0F;
   private static final float f_8380 = 0.008F;
   private static final float f_8381 = 255.0F;
   private static final float f_8382 = 35.0F;
   private static final float f_8383 = 65.0F;
   private static final float f_8384 = (float) (Math.PI / 2);
   private static final float f_8385 = (float) (Math.PI * 2);
   private static final float f_8386 = (float) (Math.PI * 2);
   private static final float f_8387 = 7.0F;
   private static final float f_8388 = 11.0F;
   private static final float f_8389 = 1.0E9F;
   private static final float f_8390 = 0.05F;
   private static final float f_8391 = 12.0F;
   private static final float f_8392 = 8.5F;
   private static final float f_8393 = 3.0F;
   private static final float f_8394 = 2.70158F;
   private static final float f_8395 = 1.70158F;
   private static final float f_8396 = 34.0F;
   private static final float f_8397 = 5.0F;
   private static final float f_8398 = 20.0F;
   private static final float f_8399 = 37.0F;
   private static final float f_8400 = 10.0F;
   private static final float f_8401 = 18.0F;
   private static final float f_8402 = 10.0F;
   private static final float f_8403 = 18.0F;
   private static final float f_8404 = 0.5F;
   private static final float f_8405 = 0.5F;

   public void extractRenderState(GuiGraphicsExtractor var1, int var2, int var3, float var4) {
      Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
      Class_Ssh31B3ljfKeWsvS.m_4830();
      Class_Ssh31B3ljfKeWsvS.m_4844();
      float var5 = this.minecraft.getWindow().getScreenWidth();
      float var6 = this.minecraft.getWindow().getScreenHeight();
      this.f_8296 = Math.clamp(var6 / f_8307, f_8308, f_8309);
      this.f_8293 = var5 * f_8310;
      this.f_8294 = var6 * f_8311;
      this.f_8295 = f_8312 * this.f_8296;
      if (!this.f_8302) {
         Vector2f var7 = this.clampMouse(Class_FvJXUGWpZo3zYBW4.m_2693(var2, var3));
         this.f_8297 = var7.x;
         this.f_8298 = var7.y;
      }

      this.updateAnimation();
      if (this.f_8302 && this.f_8292 < f_8313) {
         int var10 = this.f_8299;
         boolean var8 = this.f_8303;
         this.minecraft.gui.setScreen(null);
         if (var8) {
            this.f_8288.m_5699(var10);
         }
      } else {
         this.f_8299 = this.f_8302 ? this.f_8299 : (this.f_8301 ? this.f_8300 : this.selectedAt(this.f_8297, this.f_8298));
         float var9 = this.smooth(this.f_8292);
         Class_Ssh31B3ljfKeWsvS.m_4864(f_8314 * var9);
         this.renderWheel(var1, var9);
         if (this.f_8301) {
            this.renderPicker(var1);
         }

         Class_Ssh31B3ljfKeWsvS.m_4844();
      }
   }

   private void warpCursor(float var1, float var2) {
      double var3 = var1 * this.minecraft.getWindow().getScreenWidth() / Math.max(1.0, this.minecraft.getWindow().getWidth());
      double var5 = var2 * this.minecraft.getWindow().getScreenHeight() / Math.max(1.0, this.minecraft.getWindow().getHeight());
      GLFW.glfwSetCursorPos(this.minecraft.getWindow().handle(), var3, var5);
   }

   public boolean mouseReleased(MouseButtonEvent var1) {
      if (var1.button() == this.f_8289) {
         this.finish(true);
         return true;
      } else {
         return super.mouseReleased(var1);
      }
   }

   private int selectedAt(float var1, float var2) {
      float var3 = var1 - this.f_8293;
      float var4 = var2 - this.f_8294;
      float var5 = (float)Math.sqrt(var3 * var3 + var4 * var4);
      if (!(var5 < f_8382 * this.f_8296) && !(var5 > this.f_8295 + f_8383 * this.f_8296)) {
         float var6 = (float)Math.atan2(var4, var3) + f_8384;
         if (var6 < 0.0F) {
            var6 += f_8385;
         }

         return Math.min(this.f_8288.m_5704().size() - 1, (int)(var6 / f_8386 * this.f_8288.m_5704().size()));
      } else {
         return -1;
      }
   }

   private float outBack(float var1) {
      float var2 = this.clamp01(var1) - 1.0F;
      return 1.0F + f_8394 * var2 * var2 * var2 + f_8395 * var2 * var2;
   }

   private int animatedColor(int var1, int var2, int var3, int var4, float var5) {
      return Class_BftdentXEtGbugJw.m_2303(var1, var2, var3, var4 * this.clamp01(var5));
   }

   public void finish(boolean var1) {
      if (!this.f_8302) {
         this.f_8302 = true;
         this.f_8303 = var1 && !this.f_8301;
         this.f_8288.m_5716(this);
         this.minecraft.gui.setScreen(null);
      }
   }

   private ItemStack centerStack() {
      if (this.f_8299 >= 0 && this.f_8299 < this.f_8288.m_5704().size()) {
         ItemStack var1 = this.f_8288.m_5704().get(this.f_8299);
         if (!var1.isEmpty()) {
            return var1;
         }
      }

      for (ItemStack var2 : this.f_8288.m_5704()) {
         if (!var2.isEmpty()) {
            return var2;
         }
      }

      return ItemStack.EMPTY;
   }

   protected void extractMenuBackground(GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5) {
   }

   private void renderWheel(GuiGraphicsExtractor var1, float var2) {
      float var3 = this.outBack(var2);
      float var4 = this.f_8295 * (f_8315 + f_8316 * var3);
      float var5 = f_8317 * this.f_8296;
      Class_M5gOLfHTfonyKANB.m_3876(this.minecraft.getWindow().getScreenWidth(), this.minecraft.getWindow().getScreenHeight());
      this.f_8290.m_8199();
      int var6 = this.f_8288.m_5704().size();
      float var7 = f_8318 / var6;

      for (int var8 = 0; var8 < var6; var8++) {
         float var9 = var6 == 1 ? 0.0F : f_8319 * var8 / (var6 - 1.0F);
         float var10 = this.clamp01((this.f_8292 - var9) / (1.0F - var9));
         float var11 = this.smooth(var10);
         if (!(var11 < f_8320)) {
            float var12 = this.outBack(var10);
            float var13 = var8 == this.f_8299 ? 1.0F : 0.0F;
            this.f_8291[var8] = this.f_8291[var8] + (var13 - this.f_8291[var8]) * (1.0F - (float)Math.exp(-this.f_8304 * f_8321));
            float var14 = this.f_8291[var8];
            float var15 = f_8322 + f_8323 * var12;
            float var16 = var5 * var15;
            float var17 = var4 * var15 + var14 * f_8324 * this.f_8296;
            float var18 = f_8325 + var8 * var7 - (1.0F - var11) * f_8326;
            ItemStack var19 = this.f_8288.m_5704().get(var8);
            boolean var20 = this.f_8288.m_5705(var19);
            Class_M5gOLfHTfonyKANB.m_3878(this.f_8290, this.f_8293, this.f_8294, var16, var17, var18, var7, var20, var11, var14, this.f_8296);
            float var21 = var18 + var7 * f_8327;
            float var22 = (var16 + var17) * f_8328;
            float var23 = this.f_8296 * f_8329 * (f_8330 + f_8331 * var12) * (1.0F + var14 * f_8332);
            float var24 = this.f_8293 + (float)Math.cos(var21) * var22;
            float var25 = this.f_8294 + (float)Math.sin(var21) * var22;
            if (var19.isEmpty()) {
               this.centered(
                  f_8333, var24, var25 - f_8334 * this.f_8296, Math.max(12, Math.round(f_8335 * this.f_8296)), this.animatedColor(106, 132, 154, 220, var11)
               );
            } else {
               Class_Ssh31B3ljfKeWsvS.m_4832(var1, var19, var24 - f_8336 * var23, var25 - f_8337 * var23, var23, false);
            }
         }
      }

      float var26 = f_8338 + f_8339 * var3;
      float var27 = (var5 - f_8340 * this.f_8296) * 2.0F * var26;
      Class_M5gOLfHTfonyKANB.m_3879(this.f_8293, this.f_8294, var27 * f_8341, this.f_8296, var2);
      ItemStack var28 = this.centerStack();
      if (!var28.isEmpty()) {
         float var29 = 1.0F + (float)Math.sin(System.nanoTime() / f_8342) * f_8343;
         float var30 = this.f_8296 * f_8344 * var26 * var29;
         Class_Ssh31B3ljfKeWsvS.m_4832(var1, var28, this.f_8293 - f_8345 * var30, this.f_8294 - f_8346 * this.f_8296 - f_8347 * var30, var30, false);
      }

      this.centered(
         this.f_8299 >= 0 && !this.f_8288.m_5705(this.f_8288.m_5704().get(this.f_8299))
            ? Class_0p152hWffX3ippAf.m_801(f_8348)
            : Class_0p152hWffX3ippAf.m_801(f_8349),
         this.f_8293,
         this.f_8294 + f_8350 * this.f_8296,
         Math.max(7, Math.round(f_8351 * this.f_8296)),
         this.animatedColor(104, 135, 158, 220, var2)
      );
      this.centered(
         Class_0p152hWffX3ippAf.m_801(f_8352),
         this.f_8293,
         this.f_8294 + var4 + f_8353 * this.f_8296,
         Math.max(8, Math.round(f_8354 * this.f_8296)),
         this.animatedColor(142, 169, 190, 220, var2)
      );
   }

   private float smooth(float var1) {
      float var2 = this.clamp01(var1);
      return var2 * var2 * (f_8393 - 2.0F * var2);
   }

   private float clamp01(float var1) {
      return Math.clamp(var1, 0.0F, 1.0F);
   }

   protected void extractPanorama(GuiGraphicsExtractor var1, float var2) {
   }

   public boolean isPauseScreen() {
      return false;
   }

   public Screen_4(PotionSwap var1, int var2) {
      super(Component.literal(f_8306));
      this.f_8288 = var1;
      this.f_8289 = var2;
   }

   public boolean keyPressed(KeyEvent var1) {
      if (var1.key() == 256) {
         this.finish(false);
         return true;
      } else {
         return super.keyPressed(var1);
      }
   }

   public void onClose() {
      this.finish(false);
   }

   private Screen_4.Class_4nx9tn737cXJhTvm pickerLayout(int var1) {
      byte var2 = 5;
      int var3 = Math.max(1, (var1 + var2 - 1) / var2);
      float var4 = f_8396 * this.f_8296;
      float var5 = f_8397 * this.f_8296;
      float var6 = var2 * var4 + (var2 - 1) * var5 + f_8398 * this.f_8296;
      float var7 = f_8399 * this.f_8296 + var3 * var4 + Math.max(0, var3 - 1) * var5 + f_8400 * this.f_8296;
      float var8 = this.f_8293 + this.f_8295 + f_8401 * this.f_8296;
      if (var8 + var6 > this.minecraft.getWindow().getScreenWidth() - f_8402 * this.f_8296) {
         var8 = this.f_8293 - this.f_8295 - f_8403 * this.f_8296 - var6;
      }

      return new Screen_4.Class_4nx9tn737cXJhTvm(var8, this.f_8294 - var7 * f_8404, var6, var7, var4, var5, var2);
   }

   private void updateAnimation() {
      long var1 = System.nanoTime();
      float var3 = Math.clamp((float)(var1 - this.f_8305) / f_8389, 0.0F, f_8390);
      this.f_8305 = var1;
      this.f_8304 = var3;
      float var4 = this.f_8302 ? 0.0F : 1.0F;
      float var5 = 1.0F - (float)Math.exp(-var3 * (this.f_8302 ? f_8391 : f_8392));
      this.f_8292 = this.f_8292 + (var4 - this.f_8292) * var5;
   }

   private void centered(String var1, float var2, float var3, int var4, int var5) {
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(), var1, var2 - Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var1, var4) * f_8405, var3, var4, var5
      );
   }

   private Vector2f clampMouse(Vector2f var1) {
      if (!this.f_8301) {
         float var8 = var1.x - this.f_8293;
         float var9 = var1.y - this.f_8294;
         float var10 = (float)Math.sqrt(var8 * var8 + var9 * var9);
         float var11 = this.f_8295 + f_8388 * this.f_8296;
         if (!(var10 <= var11) && var10 != 0.0F) {
            float var6 = this.f_8293 + var8 / var10 * var11;
            float var7 = this.f_8294 + var9 / var10 * var11;
            this.warpCursor(var6, var7);
            return new Vector2f(var6, var7);
         } else {
            return var1;
         }
      } else {
         Screen_4.Class_4nx9tn737cXJhTvm var2 = this.pickerLayout(Math.min(15, this.f_8288.m_5719().size()));
         float var3 = f_8387 * this.f_8296;
         float var4 = Math.clamp(
            var1.x, Math.min(this.f_8293 - this.f_8295 - var3, var2.x - var3), Math.max(this.f_8293 + this.f_8295 + var3, var2.x + var2.width + var3)
         );
         float var5 = Math.clamp(
            var1.y, Math.min(this.f_8294 - this.f_8295 - var3, var2.y - var3), Math.max(this.f_8294 + this.f_8295 + var3, var2.y + var2.height + var3)
         );
         if (var4 != var1.x || var5 != var1.y) {
            this.warpCursor(var4, var5);
         }

         return new Vector2f(var4, var5);
      }
   }

   private void renderPicker(GuiGraphicsExtractor var1) {
      List var2 = this.f_8288.m_5719();
      int var3 = Math.min(15, var2.size());
      Screen_4.Class_4nx9tn737cXJhTvm var4 = this.pickerLayout(var3);
      Class_Ssh31B3ljfKeWsvS.m_4858(var4.x, var4.y, var4.width, var4.height, f_8355, f_8356 * this.f_8296, Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_8357));
      Class_Ssh31B3ljfKeWsvS.m_4817(var4.x, var4.y, var4.width, var4.height, f_8358 * this.f_8296, Class_BftdentXEtGbugJw.m_2303(4, 7, 12, f_8359));
      Class_Ssh31B3ljfKeWsvS.m_4854(
         var4.x, var4.y, var4.width, var4.height, this.f_8296, f_8360 * this.f_8296, Class_BftdentXEtGbugJw.m_2303(116, 207, 248, f_8361)
      );
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         Class_0p152hWffX3ippAf.m_801(f_8362),
         var4.x + f_8363 * this.f_8296,
         var4.y + f_8364 * this.f_8296,
         Math.max(9, Math.round(f_8365 * this.f_8296)),
         Class_BftdentXEtGbugJw.m_2303(226, 244, 255, f_8366)
      );
      if (var2.isEmpty()) {
         this.centered(
            Class_0p152hWffX3ippAf.m_801(f_8367),
            var4.x + var4.width * f_8368,
            var4.y + f_8369 * this.f_8296,
            Math.max(7, Math.round(f_8370 * this.f_8296)),
            Class_BftdentXEtGbugJw.m_2303(113, 137, 157, f_8371)
         );
      } else {
         for (int var5 = 0; var5 < var3; var5++) {
            float var6 = var4.cellX(var5);
            float var7 = var4.cellY(var5);
            boolean var8 = Class_FvJXUGWpZo3zYBW4.m_2697(this.f_8297, this.f_8298, var6, var7, var4.cell, var4.cell);
            Class_Ssh31B3ljfKeWsvS.m_4817(
               var6,
               var7,
               var4.cell,
               var4.cell,
               f_8372 * this.f_8296,
               var8 ? Class_BftdentXEtGbugJw.m_2303(18, 55, 76, f_8373) : Class_BftdentXEtGbugJw.m_2303(16, 23, 34, 0.0)
            );
            float var9 = this.f_8296 * (var8 ? f_8374 : f_8375);
            Class_Ssh31B3ljfKeWsvS.m_4832(
               var1, (ItemStack)var2.get(var5), var6 + var4.cell * f_8376 - f_8377 * var9, var7 + var4.cell * f_8378 - f_8379 * var9, var9, false
            );
         }
      }
   }

   public boolean keyReleased(KeyEvent var1) {
      if (var1.key() == this.f_8289) {
         this.finish(true);
         return true;
      } else {
         return super.keyReleased(var1);
      }
   }

   public boolean mouseClicked(MouseButtonEvent var1, boolean var2) {
      Vector2f var3 = Class_FvJXUGWpZo3zYBW4.m_2693(var1.x(), var1.y());
      if (var1.button() == 2) {
         this.f_8299 = this.f_8288.m_5700();
         return true;
      }

      if (var1.button() == 1 && this.f_8299 >= 0) {
         this.f_8300 = this.f_8299;
         this.f_8301 = true;
         return true;
      }

      if (var1.button() == 0 && this.f_8301) {
         List var4 = this.f_8288.m_5719();
         int var5 = Math.min(15, var4.size());
         int var6 = this.pickerLayout(var5).m_2983(var3.x, var3.y, var5);
         if (var6 >= 0) {
            this.f_8288.m_5715(this.f_8300, (ItemStack)var4.get(var6));
            this.f_8301 = false;
            this.f_8299 = this.f_8300;
         }

         return true;
      } else if (var1.button() == 0 && this.f_8299 >= 0) {
         this.f_8288.m_5718(this.f_8299);
         this.f_8299 = -1;
         return true;
      } else {
         return true;
      }
   }

   public boolean renderClosing(GuiGraphicsExtractor var1) {
      Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
      Class_Ssh31B3ljfKeWsvS.m_4830();
      Class_Ssh31B3ljfKeWsvS.m_4844();
      this.updateAnimation();
      if (this.f_8292 < f_8380) {
         if (this.f_8303) {
            this.f_8288.m_5699(this.f_8299);
         }

         return true;
      } else {
         float var2 = this.smooth(this.f_8292);
         Class_Ssh31B3ljfKeWsvS.m_4864(f_8381 * var2);
         this.renderWheel(var1, var2);
         Class_Ssh31B3ljfKeWsvS.m_4844();
         return false;
      }
   }

   private record Class_4nx9tn737cXJhTvm(float x, float y, float width, float height, float cell, float gap, int columns) {
      public float cellX(int var1) {
         return this.x + 10.0F * (this.cell / 34.0F) + var1 % this.columns * (this.cell + this.gap);
      }

      public int m_2983(float var1, float var2, int var3) {
         for (int var4 = 0; var4 < var3; var4++) {
            if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.cellX(var4), this.cellY(var4), this.cell, this.cell)) {
               return var4;
            }
         }

         return -1;
      }

      public float cellY(int var1) {
         return this.y + 37.0F * (this.cell / 34.0F) + var1 / this.columns * (this.cell + this.gap);
      }
   }
}
