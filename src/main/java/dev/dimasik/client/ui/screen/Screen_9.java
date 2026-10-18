package dev.dimasik.client.ui.screen;

import dev.dimasik.client.module.misc.PlayerEmotes;
import dev.dimasik.client.system.Class_0p152hWffX3ippAf;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_GGEo7U6LC2t9Tb5z;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_NzJrN63M7QBpmAbi;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_pgtjhKJjK46C8cZl;
import dev.dimasik.client.system.Class_sIga32lGjUfDbarq;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.network.chat.Component;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.lwjgl.glfw.GLFW;

public final class Screen_9 extends Screen implements Class_NzJrN63M7QBpmAbi {
   private static final int f_30557 = 8;
   private static final float f_30558 = (float) (Math.PI * 2);
   private final PlayerEmotes f_30559;
   private final int f_30560;
   private final Class_pgtjhKJjK46C8cZl f_30561 = new Class_pgtjhKJjK46C8cZl();
   private final float[] f_30562 = new float[8];
   private float f_30563;
   private float f_30564;
   private float f_30565;
   private float f_30566;
   private float f_30567;
   private float f_30568;
   private float f_30569;
   private float f_30570 = 1.0F;
   private int f_30571 = -1;
   private String f_30572 = "";
   private int f_30573 = -1;
   private int f_30574;
   private boolean f_30575;
   private boolean f_30576;
   private long f_30577 = System.nanoTime();
   private static final String f_30578 = "Эмоции";
   private static final float f_30579 = 720.0F;
   private static final float f_30580 = 0.85F;
   private static final float f_30581 = 1.55F;
   private static final float f_30582 = 0.5F;
   private static final float f_30583 = 0.5F;
   private static final float f_30584 = 174.0F;
   private static final float f_30585 = 0.008F;
   private static final float f_30586 = 255.0F;
   private static final double f_30587 = 60.0;
   private static final float f_30588 = 0.78F;
   private static final float f_30589 = 0.22F;
   private static final float f_30590 = 72.0F;
   private static final float f_30591 = (float) (Math.PI / 4);
   private static final float f_30592 = 0.16F;
   private static final float f_30593 = 7.0F;
   private static final float f_30594 = 0.002F;
   private static final float f_30595 = 16.0F;
   private static final float f_30596 = 0.7F;
   private static final float f_30597 = 0.3F;
   private static final float f_30598 = 6.0F;
   private static final float f_30599 = (float) (-Math.PI / 2);
   private static final float f_30600 = 0.34F;
   private static final float f_30601 = 0.8F;
   private static final float f_30602 = 6.5F;
   private static final float f_30603 = 2.2F;
   private static final float f_30604 = 6.5F;
   private static final float f_30605 = 2.2F;
   private static final float f_30606 = 0.5F;
   private static final float f_30607 = 0.5F;
   private static final float f_30608 = 4.0F;
   private static final float f_30609 = 31.0F;
   private static final float f_30610 = 5.0F;
   private static final float f_30611 = 0.48F;
   private static final float f_30612 = 0.52F;
   private static final float f_30613 = 0.5F;
   private static final float f_30614 = 0.5F;
   private static final float f_30615 = 6.0F;
   private static final float f_30616 = 0.25F;
   private static final long f_30617 = 5000L;
   private static final float f_30618 = 5000.0F;
   private static final float f_30619 = (float) (Math.PI * 2);
   private static final float f_30620 = 0.7F;
   private static final float f_30621 = 0.55F;
   private static final float f_30622 = 26.0F;
   private static final double f_30623 = 20.0;
   private static final float f_30624 = 46.0F;
   private static final float f_30625 = 0.82F;
   private static final float f_30626 = 0.18F;
   private static final float f_30627 = 14.0F;
   private static final double f_30628 = 200.0;
   private static final double f_30629 = 150.0;
   private static final float f_30630 = 12.0F;
   private static final float f_30631 = 14.0F;
   private static final float f_30632 = 39.0F;
   private static final float f_30633 = 0.75F;
   private static final float f_30634 = 0.25F;
   private static final float f_30635 = 0.5F;
   private static final float f_30636 = 0.62F;
   private static final float f_30637 = 8.0F;
   private static final float f_30638 = 11.0F;
   private static final String f_30639 = "Эмоции";
   private static final float f_30640 = 0.5F;
   private static final float f_30641 = 8.0F;
   private static final float f_30642 = 8.0F;
   private static final float f_30643 = 0.5F;
   private static final float f_30644 = 25.0F;
   private static final float f_30645 = 0.02F;
   private static final float f_30646 = 10.0F;
   private static final float f_30647 = 28.0F;
   private static final float f_30648 = 24.0F;
   private static final float f_30649 = 0.5F;
   private static final float f_30650 = 14.0F;
   private static final float f_30651 = 12.0F;
   private static final float f_30652 = 0.5F;
   private static final double f_30653 = 230.0;
   private static final float f_30654 = 0.5F;
   private static final double f_30655 = 100.0;
   private static final float f_30656 = 0.5F;
   private static final float f_30657 = 0.5F;
   private static final float f_30658 = 0.5F;
   private static final float f_30659 = 24.0F;
   private static final float f_30660 = 18.0F;
   private static final float f_30661 = (float) (Math.PI / 2);
   private static final float f_30662 = (float) (Math.PI * 2);
   private static final float f_30663 = (float) (Math.PI * 2);
   private static final float f_30664 = 8.0F;
   private static final float f_30665 = 12.0F;
   private static final float f_30666 = 1.0E9F;
   private static final float f_30667 = 0.05F;
   private static final float f_30668 = 12.0F;
   private static final float f_30669 = 8.5F;
   private static final float f_30670 = 0.008F;
   private static final float f_30671 = 255.0F;
   private static final float f_30672 = 3.0F;
   private static final float f_30673 = 2.70158F;
   private static final float f_30674 = 1.70158F;

