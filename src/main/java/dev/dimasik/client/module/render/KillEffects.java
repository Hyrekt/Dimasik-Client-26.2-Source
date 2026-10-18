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
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.module.combat.Aura;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ColorSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_PoKta0VE7AdhY1En;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_ZPRMV6aCWVosHRWh;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_wjdoxQGtI8mFyL6U;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.Camera;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.client.resources.sounds.SimpleSoundInstance;
import net.minecraft.client.resources.sounds.SoundInstance.Attenuation;
import net.minecraft.network.protocol.game.ClientboundEntityEventPacket;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;
import org.joml.Matrix4f;
import org.joml.Vector4f;

public class KillEffects extends Module {
   private static KillEffects f_35739;
   private static final Identifier f_35740 = Identifier.fromNamespaceAndPath(KillEffects.f_36000, KillEffects.f_36001);
   private static final Identifier f_35741 = Identifier.fromNamespaceAndPath(KillEffects.f_36002, KillEffects.f_36003);
   private static final Identifier f_35742 = Identifier.fromNamespaceAndPath(KillEffects.f_36004, KillEffects.f_36005);
   private static final Identifier f_35743 = Identifier.fromNamespaceAndPath(KillEffects.f_36006, KillEffects.f_36007);
   private static final Identifier f_35744 = Identifier.fromNamespaceAndPath(KillEffects.f_36008, KillEffects.f_36009);
   private static final Identifier f_35745 = Identifier.fromNamespaceAndPath(KillEffects.f_36010, KillEffects.f_36011);
   private static final SoundEvent f_35746 = SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(KillEffects.f_36012, KillEffects.f_36013));
   private static final SoundEvent f_35747 = SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(KillEffects.f_36014, KillEffects.f_36015));
   private static final long f_35748 = 2500L;
   private final MultiChoiceSetting f_35749;
   private final CheckboxSetting f_35750;
   private final CheckboxSetting f_35751;
   private final CheckboxSetting f_35752;
   private final ColorSetting f_35753;
   private final SliderSetting f_35754;
   private final SliderSetting f_35755;
   private final SliderSetting f_35756;
   private final List<KillEffects.MiUCHqwvH8v17vSp> f_35757;
   private final List<KillEffects.n5KQnEFBILjiQvqr> f_35758;
   private final List<KillEffects.X6Phhxbx0Qk7mEMX> f_35759;
   private final List<KillEffects.exDnHi1I29USMwdX> f_35760;
   private final List<KillEffects.ezhug9ZaTGQ8yz5o> f_35761;
   private final Set<Integer> f_35762;
   private final Set<Integer> f_35763;
   private float f_35764;
   private float f_35765;
   private float f_35766;
   private float f_35767;
   private boolean f_35768;
   private boolean f_35769;
   private LivingEntity f_35770;
   private int f_35771;
   private long f_35772;
   private final RenderPipeline f_35773;
   private final RenderPipeline f_35774;
   private final Class_gEPk7yDw6CwIte87<Class_wjdoxQGtI8mFyL6U> f_35775;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_35776;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_35777;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_35778;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_35779;
   private static final String f_35780 = "KillEffects";
   private static final String f_35781 = "Эффекты при убийстве и тотеме";
   private static final String f_35782 = "Режим";
   private static final String f_35783 = "Фраг";
   private static final String f_35784 = "Души";
   private static final String f_35785 = "Волна";
   private static final String f_35786 = "Молния";
   private static final String f_35787 = "Без мобов";
   private static final String f_35788 = "Эффект тотема";
   private static final String f_35789 = "Авто цвет под тему";
   private static final String f_35790 = "Цвет";
   private static final int f_35791 = -8585238;
   private static final String f_35792 = "Размер";
   private static final float f_35793 = 0.4F;
   private static final float f_35794 = 0.05F;
   private static final String f_35795 = "Длительность";
   private static final float f_35796 = 1.8F;
   private static final float f_35797 = 0.6F;
   private static final float f_35798 = 4.0F;
   private static final float f_35799 = 0.1F;
   private static final String f_35800 = "Плотность";
   private static final float f_35801 = 0.4F;
   private static final float f_35802 = 0.1F;
   private static final String f_35803 = "dimasik/kill_effects";
   private static final String f_35804 = "dead_chams";
   private static final String f_35805 = "dead_chams";
   private static final String f_35806 = "Sampler0";
   private static final String f_35807 = "dimasik/kill_effects_overlay";
   private static final String f_35808 = "dead_chams";
   private static final String f_35809 = "dead_chams";
   private static final String f_35810 = "Sampler0";
   private static final String f_35811 = "Фраг";
   private static final float f_35812 = 6.0F;
   private static final float f_35813 = 0.45F;
   private static final double f_35814 = 100.0;
   private static final long f_35815 = 300L;
   private static final float f_35816 = 0.8F;
   private static final String f_35817 = "Фраг";
   private static final float f_35818 = 0.2F;
   private static final float f_35819 = 0.2F;
   private static final float f_35820 = 0.06F;
   private static final float f_35821 = 0.998F;
   private static final float f_35822 = 2400.0F;
   private static final float f_35823 = 2.4F;
   private static final float f_35824 = 320.0F;
   private static final float f_35825 = 3.2F;
   private static final float f_35826 = 0.035F;
   private static final float f_35827 = 0.01F;
   private static final float f_35828 = 0.06F;
   private static final float f_35829 = 0.97F;
   private static final float f_35830 = 0.04F;
   private static final float f_35831 = 0.01F;
   private static final float f_35832 = 0.35F;
   private static final long f_35833 = 180L;
   private static final String f_35834 = "Фраг";
   private static final float f_35835 = 0.5F;
   private static final float f_35836 = 0.55F;
   private static final float f_35837 = 0.99F;
   private static final float f_35838 = 0.12F;
   private static final long f_35839 = 80L;
   private static final float f_35840 = 180.0F;
   private static final float f_35841 = 1.6F;
   private static final float f_35842 = 520.0F;
   private static final float f_35843 = 2.8F;
   private static final String f_35844 = "Фраг";
   private static final float f_35845 = 0.1F;
   private static final float f_35846 = 0.35F;
   private static final float f_35847 = 0.75F;
   private static final long f_35848 = 220L;
   private static final float f_35849 = 900.0F;
   private static final float f_35850 = 2800.0F;
   private static final float f_35851 = 3.5F;
   private static final float f_35852 = 0.95F;
   private static final float f_35853 = 0.1F;
   private static final double f_35854 = 0.5;
   private static final double f_35855 = 180.0 / Math.PI;
   private static final float f_35856 = 90.0F;
   private static final double f_35857 = 180.0 / Math.PI;
   private static final float f_35858 = 7.0F;
   private static final float f_35859 = 20.0F;
   private static final float f_35860 = 1.5F;
   private static final float f_35861 = 0.35F;
   private static final float f_35862 = 0.5F;
   private static final float f_35863 = 4.0F;
   private static final double f_35864 = 0.45;
   private static final float f_35865 = 0.4F;
   private static final float f_35866 = 1.4F;
   private static final float f_35867 = 360.0F;
   private static final float f_35868 = 0.3F;
   private static final float f_35869 = 40.0F;
   private static final float f_35870 = 0.8F;
   private static final float f_35871 = 0.5F;
   private static final String f_35872 = "Души";
   private static final String f_35873 = "Волна";
   private static final String f_35874 = "Молния";
   private static final float f_35875 = 28.0F;
   private static final double f_35876 = 0.5;
   private static final double f_35877 = 1.4;
   private static final double f_35878 = 0.5;
   private static final double f_35879 = 1.4;
   private static final double f_35880 = 0.5;
   private static final double f_35881 = 0.02;
   private static final double f_35882 = 0.04;
   private static final double f_35883 = 0.06;
   private static final double f_35884 = 0.5;
   private static final double f_35885 = 0.02;
   private static final float f_35886 = 0.35F;
   private static final float f_35887 = 0.45F;
   private static final float f_35888 = 0.85F;
   private static final float f_35889 = 0.4F;
   private static final float f_35890 = (float) (Math.PI * 2);
   private static final double f_35891 = 0.05;
   private static final float f_35892 = 2.4F;
   private static final float f_35893 = 700.0F;
   private static final double f_35894 = 0.05;
   private static final float f_35895 = 1.6F;
   private static final float f_35896 = 550.0F;
   private static final long f_35897 = 80L;
   private static final float f_35898 = 40.0F;
   private static final double f_35899 = (float) (Math.PI * 2);
   private static final double f_35900 = 0.08;
   private static final double f_35901 = 0.14;
   private static final double f_35902 = 0.2;
   private static final double f_35903 = 0.2;
   private static final double f_35904 = 0.5;
   private static final double f_35905 = 0.2;
   private static final double f_35906 = 0.02;
   private static final double f_35907 = 0.05;
   private static final float f_35908 = 0.28F;
   private static final float f_35909 = 0.35F;
   private static final float f_35910 = 0.75F;
   private static final float f_35911 = 3.0F;
   private static final double f_35912 = 0.5;
   private static final double f_35913 = 0.5;
   private static final double f_35914 = 0.4;
   private static final double f_35915 = 0.4;
   private static final double f_35916 = 4.5;
   private static final double f_35917 = 2.5;
   private static final float f_35918 = 450.0F;
   private static final float f_35919 = 36.0F;
   private static final double f_35920 = (float) (Math.PI * 2);
   private static final double f_35921 = 0.05;
   private static final double f_35922 = 0.12;
   private static final double f_35923 = 0.5;
   private static final double f_35924 = 0.5;
   private static final double f_35925 = 0.5;
   private static final double f_35926 = 0.4;
   private static final double f_35927 = 0.5;
   private static final double f_35928 = 0.03;
   private static final double f_35929 = 0.08;
   private static final float f_35930 = 0.22F;
   private static final float f_35931 = 0.3F;
   private static final float f_35932 = 0.65F;
   private static final float f_35933 = 360.0F;
   private static final String f_35934 = "Фраг";
   private static final float f_35935 = 0.005F;
   private static final float f_35936 = 0.005F;
   private static final float f_35937 = 0.005F;
   private static final float f_35938 = 0.005F;
   private static final float f_35939 = 0.75F;
   private static final float f_35940 = 255.0F;
   private static final float f_35941 = 255.0F;
   private static final float f_35942 = 1.25F;
   private static final float f_35943 = 255.0F;
   private static final float f_35944 = 1.25F;
   private static final float f_35945 = 190.0F;
   private static final String f_35946 = "killEffectsOverlay";
   private static final float f_35947 = 3.0F;
   private static final float f_35948 = 0.02F;
   private static final int f_35949 = 16777215;
   private static final int f_35950 = 16777215;
   private static final float f_35951 = 0.35F;
   private static final float f_35952 = 18.0F;
   private static final float f_35953 = 0.03F;
   private static final float f_35954 = 0.05F;
   private static final float f_35955 = 0.5F;
   private static final float f_35956 = 0.5F;
   private static final float f_35957 = 0.62F;
   private static final float f_35958 = 1.2F;
   private static final float f_35959 = 1.2F;
   private static final float f_35960 = 360.0F;
   private static final float f_35961 = 360.0F;
   private static final String f_35962 = "killEffectsFragGlow";
   private static final String f_35963 = "killEffectsFragStar";
   private static final float f_35964 = 1.4F;
   private static final float f_35965 = 0.85F;
   private static final float f_35966 = 0.001F;
   private static final String f_35967 = "killEffectsParticles";
   private static final float f_35968 = 0.15F;
   private static final float f_35969 = 0.15F;
   private static final float f_35970 = 0.85F;
   private static final String f_35971 = "killEffectsRings";
   private static final float f_35972 = 0.2F;
   private static final float f_35973 = 0.2F;
   private static final float f_35974 = 0.2F;
   private static final float f_35975 = 0.8F;
   private static final float f_35976 = 0.12F;
   private static final float f_35977 = 0.45F;
   private static final float f_35978 = 0.45F;
   private static final String f_35979 = "killEffectsBolts";
   private static final double f_35980 = 1.0E-6;
   private static final long f_35981 = 40L;
   private static final double f_35982 = 0.55;
   private static final double f_35983 = 0.5;
   private static final double f_35984 = 2.0;
   private static final double f_35985 = 0.5;
   private static final double f_35986 = 2.0;
   private static final double f_35987 = 1.0E-8;
   private static final float f_35988 = 90.0F;
   private static final float f_35989 = 0.5F;
   private static final float f_35990 = 0.5F;
   private static final String f_35991 = "Sampler0";
   private static final float f_35992 = 0.5F;
   private static final float f_35993 = -2.0F;
   private static final double f_35994 = 2.0;
   private static final String f_35995 = "Фраг";
   private static final String f_35996 = "Фраг";
   private static final String f_35997 = "Фраг";
   private static final String f_35998 = "Фраг";
   private static final String f_35999 = "Фраг";
   private static final String f_36000 = "dimasik";
   private static final String f_36001 = "textures/world/glow.png";
   private static final String f_36002 = "dimasik";
   private static final String f_36003 = "textures/world/dashbloom.png";
   private static final String f_36004 = "dimasik";
   private static final String f_36005 = "textures/world/star.png";
   private static final String f_36006 = "dimasik";
   private static final String f_36007 = "textures/world/lightning.png";
   private static final String f_36008 = "dimasik";
   private static final String f_36009 = "icons/world_render/circle2.png";
   private static final String f_36010 = "dimasik";
   private static final String f_36011 = "images/killeffects/vignette.png";
   private static final String f_36012 = "dimasik";
   private static final String f_36013 = "strikesf_2";
   private static final String f_36014 = "dimasik";
   private static final String f_36015 = "strikesf_5";

   private int m_9729(BufferBuilder var1, PoseStack var2, Vec3 var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      Vector4f var10 = Class_BftdentXEtGbugJw.m_2298(var9);
      float var11 = var4 * f_35989;
      float var12 = var5 * f_35990;
      var2.pushPose();
      var2.translate(var3.x, var3.y, var3.z);
      var2.mulPose(Axis.YP.rotationDegrees(-var7));
      var2.mulPose(Axis.XP.rotationDegrees(var8));
      if (var6 != 0.0F) {
         var2.mulPose(Axis.ZP.rotationDegrees(var6));
      }

      Matrix4f var13 = var2.last().pose();
      this.m_9760(var1, var13, -var11, -var12, 0.0F, 0.0F, 0.0F, var10);
      this.m_9760(var1, var13, -var11, var12, 0.0F, 0.0F, 1.0F, var10);
      this.m_9760(var1, var13, var11, var12, 0.0F, 1.0F, 1.0F, var10);
      this.m_9760(var1, var13, var11, -var12, 0.0F, 1.0F, 0.0F, var10);
      var2.popPose();
      return 4;
   }

   private void m_9730() {
      long var1 = System.currentTimeMillis();
      if (this.f_35771 == 0) {
         if (Class_ZPRMV6aCWVosHRWh.m_5822() != 1.0F && this.f_35764 <= 0.0F && this.f_35766 <= 0.0F) {
            Class_ZPRMV6aCWVosHRWh.m_5820(1.0F);
         }
      } else {
         if (var1 >= this.f_35772) {
            if (this.f_35771 == 1) {
               Class_ZPRMV6aCWVosHRWh.m_5820(f_35832);
               this.f_35771 = 2;
               this.f_35772 = var1 + f_35833;
            } else {
               Class_ZPRMV6aCWVosHRWh.m_5820(1.0F);
               this.f_35771 = 0;
            }
         }
      }
   }

   public static float m_9733() {
      if (f_35739 != null && f_35739.m_776() && f_35739.f_35749.m_7568(f_35811)) {
         float var0 = Math.min(f_35739.m_9761() + m_9737(f_35739.f_35766) / f_35812, 1.0F);
         return 1.0F + var0 * f_35813;
      } else {
         return 1.0F;
      }
   }

   private static float m_9737(float var0) {
      var0 = Mth.clamp(var0, 0.0F, 1.0F);
      return var0 < f_35992 ? 2.0F * var0 * var0 : 1.0F - (float)Math.pow(f_35993 * var0 + 2.0F, f_35994) / 2.0F;
   }

   private void m_9740(SoundEvent var1, float var2) {
      if (f_11537.getSoundManager() != null) {
         f_11537.getSoundManager()
            .play(
               new SimpleSoundInstance(
                  var1.location(),
                  SoundSource.MASTER,
                  var2,
                  f_35852 + ThreadLocalRandom.current().nextFloat() * f_35853,
                  RandomSource.create(),
                  false,
                  0,
                  Attenuation.NONE,
                  0.0,
                  0.0,
                  0.0,
                  true
               )
            );
      }
   }

   private void m_9741(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.level != null && f_11537.player != null) {
         try {
            Aura var2 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
            if (var2 != null && var2.m_776() && var2.m_1114() != null && var2.m_1114().isAlive()) {
               this.m_9766(var2.m_1114(), false);
            }
         } catch (Throwable var6) {
         }

         Iterator var7 = this.f_35757.iterator();

         while (var7.hasNext()) {
            KillEffects.MiUCHqwvH8v17vSp var3 = (KillEffects.MiUCHqwvH8v17vSp)var7.next();
            if (!var3.m_9719()) {
               var7.remove();
            } else {
               LivingEntity var4 = var3.f_35673;
               boolean var5 = f_11537.level.getEntity(var4.getId()) == null;
               if ((var4.getHealth() <= 0.0F || !var4.isAlive() || var5 && f_11537.player.distanceToSqr(var4) > f_35814) && !var3.f_35676) {
                  this.m_9763(var4);
                  var3.f_35676 = true;
                  var3.m_9718(f_35815);
               }
            }
         }

         this.f_35757.removeIf(var0 -> !var0.m_9719());
         this.m_9759();
         this.m_9730();
         this.f_35758.removeIf(KillEffects.n5KQnEFBILjiQvqr::m_9727);
         this.f_35763.removeIf(var0 -> f_11537.level.getEntity(var0) == null);
         Iterator var8 = this.f_35759.iterator();

         while (var8.hasNext()) {
            KillEffects.X6Phhxbx0Qk7mEMX var9 = (KillEffects.X6Phhxbx0Qk7mEMX)var8.next();
            var9.m_9723();
            if (var9.m_9722()) {
               var8.remove();
            }
         }

         long var10 = System.currentTimeMillis();
         this.f_35760.removeIf(var2x -> var10 - var2x.f_35718 > var2x.f_35719 + var2x.f_35720);
         this.f_35761.removeIf(var2x -> var10 - var2x.f_35726 > var2x.f_35727);
         if (this.f_35770 != null && this.f_35767 == 1.0F && this.f_35766 < f_35816) {
            this.m_9779(this.f_35770, (1.0F - this.f_35766 * this.f_35766) / 2.0F);
         }
      } else {
         this.m_9756();
         Class_ZPRMV6aCWVosHRWh.m_5820(1.0F);
      }
   }

   private void m_9742(BufferBuilder var1, Identifier var2, int var3, String var4, RenderPipeline var5, boolean var6) {
      MeshData var7 = var1.build();
      if (var7 != null) {
         if (var3 == 0) {
            var7.close();
         } else {
            GpuBuffer var8 = null;

            try {
               DrawState var9 = var7.drawState();
               int var10 = var9.indexCount();
               AutoStorageIndexBuffer var11 = RenderSystem.getSequentialBuffer(var9.primitiveTopology());
               GpuBuffer var12 = var11.getBuffer(var10);
               IndexType var13 = var11.type();
               var8 = RenderSystem.getDevice().createBuffer(() -> var4, 32, var7.vertexBuffer());
               RenderTarget var14 = f_11537.gameRenderer.mainRenderTarget();
               CommandEncoder var15 = RenderSystem.getDevice().createCommandEncoder();
               AbstractTexture var16 = f_11537.getTextureManager().getTexture(var2);
               RenderPass var17 = var15.createRenderPass(
                  () -> var4, var14.getColorTextureView(), Optional.empty(), var14.getDepthTextureView(), OptionalDouble.empty()
               );

               try {
                  RenderSystem.bindDefaultUniforms(var17);
                  var17.setPipeline(var5);
                  var17.bindTexture(f_35991, var16.getTextureView(), var16.getSampler());
                  var17.setVertexBuffer(0, var8.slice());
                  var17.setIndexBuffer(var12, var13);
                  var17.drawIndexed(var10, 1, 0, 0, 0);
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
               if (var8 != null) {
                  var8.close();
               }

               var7.close();
            }
         }
      }
   }

   private void m_9743(Class_bhRaN0YSSLQRYjPo var1) {
      if (this.f_35749.m_7568(f_35934) && var1.m_6083() != null) {
         float var2 = this.m_9761();
         float var3 = Mth.clamp(this.f_35766, 0.0F, 1.0F);
         if (!(var2 < f_35935) || !(var3 < f_35936)) {
            int var4 = f_11537.getWindow().getGuiScaledWidth();
            int var5 = f_11537.getWindow().getGuiScaledHeight();
            if (var2 > f_35937) {
               this.m_9754(var2, var4, var5);
            } else if (var3 > f_35938) {
               this.m_9754(var3 * f_35939, var4, var5);
            }
         }
      }
   }

   private void m_9744(Class_TZhU50s8XmBQCMP5 var1) {
      if (!this.f_35758.isEmpty()) {
         this.m_9748(var1);
      }

      if (!this.f_35759.isEmpty() || !this.f_35760.isEmpty() || !this.f_35761.isEmpty()) {
         this.m_9750(var1);
      }
   }

   private void m_9746(float var1, float var2, float var3, float var4, Vector4f var5, Identifier var6) {
      int var7 = f_11537.getWindow().getWidth();
      int var8 = f_11537.getWindow().getHeight();
      float var9 = f_11537.getWindow().getGuiScaledWidth();
      float var10 = f_11537.getWindow().getGuiScaledHeight();
      float var11 = var7 / var9;
      float var12 = var8 / var10;
      float var13 = var1 * var11;
      float var14 = var2 * var12;
      float var15 = (var1 + var3) * var11;
      float var16 = (var2 + var4) * var12;
      float var17 = var13 / var7 * 2.0F - 1.0F;
      float var18 = var15 / var7 * 2.0F - 1.0F;
      float var19 = 1.0F - var14 / var8 * 2.0F;
      float var20 = 1.0F - var16 / var8 * 2.0F;
      BufferBuilder var21 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
      Matrix4f var22 = new Matrix4f();
      var21.addVertex(var22, var17, var19, 0.0F).setUv(0.0F, 0.0F).setColor(var5.x, var5.y, var5.z, var5.w);
      var21.addVertex(var22, var17, var20, 0.0F).setUv(0.0F, 1.0F).setColor(var5.x, var5.y, var5.z, var5.w);
      var21.addVertex(var22, var18, var20, 0.0F).setUv(1.0F, 1.0F).setColor(var5.x, var5.y, var5.z, var5.w);
      var21.addVertex(var22, var18, var19, 0.0F).setUv(1.0F, 0.0F).setColor(var5.x, var5.y, var5.z, var5.w);
      this.m_9742(var21, var6, 4, f_35946, this.f_35774, true);
   }

   private int m_9747(BufferBuilder var1, Matrix4f var2, Vec3 var3, Vec3 var4, float var5, int var6) {
      Vector4f var7 = Class_BftdentXEtGbugJw.m_2298(var6);
      if (var4.subtract(var3).lengthSqr() < f_35987) {
         return 0;
      }

      double var8 = Math.toRadians(f_11537.gameRenderer.mainCamera().yRot() + f_35988);
      Vec3 var10 = new Vec3(Math.cos(var8), 0.0, Math.sin(var8)).normalize().scale(var5);
      Vec3 var11 = var3.add(var10);
      Vec3 var12 = var3.subtract(var10);
      Vec3 var13 = var4.add(var10);
      Vec3 var14 = var4.subtract(var10);
      this.m_9760(var1, var2, (float)var12.x, (float)var12.y, (float)var12.z, 0.0F, 0.0F, var7);
      this.m_9760(var1, var2, (float)var11.x, (float)var11.y, (float)var11.z, 0.0F, 1.0F, var7);
      this.m_9760(var1, var2, (float)var13.x, (float)var13.y, (float)var13.z, 1.0F, 1.0F, var7);
      this.m_9760(var1, var2, (float)var14.x, (float)var14.y, (float)var14.z, 1.0F, 0.0F, var7);
      return 4;
   }

   private void m_9748(Class_TZhU50s8XmBQCMP5 var1) {
      Camera var2 = f_11537.gameRenderer.mainCamera();
      Vec3 var3 = var2.position();
      PoseStack var4 = var1.m_5006();
      int var5 = Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
      short var6 = -25786;
      float var7 = 1.0F;
      BufferBuilder var8 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
      BufferBuilder var9 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
      int var10 = 0;
      int var11 = 0;

      for (KillEffects.n5KQnEFBILjiQvqr var13 : this.f_35758) {
         float var14 = Mth.clamp(Math.min(var13.m_9728() * f_35947, 1.0F) * var13.m_9726(), 0.0F, 1.0F) * var7;
         if (!(var14 < f_35948)) {
            int var15 = Class_BftdentXEtGbugJw.m_2306(-1, var14);
            int var16 = Class_BftdentXEtGbugJw.m_2306(f_35949 | var5 & f_35950, var14);
            int var17 = Class_BftdentXEtGbugJw.m_2302(Class_BftdentXEtGbugJw.m_2306(0, var14), var15, var13.f_35736);
            var17 = Class_BftdentXEtGbugJw.m_2302(var17, var16, f_35951);
            if (this.f_35768) {
               var17 = Class_BftdentXEtGbugJw.m_2302(var17, Class_BftdentXEtGbugJw.m_2306(var6, var14), Math.min(this.f_35766 * f_35952, 1.0F));
            }

            Vec3 var18 = var13.m_9725();
            if (this.m_9752(var3, var18)) {
               Vec3 var19 = var18.subtract(var3);
               float var20 = f_35953 + f_35954 * var13.m_9728() * (f_35955 + var13.f_35736 * f_35956);
               if (var13.f_35736 > f_35957) {
                  var11 += this.m_9729(var9, var4, var19, var20 * f_35958, var20 * f_35959, var13.f_35736 * f_35960, var2.yRot(), var2.xRot(), var17);
               } else {
                  var10 += this.m_9729(var8, var4, var19, var20, var20, var13.f_35736 * f_35961, var2.yRot(), var2.xRot(), var17);
               }
            }
         }
      }

      this.m_9742(var8, f_35740, var10, f_35962, this.f_35773, false);
      this.m_9742(var9, f_35742, var11, f_35963, this.f_35773, false);
   }

   private List<Vec3> m_9749(KillEffects.ezhug9ZaTGQ8yz5o var1, long var2) {
      ArrayList var4 = new ArrayList();
      Random var5 = new Random(var1.f_35728 ^ var2 / f_35981);
      byte var6 = 8;

      for (int var7 = 0; var7 <= var6; var7++) {
         float var8 = (float)var7 / var6;
         double var9 = Mth.lerp(var8, var1.f_35724, var1.f_35722);
         double var11 = (1.0 - var8) * f_35982;
         double var13 = var7 == var6 ? var1.f_35721 : var1.f_35721 + (var5.nextDouble() - f_35983) * var11 * f_35984;
         double var15 = var7 == var6 ? var1.f_35723 : var1.f_35723 + (var5.nextDouble() - f_35985) * var11 * f_35986;
         var4.add(new Vec3(var13, var9, var15));
      }

      return var4;
   }

   private void m_9750(Class_TZhU50s8XmBQCMP5 var1) {
      float var2 = var1.m_5005().getGameTimeDeltaPartialTick(true);
      Vec3 var3 = f_11537.gameRenderer.mainCamera().position();
      float var4 = f_11537.gameRenderer.mainCamera().yRot();
      float var5 = f_11537.gameRenderer.mainCamera().xRot();
      PoseStack var6 = var1.m_5006();
      if (!this.f_35760.isEmpty()) {
         this.m_9774(var6, var3);
      }

      if (!this.f_35761.isEmpty()) {
         this.m_9755(var6, var3, var4, var5);
      }

      if (!this.f_35759.isEmpty()) {
         this.m_9778(var6, var3, var4, var5, var2, KillEffects.EEYJfozBp1gWKUd2.SOUL, f_35741, f_35964);
         this.m_9778(var6, var3, var4, var5, var2, KillEffects.EEYJfozBp1gWKUd2.BURST, f_35742, 1.0F);
         this.m_9778(var6, var3, var4, var5, var2, KillEffects.EEYJfozBp1gWKUd2.SPARK, f_35740, f_35965);
      }
   }

   private boolean m_9751(LivingEntity var1) {
      if (var1 == null) {
         return false;
      }

      for (KillEffects.MiUCHqwvH8v17vSp var3 : this.f_35757) {
         if (var3.m_9719() && var3.f_35673.getId() == var1.getId()) {
            return true;
         }
      }

      return false;
   }

   private boolean m_9752(Vec3 var1, Vec3 var2) {
      if (f_11537.level != null && f_11537.player != null && !(var1.distanceToSqr(var2) < f_35980)) {
         BlockHitResult var3 = f_11537.level.clip(new ClipContext(var1, var2, Block.COLLIDER, Fluid.NONE, f_11537.player));
         return var3.getType() == Type.MISS;
      } else {
         return true;
      }
   }

   private void m_9754(float var1, int var2, int var3) {
      if (!(var1 * f_35940 < 1.0F)) {
         float var4 = var2 / 2.0F * (1.0F - var1) * (1.0F - var1);
         float var5 = var3 / 2.0F * (1.0F - var1) * (1.0F - var1);
         float var6 = -var4;
         float var7 = -var5;
         float var8 = var2 + var4 * 2.0F;
         float var9 = var3 + var5 * 2.0F;
         short var10 = 255;
         int var11 = (int)(f_35941 * (1.0F - var1 / f_35942));
         int var12 = (int)(f_35943 * (1.0F - var1 / f_35944));
         int var13 = (int)(f_35945 * var1);
         this.m_9746(var6, var7, var8, var9, Class_BftdentXEtGbugJw.m_2298(var13 << 24 | var10 << 16 | var11 << 8 | var12), f_35745);
      }
   }

   private void m_9755(PoseStack var1, Vec3 var2, float var3, float var4) {
      BufferBuilder var5 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
      int var6 = 0;
      long var7 = System.currentTimeMillis();
      Matrix4f var9 = var1.last().pose();

      for (KillEffects.ezhug9ZaTGQ8yz5o var11 : this.f_35761) {
         if (this.m_9752(var2, new Vec3(var11.f_35721, var11.f_35722, var11.f_35723))) {
            float var12 = (float)(var7 - var11.f_35726) / (float)var11.f_35727;
            if (!(var12 > 1.0F)) {
               float var13 = Mth.clamp(var12 < f_35972 ? var12 / f_35973 : 1.0F - (var12 - f_35974) / f_35975, 0.0F, 1.0F);
               int var14 = Class_BftdentXEtGbugJw.m_2306(var11.f_35725, var13);
               List var15 = this.m_9749(var11, var7);
               float var16 = f_35976 * this.f_35754.m_8768();

               for (int var17 = 0; var17 < var15.size() - 1; var17++) {
                  var6 += this.m_9747(var5, var9, ((Vec3)var15.get(var17)).subtract(var2), ((Vec3)var15.get(var17 + 1)).subtract(var2), var16, var14);
               }

               var6 += this.m_9729(
                  var5,
                  var1,
                  new Vec3(var11.f_35721, var11.f_35722, var11.f_35723).subtract(var2),
                  f_35977 * this.f_35754.m_8768(),
                  f_35978 * this.f_35754.m_8768(),
                  0.0F,
                  var3,
                  var4,
                  var14
               );
            }
         }
      }

      this.m_9742(var5, f_35743, var6, f_35979, this.f_35773, false);
   }

   public KillEffects() {
      super(f_35780, f_35781, Category.RENDER);
      this.f_35749 = new MultiChoiceSetting(
         f_35782,
         new Class_2ZaVm8TGDJ68TnJB(f_35783),
         new Class_2ZaVm8TGDJ68TnJB(f_35784),
         new Class_2ZaVm8TGDJ68TnJB(f_35785),
         new Class_2ZaVm8TGDJ68TnJB(f_35786)
      );
      this.f_35750 = new CheckboxSetting(f_35787, true);
      this.f_35751 = new CheckboxSetting(f_35788, true);
      this.f_35752 = new CheckboxSetting(f_35789, true).m_822(() -> !this.f_35749.m_7568(f_35999));
      this.f_35753 = new ColorSetting(f_35790, false, f_35791).m_822(() -> !this.f_35749.m_7568(f_35998) && !this.f_35752.m_8768());
      this.f_35754 = new SliderSetting(f_35792, 1.0F, f_35793, 2.0F).m_828(f_35794).m_822(() -> !this.f_35749.m_7568(f_35997));
      this.f_35755 = new SliderSetting(f_35795, f_35796, f_35797, f_35798).m_828(f_35799).m_822(() -> !this.f_35749.m_7568(f_35996));
      this.f_35756 = new SliderSetting(f_35800, 1.0F, f_35801, 2.0F).m_828(f_35802).m_822(() -> !this.f_35749.m_7568(f_35995));
      this.f_35757 = new ArrayList<>();
      this.f_35758 = new ArrayList<>();
      this.f_35759 = new ArrayList<>();
      this.f_35760 = new ArrayList<>();
      this.f_35761 = new ArrayList<>();
      this.f_35762 = new HashSet<>();
      this.f_35763 = new HashSet<>();
      this.f_35773 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_35803)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_35804))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_35805))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.ADDITIVE)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2741(f_35806)
         .m_2722();
      this.f_35774 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_35807)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_35808))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_35809))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.ADDITIVE)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2741(f_35810)
         .m_2722();
      this.f_35775 = this::m_9767;
      this.f_35776 = this::m_9780;
      this.f_35777 = this::m_9741;
      this.f_35778 = this::m_9743;
      this.f_35779 = this::m_9744;
      f_35739 = this;
      this.m_795(this.f_35749, this.f_35750, this.f_35751, this.f_35752, this.f_35753, this.f_35754, this.f_35755, this.f_35756);
   }

   private void m_9756() {
      this.f_35757.clear();
      this.f_35758.clear();
      this.f_35759.clear();
      this.f_35760.clear();
      this.f_35761.clear();
      this.f_35762.clear();
      this.f_35763.clear();
      this.f_35764 = this.f_35765 = 0.0F;
      this.f_35766 = this.f_35767 = 0.0F;
      this.f_35768 = false;
      this.f_35769 = false;
      this.f_35770 = null;
      this.f_35771 = 0;
   }

   private void m_9757(Vec3 var1, float var2, float var3, int var4, float var5, float var6, float var7) {
      ThreadLocalRandom var8 = ThreadLocalRandom.current();
      int var9 = Math.max(2, Math.round(f_35911 * var7));

      for (int var10 = 0; var10 < var9; var10++) {
         double var11 = var1.x + (var8.nextDouble() - f_35912) * var3;
         double var13 = var1.z + (var8.nextDouble() - f_35913) * var3;
         double var15 = var1.y + var2 * (f_35914 + var8.nextDouble() * f_35915);
         this.f_35761
            .add(
               new KillEffects.ezhug9ZaTGQ8yz5o(
                  var11, var15, var13, var15 + f_35916 + var8.nextDouble() * f_35917 * var5, var4, (long)(var6 * f_35918), var8.nextLong()
               )
            );
      }

      int var18 = Math.round(f_35919 * var7);

      for (int var19 = 0; var19 < var18; var19++) {
         double var12 = var8.nextDouble() * f_35920;
         double var14 = f_35921 + var8.nextDouble() * f_35922;
         Vec3 var16 = var1.add(
            (var8.nextDouble() - f_35923) * var3, var2 * f_35924 + (var8.nextDouble() - f_35925) * f_35926, (var8.nextDouble() - f_35927) * var3
         );
         Vec3 var17 = new Vec3(Math.cos(var12) * var14, f_35928 + var8.nextDouble() * f_35929, Math.sin(var12) * var14);
         this.f_35759
            .add(
               new KillEffects.X6Phhxbx0Qk7mEMX(
                  var16,
                  var17,
                  var4,
                  var5 * (f_35930 + var8.nextFloat() * f_35931),
                  var6 * f_35932,
                  KillEffects.EEYJfozBp1gWKUd2.SPARK,
                  var8.nextFloat() * f_35933
               )
            );
      }
   }

   private void m_9758(LivingEntity var1) {
      if (this.m_776() && this.m_9771(var1)) {
         Vec3 var2 = var1.position();
         float var3 = Math.max(var1.getBbHeight(), f_35870);
         float var4 = Math.max(var1.getBbWidth(), f_35871);
         int var5 = this.f_35752.m_8768() ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : this.f_35753.m_8768();
         float var6 = this.f_35754.m_8768();
         float var7 = this.f_35755.m_8768();
         float var8 = this.f_35756.m_8768();
         switch (this.f_35749.m_7564().m_1181()) {
            case f_35872:
               this.m_9769(var2, var3, var4, var5, var6, var7, var8);
               break;
            case f_35873:
               this.m_9768(var2, var3, var4, var5, var6, var7, var8);
               break;
            case f_35874:
               this.m_9757(var2, var3, var4, var5, var6, var7, var8);
         }
      }
   }

   private void m_9759() {
      if (!this.f_35749.m_7568(f_35817)) {
         this.f_35764 = Mth.lerp(f_35818, this.f_35764, 0.0F);
         this.f_35766 = Mth.lerp(f_35819, this.f_35766, 0.0F);
      } else {
         if (this.f_35765 == 1.0F) {
            this.f_35764 = Math.min(1.0F, this.f_35764 + f_35820);
            if (this.f_35764 > f_35821) {
               this.f_35764 = 1.0F;
               this.f_35765 = 0.0F;
               if (!this.f_35769 && this.f_35770 != null) {
                  this.m_9777(this.f_35770, 280, f_35822, f_35823);
                  this.m_9777(this.f_35770, 520, f_35824, f_35825);
                  this.f_35769 = true;
               }
            }
         } else {
            this.f_35764 = Math.max(0.0F, this.f_35764 - f_35826);
            if (this.f_35764 < f_35827) {
               this.f_35764 = 0.0F;
            }
         }

         if (this.f_35767 == 1.0F) {
            this.f_35766 = Math.min(1.0F, this.f_35766 + f_35828);
            if (this.f_35766 > f_35829) {
               this.f_35766 = 1.0F;
               this.f_35767 = 0.0F;
            }
         } else {
            this.f_35766 = Math.max(0.0F, this.f_35766 - f_35830);
            if (this.f_35766 < f_35831) {
               this.f_35766 = 0.0F;
            }
         }
      }
   }

   private void m_9760(BufferBuilder var1, Matrix4f var2, float var3, float var4, float var5, float var6, float var7, Vector4f var8) {
      var1.addVertex(var2, var3, var4, var5).setUv(var6, var7).setColor(var8.x, var8.y, var8.z, var8.w);
   }

   private float m_9761() {
      return Mth.clamp(this.f_35764, 0.0F, 1.0F);
   }

   private void m_9763(LivingEntity var1) {
      KillEffects.MiUCHqwvH8v17vSp var2 = null;

      for (KillEffects.MiUCHqwvH8v17vSp var4 : this.f_35757) {
         if (var4.f_35673.getId() == var1.getId()) {
            var2 = var4;
            break;
         }
      }

      if (var2 != null && var2.m_9719() && var2.f_35677) {
         this.m_9772(var1);
      }
   }

   private void m_9764(LivingEntity var1) {
      if (this.m_9771(var1) && this.f_35751.m_8768()) {
         if (this.m_9751(var1)) {
            this.f_35770 = var1;
            if (this.f_35749.m_7568(f_35844)) {
               this.f_35768 = true;
               this.f_35767 = 1.0F;
               this.f_35766 = f_35845;
               this.m_9740(f_35747, f_35846);
               Class_ZPRMV6aCWVosHRWh.m_5820(f_35847);
               this.f_35771 = 2;
               this.f_35772 = System.currentTimeMillis() + f_35848;
               this.m_9777(var1, 320, f_35849, 2.0F);
               this.m_9777(var1, 180, f_35850, f_35851);
            } else {
               this.m_9758(var1);
            }
         }
      }
   }

   private void m_9766(LivingEntity var1, boolean var2) {
      if (this.m_9771(var1)) {
         for (KillEffects.MiUCHqwvH8v17vSp var4 : this.f_35757) {
            if (var4.f_35673.getId() == var1.getId()) {
               var4.m_9717(var1);
               if (var2) {
                  var4.m_9716();
               }

               return;
            }
         }

         if (var2) {
            this.f_35757.clear();
            KillEffects.MiUCHqwvH8v17vSp var5 = new KillEffects.MiUCHqwvH8v17vSp(var1);
            var5.m_9716();
            this.f_35757.add(var5);
         }
      }
   }

   private void m_9767(Class_wjdoxQGtI8mFyL6U var1) {
      if (this.m_776() && var1.m_9372() == Class_wjdoxQGtI8mFyL6U.Class_327mRdjAqNoPaemJ.POST && var1.m_9371() == f_11537.player) {
         if (var1.m_9370() instanceof LivingEntity var2 && var2.isAlive()) {
            this.m_9766(var2, true);
         }
      }
   }

   private void m_9768(Vec3 var1, float var2, float var3, int var4, float var5, float var6, float var7) {
      this.f_35760.add(new KillEffects.exDnHi1I29USMwdX(var1.x, var1.y + f_35891, var1.z, var4, var5 * f_35892, (long)(var6 * f_35893)));
      this.f_35760.add(new KillEffects.exDnHi1I29USMwdX(var1.x, var1.y + f_35894, var1.z, var4, var5 * f_35895, (long)(var6 * f_35896), f_35897));
      int var8 = Math.round(f_35898 * var7);
      ThreadLocalRandom var9 = ThreadLocalRandom.current();

      for (int var10 = 0; var10 < var8; var10++) {
         double var11 = var9.nextDouble() * f_35899;
         double var13 = f_35900 + var9.nextDouble() * f_35901 * var5;
         Vec3 var15 = var1.add(Math.cos(var11) * var3 * f_35902, var2 * (f_35903 + var9.nextDouble() * f_35904), Math.sin(var11) * var3 * f_35905);
         Vec3 var16 = new Vec3(Math.cos(var11) * var13, f_35906 + var9.nextDouble() * f_35907, Math.sin(var11) * var13);
         this.f_35759
            .add(
               new KillEffects.X6Phhxbx0Qk7mEMX(
                  var15,
                  var16,
                  var4,
                  var5 * (f_35908 + var9.nextFloat() * f_35909),
                  var6 * f_35910,
                  KillEffects.EEYJfozBp1gWKUd2.BURST,
                  (float)Math.toDegrees(var11)
               )
            );
      }
   }

   private void m_9769(Vec3 var1, float var2, float var3, int var4, float var5, float var6, float var7) {
      int var8 = Math.round(f_35875 * var7);
      ThreadLocalRandom var9 = ThreadLocalRandom.current();

      for (int var10 = 0; var10 < var8; var10++) {
         Vec3 var11 = var1.add((var9.nextDouble() - f_35876) * var3 * f_35877, var9.nextDouble() * var2, (var9.nextDouble() - f_35878) * var3 * f_35879);
         Vec3 var12 = new Vec3((var9.nextDouble() - f_35880) * f_35881, f_35882 + var9.nextDouble() * f_35883, (var9.nextDouble() - f_35884) * f_35885);
         this.f_35759
            .add(
               new KillEffects.X6Phhxbx0Qk7mEMX(
                  var11,
                  var12,
                  var4,
                  var5 * (f_35886 + var9.nextFloat() * f_35887),
                  var6 * (f_35888 + var9.nextFloat() * f_35889),
                  KillEffects.EEYJfozBp1gWKUd2.SOUL,
                  var9.nextFloat() * f_35890
               )
            );
      }
   }

   private static float m_9770(float var0) {
      float var1 = 1.0F - var0;
      return 1.0F - var1 * var1 * var1;
   }

   private boolean m_9771(LivingEntity var1) {
      return var1 != null && var1 != f_11537.player ? !this.f_35750.m_8768() || var1 instanceof Player : false;
   }

   private void m_9772(LivingEntity var1) {
      if (this.m_9771(var1)) {
         this.f_35770 = var1;
         if (this.f_35749.m_7568(f_35834)) {
            if (!this.f_35763.add(var1.getId())) {
               return;
            }

            this.f_35768 = false;
            this.f_35769 = false;
            this.f_35765 = 1.0F;
            this.f_35764 = f_35835;
            this.m_9740(f_35746, f_35836);
            this.m_9779(var1, f_35837);
            Class_ZPRMV6aCWVosHRWh.m_5820(f_35838);
            this.f_35771 = 1;
            this.f_35772 = System.currentTimeMillis() + f_35839;
            this.m_9777(var1, 700, f_35840, f_35841);
            this.m_9777(var1, 900, f_35842, f_35843);
         } else if (this.f_35762.add(var1.getId())) {
            this.m_9758(var1);
         }
      }
   }

   private void m_9773(LivingEntity var1, int var2, float var3) {
      this.m_9777(var1, var2, var3, f_35860);
   }

   private void m_9774(PoseStack var1, Vec3 var2) {
      BufferBuilder var3 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
      byte var4 = 0;
      long var5 = System.currentTimeMillis();
      Matrix4f var7 = var1.last().pose();

      for (KillEffects.exDnHi1I29USMwdX var9 : this.f_35760) {
         Vec3 var10 = new Vec3(var9.f_35713, var9.f_35714, var9.f_35715);
         if (this.m_9752(var2, var10)) {
            float var11 = (float)(var5 - var9.f_35718 - var9.f_35720) / (float)var9.f_35719;
            if (!(var11 < 0.0F) && !(var11 > 1.0F)) {
               float var12 = m_9770(var11);
               float var13 = (1.0F - var11) * (var11 < f_35968 ? var11 / f_35969 : 1.0F);
               float var14 = var9.f_35717 * var12;
               int var15 = Class_BftdentXEtGbugJw.m_2306(var9.f_35716, var13 * f_35970);
               double var16 = var9.f_35713 - var2.x;
               double var18 = var9.f_35714 - var2.y;
               double var20 = var9.f_35715 - var2.z;
               Vector4f var22 = Class_BftdentXEtGbugJw.m_2298(var15);
               this.m_9760(var3, var7, (float)(var16 - var14), (float)var18, (float)(var20 - var14), 0.0F, 0.0F, var22);
               this.m_9760(var3, var7, (float)(var16 - var14), (float)var18, (float)(var20 + var14), 0.0F, 1.0F, var22);
               this.m_9760(var3, var7, (float)(var16 + var14), (float)var18, (float)(var20 + var14), 1.0F, 1.0F, var22);
               this.m_9760(var3, var7, (float)(var16 + var14), (float)var18, (float)(var20 - var14), 1.0F, 0.0F, var22);
               var4 += 4;
            }
         }
      }

      this.m_9742(var3, f_35744, var4, f_35971, this.f_35773, false);
   }

   private void m_9777(LivingEntity var1, int var2, float var3, float var4) {
      if (var1 != null) {
         float var5 = f_35861 + this.f_35766 * f_35862;
         float var6 = var5 / f_35863;
         float var7 = var6;
         Vec3 var8 = var1.position().add(0.0, var1.getEyeHeight() * f_35864, 0.0);

         for (int var9 = 0; var9 < var2; var9++) {
            float var10 = (float)var9 / var2;
            float var11 = (float)(-var7 / 2.0F + Math.random() * var7);
            float var12 = var5 * var4 * (f_35865 + (float)Math.random() * f_35866);
            float var13 = (float)(var6 * Math.random() * var4);
            this.f_35758
               .add(
                  new KillEffects.n5KQnEFBILjiQvqr(
                     var8.add(0.0, var11, 0.0), var10 * f_35867, var5 * f_35868, var5 + var12, f_35869 * (float)Math.random(), var13, var3
                  )
               );
         }
      }
   }

   @Override
   public void m_732() {
      this.m_9756();
      Class_ZPRMV6aCWVosHRWh.m_5820(1.0F);
   }

   private void m_9778(PoseStack var1, Vec3 var2, float var3, float var4, float var5, KillEffects.EEYJfozBp1gWKUd2 var6, Identifier var7, float var8) {
      BufferBuilder var9 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
      int var10 = 0;

      for (KillEffects.X6Phhxbx0Qk7mEMX var12 : this.f_35759) {
         if (var12.f_35693 == var6) {
            float var13 = var12.m_9721();
            if (!(var13 <= f_35966)) {
               Vec3 var14 = var12.m_9720(var5);
               if (this.m_9752(var2, var14)) {
                  Vec3 var15 = var14.subtract(var2);
                  var10 += this.m_9729(
                     var9,
                     var1,
                     var15,
                     var12.f_35690 * var8,
                     var12.f_35690 * var8,
                     var12.f_35694,
                     var3,
                     var4,
                     Class_BftdentXEtGbugJw.m_2306(var12.f_35689, var13)
                  );
               }
            }
         }
      }

      this.m_9742(var9, var7, var10, f_35967, this.f_35773, false);
   }

   private void m_9779(Entity var1, float var2) {
      if (f_11537.player != null && var1 != null) {
         Vec3 var3 = f_11537.player.getEyePosition();
         Vec3 var4 = var1.position().add(0.0, var1.getBbHeight() * f_35854, 0.0);
         Vec3 var5 = var4.subtract(var3);
         double var6 = Math.sqrt(var5.x * var5.x + var5.z * var5.z);
         float var8 = (float)(Mth.atan2(var5.z, var5.x) * f_35855) - f_35856;
         float var9 = (float)(-(Mth.atan2(var5.y, var6) * f_35857));
         float var10 = Mth.wrapDegrees(var8 - f_11537.player.getYRot());
         float var11 = var9 - f_11537.player.getXRot();
         if (Math.abs(var10) > f_35858 || Math.abs(var11) > f_35859) {
            f_11537.player.setYRot(Mth.lerp(var2, f_11537.player.getYRot(), f_11537.player.getYRot() + var10));
            f_11537.player.setXRot(Mth.lerp(var2, f_11537.player.getXRot(), var9));
         }
      }
   }

   private void m_9780(Class_XzpX8S5F5zd9jbuE var1) {
      if (var1.m_5619() instanceof ClientboundEntityEventPacket var2 && f_11537.level != null) {
         if (var2.getEntity(f_11537.level) instanceof LivingEntity var4) {
            if (this.m_9771(var4)) {
               if (this.m_9751(var4)) {
                  if (var2.getEventId() == 35) {
                     if (!this.f_35751.m_8768()) {
                        return;
                     }

                     f_11537.execute(() -> this.m_9764(var4));
                  } else if (var2.getEventId() == 3) {
                     f_11537.execute(() -> this.m_9763(var4));
                  }
               }
            }
         }
      }
   }

   private enum EEYJfozBp1gWKUd2 {
      SOUL,
      BURST,
      SPARK;
   }

   private static final class MiUCHqwvH8v17vSp {
      public LivingEntity f_35673;
      public long f_35674;
      public long f_35675;
      public boolean f_35676;
      public boolean f_35677;
      public static final long f_35678 = 2500L;
      public static final long f_35679 = 2500L;

      public void m_9716() {
         this.f_35677 = true;
         this.f_35674 = System.currentTimeMillis();
      }

      public MiUCHqwvH8v17vSp(LivingEntity var1) {
         this.f_35675 = f_35678;
         this.m_9717(var1);
      }

      public void m_9717(LivingEntity var1) {
         this.f_35673 = var1;
         this.f_35674 = System.currentTimeMillis();
         this.f_35675 = f_35679;
         if (var1.getHealth() > 0.0F) {
            this.f_35676 = false;
         }
      }

      public void m_9718(long var1) {
         this.f_35675 = var1;
         this.f_35674 = System.currentTimeMillis();
      }

      public boolean m_9719() {
         return this.f_35673 != null && System.currentTimeMillis() - this.f_35674 < this.f_35675;
      }
   }

   private static final class X6Phhxbx0Qk7mEMX {
      public double f_35680;
      public double f_35681;
      public double f_35682;
      public double f_35683;
      public double f_35684;
      public double f_35685;
      public double f_35686;
      public double f_35687;
      public double f_35688;
      public final int f_35689;
      public final float f_35690;
      public final long f_35691 = System.currentTimeMillis();
      public final long f_35692;
      public final KillEffects.EEYJfozBp1gWKUd2 f_35693;
      public float f_35694;
      public static final float f_35695 = 1000.0F;
      public static final float f_35696 = 1000.0F;
      public static final double f_35697 = 3.1;
      public static final double f_35698 = 0.0015;
      public static final double f_35699 = 2.7;
      public static final double f_35700 = 0.0015;
      public static final double f_35701 = 0.995;
      public static final double f_35702 = 0.0012;
      public static final double f_35703 = 0.0045;
      public static final double f_35704 = 0.96;
      public static final double f_35705 = 0.96;
      public static final double f_35706 = 0.96;
      public static final float f_35707 = 1.2F;
      public static final float f_35708 = 4.5F;
      public static final long f_35709 = 120L;
      public static final float f_35710 = 120.0F;
      public static final float f_35711 = 280.0F;
      public static final long f_35712 = 280L;

      public Vec3 m_9720(float var1) {
         return new Vec3(Mth.lerp(var1, this.f_35683, this.f_35680), Mth.lerp(var1, this.f_35684, this.f_35681), Mth.lerp(var1, this.f_35685, this.f_35682));
      }

      public float m_9721() {
         long var1 = System.currentTimeMillis() - this.f_35691;
         if (var1 < f_35709) {
            return Mth.clamp((float)var1 / f_35710, 0.0F, 1.0F);
         } else {
            return var1 <= this.f_35692 ? 1.0F : 1.0F - Mth.clamp((float)(var1 - this.f_35692) / f_35711, 0.0F, 1.0F);
         }
      }

      public boolean m_9722() {
         return System.currentTimeMillis() - this.f_35691 > this.f_35692 + f_35712;
      }

      public void m_9723() {
         this.f_35683 = this.f_35680;
         this.f_35684 = this.f_35681;
         this.f_35685 = this.f_35682;
         if (this.f_35693 == KillEffects.EEYJfozBp1gWKUd2.SOUL) {
            float var1 = (float)(System.currentTimeMillis() - this.f_35691) / f_35696;
            this.f_35686 = this.f_35686 + Math.sin(var1 * f_35697 + this.f_35694) * f_35698;
            this.f_35688 = this.f_35688 + Math.cos(var1 * f_35699 + this.f_35694) * f_35700;
            this.f_35687 = this.f_35687 * f_35701;
            this.f_35687 = this.f_35687 + f_35702;
         } else {
            this.f_35687 = this.f_35687 - f_35703;
            this.f_35686 = this.f_35686 * f_35704;
            this.f_35687 = this.f_35687 * f_35705;
            this.f_35688 = this.f_35688 * f_35706;
         }

         this.f_35680 = this.f_35680 + this.f_35686;
         this.f_35681 = this.f_35681 + this.f_35687;
         this.f_35682 = this.f_35682 + this.f_35688;
         this.f_35694 = this.f_35694 + (this.f_35693 == KillEffects.EEYJfozBp1gWKUd2.SOUL ? f_35707 : f_35708);
      }

      public X6Phhxbx0Qk7mEMX(Vec3 var1, Vec3 var2, int var3, float var4, float var5, KillEffects.EEYJfozBp1gWKUd2 var6, float var7) {
         this.f_35680 = this.f_35683 = var1.x;
         this.f_35681 = this.f_35684 = var1.y;
         this.f_35682 = this.f_35685 = var1.z;
         this.f_35686 = var2.x;
         this.f_35687 = var2.y;
         this.f_35688 = var2.z;
         this.f_35689 = var3;
         this.f_35690 = var4;
         this.f_35692 = (long)(var5 * f_35695);
         this.f_35693 = var6;
         this.f_35694 = var7;
      }
   }

   private static final class exDnHi1I29USMwdX {
      public final double f_35713;
      public final double f_35714;
      public final double f_35715;
      public final int f_35716;
      public final float f_35717;
      public final long f_35718 = System.currentTimeMillis();
      public final long f_35719;
      public final long f_35720;

      public exDnHi1I29USMwdX(double var1, double var3, double var5, int var7, float var8, long var9, long var11) {
         this.f_35713 = var1;
         this.f_35714 = var3;
         this.f_35715 = var5;
         this.f_35716 = var7;
         this.f_35717 = var8;
         this.f_35719 = var9;
         this.f_35720 = var11;
      }

      public exDnHi1I29USMwdX(double var1, double var3, double var5, int var7, float var8, long var9) {
         this(var1, var3, var5, var7, var8, var9, 0L);
      }
   }

   private static final class ezhug9ZaTGQ8yz5o {
      public final double f_35721;
      public final double f_35722;
      public final double f_35723;
      public final double f_35724;
      public final int f_35725;
      public final long f_35726 = System.currentTimeMillis();
      public final long f_35727;
      public final long f_35728;

      public ezhug9ZaTGQ8yz5o(double var1, double var3, double var5, double var7, int var9, long var10, long var12) {
         this.f_35721 = var1;
         this.f_35722 = var3;
         this.f_35723 = var5;
         this.f_35724 = var7;
         this.f_35725 = var9;
         this.f_35727 = var10;
         this.f_35728 = var12;
      }
   }

   private static final class n5KQnEFBILjiQvqr {
      public final Vec3 f_35729;
      public final float f_35730;
      public final float f_35731;
      public final float f_35732;
      public final float f_35733;
      public final float f_35734;
      public final float f_35735;
      public final float f_35736 = (float)Math.random();
      public final long f_35737 = System.currentTimeMillis();
      public static final float f_35738 = 0.5F;

      public float m_9724() {
         return Mth.clamp((float)(System.currentTimeMillis() - this.f_35737) / this.f_35735, 0.0F, 1.0F);
      }

      public Vec3 m_9725() {
         float var1 = this.m_9724();
         float var2 = Mth.lerp(var1, this.f_35730, this.f_35731);
         float var3 = Mth.lerp(var1, this.f_35732, this.f_35733);
         float var4 = (float)Math.toRadians(var2);
         return this.f_35729.add(Mth.sin(var4) * var3, this.f_35734 * var1, Mth.cos(var4) * var3);
      }

      public float m_9726() {
         return 1.0F - this.m_9724();
      }

      public n5KQnEFBILjiQvqr(Vec3 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
         this.f_35729 = var1;
         this.f_35730 = var2;
         this.f_35731 = var2 + var5;
         this.f_35732 = var3;
         this.f_35733 = var4;
         this.f_35734 = var6;
         this.f_35735 = var7;
      }

      public boolean m_9727() {
         return this.m_9724() >= 1.0F;
      }

      public float m_9728() {
         float var1 = this.m_9724();
         return (var1 > f_35738 ? 1.0F - var1 : var1) * 2.0F;
      }
   }
}
