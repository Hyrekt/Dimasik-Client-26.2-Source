package dev.dimasik.client.module.render;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;

public class AntiAim extends Module {
   private final MultiChoiceSetting f_28865;
   private final MultiChoiceSetting f_28866;
   private final SliderSetting f_28867;
   private final SliderSetting f_28868;
   private final SliderSetting f_28869;
   private final SliderSetting f_28870;
   private final SliderSetting f_28871;
   private final SliderSetting f_28872;
   private final CheckboxSetting f_28873;
   private float f_28874;
   private float f_28875;
   private float f_28876;
   private float f_28877;
   private float f_28878;
   private long f_28879;
   private long f_28880;
   private static final String f_28881 = "AntiAim";
   private static final String f_28882 = "Визуальные антиаимы как в HVH читах";
   private static final String f_28883 = "Режим";
   private static final String f_28884 = "Spin";
   private static final String f_28885 = "Jitter";
   private static final String f_28886 = "Static";
   private static final String f_28887 = "Sideways";
   private static final String f_28888 = "Backwards";
   private static final String f_28889 = "Fake Down";
   private static final String f_28890 = "Fake Up";
   private static final String f_28891 = "Spin Pitch";
   private static final String f_28892 = "Random";
   private static final String f_28893 = "Legit";
   private static final String f_28894 = "Питч";
   private static final String f_28895 = "Режима";
   private static final String f_28896 = "Down";
   private static final String f_28897 = "Up";
   private static final String f_28898 = "Zero";
   private static final String f_28899 = "Custom";
   private static final String f_28900 = "Jitter";
   private static final String f_28901 = "Скорость спина";
   private static final float f_28902 = 40.0F;
   private static final float f_28903 = 100.0F;
   private static final String f_28904 = "Yaw оффсет";
   private static final float f_28905 = 180.0F;
   private static final float f_28906 = -180.0F;
   private static final float f_28907 = 180.0F;
   private static final String f_28908 = "Питч значение";
   private static final float f_28909 = 89.0F;
   private static final float f_28910 = -90.0F;
   private static final float f_28911 = 90.0F;
   private static final String f_28912 = "Голова оффсет";
   private static final float f_28913 = -180.0F;
   private static final float f_28914 = 180.0F;
   private static final String f_28915 = "Jitter диапазон";
   private static final float f_28916 = 45.0F;
   private static final float f_28917 = 5.0F;
   private static final float f_28918 = 180.0F;
   private static final String f_28919 = "Смена (мс)";
   private static final float f_28920 = 120.0F;
   private static final float f_28921 = 20.0F;
   private static final float f_28922 = 500.0F;
   private static final float f_28923 = 10.0F;
   private static final String f_28924 = "Только тело";
   private static final String f_28925 = "Spin";
   private static final String f_28926 = "Jitter";
   private static final String f_28927 = "Static";
   private static final String f_28928 = "Sideways";
   private static final String f_28929 = "Backwards";
   private static final String f_28930 = "Fake Down";
   private static final String f_28931 = "Fake Up";
   private static final String f_28932 = "Spin Pitch";
   private static final String f_28933 = "Random";
   private static final String f_28934 = "Legit";
   private static final float f_28935 = 0.45F;
   private static final float f_28936 = 89.0F;
   private static final float f_28937 = 0.5F;
   private static final float f_28938 = 0.5F;
   private static final float f_28939 = 0.15F;
   private static final float f_28940 = -89.0F;
   private static final float f_28941 = 89.0F;
   private static final float f_28942 = -90.0F;
   private static final float f_28943 = 90.0F;
   private static final float f_28944 = 180.0F;
   private static final float f_28945 = 180.0F;
   private static final float f_28946 = 89.0F;
   private static final float f_28947 = 180.0F;
   private static final float f_28948 = -89.0F;
   private static final float f_28949 = 0.45F;
   private static final double f_28950 = 180.0;
   private static final float f_28951 = 89.0F;
   private static final float f_28952 = -180.0F;
   private static final float f_28953 = 180.0F;
   private static final float f_28954 = -89.0F;
   private static final float f_28955 = 89.0F;
   private static final float f_28956 = 30.0F;
   private static final float f_28957 = 89.0F;
   private static final float f_28958 = -89.0F;
   private static final float f_28959 = 35.0F;
   private static final float f_28960 = 0.35F;
   private static final double f_28961 = 420.0;
   private static final float f_28962 = 12.0F;
   private static final double f_28963 = 510.0;
   private static final float f_28964 = 8.0F;
   private static final float f_28965 = -45.0F;
   private static final float f_28966 = 45.0F;
   private static final String f_28967 = "Down";
   private static final String f_28968 = "Up";
   private static final String f_28969 = "Zero";
   private static final String f_28970 = "Custom";
   private static final String f_28971 = "Jitter";
   private static final float f_28972 = 89.0F;
   private static final float f_28973 = -89.0F;
   private static final float f_28974 = -89.0F;
   private static final float f_28975 = 89.0F;
   private static final String f_28976 = "Jitter";
   private static final String f_28977 = "Random";
   private static final String f_28978 = "Jitter";
   private static final String f_28979 = "Jitter";
   private static final String f_28980 = "Random";
   private static final String f_28981 = "Jitter";
   private static final String f_28982 = "Custom";
   private static final String f_28983 = "Static";
   private static final String f_28984 = "Fake Down";
   private static final String f_28985 = "Fake Up";
   private static final String f_28986 = "Static";
   private static final String f_28987 = "Sideways";
   private static final String f_28988 = "Backwards";
   private static final String f_28989 = "Legit";
   private static final String f_28990 = "Spin";
   private static final String f_28991 = "Spin Pitch";
   private static final String f_28992 = "Jitter";