   public void extractRenderState(GuiGraphicsExtractor var1, int var2, int var3, float var4) {
      Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
      Class_Ssh31B3ljfKeWsvS.m_4830();
      Class_Ssh31B3ljfKeWsvS.m_4844();
      float var5 = this.minecraft.getWindow().getScreenWidth();
      float var6 = this.minecraft.getWindow().getScreenHeight();
      this.f_30566 = Math.clamp(var6 / f_30579, f_30580, f_30581);
      this.f_30563 = Math.round(var5 * f_30582);
      this.f_30564 = Math.round(var6 * f_30583);
      this.f_30565 = f_30584 * this.f_30566;
      Vector2f var7 = this.clampMouse(Class_FvJXUGWpZo3zYBW4.m_2693(var2, var3));
      this.updateAnimation();
      if (this.f_30575 && this.f_30567 < f_30585) {
         boolean var9 = this.f_30576;
         this.minecraft.gui.setScreen(null);
         if (var9) {
            this.activateSelected();
         }
      } else {
         if (!this.f_30575) {
            this.f_30573 = this.selectedAt(var7.x, var7.y);
         }

         float var8 = this.smooth(this.f_30567);
         Class_Ssh31B3ljfKeWsvS.m_4864(f_30586 * var8);
         this.renderWheel(var1, var8);
         Class_Ssh31B3ljfKeWsvS.m_4844();
      }
   }

   private void warpCursor(float var1, float var2) {
      double var3 = var1 * this.minecraft.getWindow().getScreenWidth() / Math.max(1.0, this.minecraft.getWindow().getWidth());
      double var5 = var2 * this.minecraft.getWindow().getScreenHeight() / Math.max(1.0, this.minecraft.getWindow().getHeight());
      GLFW.glfwSetCursorPos(this.minecraft.getWindow().handle(), var3, var5);
   }

   public boolean isPauseScreen() {
      return false;
   }

   public boolean mouseClicked(MouseButtonEvent var1, boolean var2) {
      if (var1.button() == 0 && this.f_30573 >= 0) {
         this.finish(true);
         return true;
      } else if (var1.button() == 1) {
         Class_GGEo7U6LC2t9Tb5z.m_2752();
         this.finish(false);
         return true;
      } else {
         return true;
      }
   }

   protected void extractPanorama(GuiGraphicsExtractor var1, float var2) {
   }

   protected void extractMenuBackground(GuiGraphicsExtractor var1, int var2, int var3, int var4, int var5) {
   }

   public void onClose() {
      this.finish(false);
   }

   private float smooth(float var1) {
      float var2 = Math.clamp(var1, 0.0F, 1.0F);
      return var2 * var2 * (f_30672 - 2.0F * var2);
   }

