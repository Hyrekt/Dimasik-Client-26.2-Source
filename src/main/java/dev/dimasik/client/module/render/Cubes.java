package dev.dimasik.client.module.render;

import com.mojang.blaze3d.IndexType;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.AutoStorageIndexBuffer;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.MeshData;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.MeshData.DrawState;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_PoKta0VE7AdhY1En;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_wjdoxQGtI8mFyL6U;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Random;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;

public class Cubes extends Module {
   private static final Identifier f_2859 = Identifier.fromNamespaceAndPath(Cubes.f_3021, Cubes.f_3022);
   private static final float f_2860 = 12.0F;
   private static final float f_2861 = 0.18F;
   private static final float f_2862 = 0.25F;
   private static final float f_2863 = 1.7F;
   private static final float f_2864 = 900.0F;
   private static final long f_2865 = 65536L;
   private static final byte[][] f_2866 = new byte[][]{
      {-1, -1, -1, 1, -1, -1},
      {1, -1, -1, 1, -1, 1},
      {1, -1, 1, -1, -1, 1},
      {-1, -1, 1, -1, -1, -1},
      {-1, 1, -1, 1, 1, -1},
      {1, 1, -1, 1, 1, 1},
      {1, 1, 1, -1, 1, 1},
      {-1, 1, 1, -1, 1, -1},
      {-1, -1, -1, -1, 1, -1},
      {1, -1, -1, 1, 1, -1},
      {1, -1, 1, 1, 1, 1},
      {-1, -1, 1, -1, 1, 1}
   };
   private static final byte[][] f_2867 = new byte[][]{{0, 1}, {0, 2}, {0, 3}, {0, 4}, {1, 2}, {2, 3}, {3, 4}, {4, 1}};
   private static final float[] f_2868 = new float[]{Cubes.f_3023, Cubes.f_3024, Cubes.f_3025};
   private static final float[] f_2869 = new float[]{Cubes.f_3026, Cubes.f_3027, Cubes.f_3028};
   private final MultiChoiceSetting f_2870;
   private final MultiChoiceSetting f_2871;
   private final SliderSetting f_2872;
   private final SliderSetting f_2873;
   private final SliderSetting f_2874;
   private final List<Cubes.eDnovN265gWWaUp3> f_2875;
   private final List<Cubes.eDnovN265gWWaUp3> f_2876;
   private final Random f_2877;
   private boolean f_2878;
   private float f_2879;
   private float f_2880;
   private float f_2881;
   private int f_2882;
   private int f_2883;
   private ClientLevel f_2884;
   private final GpuBuffer[] f_2885;
   private final long[] f_2886;
   private float f_2887;
   private float[] f_2888;
   private float[] f_2889;
   private final RenderPipeline f_2890;
   private final RenderPipeline f_2891;
   private final RenderPipeline f_2892;
   private final RenderPipeline f_2893;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_2894;
   private final Class_gEPk7yDw6CwIte87<Class_wjdoxQGtI8mFyL6U> f_2895;
   private static final String f_2896 = "Cubes";
   private static final String f_2897 = "Парящие кубы и треугольники вокруг игрока";
   private static final String f_2898 = "Анимация";
   private static final String f_2899 = "Разлет";
   private static final String f_2900 = "Падение";
   private static final String f_2901 = "Форма";
   private static final String f_2902 = "Кубы";
   private static final String f_2903 = "Треугольники";
   private static final String f_2904 = "Количество";
   private static final float f_2905 = 30.0F;
   private static final float f_2906 = 5.0F;
   private static final float f_2907 = 1000.0F;
   private static final String f_2908 = "Размер";
   private static final float f_2909 = 0.1F;
   private static final float f_2910 = 3.0F;
   private static final float f_2911 = 0.1F;
   private static final String f_2912 = "Скорость";
   private static final float f_2913 = 0.1F;
   private static final float f_2914 = 5.0F;
   private static final float f_2915 = 0.1F;
   private static final int f_2916 = Integer.MIN_VALUE;
   private static final String f_2917 = "dimasik/cubes_glow";
   private static final String f_2918 = "dead_chams";
   private static final String f_2919 = "dead_chams";
   private static final String f_2920 = "Sampler0";
   private static final String f_2921 = "dimasik/cubes_faces";
   private static final String f_2922 = "target_esp_crystal";
   private static final String f_2923 = "target_esp_crystal";
   private static final String f_2924 = "dimasik/cubes_triangle_faces";
   private static final String f_2925 = "target_esp_crystal";
   private static final String f_2926 = "target_esp_crystal";
   private static final String f_2927 = "dimasik/cubes_edges";
   private static final String f_2928 = "target_esp_crystal";
   private static final String f_2929 = "cubes_edges";
   private static final double f_2930 = Double.MAX_VALUE;
   private static final double f_2931 = 128.0;
   private static final double f_2932 = 1.32;
   private static final double f_2933 = 0.08;
   private static final double f_2934 = 0.02;
   private static final float f_2935 = 0.25F;
   private static final float f_2936 = 12.0F;
   private static final String f_2937 = "Падение";
   private static final double f_2938 = 6.25;
   private static final float f_2939 = 0.06F;
   private static final double f_2940 = 0.0024F;
   private static final float f_2941 = 0.8F;
   private static final double f_2942 = 0.002F;
   private static final float f_2943 = 8.0E-5F;
   private static final float f_2944 = -0.032F;
   private static final float f_2945 = 0.2F;
   private static final float f_2946 = 0.2F;
   private static final float f_2947 = 0.2F;
   private static final float f_2948 = 0.995F;
   private static final float f_2949 = 0.995F;
   private static final float f_2950 = 0.995F;
   private static final double f_2951 = 2.5;
   private static final float f_2952 = 0.18F;
   private static final float f_2953 = 1.7F;
   private static final float f_2954 = 255.0F;
   private static final float f_2955 = 255.0F;
   private static final float f_2956 = 255.0F;
   private static final double f_2957 = 900.0;
   private static final double f_2958 = -1.0;
   private static final float f_2959 = 0.001F;
   private static final String f_2960 = "Кубы";
   private static final float f_2961 = 0.5F;
   private static final String f_2962 = "cubesGlow";
   private static final float f_2963 = 20.0F;
   private static final float f_2964 = 0.4F;
   private static final float f_2965 = 0.001F;
   private static final String f_2966 = "cubesFaces";
   private static final float f_2967 = 0.4F;
   private static final float f_2968 = 0.001F;
   private static final String f_2969 = "cubesTriangleFaces";
   private static final float f_2970 = 0.0025F;
   private static final float f_2971 = 0.866F;
   private static final float f_2972 = 0.5F;
   private static final float f_2973 = 0.5F;
   private static final float f_2974 = 0.5F;
   private static final float f_2975 = 0.5F;
   private static final String f_2976 = "cubesEdges";
   private static final String f_2977 = "cubesTriangleEdges";
   private static final float f_2978 = 1.5F;
   private static final float f_2979 = 1.5F;
   private static final float f_2980 = 1.5F;
   private static final float f_2981 = 1.5F;
   private static final float f_2982 = 1.5F;
   private static final float f_2983 = 1.5F;
   private static final float f_2984 = 0.3F;
   private static final float f_2985 = 0.25F;
   private static final float f_2986 = 0.866F;
   private static final float f_2987 = 0.001F;
   private static final float f_2988 = 12.0F;
   private static final String f_2989 = "Падение";
   private static final double f_2990 = 2.0;
   private static final double f_2991 = 4.0;
   private static final double f_2992 = 0.55;
   private static final double f_2993 = 2.0;
   private static final double f_2994 = 0.8;
   private static final double f_2995 = 2.0;
   private static final float f_2996 = 0.5F;
   private static final float f_2997 = 0.008F;
   private static final float f_2998 = -0.012F;
   private static final float f_2999 = 0.012F;
   private static final float f_3000 = 0.5F;
   private static final float f_3001 = 0.008F;
   private static final float f_3002 = 360.0F;
   private static final float f_3003 = 0.01F;
   private static final float f_3004 = 0.02F;
   private static final float f_3005 = 0.5F;
   private static final float f_3006 = 0.01F;
   private static final float f_3007 = 360.0F;
   private static final float f_3008 = 360.0F;
   private static final float f_3009 = 360.0F;
   private static final float f_3010 = 0.5F;
   private static final float f_3011 = 1.5F;
   private static final float f_3012 = 0.5F;
   private static final float f_3013 = 1.5F;
   private static final float f_3014 = 0.5F;
   private static final float f_3015 = 1.5F;
   private static final double f_3016 = Math.PI;
   private static final double f_3017 = 2.0;
   private static final float f_3018 = 10.0F;
   private static final String f_3019 = "Sampler0";
   private static final long f_3020 = 65536L;
   private static final String f_3021 = "dimasik";
   private static final String f_3022 = "images/fireflies/bloom.png";
   private static final float f_3023 = 10.0F;
   private static final float f_3024 = 6.0F;
   private static final float f_3025 = 3.5F;
   private static final float f_3026 = 0.06F;
   private static final float f_3027 = 0.14F;
   private static final float f_3028 = 0.25F;

