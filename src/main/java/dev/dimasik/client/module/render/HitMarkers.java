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
import com.mojang.math.Axis;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ColorSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_5P8vWlw6rRSHv5LV;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_PoKta0VE7AdhY1En;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_wjdoxQGtI8mFyL6U;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.OptionalDouble;
import net.minecraft.client.Camera;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector4f;

public class HitMarkers extends Module {
   private static final Identifier f_6808 = Identifier.fromNamespaceAndPath(HitMarkers.f_7051, HitMarkers.f_7052);
   private static final double f_6809 = 0.3;
   private static final double f_6810 = 0.15;
   private static final double f_6811 = 0.55;
   private static final double f_6812 = 0.5;
   private static final float f_6813 = 0.01F;
   private static final float f_6814 = 0.01F;
   private static final float f_6815 = 0.01F;
   private static final float f_6816 = 1.70158F;
   private static final double f_6817 = 3.0;
   private static final double f_6818 = 2.0;
   private static final float f_6819 = 4.0F;
   private static final float f_6820 = 0.6F;
   private static final float f_6821 = 0.4F;
   private static final float f_6822 = 0.7F;
   private static final float f_6823 = 3.33F;
   private static final float f_6824 = 0.3F;
   private static final float f_6825 = 0.4F;
   private static final float f_6826 = 0.001F;
   private static final float f_6827 = 0.5F;
   private static final float f_6828 = 0.5F;
   private static final float f_6829 = 0.65F;
   private static final float f_6830 = 4.0F;
   private static final float f_6831 = 6.0F;
   private static final float f_6832 = 0.8F;
   private static final float f_6833 = 0.2F;
   private static final float f_6834 = 0.3F;
   private static final float f_6835 = 4.5F;
   private static final float f_6836 = 0.9F;
   private static final float f_6837 = 0.1F;
   private static final float f_6838 = 1.2F;
   private static final float f_6839 = 0.8F;
   private static final float f_6840 = 2.5F;
   private static final int f_6841 = -16777216;
   private static final float f_6842 = 0.5F;
   private static final float f_6843 = 1.85F;
   private static final float f_6844 = 0.25F;
   private static final float f_6845 = 1.25F;
   private static final float f_6846 = 1.15F;
   private static final float f_6847 = 2.2F;
   private static final int f_6848 = -12779716;
   private static final int f_6849 = -50116;
   private static final int f_6850 = -3618616;
   private static final String f_6851 = "MISS";
   private static final float f_6852 = 0.001F;
   private static final String f_6853 = "-%.1f";
   private static final String f_6854 = "+%.1f";
   private static final float f_6855 = 0.01F;
   private static final float f_6856 = 0.001F;
   private static final float f_6857 = 8.0F;
   private static final float f_6858 = 0.6F;
   private static final float f_6859 = 2.5F;
   private static final double f_6860 = 0.3;
   private static final double f_6861 = 0.7;
   private static final float f_6862 = 0.88F;
   private static final float f_6863 = 0.14F;
   private static final float f_6864 = 5.0F;
   private static final float f_6865 = 0.18F;
   private static final float f_6866 = 7.0F;
   private static final float f_6867 = 0.65F;
   private static final float f_6868 = 0.7F;
   private static final float f_6869 = 7.0F;
   private static final float f_6870 = 0.65F;
   private static final float f_6871 = 0.7F;
   private static final float f_6872 = 0.6F;
   private static final float f_6873 = 0.7F;
   private static final float f_6874 = 0.01F;
   private static final int f_6875 = -10128;
   private static final float f_6876 = 0.45F;
   private static final int f_6877 = -16777216;
   private static final float f_6878 = 0.92F;
   private static final float f_6879 = 0.16F;
   private static final float f_6880 = 5.0F;
   private static final float f_6881 = 0.18F;
   private static final int f_6882 = -46518;
   private static final int f_6883 = -10944645;
   private static final float f_6884 = 0.35F;
   private static final int f_6885 = -7286;
   private static final float f_6886 = 0.45F;
   private final MultiChoiceSetting f_6887;
   private final MultiChoiceSetting f_6888;
   private final ColorSetting f_6889;
   private final ColorSetting f_6890;
   private final SliderSetting f_6891;
   private final SliderSetting f_6892;
   private final CheckboxSetting f_6893;
   private final CheckboxSetting f_6894;
   private final List<Class_5P8vWlw6rRSHv5LV> f_6895;
   private final RenderPipeline f_6896;
   private final RenderPipeline f_6897;
   private final Class_gEPk7yDw6CwIte87<Class_wjdoxQGtI8mFyL6U> f_6898;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_6899;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_6900;
   private static final String f_6901 = "HitMarkers";
   private static final String f_6902 = "Маркеры попадания и плавающий урон";
   private static final String f_6903 = "Режим";
   private static final String f_6904 = "3D";
   private static final String f_6905 = "2D";
   private static final String f_6906 = "Текст";
   private static final String f_6907 = "Цвет";
   private static final String f_6908 = "Тема";
   private static final String f_6909 = "Статичный";
   private static final String f_6910 = "По ХП";
   private static final String f_6911 = "Статичный цвет";
   private static final String f_6912 = "Цвет крита";
   private static final String f_6913 = "Размер";
   private static final float f_6914 = 0.45F;
   private static final float f_6915 = 0.15F;
   private static final float f_6916 = 1.2F;
   private static final float f_6917 = 0.05F;
   private static final String f_6918 = "Длительность (мс)";
   private static final float f_6919 = 550.0F;
   private static final float f_6920 = 200.0F;
   private static final float f_6921 = 1500.0F;
   private static final float f_6922 = 50.0F;
   private static final String f_6923 = "Эффект крита";
   private static final String f_6924 = "Плавающий урон";
   private static final String f_6925 = "dimasik/hit_markers_bloom";
   private static final String f_6926 = "dead_chams";
   private static final String f_6927 = "dead_chams";
   private static final String f_6928 = "Sampler0";
   private static final String f_6929 = "dimasik/hit_markers_cross";
   private static final String f_6930 = "sixth_sense";
   private static final String f_6931 = "sixth_sense";
   private static final double f_6932 = 0.3;
   private static final double f_6933 = 0.15;
   private static final double f_6934 = 0.5;
   private static final double f_6935 = 0.55;
   private static final double f_6936 = 0.5;
   private static final double f_6937 = 0.5;
   private static final String f_6938 = "3D";
   private static final float f_6939 = 0.01F;
   private static final float f_6940 = 0.6F;
   private static final float f_6941 = 0.4F;
   private static final float f_6942 = 4.0F;
   private static final float f_6943 = 0.7F;
   private static final float f_6944 = 3.33F;
   private static final float f_6945 = 0.3F;
   private static final float f_6946 = 0.4F;
   private static final String f_6947 = "hitMarkersBloom";
   private static final String f_6948 = "2D";
   private static final String f_6949 = "Текст";
   private static final String f_6950 = "Текст";
   private static final float f_6951 = 0.01F;
   private static final float f_6952 = 4.0F;
   private static final float f_6953 = 6.0F;
   private static final float f_6954 = 0.8F;
   private static final float f_6955 = 0.2F;
   private static final float f_6956 = 0.3F;
   private static final float f_6957 = 4.5F;
   private static final float f_6958 = 0.9F;
   private static final float f_6959 = 0.1F;
   private static final float f_6960 = 1.2F;
   private static final float f_6961 = 0.8F;
   private static final float f_6962 = 0.8F;
   private static final float f_6963 = 2.5F;
   private static final int f_6964 = -16777216;
   private static final float f_6965 = 0.5F;
   private static final float f_6966 = 1.85F;
   private static final float f_6967 = 1.85F;
   private static final float f_6968 = 0.25F;
   private static final float f_6969 = 1.25F;
   private static final float f_6970 = 1.15F;
   private static final float f_6971 = 2.2F;
   private static final String f_6972 = "hitMarkersCross";
   private static final float f_6973 = 8.0F;
   private static final float f_6974 = 0.6F;
   private static final float f_6975 = 2.5F;
   private static final float f_6976 = 0.01F;
   private static final double f_6977 = 0.3;
   private static final double f_6978 = 0.7;
   private static final int f_6979 = -16777216;
   private static final float f_6980 = 0.7F;
   private static final float f_6981 = 0.88F;
   private static final float f_6982 = 0.14F;
   private static final float f_6983 = 5.0F;
   private static final float f_6984 = 0.18F;
   private static final float f_6985 = 7.0F;
   private static final float f_6986 = 0.65F;
   private static final float f_6987 = 0.5F;
   private static final float f_6988 = 0.5F;
   private static final float f_6989 = 0.01F;
   private static final float f_6990 = 0.6F;
   private static final float f_6991 = 0.7F;
   private static final float f_6992 = 0.01F;
   private static final double f_6993 = 0.3;
   private static final double f_6994 = 0.7;
   private static final String f_6995 = "%.1f";
   private static final int f_6996 = -16777216;
   private static final float f_6997 = 0.7F;
   private static final float f_6998 = 0.92F;
   private static final float f_6999 = 0.16F;
   private static final float f_7000 = 5.0F;
   private static final float f_7001 = 0.18F;
   private static final float f_7002 = 7.0F;
   private static final float f_7003 = 0.65F;
   private static final float f_7004 = 0.5F;
   private static final float f_7005 = 0.5F;
   private static final float f_7006 = -0.65F;
   private static final float f_7007 = -0.65F;
   private static final float f_7008 = 0.65F;
   private static final float f_7009 = 0.65F;
   private static final float f_7010 = 0.001F;
   private static final float f_7011 = 0.5F;
   private static final float f_7012 = 0.5F;
   private static final float f_7013 = -1.0F;
   private static final String f_7014 = "Статичный";
   private static final String f_7015 = "По ХП";
   private static final int f_7016 = -46518;
   private static final int f_7017 = -10944645;
   private static final float f_7018 = 0.35F;
   private static final float f_7019 = 0.35F;
   private static final String f_7020 = "Статичный";
   private static final float f_7021 = 0.45F;
   private static final float f_7022 = 0.45F;
   private static final String f_7023 = "MISS";
   private static final int f_7024 = -3618616;
   private static final String f_7025 = "+";
   private static final int f_7026 = -50116;
   private static final String f_7027 = "-";
   private static final int f_7028 = -12779716;
   private static final String f_7029 = "MISS";
   private static final float f_7030 = 0.001F;
   private static final String f_7031 = "-%.1f";
   private static final float f_7032 = 0.001F;
   private static final String f_7033 = "+%.1f";
   private static final float f_7034 = 0.001F;
   private static final String f_7035 = "-%.1f";
   private static final float f_7036 = 0.01F;
   private static final String f_7037 = "-%.1f";
   private static final float f_7038 = 6.0F;
   private static final float f_7039 = 0.5F;
   private static final float f_7040 = 1.70158F;
   private static final double f_7041 = 3.0;
   private static final double f_7042 = 2.0;
   private static final float f_7043 = 3.0F;
   private static final String f_7044 = "Sampler0";
   private static final String f_7045 = "Текст";
   private static final String f_7046 = "Текст";
   private static final String f_7047 = "Статичный";
   private static final String f_7048 = "Текст";
   private static final String f_7049 = "Статичный";
   private static final String f_7050 = "Текст";
   private static final String f_7051 = "dimasik";
   private static final String f_7052 = "images/hitmarkers/bloom.png";

