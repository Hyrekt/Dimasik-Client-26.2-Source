package dev.dimasik.client.ui.screen;

import dev.dimasik.client.module.combat.ArrowSwap;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_M5gOLfHTfonyKANB;
import dev.dimasik.client.system.Class_NzJrN63M7QBpmAbi;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_pgtjhKJjK46C8cZl;
import dev.dimasik.client.system.Class_rarsEGurCIrNXnKo;
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

public final class Screen_6 extends Screen implements Class_NzJrN63M7QBpmAbi {
   private static final float f_15581 = (float) (Math.PI * 2);
   private final ArrowSwap f_15582;
   private final int f_15583;
   private final Class_pgtjhKJjK46C8cZl f_15584 = new Class_pgtjhKJjK46C8cZl();
   private final float[] f_15585 = new float[6];
   private float f_15586;
   private float f_15587;
   private float f_15588;
   private float f_15589;
   private float f_15590;
   private float f_15591;
   private float f_15592;
   private float f_15593 = 1.0F;
   private int f_15594 = -1;
   private String f_15595 = "";
   private int f_15596 = -1;
   private boolean f_15597;
   private boolean f_15598;
   private long f_15599 = System.nanoTime();
   private static final String f_15600 = "ArrowSwap";
   private static final float f_15601 = 720.0F;
   private static final float f_15602 = 0.85F;
   private static final float f_15603 = 1.55F;
   private static final float f_15604 = 0.5F;
   private static final float f_15605 = 0.5F;
   private static final float f_15606 = 132.0F;
   private static final float f_15607 = 0.008F;
   private static final float f_15608 = 255.0F;
   private static final float f_15609 = 0.78F;
   private static final float f_15610 = 0.22F;
   private static final float f_15611 = 70.0F;
   private static final float f_15612 = (float) (Math.PI * 2);
   private static final float f_15613 = 0.16F;
   private static final float f_15614 = 0.002F;
   private static final float f_15615 = 16.0F;
   private static final float f_15616 = 0.7F;
   private static final float f_15617 = 0.3F;
   private static final float f_15618 = 6.0F;
   private static final float f_15619 = (float) (-Math.PI / 2);
   private static final float f_15620 = 0.34F;
   private static final float f_15621 = 0.5F;
   private static final float f_15622 = 0.5F;
   private static final float f_15623 = 4.0F;
   private static final float f_15624 = 1.38F;
   private static final float f_15625 = 0.32F;
   private static final float f_15626 = 0.48F;
   private static final float f_15627 = 0.52F;
   private static final float f_15628 = 16.0F;
   private static final String f_15629 = "+";
   private static final float f_15630 = 0.5F;
   private static final float f_15631 = 8.0F;
   private static final float f_15632 = 8.0F;
   private static final float f_15633 = 8.0F;
   private static final float f_15634 = 46.0F;
   private static final float f_15635 = 0.82F;
   private static final float f_15636 = 0.18F;
   private static final float f_15637 = 12.0F;
   private static final float f_15638 = 14.0F;
   private static final float f_15639 = 1.55F;
   private static final float f_15640 = 0.75F;
   private static final float f_15641 = 0.25F;
   private static final float f_15642 = 8.0F;
   private static final float f_15643 = 8.0F;
   private static final float f_15644 = 0.02F;
   private static final float f_15645 = 10.0F;
   private static final float f_15646 = 28.0F;
   private static final float f_15647 = 24.0F;
   private static final float f_15648 = 0.5F;
   private static final float f_15649 = 14.0F;
   private static final float f_15650 = 12.0F;
   private static final float f_15651 = 0.5F;
   private static final double f_15652 = 230.0;
   private static final float f_15653 = 0.5F;
   private static final double f_15654 = 100.0;
   private static final float f_15655 = 0.5F;
   private static final float f_15656 = 0.5F;
   private static final float f_15657 = 0.5F;
   private static final float f_15658 = 24.0F;
   private static final float f_15659 = 18.0F;
   private static final float f_15660 = (float) (Math.PI / 2);
   private static final float f_15661 = (float) (Math.PI * 2);
   private static final float f_15662 = (float) (Math.PI * 2);
   private static final float f_15663 = 12.0F;
   private static final float f_15664 = 1.0E9F;
   private static final float f_15665 = 0.05F;
   private static final float f_15666 = 12.0F;
   private static final float f_15667 = 8.5F;
   private static final float f_15668 = 0.008F;
   private static final float f_15669 = 255.0F;
   private static final float f_15670 = 3.0F;
   private static final float f_15671 = 2.70158F;
   private static final float f_15672 = 1.70158F;

