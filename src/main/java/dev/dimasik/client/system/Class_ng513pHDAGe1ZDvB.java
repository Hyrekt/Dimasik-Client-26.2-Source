package dev.dimasik.client.system;

import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.input.KeyEvent;

public class Class_ng513pHDAGe1ZDvB {
   private final Class_LsNSRvPKh5AwfAUe f_25834;
   private String f_25835 = "";
   private final boolean f_25836 = true;
   private static final float f_25837 = 15.0F;
   private static final float f_25838 = 20.0F;
   private static final double f_25839 = 255.0;
   private static final float f_25840 = 300.0F;
   private static final float f_25841 = 100.0F;
   private static final float f_25842 = 10.0F;
   private static final float f_25843 = 300.0F;
   private static final float f_25844 = 100.0F;
   private static final float f_25845 = 10.0F;
   private static final String f_25846 = "s";
   private static final float f_25847 = 300.0F;
   private static final float f_25848 = 30.0F;
   private static final float f_25849 = 10.0F;
   private static final float f_25850 = 10.0F;
   private static final String f_25851 = "Создайте свой пресет";
   private static final float f_25852 = 12.0F;
   private static final float f_25853 = 12.0F;
   private static final double f_25854 = 255.0;
   private static final float f_25855 = 10.0F;
   private static final float f_25856 = 50.0F;
   private static final float f_25857 = 230.0F;
   private static final float f_25858 = 40.0F;
   private static final float f_25859 = 10.0F;
   private static final float f_25860 = 10.0F;
   private static final float f_25861 = 50.0F;
   private static final float f_25862 = 230.0F;
   private static final float f_25863 = 40.0F;
   private static final float f_25864 = 10.0F;
   private static final float f_25865 = 300.0F;
   private static final float f_25866 = 50.0F;
   private static final float f_25867 = 50.0F;
   private static final float f_25868 = 40.0F;
   private static final float f_25869 = 40.0F;
   private static final float f_25870 = 10.0F;
   private static final float f_25871 = 300.0F;
   private static final float f_25872 = 50.0F;
   private static final float f_25873 = 50.0F;
   private static final float f_25874 = 40.0F;
   private static final float f_25875 = 40.0F;
   private static final float f_25876 = 10.0F;
   private static final String f_25877 = "{";
   private static final float f_25878 = 22.0F;
   private static final float f_25879 = 65.0F;
   private static final long f_25880 = 500L;
   private static final long f_25881 = 2L;
   private static final String f_25882 = "|";
   private static final float f_25883 = 40.0F;
   private static final float f_25884 = 63.0F;
   private static final String f_25885 = "r";
   private static final float f_25886 = 300.0F;
   private static final float f_25887 = 50.0F;
   private static final float f_25888 = 13.0F;
   private static final float f_25889 = 65.0F;
   private static final float f_25890 = 400.0F;
   private static final float f_25891 = 150.0F;
   private static final float f_25892 = 252.0F;
   private static final float f_25893 = 75.0F;
   private static final float f_25894 = 300.0F;
   private static final float f_25895 = 30.0F;
   private static final double f_25896 = 30.0;
   private static final double f_25897 = 30.0;
   private static final float f_25898 = 300.0F;
   private static final float f_25899 = 50.0F;
   private static final float f_25900 = 50.0F;
   private static final double f_25901 = 40.0;
   private static final double f_25902 = 40.0;

