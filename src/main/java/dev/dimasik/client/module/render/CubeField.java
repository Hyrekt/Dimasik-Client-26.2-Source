package dev.dimasik.client.module.render;

import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.ColorSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_3aGzqZC9MJ5h9epG;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_NzJrN63M7QBpmAbi;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_sULPxrOl7TpPlaX6;
import dev.dimasik.client.system.Class_uYlA2bjVcAq54Bqy;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;

public final class CubeField extends Module {
   private final MultiChoiceSetting f_29953;
   private final ColorSetting f_29954;
   private final SliderSetting f_29955;
   private final SliderSetting f_29956;
   private static final int f_29957 = 16;
   private static final long f_29958 = 2000L;
   private static final double f_29959 = 0.6;
   private static final double f_29960 = 2.6;
   private static final double f_29961 = 6.0;
   private static final long f_29962 = 400L;
   private static final int[] f_29963 = new int[]{0, 90, 180, 270};
   private final Random f_29964;
   private final List<CubeField.UINGC6KIoRmEDv06> f_29965;
   private final List<CubeField.UINGC6KIoRmEDv06> f_29966;
   private ClientLevel f_29967;
   private final Class_gEPk7yDw6CwIte87<Class_sULPxrOl7TpPlaX6> f_29968;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_29969;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_29970;
   private final Class_gEPk7yDw6CwIte87<Class_3aGzqZC9MJ5h9epG> f_29971;
   private static final String f_29972 = "CubeField";
   private static final String f_29973 = "Кубики вокруг игрока — прыгают и крутятся";
   private static final String f_29974 = "Режим цвета";
   private static final String f_29975 = "Тема";
   private static final String f_29976 = "Свой";
   private static final String f_29977 = "Цвет";
   private static final int f_29978 = -16711681;
   private static final String f_29979 = "Кубиков";
   private static final float f_29980 = 3.0F;
   private static final float f_29981 = 10.0F;
   private static final String f_29982 = "Размер";
   private static final float f_29983 = 0.18F;
   private static final float f_29984 = 0.05F;
   private static final float f_29985 = 0.4F;
   private static final float f_29986 = 0.01F;
   private static final double f_29987 = 0.6;
   private static final double f_29988 = 2.6;
   private static final String f_29989 = "Тема";
   private static final int f_29990 = 16777215;
   private static final float f_29991 = 0.01F;
   private static final float f_29992 = 90.0F;
   private static final float f_29993 = 0.2F;
   private static final float f_29994 = 255.0F;
   private static final float f_29995 = 255.0F;
   private static final float f_29996 = 5.5F;
   private static final float f_29997 = 35.0F;
   private static final float f_29998 = 1.8F;
   private static final float f_29999 = 40.0F;
   private static final double f_30000 = 0.0625;
   private static final double f_30001 = 2.0;
   private static final double f_30002 = 0.6;
   private static final double f_30003 = 2.6;
   private static final double f_30004 = 16.0;
   private static final double f_30005 = 16.0;
   private static final double f_30006 = 16.0;
   private static final double f_30007 = 16.0;
   private static final String f_30008 = "Свой";

   private List<BlockPos> m_8342(Vec3 var1, double var2, double var4, int var6) {
      ArrayList var7 = new ArrayList();
      if (f_11537.level == null) {
         return var7;
      }

      double var8 = var1.x;
      double var10 = var1.y + 1.0;
      double var12 = var1.z;

      for (double var14 = var8 - var4; var14 < var8 + var4; var14++) {
         for (double var16 = var12 - var4; var16 < var12 + var4; var16++) {
            for (double var18 = var10 - var6; var18 < var10; var18++) {
               BlockPos var20 = BlockPos.containing(var14, var18, var16);
               if (this.m_8347(var20) && !var7.contains(var20)) {
                  var7.add(var20);
               }
            }
         }
      }

      return var7;
   }

