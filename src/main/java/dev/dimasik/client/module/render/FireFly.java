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
import dev.dimasik.client.system.Class_NzJrN63M7QBpmAbi;
import dev.dimasik.client.system.Class_PoKta0VE7AdhY1En;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.Camera;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;

public class FireFly extends Module {
   private static final Identifier f_15837 = Identifier.fromNamespaceAndPath(FireFly.f_15942, FireFly.f_15943);
   private static final Identifier f_15838 = Identifier.fromNamespaceAndPath(FireFly.f_15944, FireFly.f_15945);
   private static final long f_15839 = 5500L;
   private static final long f_15840 = 400L;
   private static final long f_15841 = 450L;
   private static final int f_15842 = 40;
   private static final int f_15843 = 8;
   private static final int f_15844 = 6;
   private static final int f_15845 = 8;
   private final MultiChoiceSetting f_15846;
   private final ColorSetting f_15847;
   private final CheckboxSetting f_15848;
   private final CheckboxSetting f_15849;
   private final SliderSetting f_15850;
   private final List<FireFly.Class_91lte0eugpkL2l3p> f_15851;
   private float f_15852;
   private float f_15853;
   private float f_15854;
   private float f_15855;
   private float f_15856;
   private float f_15857;
   private final RenderPipeline f_15858;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_15859;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_15860;
   private static final String f_15861 = "FireFly";
   private static final String f_15862 = "Светлячки вокруг игрока";
   private static final String f_15863 = "Режим цвета";
   private static final String f_15864 = "Случайный";
   private static final String f_15865 = "Свой";
   private static final String f_15866 = "Клиент";
   private static final String f_15867 = "Цвет";
   private static final int f_15868 = -47616;
   private static final String f_15869 = "Тёмный след";
   private static final String f_15870 = "Свечение";
   private static final String f_15871 = "Задержка спавна";
   private static final float f_15872 = 3.0F;
   private static final float f_15873 = 10.0F;
   private static final String f_15874 = "dimasik/fire_fly_add";
   private static final String f_15875 = "dead_chams";
   private static final String f_15876 = "dead_chams";
   private static final String f_15877 = "Sampler0";
   private static final double f_15878 = 10.0;
   private static final double f_15879 = 4.0;
   private static final double f_15880 = 6.0;
   private static final double f_15881 = 5.0;
   private static final String f_15882 = "Случайный";
   private static final int f_15883 = -16777216;
   private static final String f_15884 = "Клиент";
   private static final double f_15885 = 3.0;
   private static final double f_15886 = 3.0;
   private static final double f_15887 = 3.0;
   private static final float f_15888 = 0.004F;
   private static final double f_15889 = 1.6;
   private static final float f_15890 = 255.0F;
   private static final float f_15891 = 0.3F;
   private static final float f_15892 = 1.0E-5F;
   private static final float f_15893 = 5.5F;
   private static final float f_15894 = 3.0F;
   private static final float f_15895 = 20.0F;
   private static final float f_15896 = 0.012F;
   private static final float f_15897 = 255.0F;
   private static final float f_15898 = 0.25F;
   private static final float f_15899 = 255.0F;
   private static final float f_15900 = 255.0F;
   private static final float f_15901 = 0.25F;
   private static final float f_15902 = 5.0F;
   private static final float f_15903 = 3.0F;
   private static final float f_15904 = 10.0F;
   private static final float f_15905 = 0.012F;
   private static final float f_15906 = 255.0F;
   private static final float f_15907 = 255.0F;
   private static final float f_15908 = 255.0F;
   private static final float f_15909 = 0.3F;
   private static final float f_15910 = 255.0F;
   private static final float f_15911 = 0.1F;
   private static final float f_15912 = 255.0F;
   private static final float f_15913 = 0.25F;
   private static final float f_15914 = 0.5F;
   private static final float f_15915 = 5.0F;
   private static final float f_15916 = 0.004F;
   private static final float f_15917 = 255.0F;
   private static final float f_15918 = 0.5F;
   private static final float f_15919 = 255.0F;
   private static final float f_15920 = 0.3F;
   private static final float f_15921 = 255.0F;
   private static final double f_15922 = 1.0E-8;
   private static final double f_15923 = 1.0E-8;
   private static final float f_15924 = 255.0F;
   private static final float f_15925 = 255.0F;
   private static final float f_15926 = 255.0F;
   private static final float f_15927 = 255.0F;
   private static final float f_15928 = 0.5F;
   private static final float f_15929 = 0.5F;
   private static final float f_15930 = 255.0F;
   private static final float f_15931 = 255.0F;
   private static final float f_15932 = 255.0F;
   private static final float f_15933 = 255.0F;
   private static final String f_15934 = "Sampler0";
   private static final float f_15935 = 765.0F;
   private static final float f_15936 = 0.5F;
   private static final float f_15937 = -2.0F;
   private static final double f_15938 = 2.0;
   private static final String f_15939 = "fireFly";
   private static final String f_15940 = "fireFly";
   private static final String f_15941 = "Свой";
   private static final String f_15942 = "dimasik";
   private static final String f_15943 = "images/fireflies/firepart.png";
   private static final String f_15944 = "dimasik";
   private static final String f_15945 = "images/fireflies/bloom.png";

