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
import com.mojang.blaze3d.vertex.MeshData.DrawState;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_JJO8ThL9zxz3U5JH;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_PoKta0VE7AdhY1En;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import net.minecraft.client.Camera;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;

public class PlayerAlert extends Module {
   private final SliderSetting f_5830;
   private final SliderSetting f_5831;
   private final SliderSetting f_5832;
   private final SliderSetting f_5833;
   private final SliderSetting f_5834;
   private final SliderSetting f_5835;
   private final CheckboxSetting f_5836;
   private final CheckboxSetting f_5837;
   private final CheckboxSetting f_5838;
   private final CheckboxSetting f_5839;
   private final CheckboxSetting f_5840;
   private final CheckboxSetting f_5841;
   private final CheckboxSetting f_5842;
   private final MultiChoiceSetting f_5843;
   private static final long f_5844 = 130L;
   private static final long f_5845 = 250L;
   private static final int f_5846 = 24;
   private static final int f_5847 = 0;
   private static final int f_5848 = 1;
   private final List<PlayerAlert.TJaK0F9WDOSRnkqE> f_5849;
   private final Map<UUID, Float> f_5850;
   private float f_5851;
   private float f_5852;
   private float f_5853;
   private long f_5854;
   private final RenderPipeline f_5855;
   private final Class_gEPk7yDw6CwIte87<Class_JJO8ThL9zxz3U5JH> f_5856;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_5857;
   private static final String f_5858 = "PlayerAlert";
   private static final String f_5859 = "Дуга-индикатор урона/хила вокруг прицела";
   private static final String f_5860 = "Дистанция от прицела";
   private static final float f_5861 = 38.0F;
   private static final float f_5862 = 10.0F;
   private static final float f_5863 = 150.0F;
   private static final String f_5864 = "Ширина дуги";
   private static final float f_5865 = 60.0F;
   private static final float f_5866 = 15.0F;
   private static final float f_5867 = 160.0F;
   private static final String f_5868 = "Толщина";
   private static final float f_5869 = 5.0F;
   private static final float f_5870 = 25.0F;
   private static final float f_5871 = 0.5F;
   private static final String f_5872 = "Длительность (мс)";
   private static final float f_5873 = 1500.0F;
   private static final float f_5874 = 250.0F;
   private static final float f_5875 = 5000.0F;
   private static final float f_5876 = 50.0F;
   private static final String f_5877 = "Радиус событий";
   private static final float f_5878 = 30.0F;
   private static final float f_5879 = 4.0F;
   private static final float f_5880 = 64.0F;
   private static final String f_5881 = "Показывать от дистанции";
   private static final float f_5882 = 80.0F;
   private static final String f_5883 = "Когда бьют тебя";
   private static final String f_5884 = "Когда бьют врага";
   private static final String f_5885 = "Хил (зелёным)";
   private static final String f_5886 = "Игнорировать друзей";
   private static final String f_5887 = "Размер от урона";
   private static final String f_5888 = "Яркость от близости";
   private static final String f_5889 = "Свечение";
   private static final String f_5890 = "Цвет";
   private static final String f_5891 = "Урон/Хил";
   private static final String f_5892 = "Тема клиента";
   private static final String f_5893 = "dimasik/sixth_sense";
   private static final String f_5894 = "sixth_sense";
   private static final String f_5895 = "sixth_sense";
   private static final float f_5896 = 0.5F;
   private static final float f_5897 = -0.05F;
   private static final float f_5898 = 0.05F;
   private static final float f_5899 = -0.05F;
   private static final float f_5900 = 0.05F;
   private static final float f_5901 = 0.5F;
   private static final double f_5902 = -1.0;
   private static final long f_5903 = 130L;
   private static final long f_5904 = 250L;
   private static final float f_5905 = 180.0F;
   private static final float f_5906 = 180.0F;
   private static final float f_5907 = 270.0F;
   private static final float f_5908 = 60.0F;
   private static final float f_5909 = 0.004F;
   private static final float f_5910 = 0.92F;
   private static final float f_5911 = 0.35F;
   private static final float f_5912 = 0.65F;
   private static final float f_5913 = 0.004F;
   private static final float f_5914 = 0.75F;
   private static final float f_5915 = 0.6F;
   private static final float f_5916 = 0.85F;
   private static final float f_5917 = 0.3F;
   private static final float f_5918 = 0.9F;
   private static final float f_5919 = 1.9F;
   private static final float f_5920 = 1.12F;
   private static final float f_5921 = 0.3F;
   private static final float f_5922 = 0.3F;
   private static final float f_5923 = 0.7F;
   private static final float f_5924 = 0.7F;
   private static final float f_5925 = 0.7F;
   private static final float f_5926 = 14.0F;
   private static final float f_5927 = 0.45F;
   private static final double f_5928 = 48.0;
   private static final float f_5929 = 0.85F;
   private static final float f_5930 = 0.25F;
   private static final float f_5931 = 0.75F;
   private static final String f_5932 = "Тема клиента";
   private static final float f_5933 = 0.9F;
   private static final float f_5934 = 255.0F;
   private static final float f_5935 = 255.0F;
   private static final float f_5936 = 255.0F;
   private static final float f_5937 = 3.0F;
   private static final float f_5938 = -1.0F;
   private static final String f_5939 = "sixthSense";
   private static final String f_5940 = "sixthSenseVertices";

