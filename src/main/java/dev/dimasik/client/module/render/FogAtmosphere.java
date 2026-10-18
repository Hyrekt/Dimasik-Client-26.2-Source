package dev.dimasik.client.module.render;

import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.pipeline.TextureTarget;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.shaders.UniformType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ColorSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_hE5HYN1IW4q63o2z;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.nio.ByteBuffer;
import java.util.Optional;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.level.levelgen.Heightmap.Types;
import net.minecraft.world.level.material.FogType;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;

public class FogAtmosphere extends Module {
   private static final int f_30730 = 256;
   private static final int f_30731 = 320;
   private final MultiChoiceSetting f_30732;
   private final CheckboxSetting f_30733;
   private final MultiChoiceSetting f_30734;
   private final SliderSetting f_30735;
   private final SliderSetting f_30736;
   private final CheckboxSetting f_30737;
   private final SliderSetting f_30738;
   private final CheckboxSetting f_30739;
   private final CheckboxSetting f_30740;
   private final SliderSetting f_30741;
   private final CheckboxSetting f_30742;
   private final ColorSetting f_30743;
   private final ColorSetting f_30744;
   private final MultiChoiceSetting f_30745;
   private final SliderSetting f_30746;
   private final SliderSetting f_30747;
   private final SliderSetting f_30748;
   private final SliderSetting f_30749;
   private final ColorSetting f_30750;
   private final RenderPipeline f_30751;
   private final RenderPipeline f_30752;
   private final RenderPipeline f_30753;
   private final RenderPipeline f_30754;
   private final RenderPipeline f_30755;
   private TextureTarget f_30756;
   private TextureTarget f_30757;
   private GpuBuffer f_30758;
   private GpuBuffer f_30759;
   private ClientLevel f_30760;
   private ClientLevel f_30761;
   private float f_30762;
   private float f_30763;
   private float f_30764;
   private int f_30765;
   private int f_30766;
   private final Class_gEPk7yDw6CwIte87<Class_hE5HYN1IW4q63o2z> f_30767;
   private static final String f_30768 = "FogAtmosphere";
   private static final String f_30769 = "Низкий объёмный туман и солнечные лучи";
   private static final String f_30770 = "Режим рендера";
   private static final String f_30771 = "Optimized";
   private static final String f_30772 = "Powerful";
   private static final String f_30773 = "Только туман";
   private static final String f_30774 = "Стиль лёгкой атмосферы";
   private static final String f_30775 = "Объёмный туман";
   private static final String f_30776 = "Ночная дымка";
   private static final String f_30777 = "Густота лёгкого тумана";
   private static final float f_30778 = 0.05F;
   private static final float f_30779 = 1.5F;
   private static final float f_30780 = 0.05F;
   private static final String f_30781 = "Высота лёгкого тумана";
   private static final float f_30782 = 14.0F;
   private static final float f_30783 = 64.0F;
   private static final String f_30784 = "Быстрые лучи";
   private static final String f_30785 = "Яркость быстрых лучей";
   private static final float f_30786 = 0.05F;
   private static final float f_30787 = 0.05F;
   private static final String f_30788 = "Затенение быстрых лучей";
   private static final String f_30789 = "Лунная дымка";
   private static final String f_30790 = "Мягкость лёгкого тумана";
   private static final float f_30791 = 0.7F;
   private static final float f_30792 = 0.1F;
   private static final float f_30793 = 1.5F;
   private static final float f_30794 = 0.05F;
   private static final String f_30795 = "Цвета клиента для лёгкого тумана";
   private static final String f_30796 = "Холодный оттенок лёгкого тумана";
   private static final int f_30797 = -4275002;
   private static final String f_30798 = "Тёплый оттенок лёгкого тумана";
   private static final String f_30799 = "Палитра";
   private static final String f_30800 = "Рассвет";
   private static final String f_30801 = "Сумерки";
   private static final String f_30802 = "Цвет клиента";
   private static final String f_30803 = "Насыщенность атмосферы";
   private static final float f_30804 = 0.35F;
   private static final float f_30805 = 0.05F;
   private static final float f_30806 = 0.8F;
   private static final float f_30807 = 0.01F;
   private static final String f_30808 = "Верхняя граница дымки";
   private static final float f_30809 = 76.0F;
   private static final float f_30810 = 60.0F;
   private static final float f_30811 = 120.0F;
   private static final String f_30812 = "Сияние солнечных лучей";
   private static final float f_30813 = 0.75F;
   private static final float f_30814 = 0.01F;
   private static final String f_30815 = "Мягкость";
   private static final float f_30816 = 0.6F;
   private static final float f_30817 = 0.01F;
   private static final String f_30818 = "Оттенок линии рассвета";
   private static final String f_30819 = "dimasik/fog_atmosphere";
   private static final String f_30820 = "fog_atmosphere";
   private static final String f_30821 = "fog_atmosphere";
   private static final String f_30822 = "FogAtmosphere";
   private static final String f_30823 = "DepthSampler";
   private static final String f_30824 = "dimasik/fog_atmosphere_composite";
   private static final String f_30825 = "fog_atmosphere";
   private static final String f_30826 = "fog_atmosphere_composite";
   private static final String f_30827 = "FogAtmosphere";
   private static final String f_30828 = "FogSampler";
   private static final String f_30829 = "dimasik/fog_atmosphere_light";
   private static final String f_30830 = "fog_atmosphere";
   private static final String f_30831 = "fog_atmosphere_light";
   private static final String f_30832 = "FogAtmosphere";
   private static final String f_30833 = "FogSampler";
   private static final String f_30834 = "dimasik/fog_atmosphere_powerful";
   private static final String f_30835 = "fog_atmosphere";
   private static final String f_30836 = "fog_atmosphere_powerful";
   private static final String f_30837 = "PowerfulAtmosphere";
   private static final String f_30838 = "SceneSampler";
   private static final String f_30839 = "DepthSampler";
   private static final String f_30840 = "dimasik/fog_atmosphere_powerful_fog_only";
   private static final String f_30841 = "fog_atmosphere";
   private static final String f_30842 = "fog_atmosphere_powerful_fog_only";
   private static final String f_30843 = "PowerfulAtmosphere";
   private static final String f_30844 = "SceneSampler";
   private static final String f_30845 = "DepthSampler";
   private static final int f_30846 = Integer.MIN_VALUE;
   private static final int f_30847 = Integer.MIN_VALUE;
   private static final String f_30848 = "Powerful";
   private static final float f_30849 = 96.0F;
   private static final float f_30850 = 0.075F;
   private static final double f_30851 = 96.0;
   private static final float f_30852 = 0.12F;
   private static final float f_30853 = (float) (Math.PI / 180.0);
   private static final float f_30854 = -0.08F;
   private static final float f_30855 = 0.2F;
   private static final float f_30856 = -0.08F;
   private static final float f_30857 = 0.2F;
   private static final float f_30858 = 0.75F;
   private static final float f_30859 = 0.5F;
   private static final float f_30860 = 0.5F;
   private static final float f_30861 = 1.0E-4F;
   private static final float f_30862 = 0.5F;
   private static final float f_30863 = 0.5F;
   private static final float f_30864 = 0.5F;
   private static final float f_30865 = 0.5F;
   private static final float f_30866 = 0.5F;
   private static final double f_30867 = 2.0;
   private static final float f_30868 = 0.5F;
   private static final double f_30869 = 2.0;
   private static final float f_30870 = 0.015F;
   private static final float f_30871 = 0.12F;
   private static final float f_30872 = 0.68F;
   private static final float f_30873 = 1.55F;
   private static final long f_30874 = 240000L;
   private static final float f_30875 = 20.0F;
   private static final float f_30876 = -1.0F;
   private static final float f_30877 = 16.0F;
   private static final String f_30878 = "DepthSampler";
   private static final String f_30879 = "FogAtmosphere";
   private static final String f_30880 = "FogAtmosphere";
   private static final String f_30881 = "FogSampler";
   private static final String f_30882 = "FogAtmosphere";
   private static final String f_30883 = "FogSampler";
   private static final float f_30884 = (float) (Math.PI / 180.0);
   private static final String f_30885 = "Сумерки";
   private static final float f_30886 = -0.045F;
   private static final String f_30887 = "Цвет клиента";
   private static final float f_30888 = 0.13F;
   private static final float f_30889 = 0.11F;
   private static final float f_30890 = -1.0F;
   private static final float f_30891 = 0.5F;
   private static final float f_30892 = 0.5F;
   private static final float f_30893 = 4.0F;
   private static final float f_30894 = 1.0E-4F;
   private static final float f_30895 = 1000.0F;
   private static final float f_30896 = 1000.0F;
   private static final float f_30897 = 1000.0F;
   private static final float f_30898 = 1.0E-4F;
   private static final float f_30899 = 0.5F;
   private static final float f_30900 = 0.5F;
   private static final float f_30901 = 0.5F;
   private static final float f_30902 = 0.5F;
   private static final float f_30903 = 18.0F;
   private static final long f_30904 = 100000L;
   private static final float f_30905 = 0.05F;
   private static final float f_30906 = 16.0F;
   private static final String f_30907 = "PowerfulAtmosphere";
   private static final String f_30908 = "SceneSampler";
   private static final String f_30909 = "DepthSampler";
   private static final String f_30910 = "Сумерки";
   private static final float f_30911 = 0.135F;
   private static final float f_30912 = 0.125F;
   private static final float f_30913 = 0.3F;
   private static final float f_30914 = 0.89F;
   private static final float f_30915 = 0.46F;
   private static final float f_30916 = 0.55F;
   private static final float f_30917 = 0.38F;
   private static final float f_30918 = 0.35F;
   private static final float f_30919 = 0.56F;
   private static final float f_30920 = 0.8F;
   private static final float f_30921 = 0.52F;
   private static final float f_30922 = 0.62F;
   private static final float f_30923 = 0.47F;
   private static final float f_30924 = 0.44F;
   private static final float f_30925 = 0.64F;
   private static final float f_30926 = 0.92F;
   private static final float f_30927 = 0.56F;
   private static final float f_30928 = 0.72F;
   private static final String f_30929 = "Цвет клиента";
   private static final float f_30930 = 255.0F;
   private static final float f_30931 = 255.0F;
   private static final float f_30932 = 255.0F;
   private static final String f_30933 = "Цвет клиента";
   private static final float f_30934 = 0.085F;
   private static final float f_30935 = 0.1F;
   private static final float f_30936 = 0.2F;
   private static final float f_30937 = 0.3F;
   private static final float f_30938 = 0.93F;
   private static final float f_30939 = 0.82F;
   private static final float f_30940 = 0.35F;
   private static final float f_30941 = 0.52F;
   private static final float f_30942 = 0.58F;
   private static final float f_30943 = 0.74F;
   private static final float f_30944 = 0.28F;
   private static final float f_30945 = 0.97F;
   private static final float f_30946 = 0.93F;
   private static final float f_30947 = 0.88F;
   private static final float f_30948 = 0.45F;
   private static final float f_30949 = 0.58F;
   private static final float f_30950 = 0.63F;
   private static final float f_30951 = 0.76F;
   private static final float f_30952 = 0.35F;
   private static final float f_30953 = 0.96F;
   private static final float f_30954 = 0.88F;
   private static final float f_30955 = 0.3F;
   private static final float f_30956 = 0.16F;
   private static final float f_30957 = 0.19F;
   private static final float f_30958 = 0.38F;
   private static final float f_30959 = 0.14F;
   private static final float f_30960 = 1.12F;
   private static final float f_30961 = 0.88F;
   private static final float f_30962 = 0.62F;
   private static final float f_30963 = 0.56F;
   private static final float f_30964 = 0.62F;
   private static final float f_30965 = 0.8F;
   private static final float f_30966 = 0.95F;
   private static final float f_30967 = 0.55F;
   private static final float f_30968 = 0.63F;
   private static final float f_30969 = 0.42F;
   private static final float f_30970 = 0.6F;
   private static final float f_30971 = 0.67F;
   private static final float f_30972 = 0.82F;
   private static final float f_30973 = 1.08F;
   private static final float f_30974 = 0.94F;
   private static final float f_30975 = 0.72F;
   private static final float f_30976 = 0.41222146F;
   private static final float f_30977 = 0.53633255F;
   private static final float f_30978 = 0.051445995F;
   private static final float f_30979 = 0.2119035F;
   private static final float f_30980 = 0.6806995F;
   private static final float f_30981 = 0.10739696F;
   private static final float f_30982 = 0.08830246F;
   private static final float f_30983 = 0.28171885F;
   private static final float f_30984 = 0.6299787F;
   private static final float f_30985 = 0.41222146F;
   private static final float f_30986 = 0.53633255F;
   private static final float f_30987 = 0.051445995F;
   private static final float f_30988 = 0.2119035F;
   private static final float f_30989 = 0.6806995F;
   private static final float f_30990 = 0.10739696F;
   private static final float f_30991 = 0.08830246F;
   private static final float f_30992 = 0.28171885F;
   private static final float f_30993 = 0.6299787F;
   private static final float f_30994 = 4.0767417F;
   private static final float f_30995 = 3.3077116F;
   private static final float f_30996 = 0.23096994F;
   private static final float f_30997 = -1.268438F;
   private static final float f_30998 = 2.6097574F;
   private static final float f_30999 = 0.34131938F;
   private static final float f_31000 = -0.0041960864F;
   private static final float f_31001 = 0.7034186F;
   private static final float f_31002 = 1.7076147F;
   private static final float f_31003 = 0.04045F;
   private static final float f_31004 = 12.92F;
   private static final float f_31005 = 0.055F;
   private static final float f_31006 = 1.055F;
   private static final double f_31007 = 2.4;
   private static final float f_31008 = 0.0031308F;
   private static final float f_31009 = 12.92F;
   private static final double f_31010 = 1.055;
   private static final double f_31011 = 0.4166666666666667;
   private static final double f_31012 = 0.055;
   private static final float f_31013 = 8.0F;
   private static final float f_31014 = 0.85F;
   private static final float f_31015 = 4.0F;
   private static final float f_31016 = 1.0E7F;
   private static final float f_31017 = 1.0E7F;
   private static final String f_31018 = "FogAtmosphere layer";
   private static final String f_31019 = "FogAtmosphere powerful scene";
   private static final long f_31020 = 256L;
   private static final long f_31021 = 320L;
   private static final double f_31022 = 8192.0;
   private static final double f_31023 = 8192.0;
   private static final float f_31024 = 3.0F;
   private static final String f_31025 = "Ночная дымка";
   private static final int f_31026 = Integer.MIN_VALUE;
   private static final int f_31027 = Integer.MIN_VALUE;
   private static final String f_31028 = "FogAtmosphere powerful uniforms";
   private static final String f_31029 = "FogAtmosphere uniforms";
   private static final String f_31030 = "FogAtmosphere powerful";
   private static final String f_31031 = "FogAtmosphere light";
   private static final String f_31032 = "FogAtmosphere composite";
   private static final String f_31033 = "FogAtmosphere layer";
   private static final String f_31034 = "Powerful";
   private static final String f_31035 = "Рассвет";
   private static final String f_31036 = "Powerful";
   private static final String f_31037 = "Powerful";
   private static final String f_31038 = "Powerful";
   private static final String f_31039 = "Powerful";
   private static final String f_31040 = "Powerful";
   private static final String f_31041 = "Optimized";
   private static final String f_31042 = "Optimized";
   private static final String f_31043 = "Optimized";
   private static final String f_31044 = "Optimized";
   private static final String f_31045 = "Optimized";
   private static final String f_31046 = "Optimized";
   private static final String f_31047 = "Optimized";
   private static final String f_31048 = "Optimized";
   private static final String f_31049 = "Optimized";
   private static final String f_31050 = "Optimized";
   private static final String f_31051 = "Optimized";