   private void m_5513(BufferBuilder var1, Matrix4f var2, double var3, double var5, double var7, float var9, float var10, int var11) {
      float var12 = var9 * f_15928;
      float var13 = var10 * f_15929;
      float var14 = Class_BftdentXEtGbugJw.m_2309(var11) / f_15930;
      float var15 = Class_BftdentXEtGbugJw.m_2299(var11) / f_15931;
      float var16 = Class_BftdentXEtGbugJw.m_2308(var11) / f_15932;
      float var17 = Class_BftdentXEtGbugJw.m_2297(var11) / f_15933;
      float var18 = this.f_15852 * var12;
      float var19 = this.f_15853 * var12;
      float var20 = this.f_15854 * var12;
      float var21 = this.f_15855 * var13;
      float var22 = this.f_15856 * var13;
      float var23 = this.f_15857 * var13;
      float var24 = (float)var3;
      float var25 = (float)var5;
      float var26 = (float)var7;
      var1.addVertex(var2, var24 - var18 - var21, var25 - var19 - var22, var26 - var20 - var23).setUv(0.0F, 0.0F).setColor(var14, var15, var16, var17);
      var1.addVertex(var2, var24 - var18 + var21, var25 - var19 + var22, var26 - var20 + var23).setUv(0.0F, 1.0F).setColor(var14, var15, var16, var17);
      var1.addVertex(var2, var24 + var18 + var21, var25 + var19 + var22, var26 + var20 + var23).setUv(1.0F, 1.0F).setColor(var14, var15, var16, var17);
      var1.addVertex(var2, var24 + var18 - var21, var25 + var19 - var22, var26 + var20 - var23).setUv(1.0F, 0.0F).setColor(var14, var15, var16, var17);
   }

   private static float m_5515(double var0, double var2) {
      return m_5516(ThreadLocalRandom.current(), var0, var2);
   }

   private static float m_5516(ThreadLocalRandom var0, double var1, double var3) {
      return (float)(var1 + var0.nextDouble() * (var3 - var1));
   }

   @Override
   public void m_732() {
      this.f_15851.clear();
   }

