package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.Optimization;
import java.util.Locale;
import net.minecraft.client.gui.screens.ChatScreen;

public class Class_UFYSfcO7ecfYZscM extends Class_NO6SuGqq3FB7jQDZ {
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_14681 = this::m_5224;
   private static final String f_14682 = "Profiler";
   private static final float f_14683 = 40.0F;
   private static final float f_14684 = 190.0F;
   private static final float f_14685 = 210.0F;
   private static final float f_14686 = 78.0F;
   private static final String f_14687 = "Профайлер";
   private static final String f_14688 = "HUD %.1f ms";
   private static final float f_14689 = 218.0F;
   private static final float f_14690 = 96.0F;
   private static final float f_14691 = 78.0F;
   private static final float f_14692 = 12.0F;
   private static final String f_14693 = "U";
   private static final float f_14694 = 10.0F;
   private static final float f_14695 = 8.0F;
   private static final float f_14696 = 32.0F;
   private static final float f_14697 = 7.0F;
   private static final float f_14698 = 118.0F;
   private static final float f_14699 = 8.0F;
   private static final float f_14700 = 14.0F;
   private static final float f_14701 = 12.0F;
   private static final float f_14702 = 8.0F;
   private static final float f_14703 = 12.0F;
   private static final float f_14704 = 30.0F;
   private static final float f_14705 = 24.0F;
   private static final float f_14706 = 22.0F;
   private static final float f_14707 = 12.0F;
   private static final float f_14708 = 56.0F;
   private static final float f_14709 = 108.0F;
   private static final float f_14710 = 56.0F;
   private static final float f_14711 = 14.0F;
   private static final float f_14712 = 11.0F;
   private static final float f_14713 = 56.0F;
   private static final float f_14714 = 12.0F;
   private static final float f_14715 = 74.0F;
   private static final float f_14716 = 14.0F;
   private static final float f_14717 = 11.0F;
   private static final float f_14718 = 74.0F;
   private static final float f_14719 = 6.0F;
   private static final float f_14720 = 0.55F;
   private static final float f_14721 = 8.0F;
   private static final float f_14722 = 3.0F;
   private static final float f_14723 = 6.0F;
   private static final float f_14724 = 3.0F;
   private static final float f_14725 = 6.0F;
   private static final float f_14726 = 1.4F;
   private static final float f_14727 = 1.6F;
   private static final float f_14728 = 1.2F;
   private static final float f_14729 = 0.6F;
   private static final String f_14730 = "OPT off";
   private static final String f_14731 = "OPT on";

   private String m_5223() {
      try {
         Optimization var1 = DimasikClient.m_9057().m_9049().m_2801().m_3473();
         return var1 != null && var1.m_776() ? f_14731 : f_14730;
      } catch (Throwable var2) {
         return "";
      }
   }

   public Class_UFYSfcO7ecfYZscM() {
      super(f_14682, f_14683, f_14684, f_14685, f_14686);
   }