   private void m_8642(int var1, int var2) {
      if (this.f_30756 == null) {
         this.f_30756 = new TextureTarget(f_31018, var1, var2, false, GpuFormat.RGBA8_UNORM);
      } else if (this.f_30756.width != var1 || this.f_30756.height != var2) {
         this.f_30756.resize(var1, var2);
      }
   }

   private float m_8644(Vec3 var1) {
      int var2 = Mth.floor(f_11537.player.getX());
      int var3 = Mth.floor(f_11537.player.getZ());
      if (f_11537.player.onGround()) {
         this.f_30761 = f_11537.level;
         this.f_30765 = var2;
         this.f_30766 = var3;
         this.f_30764 = (float)f_11537.player.getY();
         return this.f_30764;
      }

      float var4 = (float)f_11537.player.getY() - Math.max(f_31013, this.f_30736.m_8768() * f_31014);
      if (this.f_30761 == f_11537.level && Math.abs(this.f_30765 - var2) <= 8 && Math.abs(this.f_30766 - var3) <= 8 && Float.isFinite(this.f_30764)) {
         return Math.max(this.f_30764, var4);
      }

      this.f_30761 = f_11537.level;
      this.f_30765 = var2;
      this.f_30766 = var3;
      float var5 = Float.NEGATIVE_INFINITY;
      float var6 = (float)var1.y + f_31015;

      for (int var7 = -4; var7 <= 4; var7 += 4) {
         for (int var8 = -4; var8 <= 4; var8 += 4) {
            float var9 = f_11537.level.getHeight(Types.MOTION_BLOCKING_NO_LEAVES, var2 + var7, var3 + var8);
            if (var9 <= var6) {
               var5 = Math.max(var5, var9);
            }
         }
      }

      this.f_30764 = Float.isFinite(var5) ? var5 : var4;
      return Math.max(this.f_30764, var4);
   }