   public boolean renderClosing(GuiGraphicsExtractor var1) {
      Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
      Class_Ssh31B3ljfKeWsvS.m_4830();
      Class_Ssh31B3ljfKeWsvS.m_4844();
      this.updateAnimation();
      if (this.f_30567 < f_30670) {
         if (this.f_30576) {
            this.activateSelected();
         }

         return true;
      } else {
         float var2 = this.smooth(this.f_30567);
         Class_Ssh31B3ljfKeWsvS.m_4864(f_30671 * var2);
         this.renderWheel(var1, var2);
         Class_Ssh31B3ljfKeWsvS.m_4844();
         return false;
      }
   }

   private Vector2f clampMouse(Vector2f var1) {
      float var2 = var1.x - this.f_30563;
      float var3 = var1.y - this.f_30564;
      float var4 = (float)Math.sqrt(var2 * var2 + var3 * var3);
      float var5 = this.f_30565 + f_30665 * this.f_30566;
      if (!(var4 <= var5) && var4 != 0.0F) {
         float var6 = this.f_30563 + var2 / var4 * var5;
         float var7 = this.f_30564 + var3 / var4 * var5;
         this.warpCursor(var6, var7);
         return new Vector2f(var6, var7);
      } else {
         return var1;
      }
   }

   public boolean keyReleased(KeyEvent var1) {
      if (var1.key() == this.f_30560) {
         this.finish(true);
         return true;
      } else {
         return super.keyReleased(var1);
      }
   }

   private static int pageCount() {
      return (Class_sIga32lGjUfDbarq.ALL.size() + 8 - 1) / 8;
   }

   public void finish(boolean var1) {
      if (!this.f_30575) {
         this.f_30575 = true;
         this.f_30576 = var1;
         this.f_30559.m_7708(this);
         this.minecraft.gui.setScreen(null);
      }
   }

   private void updateAnimation() {
      long var1 = System.nanoTime();
      this.f_30568 = Math.clamp((float)(var1 - this.f_30577) / f_30666, 0.0F, f_30667);
      this.f_30577 = var1;
      float var3 = this.f_30575 ? 0.0F : 1.0F;
      float var4 = this.f_30575 ? f_30668 : f_30669;
      this.f_30567 = this.f_30567 + (var3 - this.f_30567) * (1.0F - (float)Math.exp(-this.f_30568 * var4));
   }

   public boolean mouseScrolled(double var1, double var3, double var5, double var7) {
      if (!this.f_30575 && var7 != 0.0) {
         this.f_30574 = Math.floorMod(this.f_30574 + (var7 < 0.0 ? 1 : -1), pageCount());
         this.f_30573 = -1;
         this.f_30571 = -1;
         this.f_30569 = 0.0F;

         for (int var9 = 0; var9 < this.f_30562.length; var9++) {
            this.f_30562[var9] = 0.0F;
         }
      }

      return true;
   }

   public boolean keyPressed(KeyEvent var1) {
      if (var1.key() == 256) {
         this.finish(false);
         return true;
      } else {
         return super.keyPressed(var1);
      }
   }

   private void activateSelected() {
      int var1 = this.f_30574 * 8 + this.f_30573;
      if (this.f_30573 >= 0 && var1 >= 0 && var1 < Class_sIga32lGjUfDbarq.ALL.size()) {
         Class_GGEo7U6LC2t9Tb5z.m_2760(Class_sIga32lGjUfDbarq.ALL.get(var1));
      }
   }

   private int selectedAt(float var1, float var2) {
      float var3 = var1 - this.f_30563;
      float var4 = var2 - this.f_30564;
      float var5 = (float)Math.sqrt(var3 * var3 + var4 * var4);
      if (!(var5 < f_30659 * this.f_30566) && !(var5 > this.f_30565 + f_30660 * this.f_30566)) {
         float var6 = (float)Math.atan2(var4, var3) + f_30661;
         if (var6 < 0.0F) {
            var6 += f_30662;
         }

         int var7 = Math.min(7, (int)(var6 / f_30663 * f_30664));
         return this.f_30574 * 8 + var7 < Class_sIga32lGjUfDbarq.ALL.size() ? var7 : -1;
      } else {
         return -1;
      }
   }

   private int animatedColor(int var1, int var2, int var3, int var4, float var5) {
      return Class_BftdentXEtGbugJw.m_2303(var1, var2, var3, var4 * Math.clamp(var5, 0.0F, 1.0F));
   }