   private void m_5517(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (f_11537.player.tickCount == 1) {
            for (FireFly.Class_91lte0eugpkL2l3p var3 : this.f_15851) {
               var3.f_15798 = true;
            }
         }

         long var7 = System.currentTimeMillis();
         int var4 = f_11537.player.tickCount;
         int var5 = 0;

         for (int var6 = this.f_15851.size(); var5 < var6; var5++) {
            this.f_15851.get(var5).m_5503(var7, var4);
         }

         this.f_15851.removeIf(var0 -> var0.f_15798);
         var5 = Math.round(this.f_15850.m_8768());
         if (var4 % (var5 + 1) == 0 && this.f_15851.size() < 40) {
            int var9 = this.m_5523();
            this.f_15851.add(new FireFly.Class_91lte0eugpkL2l3p(this.m_5519(f_15878, f_15879), var9));
            if (this.f_15851.size() < 40) {
               this.f_15851.add(new FireFly.Class_91lte0eugpkL2l3p(this.m_5519(f_15880, f_15881), var9));
            }
         }
      } else {
         this.f_15851.clear();
      }
   }

   private int m_5518(
      BufferBuilder var1, Matrix4f var2, Vec3 var3, double var4, double var6, double var8, double var10, double var12, double var14, float var16, int var17
   ) {
      double var18 = var10 - var4;
      double var20 = var12 - var6;
      double var22 = var14 - var8;
      if (var18 * var18 + var20 * var20 + var22 * var22 < f_15922) {
         return 0;
      }

      double var24 = -var22;
      double var26 = var18;
      double var28 = Math.sqrt(var24 * var24 + var26 * var26);
      if (var28 < f_15923) {
         var24 = var16;
         var26 = 0.0;
      } else {
         var24 = var24 / var28 * var16;
         var26 = var26 / var28 * var16;
      }

      float var30 = Class_BftdentXEtGbugJw.m_2309(var17) / f_15924;
      float var31 = Class_BftdentXEtGbugJw.m_2299(var17) / f_15925;
      float var32 = Class_BftdentXEtGbugJw.m_2308(var17) / f_15926;
      float var33 = Class_BftdentXEtGbugJw.m_2297(var17) / f_15927;
      var1.addVertex(var2, (float)(var4 - var3.x + var24), (float)(var6 - var3.y), (float)(var8 - var3.z + var26))
         .setUv(0.0F, 0.0F)
         .setColor(var30, var31, var32, var33);
      var1.addVertex(var2, (float)(var4 - var3.x - var24), (float)(var6 - var3.y), (float)(var8 - var3.z - var26))
         .setUv(0.0F, 1.0F)
         .setColor(var30, var31, var32, var33);
      var1.addVertex(var2, (float)(var10 - var3.x - var24), (float)(var12 - var3.y), (float)(var14 - var3.z - var26))
         .setUv(1.0F, 1.0F)
         .setColor(var30, var31, var32, var33);
      var1.addVertex(var2, (float)(var10 - var3.x + var24), (float)(var12 - var3.y), (float)(var14 - var3.z + var26))
         .setUv(1.0F, 0.0F)
         .setColor(var30, var31, var32, var33);
      return 4;
   }

   private Vec3 m_5519(double var1, double var3) {
      Vec3 var5 = f_11537.player.position();
      ThreadLocalRandom var6 = ThreadLocalRandom.current();
      Vec3 var7 = var5.add(m_5516(var6, -var1, var1), m_5516(var6, -var3 / f_15885, var3), m_5516(var6, -var1, var1));
      double var8 = var1 / f_15886;

      for (int var10 = 0; var10 < 8; var10++) {
         BlockPos var11 = BlockPos.containing(var7);
         boolean var12 = !f_11537.level.getBlockState(var11).getCollisionShape(f_11537.level, var11).isEmpty();
         double var13 = Math.hypot(var7.x - var5.x, var7.z - var5.z);
         if (!var12 && var13 >= var8) {
            break;
         }

         var7 = var5.add(m_5516(var6, -var1, var1), m_5516(var6, -var3 / f_15887, var3), m_5516(var6, -var1, var1));
      }

      return var7;
   }

   private static float m_5520(float var0) {
      var0 = Mth.clamp(var0, 0.0F, 1.0F);
      return var0 < f_15936 ? 2.0F * var0 * var0 : 1.0F - (float)Math.pow(f_15937 * var0 + 2.0F, f_15938) / 2.0F;
   }

   public FireFly() {
      super(f_15861, f_15862, Category.RENDER);
      this.f_15846 = new MultiChoiceSetting(
         f_15863, new Class_2ZaVm8TGDJ68TnJB(f_15864), new Class_2ZaVm8TGDJ68TnJB(f_15865), new Class_2ZaVm8TGDJ68TnJB(f_15866)
      );
      this.f_15847 = new ColorSetting(f_15867, false, f_15868).m_822(() -> this.f_15846.m_7568(f_15941));
      this.f_15848 = new CheckboxSetting(f_15869, false);
      this.f_15849 = new CheckboxSetting(f_15870, false);
      this.f_15850 = new SliderSetting(f_15871, f_15872, 1.0F, f_15873).m_828(1.0F);
      this.f_15851 = new ArrayList<>(40);
      this.f_15858 = Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(f_15874)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_15875))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_15876))
         .m_2719(CompareOp.GREATER_THAN_OR_EQUAL)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.ADDITIVE)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2741(f_15877)
         .m_2722();
      this.f_15859 = this::m_5517;
      this.f_15860 = this::m_5522;
      this.m_795(this.f_15846, this.f_15847, this.f_15848, this.f_15849, this.f_15850);
   }

   private void m_5522(Class_TZhU50s8XmBQCMP5 var1) {
      if (!this.f_15851.isEmpty() && f_11537.player != null) {
         float var2 = var1.m_5005().getGameTimeDeltaPartialTick(true);
         Camera var3 = f_11537.gameRenderer.mainCamera();
         Vec3 var4 = var3.position();
         this.m_5524(var3.yRot(), var3.xRot());
         long var5 = System.currentTimeMillis();
         Vec3 var7 = f_11537.player.getEyePosition();
         Matrix4f var8 = var1.m_5006().last().pose();
         boolean var9 = this.f_15848.m_8768();
         boolean var10 = this.f_15849.m_8768();
         int var11 = this.f_15851.size() > 24 ? 2 : 1;
         BufferBuilder var12 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
         int var13 = 0;

         for (FireFly.Class_91lte0eugpkL2l3p var15 : this.f_15851) {
            float var16 = var15.f_15796;
            if (!(var16 < f_15888)) {
               double var17 = var15.f_15787.x - var7.x;
               double var19 = var15.f_15787.y + f_15889 - var7.y;
               double var21 = var15.f_15787.z - var7.z;
               float var23 = (float)(var17 * var17 + var19 * var19 + var21 * var21);
               float var24 = Mth.sqrt(var23);
               int var25 = var15.f_15783;
               if (var25 >= 2) {
                  int var26 = Class_BftdentXEtGbugJw.m_2306(var15.f_15788, Class_BftdentXEtGbugJw.m_2297(var15.f_15788) / f_15890 * var16);
                  int var27 = var9 ? m_5526(var26, f_15891) : var26;
                  float var28 = f_15892 + f_15893 * Mth.clamp(1.0F - (var24 - f_15894) / f_15895, 0.0F, 1.0F) * f_15896;

                  for (int var29 = var11; var29 < var25; var29 += var11) {
                     int var30 = var29 - var11;
                     float var31 = (float)var29 / var25;
                     float var32 = m_5520(var31);
                     int var33 = Class_BftdentXEtGbugJw.m_2306(var27, Class_BftdentXEtGbugJw.m_2297(var27) / f_15897 * var16 * var32);
                     float var34 = m_5528(var33) * f_15898 * var31 * (Class_BftdentXEtGbugJw.m_2297(var33) / f_15899);
                     var33 = Class_BftdentXEtGbugJw.m_2302(var33, Class_BftdentXEtGbugJw.m_2306(-1, Class_BftdentXEtGbugJw.m_2297(var33) / f_15900), var34);
                     var13 += this.m_5518(
                        var12,
                        var8,
                        var4,
                        var15.f_15779[var30],
                        var15.f_15780[var30],
                        var15.f_15781[var30],
                        var15.f_15779[var29],
                        var15.f_15780[var29],
                        var15.f_15781[var29],
                        var28,
                        var33
                     );
                  }
               }

               float var44 = (f_15901 + f_15902 * Mth.clamp(1.0F - (var24 - f_15903) / f_15904, 0.0F, 1.0F)) * f_15905;

               for (int var46 = 0; var46 < var15.f_15785; var46++) {
                  FireFly.Cr2zZUzvRlnU5II7 var49 = var15.f_15784[var46];
                  float var52 = (float)var49.m_5509(var5);
                  if (!(var52 >= 1.0F)) {
                     int var54 = Class_BftdentXEtGbugJw.m_2302(-1, var15.f_15788, var52);
                     var54 = Class_BftdentXEtGbugJw.m_2306(
                        var54, Class_BftdentXEtGbugJw.m_2297(var15.f_15788) / f_15906 * var16 * (1.0F - var52 * var52 * var52)
                     );
                     double var58 = Mth.lerp(var2, var49.f_15823, var49.f_15820) - var4.x;
                     double var61 = Mth.lerp(var2, var49.f_15824, var49.f_15821) - var4.y;
                     double var35 = Mth.lerp(var2, var49.f_15825, var49.f_15822) - var4.z;
                     this.m_5513(var12, var8, var58, var61, var35, var44, var44, var54);
                     var13 += 4;
                  }
               }

               if (var10) {
                  int var47 = Class_BftdentXEtGbugJw.m_2306(var15.f_15788, Class_BftdentXEtGbugJw.m_2297(var15.f_15788) / f_15907 * var16);
                  float var50 = Class_BftdentXEtGbugJw.m_2297(var47) / f_15908 * m_5528(var47) * f_15909;
                  int var53 = Class_BftdentXEtGbugJw.m_2302(var47, Class_BftdentXEtGbugJw.m_2306(-1, Class_BftdentXEtGbugJw.m_2297(var47) / f_15910), var50);
                  int var56 = m_5526(var53, f_15911);
                  var56 = Class_BftdentXEtGbugJw.m_2306(var56, Class_BftdentXEtGbugJw.m_2297(var56) / f_15912 * f_15913);
                  double var59 = Mth.lerp(var2, var15.f_15786.x, var15.f_15787.x) - var4.x;
                  double var62 = Mth.lerp(var2, var15.f_15786.y, var15.f_15787.y) - var4.y;
                  double var63 = Mth.lerp(var2, var15.f_15786.z, var15.f_15787.z) - var4.z;
                  float var37 = f_15914 * var16 * f_15915;
                  this.m_5513(var12, var8, var59, var62, var63, var37, var37, var56);
                  var13 += 4;
               }
            }
         }

         this.m_5525(var12, f_15838, var13);
         BufferBuilder var38 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR);
         byte var39 = 0;

         for (FireFly.Class_91lte0eugpkL2l3p var41 : this.f_15851) {
            float var18 = var41.f_15796;
            if (!(var18 < f_15916)) {
               int var42 = Class_BftdentXEtGbugJw.m_2306(var41.f_15788, Class_BftdentXEtGbugJw.m_2297(var41.f_15788) / f_15917 * var18);
               double var20 = Mth.lerp(var2, var41.f_15786.x, var41.f_15787.x) - var4.x;
               double var22 = Mth.lerp(var2, var41.f_15786.y, var41.f_15787.y) - var4.y;
               double var43 = Mth.lerp(var2, var41.f_15786.z, var41.f_15787.z) - var4.z;
               float var45 = f_15918 * var18;
               float var48 = Class_BftdentXEtGbugJw.m_2297(var42) / f_15919 * m_5528(var42) * f_15920;
               int var51 = Class_BftdentXEtGbugJw.m_2302(var42, Class_BftdentXEtGbugJw.m_2306(-1, Class_BftdentXEtGbugJw.m_2297(var42) / f_15921), var48);
               this.m_5513(var38, var8, var20, var22, var43, var45, var45, var51);
               var39 += 4;
            }
         }

         this.m_5525(var38, f_15837, var39);
      }
   }

   private int m_5523() {
      if (this.f_15846.m_7568(f_15882)) {
         return Color.getHSBColor(ThreadLocalRandom.current().nextFloat(), 1.0F, 1.0F).getRGB() | f_15883;
      } else {
         return this.f_15846.m_7568(f_15884) ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : this.f_15847.m_8768();
      }
   }

   private void m_5524(float var1, float var2) {
      float var3 = (float)Math.toRadians(-var1);
      float var4 = (float)Math.toRadians(var2);
      float var5 = Mth.cos(var3);
      float var6 = Mth.sin(var3);
      float var7 = Mth.cos(var4);
      float var8 = Mth.sin(var4);
      this.f_15852 = var5;
      this.f_15853 = 0.0F;
      this.f_15854 = -var6;
      this.f_15855 = var8 * var6;
      this.f_15856 = var7;
      this.f_15857 = var8 * var5;
   }

   private void m_5525(BufferBuilder var1, Identifier var2, int var3) {
      MeshData var4 = var1.build();
      if (var4 != null) {
         if (var3 == 0) {
            var4.close();
         } else {
            GpuBuffer var5 = null;

            try {
               DrawState var6 = var4.drawState();
               int var7 = var6.indexCount();
               AutoStorageIndexBuffer var8 = RenderSystem.getSequentialBuffer(var6.primitiveTopology());
               GpuBuffer var9 = var8.getBuffer(var7);
               IndexType var10 = var8.type();
               var5 = RenderSystem.getDevice().createBuffer(() -> f_15940, 32, var4.vertexBuffer());
               RenderTarget var11 = f_11537.gameRenderer.mainRenderTarget();
               CommandEncoder var12 = RenderSystem.getDevice().createCommandEncoder();
               AbstractTexture var13 = f_11537.getTextureManager().getTexture(var2);
               RenderPass var14 = var12.createRenderPass(
                  () -> f_15939, var11.getColorTextureView(), Optional.empty(), var11.getDepthTextureView(), OptionalDouble.empty()
               );

               try {
                  RenderSystem.bindDefaultUniforms(var14);
                  var14.setPipeline(this.f_15858);
                  var14.bindTexture(f_15934, var13.getTextureView(), var13.getSampler());
                  var14.setVertexBuffer(0, var5.slice());
                  var14.setIndexBuffer(var9, var10);
                  var14.drawIndexed(var7, 1, 0, 0, 0);
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
               if (var5 != null) {
                  var5.close();
               }

               var4.close();
            }
         }
      }
   }

   private static int m_5526(int var0, float var1) {
      var1 = Mth.clamp(var1, 0.0F, 1.0F);
      return Class_BftdentXEtGbugJw.m_2303(
         (int)(Class_BftdentXEtGbugJw.m_2309(var0) * var1),
         (int)(Class_BftdentXEtGbugJw.m_2299(var0) * var1),
         (int)(Class_BftdentXEtGbugJw.m_2308(var0) * var1),
         Class_BftdentXEtGbugJw.m_2297(var0)
      );
   }

   private static float m_5528(int var0) {
      return (Class_BftdentXEtGbugJw.m_2309(var0) + Class_BftdentXEtGbugJw.m_2299(var0) + Class_BftdentXEtGbugJw.m_2308(var0)) / f_15935;
   }

   private final class Class_91lte0eugpkL2l3p {
      public final double[] f_15779 = new double[8];
      public final double[] f_15780 = new double[8];
      public final double[] f_15781 = new double[8];
      public final long[] f_15782 = new long[8];
      public int f_15783;
      public final FireFly.Cr2zZUzvRlnU5II7[] f_15784 = new FireFly.Cr2zZUzvRlnU5II7[6];
      public int f_15785;
      public Vec3 f_15786;
      public Vec3 f_15787;
      public final int f_15788;
      public float f_15789;
      public float f_15790;
      public float f_15791;
      public float f_15792;
      public final long f_15793;
      public long f_15794;
      public int f_15795;
      public float f_15796;
      public float f_15797;
      public boolean f_15798;
      public float f_15799;
      public int f_15800;
      public static final double f_15801 = 360.0;
      public static final double f_15802 = 0.08;
      public static final double f_15803 = 0.175;
      public static final double f_15804 = -0.075;
      public static final double f_15805 = 0.1;
      public static final double f_15806 = 300.5;
      public static final double f_15807 = 900.5;
      public static final float f_15808 = 5500.0F;
      public static final float f_15809 = 0.02F;
      public static final double f_15810 = 300.5;
      public static final double f_15811 = 900.5;
      public static final double f_15812 = 360.0;
      public static final float f_15813 = 0.065F;
      public static final float f_15814 = 1.005F;
      public static final float f_15815 = 1.02F;
      public static final float f_15816 = 0.1F;
      public static final float f_15817 = 0.3F;
      public static final float f_15818 = 0.003921569F;
      public static final long f_15819 = 400L;

      public void m_5502(double var1, double var3, double var5, long var7) {
         if (this.f_15783 == 8) {
            System.arraycopy(this.f_15779, 1, this.f_15779, 0, 7);
            System.arraycopy(this.f_15780, 1, this.f_15780, 0, 7);
            System.arraycopy(this.f_15781, 1, this.f_15781, 0, 7);
            System.arraycopy(this.f_15782, 1, this.f_15782, 0, 7);
            this.f_15783 = 7;
         }

         this.f_15779[this.f_15783] = var1;
         this.f_15780[this.f_15783] = var3;
         this.f_15781[this.f_15783] = var5;
         this.f_15782[this.f_15783] = var7;
         this.f_15783++;
      }

      public void m_5503(long var1, int var3) {
         this.m_5505();
         if (var1 - this.f_15794 >= this.f_15795) {
            this.f_15795 = (int)FireFly.m_5515(f_15810, f_15811);
            this.f_15794 = var1;
            this.f_15789 = FireFly.m_5515(0.0, f_15812);
         }

         this.f_15790 = Mth.lerp(f_15813, this.f_15790, this.f_15789);
         this.f_15791 = this.f_15791 / f_15814;
         this.f_15792 = this.f_15792 / f_15815;
         float var4 = -Mth.sin((float)Math.toRadians(this.f_15790)) * this.f_15791;
         float var5 = Mth.cos((float)Math.toRadians(this.f_15790)) * this.f_15791;
         this.f_15786 = this.f_15787;
         if (--this.f_15800 <= 0) {
            this.f_15800 = 3;
            if (Class_NzJrN63M7QBpmAbi.f_11537.level != null) {
               float var6 = f_15816;
               AABB var7 = new AABB(
                  this.f_15787.x - var6 / 2.0F,
                  this.f_15787.y,
                  this.f_15787.z - var6 / 2.0F,
                  this.f_15787.x + var6 / 2.0F,
                  this.f_15787.y + var6,
                  this.f_15787.z + var6 / 2.0F
               );
               this.f_15799 = Class_NzJrN63M7QBpmAbi.f_11537.level.noCollision(var7) ? 1.0F : f_15817;
            } else {
               this.f_15799 = 1.0F;
            }
         }

         this.f_15787 = this.f_15787.add(var4 / this.f_15799, this.f_15792 / this.f_15799, var5 / this.f_15799);
         if (this.m_5507(var1) >= 1.0F) {
            this.f_15797 = 0.0F;
            if (this.f_15796 < f_15818) {
               this.f_15798 = true;
            }
         }

         this.m_5502(this.f_15787.x, this.f_15787.y, this.f_15787.z, var1 + f_15819);
         this.m_5506(var1);
         if ((var3 & 1) == 0) {
            this.m_5504(this.f_15787, var1);
         }

         for (int var8 = 0; var8 < this.f_15785; var8++) {
            this.f_15784[var8].m_5510();
         }

         this.m_5508(var1);
      }

      public Class_91lte0eugpkL2l3p(Vec3 var2, int var3) {
         this.f_15789 = FireFly.m_5515(0.0, f_15801);
         this.f_15790 = this.f_15789;
         this.f_15791 = FireFly.m_5515(f_15802, f_15803);
         this.f_15792 = FireFly.m_5515(f_15804, f_15805);
         this.f_15793 = System.currentTimeMillis();
         this.f_15794 = this.f_15793;
         this.f_15795 = (int)FireFly.m_5515(f_15806, f_15807);
         this.f_15796 = 0.0F;
         this.f_15797 = 1.0F;
         this.f_15799 = 1.0F;
         this.f_15787 = var2;
         this.f_15786 = var2;
         this.f_15788 = var3;

         for (int var4 = 0; var4 < 6; var4++) {
            this.f_15784[var4] = new FireFly.Cr2zZUzvRlnU5II7();
         }
      }

      public void m_5504(Vec3 var1, long var2) {
         if (this.f_15785 >= 6) {
            FireFly.Cr2zZUzvRlnU5II7 var4 = this.f_15784[0];
            System.arraycopy(this.f_15784, 1, this.f_15784, 0, 5);
            this.f_15784[5] = var4;
            this.f_15785 = 5;
         }

         this.f_15784[this.f_15785++].m_5512(var1, var2, 450);
      }

      public void m_5505() {
         float var1 = f_15809;
         if (this.f_15796 < this.f_15797) {
            this.f_15796 = Math.min(this.f_15797, this.f_15796 + var1);
         } else if (this.f_15796 > this.f_15797) {
            this.f_15796 = Math.max(this.f_15797, this.f_15796 - var1);
         }
      }

      public void m_5506(long var1) {
         int var3 = 0;

         for (int var4 = 0; var4 < this.f_15783; var4++) {
            if (this.f_15782[var4] > var1) {
               if (var3 != var4) {
                  this.f_15779[var3] = this.f_15779[var4];
                  this.f_15780[var3] = this.f_15780[var4];
                  this.f_15781[var3] = this.f_15781[var4];
                  this.f_15782[var3] = this.f_15782[var4];
               }

               var3++;
            }
         }

         this.f_15783 = var3;
      }

      public float m_5507(long var1) {
         return Mth.clamp((float)(var1 - this.f_15793) / f_15808, 0.0F, 1.0F);
      }

      public void m_5508(long var1) {
         int var3 = 0;

         for (int var4 = 0; var4 < this.f_15785; var4++) {
            FireFly.Cr2zZUzvRlnU5II7 var5 = this.f_15784[var4];
            if (!var5.m_5511(var1)) {
               if (var3 != var4) {
                  FireFly.Cr2zZUzvRlnU5II7 var6 = this.f_15784[var3];
                  this.f_15784[var3] = var5;
                  this.f_15784[var4] = var6;
               }

               var3++;
            }
         }

         this.f_15785 = var3;
      }
   }

   private static final class Cr2zZUzvRlnU5II7 {
      public double f_15820;
      public double f_15821;
      public double f_15822;
      public double f_15823;
      public double f_15824;
      public double f_15825;
      public double f_15826;
      public float f_15827;
      public float f_15828;
      public float f_15829;
      public long f_15830;
      public int f_15831;
      public static final float f_15832 = (float) (Math.PI * 2);
      public static final float f_15833 = -135.0F;
      public static final float f_15834 = 90.0F;
      public static final double f_15835 = 50.0;
      public static final double f_15836 = 1.2;

      public double m_5509(long var1) {
         return Mth.clamp((float)(var1 - this.f_15830) / this.f_15831, 0.0F, 1.0F);
      }

      public void m_5510() {
         this.f_15823 = this.f_15820;
         this.f_15824 = this.f_15821;
         this.f_15825 = this.f_15822;
         this.f_15820 = this.f_15820 + this.f_15827 * this.f_15826;
         this.f_15821 = this.f_15821 + this.f_15828 * this.f_15826;
         this.f_15822 = this.f_15822 + this.f_15829 * this.f_15826;
         this.f_15826 = this.f_15826 / f_15836;
      }

      public Cr2zZUzvRlnU5II7() {
      }

      public boolean m_5511(long var1) {
         return var1 - this.f_15830 >= this.f_15831;
      }

      public void m_5512(Vec3 var1, long var2, int var4) {
         ThreadLocalRandom var5 = ThreadLocalRandom.current();
         float var6 = var5.nextFloat() * f_15832;
         float var7 = (float)Math.toRadians(f_15833 + var5.nextFloat() * f_15834);
         this.f_15827 = Mth.sin(var6);
         this.f_15828 = Mth.cos(var7);
         this.f_15829 = Mth.cos(var6);
         this.f_15830 = var2;
         this.f_15831 = var4;
         this.f_15826 = var5.nextDouble() / f_15835;
         this.f_15820 = this.f_15823 = var1.x;
         this.f_15821 = this.f_15824 = var1.y;
         this.f_15822 = this.f_15825 = var1.z;
      }
   }
}
