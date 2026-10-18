package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.FuntimeHelper;
import dev.dimasik.client.module.misc.HolyWorldHelper;
import dev.dimasik.client.module.misc.RwHelper;
import dev.dimasik.client.setting.impl.SliderSetting;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import lombok.Generated;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.joml.Vector4i;

public class Class_s6dPPNYhKFC2fKhZ extends Class_NO6SuGqq3FB7jQDZ implements Class_OJntZb8PWlU5XrDj {
   private static final float f_30682 = 28.0F;
   private static final float f_30683 = 4.0F;
   private static final float f_30684 = 8.0F;
   private static final int f_30685 = 7;
   private final Matrix4f f_30686 = new Matrix4f();
   private final Vector4f f_30687 = new Vector4f();
   private final Vector4i f_30688 = new Vector4i(-1);
   private final List<Class_Trm8dR6i9vMfnZEG.Class_6SoEwLZCu5bs5f6U> f_30689 = new ArrayList<>();
   private final SliderSetting f_30690;
   private final Class_u8iL1f1cFf6CucWB f_30691;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_30692 = this::m_8633;
   private static final String f_30693 = "ItemIndicator";
   private static final float f_30694 = 1226.0F;
   private static final float f_30695 = 1029.0F;
   private static final String f_30696 = "ItemIndicator";
   private static final String f_30697 = "Размер";
   private static final String f_30698 = "Индикатор предметов";
   private static final float f_30699 = 0.5F;
   private static final float f_30700 = 28.0F;
   private static final float f_30701 = 4.0F;
   private static final float f_30702 = 8.0F;
   private static final float f_30703 = 7.0F;
   private static final float f_30704 = 16.0F;
   private static final float f_30705 = 0.5F;
   private static final float f_30706 = 0.5F;
   private static final float f_30707 = 0.5F;
   private static final String f_30708 = "SHIFT";
   private static final String f_30709 = "CTRL";
   private static final String f_30710 = "ALT";
   private static final String f_30711 = "SPACE";
   private static final String f_30712 = "TAB";
   private static final String f_30713 = "CAPS";
   private static final String f_30714 = "KEY";
   private static final String f_30715 = "%.2fx";