   private void m_2507(long var1) {
      float var3 = f_11537.getWindow().getGuiScaledWidth();
      float var4 = f_11537.getWindow().getGuiScaledHeight();
      float var5 = var3 / 2.0F;
      float var6 = var4 / 2.0F;
      BufferBuilder var7 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_COLOR);
      int var8 = 0;

      for (Class_5P8vWlw6rRSHv5LV var10 : this.f_6895) {
         float var11 = var10.m_1475(var1);
         float var12 = m_2519(var11);
         if (!(var12 <= f_6951)) {
            float var13 = m_2512(Math.min(1.0F, var11 * f_6952));
            float var14 = this.f_6891.m_8768() * f_6953 * (f_6954 + f_6955 * var13) * (1.0F + var11 * f_6956);
            float var15 = this.f_6891.m_8768() * f_6957 * (f_6958 + f_6959 * var13);
            float var16 = this.f_6891.m_8768() * f_6960 * Mth.clamp(f_6961, f_6962, f_6963);
            int var17 = Class_BftdentXEtGbugJw.m_2306(f_6964, var12 * f_6965);
            int var18 = Class_BftdentXEtGbugJw.m_2306(this.m_2521(var10), var12);
            var8 += this.m_2523(var7, var5, var6, var3, var4, var14 * f_6966, var15, var16 * f_6967, var17);
            var8 += this.m_2523(var7, var5, var6, var3, var4, var14, var15, var16, var18);
            if (var10.f_2510) {
               float var19 = var12 * f_6968 * (1.0F - var11);
               int var20 = Class_BftdentXEtGbugJw.m_2306(this.m_2510(var10), var19);
               var8 += this.m_2523(var7, var5, var6, var3, var4, var14 * f_6969, var15 * f_6970, var16 * f_6971, var20);
            }
         }
      }