   private static float m_2277(float var0, float var1) {
      return f_5938 + var0 * 2.0F / var1;
   }

   private int m_2278(
      BufferBuilder var1,
      PlayerAlert.TJaK0F9WDOSRnkqE var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      Vec3 var8,
      float var9,
      long var10,
      float var12
   ) {
      float var13 = (float)(var10 - var2.f_5822);
      float var14 = Mth.clamp(var13 / var12, 0.0F, 1.0F);
      float var15 = Mth.clamp(var13 / f_5908, 0.0F, 1.0F);
      float var16 = (1.0F - var14) * (1.0F - var14);
      float var17 = var15 * var16;
      if (var17 <= f_5909) {
         return 0;
      }

      double var19 = var2.f_5825;
      float var18;
      if (var2.f_5826 != null && var2.f_5826.isAlive() && !var2.f_5826.isRemoved()) {
         var18 = this.m_2291(var2.f_5826, var7, var8, var9);
         var19 = f_11537.player.distanceTo(var2.f_5826);
      } else if (var2.f_5829) {
         var18 = var2.f_5827;
      } else {
         var18 = var2.f_5827 + (var2.f_5828 - var7);
      }

      float var21 = this.m_2290(var2.f_5824, var19);
      float var22 = f_5910 * var17 * (this.f_5841.m_8768() ? f_5911 + f_5912 * var21 : 1.0F);
      if (var22 <= f_5913) {
         return 0;
      }

      float var23 = this.f_5840.m_8768() ? f_5914 + f_5915 * var21 : 1.0F;
      float var24 = this.f_5830.m_8768();
      float var25 = this.f_5832.m_8768() * var23;
      float var26 = this.f_5831.m_8768() * (f_5916 + f_5917 * var23);
      int var27 = this.m_2283(var2.f_5823, var21);
      int var28 = 0;
      if (this.f_5842.m_8768()) {
         var28 += this.m_2294(var1, var3, var4, var5, var6, var24 - var25 * f_5918, var24 + var25 * f_5919, var18, var26 * f_5920, var27, var22 * f_5921);
      }

      var28 += this.m_2294(var1, var3, var4, var5, var6, var24, var24 + var25, var18, var26, var27, var22);
      return var28
         + this.m_2294(var1, var3, var4, var5, var6, var24 + var25 * f_5922, var24 + var25 * f_5923, var18, var26 * f_5924, m_2288(var27, 60), var22 * f_5925);
   }

   private void m_2279(long var1) {
      HashMap var3 = new HashMap();
      float var4 = this.f_5834.m_8768();

      for (Player var6 : f_11537.level.players()) {
         if (var6 != f_11537.player
            && !(f_11537.player.distanceTo(var6) > var4)
            && (!this.f_5839.m_8768() || !DimasikClient.m_9057().m_9049().m_2804().m_2877(var6.getName().getString()))) {
            UUID var7 = var6.getUUID();
            float var8 = var6.getHealth() + var6.getAbsorptionAmount();
            var3.put(var7, var8);
            Float var9 = this.f_5850.get(var7);
            if (var9 != null) {
               float var10 = var8 - var9;
               if (var10 < f_5899 && this.f_5837.m_8768()) {
                  this.m_2289(false, -var10, var6, 1, false);
               } else if (var10 > f_5900 && var9 > f_5901 && this.f_5838.m_8768()) {
                  this.m_2289(true, var10, var6, 1, false);
               }
            }
         }
      }

      this.f_5850.clear();
      this.f_5850.putAll(var3);
   }

   @Override
   public void m_732() {
      this.m_2284();
   }

   private void m_2281(Class_JJO8ThL9zxz3U5JH var1) {
      if (f_11537.player != null && var1.m_3261() == f_11537.player) {
         this.f_5852 = var1.m_3262();
         this.f_5853 = f_11537.player.getYRot();
         this.f_5854 = System.currentTimeMillis();
      }
   }