   private void m_8344(Class_TZhU50s8XmBQCMP5 var1) {
      if (this.f_29967 != f_11537.level) {
         this.m_8350();
      } else if (f_11537.player != null && f_11537.level != null && !this.f_29965.isEmpty()) {
         float var2 = var1.m_5005().getGameTimeDeltaPartialTick(true);
         Camera var3 = f_11537.gameRenderer.mainCamera();
         Vec3 var4 = var3.position();
         PoseStack var5 = var1.m_5006();
         float var6 = this.f_29956.m_8768();
         int var7 = (this.f_29953.m_7568(f_29989) ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : this.f_29954.m_8768()) & f_29990;
         this.f_29966.clear();

         for (CubeField.UINGC6KIoRmEDv06 var9 : this.f_29965) {
            float var10 = var9.m_8336();
            if (!var9.m_8337() && !(var10 < f_29991)) {
               double var11 = var9.f_29925.x - var4.x;
               double var13 = var9.f_29925.y + var9.m_8338(var2) - var4.y;
               double var15 = var9.f_29925.z - var4.z;
               var5.pushPose();
               var5.translate(var11, var13, var15);
               if (var9.f_29930 > 0) {
                  float var17 = 1.0F - Mth.lerp(var2, var9.f_29929, var9.f_29928) / var9.f_29930;
                  var5.mulPose(Axis.YP.rotationDegrees(var9.f_29931));
                  var5.mulPose(Axis.XP.rotationDegrees(f_29992 * var17));
               }

               var5.scale(var10, var10, var10);
               var9.f_29935.set(var5.last().pose());
               var5.popPose();
               var5.pushPose();
               var5.translate(var11, var13, var15);
               var5.mulPose(var3.rotation());
               var5.scale(var10, var10, var10);
               var9.f_29936.set(var5.last().pose());
               var5.popPose();
               var9.f_29927 = var10;
               this.f_29966.add(var9);
            }
         }

         if (!this.f_29966.isEmpty()) {
            BufferBuilder var18 = Class_uYlA2bjVcAq54Bqy.m_9213(false, false);

            for (CubeField.UINGC6KIoRmEDv06 var26 : this.f_29966) {
               Class_uYlA2bjVcAq54Bqy.m_9217(var18, var26.f_29935, var6 / 2.0F, var7 | (int)(var26.f_29927 * f_29993 * f_29994) << 24);
            }

            Class_uYlA2bjVcAq54Bqy.m_9218(var18, false, null, false);
            var18 = Class_uYlA2bjVcAq54Bqy.m_9213(true, false);

            for (CubeField.UINGC6KIoRmEDv06 var27 : this.f_29966) {
               Class_uYlA2bjVcAq54Bqy.m_9211(var18, var27.f_29935, var6 / 2.0F, var7 | (int)(var27.f_29927 * f_29995) << 24);
            }

            Class_uYlA2bjVcAq54Bqy.m_9218(var18, true, null, false);
            var18 = Class_uYlA2bjVcAq54Bqy.m_9213(false, true);

            for (CubeField.UINGC6KIoRmEDv06 var28 : this.f_29966) {
               Class_uYlA2bjVcAq54Bqy.m_9215(var18, var28.f_29936, var6 * f_29996, var7 | (int)(f_29997 * var28.f_29927) << 24);
            }

            Class_uYlA2bjVcAq54Bqy.m_9218(var18, false, Class_uYlA2bjVcAq54Bqy.f_33138, false);
            var18 = Class_uYlA2bjVcAq54Bqy.m_9213(false, true);

            for (CubeField.UINGC6KIoRmEDv06 var29 : this.f_29966) {
               Class_uYlA2bjVcAq54Bqy.m_9215(var18, var29.f_29936, var6 * f_29998, var7 | (int)(f_29999 * var29.f_29927) << 24);
            }

            Class_uYlA2bjVcAq54Bqy.m_9218(var18, false, Class_uYlA2bjVcAq54Bqy.f_33139, false);
         }
      }
   }

   public CubeField() {
      super(f_29972, f_29973, Category.RENDER);
      this.f_29953 = new MultiChoiceSetting(f_29974, new Class_2ZaVm8TGDJ68TnJB(f_29975), new Class_2ZaVm8TGDJ68TnJB(f_29976));
      this.f_29954 = new ColorSetting(f_29977, false, f_29978).m_822(() -> this.f_29953.m_7568(f_30008));
      this.f_29955 = new SliderSetting(f_29979, f_29980, 1.0F, f_29981).m_828(1.0F);
      this.f_29956 = new SliderSetting(f_29982, f_29983, f_29984, f_29985).m_828(f_29986);
      this.f_29964 = new Random();
      this.f_29965 = new ArrayList<>();
      this.f_29966 = new ArrayList<>();
      this.f_29968 = var1 -> {
         if (this.f_29967 != f_11537.level) {
            this.m_8350();
            this.f_29967 = f_11537.level;
         }
      };
      this.f_29969 = this::m_8349;
      this.f_29970 = this::m_8344;
      this.f_29971 = var1 -> this.f_29965.forEach(CubeField.UINGC6KIoRmEDv06::m_8335);
      this.m_795(this.f_29953, this.f_29954, this.f_29955, this.f_29956);
   }

   @Override
   public void m_732() {
      this.m_8350();
   }

   private Vec3 m_8346(BlockPos var1, Vec3 var2) {
      double var3 = f_30000;
      double var5 = var3 / f_30001;

      for (int var7 = 64; var7 > 0; var7--) {
         Vec3 var8 = new Vec3(var1.getX() + this.f_29964.nextDouble(), var1.getY() + this.f_29964.nextDouble(), var1.getZ() + this.f_29964.nextDouble());
         double var9 = var8.distanceTo(var2);
         if (var9 >= f_30002 && var9 <= f_30003) {
            double var11 = Math.floor(var8.x * f_30004) / f_30005 + var5;
            double var13 = Math.floor(var8.y) + var5 - var3;
            double var15 = Math.floor(var8.z * f_30006) / f_30007 + var5;
            return new Vec3(var11, var13, var15);
         }
      }

      return null;
   }

