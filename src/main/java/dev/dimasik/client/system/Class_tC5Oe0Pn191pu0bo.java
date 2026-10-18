package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.ClientSounds;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.ui.screen.Screen_8;
import java.util.List;
import java.util.Locale;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class Class_tC5Oe0Pn191pu0bo extends Class_c7bxavYluZ02uW8X<MultiChoiceSetting> {
   private static final int f_31545 = 5;
   private static final float f_31546 = 26.0F;
   private static final float f_31547 = 22.0F;
   private static final float f_31548 = 4.0F;
   private static final float f_31549 = 42.0F;
   private final Class_w8fCJQ5ZtH5lQbWc f_31550;
   private final Class_w8fCJQ5ZtH5lQbWc f_31551;
   private boolean f_31552;
   private Class_2ZaVm8TGDJ68TnJB f_31553;
   private float f_31554;
   private float f_31555;
   private boolean f_31556;
   private float f_31557;
   private static final float f_31558 = 24.0F;
   private static final float f_31559 = 10.0F;
   private static final float f_31560 = 14.0F;
   private static final float f_31561 = 24.0F;
   private static final float f_31562 = 5.0F;
   private static final float f_31563 = 100.0F;
   private static final float f_31564 = 100.0F;
   private static final float f_31565 = 6.0F;
   private static final float f_31566 = 96.0F;
   private static final float f_31567 = 72.0F;
   private static final float f_31568 = 4.0F;
   private static final float f_31569 = 92.0F;
   private static final float f_31570 = 6.0F;
   private static final float f_31571 = 16.0F;
   private static final String f_31572 = "Не выбрано";
   private static final float f_31573 = 60.0F;
   private static final float f_31574 = 12.0F;
   private static final float f_31575 = 92.0F;
   private static final float f_31576 = 4.5F;
   private static final float f_31577 = 22.0F;
   private static final float f_31578 = 5.0F;
   private static final float f_31579 = 16.0F;
   private static final float f_31580 = 16.0F;
   private static final String f_31581 = "gui/arrow";
   private static final String f_31582 = "...";
   private static final float f_31583 = 26.0F;
   private static final float f_31584 = 26.0F;
   private static final float f_31585 = 50.0F;
   private static final float f_31586 = 5.0F;
   private static final float f_31587 = 4.0F;
   private static final float f_31588 = 26.0F;
   private static final float f_31589 = 4.0F;
   private static final float f_31590 = 4.0F;
   private static final float f_31591 = 1.25F;
   private static final float f_31592 = 4.0F;
   private static final float f_31593 = 24.0F;
   private static final float f_31594 = 22.0F;
   private static final float f_31595 = 14.0F;
   private static final float f_31596 = 255.0F;
   private static final float f_31597 = 14.0F;
   private static final float f_31598 = 14.0F;
   private static final float f_31599 = 8.0F;
   private static final float f_31600 = 4.0F;
   private static final float f_31601 = 26.0F;
   private static final float f_31602 = 26.0F;
   private static final float f_31603 = 12.0F;
   private static final float f_31604 = 3.0F;
   private static final float f_31605 = 16.0F;
   private static final float f_31606 = 12.0F;
   private static final float f_31607 = 4.0F;
   private static final float f_31608 = 0.85F;
   private static final float f_31609 = 4.0F;
   private static final float f_31610 = 4.0F;
   private static final float f_31611 = 5.0F;
   private static final float f_31612 = 100.0F;
   private static final double f_31613 = 100.0;
   private static final float f_31614 = 4.0F;
   private static final float f_31615 = 26.0F;
   private static final float f_31616 = 50.0F;
   private static final float f_31617 = 5.0F;
   private static final float f_31618 = 4.0F;
   private static final float f_31619 = 26.0F;
   private static final float f_31620 = 26.0F;
   private static final float f_31621 = 26.0F;
   private static final float f_31622 = 50.0F;
   private static final float f_31623 = 5.0F;
   private static final float f_31624 = 4.0F;
   private static final float f_31625 = 26.0F;
   private static final float f_31626 = 4.0F;
   private static final float f_31627 = 4.0F;
   private static final float f_31628 = 8.0F;
   private static final float f_31629 = 15.0F;
   private static final float f_31630 = 4.0F;
   private static final double f_31631 = 10.0;
   private static final float f_31632 = 4.0F;
   private static final float f_31633 = 26.0F;
   private static final float f_31634 = 26.0F;
   private static final float f_31635 = 22.0F;
   private static final float f_31636 = 1.25F;
   private static final float f_31637 = 4.0F;
   private static final float f_31638 = 26.0F;
   private static final float f_31639 = 26.0F;
   private static final float f_31640 = 50.0F;
   private static final float f_31641 = 5.0F;
   private static final float f_31642 = 4.0F;
   private static final float f_31643 = 26.0F;
   private static final float f_31644 = 4.0F;
   private static final float f_31645 = 26.0F;
   private static final float f_31646 = 159.0F;
   private static final String f_31647 = "...";
   private static final float f_31648 = 16.0F;
   private static final String f_31649 = "Донат";
   private static final String f_31650 = "Default";
   private static final float f_31651 = 255.0F;
   private static final int f_31652 = 16777215;
   private static final float f_31653 = 10.0F;
   private static final float f_31654 = -1.0F;
   private static final float f_31655 = -1.0F;
   private static final float f_31656 = 0.5F;
   private static final float f_31657 = 0.5F;
   private static final float f_31658 = 0.5F;
   private static final float f_31659 = 0.5F;
   private static final long f_31660 = 280L;
   private static final long f_31661 = 3L;
   private static final String f_31662 = ".";
   private static final String f_31663 = "SPC";
   private static final String f_31664 = "LSH";
   private static final String f_31665 = "RSH";
   private static final String f_31666 = "LCT";
   private static final String f_31667 = "RCT";
   private static final String f_31668 = "LAL";
   private static final String f_31669 = "RAL";
   private static final String f_31670 = "ENT";
   private static final String f_31671 = "TAB";
   private static final String f_31672 = "CAP";
   private static final String f_31673 = "UP";
   private static final String f_31674 = "DN";
   private static final String f_31675 = "LT";
   private static final String f_31676 = "RT";
   private static final String f_31677 = "DEL";
   private static final String f_31678 = "BS";
   private static final float f_31679 = 15.0F;
   private static final float f_31680 = 3.5F;
   private static final float f_31681 = 3.5F;
   private static final float f_31682 = 255.0F;
   private static final float f_31683 = 0.9F;
   private static final float f_31684 = 0.7F;
   private static final float f_31685 = 22.0F;

   @Override
   public void m_694() {
      for (Class_2ZaVm8TGDJ68TnJB var2 : this.f_18147.m_8768()) {
         var2.m_1182().m_843(var2.m_1188().getAsBoolean());
         var2.m_1186().m_9283(var2 == this.f_18147.m_7564() ? 1.0F : 0.0F);
      }
   }

   private String m_8785(int var1) {
      if (var1 < 0) {
         return "";
      }

      if (var1 >= 0 && var1 <= 7) {
         return var1 + 1 + "";
      }

      return switch (var1) {
         case 32 -> f_31663;
         case 257 -> f_31670;
         case 258 -> f_31671;
         case 259 -> f_31678;
         case 261 -> f_31677;
         case 262 -> f_31676;
         case 263 -> f_31675;
         case 264 -> f_31674;
         case 265 -> f_31673;
         case 280 -> f_31672;
         case 340 -> f_31664;
         case 341 -> f_31666;
         case 342 -> f_31668;
         case 344 -> f_31665;
         case 345 -> f_31667;
         case 346 -> f_31669;
         default -> {
            String var2 = Class_vAC0cSmAiUV3cskz.m_9251(var1);
            yield var2.isEmpty() ? var1 + "" : var2.toUpperCase(Locale.ROOT);
         }
      };
   }

   @Override
   public void m_698(int var1) {
      if (this.f_31553 != null) {
         if (var1 == 256) {
            this.f_31553 = null;
         } else if (var1 != 261 && var1 != 259) {
            this.f_31553.m_1189().m_1367(var1);
            ClientSounds.m_9463(ClientSounds.KG2FYhAQHwVAXDJG.BIND_SET);
            Class_5SHCkqfIMPKgkAV5.m_1480(var1);
            this.f_31553 = null;
            this.m_8787();
         } else {
            this.f_31553.m_1189().m_1367(-1);
            ClientSounds.m_9463(ClientSounds.KG2FYhAQHwVAXDJG.BIND_RESET);
            this.f_31553 = null;
            this.m_8787();
         }
      }
   }

   @Override
   public boolean m_702() {
      return this.f_31553 != null;
   }

   private float m_8786(float var1, float var2, float var3, float var4) {
      float var5 = var2 + var3 / 2.0F;
      return var5 + (var1 - var5) / var4;
   }

   @Override
   public boolean m_2319(float var1, float var2, int var3) {
      if (!this.f_31552) {
         return false;
      }

      List var4 = this.m_8797();
      if (var4.isEmpty()) {
         return false;
      }

      float var5 = this.m_8802(var4);
      float var6 = Math.min(5, var4.size()) * f_31620;
      float var7 = var4.size() * f_31621;
      float var8 = Math.max(0.0F, var7 - var6);
      this.f_31554 = Math.clamp(this.f_31554, 0.0F, var8);
      float var9 = this.m_6148(this.f_18143 + this.f_18145 - f_31622, var5);
      float var10 = this.m_6146(this.f_18144 + this.f_18146 + f_31623, f_31624 + Math.min(5, var4.size()) * f_31625);
      float var11 = var10 + f_31626;
      float var12 = f_31627 + var6;
      float var13 = this.m_8793();
      float var14 = this.m_8786(var1, var9, var5, var13);
      float var15 = this.m_8786(var2, var10, var12, var13);
      if (!Class_FvJXUGWpZo3zYBW4.m_2697(var14, var15, var9, var10, var5, var12) && this.f_31553 == null) {
         return false;
      }

      if (this.f_31553 != null) {
         if (var3 != 0) {
            this.f_31553.m_1189().m_1367(var3);
            ClientSounds.m_9463(ClientSounds.KG2FYhAQHwVAXDJG.BIND_SET);
            Class_5SHCkqfIMPKgkAV5.m_1480(var3);
            this.f_31553 = null;
            this.m_8787();
         }

         return true;
      } else {
         boolean var16 = var8 > 0.0F;
         float var17 = var5 - f_31628 - (var16 ? 8 : 0);
         if (var3 == 0 && var16) {
            float var18 = var9 + var5 - f_31629;
            if (Class_FvJXUGWpZo3zYBW4.m_2697(var14, var15, var18 - f_31630, var11, f_31631, var6)) {
               this.m_8791(var15, var11, var6, var7, var8);
               return true;
            }
         }

         if (Class_FvJXUGWpZo3zYBW4.m_2697(var14, var15, var9 + f_31632, var11, var17, var6)) {
            float var22 = var15 - var11 + this.f_31554;
            int var19 = (int)(var22 / f_31633);
            float var20 = var22 - var19 * f_31634;
            if (var19 >= 0 && var19 < var4.size() && var20 <= f_31635) {
               Class_2ZaVm8TGDJ68TnJB var21 = (Class_2ZaVm8TGDJ68TnJB)var4.get(var19);
               if (var3 == 1) {
                  this.f_31553 = var21;
                  ClientSounds.m_9463(ClientSounds.KG2FYhAQHwVAXDJG.BIND_START);
               } else if (var3 == 0 && this.f_18147.m_7564() != var21) {
                  this.f_18147.m_1767(var21);
                  ClientSounds.m_9462(ClientSounds.KG2FYhAQHwVAXDJG.MODE, (float)var19 / Math.max(1, var4.size() - 1));
               }
            }

            return true;
         } else {
            return var3 == 0;
         }
      }
   }

   private void m_8787() {
      DimasikClient.m_9057().m_9049().m_2802().m_8844().m_5559();
   }

   @Override
   public void m_2322() {
      this.f_31552 = false;
      this.f_31553 = null;
      this.f_31556 = false;
   }

   private String m_8788(String var1, float var2, float var3) {
      if (Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var1, (int)var3) <= var2) {
         return var1;
      }

      String var4 = f_31582;
      int var5 = var1.length();

      while (var5 > 0) {
         var5 = var1.offsetByCodePoints(var5, -1);
         String var6 = var1.substring(0, var5) + var4;
         if (Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var6, (int)var3) <= var2) {
            return var6;
         }
      }

      return var4;
   }

   private void m_8790(float var1, float var2, float var3, float var4, float var5) {
      float var6 = this.m_8799(var3, var4);
      float var7 = var3 - var6;
      if (!(var7 <= 0.0F) && !(var5 <= 0.0F)) {
         float var8 = Math.clamp((var1 - this.f_31557 - var2) / var7, 0.0F, 1.0F);
         this.f_31554 = var8 * var5;
         this.f_31555 = this.f_31554;
         this.f_31551.m_9281(this.f_31554);
      } else {
         this.m_8796();
      }
   }

   @Override
   public void m_701(float var1, float var2, float var3) {
      this.f_18146 = f_31561;
      this.f_31550.m_9283(this.f_31552 ? 1.0F : 0.0F);
      int var4 = Class_BftdentXEtGbugJw.m_2302(
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OPEN_SETTING_TEXT),
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEOPEN_SETTING_TEXT),
         this.f_31550.m_9288()
      );
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         Class_0p152hWffX3ippAf.m_801(this.f_18147.m_8764()),
         this.f_18143,
         this.f_18144 + f_31562,
         13,
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT)
      );
      Class_Ssh31B3ljfKeWsvS.m_4854(
         this.f_18143 + this.f_18145 - f_31563,
         this.f_18144,
         f_31564,
         this.f_18146,
         1.0F,
         f_31565,
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE)
      );
      Class_2ZaVm8TGDJ68TnJB var5 = this.f_18147.m_7564();
      if (this.m_8798(var5)) {
         Class_Ssh31B3ljfKeWsvS.m_4860(this.f_18143 + this.f_18145 - f_31566, this.f_18144 + 2.0F, f_31567, this.f_18146 - f_31568);
         this.m_8794(var5, this.f_18143 + this.f_18145 - f_31569, this.f_18144 + f_31570, f_31571, var4);
         Class_Ssh31B3ljfKeWsvS.m_4828();
      } else {
         String var6 = var5 == null ? Class_0p152hWffX3ippAf.m_801(f_31572) : Class_0p152hWffX3ippAf.m_801(var5.m_1181());
         Class_Ssh31B3ljfKeWsvS.m_4866(
            Class_y1y6QpONhWEUIdEB.m_9588(), this.m_8788(var6, f_31573, f_31574), this.f_18143 + this.f_18145 - f_31575, this.f_18144 + f_31576, 12, var4
         );
      }

      Class_Ssh31B3ljfKeWsvS.m_4838(
         this.f_18143 + this.f_18145 - f_31577, this.f_18144 + f_31578, f_31579, f_31580, 0.0F, var4, Class_wHRRCm2tlLY7DN4I.m_9311(f_31581)
      );
   }

   private void m_8791(float var1, float var2, float var3, float var4, float var5) {
      float var6 = this.m_8799(var3, var4);
      float var7 = var3 - var6;
      float var8 = var2 + var7 * (var5 <= 0.0F ? 0.0F : this.f_31554 / var5);
      this.f_31557 = var1 >= var8 && var1 <= var8 + var6 ? var1 - var8 : var6 / 2.0F;
      this.f_31556 = true;
      this.m_8790(var1, var2, var3, var4, var5);
   }

   private String m_8792() {
      int var1 = (int)(System.currentTimeMillis() / f_31660 % f_31661) + 1;
      return f_31662.repeat(var1);
   }

   private float m_8793() {
      return Math.max(1.0F, f_31636 * (1.0F - this.f_31550.m_9288() / f_31637));
   }

   private void m_8794(Class_2ZaVm8TGDJ68TnJB var1, float var2, float var3, float var4, int var5) {
      char var6 = Class_JInbhwbvIxCoRpXA.m_3260(var1.m_1181());
      int var7 = Math.clamp(Math.round((var5 >>> 24) * Class_Ssh31B3ljfKeWsvS.m_4821() / f_31651), 0, 255);
      if (var7 != 0) {
         int var8 = var7 << 24 | f_31652;
         Minecraft var9 = Minecraft.getInstance();
         if (var9.gui.screen() instanceof Screen_8 var10) {
            GuiGraphicsExtractor var29 = var10.getFrameContext();
            if (var29 != null) {
               float var12 = var9.getWindow().getGuiScale();
               Vector4f var13 = this.m_8800(var2, var3, var4, var4);
               boolean var14 = Class_Ssh31B3ljfKeWsvS.m_4812();
               if (var14) {
                  Vector4f var15 = Class_Ssh31B3ljfKeWsvS.m_4834();
                  Vector4f var16 = this.m_8800(var15.x, var15.y, var15.z, var15.w);
                  int var17 = (int)Math.floor(var16.x / var12);
                  int var18 = (int)Math.floor(var16.y / var12);
                  int var19 = (int)Math.ceil((var16.x + var16.z) / var12);
                  int var20 = (int)Math.ceil((var16.y + var16.w) / var12);
                  if (var19 <= var17 || var20 <= var18) {
                     return;
                  }

                  var29.enableScissor(var17, var18, var19, var20);
               }

               var29.pose().pushMatrix();

               try {
                  float var30 = var13.w / (f_31653 * var12);
                  var29.pose().translate(var13.x / var12, var13.y / var12);
                  var29.pose().scale(var30, var30);
                  Class_29BIBbZyd5QWCwS1.m_959();

                  try {
                     var29.text(var9.font, String.valueOf(var6), 0, 0, var8, false);
                  } finally {
                     Class_29BIBbZyd5QWCwS1.m_969();
                  }
               } finally {
                  var29.pose().popMatrix();
                  if (var14) {
                     var29.disableScissor();
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean m_2320(float var1, float var2, double var3) {
      if (!this.f_31552) {
         return false;
      }

      List var5 = this.m_8797();
      float var6 = this.m_8802(var5);
      float var7 = Math.min(5, var5.size()) * f_31638;
      float var8 = var5.size() * f_31639;
      float var9 = Math.max(0.0F, var8 - var7);
      float var10 = this.m_6148(this.f_18143 + this.f_18145 - f_31640, var6);
      float var11 = this.m_6146(this.f_18144 + this.f_18146 + f_31641, f_31642 + Math.min(5, var5.size()) * f_31643);
      float var12 = f_31644 + var7;
      float var13 = this.m_8793();
      float var14 = this.m_8786(var1, var10, var6, var13);
      float var15 = this.m_8786(var2, var11, var12, var13);
      if (!Class_FvJXUGWpZo3zYBW4.m_2697(var14, var15, var10, var11, var6, var12)) {
         return false;
      }

      float var16 = this.f_31555;
      this.f_31555 = this.f_31555 - (float)var3 * f_31645;
      this.f_31555 = Math.clamp(this.f_31555, 0.0F, var9);
      if (var16 != this.f_31555) {
         ClientSounds.m_9463(ClientSounds.KG2FYhAQHwVAXDJG.SCROLL);
      }

      return true;
   }

   public Class_tC5Oe0Pn191pu0bo(MultiChoiceSetting var1) {
      super(var1, f_31558);
      this.f_31550 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_31559);
      this.f_31551 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_31560, Class_eXr9Fra2ad3yFXY8.f_19100);
   }

   @Override
   public void m_700(float var1, float var2, int var3) {
      if (var3 == 0 && Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_18143 + this.f_18145 - f_31612, this.f_18144, f_31613, this.f_18146)) {
         this.f_31552 = !this.f_31552;
         ClientSounds.m_9463(this.f_31552 ? ClientSounds.KG2FYhAQHwVAXDJG.PICKER_OPEN : ClientSounds.KG2FYhAQHwVAXDJG.PICKER_CLOSE);
         if (!this.f_31552) {
            this.f_31556 = false;
         }
      } else if (this.f_31552) {
         List var4 = this.m_8797();
         if (var4.isEmpty()) {
            this.f_31552 = false;
         } else {
            float var5 = this.m_8802(var4);
            float var6 = f_31614 + Math.min(5, var4.size()) * f_31615;
            float var7 = this.m_6148(this.f_18143 + this.f_18145 - f_31616, var5);
            float var8 = this.m_6146(this.f_18144 + this.f_18146 + f_31617, f_31618 + Math.min(5, var4.size()) * f_31619);
            float var9 = this.m_8793();
            float var10 = this.m_8786(var1, var7, var5, var9);
            float var11 = this.m_8786(var2, var8, var6, var9);
            if (!Class_FvJXUGWpZo3zYBW4.m_2697(var10, var11, var7, var8, var5, var6)) {
               this.f_31552 = false;
               this.f_31553 = null;
               this.f_31556 = false;
            }
         }
      }
   }

   public boolean m_8795() {
      return this.f_31552;
   }

   private void m_8796() {
      this.f_31554 = 0.0F;
      this.f_31555 = 0.0F;
      this.f_31551.m_9281(0.0F);
      this.f_31556 = false;
   }

   private List<Class_2ZaVm8TGDJ68TnJB> m_8797() {
      return this.f_18147.m_8768().stream().filter(var0 -> var0.m_1188().getAsBoolean()).toList();
   }

   private boolean m_8798(Class_2ZaVm8TGDJ68TnJB var1) {
      return var1 != null && f_31649.equals(this.f_18147.m_8764()) && !f_31650.equals(var1.m_1181());
   }

   private float m_8799(float var1, float var2) {
      return Math.max(f_31685, var1 * var1 / var2);
   }

   private Vector4f m_8800(float var1, float var2, float var3, float var4) {
      Minecraft var5 = Minecraft.getInstance();
      float var6 = var5.getWindow().getScreenWidth();
      float var7 = var5.getWindow().getScreenHeight();
      float var8 = f_31654 + var1 * 2.0F / var6;
      float var9 = 1.0F - var2 * 2.0F / var7;
      float var10 = f_31655 + (var1 + var3) * 2.0F / var6;
      float var11 = 1.0F - (var2 + var4) * 2.0F / var7;
      Vector3f var12 = Class_Ssh31B3ljfKeWsvS.m_4853().transformPosition(var8, var9, 0.0F, new Vector3f());
      Vector3f var13 = Class_Ssh31B3ljfKeWsvS.m_4853().transformPosition(var10, var11, 0.0F, new Vector3f());
      float var14 = (Math.min(var12.x, var13.x) + 1.0F) * var6 * f_31656;
      float var15 = (1.0F - Math.max(var12.y, var13.y)) * var7 * f_31657;
      float var16 = (Math.max(var12.x, var13.x) + 1.0F) * var6 * f_31658;
      float var17 = (1.0F - Math.min(var12.y, var13.y)) * var7 * f_31659;
      return new Vector4f(var14, var15, var16 - var14, var17 - var15);
   }

   private void m_8801(float var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = var1 + var2 - f_31679;
      float var8 = this.m_8799(var4, var5);
      float var9 = var4 - var8;
      float var10 = var3 + var9 * (this.f_31554 / var6) - 1.0F;
      Class_Ssh31B3ljfKeWsvS.m_4817(var7, var3, f_31680, var4, 1.0F, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE));
      Class_Ssh31B3ljfKeWsvS.m_4817(
         var7,
         var10,
         f_31681,
         var8,
         1.0F,
         Class_BftdentXEtGbugJw.m_2306(
            Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SCROLL),
            Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.SCROLL) / f_31682 * (this.f_31556 ? f_31683 : f_31684)
         )
      );
   }

   @Override
   public void m_2083(float var1, float var2, int var3) {
      if (var3 == 0) {
         this.f_31556 = false;
      }
   }

   private float m_8802(List<Class_2ZaVm8TGDJ68TnJB> var1) {
      boolean var2 = var1.size() > 5;
      float var3 = f_31646;

      for (Class_2ZaVm8TGDJ68TnJB var5 : var1) {
         String var6 = var5 == this.f_31553 ? f_31647 : this.m_8785(var5.m_1189().m_1369());
         float var7 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var6, 10);
         float var8 = this.m_8798(var5)
            ? Class_l0gjJA23I6dlnzax.m_7480(Class_JInbhwbvIxCoRpXA.m_3260(var5.m_1181()), f_31648)
            : Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), Class_0p152hWffX3ippAf.m_801(var5.m_1181()), 11);
         var3 = Math.max(var3, var8 + var7 + (var2 ? 56 : 48));
      }

      return var3;
   }

   @Override
   public void m_2317(float var1, float var2, float var3) {
      List var4 = this.m_8797();
      if (var4.isEmpty()) {
         this.m_8796();
      } else {
         float var5 = this.m_8802(var4);
         int var6 = Math.min(5, var4.size());
         float var7 = var6 * f_31583;
         float var8 = var4.size() * f_31584;
         float var9 = Math.max(0.0F, var8 - var7);
         this.f_31555 = Math.clamp(this.f_31555, 0.0F, var9);
         this.f_31551.m_9283(this.f_31555);
         this.f_31554 = this.f_31551.m_9288();
         float var10 = this.m_6148(this.f_18143 + this.f_18145 - f_31585, var5);
         float var11 = this.m_6146(this.f_18144 + this.f_18146 + f_31586, f_31587 + Math.min(5, var4.size()) * f_31588);
         float var12 = var11 + f_31589;
         float var13 = f_31590 + var7;
         if (this.f_31556 && var9 > 0.0F) {
            this.m_8790(var2, var12, var7, var8, var9);
         }

         if (var9 <= 0.0F) {
            this.m_8796();
         }

         float var14 = Math.max(1.0F, f_31591 * (1.0F - this.f_31550.m_9288() / f_31592));
         float var15 = Class_Ssh31B3ljfKeWsvS.m_4821();
         Class_FvJXUGWpZo3zYBW4.m_2692(var10, var11, var5, var13, var14);
         Class_Ssh31B3ljfKeWsvS.m_4864(var15 * this.f_31550.m_9288());
         Class_Ssh31B3ljfKeWsvS.m_4859(var10, var11, var5, var13, f_31593, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SHADOW));
         Class_Ssh31B3ljfKeWsvS.m_4858(
            var10, var11, var5, var13, f_31594, f_31595, Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_31596 * this.f_31550.m_9288())
         );
         Class_Ssh31B3ljfKeWsvS.m_4817(var10, var11, var5, var13, f_31597, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.BACKGROUND));
         Class_Ssh31B3ljfKeWsvS.m_4854(var10, var11, var5, var13, 1.0F, f_31598, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE));
         boolean var16 = var9 > 0.0F;
         float var17 = var5 - f_31599 - (var16 ? 8 : 0);
         Class_Ssh31B3ljfKeWsvS.m_4860(var10 + f_31600, var12, var17, var7);

         for (int var18 = 0; var18 < var4.size(); var18++) {
            Class_2ZaVm8TGDJ68TnJB var19 = (Class_2ZaVm8TGDJ68TnJB)var4.get(var18);
            float var20 = var12 + var18 * f_31601 - this.f_31554;
            if (!(var20 + f_31602 < var12) && !(var20 > var12 + var7)) {
               float var21 = var19.m_1186().m_9288();
               int var22 = Class_BftdentXEtGbugJw.m_2302(
                  Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT), Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT), var21
               );
               if (this.m_8798(var19)) {
                  this.m_8794(var19, var10 + f_31603, var20 + f_31604, f_31605, var22);
               } else {
                  Class_Ssh31B3ljfKeWsvS.m_4866(
                     Class_y1y6QpONhWEUIdEB.m_9588(), Class_0p152hWffX3ippAf.m_801(var19.m_1181()), var10 + f_31606, var20 + f_31607, 11, var22
                  );
               }

               String var23 = var19 == this.f_31553 ? this.m_8792() : this.m_8785(var19.m_1189().m_1369());
               float var24 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var23, 10);
               int var25 = Class_5SHCkqfIMPKgkAV5.m_1486(
                  var19.m_1189().m_1369(),
                  var19 == this.f_31553,
                  Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT), f_31608),
                  Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT),
                  this.f_18147
               );
               Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var23, var10 + f_31609 + var17 - var24 - f_31610, var20 + f_31611, 10, var25);
            }
         }

         Class_Ssh31B3ljfKeWsvS.m_4828();
         if (var16) {
            this.m_8801(var10, var5, var12, var7, var8, var9);
         }

         Class_Ssh31B3ljfKeWsvS.m_4864(var15);
         Class_FvJXUGWpZo3zYBW4.m_2694(var10, var11, var5, var13, var14);
      }
   }
}