   @Override
   public void m_732() {
      this.f_30760 = null;
      this.f_30761 = null;
      this.f_30762 = Float.NaN;
      this.f_30763 = Float.NaN;
      this.f_30764 = Float.NaN;
      this.f_30765 = f_31026;
      this.f_30766 = f_31027;
      if (this.f_30756 != null) {
         this.f_30756.destroyBuffers();
         this.f_30756 = null;
      }

      if (this.f_30757 != null) {
         this.f_30757.destroyBuffers();
         this.f_30757 = null;
      }

      if (this.f_30758 != null) {
         this.f_30758.close();
         this.f_30758 = null;
      }

      if (this.f_30759 != null) {
         this.f_30759.close();
         this.f_30759 = null;
      }
   }

   private static void m_8648(float[] var0, int var1, float var2, float var3, float var4) {
      var0[var1] = var2;
      var0[var1 + 1] = var3;
      var0[var1 + 2] = var4;
   }

   private float m_8649() {
      return this.f_30734.m_7568(f_31025) ? 1.0F : 0.0F;
   }

   private boolean m_8651() {
      return this.m_776()
         && f_11537.level != null
         && f_11537.player != null
         && f_11537.gameRenderer != null
         && f_11537.gameRenderer.mainCamera() != null
         && f_11537.gameRenderer.mainCamera().getFluidInCamera() == FogType.NONE;
   }