   public AntiAim() {
      super(f_28881, f_28882, Category.RENDER);
      this.f_28865 = new MultiChoiceSetting(
         f_28883,
         new Class_2ZaVm8TGDJ68TnJB(f_28884),
         new Class_2ZaVm8TGDJ68TnJB(f_28885),
         new Class_2ZaVm8TGDJ68TnJB(f_28886),
         new Class_2ZaVm8TGDJ68TnJB(f_28887),
         new Class_2ZaVm8TGDJ68TnJB(f_28888),
         new Class_2ZaVm8TGDJ68TnJB(f_28889),
         new Class_2ZaVm8TGDJ68TnJB(f_28890),
         new Class_2ZaVm8TGDJ68TnJB(f_28891),
         new Class_2ZaVm8TGDJ68TnJB(f_28892),
         new Class_2ZaVm8TGDJ68TnJB(f_28893)
      );
      this.f_28866 = new MultiChoiceSetting(
         f_28894,
         new Class_2ZaVm8TGDJ68TnJB(f_28895),
         new Class_2ZaVm8TGDJ68TnJB(f_28896),
         new Class_2ZaVm8TGDJ68TnJB(f_28897),
         new Class_2ZaVm8TGDJ68TnJB(f_28898),
         new Class_2ZaVm8TGDJ68TnJB(f_28899),
         new Class_2ZaVm8TGDJ68TnJB(f_28900)
      );
      this.f_28867 = new SliderSetting(f_28901, f_28902, 1.0F, f_28903)
         .m_828(1.0F)
         .m_822(() -> this.f_28865.m_7568(f_28990) || this.f_28865.m_7568(f_28991) || this.f_28865.m_7568(f_28992));
      this.f_28868 = new SliderSetting(f_28904, f_28905, f_28906, f_28907)
         .m_828(1.0F)
         .m_822(() -> this.f_28865.m_7568(f_28986) || this.f_28865.m_7568(f_28987) || this.f_28865.m_7568(f_28988) || this.f_28865.m_7568(f_28989));
      this.f_28869 = new SliderSetting(f_28908, f_28909, f_28910, f_28911)
         .m_828(1.0F)
         .m_822(() -> this.f_28866.m_7568(f_28982) || this.f_28865.m_7568(f_28983) || this.f_28865.m_7568(f_28984) || this.f_28865.m_7568(f_28985));
      this.f_28870 = new SliderSetting(f_28912, 0.0F, f_28913, f_28914).m_828(1.0F);
      this.f_28871 = new SliderSetting(f_28915, f_28916, f_28917, f_28918)
         .m_828(1.0F)
         .m_822(() -> this.f_28865.m_7568(f_28979) || this.f_28865.m_7568(f_28980) || this.f_28866.m_7568(f_28981));
      this.f_28872 = new SliderSetting(f_28919, f_28920, f_28921, f_28922)
         .m_828(f_28923)
         .m_822(() -> this.f_28865.m_7568(f_28976) || this.f_28865.m_7568(f_28977) || this.f_28866.m_7568(f_28978));
      this.f_28873 = new CheckboxSetting(f_28924, false);
      this.m_795(this.f_28865, this.f_28866, this.f_28867, this.f_28868, this.f_28869, this.f_28870, this.f_28871, this.f_28872, this.f_28873);
   }