   private int m_1548(BufferBuilder var1, Matrix4f var2, float var3, float var4) {
      this.m_1555(var1, var2, -var3, -var3, var3, 0.0F, 0.0F, var4);
      this.m_1555(var1, var2, var3, -var3, var3, 1.0F, 0.0F, var4);
      this.m_1555(var1, var2, var3, var3, var3, 1.0F, 1.0F, var4);
      this.m_1555(var1, var2, -var3, var3, var3, 0.0F, 1.0F, var4);
      this.m_1555(var1, var2, var3, -var3, -var3, 0.0F, 0.0F, var4);
      this.m_1555(var1, var2, -var3, -var3, -var3, 1.0F, 0.0F, var4);
      this.m_1555(var1, var2, -var3, var3, -var3, 1.0F, 1.0F, var4);
      this.m_1555(var1, var2, var3, var3, -var3, 0.0F, 1.0F, var4);
      this.m_1555(var1, var2, -var3, var3, var3, 0.0F, 0.0F, var4);
      this.m_1555(var1, var2, var3, var3, var3, 1.0F, 0.0F, var4);
      this.m_1555(var1, var2, var3, var3, -var3, 1.0F, 1.0F, var4);
      this.m_1555(var1, var2, -var3, var3, -var3, 0.0F, 1.0F, var4);
      this.m_1555(var1, var2, -var3, -var3, -var3, 0.0F, 0.0F, var4);
      this.m_1555(var1, var2, var3, -var3, -var3, 1.0F, 0.0F, var4);
      this.m_1555(var1, var2, var3, -var3, var3, 1.0F, 1.0F, var4);
      this.m_1555(var1, var2, -var3, -var3, var3, 0.0F, 1.0F, var4);
      this.m_1555(var1, var2, var3, -var3, var3, 0.0F, 0.0F, var4);
      this.m_1555(var1, var2, var3, -var3, -var3, 1.0F, 0.0F, var4);
      this.m_1555(var1, var2, var3, var3, -var3, 1.0F, 1.0F, var4);
      this.m_1555(var1, var2, var3, var3, var3, 0.0F, 1.0F, var4);
      this.m_1555(var1, var2, -var3, -var3, -var3, 0.0F, 0.0F, var4);
      this.m_1555(var1, var2, -var3, -var3, var3, 1.0F, 0.0F, var4);
      this.m_1555(var1, var2, -var3, var3, var3, 1.0F, 1.0F, var4);
      this.m_1555(var1, var2, -var3, var3, -var3, 0.0F, 1.0F, var4);
      return 24;
   }

