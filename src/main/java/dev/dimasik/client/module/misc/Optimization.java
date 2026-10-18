package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.world.phys.Vec3;

public final class Optimization extends Module {
   private static final int[] f_16990 = new int[]{16, 12, 8};
   private static final double[] f_16991 = new double[]{1.0, Optimization.f_17010, Optimization.f_17011};
   private static final double[] f_16992 = new double[]{Optimization.f_17012, Optimization.f_17013, Optimization.f_17014};
   private static final double[] f_16993 = new double[]{Optimization.f_17015, Optimization.f_17016, Optimization.f_17017};
   private static Optimization f_16994;
   private final MultiChoiceSetting f_16995;
   private final CheckboxSetting f_16996;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_16997;
   private int f_16998;
   private int f_16999;
   private boolean f_17000;
   private static final String f_17001 = "Optimization";
   private static final String f_17002 = "Повышает FPS за счёт оптимизации частиц, тайлов, дистанции, облаков и теней";
   private static final String f_17003 = "Режим";
   private static final String f_17004 = "Низкий";
   private static final String f_17005 = "Средний";
   private static final String f_17006 = "Ультра";
   private static final String f_17007 = "Ограничение прорисовки";
   private static final String f_17008 = "Ультра";
   private static final String f_17009 = "Средний";
   private static final double f_17010 = 0.8;
   private static final double f_17011 = 0.6;
   private static final double f_17012 = 2304.0;
   private static final double f_17013 = 1024.0;
   private static final double f_17014 = 484.0;
   private static final double f_17015 = 2304.0;
   private static final double f_17016 = 1296.0;
   private static final double f_17017 = 576.0;

   public static boolean m_5841() {
      return m_5848() && f_16994.m_5844() == 2;
   }

   public static boolean m_5842() {
      return m_5848() && f_16994.m_5844() >= 1;
   }

   public static int m_5843(int var0) {
      if (var0 <= 0) {
         return 0;
      }

      if (!m_5848()) {
         return var0;
      }

      return Math.max(1, switch (f_16994.m_5844()) {
         case 0 -> var0 * 3 / 4;
         case 1 -> var0 / 2;
         default -> var0 / 4;
      });
   }

   private int m_5844() {
      if (this.f_16995.m_7568(f_17008)) {
         return 2;
      } else {
         return this.f_16995.m_7568(f_17009) ? 1 : 0;
      }
   }

   public static int m_5845(int var0) {
      if (!m_5848()) {
         return var0;
      }

      if (!f_16994.f_16996.m_8768()) {
         return var0;
      }

      int var1 = f_16990[f_16994.m_5844()];
      return Math.min(var0, var1);
   }

   public static boolean m_5846() {
      return false;
   }

   public static boolean m_5847(double var0) {
      return !m_5848() || var0 <= f_16993[f_16994.m_5844()];
   }

   private static boolean m_5848() {
      return f_16994 != null && f_16994.m_776();
   }

   public static boolean m_5849(double var0, double var2, double var4) {
      if (!m_5848()) {
         return true;
      }

      Minecraft var6 = Minecraft.getInstance();
      if (var6.gameRenderer == null) {
         return true;
      }

      Camera var7 = var6.gameRenderer.mainCamera();
      if (var7 == null) {
         return true;
      }

      Vec3 var8 = var7.position();
      double var9 = var0 - var8.x;
      double var11 = var2 - var8.y;
      double var13 = var4 - var8.z;
      return var9 * var9 + var11 * var11 + var13 * var13 <= f_16992[f_16994.m_5844()];
   }

   public static boolean m_5850() {
      return false;
   }

   public static double m_5851(double var0) {
      return m_5848() ? Math.min(var0, f_16992[f_16994.m_5844()]) : var0;
   }

   public static boolean m_5852() {
      return false;
   }

   public Optimization() {
      super(f_17001, f_17002, Category.MISC);
      this.f_16995 = new MultiChoiceSetting(
         f_17003, 1, new Class_2ZaVm8TGDJ68TnJB(f_17004), new Class_2ZaVm8TGDJ68TnJB(f_17005), new Class_2ZaVm8TGDJ68TnJB(f_17006)
      );
      this.f_16996 = new CheckboxSetting(f_17007, true);
      this.f_16997 = this::m_5853;
      this.f_16998 = -1;
      this.f_16999 = -1;
      f_16994 = this;
      this.m_795(this.f_16995, this.f_16996);
   }

   private void m_5853(Class_Xu9btcIeUN33XnMK var1) {
      this.m_5855();
   }

   public static boolean m_5854(boolean var0) {
      return m_5848() && f_16994.m_5844() >= 1 ? false : var0;
   }

   private void m_5855() {
      if (f_11537.level != null) {
         int var1 = this.m_5844();
         boolean var2 = this.f_16996.m_8768();
         int var3 = (Integer)f_11537.options.renderDistance().get();
         int var4 = var2 ? Math.min(var3, f_16990[var1]) : var3;
         if (var4 != this.f_16998 || var1 != this.f_16999 || var2 != this.f_17000) {
            this.f_16998 = var4;
            this.f_16999 = var1;
            this.f_17000 = var2;
            f_11537.levelExtractor.allChanged();
         }
      }
   }

   @Override
   public void m_778() {
      this.f_16998 = -1;
      this.f_16999 = -1;
      this.f_17000 = !this.f_16996.m_8768();
      this.m_5855();
   }

   public static boolean m_5856() {
      return false;
   }

   public static double m_5857(double var0) {
      return m_5848() ? var0 * f_16991[f_16994.m_5844()] : var0;
   }

   @Override
   public void m_732() {
      this.f_16998 = -1;
      this.f_16999 = -1;
      if (f_11537.level != null) {
         f_11537.levelExtractor.allChanged();
      }
   }
}
