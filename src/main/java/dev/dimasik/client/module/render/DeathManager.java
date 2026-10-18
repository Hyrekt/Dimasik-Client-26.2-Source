package dev.dimasik.client.module.render;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_U4Qsm43RVlUI3Pre;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector2f;
import org.joml.Vector4f;
import org.joml.Vector4i;

public class DeathManager extends Module {
   private static final float f_25911 = 12.0F;
   private static final float f_25912 = 10.0F;
   private static final float f_25913 = 22.0F;
   private static final float f_25914 = 18.0F;
   private static final float f_25915 = 1.4F;
   private final SliderSetting f_25916;
   private final CheckboxSetting f_25917;
   private final CheckboxSetting f_25918;
   private final List<DeathManager.nSitJjT1U4lyw6Ls> f_25919;
   private final Set<Integer> f_25920;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_25921;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_25922;
   private static final String f_25923 = "DeathManager";
   private static final String f_25924 = "Метка на месте смерти";
   private static final String f_25925 = "Время жизни";
   private static final float f_25926 = 15000.0F;
   private static final float f_25927 = 2000.0F;
   private static final float f_25928 = 20000.0F;
   private static final float f_25929 = 100.0F;
   private static final String f_25930 = "Игроки";
   private static final String f_25931 = "Мобы";
   private static final String f_25932 = "%.1f, %.1f, %.1f";
   private static final double f_25933 = 0.15;
   private static final float f_25934 = 0.12F;
   private static final String f_25935 = "DEAD";
   private static final String f_25936 = "XYZ";
   private static final float f_25937 = 13.0F;
   private static final float f_25938 = 12.0F;
   private static final float f_25939 = 14.0F;
   private static final String f_25940 = "I";
   private static final float f_25941 = 7.0F;
   private static final float f_25942 = 10.0F;
   private static final float f_25943 = 8.0F;
   private static final float f_25944 = 116.0F;
   private static final float f_25945 = 20.0F;
   private static final float f_25946 = 51.4F;
   private static final float f_25947 = 4.0F;
   private static final float f_25948 = 255.0F;
   private static final float f_25949 = 12.0F;
   private static final double f_25950 = 255.0;
   private static final float f_25951 = 10.0F;
   private static final float f_25952 = 5.0F;
   private static final String f_25953 = "I";
   private static final float f_25954 = 7.0F;
   private static final float f_25955 = 10.0F;
   private static final float f_25956 = 22.0F;
   private static final float f_25957 = 0.5F;
   private static final float f_25958 = 0.5F;
   private static final double f_25959 = 700.0;
   private static final float f_25960 = 0.55F;
   private static final float f_25961 = 10.0F;
   private static final float f_25962 = 20.0F;
   private static final float f_25963 = 1.4F;
   private static final float f_25964 = 1.4F;
   private static final float f_25965 = 5.0F;
   private static final float f_25966 = 10.0F;
   private static final float f_25967 = 10.0F;

   @Override
   public void m_732() {
      this.f_25919.clear();
      this.f_25920.clear();
   }