   private void m_1549(float var1, CommandEncoder var2) {
      if (this.m_1574()) {
         BufferBuilder var3 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.TRIANGLES, DefaultVertexFormat.POSITION_TEX_COLOR);
         int var4 = 0;
         int var5 = this.f_2876.size();

         for (int var6 = 0; var6 < var5; var6++) {
            Cubes.eDnovN265gWWaUp3 var7 = this.f_2876.get(var6);
            float var8 = var7.f_2854 * f_2967;
            if (!(var8 <= f_2968)) {
               var4 += this.m_1560(var3, var7.f_2855, var1, var8);
            }
         }

         this.m_1571(var3, var4, this.f_2892, f_2969, var2);
      }
   }

   private void m_1550(float var1, CommandEncoder var2) {
      if (this.m_1574()) {
         BufferBuilder var3 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
         int var4 = 0;
         int var5 = this.f_2876.size();

         for (int var6 = 0; var6 < var5; var6++) {
            Cubes.eDnovN265gWWaUp3 var7 = this.f_2876.get(var6);
            float var8 = var7.f_2854 * f_2964;
            if (!(var8 <= f_2965)) {
               var4 += this.m_1548(var3, var7.f_2855, var1, var8);
            }
         }

         this.m_1571(var3, var4, this.f_2891, f_2966, var2);
      }
   }

   private void m_1551(float var1, float var2, CommandEncoder var3) {
      BufferBuilder var4 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
      byte var5 = 0;
      int var6 = this.f_2876.size();

      for (int var7 = 0; var7 < var6; var7++) {
         Cubes.eDnovN265gWWaUp3 var8 = this.f_2876.get(var7);
         float var9 = var8.f_2854;
         Matrix4f var10 = var8.f_2856;

         for (int var11 = 0; var11 < 3; var11++) {
            float var12 = var1 * f_2868[var11] * var2;
            float var13 = var9 * f_2869[var11] * var2;
            float var14 = var12 * f_2961;
            var4.addVertex(var10, -var14, var14, 0.0F).setUv(0.0F, 1.0F).setColor(this.f_2879, this.f_2880, this.f_2881, var13);
            var4.addVertex(var10, var14, var14, 0.0F).setUv(1.0F, 1.0F).setColor(this.f_2879, this.f_2880, this.f_2881, var13);
            var4.addVertex(var10, var14, -var14, 0.0F).setUv(1.0F, 0.0F).setColor(this.f_2879, this.f_2880, this.f_2881, var13);
            var4.addVertex(var10, -var14, -var14, 0.0F).setUv(0.0F, 0.0F).setColor(this.f_2879, this.f_2880, this.f_2881, var13);
            var5 += 4;
         }
      }

      this.m_1577(var4, f_2859, var5, this.f_2890, f_2962, var3);
   }

   private float m_1552(int var1, float var2) {
      if (var1 == 1 || var1 == 2) {
         return var2;
      } else {
         return var1 != 3 && var1 != 4 ? 0.0F : -var2;
      }
   }

   private int m_1553(BufferBuilder var1, Matrix4f var2, float[] var3, float var4, float var5, float var6, float var7) {
      for (int var8 = 0; var8 < var3.length; var8 += 6) {
         var1.addVertex(var2, var3[var8], var3[var8 + 1], var3[var8 + 2]).setUv(0.0F, 0.0F).setColor(var4, var5, var6, var7);
         var1.addVertex(var2, var3[var8 + 3], var3[var8 + 4], var3[var8 + 5]).setUv(1.0F, 1.0F).setColor(var4, var5, var6, var7);
      }

      return var3.length / 3;
   }

   private int m_1554(BufferBuilder var1, Matrix4f var2, float var3, float var4) {
      float var5 = Math.min(1.0F, this.f_2879 * f_2981);
      float var6 = Math.min(1.0F, this.f_2880 * f_2982);
      float var7 = Math.min(1.0F, this.f_2881 * f_2983);
      this.m_1569(var3);
      return this.m_1553(var1, var2, this.f_2889, var5, var6, var7, var4);
   }

   private void m_1555(BufferBuilder var1, Matrix4f var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      var1.addVertex(var2, var3, var4, var5).setUv(var6, var7).setColor(this.f_2879, this.f_2880, this.f_2881, var8);
   }

   @Override
   public void m_778() {
      this.f_2875.clear();
      this.f_2876.clear();
      this.f_2878 = false;
      this.f_2883 = 0;
   }

   private void m_1557(ArrayList<Float> var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      float var10 = var5 - var2;
      float var11 = var6 - var3;
      float var12 = var7 - var4;
      float var13 = Mth.sqrt(var10 * var10 + var11 * var11 + var12 * var12);
      if (!(var13 < f_2987)) {
         float var14 = var10 / var13;
         float var15 = var11 / var13;
         float var16 = var12 / var13;
         float var17 = 0.0F;

         for (boolean var18 = true; var17 < var13; var18 = !var18) {
            float var19 = var18 ? var8 : var9;
            float var20 = Math.min(var17 + var19, var13);
            if (var18) {
               var1.add(var2 + var14 * var17);
               var1.add(var3 + var15 * var17);
               var1.add(var4 + var16 * var17);
               var1.add(var2 + var14 * var20);
               var1.add(var3 + var15 * var20);
               var1.add(var4 + var16 * var20);
            }

            var17 = var20;
         }
      }
   }

   private void m_1558() {
      for (int var1 = 0; var1 < this.f_2885.length; var1++) {
         GpuBuffer var2 = this.f_2885[var1];
         if (var2 != null && !var2.isClosed()) {
            var2.close();
         }

         this.f_2885[var1] = null;
         this.f_2886[var1] = 0L;
      }
   }

   private void m_1559(Class_TZhU50s8XmBQCMP5 var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (this.f_2884 != null && this.f_2884 != f_11537.level) {
            this.f_2875.clear();
         }

         this.f_2884 = f_11537.level;
         if (f_11537.player.tickCount == 1) {
            this.f_2875.clear();
         }

         boolean var2 = f_11537.options.keyAttack.isDown();
         if (var2 && !this.f_2878) {
            this.m_1570();
         }

         this.f_2878 = var2;
         this.f_2883++;
         if (this.f_2883 % 2 == 0) {
            this.m_1575();
         }

         this.m_1566(var1);
      } else {
         this.f_2875.clear();
         this.f_2884 = null;
      }
   }

   private int m_1560(BufferBuilder var1, Matrix4f var2, float var3, float var4) {
      float var5 = var3;
      float var6 = -var3;
      float var7 = var3 * f_2971;
      this.m_1555(var1, var2, 0.0F, var5, 0.0F, f_2972, 1.0F, var4);
      this.m_1555(var1, var2, -var7, var6, var7, 0.0F, 0.0F, var4);
      this.m_1555(var1, var2, var7, var6, var7, 1.0F, 0.0F, var4);
      this.m_1555(var1, var2, 0.0F, var5, 0.0F, f_2973, 1.0F, var4);
      this.m_1555(var1, var2, var7, var6, var7, 0.0F, 0.0F, var4);
      this.m_1555(var1, var2, var7, var6, -var7, 1.0F, 0.0F, var4);
      this.m_1555(var1, var2, 0.0F, var5, 0.0F, f_2974, 1.0F, var4);
      this.m_1555(var1, var2, var7, var6, -var7, 0.0F, 0.0F, var4);
      this.m_1555(var1, var2, -var7, var6, -var7, 1.0F, 0.0F, var4);
      this.m_1555(var1, var2, 0.0F, var5, 0.0F, f_2975, 1.0F, var4);
      this.m_1555(var1, var2, -var7, var6, -var7, 0.0F, 0.0F, var4);
      this.m_1555(var1, var2, -var7, var6, var7, 1.0F, 0.0F, var4);
      this.m_1555(var1, var2, -var7, var6, var7, 0.0F, 0.0F, var4);
      this.m_1555(var1, var2, var7, var6, var7, 1.0F, 0.0F, var4);
      this.m_1555(var1, var2, var7, var6, -var7, 1.0F, 1.0F, var4);
      this.m_1555(var1, var2, -var7, var6, var7, 0.0F, 0.0F, var4);
      this.m_1555(var1, var2, var7, var6, -var7, 1.0F, 1.0F, var4);
      this.m_1555(var1, var2, -var7, var6, -var7, 0.0F, 1.0F, var4);
      return 18;
   }

   private GpuBuffer m_1561(int var1, int var2, String var3) {
      GpuBuffer var4 = this.f_2885[var1];
      if (var4 != null && !var4.isClosed() && this.f_2886[var1] >= var2) {
         return var4;
      }

      if (var4 != null && !var4.isClosed()) {
         var4.close();
      }

      long var5 = f_3020;

      while (var5 < var2) {
         var5 <<= 1;
      }

      var4 = RenderSystem.getDevice().createBuffer(() -> var3 + "", 40, var5);
      this.f_2885[var1] = var4;
      this.f_2886[var1] = var5;
      return var4;
   }

   private static float[] m_1562(ArrayList<Float> var0) {
      float[] var1 = new float[var0.size()];

      for (int var2 = 0; var2 < var0.size(); var2++) {
         var1[var2] = (Float)var0.get(var2);
      }

      return var1;
   }

   private int m_1564(BufferBuilder var1, Matrix4f var2, float var3, float var4) {
      float var5 = Math.min(1.0F, this.f_2879 * f_2978);
      float var6 = Math.min(1.0F, this.f_2880 * f_2979);
      float var7 = Math.min(1.0F, this.f_2881 * f_2980);
      this.m_1569(var3);
      return this.m_1553(var1, var2, this.f_2888, var5, var6, var7, var4);
   }

   public Cubes() {
      super(f_2896, f_2897, Category.RENDER);
      this.f_2870 = new MultiChoiceSetting(f_2898, new Class_2ZaVm8TGDJ68TnJB(f_2899), new Class_2ZaVm8TGDJ68TnJB(f_2900));
      this.f_2871 = new MultiChoiceSetting(f_2901, new Class_2ZaVm8TGDJ68TnJB(f_2902), new Class_2ZaVm8TGDJ68TnJB(f_2903));
      this.f_2872 = new SliderSetting(f_2904, f_2905, f_2906, f_2907).m_828(1.0F);
      this.f_2873 = new SliderSetting(f_2908, 1.0F, f_2909, f_2910).m_828(f_2911);
      this.f_2874 = new SliderSetting(f_2912, 1.0F, f_2913, f_2914).m_828(f_2915);
      this.f_2875 = new ArrayList<>();
      this.f_2876 = new ArrayList<>();
      this.f_2877 = new Random();
      this.f_2882 = f_2916;
      this.f_2885 = new GpuBuffer[3];
      this.f_2886 = new long[3];
      this.f_2887 = Float.NaN;
      this.f_2888 = new float[0];
      this.f_2889 = new float[0];
      this.f_2890 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_2917)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_2918))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_2919))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.ADDITIVE)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2741(f_2920)
         .m_2722();
      this.f_2891 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_2921)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_2922))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_2923))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2722();
      this.f_2892 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_2924)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_2925))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_2926))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.TRIANGLES)
         .m_2722();
      this.f_2893 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_2927)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_2928))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_2929))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.ADDITIVE)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.DEBUG_LINES)
         .m_2722();
      this.f_2894 = this::m_1559;
      this.f_2895 = this::m_1568;
      this.m_795(this.f_2870, this.f_2871, this.f_2872, this.f_2873, this.f_2874);
   }

   private void m_1565(float var1, CommandEncoder var2) {
      BufferBuilder var3 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.DEBUG_LINES, DefaultVertexFormat.POSITION_TEX_COLOR);
      int var4 = 0;
      int var5 = this.f_2876.size();

      for (int var6 = 0; var6 < var5; var6++) {
         Cubes.eDnovN265gWWaUp3 var7 = this.f_2876.get(var6);
         var4 += this.m_1554(var3, var7.f_2855, var1, var7.f_2854);
      }

      this.m_1571(var3, var4, this.f_2893, f_2977, var2);
   }

   private void m_1566(Class_TZhU50s8XmBQCMP5 var1) {
      if (f_11537.player != null) {
         PoseStack var2 = var1.m_5006();
         Vec3 var3 = var1.m_5010();
         double var4 = var3.x;
         double var6 = var3.y;
         double var8 = var3.z;
         float var10 = f_2952 * this.f_2873.m_8768();
         float var11 = f_2953;
         int var12 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
         if (var12 != this.f_2882) {
            this.f_2882 = var12;
            this.f_2879 = (var12 >> 16 & 0xFF) / f_2954;
            this.f_2880 = (var12 >> 8 & 0xFF) / f_2955;
            this.f_2881 = (var12 & 0xFF) / f_2956;
         }

         this.f_2876.clear();
         Camera var13 = f_11537.gameRenderer.mainCamera();
         float var14 = (float)Math.toRadians(var13.yRot());
         float var15 = (float)Math.toRadians(var13.xRot());
         double var16 = -Mth.sin(var14) * Mth.cos(var15);
         double var18 = -Mth.sin(var15);
         double var20 = Mth.cos(var14) * Mth.cos(var15);
         int var22 = this.f_2875.size();

         for (int var23 = 0; var23 < var22; var23++) {
            Cubes.eDnovN265gWWaUp3 var24 = this.f_2875.get(var23);
            double var25 = var24.f_2840 - var4;
            double var27 = var24.f_2841 - var6;
            double var29 = var24.f_2842 - var8;
            double var31 = var25 * var25 + var27 * var27 + var29 * var29;
            if (!(var31 > f_2957) && !(var25 * var16 + var27 * var18 + var29 * var20 < f_2958)) {
               var24.f_2854 = this.m_1576(var24);
               if (!(var24.f_2854 <= f_2959)) {
                  var24.f_2855
                     .set(var2.last().pose())
                     .translate((float)var25, (float)var27, (float)var29)
                     .rotateX((float)Math.toRadians(var24.f_2846))
                     .rotateY((float)Math.toRadians(var24.f_2847))
                     .rotateZ((float)Math.toRadians(var24.f_2848));
                  var24.f_2856
                     .set(var2.last().pose())
                     .translate((float)var25, (float)var27, (float)var29)
                     .rotateY((float)Math.toRadians(-var13.yRot()))
                     .rotateX((float)Math.toRadians(var13.xRot()));
                  this.f_2876.add(var24);
               }
            }
         }

         if (!this.f_2876.isEmpty()) {
            CommandEncoder var33 = RenderSystem.getDevice().createCommandEncoder();
            this.m_1551(var10, var11, var33);
            boolean var34 = this.f_2871.m_7568(f_2960);
            if (var34) {
               this.m_1550(var10, var33);
               this.m_1572(var10, var33);
            } else {
               this.m_1549(var10, var33);
               this.m_1565(var10, var33);
            }
         }
      }
   }

   private void m_1568(Class_wjdoxQGtI8mFyL6U var1) {
      if (var1.m_9372() == Class_wjdoxQGtI8mFyL6U.Class_327mRdjAqNoPaemJ.PRE) {
         this.m_1570();
      }
   }

   private void m_1569(float var1) {
      if (Float.compare(this.f_2887, var1) != 0) {
         this.f_2887 = var1;
         ArrayList var2 = new ArrayList();
         float var3 = var1 * f_2984;
         float var4 = var1 * f_2985;

         for (byte[] var8 : f_2866) {
            this.m_1557(var2, var8[0] * var1, var8[1] * var1, var8[2] * var1, var8[3] * var1, var8[4] * var1, var8[5] * var1, var3, var4);
         }

         this.f_2888 = m_1562(var2);
         ArrayList var15 = new ArrayList();
         float var16 = var1;
         float var17 = -var1;
         float var18 = var1 * f_2986;

         for (byte[] var12 : f_2867) {
            byte var13 = var12[0];
            byte var14 = var12[1];
            this.m_1557(
               var15,
               this.m_1578(var13, var18),
               var13 == 0 ? var16 : var17,
               this.m_1552(var13, var18),
               this.m_1578(var14, var18),
               var14 == 0 ? var16 : var17,
               this.m_1552(var14, var18),
               var3,
               var4
            );
         }

         this.f_2889 = m_1562(var15);
      }
   }

   @Override
   public void m_732() {
      this.f_2875.clear();
      this.f_2876.clear();
      this.f_2884 = null;
      this.m_1558();
   }

   private void m_1570() {
      Camera var1 = f_11537.gameRenderer.mainCamera();
      if (!this.f_2875.isEmpty() && var1 != null) {
         Vec3 var2 = var1.position();
         double var3 = var2.x;
         double var5 = var2.y;
         double var7 = var2.z;
         float var9 = (float)Math.toRadians(var1.yRot());
         float var10 = (float)Math.toRadians(var1.xRot());
         double var11 = -Mth.sin(var9) * Mth.cos(var10);
         double var13 = -Mth.sin(var10);
         double var15 = Mth.cos(var9) * Mth.cos(var10);
         Cubes.eDnovN265gWWaUp3 var17 = null;
         double var18 = f_2930;
         int var20 = this.f_2875.size();

         for (int var21 = 0; var21 < var20; var21++) {
            Cubes.eDnovN265gWWaUp3 var22 = this.f_2875.get(var21);
            double var23 = var22.f_2840 - var3;
            double var25 = var22.f_2841 - var5;
            double var27 = var22.f_2842 - var7;
            double var29 = var23 * var11 + var25 * var13 + var27 * var15;
            if (!(var29 < 0.0) && !(var29 > f_2931)) {
               double var31 = var3 + var11 * var29;
               double var33 = var5 + var13 * var29;
               double var35 = var7 + var15 * var29;
               double var37 = var22.f_2840 - var31;
               double var39 = var22.f_2841 - var33;
               double var41 = var22.f_2842 - var35;
               double var43 = var37 * var37 + var39 * var39 + var41 * var41;
               if (!(var43 > f_2932) && !(var29 >= var18)) {
                  var18 = var29;
                  var17 = var22;
               }
            }
         }

         if (var17 != null) {
            double var45 = f_2933 * this.f_2874.m_8768().floatValue();
            var17.f_2843 += (float)(var11 * var45);
            var17.f_2844 = var17.f_2844 + (float)(var13 * var45 + f_2934);
            var17.f_2845 += (float)(var15 * var45);
         }
      }
   }

   private void m_1571(BufferBuilder var1, int var2, RenderPipeline var3, String var4, CommandEncoder var5) {
      MeshData var6 = var1.build();
      if (var6 != null) {
         if (var2 == 0) {
            var6.close();
         } else {
            try {
               DrawState var7 = var6.drawState();
               int var8 = var7.indexCount();
               AutoStorageIndexBuffer var9 = RenderSystem.getSequentialBuffer(var7.primitiveTopology());
               GpuBuffer var10 = var9.getBuffer(var8);
               IndexType var11 = var9.type();
               int var12 = var3 == this.f_2893 ? 2 : 1;
               int var13 = var6.vertexBuffer().remaining();
               GpuBuffer var14 = this.m_1561(var12, var13, var4);
               var5.writeToBuffer(var14.slice(0L, var13), var6.vertexBuffer());
               RenderTarget var15 = f_11537.gameRenderer.mainRenderTarget();
               RenderPass var16 = var5.createRenderPass(
                  () -> var4, var15.getColorTextureView(), Optional.empty(), var15.getDepthTextureView(), OptionalDouble.empty()
               );

               try {
                  RenderSystem.bindDefaultUniforms(var16);
                  var16.setPipeline(var3);
                  var16.setVertexBuffer(0, var14.slice());
                  var16.setIndexBuffer(var10, var11);
                  var16.drawIndexed(var8, 1, 0, 0, 0);
               } catch (Throwable var24) {
                  if (var16 != null) {
                     try {
                        var16.close();
                     } catch (Throwable var23) {
                        var24.addSuppressed(var23);
                     }
                  }

                  throw var24;
               }

               if (var16 != null) {
                  var16.close();
               }
            } finally {
               var6.close();
            }
         }
      }
   }

   private void m_1572(float var1, CommandEncoder var2) {
      BufferBuilder var3 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.DEBUG_LINES, DefaultVertexFormat.POSITION_TEX_COLOR);
      int var4 = 0;
      int var5 = this.f_2876.size();

      for (int var6 = 0; var6 < var5; var6++) {
         Cubes.eDnovN265gWWaUp3 var7 = this.f_2876.get(var6);
         var4 += this.m_1564(var3, var7.f_2855, var1, var7.f_2854);
      }

      this.m_1571(var3, var4, this.f_2893, f_2976, var2);
   }

   private Cubes.eDnovN265gWWaUp3 m_1573() {
      float var1 = f_2988;
      boolean var2 = this.f_2870.m_7568(f_2989);
      int var3 = var2 ? 260 + this.f_2877.nextInt(220) : 420 + this.f_2877.nextInt(420);
      double var4 = f_11537.player.getX() + (this.f_2877.nextDouble() * f_2990 - 1.0) * var1;
      double var6 = var2
         ? f_11537.player.getY() + f_2991 + this.f_2877.nextDouble() * (var1 * f_2992)
         : f_11537.player.getY() + f_2993 + this.f_2877.nextDouble() * (var1 * f_2994);
      double var8 = f_11537.player.getZ() + (this.f_2877.nextDouble() * f_2995 - 1.0) * var1;
      float var10 = this.f_2874.m_8768();
      float var11;
      float var12;
      float var13;
      if (var2) {
         var11 = (this.f_2877.nextFloat() - f_2996) * f_2997 * var10;
         var12 = (f_2998 - this.f_2877.nextFloat() * f_2999) * var10;
         var13 = (this.f_2877.nextFloat() - f_3000) * f_3001 * var10;
      } else {
         float var14 = this.f_2877.nextFloat() * f_3002;
         float var15 = (f_3003 + this.f_2877.nextFloat() * f_3004) * var10;
         var11 = -Mth.sin((float)Math.toRadians(var14)) * var15;
         var13 = Mth.cos((float)Math.toRadians(var14)) * var15;
         var12 = (this.f_2877.nextFloat() - f_3005) * f_3006 * var10;
      }

      return new Cubes.eDnovN265gWWaUp3(
         var4,
         var6,
         var8,
         var11,
         var12,
         var13,
         this.f_2877.nextFloat() * f_3007,
         this.f_2877.nextFloat() * f_3008,
         this.f_2877.nextFloat() * f_3009,
         (this.f_2877.nextFloat() - f_3010) * f_3011,
         (this.f_2877.nextFloat() - f_3012) * f_3013,
         (this.f_2877.nextFloat() - f_3014) * f_3015,
         var3,
         (float)(this.f_2877.nextDouble() * f_3016 * f_3017),
         this.f_2877.nextFloat() * f_3018
      );
   }

   private boolean m_1574() {
      int var1 = this.f_2876.size();

      for (int var2 = 0; var2 < var1; var2++) {
         if (this.f_2876.get(var2).f_2854 > f_2970) {
            return true;
         }
      }

      return false;
   }

   private void m_1575() {
      int var1 = this.f_2872.m_8768().intValue();
      int var2 = this.f_2875.size();
      if (var2 < var1) {
         int var3 = Math.min(var1 - var2, 5);

         for (int var4 = 0; var4 < var3; var4++) {
            this.f_2875.add(this.m_1573());
         }
      } else if (var2 > var1) {
         this.f_2875.subList(var1, var2).clear();
      }

      float var24 = f_2935 * this.f_2874.m_8768();
      float var25 = f_2936;
      boolean var5 = this.f_2870.m_7568(f_2937);
      double var6 = f_11537.player.getX();
      double var8 = f_11537.player.getY();
      double var10 = f_11537.player.getZ();
      double var12 = var25 * var25 * f_2938;

      for (int var14 = this.f_2875.size() - 1; var14 >= 0; var14--) {
         Cubes.eDnovN265gWWaUp3 var15 = this.f_2875.get(var14);
         if (var5) {
            var15.f_2852 = var15.f_2852 + f_2939 * var24;
            var15.f_2840 = var15.f_2840 + (var15.f_2843 * var24 + Math.sin(var15.f_2852 + var15.f_2853) * f_2940 * var24);
            var15.f_2841 = var15.f_2841 + var15.f_2844 * var24;
            var15.f_2842 = var15.f_2842 + (var15.f_2845 * var24 + Math.cos(var15.f_2852 * f_2941 + var15.f_2853) * f_2942 * var24);
            var15.f_2844 = Math.max(var15.f_2844 - f_2943 * var24, f_2944);
            var15.f_2846 = var15.f_2846 + var15.f_2849 * f_2945 * var24;
            var15.f_2847 = var15.f_2847 + var15.f_2850 * f_2946 * var24;
            var15.f_2848 = var15.f_2848 + var15.f_2851 * f_2947 * var24;
         } else {
            var15.f_2840 = var15.f_2840 + var15.f_2843 * var24;
            var15.f_2841 = var15.f_2841 + var15.f_2844 * var24;
            var15.f_2842 = var15.f_2842 + var15.f_2845 * var24;
            var15.f_2846 = var15.f_2846 + var15.f_2849 * var24;
            var15.f_2847 = var15.f_2847 + var15.f_2850 * var24;
            var15.f_2848 = var15.f_2848 + var15.f_2851 * var24;
            var15.f_2843 = var15.f_2843 * f_2948;
            var15.f_2844 = var15.f_2844 * f_2949;
            var15.f_2845 = var15.f_2845 * f_2950;
         }

         var15.f_2857--;
         double var16 = var15.f_2840 - var6;
         double var18 = var15.f_2841 - var8;
         double var20 = var15.f_2842 - var10;
         double var22 = var16 * var16 + var18 * var18 + var20 * var20;
         if (var15.f_2857 <= 0 || var22 > var12 || var5 && var15.f_2841 < var8 - f_2951) {
            this.f_2875.remove(var14);
            this.f_2875.add(this.m_1573());
         }
      }
   }

   private float m_1576(Cubes.eDnovN265gWWaUp3 var1) {
      float var2 = Mth.clamp((float)var1.f_2857 / var1.f_2858, 0.0F, 1.0F);
      float var3 = Math.min(1.0F, (var1.f_2858 - var1.f_2857) / f_2963);
      return var2 * var3;
   }

   private void m_1577(BufferBuilder var1, Identifier var2, int var3, RenderPipeline var4, String var5, CommandEncoder var6) {
      MeshData var7 = var1.build();
      if (var7 != null) {
         if (var3 == 0) {
            var7.close();
         } else {
            try {
               DrawState var8 = var7.drawState();
               int var9 = var8.indexCount();
               AutoStorageIndexBuffer var10 = RenderSystem.getSequentialBuffer(var8.primitiveTopology());
               GpuBuffer var11 = var10.getBuffer(var9);
               IndexType var12 = var10.type();
               int var13 = var7.vertexBuffer().remaining();
               GpuBuffer var14 = this.m_1561(0, var13, var5);
               var6.writeToBuffer(var14.slice(0L, var13), var7.vertexBuffer());
               RenderTarget var15 = f_11537.gameRenderer.mainRenderTarget();
               AbstractTexture var16 = f_11537.getTextureManager().getTexture(var2);
               RenderPass var17 = var6.createRenderPass(
                  () -> var5, var15.getColorTextureView(), Optional.empty(), var15.getDepthTextureView(), OptionalDouble.empty()
               );

               try {
                  RenderSystem.bindDefaultUniforms(var17);
                  var17.setPipeline(var4);
                  var17.bindTexture(f_3019, var16.getTextureView(), var16.getSampler());
                  var17.setVertexBuffer(0, var14.slice());
                  var17.setIndexBuffer(var11, var12);
                  var17.drawIndexed(var9, 1, 0, 0, 0);
               } catch (Throwable var25) {
                  if (var17 != null) {
                     try {
                        var17.close();
                     } catch (Throwable var24) {
                        var25.addSuppressed(var24);
                     }
                  }

                  throw var25;
               }

               if (var17 != null) {
                  var17.close();
               }
            } finally {
               var7.close();
            }
         }
      }
   }

   private float m_1578(int var1, float var2) {
      if (var1 == 1 || var1 == 4) {
         return -var2;
      } else {
         return var1 != 2 && var1 != 3 ? 0.0F : var2;
      }
   }

   private static class eDnovN265gWWaUp3 {
      public double f_2840;
      public double f_2841;
      public double f_2842;
      public float f_2843;
      public float f_2844;
      public float f_2845;
      public float f_2846;
      public float f_2847;
      public float f_2848;
      public float f_2849;
      public float f_2850;
      public float f_2851;
      public float f_2852;
      public float f_2853;
      public float f_2854;
      public final Matrix4f f_2855 = new Matrix4f();
      public final Matrix4f f_2856 = new Matrix4f();
      public int f_2857;
      public int f_2858;

      public eDnovN265gWWaUp3(
         double var1,
         double var3,
         double var5,
         float var7,
         float var8,
         float var9,
         float var10,
         float var11,
         float var12,
         float var13,
         float var14,
         float var15,
         int var16,
         float var17,
         float var18
      ) {
         this.f_2840 = var1;
         this.f_2841 = var3;
         this.f_2842 = var5;
         this.f_2843 = var7;
         this.f_2844 = var8;
         this.f_2845 = var9;
         this.f_2846 = var10;
         this.f_2847 = var11;
         this.f_2848 = var12;
         this.f_2849 = var13;
         this.f_2850 = var14;
         this.f_2851 = var15;
         this.f_2857 = this.f_2858 = var16;
         this.f_2852 = var17;
         this.f_2853 = var18;
      }
   }
}