   private void renderWheel(GuiGraphicsExtractor var1, float var2) {
      float var3 = this.minecraft.getWindow().getScreenWidth();
      float var4 = this.minecraft.getWindow().getScreenHeight();
      int var5 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
      int var6 = this.f_30574 * 8;
      int var7 = Math.min(8, Class_sIga32lGjUfDbarq.ALL.size() - var6);
      Class_Ssh31B3ljfKeWsvS.m_4817(0.0F, 0.0F, var3, var4, 0.0F, Class_BftdentXEtGbugJw.m_2303(6, 9, 16, f_30587));
      float var8 = this.outBack(var2);
      float var9 = this.f_30565 * (f_30588 + f_30589 * var8);
      float var10 = f_30590 * this.f_30566;
      float var11 = f_30591;
      this.f_30561.m_8199();

      for (int var12 = 0; var12 < 8; var12++) {
         float var13 = f_30592 * var12 / f_30593;
         float var14 = Math.clamp((this.f_30567 - var13) / (1.0F - var13), 0.0F, 1.0F);
         float var15 = this.smooth(var14);
         if (!(var15 < f_30594)) {
            float var16 = this.outBack(var14);
            float var17 = var12 == this.f_30573 ? 1.0F : 0.0F;
            this.f_30562[var12] = this.f_30562[var12] + (var17 - this.f_30562[var12]) * (1.0F - (float)Math.exp(-this.f_30568 * f_30595));
            float var18 = this.f_30562[var12];
            float var19 = f_30596 + f_30597 * var16;
            float var20 = var10 * var19;
            float var21 = var9 * var19 + var18 * f_30598 * this.f_30566;
            float var22 = f_30599 + var12 * var11 - (1.0F - var15) * f_30600;
            boolean var23 = var12 < var7;
            int var24 = Class_BftdentXEtGbugJw.m_2302(
               var23 ? this.animatedColor(222, 229, 242, 230, var15) : this.animatedColor(150, 158, 174, 150, var15),
               this.animatedColor(248, 251, 255, 245, var15),
               var18
            );
            int var25 = Class_BftdentXEtGbugJw.m_2302(
               var23 ? this.animatedColor(7, 11, 19, 150, var15) : this.animatedColor(7, 11, 19, 72, var15),
               Class_BftdentXEtGbugJw.m_2306(var5, f_30601 * var15),
               var18
            );
            this.f_30561.m_8202(this.f_30563, this.f_30564, var20, var21, var22, var11, f_30602 * this.f_30566, f_30603 * this.f_30566, var24);
            this.f_30561.m_8198(this.f_30563, this.f_30564, var20, var21, var22, var11, f_30604 * this.f_30566, f_30605 * this.f_30566, var25);
            if (var23) {
               Class_sIga32lGjUfDbarq var26 = Class_sIga32lGjUfDbarq.ALL.get(var6 + var12);
               float var27 = var22 + var11 * f_30606;
               float var28 = (var20 + var21) * f_30607 + var18 * f_30608 * this.f_30566;
               float var29 = (f_30609 + var18 * f_30610) * this.f_30566 * (f_30611 + f_30612 * var16);
               float var30 = this.f_30563 + (float)Math.cos(var27) * var28 - var29 * f_30613;
               float var31 = this.f_30564 + (float)Math.sin(var27) * var28 - var29 * f_30614;
               Class_Ssh31B3ljfKeWsvS.m_4838(var30, var31, var29, var29, f_30615 * this.f_30566, var18 > f_30616 ? var5 : -1, var26.icon());
            }
         }
      }

      float var32 = (float)(System.currentTimeMillis() % f_30617) / f_30618 * f_30619;
      this.f_30561
         .m_8198(
            this.f_30563,
            this.f_30564,
            var10 * f_30620,
            var9,
            var32,
            f_30621,
            0.0F,
            f_30622 * this.f_30566,
            Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_30623)
         );
      float var33 = f_30624 * this.f_30566 * (f_30625 + f_30626 * var8);
      Class_Ssh31B3ljfKeWsvS.m_4858(
         this.f_30563 - var33, this.f_30564 - var33, var33 * 2.0F, var33 * 2.0F, f_30627, var33, Class_BftdentXEtGbugJw.m_2303(222, 229, 242, f_30628)
      );
      Class_Ssh31B3ljfKeWsvS.m_4817(
         this.f_30563 - var33, this.f_30564 - var33, var33 * 2.0F, var33 * 2.0F, var33, Class_BftdentXEtGbugJw.m_2303(7, 11, 19, f_30629)
      );
      if (this.f_30573 != this.f_30571) {
         this.f_30571 = this.f_30573;
         if (this.f_30573 >= 0) {
            this.f_30570 = 0.0F;
         }
      }

