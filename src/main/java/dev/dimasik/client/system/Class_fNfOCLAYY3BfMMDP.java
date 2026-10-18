package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.KeybindMode;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.module.misc.ClientSounds;
import java.util.Locale;
import lombok.Generated;

public class Class_fNfOCLAYY3BfMMDP extends Class_BzOL3ao4SeAwC7Hp {
   private final Module f_19561;
   private final Class_1gO7GkQ9aEvcObZ8 f_19562 = new Class_1gO7GkQ9aEvcObZ8();
   private final Class_w8fCJQ5ZtH5lQbWc f_19563;
   private final Class_w8fCJQ5ZtH5lQbWc f_19564;
   private final Class_w8fCJQ5ZtH5lQbWc f_19565;
   private final Class_w8fCJQ5ZtH5lQbWc f_19566;
   private final Class_w8fCJQ5ZtH5lQbWc f_19567;
   private boolean f_19568;
   private boolean f_19569;
   private static final float f_19570 = 6.0F;
   private static final float f_19571 = 10.0F;
   private static final float f_19572 = 4.0F;
   private static final float f_19573 = 3.0F;
   private static final float f_19574 = 2.5F;
   private static final float f_19575 = 0.3F;
   private static final float f_19576 = 1.25F;
   private static final float f_19577 = 4.0F;
   private static final float f_19578 = 12.0F;
   private static final float f_19579 = 16.0F;
   private static final float f_19580 = 10.0F;
   private static final double f_19581 = 255.0;
   private static final float f_19582 = 10.0F;
   private static final float f_19583 = 10.0F;
   private static final float f_19584 = 12.0F;
   private static final float f_19585 = 9.0F;
   private static final String f_19586 = "Кнопка";
   private static final float f_19587 = 12.0F;
   private static final float f_19588 = 35.0F;
   private static final String f_19589 = "Мод бинда";
   private static final float f_19590 = 12.0F;
   private static final float f_19591 = 59.0F;
   private static final double f_19592 = 240.0;
   private static final double f_19593 = 0.5;
   private static final double f_19594 = 0.5;
   private static final String f_19595 = "...";
   private static final float f_19596 = 28.0F;
   private static final float f_19597 = 12.0F;
   private static final float f_19598 = 10.0F;
   private static final float f_19599 = 40.0F;
   private static final float f_19600 = 14.0F;
   private static final float f_19601 = 12.0F;
   private static final float f_19602 = 12.0F;
   private static final float f_19603 = 6.0F;
   private static final float f_19604 = 0.5F;
   private static final float f_19605 = 30.0F;
   private static final float f_19606 = 0.6F;
   private static final float f_19607 = 19.0F;
   private static final float f_19608 = 1.2F;
   private static final float f_19609 = 4.0F;
   private static final float f_19610 = 0.4F;
   private static final float f_19611 = 0.35F;
   private static final float f_19612 = 0.4F;
   private static final float f_19613 = 0.7F;
   private static final float f_19614 = 0.01F;
   private static final float f_19615 = 10.0F;
   private static final double f_19616 = 255.0;
   private static final float f_19617 = 0.45F;
   private static final float f_19618 = 0.01F;
   private static final float f_19619 = 0.25F;
   private static final float f_19620 = 0.45F;
   private static final float f_19621 = 5.0F;
   private static final float f_19622 = 1.5F;
   private static final float f_19623 = 0.7F;
   private static final float f_19624 = 0.01F;
   private static final double f_19625 = 255.0;
   private static final float f_19626 = 0.6F;
   private static final float f_19627 = 10.0F;
   private static final float f_19628 = 16.0F;
   private static final float f_19629 = 180.0F;
   private static final float f_19630 = 75.0F;
   private static final float f_19631 = 255.0F;
   private static final float f_19632 = 0.8F;
   private static final float f_19633 = 33.0F;
   private static final float f_19634 = 54.0F;
   private static final float f_19635 = 20.0F;
   private static final float f_19636 = 5.0F;
   private static final float f_19637 = 0.5F;
   private static final float f_19638 = 57.0F;
   private static final String f_19639 = "...";
   private static final float f_19640 = 28.0F;
   private static final float f_19641 = 12.0F;
   private static final float f_19642 = 12.0F;
   private static final float f_19643 = 40.0F;
   private static final float f_19644 = 14.0F;
   private static final float f_19645 = 30.0F;
   private static final double f_19646 = 19.0;
   private static final float f_19647 = 0.72F;
   private static final float f_19648 = 12.0F;
   private static final float f_19649 = 54.0F;
   private static final double f_19650 = 20.0;
   private static final float f_19651 = 0.9F;
   private static final float f_19652 = 0.7F;
   private static final long f_19653 = 280L;
   private static final long f_19654 = 3L;
   private static final String f_19655 = ".";
   private static final String f_19656 = "None";
   private static final String f_19657 = "SPACE";
   private static final String f_19658 = "L-SHIFT";
   private static final String f_19659 = "R-SHIFT";
   private static final String f_19660 = "L-CTRL";
   private static final String f_19661 = "R-CTRL";
   private static final String f_19662 = "L-ALT";
   private static final String f_19663 = "R-ALT";
   private static final String f_19664 = "ENTER";
   private static final String f_19665 = "TAB";
   private static final String f_19666 = "CAPS";
   private static final String f_19667 = "UP";
   private static final String f_19668 = "DOWN";
   private static final String f_19669 = "LEFT";
   private static final String f_19670 = "RIGHT";
   private static final String f_19671 = "HOME";
   private static final String f_19672 = "END";
   private static final String f_19673 = "INSERT";
   private static final String f_19674 = "PAGE UP";
   private static final String f_19675 = "PAGE DOWN";