   private void m_7686(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.level != null && f_11537.player != null) {
         if (this.f_25917.m_8768() || this.f_25918.m_8768()) {
            HashSet var2 = new HashSet();

            for (Entity var4 : f_11537.level.entitiesForRendering()) {
               if (var4 instanceof LivingEntity var5) {
                  var2.add(var5.getId());
                  boolean var6 = var5 instanceof Player;
                  if ((!var6 || this.f_25917.m_8768())
                     && (var6 || this.f_25918.m_8768())
                     && (!(var5.getHealth() > 0.0F) || !var5.isAlive())
                     && this.f_25920.add(var5.getId())
                     && this.f_25919.size() < 35) {
                     Vec3 var7 = var5.position();
                     float var8 = var5.getBbHeight();
                     String var9 = var5.getDisplayName().getString();
                     String var10 = String.format(f_25932, var7.x, var7.y, var7.z);
                     this.f_25919
                        .add(
                           new DeathManager.nSitJjT1U4lyw6Ls(var5.getId(), var7.add(0.0, var8 + f_25933, 0.0), var9, var10, Math.round(this.f_25916.m_8768()))
                        );
                  }
               }
            }

            for (DeathManager.nSitJjT1U4lyw6Ls var13 : this.f_25919) {
               var2.add(var13.f_25908);
            }

            this.f_25920.retainAll(var2);
            long var12 = System.currentTimeMillis();
            this.f_25919.removeIf(var2x -> var12 - var2x.f_25906 >= var2x.f_25907);
         }
      } else {
         this.f_25919.clear();
         this.f_25920.clear();
      }
   }

   public DeathManager() {
      super(f_25923, f_25924, Category.RENDER);
      this.f_25916 = new SliderSetting(f_25925, f_25926, f_25927, f_25928).m_828(f_25929);
      this.f_25917 = new CheckboxSetting(f_25930, true);
      this.f_25918 = new CheckboxSetting(f_25931, false);
      this.f_25919 = new ArrayList<>();
      this.f_25920 = new HashSet<>();
      this.f_25921 = this::m_7686;
      this.f_25922 = this::m_7687;
      this.m_795(this.f_25916, this.f_25917, this.f_25918);
   }

   private void m_7687(Class_bhRaN0YSSLQRYjPo var1) {
      if (!this.f_25919.isEmpty() && var1.m_6083() != null) {
         long var2 = System.currentTimeMillis();

         for (DeathManager.nSitJjT1U4lyw6Ls var5 : this.f_25919) {
            float var6 = var5.m_7684(var2);
            var6 *= var6;
            if (!(var6 <= f_25934)) {
               Vector2f var7 = Class_FvJXUGWpZo3zYBW4.m_2690(var5.f_25903);
               if (var7 != null) {
                  String var8 = f_25935;
                  String var9 = var5.f_25904;
                  String var10 = f_25936;
                  String var11 = var5.f_25905;
                  float var12 = f_25937;
                  float var13 = f_25938;
                  float var14 = f_25939;
                  float var15 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var8, (int)var12);
                  float var16 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var9, (int)var12);
                  float var17 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var11, (int)var13);
                  float var18 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9591(), f_25940, (int)var14);
                  float var19 = var18 + f_25941 + var15 + f_25942 + var16;
                  float var20 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var10, (int)var13) + f_25943 + var17;
                  float var21 = Math.max(f_25944, Math.max(var19, var20) + f_25945);
                  float var22 = f_25946;
                  float var23 = var7.x - var21 / 2.0F;
                  float var24 = var7.y - var22 - f_25947;
                  Class_Ssh31B3ljfKeWsvS.m_4864(f_25948 * var6);
                  Class_Ssh31B3ljfKeWsvS.m_4848(var23, var24, var21, var22, f_25949);
                  int var25 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
                  int var26 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_TEXT);
                  int var27 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.WINDOW_SUR_TEXT);
                  int var28 = Class_BftdentXEtGbugJw.m_2303(255, 72, 88, f_25950);
                  float var29 = var23 + f_25951;
                  float var30 = var24 + f_25952;
                  Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());
                  Class_U4Qsm43RVlUI3Pre.m_5186(Class_y1y6QpONhWEUIdEB.m_9591(), f_25953, var29, var30 + 1.0F, (int)var14, var25);
                  var29 += var18 + f_25954;
                  Class_U4Qsm43RVlUI3Pre.m_5186(Class_y1y6QpONhWEUIdEB.m_9588(), var8, var29, var30, (int)var12, var28);
                  var29 += var15 + f_25955;
                  Class_U4Qsm43RVlUI3Pre.m_5186(Class_y1y6QpONhWEUIdEB.m_9588(), var9, var29, var30, (int)var12, var26);
                  float var31 = var24 + f_25956;
                  int var32 = Class_BftdentXEtGbugJw.m_2306(
                     Class_BftdentXEtGbugJw.m_2312(
                        var25,
                        Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN_TWO),
                        f_25957 + f_25958 * (float)Math.sin(System.currentTimeMillis() / f_25959)
                     ),
                     f_25960
                  );
                  int var33 = Class_BftdentXEtGbugJw.m_2306(var25, 0.0F);
                  Class_U4Qsm43RVlUI3Pre.m_5220(var23 + f_25961, var31, var21 - f_25962, f_25963, new Vector4f(0.0F), new Vector4i(var33, var32, var32, var33));
                  float var34 = var31 + f_25964 + f_25965;
                  Class_U4Qsm43RVlUI3Pre.m_5186(Class_y1y6QpONhWEUIdEB.m_9588(), var10, var23 + f_25966, var34, (int)var13, var25);
                  Class_U4Qsm43RVlUI3Pre.m_5186(Class_y1y6QpONhWEUIdEB.m_9588(), var11, var23 + var21 - f_25967 - var17, var34, (int)var13, var27);
                  Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588(), Class_y1y6QpONhWEUIdEB.m_9591());
                  Class_Ssh31B3ljfKeWsvS.m_4844();
               }
            }
         }
      }
   }

   private static final class nSitJjT1U4lyw6Ls {
      public final Vec3 f_25903;
      public final String f_25904;
      public final String f_25905;
      public final long f_25906 = System.currentTimeMillis();
      public final long f_25907;
      public final int f_25908;
      public static final float f_25909 = 0.08F;
      public static final float f_25910 = 0.2F;

      public nSitJjT1U4lyw6Ls(int var1, Vec3 var2, String var3, String var4, long var5) {
         this.f_25908 = var1;
         this.f_25903 = var2;
         this.f_25904 = var3;
         this.f_25905 = var4;
         this.f_25907 = var5;
      }

      public float m_7684(long var1) {
         float var3 = Mth.clamp((float)(var1 - this.f_25906) / (float)this.f_25907, 0.0F, 1.0F);
         float var4 = Mth.clamp(var3 / f_25909, 0.0F, 1.0F);
         float var5 = Mth.clamp((1.0F - var3) / f_25910, 0.0F, 1.0F);
         return var4 * var5;
      }
   }
}
