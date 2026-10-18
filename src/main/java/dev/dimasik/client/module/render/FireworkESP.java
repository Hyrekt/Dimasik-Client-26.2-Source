package dev.dimasik.client.module.render;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ColorSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.network.protocol.game.ClientboundSoundPacket;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Vector2f;

public final class FireworkESP extends Module {
   private final CheckboxSetting f_13884;
   private final CheckboxSetting f_13885;
   private final ColorSetting f_13886;
   private final SliderSetting f_13887;
   private final SliderSetting f_13888;
   private final Queue<Vec3> f_13889;
   private final List<FireworkESP.Class_5UhAU6RxHohiXPBK> f_13890;
   private ClientLevel f_13891;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_13892;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_13893;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_13894;
   private static final String f_13895 = "FireworkESP";
   private static final String f_13896 = "Показывает места запуска фейерверков";
   private static final String f_13897 = "Показывать время";
   private static final String f_13898 = "Цвет темы";
   private static final String f_13899 = "Цвет";
   private static final int f_13900 = -9905665;
   private static final String f_13901 = "Время метки";
   private static final float f_13902 = 8.0F;
   private static final float f_13903 = 3.0F;
   private static final float f_13904 = 20.0F;
   private static final float f_13905 = 0.5F;
   private static final String f_13906 = "Радиус объединения";
   private static final float f_13907 = 5.0F;
   private static final float f_13908 = 12.0F;
   private static final float f_13909 = 0.5F;
   private static final float f_13910 = 1000.0F;
   private static final float f_13911 = 1000.0F;
   private static final double f_13912 = 0.5;
   private static final float f_13913 = 0.002F;
   private static final String f_13914 = "%.1fс";
   private static final double f_13915 = 1000.0;
   private static final float f_13916 = 0.92F;
   private static final float f_13917 = 0.08F;
   private static final float f_13918 = 16.0F;
   private static final float f_13919 = 28.0F;
   private static final float f_13920 = 6.0F;
   private static final float f_13921 = 5.0F;
   private static final float f_13922 = 12.0F;
   private static final float f_13923 = 25.0F;
   private static final float f_13924 = 10.0F;
   private static final float f_13925 = 0.5F;
   private static final float f_13926 = 0.5F;
   private static final float f_13927 = 4.0F;
   private static final float f_13928 = 4.0F;
   private static final float f_13929 = 14.0F;
   private static final float f_13930 = 145.0F;
   private static final float f_13931 = 10.0F;
   private static final float f_13932 = 180.0F;
   private static final float f_13933 = 7.0F;
   private static final float f_13934 = 205.0F;
   private static final float f_13935 = 0.5F;
   private static final float f_13936 = 6.0F;
   private static final float f_13937 = 0.5F;
   private static final float f_13938 = 255.0F;
   private static final float f_13939 = 5.0F;
   private static final float f_13940 = 0.5F;
   private static final float f_13941 = 255.0F;
   private static final float f_13942 = 0.0025F;
   private static final float f_13943 = 0.5F;
   private static final long f_13944 = 420L;

   public FireworkESP() {
      super(f_13895, f_13896, Category.RENDER);
      this.f_13884 = new CheckboxSetting(f_13897, true);
      this.f_13885 = new CheckboxSetting(f_13898, true);
      this.f_13886 = new ColorSetting(f_13899, false, f_13900).m_822(() -> !this.f_13885.m_8768());
      this.f_13887 = new SliderSetting(f_13901, f_13902, f_13903, f_13904).m_828(f_13905);
      this.f_13888 = new SliderSetting(f_13906, f_13907, 1.0F, f_13908).m_828(f_13909);
      this.f_13889 = new ConcurrentLinkedQueue<>();
      this.f_13890 = new ArrayList<>();
      this.f_13892 = this::m_4934;
      this.f_13893 = this::m_4937;
      this.f_13894 = this::m_4936;
      this.m_795(this.f_13884, this.f_13885, this.f_13886, this.f_13887, this.f_13888);
   }

   private void m_4932(Vec3 var1) {
      double var2 = this.f_13888.m_8768() * this.f_13888.m_8768();
      long var4 = System.currentTimeMillis();

      for (FireworkESP.Class_5UhAU6RxHohiXPBK var7 : this.f_13890) {
         if (var4 - var7.f_13879 < var7.f_13880 && var7.f_13878.distanceToSqr(var1) <= var2) {
            var7.m_4931((long)(this.f_13887.m_8768() * f_13910));
            return;
         }
      }

      this.f_13890.add(new FireworkESP.Class_5UhAU6RxHohiXPBK(var1, (long)(this.f_13887.m_8768() * f_13911)));
   }

   private int m_4933(int var1, int var2) {
      return Class_BftdentXEtGbugJw.m_2303(
         Class_BftdentXEtGbugJw.m_2309(var1), Class_BftdentXEtGbugJw.m_2299(var1), Class_BftdentXEtGbugJw.m_2308(var1), Mth.clamp(var2, 0, 255)
      );
   }

   private void m_4934(Class_XzpX8S5F5zd9jbuE var1) {
      if (var1.m_5619() instanceof ClientboundSoundPacket var2) {
         if (var2.getSound().value() == SoundEvents.FIREWORK_ROCKET_LAUNCH) {
            this.f_13889.add(new Vec3(var2.getX(), var2.getY(), var2.getZ()));
         }
      }
   }