   public boolean m_7680(float var1, float var2, int var3) {
      float var4 = this.f_25834.m_3861().getGuiX();
      float var5 = this.f_25834.m_3861().getGuiY();
      float var6 = var4 + f_25890 - f_25891;
      float var7 = var5 + f_25892 - f_25893;
      if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var6 + f_25894 - f_25895, var7, f_25896, f_25897)) {
         this.f_25834.m_3825(false);
         this.f_25835 = "";
         return true;
      }

      if (Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, var6 + f_25898 - f_25899, var7 + f_25900, f_25901, f_25902)) {
         if (!this.f_25835.trim().isEmpty()) {
            this.f_25834.m_3827(this.f_25835.trim());
            this.f_25835 = "";
            this.f_25834.m_3825(false);
         }

         return true;
      } else {
         return true;
      }
   }

   public Class_ng513pHDAGe1ZDvB(Class_LsNSRvPKh5AwfAUe var1) {
      this.f_25834 = var1;
   }

   public void m_7681(GuiGraphicsExtractor var1, float var2, float var3, float var4, float var5, float var6) {
      Class_Ssh31B3ljfKeWsvS.m_4858(
         this.f_25834.m_3861().getGuiX(),
         this.f_25834.m_3861().getGuiY(),
         this.f_25834.m_3861().getGuiWidth(),
         this.f_25834.m_3861().getGuiHeight(),
         f_25837,
         f_25838,
         Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_25839)
      );
      Class_Ssh31B3ljfKeWsvS.m_4817(var5, var6, f_25840, f_25841, f_25842, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.BACKGROUND));
      Class_Ssh31B3ljfKeWsvS.m_4854(var5, var6, f_25843, f_25844, 1.0F, f_25845, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE));
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9591(),
         f_25846,
         var5 + f_25847 - f_25848 + f_25849,
         var6 + f_25850,
         10,
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT)
      );
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         Class_0p152hWffX3ippAf.m_801(f_25851),
         var5 + f_25852,
         var6 + f_25853,
         14,
         Class_BftdentXEtGbugJw.m_2303(255, 255, 255, f_25854)
      );
      Class_Ssh31B3ljfKeWsvS.m_4817(var5 + f_25855, var6 + f_25856, f_25857, f_25858, f_25859, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.BACKGROUND));
      Class_Ssh31B3ljfKeWsvS.m_4854(
         var5 + f_25860, var6 + f_25861, f_25862, f_25863, 1.0F, f_25864, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE)
      );
      Class_Ssh31B3ljfKeWsvS.m_4817(
         var5 + f_25865 - f_25866, var6 + f_25867, f_25868, f_25869, f_25870, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.BACKGROUND)
      );
      Class_Ssh31B3ljfKeWsvS.m_4854(
         var5 + f_25871 - f_25872, var6 + f_25873, f_25874, f_25875, 1.0F, f_25876, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.OUTLINE)
      );
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9591(), f_25877, var5 + f_25878, var6 + f_25879, 10, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT)
      );
      String var7 = this.f_25835 + (System.currentTimeMillis() / f_25880 % f_25881 == 0L ? f_25882 : "");
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9588(),
         var7,
         var5 + f_25883,
         var6 + f_25884,
         12,
         this.f_25835.isEmpty()
            ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT)
            : Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.ACTIVE_TEXT)
      );
      Class_Ssh31B3ljfKeWsvS.m_4866(
         Class_y1y6QpONhWEUIdEB.m_9591(),
         f_25885,
         var5 + f_25886 - f_25887 + f_25888,
         var6 + f_25889,
         12,
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.DEACTIVE_TEXT)
      );
   }

   public boolean m_7682(String var1) {
      if (this.f_25835.codePointCount(0, this.f_25835.length()) >= 32) {
         return true;
      }

      char var2 = var1.charAt(0);
      if (Character.isISOControl(var2)) {
         return false;
      }

      this.f_25835 = this.f_25835 + var1;
      return true;
   }

   public boolean m_7683(KeyEvent var1) {
      switch (var1.key()) {
         case 257:
         case 335:
            if (!this.f_25835.trim().isEmpty()) {
               this.f_25834.m_3827(this.f_25835.trim());
               this.f_25835 = "";
               this.f_25834.m_3825(false);
            }

            return true;
         case 259:
            if (!this.f_25835.isEmpty()) {
               this.f_25835 = this.f_25835.substring(0, this.f_25835.offsetByCodePoints(this.f_25835.length(), -1));
            }

            return true;
         default:
            return false;
      }
   }
}
