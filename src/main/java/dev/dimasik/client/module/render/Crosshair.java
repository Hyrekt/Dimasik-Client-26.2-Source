package dev.dimasik.client.module.render;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ColorSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_w8fCJQ5ZtH5lQbWc;

public class Crosshair extends Module {
   private final SliderSetting f_10087;
   private final SliderSetting f_10088;
   private final SliderSetting f_10089;
   private final CheckboxSetting f_10090;
   private final SliderSetting f_10091;
   private final CheckboxSetting f_10092;
   private final ColorSetting f_10093;
   private final ColorSetting f_10094;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo.T0zcSk3flslBWOtw> f_10095;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_10096;
   private boolean f_10097;
   private final Class_w8fCJQ5ZtH5lQbWc f_10098;
   private static final String f_10099 = "Crosshair";
   private static final String f_10100 = "Кастомный прицел";
   private static final String f_10101 = "Пробел";
   private static final float f_10102 = 5.0F;
   private static final float f_10103 = 0.1F;
   private static final String f_10104 = "Длина";
   private static final float f_10105 = 4.0F;
   private static final float f_10106 = 5.0F;
   private static final float f_10107 = 0.1F;
   private static final String f_10108 = "Толщина";
   private static final float f_10109 = 5.0F;
   private static final float f_10110 = 0.1F;
   private static final String f_10111 = "Динамический";
   private static final String f_10112 = "Сила расширения";
   private static final float f_10113 = 10.0F;
   private static final float f_10114 = 5.0F;
   private static final float f_10115 = 15.0F;
   private static final String f_10116 = "Менять цвет при наведении";
   private static final String f_10117 = "Цвет";
   private static final String f_10118 = "Цвет при наведении";
   private static final float f_10119 = 10.0F;
   private static final float f_10120 = 0.5F;
   private static final float f_10121 = 0.5F;
   private static final float f_10122 = 0.5F;
   private static final float f_10123 = 0.5F;

   private void m_3368(Class_bhRaN0YSSLQRYjPo.T0zcSk3flslBWOtw var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (!f_11537.gui.hud.isHidden()) {
            if (f_11537.options.getCameraType().isFirstPerson()) {
               this.f_10098.m_9283(this.f_10097 ? 1.0F : 0.0F);
               int var2 = Math.max(2, f_11537.getWindow().getGuiScale());
               float var3 = this.f_10087.m_8768() * var2;
               float var4 = this.f_10089.m_8768() * var2;
               float var5 = this.f_10088.m_8768() * var2;
               float var6 = f_11537.getWindow().getScreenWidth() / 2.0F - f_10120;
               float var7 = f_11537.getWindow().getScreenHeight() / 2.0F - f_10121;
               int var8 = Class_BftdentXEtGbugJw.m_2312(this.f_10093.m_8768(), this.f_10094.m_8768(), this.f_10098.m_9288());
               int var9 = Class_BftdentXEtGbugJw.m_2310(0, 0, 0);
               if (this.f_10090.m_8768()) {
                  var3 = m_3373(var3, f_11537.player.getAttackStrengthScale(f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true)), this.f_10091.m_8768());
               }

               float var10 = var4 / 2.0F;
               this.m_3369(var6 - var3 - var5, var7 - var10, var5, var4, var8, var9);
               this.m_3369(var6 + var3, var7 - var10, var5, var4, var8, var9);
               this.m_3369(var6 - var10, var7 - var3 - var5, var4, var5, var8, var9);
               this.m_3369(var6 - var10, var7 + var3, var4, var5, var8, var9);
               var1.m_1582(true);
            }
         }
      }
   }

   private void m_3369(float var1, float var2, float var3, float var4, int var5, int var6) {
      this.m_3370(var1 - f_10122, var2 - f_10123, var3 + 1.0F, var4 + 1.0F, var6);
      this.m_3370(var1, var2, var3, var4, var5);
   }

   public Crosshair() {
      super(f_10099, f_10100, Category.RENDER);
      this.f_10087 = new SliderSetting(f_10101, 1.0F, 0.0F, f_10102).m_828(f_10103);
      this.f_10088 = new SliderSetting(f_10104, f_10105, 1.0F, f_10106).m_828(f_10107);
      this.f_10089 = new SliderSetting(f_10108, 1.0F, 1.0F, f_10109).m_828(f_10110);
      this.f_10090 = new CheckboxSetting(f_10111, true);
      this.f_10091 = new SliderSetting(f_10112, f_10113, f_10114, f_10115).m_828(1.0F).m_822(() -> this.f_10090.m_8768());
      this.f_10092 = new CheckboxSetting(f_10116, false);
      this.f_10093 = new ColorSetting(f_10117, true, -1);
      this.f_10094 = new ColorSetting(f_10118, true, Class_BftdentXEtGbugJw.m_2310(255, 0, 0)).m_822(() -> this.f_10092.m_8768());
      this.f_10095 = this::m_3368;
      this.f_10096 = this::m_3371;
      this.f_10097 = false;
      this.f_10098 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_10119);
      this.m_795(this.f_10088, this.f_10087, this.f_10089, this.f_10090, this.f_10091, this.f_10092, this.f_10093, this.f_10094);
   }

   public void m_3370(float var1, float var2, float var3, float var4, int var5) {
      Class_Ssh31B3ljfKeWsvS.m_4817(var1, var2, var3, var4, 0.0F, var5);
   }

   private void m_3371(Class_Xu9btcIeUN33XnMK var1) {
      this.f_10097 = false;
      if (this.f_10092.m_8768() && f_11537.crosshairPickEntity != null && f_11537.crosshairPickEntity.asLivingEntity() != null) {
         this.f_10097 = true;
      }
   }

   private static float m_3373(float var0, float var1, float var2) {
      return var0 + (1.0F - var1) * var2;
   }
}