   public void m_5224(Class_bhRaN0YSSLQRYjPo var1) {
      if (!DimasikClient.m_9057().m_9049().m_2801().m_3433().m_6177().m_7145(f_14687)) {
         this.m_4012(0.0F);
         this.m_4007(0.0F);
      } else {
         Class_eww5q2KhVs3PHU17 var2 = Class_eww5q2KhVs3PHU17.m_6445();
         boolean var3 = f_11537.gui.screen() instanceof ChatScreen;
         float[] var4 = var2.m_6447();
         String var5 = var2.m_6443() + "";
         String var6 = Math.round(var2.m_6449()) + "";
         String var7 = var2.m_6448() + "";
         String var8 = String.format(Locale.ROOT, f_14688, var2.m_6456());
         String var9 = var2.m_6452() + "";
         String var10 = "" + var2.m_6451() + var2.m_6450();
         String var11 = var3 ? "" + var2.m_6457() + var2.m_6453() : "";
         float var12 = f_14689;
         float var13 = var3 ? f_14690 : f_14691;
         float var14 = this.m_3998();
         float var15 = this.m_3993();
         this.m_4013();
         Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());

         try {
            Class_U4Qsm43RVlUI3Pre.m_5188(var14, var15 - 1.0F, var12, var13, f_14692);
            Class_U4Qsm43RVlUI3Pre.m_5186(Class_y1y6QpONhWEUIdEB.m_9591(), f_14693, var14 + f_14694, var15 + f_14695, 16, Class_oDLvT3Io61u7HRHc.m_7740(11));
            Class_U4Qsm43RVlUI3Pre.m_5186(
               Class_y1y6QpONhWEUIdEB.m_9588(), var5, var14 + f_14696, var15 + f_14697, 14, Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT)
            );
            Class_U4Qsm43RVlUI3Pre.m_5186(
               Class_y1y6QpONhWEUIdEB.m_9588(),
               var6,
               var14 + f_14698,
               var15 + f_14699,
               12,
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT)
            );
            Class_U4Qsm43RVlUI3Pre.m_5186(
               Class_y1y6QpONhWEUIdEB.m_9588(),
               var7,
               var14 + var12 - f_14700 - Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var7, f_14701, 0.0F),
               var15 + f_14702,
               12,
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT)
            );
            this.m_5225(var14 + f_14703, var15 + f_14704, var12 - f_14705, f_14706, var4);
            Class_U4Qsm43RVlUI3Pre.m_5186(
               Class_y1y6QpONhWEUIdEB.m_9588(),
               var8,
               var14 + f_14707,
               var15 + f_14708,
               11,
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT)
            );
            Class_U4Qsm43RVlUI3Pre.m_5186(
               Class_y1y6QpONhWEUIdEB.m_9588(),
               var9,
               var14 + f_14709,
               var15 + f_14710,
               11,
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT)
            );
            Class_U4Qsm43RVlUI3Pre.m_5186(
               Class_y1y6QpONhWEUIdEB.m_9588(),
               var10,
               var14 + var12 - f_14711 - Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var10, f_14712, 0.0F),
               var15 + f_14713,
               11,
               Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT)
            );
            if (var3) {
               String var16 = this.m_5223();
               Class_U4Qsm43RVlUI3Pre.m_5186(
                  Class_y1y6QpONhWEUIdEB.m_9588(),
                  var11,
                  var14 + f_14714,
                  var15 + f_14715,
                  11,
                  Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT)
               );
               Class_U4Qsm43RVlUI3Pre.m_5186(
                  Class_y1y6QpONhWEUIdEB.m_9588(),
                  var16,
                  var14 + var12 - f_14716 - Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var16, f_14717, 0.0F),
                  var15 + f_14718,
                  11,
                  Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT)
               );
            }
         } finally {
            Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());
            this.m_4005();
         }

         this.m_4012(var12);
         this.m_4007(var13);
      }
   }

   private void m_5225(float var1, float var2, float var3, float var4, float[] var5) {
      Class_U4Qsm43RVlUI3Pre.m_5199(
         var1, var2, var3, var4, f_14719, Class_BftdentXEtGbugJw.m_2306(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_BACKGROUND_TWO), f_14720)
      );
      if (var5.length >= 2) {
         float var6 = f_14721;

         for (float var10 : var5) {
            var6 = Math.max(var6, var10);
         }

         float var14 = var3 / Math.max(1, var5.length - 1);
         int var15 = Class_oDLvT3Io61u7HRHc.m_7740(11);

         for (int var16 = 1; var16 < var5.length; var16++) {
            float var17 = var1 + (var16 - 1) * var14;
            float var11 = var1 + var16 * var14;
            float var12 = var2 + var4 - f_14722 - var5[var16 - 1] / var6 * (var4 - f_14723);
            float var13 = var2 + var4 - f_14724 - var5[var16] / var6 * (var4 - f_14725);
            Class_U4Qsm43RVlUI3Pre.m_5199(
               var17, Math.min(var12, var13), Math.max(f_14726, var11 - var17), Math.max(f_14727, Math.abs(var13 - var12) + f_14728), f_14729, var15
            );
         }
      }
   }
}
