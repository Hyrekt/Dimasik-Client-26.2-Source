package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_U4Qsm43RVlUI3Pre;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_eXr9Fra2ad3yFXY8;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_hE5HYN1IW4q63o2z;
import dev.dimasik.client.system.Class_w8fCJQ5ZtH5lQbWc;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import net.minecraft.util.Mth;
import org.joml.Matrix4f;

public class HpHelper extends Module {
   private static HpHelper f_25800;
   private static final String f_25801 = "У вас малое количество здоровья";
   private final SliderSetting f_25802;
   private final Class_w8fCJQ5ZtH5lQbWc f_25803;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_25804;
   private final Class_gEPk7yDw6CwIte87<Class_hE5HYN1IW4q63o2z> f_25805;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_25806;
   private static final String f_25807 = "HpHelper";
   private static final String f_25808 = "Красит мир в красный, когда мало здоровья";
   private static final String f_25809 = "Здоровье";
   private static final float f_25810 = 6.0F;
   private static final float f_25811 = 20.0F;
   private static final float f_25812 = 12.0F;
   private static final float f_25813 = 0.45F;
   private static final float f_25814 = 0.55F;
   private static final float f_25815 = 0.45F;
   private static final float f_25816 = 6.0F;
   private static final float f_25817 = 0.75F;
   private static final float f_25818 = 0.04F;
   private static final int f_25819 = -16777216;
   private static final float f_25820 = 0.01F;
   private static final float f_25821 = 0.82F;
   private static final float f_25822 = 0.18F;
   private static final float f_25823 = 280.0F;
   private static final String f_25824 = "У вас малое количество здоровья";
   private static final float f_25825 = 18.0F;
   private static final float f_25826 = 11.0F;
   private static final float f_25827 = 0.18F;
   private static final String f_25828 = "У вас малое количество здоровья";
   private static final float f_25829 = 200.0F;
   private static final String f_25830 = "У вас малое количество здоровья";
   private static final float f_25831 = 255.0F;

   @Override
   public void m_732() {
      this.f_25803.m_9281(0.0F);
   }

   public static boolean m_7672() {
      return f_25800 != null && f_25800.m_776() && f_25800.m_7677();
   }

   public static float m_7673() {
      if (m_7672() && f_11537.player != null) {
         float var0 = f_25800.f_25802.m_8768();
         float var1 = f_11537.player.getHealth();
         float var2 = 1.0F - Mth.clamp(var1 / Math.max(1.0F, var0), 0.0F, 1.0F);
         return Mth.clamp(f_25813 + var2 * f_25814, f_25815, 1.0F);
      } else {
         return 0.0F;
      }
   }

   public static int m_7674() {
      float var0 = m_7673();
      int var1 = Mth.lerpInt(var0, 110, 210);
      int var2 = Mth.lerpInt(var0, 16, 4);
      int var3 = Mth.lerpInt(var0, 16, 4);
      return var1 << 16 | var2 << 8 | var3;
   }

   public HpHelper() {
      super(f_25807, f_25808, Category.MISC);
      this.f_25802 = new SliderSetting(f_25809, f_25810, 1.0F, f_25811).m_828(1.0F);
      this.f_25803 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_25812, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_25804 = this::m_7675;
      this.f_25805 = this::m_7678;
      this.f_25806 = this::m_7676;
      f_25800 = this;
      this.m_795(this.f_25802);
   }

   private void m_7675(Class_Xu9btcIeUN33XnMK var1) {
      this.f_25803.m_9283(this.m_7677() ? 1.0F : 0.0F);
   }

   private void m_7676(Class_bhRaN0YSSLQRYjPo var1) {
      this.f_25803.m_9283(this.m_7677() ? 1.0F : 0.0F);
      float var2 = this.f_25803.m_9288();
      if (!(var2 <= f_25820)) {
         float var3 = f_25821 + f_25822 * Mth.sin((float)System.currentTimeMillis() / f_25823);
         float var4 = var2 * var3;
         float var5 = f_11537.getWindow().getScreenWidth();
         float var6 = f_11537.getWindow().getScreenHeight();
         byte var7 = 16;
         float var8 = Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(f_25824, var7, 0.0F);
         float var9 = Class_Ssh31B3ljfKeWsvS.m_4823(Class_y1y6QpONhWEUIdEB.m_9588(), var7);
         float var10 = f_25825;
         float var11 = f_25826;
         float var12 = var8 + var10 * 2.0F;
         float var13 = var9 + var11 * 2.0F;
         float var14 = (var5 - var12) / 2.0F;
         float var15 = var6 * f_25827;
         float var16 = var14 + var10;
         float var17 = Class_Ssh31B3ljfKeWsvS.m_4863(Class_y1y6QpONhWEUIdEB.m_9588(), f_25828, var15 + var13 / 2.0F, var7);
         Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
         Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588());

         try {
            Class_U4Qsm43RVlUI3Pre.m_5199(var14, var15, var12, var13, var13 / 2.0F, Class_BftdentXEtGbugJw.m_2303(12, 4, 4, (int)(f_25829 * var2)));
            Class_U4Qsm43RVlUI3Pre.m_5186(
               Class_y1y6QpONhWEUIdEB.m_9588(), f_25830, var16, var17, var7, Class_BftdentXEtGbugJw.m_2303(255, 92, 92, (int)(f_25831 * var4))
            );
         } finally {
            Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588());
         }
      }
   }

   private boolean m_7677() {
      if (f_11537.player == null || f_11537.level == null) {
         return false;
      } else {
         return !f_11537.player.isCreative() && !f_11537.player.isSpectator() ? f_11537.player.getHealth() <= this.f_25802.m_8768() : false;
      }
   }

   private void m_7678(Class_hE5HYN1IW4q63o2z var1) {
      if (this.m_7677()) {
         float var2 = m_7673();
         float var3 = Math.max(f_25816, var1.m_7139() * (1.0F - var2 * f_25817));
         var1.m_7141(var3 * f_25818, var3);
         int var4 = Mth.lerpInt(var2, 130, 210);
         int var5 = Mth.lerpInt(var2, 8, 4);
         int var6 = Mth.lerpInt(var2, 8, 4);
         var1.m_7142(f_25819 | var4 << 16 | var5 << 8 | var6);
      }
   }
}