   private void m_4936(Class_bhRaN0YSSLQRYjPo var1) {
      if (var1.m_6083() != null && !this.f_13890.isEmpty() && f_11537.player != null) {
         Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
         long var2 = System.currentTimeMillis();

         for (FireworkESP.Class_5UhAU6RxHohiXPBK var5 : this.f_13890) {
            Vector2f var6 = Class_FvJXUGWpZo3zYBW4.m_2690(var5.f_13878.add(0.0, f_13912, 0.0));
            if (var6 != null) {
               float var7 = var5.m_4929(var2);
               if (!(var7 <= f_13913)) {
                  float var8 = var5.m_4930(var2);
                  int var9 = this.m_4938(var5, var2);
                  String var10 = String.format(Locale.ROOT, f_13914, Math.max(0.0, (var5.f_13880 - (var2 - var5.f_13879)) / f_13915));
                  String var11 = this.f_13884.m_8768() ? var10 : "";
                  byte var12 = 11;
                  float var13 = f_13916 + f_13917 * var8;
                  float var14 = f_13918 * var13;
                  float var15 = var11.isEmpty() ? 0.0F : Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var11, var12);
                  float var16 = var11.isEmpty() ? f_13919 : f_13920 + var14 + f_13921 + var15 + f_13922;
                  float var17 = f_13923;
                  float var18 = (1.0F - var8) * f_13924;
                  float var19 = var6.x - var16 * f_13925;
                  float var20 = var6.y - var17 * f_13926 + var18;
                  Class_Ssh31B3ljfKeWsvS.m_4859(
                     var19 - 2.0F, var20 - 2.0F, var16 + f_13927, var17 + f_13928, f_13929, this.m_4933(var9, Math.round(f_13930 * var7))
                  );
                  Class_Ssh31B3ljfKeWsvS.m_4859(var19, var20, var16, var17, f_13931, Class_BftdentXEtGbugJw.m_2303(0, 0, 0, Math.round(f_13932 * var7)));
                  Class_Ssh31B3ljfKeWsvS.m_4817(var19, var20, var16, var17, f_13933, Class_BftdentXEtGbugJw.m_2303(8, 13, 22, Math.round(f_13934 * var7)));
                  float var21 = var11.isEmpty() ? var19 + (var16 - var14) * f_13935 : var19 + f_13936;
                  float var22 = var20 + (var17 - var14) * f_13937;
                  Class_Ssh31B3ljfKeWsvS.m_4864(var7 * f_13938);

                  try {
                     Class_Ssh31B3ljfKeWsvS.m_4851(Items.FIREWORK_ROCKET.getDefaultInstance(), var21, var22, var13, false);
                  } finally {
                     Class_Ssh31B3ljfKeWsvS.m_4844();
                  }

                  if (!var11.isEmpty()) {
                     float var23 = var21 + var14 + f_13939;
                     float var24 = Class_Ssh31B3ljfKeWsvS.m_4839(Class_y1y6QpONhWEUIdEB.m_9588(), var20 + var17 * f_13940, var12);
                     Class_Ssh31B3ljfKeWsvS.m_4866(
                        Class_y1y6QpONhWEUIdEB.m_9588(), var11, var23, var24, var12, Class_BftdentXEtGbugJw.m_2303(238, 247, 255, Math.round(f_13941 * var7))
                     );
                  }
               }
            }
         }
      }
   }

   private void m_4937(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.level != null && f_11537.player != null) {
         if (this.f_13891 != f_11537.level) {
            this.m_4940();
            this.f_13891 = f_11537.level;
         }

         Vec3 var2;
         while ((var2 = this.f_13889.poll()) != null) {
            this.m_4932(var2);
         }

         long var3 = System.currentTimeMillis();
         this.f_13890.removeIf(var2x -> var3 - var2x.f_13879 > var2x.f_13880 + f_13944);
      } else {
         this.m_4940();
      }
   }

   private int m_4938(FireworkESP.Class_5UhAU6RxHohiXPBK var1, long var2) {
      if (!this.f_13885.m_8768()) {
         return this.f_13886.m_8768();
      }

      float var4 = (Mth.sin((float)(var2 - var1.f_13879) * f_13942) + 1.0F) * f_13943;
      return Class_BftdentXEtGbugJw.m_2302(
         Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN), Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN_TWO), var4
      );
   }

   @Override
   public void m_732() {
      this.m_4940();
   }

   private void m_4940() {
      this.f_13889.clear();
      this.f_13890.clear();
      this.f_13891 = null;
   }

   private static final class Class_5UhAU6RxHohiXPBK {
      public final Vec3 f_13878;
      public long f_13879 = System.currentTimeMillis();
      public long f_13880;
      public static final float f_13881 = 260.0F;
      public static final double f_13882 = 3.0;
      public static final float f_13883 = 420.0F;

      public float m_4929(long var1) {
         long var3 = var1 - this.f_13879;
         if (var3 <= this.f_13880) {
            return this.m_4930(var1);
         }

         float var5 = 1.0F - Mth.clamp((float)(var3 - this.f_13880) / f_13883, 0.0F, 1.0F);
         return var5 * var5;
      }

      public Class_5UhAU6RxHohiXPBK(Vec3 var1, long var2) {
         this.f_13878 = var1;
         this.f_13880 = var2;
      }

      public float m_4930(long var1) {
         float var3 = Mth.clamp((float)(var1 - this.f_13879) / f_13881, 0.0F, 1.0F);
         return 1.0F - (float)Math.pow(1.0F - var3, f_13882);
      }

      public void m_4931(long var1) {
         this.f_13879 = System.currentTimeMillis();
         this.f_13880 = var1;
      }
   }
}