   public void finish(boolean var1) {
      if (!this.f_15597) {
         this.f_15597 = true;
         this.f_15598 = var1;
         this.f_15582.m_6430(this);
         this.minecraft.gui.setScreen(null);
      }
   }

   public void extractRenderState(GuiGraphicsExtractor var1, int var2, int var3, float var4) {
      Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
      Class_Ssh31B3ljfKeWsvS.m_4830();
      Class_Ssh31B3ljfKeWsvS.m_4844();
      float var5 = this.minecraft.getWindow().getScreenWidth();
      float var6 = this.minecraft.getWindow().getScreenHeight();
      this.f_15589 = Math.clamp(var6 / f_15601, f_15602, f_15603);
      this.f_15586 = Math.round(var5 * f_15604);
      this.f_15587 = Math.round(var6 * f_15605);
      this.f_15588 = f_15606 * this.f_15589;
      Vector2f var7 = this.clampMouse(Class_FvJXUGWpZo3zYBW4.m_2693(var2, var3));
      this.updateAnimation();
      if (this.f_15597 && this.f_15590 < f_15607) {
         int var10 = this.f_15596;
         boolean var9 = this.f_15598;
         this.minecraft.gui.setScreen(null);
         if (var9 && var10 >= 0) {
            this.f_15582.m_6434(var10);
         }
      } else {
         if (!this.f_15597) {
            this.f_15596 = this.selectedAt(var7.x, var7.y);
         }

         float var8 = this.smooth(this.f_15590);
         Class_Ssh31B3ljfKeWsvS.m_4864(f_15608 * var8);
         this.renderWheel(var1, var8);
         Class_Ssh31B3ljfKeWsvS.m_4844();
      }
   }

   public void onClose() {
      this.finish(false);
   }

   private void warpCursor(float var1, float var2) {
      double var3 = var1 * this.minecraft.getWindow().getScreenWidth() / Math.max(1.0, this.minecraft.getWindow().getWidth());
      double var5 = var2 * this.minecraft.getWindow().getScreenHeight() / Math.max(1.0, this.minecraft.getWindow().getHeight());
      GLFW.glfwSetCursorPos(this.minecraft.getWindow().handle(), var3, var5);
   }