      this.m_2526(var7, var8, this.f_6897, f_6972);
   }

   private void m_2508(long var1) {
      float var3 = Math.max(1.0F, f_11537.getWindow().getGuiScale());

      for (Class_5P8vWlw6rRSHv5LV var5 : this.f_6895) {
         float var6 = var5.m_1475(var1);
         float var7 = m_2515(Math.min(1.0F, var6 * f_6973)) * (1.0F - m_2528(Math.max(0.0F, var6 - f_6974) * f_6975));
         var7 = m_2534(var7);
         if (!(var7 <= f_6976)) {
            Vec3 var8 = var5.f_2507.add(0.0, f_6977 + m_2528(var6) * f_6978, 0.0);
            Vector2f var9 = Class_FvJXUGWpZo3zYBW4.m_2690(var8);
            if (var9 != null) {
               String var10 = this.m_2530(var5);
               int var11 = Class_BftdentXEtGbugJw.m_2306(this.m_2518(var5, var10), var7);
               int var12 = Class_BftdentXEtGbugJw.m_2306(f_6979, var7 * f_6980);
               float var13 = f_6981 + (var5.f_2510 ? f_6982 : 0.0F) + (1.0F - m_2528(Math.min(1.0F, var6 * f_6983))) * f_6984;
               float var14 = f_6985 * var3 * var13;
               float var15 = Class_Ssh31B3ljfKeWsvS.m_4826(Class_y1y6QpONhWEUIdEB.m_9590(), var10, var14, 1.0F);
               float var16 = f_6986 * var3;
               Class_Ssh31B3ljfKeWsvS.m_4857(
                  Class_y1y6QpONhWEUIdEB.m_9590(), var10, var9.x - var15 / 2.0F + var16, var9.y + var16, var14, var12, 0.0F, f_6987, 1.0F
               );
               Class_Ssh31B3ljfKeWsvS.m_4857(Class_y1y6QpONhWEUIdEB.m_9590(), var10, var9.x - var15 / 2.0F, var9.y, var14, var11, 0.0F, f_6988, 1.0F);
            }
         }
      }
   }

   private int m_2509(Class_5P8vWlw6rRSHv5LV var1) {
      return var1.f_2510 ? Class_BftdentXEtGbugJw.m_2312(this.m_2521(var1), -10128, f_7022) : this.m_2521(var1);
   }

   private int m_2510(Class_5P8vWlw6rRSHv5LV var1) {
      return this.f_6888.m_7568(f_7020) ? this.f_6890.m_8768() : Class_BftdentXEtGbugJw.m_2312(this.m_2521(var1), -1, f_7021);
   }

   private static float m_2512(float var0) {
      float var1 = m_2534(var0);
      float var2 = f_7040;
      float var3 = var2 + 1.0F;
      return 1.0F + var3 * (float)Math.pow(var1 - 1.0F, f_7041) + var2 * (float)Math.pow(var1 - 1.0F, f_7042);
   }

   private static void m_2513(
      BufferBuilder var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, int var11
   ) {
      Vector4f var12 = Class_BftdentXEtGbugJw.m_2298(var11);
      var0.addVertex(m_2538(var1, var9), m_2535(var2, var10), 0.0F).setColor(var12.x, var12.y, var12.z, var12.w);
      var0.addVertex(m_2538(var3, var9), m_2535(var4, var10), 0.0F).setColor(var12.x, var12.y, var12.z, var12.w);
      var0.addVertex(m_2538(var5, var9), m_2535(var6, var10), 0.0F).setColor(var12.x, var12.y, var12.z, var12.w);
      var0.addVertex(m_2538(var7, var9), m_2535(var8, var10), 0.0F).setColor(var12.x, var12.y, var12.z, var12.w);
   }

   private static float m_2515(float var0) {
      float var1 = m_2534(var0);
      return var1 * var1 * (f_7043 - 2.0F * var1);
   }

   private float m_2516(Class_5P8vWlw6rRSHv5LV var1) {
      float var2 = 1.0F;
      if (f_11537.level == null) {
         return var2;
      }

      if (f_11537.level.getEntity(var1.f_2512) instanceof LivingEntity var4) {
         float var5 = Math.max(1.0F, var4.getMaxHealth() + Math.max(0.0F, var4.getAbsorptionAmount()));
         var2 = Mth.clamp(m_2540(var4) / var5, 0.0F, 1.0F);
      }

      return var2;
   }

   private void m_2517(long var1) {
      float var3 = Math.max(1.0F, f_11537.getWindow().getGuiScale());

      for (Class_5P8vWlw6rRSHv5LV var5 : this.f_6895) {
         if (var5.f_2514 && !(var5.f_2513 <= f_6989)) {
            float var6 = var5.m_1475(var1);
            float var7 = 1.0F - m_2528(var6 * f_6990);
            float var8 = 1.0F - m_2522(Math.max(0.0F, var6 - f_6991) * 2.0F);
            float var9 = m_2534(var7 * var8);
            if (!(var9 <= f_6992)) {
               Vec3 var10 = var5.f_2507.add(0.0, f_6993 + m_2528(var6) * f_6994, 0.0);
               Vector2f var11 = Class_FvJXUGWpZo3zYBW4.m_2690(var10);
               if (var11 != null) {
                  String var12 = String.format(Locale.US, f_6995, var5.f_2513);
                  int var13 = Class_BftdentXEtGbugJw.m_2306(this.m_2509(var5), var9);
                  int var14 = Class_BftdentXEtGbugJw.m_2306(f_6996, var9 * f_6997);
                  float var15 = f_6998 + (var5.f_2510 ? f_6999 : 0.0F) + (1.0F - m_2528(Math.min(1.0F, var6 * f_7000))) * f_7001;
                  float var16 = f_7002 * var3 * var15;
                  float var17 = Class_Ssh31B3ljfKeWsvS.m_4826(Class_y1y6QpONhWEUIdEB.m_9590(), var12, var16, 1.0F);
                  float var18 = f_7003 * var3;
                  Class_Ssh31B3ljfKeWsvS.m_4857(
                     Class_y1y6QpONhWEUIdEB.m_9590(), var12, var11.x - var17 / 2.0F + var18, var11.y + var18, var16, var14, 0.0F, f_7004, 1.0F
                  );
                  Class_Ssh31B3ljfKeWsvS.m_4857(Class_y1y6QpONhWEUIdEB.m_9590(), var12, var11.x - var17 / 2.0F, var11.y, var16, var13, 0.0F, f_7005, 1.0F);
               }
            }
         }
      }
   }

   private int m_2518(Class_5P8vWlw6rRSHv5LV var1, String var2) {
      if (f_7023.equals(var2)) {
         return f_7024;
      } else if (var2.startsWith(f_7025)) {
         return f_7026;
      } else {
         return var2.startsWith(f_7027) ? f_7028 : this.m_2521(var1);
      }
   }

   private static float m_2519(float var0) {
      float var1 = m_2515(var0 * f_7038);
      float var2 = 1.0F - m_2522(Math.max(0.0F, var0 - f_7039) * 2.0F);
      return m_2534(var1 * var2);
   }

   private void m_2520(long var1) {
      Iterator var3 = this.f_6895.iterator();

      while (var3.hasNext()) {
         Class_5P8vWlw6rRSHv5LV var4 = (Class_5P8vWlw6rRSHv5LV)var3.next();
         if (var4.m_1476(var1)) {
            var3.remove();
         } else if (!var4.f_2514 && f_11537.level != null) {
            Entity var5 = f_11537.level.getEntity(var4.f_2512);
            if (var5 instanceof LivingEntity var6) {
               float var7 = m_2540(var6);
               if (var7 < var4.f_2511) {
                  var4.f_2513 = var4.f_2511 - var7;
                  var4.f_2514 = true;
               }
            } else if (var5 == null) {
               var4.f_2513 = var4.f_2511;
               var4.f_2514 = true;
            }
         }
      }
   }

   private int m_2521(Class_5P8vWlw6rRSHv5LV var1) {
      if (this.f_6888.m_7568(f_7014)) {
         return var1.f_2510 ? this.f_6890.m_8768() : this.f_6889.m_8768();
      } else if (this.f_6888.m_7568(f_7015)) {
         float var4 = this.m_2516(var1);
         int var3 = Class_BftdentXEtGbugJw.m_2312(f_7016, f_7017, var4);
         return var1.f_2510 ? Class_BftdentXEtGbugJw.m_2312(var3, -7286, f_7018) : var3;
      } else {
         int var2 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
         return var1.f_2510 ? Class_BftdentXEtGbugJw.m_2312(var2, -7286, f_7019) : var2;
      }
   }

   private static float m_2522(float var0) {
      float var1 = m_2534(var0);
      return var1 * var1;
   }

   private int m_2523(BufferBuilder var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      return this.m_2533(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   private void m_2524(Class_TZhU50s8XmBQCMP5 var1) {
      if (f_11537.level != null && f_11537.player != null && !this.f_6895.isEmpty()) {
         long var2 = System.currentTimeMillis();
         this.m_2520(var2);
         if (!this.f_6895.isEmpty() && this.f_6887.m_7568(f_6938)) {
            Camera var4 = f_11537.gameRenderer.mainCamera();
            Vec3 var5 = var4.position();
            PoseStack var6 = var1.m_5006();
            BufferBuilder var7 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
            int var8 = 0;

            for (Class_5P8vWlw6rRSHv5LV var10 : this.f_6895) {
               float var11 = var10.m_1475(var2);
               float var12 = m_2519(var11);
               if (!(var12 <= f_6939)) {
                  float var13 = f_6940 + f_6941 * Math.min(1.0F, var11 * f_6942) * m_2512(var11);
                  float var14 = 1.0F - m_2522(Math.max(0.0F, var11 - f_6943) * f_6944) * f_6945;
                  float var15 = this.f_6891.m_8768() * var13 * var14;
                  float var16 = m_2528(var11) * f_6946;
                  int var17 = Class_BftdentXEtGbugJw.m_2306(this.m_2521(var10), var12);
                  var6.pushPose();
                  var6.translate(var10.f_2507.x - var5.x, var10.f_2507.y - var5.y + var16, var10.f_2507.z - var5.z);
                  var6.mulPose(Axis.YP.rotationDegrees(-var4.yRot()));
                  var6.mulPose(Axis.XP.rotationDegrees(var4.xRot()));
                  var6.scale(var15, var15, var15);
                  var8 += m_2527(var7, var6.last().pose(), var17);
                  var6.popPose();
               }
            }

            this.m_2537(var7, f_6808, var8, this.f_6896, f_6947);
         }
      }
   }

   private void m_2525(Class_bhRaN0YSSLQRYjPo var1) {
      if (f_11537.level != null && f_11537.player != null && !this.f_6895.isEmpty()) {
         long var2 = System.currentTimeMillis();
         this.m_2520(var2);
         if (!this.f_6895.isEmpty()) {
            if (this.f_6887.m_7568(f_6948)) {
               this.m_2507(var2);
            }

            Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
            if (this.f_6887.m_7568(f_6949)) {
               this.m_2508(var2);
            }

            if (this.f_6894.m_8768() && !this.f_6887.m_7568(f_6950)) {
               this.m_2517(var2);
            }
         }
      }
   }

   @Override
   public void m_732() {
      this.f_6895.clear();
   }

   public HitMarkers() {
      super(f_6901, f_6902, Category.RENDER);
      this.f_6887 = new MultiChoiceSetting(f_6903, new Class_2ZaVm8TGDJ68TnJB(f_6904), new Class_2ZaVm8TGDJ68TnJB(f_6905), new Class_2ZaVm8TGDJ68TnJB(f_6906));
      this.f_6888 = new MultiChoiceSetting(f_6907, new Class_2ZaVm8TGDJ68TnJB(f_6908), new Class_2ZaVm8TGDJ68TnJB(f_6909), new Class_2ZaVm8TGDJ68TnJB(f_6910))
         .m_822(() -> !this.f_6887.m_7568(f_7050));
      this.f_6889 = new ColorSetting(f_6911, false, -1).m_822(() -> !this.f_6887.m_7568(f_7048) && this.f_6888.m_7568(f_7049));
      this.f_6890 = new ColorSetting(f_6912, false, -10496).m_822(() -> !this.f_6887.m_7568(f_7046) && this.f_6888.m_7568(f_7047));
      this.f_6891 = new SliderSetting(f_6913, f_6914, f_6915, f_6916).m_828(f_6917);
      this.f_6892 = new SliderSetting(f_6918, f_6919, f_6920, f_6921).m_828(f_6922);
      this.f_6893 = new CheckboxSetting(f_6923, true);
      this.f_6894 = new CheckboxSetting(f_6924, true).m_822(() -> !this.f_6887.m_7568(f_7045));
      this.f_6895 = new ArrayList<>();
      this.f_6896 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_6925)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_6926))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_6927))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.ADDITIVE)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2741(f_6928)
         .m_2722();
      this.f_6897 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_6929)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_6930))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_6931))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(DefaultVertexFormat.POSITION_COLOR, PrimitiveTopology.QUADS)
         .m_2722();
      this.f_6898 = this::m_2541;
      this.f_6899 = this::m_2524;
      this.f_6900 = this::m_2525;
      this.m_795(this.f_6887, this.f_6888, this.f_6889, this.f_6890, this.f_6891, this.f_6892, this.f_6893, this.f_6894);
   }

   private void m_2526(BufferBuilder var1, int var2, RenderPipeline var3, String var4) {
      MeshData var5 = var1.build();
      if (var5 != null) {
         if (var2 == 0) {
            var5.close();
         } else {
            GpuBuffer var6 = null;

            try {
               DrawState var7 = var5.drawState();
               int var8 = var7.indexCount();
               AutoStorageIndexBuffer var9 = RenderSystem.getSequentialBuffer(var7.primitiveTopology());
               GpuBuffer var10 = var9.getBuffer(var8);
               IndexType var11 = var9.type();
               var6 = RenderSystem.getDevice().createBuffer(() -> var4 + "", 32, var5.vertexBuffer());
               RenderTarget var12 = f_11537.gameRenderer.mainRenderTarget();
               CommandEncoder var13 = RenderSystem.getDevice().createCommandEncoder();
               RenderPass var14 = var13.createRenderPass(() -> var4, var12.getColorTextureView(), Optional.empty());

               try {
                  RenderSystem.bindDefaultUniforms(var14);
                  var14.setPipeline(var3);
                  var14.setVertexBuffer(0, var6.slice());
                  var14.setIndexBuffer(var10, var11);
                  var14.drawIndexed(var8, 1, 0, 0, 0);
               } catch (Throwable var22) {
                  if (var14 != null) {
                     try {
                        var14.close();
                     } catch (Throwable var21) {
                        var22.addSuppressed(var21);
                     }
                  }

                  throw var22;
               }

               if (var14 != null) {
                  var14.close();
               }
            } finally {
               if (var6 != null) {
                  var6.close();
               }

               var5.close();
            }
         }
      }
   }

   private static int m_2527(BufferBuilder var0, Matrix4f var1, int var2) {
      Vector4f var3 = Class_BftdentXEtGbugJw.m_2298(var2);
      float var4 = f_7006;
      float var5 = f_7007;
      float var6 = f_7008;
      float var7 = f_7009;
      var0.addVertex(var1, var4, var5, 0.0F).setUv(0.0F, 0.0F).setColor(var3.x, var3.y, var3.z, var3.w);
      var0.addVertex(var1, var4, var7, 0.0F).setUv(0.0F, 1.0F).setColor(var3.x, var3.y, var3.z, var3.w);
      var0.addVertex(var1, var6, var7, 0.0F).setUv(1.0F, 1.0F).setColor(var3.x, var3.y, var3.z, var3.w);
      var0.addVertex(var1, var6, var5, 0.0F).setUv(1.0F, 0.0F).setColor(var3.x, var3.y, var3.z, var3.w);
      return 4;
   }

   private static float m_2528(float var0) {
      float var1 = m_2534(var0);
      return 1.0F - (1.0F - var1) * (1.0F - var1);
   }

   private String m_2530(Class_5P8vWlw6rRSHv5LV var1) {
      String var2 = f_7029;
      if (f_11537.level == null) {
         return var2;
      }

      if (f_11537.level.getEntity(var1.f_2512) instanceof LivingEntity var4) {
         float var5 = m_2540(var4);
         if (var5 < var1.f_2511 - f_7030) {
            return String.format(Locale.US, f_7031, var1.f_2511 - var5);
         }

         if (var5 > var1.f_2511 + f_7032) {
            return String.format(Locale.US, f_7033, var5 - var1.f_2511);
         }

         if (var1.f_2514 && var1.f_2513 > f_7034) {
            return String.format(Locale.US, f_7035, var1.f_2513);
         }
      } else if (var1.f_2514 && var1.f_2513 > f_7036) {
         return String.format(Locale.US, f_7037, var1.f_2513);
      }

      return var2;
   }

   private int m_2533(BufferBuilder var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      float var10 = var6 - var7;
      float var11 = var6 - var8;
      int var12 = 0;
      var12 += this.m_2536(var1, var2 - var10, var3 - var11, var2 + var10, var3 + var11, var7, var8, var4, var5, var9);
      var12 += this.m_2536(var1, var2 - var10, var3 + var11, var2 + var10, var3 - var11, var7, var8, var4, var5, var9);
      var12 += this.m_2536(var1, var2 - var11, var3 - var10, var2 + var11, var3 + var10, var8, var7, var4, var5, var9);
      return var12 + this.m_2536(var1, var2 - var11, var3 + var10, var2 + var11, var3 - var10, var8, var7, var4, var5, var9);
   }

   private static float m_2534(float var0) {
      return Mth.clamp(var0, 0.0F, 1.0F);
   }

   private static float m_2535(float var0, float var1) {
      return 1.0F - var0 * 2.0F / var1;
   }

   private int m_2536(BufferBuilder var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10) {
      float var11 = var4 - var2;
      float var12 = var5 - var3;
      float var13 = Mth.sqrt(var11 * var11 + var12 * var12);
      if (var13 <= f_7010) {
         return 0;
      }

      float var14 = -var12 / var13 * var6 * f_7011;
      float var15 = var11 / var13 * var7 * f_7012;
      m_2513(var1, var2 + var14, var3 + var15, var2 - var14, var3 - var15, var4 - var14, var5 - var15, var4 + var14, var5 + var15, var8, var9, var10);
      return 4;
   }

   private void m_2537(BufferBuilder var1, Identifier var2, int var3, RenderPipeline var4, String var5) {
      MeshData var6 = var1.build();
      if (var6 != null) {
         if (var3 == 0) {
            var6.close();
         } else {
            GpuBuffer var7 = null;

            try {
               DrawState var8 = var6.drawState();
               int var9 = var8.indexCount();
               AutoStorageIndexBuffer var10 = RenderSystem.getSequentialBuffer(var8.primitiveTopology());
               GpuBuffer var11 = var10.getBuffer(var9);
               IndexType var12 = var10.type();
               var7 = RenderSystem.getDevice().createBuffer(() -> var5 + "", 32, var6.vertexBuffer());
               RenderTarget var13 = f_11537.gameRenderer.mainRenderTarget();
               CommandEncoder var14 = RenderSystem.getDevice().createCommandEncoder();
               AbstractTexture var15 = f_11537.getTextureManager().getTexture(var2);
               RenderPass var16 = var14.createRenderPass(
                  () -> var5, var13.getColorTextureView(), Optional.empty(), var13.getDepthTextureView(), OptionalDouble.empty()
               );

               try {
                  RenderSystem.bindDefaultUniforms(var16);
                  var16.setPipeline(var4);
                  var16.bindTexture(f_7044, var15.getTextureView(), var15.getSampler());
                  var16.setVertexBuffer(0, var7.slice());
                  var16.setIndexBuffer(var11, var12);
                  var16.drawIndexed(var9, 1, 0, 0, 0);
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
               if (var7 != null) {
                  var7.close();
               }

               var6.close();
            }
         }
      }
   }

   private static float m_2538(float var0, float var1) {
      return f_7013 + var0 * 2.0F / var1;
   }

   private boolean m_2539() {
      return f_11537.player == null
         ? false
         : f_11537.player.fallDistance > 0.0
            && !f_11537.player.onGround()
            && !f_11537.player.onClimbable()
            && !f_11537.player.isInWater()
            && !f_11537.player.hasEffect(MobEffects.BLINDNESS)
            && !f_11537.player.isPassenger();
   }

   private static float m_2540(LivingEntity var0) {
      return var0.getHealth() + Math.max(0.0F, var0.getAbsorptionAmount());
   }

   private void m_2541(Class_wjdoxQGtI8mFyL6U var1) {
      if (this.m_776() && f_11537.player != null && f_11537.level != null) {
         if (var1.m_9372() == Class_wjdoxQGtI8mFyL6U.Class_327mRdjAqNoPaemJ.PRE && var1.m_9371() == f_11537.player) {
            if (var1.m_9370() instanceof LivingEntity var2 && var1.m_9370() != f_11537.player) {
               double var13 = var2.getBbWidth() * f_6932;
               double var5 = var2.getBbHeight() * f_6933;
               Vec3 var7 = new Vec3(
                  var2.getX() + (Math.random() - f_6934) * var13,
                  var2.getY() + var2.getBbHeight() * f_6935 + (Math.random() - f_6936) * var5,
                  var2.getZ() + (Math.random() - f_6937) * var13
               );
               boolean var8 = this.m_2539() && this.f_6893.m_8768();
               long var9 = this.f_6892.m_8768().longValue();
               long var11 = System.currentTimeMillis();
               this.f_6895.add(new Class_5P8vWlw6rRSHv5LV(var7, var11, var9, var8, m_2540(var2), var2.getId()));
            }
         }
      }
   }
}