   private void m_8633(Class_bhRaN0YSSLQRYjPo var1) {
      if (f_11537.player != null && var1.m_6083() != null && DimasikClient.m_9057().m_9049().m_2801().m_3433().m_6177().m_7145(f_30698)) {
         List var2 = this.m_8636();
         if (var2.isEmpty()) {
            this.m_4012(0.0F);
            this.m_4007(0.0F);
            this.f_30691.m_9093();
         } else {
            float var3 = Math.max(f_30699, this.f_30690.m_8768());
            float var4 = f_30700 * var3;
            float var5 = f_30701 * var3;
            float var6 = f_30702 * var3;
            int var7 = Math.max(6, Math.round(f_30703 * var3));
            float var8 = f_30704 * var3;
            Class_Ssh31B3ljfKeWsvS.m_4814(this.f_30686.identity());

            while (this.f_30689.size() < var2.size()) {
               this.f_30689.add(new Class_Trm8dR6i9vMfnZEG.Class_6SoEwLZCu5bs5f6U());
            }

            float var9 = var2.size() * var4 + Math.max(0, var2.size() - 1) * var5;
            float var10 = var4;
            float var11 = Math.round(this.m_3998());
            float var12 = Math.round(this.m_3993());
            this.m_4013();
            Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());

            try {
               for (int var13 = 0; var13 < var2.size(); var13++) {
                  float var14 = var11 + var13 * (var4 + var5);
                  Class_U4Qsm43RVlUI3Pre.m_5188(var14, var12, var4, var4, var6);
               }

               for (int var25 = 0; var25 < var2.size(); var25++) {
                  Class_PlAkZAQgfIOFZi5F var27 = (Class_PlAkZAQgfIOFZi5F)var2.get(var25);
                  float var15 = var11 + var25 * (var4 + var5);
                  float var16 = (var4 - var8) * f_30705;
                  float var17 = Math.round(var15 + var16);
                  float var18 = Math.round(var12 + var16);
                  if (var27.hasCustomIcon()) {
                     Class_U4Qsm43RVlUI3Pre.m_5189(var17, var18, var8, var8, this.f_30687, this.f_30688, var27.icon());
                  } else {
                     Class_U4Qsm43RVlUI3Pre.m_5206(var17, var18, var8, var8, var27.stack(), false, this.f_30689.get(var25));
                  }
               }

               for (int var26 = 0; var26 < var2.size(); var26++) {
                  Class_PlAkZAQgfIOFZi5F var28 = (Class_PlAkZAQgfIOFZi5F)var2.get(var26);
                  float var29 = var11 + var26 * (var4 + var5);
                  String var30 = this.m_8638(var28.key());
                  float var31 = Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(var30, var7, 0.0F);
                  int var32 = Class_oDLvT3Io61u7HRHc.m_7740(var26 * 5 + 2);
                  float var19 = var29 + (var4 - var31) * f_30706;
                  float var20 = var12 + var4 - var7 * f_30707 + 2.0F * var3;
                  float var21 = Class_Ssh31B3ljfKeWsvS.m_4863(Class_y1y6QpONhWEUIdEB.m_9588(), var30, var20, var7);
                  Class_U4Qsm43RVlUI3Pre.m_5186(Class_y1y6QpONhWEUIdEB.m_9588(), var30, var19, var21, var7, var32);
               }
            } finally {
               Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());
               this.m_4005();
            }

            this.m_4012(var9);
            this.m_4007(var10);
         }
      } else {
         this.m_4012(0.0F);
         this.m_4007(0.0F);
         this.f_30691.m_9093();
      }
   }

   @Override
   public boolean m_1340(float var1, float var2, int var3) {
      if (!(this.m_1757() <= 0.0F) && !(this.m_1758() <= 0.0F)) {
         if (var3 == 1 && Class_FvJXUGWpZo3zYBW4.m_2697(var1, var2, this.m_3998(), this.m_3993(), this.m_1757(), this.m_1758())) {
            this.f_30691.m_9060(var1, var2);
            return true;
         } else {
            return this.f_30691.m_9070(var1, var2, var3);
         }
      } else {
         return false;
      }
   }

   @Override
   public void m_1333() {
      this.f_30691.m_9093();
   }

   @Generated
   public Class_u8iL1f1cFf6CucWB m_8635() {
      return this.f_30691;
   }

   private List<Class_PlAkZAQgfIOFZi5F> m_8636() {
      FuntimeHelper var1 = DimasikClient.m_9057().m_9049().m_2801().m_3479();
      HolyWorldHelper var2 = DimasikClient.m_9057().m_9049().m_2801().m_3518();
      RwHelper var3 = DimasikClient.m_9057().m_9049().m_2801().m_3543();
      ArrayList var4 = new ArrayList();
      this.m_8637(var4, var1 != null && var1.m_776() ? var1.m_711() : null);
      this.m_8637(var4, var2 != null && var2.m_776() ? var2.m_3141() : null);
      this.m_8637(var4, var3 != null && var3.m_776() ? var3.m_9015() : null);
      return var4;
   }

   private void m_8637(List<Class_PlAkZAQgfIOFZi5F> var1, List<Class_PlAkZAQgfIOFZi5F> var2) {
      if (var2 != null) {
         for (Class_PlAkZAQgfIOFZi5F var4 : var2) {
            if (var4.key() >= 0) {
               var1.add(var4);
            }
         }
      }
   }

   public Class_s6dPPNYhKFC2fKhZ(SliderSetting var1) {
      super(f_30693, f_30694, f_30695, 0.0F, 0.0F);
      this.f_30690 = var1;
      this.f_30691 = new Class_u8iL1f1cFf6CucWB(f_30696, f_30697, var1, var0 -> String.format(Locale.US, f_30715, var0));
   }

   private String m_8638(int var1) {
      String var2 = Class_AjMrqn81FAcRNmHv.f_5178.get(var1);
      if (var2 != null) {
         return var2.toUpperCase(Locale.ROOT);
      }

      String var3 = Class_vAC0cSmAiUV3cskz.m_9251(var1);
      if (!var3.isBlank()) {
         return var3.toUpperCase(Locale.ROOT);
      }

      return switch (var1) {
         case 32 -> f_30711;
         case 258 -> f_30712;
         case 280 -> f_30713;
         case 340, 344 -> f_30708;
         case 341, 345 -> f_30709;
         case 342, 346 -> f_30710;
         default -> f_30714;
      };
   }

   @Generated
   public SliderSetting m_8639() {
      return this.f_30690;
   }

   @Override
   public void m_3992() {
      this.f_30691.m_9082();
   }
}