   private void m_8222(LivingEntity var1, LivingEntityRenderState var2) {
      if (f_11537.player != null && var1 == f_11537.player) {
         float var3 = f_11537.player.getYRot();
         float var4 = f_11537.player.getXRot();
         long var5 = System.currentTimeMillis();
         float var7 = var3;
         float var8 = var4;
         switch (this.f_28865.m_7564().m_1181()) {
            case f_28925:
               this.f_28874 = Mth.wrapDegrees(this.f_28874 + this.f_28867.m_8768() * f_28935);
               var7 = this.f_28874;
               var8 = this.m_8224(f_28936);
               break;
            case f_28926:
               if ((float)(var5 - this.f_28879) >= this.f_28872.m_8768()) {
                  float var16 = this.f_28871.m_8768();
                  this.f_28875 = ThreadLocalRandom.current().nextFloat(-var16, var16);
                  this.f_28876 = ThreadLocalRandom.current().nextFloat(-var16 * f_28937, var16 * f_28938);
                  this.f_28879 = var5;
               }

               this.f_28874 = Mth.wrapDegrees(this.f_28874 + this.f_28867.m_8768() * f_28939);
               var7 = Mth.wrapDegrees(var3 + this.f_28874 + this.f_28875);
               var8 = this.m_8224(Mth.clamp(this.f_28876, f_28940, f_28941));
               break;
            case f_28927:
               var7 = Mth.wrapDegrees(var3 + this.f_28868.m_8768());
               var8 = this.m_8224(this.f_28869.m_8768());
               break;
            case f_28928:
               float var15 = this.f_28868.m_8768() < 0.0F ? f_28942 : f_28943;
               var7 = Mth.wrapDegrees(var3 + var15);
               var8 = this.m_8224(0.0F);
               break;
            case f_28929:
               var7 = Mth.wrapDegrees(var3 + f_28944 + this.f_28868.m_8768());
               var8 = this.m_8224(0.0F);
               break;
            case f_28930:
               var7 = Mth.wrapDegrees(var3 + f_28945);
               var8 = this.m_8224(this.f_28869.m_8768() >= 0.0F ? this.f_28869.m_8768() : f_28946);
               break;
            case f_28931:
               var7 = Mth.wrapDegrees(var3 + f_28947);
               float var14 = this.f_28869.m_8768() <= 0.0F ? this.f_28869.m_8768() : f_28948;
               var8 = this.m_8224(var14);
               break;
            case f_28932:
               this.f_28874 = Mth.wrapDegrees(this.f_28874 + this.f_28867.m_8768() * f_28949);
               var7 = this.f_28874;
               float var13 = (float)Math.sin(var5 / f_28950) * f_28951;
               var8 = this.m_8224(var13);
               break;
            case f_28933:
               if ((float)(var5 - this.f_28879) >= this.f_28872.m_8768()) {
                  this.f_28877 = ThreadLocalRandom.current().nextFloat(f_28952, f_28953);
                  this.f_28878 = ThreadLocalRandom.current().nextFloat(f_28954, f_28955);
                  if (Math.abs(this.f_28878) < f_28956) {
                     this.f_28878 = ThreadLocalRandom.current().nextBoolean() ? f_28957 : f_28958;
                  }

                  this.f_28879 = var5;
               }

               var7 = Mth.wrapDegrees(var3 + this.f_28877);
               var8 = this.m_8224(this.f_28878);
               break;
            case f_28934:
               float var11 = this.f_28868.m_8768() == 0.0F ? f_28959 : this.f_28868.m_8768() * f_28960;
               float var12 = (float)Math.sin(var5 / f_28961) * f_28962;
               var7 = Mth.wrapDegrees(var3 + var11 + var12);
               var8 = this.m_8224(Mth.clamp(var4 + (float)Math.sin(var5 / f_28963) * f_28964, f_28965, f_28966));
         }

         var2.bodyRot = var7;
         if (this.f_28873.m_8768()) {
            var2.yRot = Mth.wrapDegrees(var3 - var7);
            var2.xRot = var4;
         } else {
            var2.yRot = this.f_28870.m_8768();
            var2.xRot = var8;
         }
      }
   }

   private float m_8224(float var1) {
      return switch (this.f_28866.m_7564().m_1181()) {
         case f_28967 -> f_28972;
         case f_28968 -> f_28973;
         case f_28969 -> 0.0F;
         case f_28970 -> this.f_28869.m_8768();
         case f_28971 -> {
            long var4 = System.currentTimeMillis();
            if ((float)(var4 - this.f_28880) >= this.f_28872.m_8768()) {
               float var6 = this.f_28871.m_8768();
               this.f_28876 = ThreadLocalRandom.current().nextFloat(-var6, var6);
               this.f_28880 = var4;
            }

            yield Mth.clamp(this.f_28876, f_28974, f_28975);
         }
         default -> var1;
      };
   }

   @Override
   public void m_778() {
      this.f_28874 = f_11537.player != null ? f_11537.player.getYRot() : 0.0F;
      this.f_28875 = 0.0F;
      this.f_28876 = 0.0F;
      this.f_28877 = 0.0F;
      this.f_28878 = 0.0F;
      this.f_28879 = 0L;
      this.f_28880 = 0L;
   }

   public static void m_8226(LivingEntity var0, LivingEntityRenderState var1) {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
         AntiAim var2 = DimasikClient.m_9057().m_9049().m_2801().m_3507();
         if (var2 != null && var2.m_776()) {
            var2.m_8222(var0, var1);
         }
      }
   }
}