      this.f_30570 = this.f_30570 + (1.0F - this.f_30570) * (1.0F - (float)Math.exp(-this.f_30568 * f_30630));
      Class_sIga32lGjUfDbarq var34 = this.f_30573 >= 0 && this.f_30573 < var7 ? Class_sIga32lGjUfDbarq.ALL.get(var6 + this.f_30573) : null;
      if (var34 != null) {
         this.f_30572 = var34.title();
      }

      float var35 = var34 == null ? 0.0F : 1.0F;
      this.f_30569 = this.f_30569 + (var35 - this.f_30569) * (1.0F - (float)Math.exp(-this.f_30568 * f_30631));
      if (var34 != null) {
         float var36 = this.smooth(this.f_30570);
         float var39 = f_30632 * this.f_30566 * (f_30633 + f_30634 * this.outBack(var36));
         Class_Ssh31B3ljfKeWsvS.m_4838(this.f_30563 - var39 * f_30635, this.f_30564 - var39 * f_30636, var39, var39, f_30637 * this.f_30566, var5, var34.icon());
      } else {
         int var37 = Math.max(10, Math.round(f_30638 * this.f_30566));
         String var40 = Class_0p152hWffX3ippAf.m_801(f_30639);
         float var42 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var40, var37);
         Class_Ssh31B3ljfKeWsvS.m_4866(
            Class_y1y6QpONhWEUIdEB.m_9588(),
            var40,
            this.f_30563 - var42 * f_30640,
            this.f_30564 - f_30641 * this.f_30566,
            var37,
            Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT)
         );
      }

      String var38 = "" + (this.f_30574 + 1) + pageCount();
      int var41 = Math.max(8, Math.round(f_30642 * this.f_30566));
      float var43 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var38, var41);
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         var38,
         this.f_30563 - var43 * f_30643,
         this.f_30564 + f_30644 * this.f_30566,
         var41,
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT)
      );
      if (this.f_30569 > f_30645 && !this.f_30572.isEmpty()) {
         int var44 = Math.max(9, Math.round(f_30646 * this.f_30566));
         float var45 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), Class_0p152hWffX3ippAf.m_801(this.f_30572), var44);
         float var46 = var45 + f_30647 * this.f_30566;
         float var47 = f_30648 * this.f_30566;
         float var48 = this.f_30563 - var46 * f_30649;
         float var49 = this.f_30564 + this.f_30565 + f_30650 * this.f_30566;
         float var50 = Class_Ssh31B3ljfKeWsvS.m_4821();
         Class_Ssh31B3ljfKeWsvS.m_4864(var50 * this.f_30569);
         Class_Ssh31B3ljfKeWsvS.m_4858(var48, var49, var46, var47, f_30651, var47 * f_30652, Class_BftdentXEtGbugJw.m_2303(222, 229, 242, f_30653));
         Class_Ssh31B3ljfKeWsvS.m_4817(var48, var49, var46, var47, var47 * f_30654, Class_BftdentXEtGbugJw.m_2303(7, 11, 19, f_30655));
         Class_Ssh31B3ljfKeWsvS.m_4866(
            Class_y1y6QpONhWEUIdEB.m_9588(),
            Class_0p152hWffX3ippAf.m_801(this.f_30572),
            this.f_30563 - var45 * f_30656,
            var49 + var47 * f_30657 - var44 * f_30658 - 1.0F,
            var44,
            Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT)
         );
         Class_Ssh31B3ljfKeWsvS.m_4864(var50);
      }
   }

   public Screen_9(PlayerEmotes var1, int var2) {
      super(Component.literal(Class_0p152hWffX3ippAf.m_801(f_30578)));
      this.f_30559 = var1;
      this.f_30560 = var2;
   }

   private float outBack(float var1) {
      float var2 = Math.clamp(var1, 0.0F, 1.0F) - 1.0F;
      return 1.0F + f_30673 * var2 * var2 * var2 + f_30674 * var2 * var2;
   }
}