   private boolean m_8347(BlockPos var1) {
      if (f_11537.level == null) {
         return false;
      } else if (!f_11537.level.isEmptyBlock(var1)) {
         return false;
      } else {
         return f_11537.level.isEmptyBlock(var1.below()) ? false : f_11537.level.getEntities(null, new AABB(var1)).isEmpty();
      }
   }

   private void m_8349(Class_Xu9btcIeUN33XnMK var1) {
      if (this.f_29967 != f_11537.level) {
         this.m_8350();
         this.f_29967 = f_11537.level;
      }

      if (f_11537.player != null && f_11537.level != null) {
         Vec3 var2 = f_11537.player.position();
         List var3 = this.m_8342(var2, f_29987, f_29988, 3);

         for (int var4 = 0; var4 < this.f_29955.m_8768().intValue() && !var3.isEmpty(); var4++) {
            Vec3 var5 = this.m_8346((BlockPos)var3.get(this.f_29964.nextInt(var3.size())), var2);
            if (var5 != null) {
               this.f_29965.add(new CubeField.UINGC6KIoRmEDv06(var5));
            }
         }

         this.f_29965.forEach(CubeField.UINGC6KIoRmEDv06::m_8340);
         this.f_29965.removeIf(CubeField.UINGC6KIoRmEDv06::m_8337);
      }
   }

   public void m_8350() {
      this.f_29965.clear();
      this.f_29966.clear();
      this.f_29967 = null;
   }

   private class UINGC6KIoRmEDv06 {
      public final Vec3 f_29925;
      public final long f_29926 = System.currentTimeMillis();
      public float f_29927;
      public int f_29928 = 0;
      public int f_29929 = 0;
      public int f_29930 = 0;
      public int f_29931 = 0;
      public double f_29932 = 0.0;
      public boolean f_29933 = false;
      public long f_29934 = 0L;
      public final Matrix4f f_29935 = new Matrix4f();
      public final Matrix4f f_29936 = new Matrix4f();
      public static final double f_29938 = 6.0;
      public static final float f_29939 = 14.0F;
      public static final float f_29940 = 0.5F;
      public static final float f_29941 = 0.5F;
      public static final double f_29942 = 16.0;
      public static final float f_29943 = 2000.0F;
      public static final float f_29944 = 400.0F;
      public static final float f_29945 = 0.1F;
      public static final float f_29946 = 0.1F;
      public static final float f_29947 = 0.8F;
      public static final float f_29948 = 0.8F;
      public static final float f_29949 = 0.2F;
      public static final float f_29950 = 0.5F;
      public static final double f_29951 = 2.0;
      public static final float f_29952 = 0.01F;

      public UINGC6KIoRmEDv06(Vec3 var2) {
         this.f_29925 = var2;
      }

      public void m_8335() {
         if (this.f_29928 <= 0) {
            this.f_29930 = this.f_29928 = (int)(f_29939 * (f_29940 + f_29941 * CubeField.this.f_29964.nextFloat()));
            this.f_29932 = (2 + CubeField.this.f_29964.nextInt(11)) / f_29942;
            this.f_29931 = CubeField.f_29963[CubeField.this.f_29964.nextInt(CubeField.f_29963.length)];
         }
      }

      public float m_8336() {
         float var1 = this.m_8341();
         float var2 = var1 < f_29945 ? var1 / f_29946 : (var1 > f_29947 ? 1.0F - (var1 - f_29948) / f_29949 : 1.0F);
         return Mth.clamp(var2, 0.0F, 1.0F) * this.m_8339();
      }

      public boolean m_8337() {
         return this.m_8341() >= 1.0F || this.f_29933 && this.m_8339() <= f_29952;
      }

      public double m_8338(float var1) {
         if (this.f_29930 <= 0) {
            return 0.0;
         }

         float var2 = Mth.lerp(var1, this.f_29929, this.f_29928) / this.f_29930;
         if (var2 > f_29950) {
            var2 = 1.0F - var2;
         }

         return var2 * f_29951 * this.f_29932;
      }

      public float m_8339() {
         return !this.f_29933 ? 1.0F : Mth.clamp(1.0F - (float)(System.currentTimeMillis() - this.f_29934) / f_29944, 0.0F, 1.0F);
      }

      public void m_8340() {
         this.f_29929 = this.f_29928;
         if (this.f_29928 > 0) {
            this.f_29928--;
         }

         if (Class_NzJrN63M7QBpmAbi.f_11537.player != null
            && Class_NzJrN63M7QBpmAbi.f_11537.player.position().distanceTo(this.f_29925) > f_29938
            && !this.f_29933) {
            this.f_29933 = true;
            this.f_29934 = System.currentTimeMillis();
         }
      }

      public float m_8341() {
         return Mth.clamp((float)(System.currentTimeMillis() - this.f_29926) / f_29943, 0.0F, 1.0F);
      }
   }
}