   @Override
   public void m_2332() {
      this.f_19562.m_843(this.f_19568);
      if (!this.f_19562.m_849() && !this.f_19568) {
         this.f_6111.getBinds().remove(this);
      }
   }

   @Generated
   public Module m_6484() {
      return this.f_19561;
   }

   @Override
   public void m_2337(float var1, float var2, float var3) {
      this.f_19562.m_848(0.0F, 1.0F, f_19575, Class_55WOGfS5cDac4HRi.f_2298, var3);
      this.f_19563.m_9283(this.f_19569 ? 1.0F : 0.0F);
      this.f_19565.m_9283(1.0F);
      this.f_19566.m_9283(0.0F);
      this.f_19567.m_9283(1.0F);
      float var4 = Math.max(1.0F, f_19576 * (1.0F - this.f_19562.m_845() / f_19577));
      float var5 = Class_Ssh31B3ljfKeWsvS.m_4821();
      Class_Ssh31B3ljfKeWsvS.m_4864(var5 * this.f_19562.m_845());
      Class_FvJXUGWpZo3zYBW4.m_2692(this.f_6112, this.f_6113, this.f_6114, this.f_6115, var4);
      Class_Ssh31B3ljfKeWsvS.m_4859(this.f_6112, this.f_6113, this.f_6114, this.f_6115, f_19578, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SHADOW));
      Class_Ssh31B3ljfKeWsvS.m_4858(this.f_6112, this.f_6113, this.f_6114, this.f_6115, f_19579, f_19580, Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_19581));
      Class_Ssh31B3ljfKeWsvS.m_4817(
         this.f_6112, this.f_6113, this.f_6114, this.f_6115, f_19582, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.BACKGROUND)
      );
      Class_Ssh31B3ljfKeWsvS.m_4854(
         this.f_6112, this.f_6113, this.f_6114, this.f_6115, 1.0F, f_19583, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE)
      );
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         Class_0p152hWffX3ippAf.m_801(this.f_19561.m_793()),
         this.f_6112 + f_19584,
         this.f_6113 + f_19585,
         13,
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.TEXT)
      );
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         Class_0p152hWffX3ippAf.m_801(f_19586),
         this.f_6112 + f_19587,
         this.f_6113 + f_19588,
         12,
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT)
      );
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         Class_0p152hWffX3ippAf.m_801(f_19589),
         this.f_6112 + f_19590,
         this.f_6113 + f_19591,
         12,
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT)
      );
      float var6 = this.f_19563.m_9288();
      float var7 = (float)(Math.sin(System.currentTimeMillis() / f_19592) * f_19593 + f_19594);
      String var8 = this.f_19569 ? this.m_6485() : this.m_6486();
      String var9 = this.f_19561.m_779().m_1371().m_5840();
      float var10 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), this.f_19569 ? f_19595 : var8, 12);
      float var11 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var9, 12);
      float var12 = Math.max(f_19596, var10 + f_19597) + var6 * f_19598;
      if (this.f_19564.m_9288() <= 0.0F) {
         this.f_19564.m_9281(var12);
      }

      this.f_19564.m_9283(var12);
      float var13 = this.f_19564.m_9288();
      float var14 = Math.max(f_19599, var11 + f_19600);
      float var15 = this.f_6112 + this.f_6114 - f_19601 - var13;
      float var16 = this.f_6112 + this.f_6114 - var14 - f_19602;
      float var17 = (this.f_19565.m_9288() - 1.0F) * f_19603 + var6 * (f_19604 + var7);
      float var18 = var15 - var17 * 2.0F;
      float var19 = this.f_6113 + f_19605 - var17 * f_19606;
      float var20 = var13 + var17 * 2.0F;
      float var21 = f_19607 + var17 * f_19608;
      float var22 = f_19609 + var17 * f_19610;
      int var23 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
      int var24 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT);
      float var25 = Math.max(var6 * (f_19611 + f_19612 * var7), this.f_19566.m_9288() * f_19613);
      if (var25 > f_19614) {
         Class_Ssh31B3ljfKeWsvS.m_4859(var18, var19, var20, var21, f_19615, Class_BftdentXEtGbugJw.m_2306(var23, var25));
      }

      int var26 = Class_BftdentXEtGbugJw.m_2302(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.BACKGROUND), var23, var6);
      if (!this.f_19569 && Class_5SHCkqfIMPKgkAV5.m_1485(this.f_19561.m_779().m_1369(), this.f_19561)) {
         var26 = Class_BftdentXEtGbugJw.m_2302(var26, Class_BftdentXEtGbugJw.m_2303(255, 78, 78, f_19616), f_19617);
      }

      Class_Ssh31B3ljfKeWsvS.m_4817(var18, var19, var20, var21, var22, var26);
      if (var6 > f_19618) {
         Class_Ssh31B3ljfKeWsvS.m_4854(var18, var19, var20, var21, 1.0F, var22, Class_BftdentXEtGbugJw.m_2306(var24, (f_19619 + f_19620 * var7) * var6));
      }

      float var27 = this.f_19567.m_9288();
      if (var27 < 1.0F) {
         float var28 = 2.0F + var27 * f_19621;
         Class_Ssh31B3ljfKeWsvS.m_4854(
            var18 - var28,
            var19 - var28,
            var20 + var28 * 2.0F,
            var21 + var28 * 2.0F,
            f_19622,
            var22 + var28,
            Class_BftdentXEtGbugJw.m_2306(var23, (1.0F - var27) * f_19623)
         );
      }

      float var32 = this.f_19566.m_9288();
      if (var32 > f_19624) {
         Class_Ssh31B3ljfKeWsvS.m_4817(
            var18, var19, var20, var21, var22, Class_BftdentXEtGbugJw.m_2306(Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_19625), var32 * f_19626)
         );
      }

      float var29 = Math.clamp((var13 - var10) / f_19627, 0.0F, 1.0F);
      float var30 = Math.min(var15 + var13 / 2.0F - var10 / 2.0F, this.f_6112 + this.f_6114 - f_19628 - var10);
      int var31 = this.f_19569
         ? Class_BftdentXEtGbugJw.m_2303(255, 255, 255, (int)((f_19629 + f_19630 * var7) * var29))
         : Class_BftdentXEtGbugJw.m_2306(var24, Class_LsNSRvPKh5AwfAUe.m_3852(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT) / f_19631 * f_19632 * var29);
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var8, var30, this.f_6113 + f_19633, 12, var31);
      Class_Ssh31B3ljfKeWsvS.m_4817(var16, this.f_6113 + f_19634, var14, f_19635, f_19636, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.SELECTED));
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         var9,
         var16 + (var14 - var11) * f_19637,
         this.f_6113 + f_19638,
         12,
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT)
      );
      Class_FvJXUGWpZo3zYBW4.m_2694(this.f_6112, this.f_6113, this.f_6114, this.f_6115, var4);
      Class_Ssh31B3ljfKeWsvS.m_4864(var5);
   }

   private String m_6485() {
      int var1 = (int)(System.currentTimeMillis() / f_19653 % f_19654) + 1;
      return f_19655.repeat(var1);
   }

   private String m_6486() {
      int var1 = this.f_19561.m_779().m_1369();
      if (var1 == -1) {
         return f_19656;
      }

      if (var1 >= 0 && var1 <= 7) {
         return var1 + 1 + "";
      }

      return switch (var1) {
         case 32 -> f_19657;
         case 257 -> f_19664;
         case 258 -> f_19665;
         case 260 -> f_19673;
         case 262 -> f_19670;
         case 263 -> f_19669;
         case 264 -> f_19668;
         case 265 -> f_19667;
         case 266 -> f_19674;
         case 267 -> f_19675;
         case 268 -> f_19671;
         case 269 -> f_19672;
         case 280 -> f_19666;
         case 340 -> f_19658;
         case 341 -> f_19660;
         case 342 -> f_19662;
         case 344 -> f_19659;
         case 345 -> f_19661;
         case 346 -> f_19663;
         default -> {
            String var2 = Class_vAC0cSmAiUV3cskz.m_9251(var1);
            yield !var2.isEmpty() ? var2.toUpperCase(Locale.ROOT) : var1 + "";
         }
      };
   }

   @Override
   public void m_2335(float var1, float var2, int var3) {
      String var4 = this.f_19569 ? f_19639 : this.m_6486();
      float var5 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var4, 12);
      float var6 = Math.max(this.f_19564.m_9288(), Math.max(f_19640, var5 + f_19641));
      float var7 = this.f_6112 + this.f_6114 - f_19642 - var6;
      if (this.f_19569) {
         if (var3 != 0) {
            this.f_19561.m_779().m_1367(var3);
            this.f_19569 = false;
            this.m_6489();
            Class_5SHCkqfIMPKgkAV5.m_1480(var3);
            this.m_6488();
         }
      } else {
         String var8 = this.f_19561.m_779().m_1371().m_5840();
         float var9 = Math.max(f_19643, Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var8, 12) + f_19644);
         if (var3 == 0 && Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var7, this.f_6113 + f_19645, var6, f_19646)) {
            this.f_19569 = true;
            ClientSounds.m_9463(ClientSounds.KG2FYhAQHwVAXDJG.BIND_START);
            this.f_19565.m_9281(f_19647);
         } else {
            if (var3 == 0 && Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.f_6112 + this.f_6114 - var9 - f_19648, this.f_6113 + f_19649, var9, f_19650)) {
               KeybindMode var10 = this.f_19561.m_779().m_1371() == KeybindMode.TOGGLE ? KeybindMode.HOLD : KeybindMode.TOGGLE;
               this.f_19561.m_779().m_1370(var10);
               ClientSounds.m_9463(ClientSounds.KG2FYhAQHwVAXDJG.MODE);
               this.m_6488();
            }
         }
      }
   }

   @Override
   public void m_2340(int var1) {
      if (this.f_19569) {
         if (var1 == 256) {
            this.f_19569 = false;
            this.f_19565.m_9281(f_19651);
            return;
         }

         if (var1 == 261 || var1 == 259) {
            this.f_19561.m_779().m_1367(-1);
            this.f_19569 = false;
            this.m_6489();
            this.m_6488();
            return;
         }

         this.f_19561.m_779().m_1367(var1);
         this.f_19569 = false;
         this.m_6489();
         Class_5SHCkqfIMPKgkAV5.m_1480(var1);
         this.m_6488();
      }
   }

   public void m_6487() {
      this.f_19568 = false;
   }

   private void m_6488() {
      DimasikClient.m_9057().m_9049().m_2802().m_8844().m_5559();
   }

   public Class_fNfOCLAYY3BfMMDP(Module var1, float var2, float var3, float var4, float var5) {
      super(DimasikClient.m_9057().m_9053().m_2276());
      this.f_19563 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_19570, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_19564 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_19571, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_19565 = new Class_w8fCJQ5ZtH5lQbWc(1.0F, f_19572, Class_eXr9Fra2ad3yFXY8.f_19115);
      this.f_19566 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_19573, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_19567 = new Class_w8fCJQ5ZtH5lQbWc(1.0F, f_19574, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_19568 = true;
      this.f_19569 = false;
      this.f_19561 = var1;
      this.f_6112 = var2;
      this.f_6113 = var3;
      this.f_6114 = var4;
      this.f_6115 = var5;
   }

   private void m_6489() {
      ClientSounds.m_9463(this.f_19561.m_779().m_1369() < 0 ? ClientSounds.KG2FYhAQHwVAXDJG.BIND_RESET : ClientSounds.KG2FYhAQHwVAXDJG.BIND_SET);
      this.f_19566.m_9281(1.0F);
      this.f_19567.m_9281(0.0F);
      this.f_19565.m_9281(f_19652);
   }
}