   private void m_8654() {
      if (this.f_30759 == null || this.f_30759.isClosed()) {
         this.f_30759 = RenderSystem.getDevice().createBuffer(() -> f_31028, 136, f_31021);
      }
   }

   private void m_8655(Matrix4f var1, Matrix4f var2, DeltaTracker var3) {
      RenderTarget var4 = f_11537.gameRenderer.mainRenderTarget();
      if (var4 != null && var4.getColorTexture() != null && var4.getDepthTexture() != null && !var4.getDepthTexture().isClosed()) {
         int var5 = Math.max(1, var4.width);
         int var6 = Math.max(1, var4.height);
         this.m_8657(var5, var6);
         this.m_8654();
         float var7 = var3.getGameTimeDeltaPartialTick(false);
         Vec3 var8 = f_11537.gameRenderer.mainCamera().position();
         float var9 = (Float)f_11537.gameRenderer.mainCamera().attributeProbe().getValue(EnvironmentAttributes.SUN_ANGLE, var7) * f_30884;
         float var10 = -Mth.sin(var9);
         float var11 = this.f_30745.m_7568(f_30885) ? f_30886 : (this.f_30745.m_7568(f_30887) ? f_30888 : f_30889);
         float var12 = var10 >= 0.0F ? 1.0F : f_30890;
         float var13 = var12 * Mth.cos(var11);
         float var14 = Mth.sin(var11);
         Vector4f var15 = new Vector4f(var13, var14, 0.0F, 0.0F);
         new Matrix4f(var2).transform(var15);
         float var16 = f_30891;
         float var17 = f_30892;
         float var18 = Mth.clamp(-var15.z * f_30893, 0.0F, 1.0F);
         if (-var15.z > f_30894) {
            Vector4f var19 = new Vector4f(var15.x * f_30895, var15.y * f_30896, var15.z * f_30897, 1.0F);
            new Matrix4f(var1).transform(var19);
            if (var19.w > f_30898) {
               var16 = var19.x / var19.w * f_30899 + f_30900;
               var17 = var19.y / var19.w * f_30901 + f_30902;
            }
         }

         float[] var34 = this.m_8674();
         float var20 = this.f_30747.m_8768();
         float var21 = var20 - f_30903;
         float var22 = ((float)(f_11537.level.getGameTime() % f_30904) + var7) * f_30905;
         float var23 = f_11537.options.getEffectiveRenderDistance() * f_30906;
         Matrix4f var24 = new Matrix4f(var1).invert();
         Matrix4f var25 = new Matrix4f(var2).invert();
         var25.m30((float)var8.x);
         var25.m31((float)var8.y);
         var25.m32((float)var8.z);
         CommandEncoder var26 = RenderSystem.getDevice().createCommandEncoder();
         var26.copyTextureToTexture(var4.getColorTexture(), this.f_30757.getColorTexture(), 0, 0, 0, 0, 0, var5, var6);
         MemoryStack var27 = MemoryStack.stackPush();

         try {
            ByteBuffer var28 = Std140Builder.onStack(var27, 320)
               .putMat4f(var24)
               .putMat4f(var25)
               .putVec4((float)var8.x, (float)var8.y, (float)var8.z, 0.0F)
               .putVec4(var13, var14, 0.0F, 0.0F)
               .putVec4(var16, var17, var18, 0.0F)
               .putVec4(this.f_30746.m_8768(), var21, var20, var23)
               .putVec4(var5, var6, var22, this.f_30749.m_8768())
               .putVec4(this.f_30748.m_8768(), 0.0F, 0.0F, 0.0F)
               .putVec4(var34[0], var34[1], var34[2], 1.0F)
               .putVec4(var34[3], var34[4], var34[5], 1.0F)
               .putVec4(var34[6], var34[7], var34[8], 1.0F)
               .putVec4(var34[9], var34[10], var34[11], 1.0F)
               .putVec4(var34[12], var34[13], var34[14], 1.0F)
               .putVec4(var34[15], var34[16], var34[17], 1.0F)
               .get();
            var26.writeToBuffer(this.f_30759.slice(), var28);
         } catch (Throwable var33) {
            if (var27 != null) {
               try {
                  var27.close();
               } catch (Throwable var31) {
                  var33.addSuppressed(var31);
               }
            }

            throw var33;
         }

         if (var27 != null) {
            var27.close();
         }

         RenderPass var35 = var26.createRenderPass(() -> f_31030, var4.getColorTextureView(), Optional.empty());

         try {
            var35.setPipeline(this.f_30733.m_8768() ? this.f_30755 : this.f_30754);
            var35.setUniform(f_30907, this.f_30759);
            var35.bindTexture(f_30908, this.f_30757.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
            var35.bindTexture(f_30909, var4.getDepthTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
            var35.draw(3, 1, 0, 0);
         } catch (Throwable var32) {
            if (var35 != null) {
               try {
                  var35.close();
               } catch (Throwable var30) {
                  var32.addSuppressed(var30);
               }
            }

            throw var32;
         }

         if (var35 != null) {
            var35.close();
         }
      }
   }

   private void m_8656() {
      if (this.f_30758 == null || this.f_30758.isClosed()) {
         this.f_30758 = RenderSystem.getDevice().createBuffer(() -> f_31029, 136, f_31020);
      }
   }

   private void m_8657(int var1, int var2) {
      if (this.f_30757 == null) {
         this.f_30757 = new TextureTarget(f_31019, var1, var2, false, GpuFormat.RGBA8_UNORM);
      } else if (this.f_30757.width != var1 || this.f_30757.height != var2) {
         this.f_30757.resize(var1, var2);
      }
   }

   private void m_8660(Class_hE5HYN1IW4q63o2z var1) {
      if (var1.m_7143() != null && var1.m_7143().getFluidInCamera() == FogType.NONE) {
         var1.m_7141(f_31016, f_31017);
      }
   }

   private static float m_8661(float var0) {
      return Mth.clamp(var0, 0.0F, 1.0F);
   }

   public void m_8664(Matrix4f var1, Matrix4f var2, DeltaTracker var3) {
      if (this.m_8651() && var1 != null && var2 != null && var3 != null) {
         if (this.f_30732.m_7568(f_30848)) {
            this.m_8655(var1, var2, var3);
         } else {
            RenderTarget var4 = f_11537.gameRenderer.mainRenderTarget();
            if (var4 != null && var4.getColorTexture() != null && var4.getDepthTexture() != null && !var4.getDepthTexture().isClosed()) {
               int var5 = Math.max(1, var4.width);
               int var6 = Math.max(1, var4.height);
               this.m_8642(Math.max(1, (var5 + 1) / 2), Math.max(1, (var6 + 1) / 2));
               this.m_8656();
               float var7 = var3.getGameTimeDeltaPartialTick(false);
               Vec3 var8 = f_11537.gameRenderer.mainCamera().position();
               float var9 = this.m_8644(var8);
               if (f_11537.player.onGround()) {
                  this.f_30760 = f_11537.level;
                  this.f_30762 = var9;
               } else if (this.f_30760 == f_11537.level && Float.isFinite(this.f_30762) && !(Math.abs(var9 - this.f_30762) > f_30849)) {
                  this.f_30762 = Mth.lerp(f_30850, this.f_30762, var9);
               } else {
                  this.f_30760 = f_11537.level;
                  this.f_30762 = var9;
               }

               if (Float.isFinite(this.f_30763) && !(Math.abs(var8.y - this.f_30763) > f_30851)) {
                  this.f_30763 = Mth.lerp(f_30852, this.f_30763, (float)var8.y);
               } else {
                  this.f_30763 = (float)var8.y;
               }

               float var10 = (Float)f_11537.gameRenderer.mainCamera().attributeProbe().getValue(EnvironmentAttributes.SUN_ANGLE, var7) * f_30853;
               float var11 = -Mth.sin(var10);
               float var12 = Mth.cos(var10);
               float var13 = m_8673(f_30854, f_30855, var12);
               float var14 = this.f_30740.m_8768() ? m_8673(f_30856, f_30857, -var12) * f_30858 : 0.0F;
               boolean var15 = var13 >= var14;
               float var16 = var15 ? var11 : -var11;
               float var17 = var15 ? var12 : -var12;
               float var18 = var15 ? var13 : var14;
               boolean var19 = !this.f_30733.m_8768();
               Vector4f var20 = new Vector4f(var16, var17, 0.0F, 0.0F);
               new Matrix4f(var2).transform(var20);
               new Matrix4f(var1).transform(var20);
               float var21 = f_30859;
               float var22 = f_30860;
               float var23 = 0.0F;
               if (var20.w > f_30861) {
                  var21 = var20.x / var20.w * f_30862 + f_30863;
                  var22 = var20.y / var20.w * f_30864 + f_30865;
                  float var24 = (float)var5 / var6;
                  float var25 = (float)Math.sqrt(Math.pow((var21 - f_30866) * var24, f_30867) + Math.pow(var22 - f_30868, f_30869));
                  float var26 = m_8673(f_30870, f_30871, var20.w);
                  var23 = var18 * var26 * (1.0F - m_8673(f_30872, f_30873, var25));
               }

               float var43 = ((float)(f_11537.level.getGameTime() % f_30874) + var7) / f_30875;
               Vector4f var44 = Class_BftdentXEtGbugJw.m_2298(
                  this.f_30742.m_8768() ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : this.f_30743.m_8768()
               );
               Vector4f var45 = Class_BftdentXEtGbugJw.m_2298(
                  this.f_30742.m_8768() ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN_TWO) : this.f_30744.m_8768()
               );
               Matrix4f var27 = new Matrix4f(var1).invert();
               Matrix4f var28 = new Matrix4f(var2).invert();
               CommandEncoder var29 = RenderSystem.getDevice().createCommandEncoder();
               MemoryStack var30 = MemoryStack.stackPush();

               try {
                  ByteBuffer var31 = Std140Builder.onStack(var30, 256)
                     .putMat4f(var27)
                     .putMat4f(var28)
                     .putVec4(m_8665(var8.x), this.f_30763, m_8665(var8.z), this.f_30762)
                     .putVec4(var16, var17, 0.0F, var18)
                     .putVec4(var21, var22, var23, !var19 ? f_30876 : (this.f_30737.m_8768() && this.f_30739.m_8768() ? 1.0F : 0.0F))
                     .putVec4(var13, var14, this.m_8649(), var15 ? 1.0F : 0.0F)
                     .putVec4(
                        this.f_30735.m_8768(), this.f_30736.m_8768(), this.f_30741.m_8768(), var19 && this.f_30737.m_8768() ? this.f_30738.m_8768() : 0.0F
                     )
                     .putVec4(var5, var6, var43, f_11537.options.getEffectiveRenderDistance() * f_30877)
                     .putVec4(var44.x, var44.y, var44.z, 1.0F)
                     .putVec4(var45.x, var45.y, var45.z, 1.0F)
                     .get();
                  var29.writeToBuffer(this.f_30758.slice(), var31);
                  RenderPass var32 = var29.createRenderPass(() -> f_31033, this.f_30756.getColorTextureView(), Optional.empty());

                  try {
                     var32.setPipeline(this.f_30751);
                     var32.bindTexture(f_30878, var4.getDepthTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
                     var32.setUniform(f_30879, this.f_30758);
                     var32.draw(3, 1, 0, 0);
                  } catch (Throwable var41) {
                     if (var32 != null) {
                        try {
                           var32.close();
                        } catch (Throwable var38) {
                           var41.addSuppressed(var38);
                        }
                     }

                     throw var41;
                  }

                  if (var32 != null) {
                     var32.close();
                  }
               } catch (Throwable var42) {
                  if (var30 != null) {
                     try {
                        var30.close();
                     } catch (Throwable var37) {
                        var42.addSuppressed(var37);
                     }
                  }

                  throw var42;
               }

               if (var30 != null) {
                  var30.close();
               }

               RenderPass var46 = var29.createRenderPass(() -> f_31032, var4.getColorTextureView(), Optional.empty());

               try {
                  var46.setPipeline(this.f_30752);
                  var46.setUniform(f_30880, this.f_30758);
                  var46.bindTexture(f_30881, this.f_30756.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
                  var46.draw(3, 1, 0, 0);
               } catch (Throwable var40) {
                  if (var46 != null) {
                     try {
                        var46.close();
                     } catch (Throwable var36) {
                        var40.addSuppressed(var36);
                     }
                  }

                  throw var40;
               }

               if (var46 != null) {
                  var46.close();
               }

               if (var19 && this.f_30737.m_8768()) {
                  RenderPass var47 = var29.createRenderPass(() -> f_31031, var4.getColorTextureView(), Optional.empty());

                  try {
                     var47.setPipeline(this.f_30753);
                     var47.setUniform(f_30882, this.f_30758);
                     var47.bindTexture(f_30883, this.f_30756.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
                     var47.draw(3, 1, 0, 0);
                  } catch (Throwable var39) {
                     if (var47 != null) {
                        try {
                           var47.close();
                        } catch (Throwable var35) {
                           var39.addSuppressed(var35);
                        }
                     }

                     throw var39;
                  }

                  if (var47 != null) {
                     var47.close();
                  }
               }
            }
         }
      }
   }

   private static float m_8665(double var0) {
      double var2 = var0 % f_31022;
      return (float)(var2 < 0.0 ? var2 + f_31023 : var2);
   }

   private static void m_8669(float[] var0, int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = (float)Math.cbrt(f_30976 * m_8671(var2) + f_30977 * m_8671(var3) + f_30978 * m_8671(var4));
      float var10 = (float)Math.cbrt(f_30979 * m_8671(var2) + f_30980 * m_8671(var3) + f_30981 * m_8671(var4));
      float var11 = (float)Math.cbrt(f_30982 * m_8671(var2) + f_30983 * m_8671(var3) + f_30984 * m_8671(var4));
      float var12 = (float)Math.cbrt(f_30985 * m_8671(var5) + f_30986 * m_8671(var6) + f_30987 * m_8671(var7));
      float var13 = (float)Math.cbrt(f_30988 * m_8671(var5) + f_30989 * m_8671(var6) + f_30990 * m_8671(var7));
      float var14 = (float)Math.cbrt(f_30991 * m_8671(var5) + f_30992 * m_8671(var6) + f_30993 * m_8671(var7));
      float var15 = Mth.lerp(m_8661(var8), var9, var12);
      float var16 = Mth.lerp(m_8661(var8), var10, var13);
      float var17 = Mth.lerp(m_8661(var8), var11, var14);
      float var18 = var15 * var15 * var15;
      float var19 = var16 * var16 * var16;
      float var20 = var17 * var17 * var17;
      var0[var1] = m_8672(f_30994 * var18 - f_30995 * var19 + f_30996 * var20);
      var0[var1 + 1] = m_8672(f_30997 * var18 + f_30998 * var19 - f_30999 * var20);
      var0[var1 + 2] = m_8672(f_31000 * var18 - f_31001 * var19 + f_31002 * var20);
   }

   public FogAtmosphere() {
      super(f_30768, f_30769, Category.RENDER);
      this.f_30732 = new MultiChoiceSetting(f_30770, new Class_2ZaVm8TGDJ68TnJB(f_30771), new Class_2ZaVm8TGDJ68TnJB(f_30772));
      this.f_30733 = new CheckboxSetting(f_30773, false);
      this.f_30734 = new MultiChoiceSetting(f_30774, new Class_2ZaVm8TGDJ68TnJB(f_30775), new Class_2ZaVm8TGDJ68TnJB(f_30776))
         .m_822(() -> this.f_30732.m_7568(f_31051));
      this.f_30735 = new SliderSetting(f_30777, 1.0F, f_30778, f_30779).m_828(f_30780).m_822(() -> this.f_30732.m_7568(f_31050));
      this.f_30736 = new SliderSetting(f_30781, f_30782, 2.0F, f_30783).m_828(1.0F).m_822(() -> this.f_30732.m_7568(f_31049));
      this.f_30737 = new CheckboxSetting(f_30784, true).m_822(() -> this.f_30732.m_7568(f_31048) && !this.f_30733.m_8768());
      this.f_30738 = new SliderSetting(f_30785, 1.0F, f_30786, 2.0F)
         .m_828(f_30787)
         .m_822(() -> this.f_30732.m_7568(f_31047) && !this.f_30733.m_8768() && this.f_30737.m_8768());
      this.f_30739 = new CheckboxSetting(f_30788, true).m_822(() -> this.f_30732.m_7568(f_31046) && !this.f_30733.m_8768() && this.f_30737.m_8768());
      this.f_30740 = new CheckboxSetting(f_30789, true).m_822(() -> this.f_30732.m_7568(f_31045));
      this.f_30741 = new SliderSetting(f_30790, f_30791, f_30792, f_30793).m_828(f_30794).m_822(() -> this.f_30732.m_7568(f_31044));
      this.f_30742 = new CheckboxSetting(f_30795, true).m_822(() -> this.f_30732.m_7568(f_31043));
      this.f_30743 = new ColorSetting(f_30796, false, f_30797).m_822(() -> this.f_30732.m_7568(f_31042) && !this.f_30742.m_8768());
      this.f_30744 = new ColorSetting(f_30798, false, -21126).m_822(() -> this.f_30732.m_7568(f_31041) && !this.f_30742.m_8768());
      this.f_30745 = new MultiChoiceSetting(
            f_30799, new Class_2ZaVm8TGDJ68TnJB(f_30800), new Class_2ZaVm8TGDJ68TnJB(f_30801), new Class_2ZaVm8TGDJ68TnJB(f_30802)
         )
         .m_822(() -> this.f_30732.m_7568(f_31040));
      this.f_30746 = new SliderSetting(f_30803, f_30804, f_30805, f_30806).m_828(f_30807).m_822(() -> this.f_30732.m_7568(f_31039));
      this.f_30747 = new SliderSetting(f_30808, f_30809, f_30810, f_30811).m_828(1.0F).m_822(() -> this.f_30732.m_7568(f_31038));
      this.f_30748 = new SliderSetting(f_30812, f_30813, 0.0F, 1.0F).m_828(f_30814).m_822(() -> this.f_30732.m_7568(f_31037) && !this.f_30733.m_8768());
      this.f_30749 = new SliderSetting(f_30815, f_30816, 0.0F, 1.0F).m_828(f_30817).m_822(() -> this.f_30732.m_7568(f_31036) && !this.f_30733.m_8768());
      this.f_30750 = new ColorSetting(f_30818, false, -21126).m_822(() -> this.f_30732.m_7568(f_31034) && this.f_30745.m_7568(f_31035));
      this.f_30751 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_30819)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_30820))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_30821))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2727()
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_30822, UniformType.UNIFORM_BUFFER)
         .m_2741(f_30823)
         .m_2722();
      this.f_30752 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_30824)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_30825))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_30826))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_30827, UniformType.UNIFORM_BUFFER)
         .m_2741(f_30828)
         .m_2722();
      this.f_30753 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_30829)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_30830))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_30831))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.ADDITIVE)
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_30832, UniformType.UNIFORM_BUFFER)
         .m_2741(f_30833)
         .m_2722();
      this.f_30754 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_30834)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_30835))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_30836))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2727()
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_30837, UniformType.UNIFORM_BUFFER)
         .m_2741(f_30838)
         .m_2741(f_30839)
         .m_2722();
      this.f_30755 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_30840)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_30841))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_30842))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2727()
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_30843, UniformType.UNIFORM_BUFFER)
         .m_2741(f_30844)
         .m_2741(f_30845)
         .m_2722();
      this.f_30762 = Float.NaN;
      this.f_30763 = Float.NaN;
      this.f_30764 = Float.NaN;
      this.f_30765 = f_30846;
      this.f_30766 = f_30847;
      this.f_30767 = this::m_8660;
      this.m_795(
         this.f_30732,
         this.f_30733,
         this.f_30734,
         this.f_30735,
         this.f_30736,
         this.f_30737,
         this.f_30738,
         this.f_30739,
         this.f_30740,
         this.f_30741,
         this.f_30742,
         this.f_30743,
         this.f_30744,
         this.f_30745,
         this.f_30746,
         this.f_30747,
         this.f_30748,
         this.f_30749,
         this.f_30750
      );
   }

   private static float m_8671(float var0) {
      return var0 <= f_31003 ? var0 / f_31004 : (float)Math.pow((var0 + f_31005) / f_31006, f_31007);
   }

   private static float m_8672(float var0) {
      var0 = m_8661(var0);
      return var0 <= f_31008 ? var0 * f_31009 : (float)(f_31010 * Math.pow(var0, f_31011) - f_31012);
   }

   private static float m_8673(float var0, float var1, float var2) {
      float var3 = Mth.clamp((var2 - var0) / (var1 - var0), 0.0F, 1.0F);
      return var3 * var3 * (f_31024 - 2.0F * var3);
   }

   private float[] m_8674() {
      float[] var1 = new float[18];
      if (this.f_30745.m_7568(f_30910)) {
         m_8648(var1, 0, f_30911, f_30912, f_30913);
         m_8648(var1, 3, f_30914, f_30915, f_30916);
         m_8648(var1, 6, f_30917, f_30918, f_30919);
         m_8648(var1, 9, f_30920, f_30921, f_30922);
         m_8648(var1, 12, f_30923, f_30924, f_30925);
         m_8648(var1, 15, f_30926, f_30927, f_30928);
         return var1;
      }

      int var2 = this.f_30745.m_7568(f_30929) ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : this.f_30750.m_8768();
      float var3 = (var2 >> 16 & 0xFF) / f_30930;
      float var4 = (var2 >> 8 & 0xFF) / f_30931;
      float var5 = (var2 & 0xFF) / f_30932;
      if (this.f_30745.m_7568(f_30933)) {
         m_8669(var1, 0, f_30934, f_30935, f_30936, var3, var4, var5, f_30937);
         m_8669(var1, 3, var3, var4, var5, 1.0F, f_30938, f_30939, f_30940);
         m_8669(var1, 6, f_30941, f_30942, f_30943, var3, var4, var5, f_30944);
         m_8669(var1, 9, var3, var4, var5, f_30945, f_30946, f_30947, f_30948);
         m_8669(var1, 12, f_30949, f_30950, f_30951, var3, var4, var5, f_30952);
         m_8669(var1, 15, var3, var4, var5, 1.0F, f_30953, f_30954, f_30955);
      } else {
         m_8669(var1, 0, f_30956, f_30957, f_30958, var3, var4, var5, f_30959);
         m_8648(var1, 3, m_8661(var3 * f_30960), m_8661(var4 * f_30961), m_8661(var5 * f_30962));
         m_8648(var1, 6, f_30963, f_30964, f_30965);
         m_8669(var1, 9, var3, var4, var5, f_30966, f_30967, f_30968, f_30969);
         m_8648(var1, 12, f_30970, f_30971, f_30972);
         m_8648(var1, 15, m_8661(var3 * f_30973), m_8661(var4 * f_30974), m_8661(var5 * f_30975));
      }

      return var1;
   }
}