   private void renderWheel(GuiGraphicsExtractor var1, float var2) {
      float var3 = this.minecraft.getWindow().getScreenWidth();
      float var4 = this.minecraft.getWindow().getScreenHeight();
      int var5 = this.f_15582.m_6412();
      Class_M5gOLfHTfonyKANB.m_3876(var3, var4);
      float var6 = this.outBack(var2);
      float var7 = this.f_15588 * (f_15609 + f_15610 * var6);
      float var8 = f_15611 * this.f_15589;
      float var9 = f_15612 / var5;
      this.f_15584.m_8199();

      for (int var10 = 0; var10 < var5; var10++) {
         float var11 = var5 <= 1 ? 0.0F : f_15613 * var10 / (var5 - 1.0F);
         float var12 = Math.clamp((this.f_15590 - var11) / (1.0F - var11), 0.0F, 1.0F);
         float var13 = this.smooth(var12);
         if (!(var13 < f_15614)) {
            float var14 = this.outBack(var12);
            float var15 = var10 == this.f_15596 ? 1.0F : 0.0F;
            this.f_15585[var10] = this.f_15585[var10] + (var15 - this.f_15585[var10]) * (1.0F - (float)Math.exp(-this.f_15591 * f_15615));
            float var16 = this.f_15585[var10];
            float var17 = f_15616 + f_15617 * var14;
            float var18 = var8 * var17;
            float var19 = var7 * var17 + var16 * f_15618 * this.f_15589;
            float var20 = f_15619 + var10 * var9 - (1.0F - var13) * f_15620;
            boolean var21 = this.f_15582.m_6418(var10);
            float var22 = var20 + var9 * f_15621;
            Class_M5gOLfHTfonyKANB.m_3878(this.f_15584, this.f_15586, this.f_15587, var18, var19, var20, var9, var21, var13, var16, this.f_15589);
            float var23 = (var18 + var19) * f_15622 + var16 * f_15623 * this.f_15589;
            float var24 = this.f_15586 + (float)Math.cos(var22) * var23;
            float var25 = this.f_15587 + (float)Math.sin(var22) * var23;
            ItemStack var26 = this.f_15582.m_6413(var10);
            float var27 = this.f_15589 * (f_15624 + var16 * f_15625) * (f_15626 + f_15627 * var14);
            if (var26.isEmpty()) {
               int var28 = Math.max(12, Math.round(f_15628 * this.f_15589));
               String var29 = f_15629;
               Class_Ssh31B3ljfKeWsvS.m_4866(
                  Class_y1y6QpONhWEUIdEB.m_9588(),
                  var29,
                  var24 - Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var29, var28) * f_15630,
                  var25 - f_15631 * this.f_15589,
                  var28,
                  Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT), var13)
               );
            } else {
               Class_Ssh31B3ljfKeWsvS.m_4832(var1, var26, var24 - f_15632 * var27, var25 - f_15633 * var27, var27, false);
            }
         }
      }

      float var30 = f_15634 * this.f_15589 * (f_15635 + f_15636 * var6);
      Class_M5gOLfHTfonyKANB.m_3879(this.f_15586, this.f_15587, var30, this.f_15589, var2);
      if (this.f_15596 != this.f_15594) {
         this.f_15594 = this.f_15596;
         if (this.f_15596 >= 0) {
            this.f_15593 = 0.0F;
         }
      }

      this.f_15593 = this.f_15593 + (1.0F - this.f_15593) * (1.0F - (float)Math.exp(-this.f_15591 * f_15637));
      ItemStack var31 = this.f_15596 >= 0 ? this.f_15582.m_6413(this.f_15596) : ItemStack.EMPTY;
      if (!var31.isEmpty()) {
         this.f_15595 = var31.getHoverName().getString();
      }

      float var32 = var31.isEmpty() ? 0.0F : 1.0F;
      this.f_15592 = this.f_15592 + (var32 - this.f_15592) * (1.0F - (float)Math.exp(-this.f_15591 * f_15638));
      if (!var31.isEmpty()) {
         float var33 = this.smooth(this.f_15593);
         float var35 = f_15639 * this.f_15589 * (f_15640 + f_15641 * this.outBack(var33));
         Class_Ssh31B3ljfKeWsvS.m_4832(var1, var31, this.f_15586 - f_15642 * var35, this.f_15587 - f_15643 * var35, var35, false);
      }

      if (this.f_15592 > f_15644 && !this.f_15595.isEmpty()) {
         int var34 = Math.max(9, Math.round(f_15645 * this.f_15589));
         float var36 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), this.f_15595, var34);
         float var37 = var36 + f_15646 * this.f_15589;
         float var38 = f_15647 * this.f_15589;
         float var39 = this.f_15586 - var37 * f_15648;
         float var40 = this.f_15587 + this.f_15588 + f_15649 * this.f_15589;
         float var41 = Class_Ssh31B3ljfKeWsvS.m_4821();
         Class_Ssh31B3ljfKeWsvS.m_4864(var41 * this.f_15592);
         Class_Ssh31B3ljfKeWsvS.m_4858(var39, var40, var37, var38, f_15650, var38 * f_15651, Class_BftdentXEtGbugJw.m_2303(222, 229, 242, f_15652));
         Class_Ssh31B3ljfKeWsvS.m_4817(var39, var40, var37, var38, var38 * f_15653, Class_BftdentXEtGbugJw.m_2303(7, 11, 19, f_15654));
         Class_Ssh31B3ljfKeWsvS.m_4866(
            Class_y1y6QpONhWEUIdEB.m_9588(),
            this.f_15595,
            this.f_15586 - var36 * f_15655,
            var40 + var38 * f_15656 - var34 * f_15657 - 1.0F,
            var34,
            this.f_15596 >= 0 && !this.f_15582.m_6418(this.f_15596)
               ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT)
               : Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT)
         );
         Class_Ssh31B3ljfKeWsvS.m_4864(var41);
      }
   }

   public boolean keyReleased(KeyEvent var1) {
      if (var1.key() == this.f_15583) {
         this.finish(true);
         return true;
      } else {
         return super.keyReleased(var1);
      }
   }

   protected void extractMenuBackground(GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5) {
   }

   public boolean mouseClicked(MouseButtonEvent var1, boolean var2) {
      if (var1.button() == 0 && this.f_15596 >= 0) {
         this.minecraft.gui.setScreen(new Class_rarsEGurCIrNXnKo(this.f_15582, this.f_15596, this, this.f_15583));
         return true;
      }

      if (var1.button() == 0) {
         this.f_15596 = this.f_15582.m_6415();
         return true;
      }

      if (var1.button() == 1) {
         this.f_15582.m_6421(this.f_15596);
         if (this.f_15596 >= this.f_15582.m_6412()) {
            this.f_15596 = this.f_15582.m_6412() - 1;
         }

         return true;
      } else {
         return true;
      }
   }

   private float outBack(float var1) {
      float var2 = Math.clamp(var1, 0.0F, 1.0F) - 1.0F;
      return 1.0F + f_15671 * var2 * var2 * var2 + f_15672 * var2 * var2;
   }

   private float smooth(float var1) {
      float var2 = Math.clamp(var1, 0.0F, 1.0F);
      return var2 * var2 * (f_15670 - 2.0F * var2);
   }

   public boolean isPauseScreen() {
      return false;
   }

   public Screen_6(ArrowSwap var1, int var2) {
      super(Component.literal(f_15600));
      this.f_15582 = var1;
      this.f_15583 = var2;
   }

   public boolean renderClosing(GuiGraphicsExtractor var1) {
      Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
      Class_Ssh31B3ljfKeWsvS.m_4830();
      Class_Ssh31B3ljfKeWsvS.m_4844();
      this.updateAnimation();
      if (this.f_15590 < f_15668) {
         if (this.f_15598 && this.f_15596 >= 0) {
            this.f_15582.m_6434(this.f_15596);
         }

         return true;
      } else {
         float var2 = this.smooth(this.f_15590);
         Class_Ssh31B3ljfKeWsvS.m_4864(f_15669 * var2);
         this.renderWheel(var1, var2);
         Class_Ssh31B3ljfKeWsvS.m_4844();
         return false;
      }
   }

   private int selectedAt(float var1, float var2) {
      int var3 = this.f_15582.m_6412();
      if (var3 <= 0) {
         return -1;
      }

      float var4 = var1 - this.f_15586;
      float var5 = var2 - this.f_15587;
      float var6 = (float)Math.sqrt(var4 * var4 + var5 * var5);
      if (!(var6 < f_15658 * this.f_15589) && !(var6 > this.f_15588 + f_15659 * this.f_15589)) {
         float var7 = (float)Math.atan2(var5, var4) + f_15660;
         if (var7 < 0.0F) {
            var7 += f_15661;
         }

         return Math.min(var3 - 1, (int)(var7 / f_15662 * var3));
      } else {
         return -1;
      }
   }

   private Vector2f clampMouse(Vector2f var1) {
      float var2 = var1.x - this.f_15586;
      float var3 = var1.y - this.f_15587;
      float var4 = (float)Math.sqrt(var2 * var2 + var3 * var3);
      float var5 = this.f_15588 + f_15663 * this.f_15589;
      if (!(var4 <= var5) && var4 != 0.0F) {
         float var6 = this.f_15586 + var2 / var4 * var5;
         float var7 = this.f_15587 + var3 / var4 * var5;
         this.warpCursor(var6, var7);
         return new Vector2f(var6, var7);
      } else {
         return var1;
      }
   }

   protected void extractPanorama(GuiGraphicsExtractor var1, float var2) {
   }

   private int animatedColor(int var1, int var2, int var3, int var4, float var5) {
      return Class_BftdentXEtGbugJw.m_2303(var1, var2, var3, var4 * Math.clamp(var5, 0.0F, 1.0F));
   }

   private void updateAnimation() {
      long var1 = System.nanoTime();
      this.f_15591 = Math.clamp((float)(var1 - this.f_15599) / f_15664, 0.0F, f_15665);
      this.f_15599 = var1;
      float var3 = this.f_15597 ? 0.0F : 1.0F;
      float var4 = this.f_15597 ? f_15666 : f_15667;
      this.f_15590 = this.f_15590 + (var3 - this.f_15590) * (1.0F - (float)Math.exp(-this.f_15591 * var4));
   }

   public boolean keyPressed(KeyEvent var1) {
      if (var1.key() == 256) {
         this.finish(false);
         return true;
      } else {
         return super.keyPressed(var1);
      }
   }
}