   private int m_2283(boolean var1, float var2) {
      if (this.f_5843.m_7568(f_5932)) {
         return Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN);
      } else {
         return var1
            ? Class_BftdentXEtGbugJw.m_2312(Class_BftdentXEtGbugJw.m_2310(18, 120, 40), Class_BftdentXEtGbugJw.m_2310(60, 235, 110), var2)
            : Class_BftdentXEtGbugJw.m_2312(Class_BftdentXEtGbugJw.m_2310(160, 18, 14), Class_BftdentXEtGbugJw.m_2310(255, 60, 48), var2);
      }
   }

   private void m_2284() {
      this.f_5849.clear();
      this.f_5850.clear();
      this.f_5851 = Float.NaN;
      this.f_5854 = 0L;
   }

   @Override
   public void m_778() {
      this.m_2284();
   }

   private static float m_2285(float var0, float var1) {
      return 1.0F - var0 * 2.0F / var1;
   }

   private void m_2286(Class_bhRaN0YSSLQRYjPo var1) {
      if (f_11537.player != null && f_11537.level != null && !f_11537.gui.hud.isHidden()) {
         long var2 = System.currentTimeMillis();
         this.m_2296(var2);
         this.m_2279(var2);
         float var4 = this.f_5833.m_8768();
         this.f_5849.removeIf(var3 -> (float)(var2 - var3.f_5822) >= var4);
         if (!this.f_5849.isEmpty()) {
            Camera var5 = f_11537.gameRenderer.mainCamera();
            if (var5 != null) {
               float var6 = f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true);
               float var7 = f_11537.getWindow().getGuiScaledWidth();
               float var8 = f_11537.getWindow().getGuiScaledHeight();
               float var9 = var7 / 2.0F;
               float var10 = var8 / 2.0F;
               float var11 = var5.yRot();
               Vec3 var12 = var5.position();
               BufferBuilder var13 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.TRIANGLES, DefaultVertexFormat.POSITION_COLOR);
               int var14 = 0;

               for (PlayerAlert.TJaK0F9WDOSRnkqE var16 : this.f_5849) {
                  var14 += this.m_2278(var13, var16, var9, var10, var7, var8, var11, var12, var6, var2, var4);
               }

               this.m_2287(var13, var14);
            }
         }
      }
   }

   public PlayerAlert() {
      super(f_5858, f_5859, Category.RENDER);
      this.f_5830 = new SliderSetting(f_5860, f_5861, f_5862, f_5863).m_828(1.0F);
      this.f_5831 = new SliderSetting(f_5864, f_5865, f_5866, f_5867).m_828(1.0F);
      this.f_5832 = new SliderSetting(f_5868, f_5869, 1.0F, f_5870).m_828(f_5871);
      this.f_5833 = new SliderSetting(f_5872, f_5873, f_5874, f_5875).m_828(f_5876);
      this.f_5834 = new SliderSetting(f_5877, f_5878, f_5879, f_5880).m_828(1.0F);
      this.f_5835 = new SliderSetting(f_5881, 0.0F, 0.0F, f_5882).m_828(1.0F);
      this.f_5836 = new CheckboxSetting(f_5883, true);
      this.f_5837 = new CheckboxSetting(f_5884, true);
      this.f_5838 = new CheckboxSetting(f_5885, true);
      this.f_5839 = new CheckboxSetting(f_5886, true);
      this.f_5840 = new CheckboxSetting(f_5887, true);
      this.f_5841 = new CheckboxSetting(f_5888, true);
      this.f_5842 = new CheckboxSetting(f_5889, true);
      this.f_5843 = new MultiChoiceSetting(f_5890, new Class_2ZaVm8TGDJ68TnJB(f_5891), new Class_2ZaVm8TGDJ68TnJB(f_5892));
      this.f_5849 = new ArrayList<>();
      this.f_5850 = new HashMap<>();
      this.f_5851 = Float.NaN;
      this.f_5852 = 0.0F;
      this.f_5853 = 0.0F;
      this.f_5854 = 0L;
      this.f_5855 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_5893)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_5894))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_5895))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(DefaultVertexFormat.POSITION_COLOR, PrimitiveTopology.TRIANGLES)
         .m_2722();
      this.f_5856 = this::m_2281;
      this.f_5857 = this::m_2286;
      this.m_795(
         this.f_5830,
         this.f_5831,
         this.f_5832,
         this.f_5833,
         this.f_5834,
         this.f_5835,
         this.f_5836,
         this.f_5837,
         this.f_5838,
         this.f_5839,
         this.f_5840,
         this.f_5841,
         this.f_5842,
         this.f_5843
      );
   }

   private void m_2287(BufferBuilder var1, int var2) {
      MeshData var3 = var1.build();
      if (var3 != null) {
         if (var2 == 0) {
            var3.close();
         } else {
            GpuBuffer var4 = null;

            try {
               DrawState var5 = var3.drawState();
               int var6 = var5.indexCount();
               AutoStorageIndexBuffer var7 = RenderSystem.getSequentialBuffer(var5.primitiveTopology());
               GpuBuffer var8 = var7.getBuffer(var6);
               IndexType var9 = var7.type();
               var4 = RenderSystem.getDevice().createBuffer(() -> f_5940, 32, var3.vertexBuffer());
               RenderTarget var10 = f_11537.gameRenderer.mainRenderTarget();
               CommandEncoder var11 = RenderSystem.getDevice().createCommandEncoder();
               RenderPass var12 = var11.createRenderPass(() -> f_5939, var10.getColorTextureView(), Optional.empty());

               try {
                  RenderSystem.bindDefaultUniforms(var12);
                  var12.setPipeline(this.f_5855);
                  var12.setVertexBuffer(0, var4.slice());
                  var12.setIndexBuffer(var8, var9);
                  var12.drawIndexed(var6, 1, 0, 0, 0);
               } catch (Throwable var20) {
                  if (var12 != null) {
                     try {
                        var12.close();
                     } catch (Throwable var19) {
                        var20.addSuppressed(var19);
                     }
                  }

                  throw var20;
               }

               if (var12 != null) {
                  var12.close();
               }
            } finally {
               if (var4 != null) {
                  var4.close();
               }

               var3.close();
            }
         }
      }
   }

   private static int m_2288(int var0, int var1) {
      return Class_BftdentXEtGbugJw.m_2310(
         Math.min(255, Class_BftdentXEtGbugJw.m_2309(var0) + var1),
         Math.min(255, Class_BftdentXEtGbugJw.m_2299(var0) + var1),
         Math.min(255, Class_BftdentXEtGbugJw.m_2308(var0) + var1)
      );
   }

   private void m_2289(boolean var1, float var2, LivingEntity var3, int var4, boolean var5) {
      long var6 = System.currentTimeMillis();
      double var8 = var3 != null ? f_11537.player.distanceTo(var3) : f_5902;
      float var10 = this.f_5835.m_8768();
      if (!var5 || !(var10 > 0.0F) || !(var8 >= 0.0) || !(var8 < var10)) {
         if (!this.f_5849.isEmpty()) {
            PlayerAlert.TJaK0F9WDOSRnkqE var11 = this.f_5849.get(this.f_5849.size() - 1);
            if (var6 - var11.f_5822 <= f_5903 && var11.f_5823 == var1 && var11.f_5826 == var3) {
               var11.f_5824 += var2;
               if (var3 != null) {
                  var11.f_5825 = var8;
               }

               return;
            }
         }

         PlayerAlert.TJaK0F9WDOSRnkqE var12 = new PlayerAlert.TJaK0F9WDOSRnkqE(var6, var1, var2, var8);
         var12.f_5826 = var3;
         if (var3 == null) {
            if (var4 == 0 && var6 - this.f_5854 <= f_5904) {
               var12.f_5827 = this.f_5852 + f_5905;
               var12.f_5828 = this.f_5853;
            } else if (var4 == 0) {
               var12.f_5827 = f_11537.player.getHurtDir() + f_5906;
               var12.f_5828 = f_11537.player.getYRot();
            } else {
               var12.f_5827 = f_5907;
               var12.f_5829 = true;
            }
         }

         this.f_5849.add(var12);

         while (this.f_5849.size() > 24) {
            this.f_5849.remove(0);
         }
      }
   }

   private float m_2290(float var1, double var2) {
      float var4 = Mth.clamp(var1 / f_5926, 0.0F, 1.0F);
      float var5 = var2 < 0.0 ? f_5927 : Mth.clamp(1.0F - (float)(var2 / f_5928), 0.0F, 1.0F);
      float var6 = Math.max(var4, var5 * f_5929);
      return Mth.clamp(f_5930 + f_5931 * var6, 0.0F, 1.0F);
   }

   private float m_2291(LivingEntity var1, float var2, Vec3 var3, float var4) {
      double var5 = Mth.lerp(var4, var1.xo, var1.getX()) - var3.x;
      double var7 = Mth.lerp(var4, var1.zo, var1.getZ()) - var3.z;
      double var9 = Math.toRadians(var2);
      double var11 = Math.sin(var9);
      double var13 = Math.cos(var9);
      double var15 = var5 * -var11 + var7 * var13;
      double var17 = var5 * -var13 + var7 * -var11;
      return (float)Math.toDegrees(Math.atan2(-var15, var17));
   }

   private static float m_2292(float var0) {
      float var1 = 1.0F - Math.abs(var0 * 2.0F - 1.0F);
      return var1 * var1 * (f_5937 - 2.0F * var1);
   }

   private int m_2294(
      BufferBuilder var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, float var11
   ) {
      if (var11 <= 0.0F) {
         return 0;
      }

      int var12 = Math.max(20, (int)(var9 * f_5933));
      float var13 = Class_BftdentXEtGbugJw.m_2309(var10) / f_5934;
      float var14 = Class_BftdentXEtGbugJw.m_2299(var10) / f_5935;
      float var15 = Class_BftdentXEtGbugJw.m_2308(var10) / f_5936;
      float var16 = var8 - var9 / 2.0F;
      byte var17 = 0;

      for (int var18 = 0; var18 < var12; var18++) {
         float var19 = (float)var18 / var12;
         float var20 = (float)(var18 + 1) / var12;
         float var21 = (float)Math.toRadians(var16 + var19 * var9);
         float var22 = (float)Math.toRadians(var16 + var20 * var9);
         float var23 = Mth.cos(var21);
         float var24 = Mth.sin(var21);
         float var25 = Mth.cos(var22);
         float var26 = Mth.sin(var22);
         float var27 = m_2292(var19);
         float var28 = m_2292(var20);
         float var29 = var11 * var27;
         float var30 = var11 * var28;
         float var31 = m_2277(var2 + var23 * var7, var4);
         float var32 = m_2285(var3 + var24 * var7, var5);
         float var33 = m_2277(var2 + var23 * var6, var4);
         float var34 = m_2285(var3 + var24 * var6, var5);
         float var35 = m_2277(var2 + var25 * var7, var4);
         float var36 = m_2285(var3 + var26 * var7, var5);
         float var37 = m_2277(var2 + var25 * var6, var4);
         float var38 = m_2285(var3 + var26 * var6, var5);
         var1.addVertex(var31, var32, 0.0F).setColor(var13, var14, var15, var29);
         var1.addVertex(var33, var34, 0.0F).setColor(var13, var14, var15, var29);
         var1.addVertex(var35, var36, 0.0F).setColor(var13, var14, var15, var30);
         var1.addVertex(var33, var34, 0.0F).setColor(var13, var14, var15, var29);
         var1.addVertex(var37, var38, 0.0F).setColor(var13, var14, var15, var30);
         var1.addVertex(var35, var36, 0.0F).setColor(var13, var14, var15, var30);
         var17 += 6;
      }

      return var17;
   }

   private LivingEntity m_2295() {
      Player var1 = null;
      double var2 = this.f_5834.m_8768().floatValue();

      for (Player var5 : f_11537.level.players()) {
         if (var5 != f_11537.player
            && var5.isAlive()
            && (!this.f_5839.m_8768() || !DimasikClient.m_9057().m_9049().m_2804().m_2877(var5.getName().getString()))) {
            double var6 = f_11537.player.distanceTo(var5);
            if (var6 < var2) {
               var2 = var6;
               var1 = var5;
            }
         }
      }

      return var1;
   }

   private void m_2296(long var1) {
      float var3 = f_11537.player.getHealth() + f_11537.player.getAbsorptionAmount();
      if (!Float.isNaN(this.f_5851) && f_11537.player.isAlive() && this.f_5851 > f_5896) {
         float var4 = var3 - this.f_5851;
         if (var4 < f_5897 && this.f_5836.m_8768()) {
            this.m_2289(false, -var4, this.m_2295(), 0, true);
         } else if (var4 > f_5898 && this.f_5838.m_8768()) {
            this.m_2289(true, var4, this.m_2295(), 1, false);
         }
      }

      this.f_5851 = var3;
   }

   private static final class TJaK0F9WDOSRnkqE {
      public long f_5822;
      public boolean f_5823;
      public float f_5824;
      public double f_5825;
      public LivingEntity f_5826;
      public float f_5827;
      public float f_5828;
      public boolean f_5829;

      public TJaK0F9WDOSRnkqE(long var1, boolean var3, float var4, double var5) {
         this.f_5822 = var1;
         this.f_5823 = var3;
         this.f_5824 = var4;
         this.f_5825 = var5;
      }
   }
}
