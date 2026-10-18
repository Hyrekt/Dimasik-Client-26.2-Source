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
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ColorSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_LsNSRvPKh5AwfAUe;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_rG6KJzJWXQjNHCHC;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import dev.dimasik.client.system.Class_wjdoxQGtI8mFyL6U;
import dev.dimasik.client.system.Class_y3cvEHXTSEF5dp8q;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.CloudStatus;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.attribute.EnvironmentAttributes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;

public final class HitWave extends Module {
   private static final int f_30106 = 6;
   private static final int f_30107 = 368;
   private static final HitWave.fQrqciDCfnN2pM13 f_30108 = new HitWave.fQrqciDCfnN2pM13(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
   private final SliderSetting f_30109;
   private final SliderSetting f_30110;
   private final SliderSetting f_30111;
   private final SliderSetting f_30112;
   private final SliderSetting f_30113;
   private final CheckboxSetting f_30114;
   private final ColorSetting f_30115;
   private final List<HitWave.xgKBFFaXyR9fT4z8> f_30116;
   private final RenderPipeline f_30117;
   private final RenderPipeline f_30118;
   private TextureTarget f_30119;
   private final Class_gEPk7yDw6CwIte87<Class_wjdoxQGtI8mFyL6U> f_30120;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_30121;
   private static final String f_30122 = "HitWave";
   private static final String f_30123 = "Запускает световую волну по всем прогруженным блокам";
   private static final String f_30124 = "Скорость волны";
   private static final float f_30125 = 1.25F;
   private static final float f_30126 = 0.35F;
   private static final float f_30127 = 3.5F;
   private static final float f_30128 = 0.05F;
   private static final String f_30129 = "Радиус сонара";
   private static final float f_30130 = 48.0F;
   private static final float f_30131 = 8.0F;
   private static final float f_30132 = 192.0F;
   private static final float f_30133 = 4.0F;
   private static final String f_30134 = "Импульс блока";
   private static final float f_30135 = 0.22F;
   private static final float f_30136 = 0.08F;
   private static final float f_30137 = 0.7F;
   private static final float f_30138 = 0.02F;
   private static final String f_30139 = "Яркость";
   private static final float f_30140 = 1.55F;
   private static final float f_30141 = 0.4F;
   private static final float f_30142 = 2.8F;
   private static final float f_30143 = 0.05F;
   private static final String f_30144 = "Свечение";
   private static final float f_30145 = 8.5F;
   private static final float f_30146 = 14.0F;
   private static final float f_30147 = 0.5F;
   private static final String f_30148 = "Цвет темы";
   private static final String f_30149 = "Цвет";
   private static final int f_30150 = -8950529;
   private static final String f_30151 = "dimasik/hit_sonnar_mask";
   private static final String f_30152 = "hands_fullscreen";
   private static final String f_30153 = "hit_sonnar_mask";
   private static final String f_30154 = "HitSonnar";
   private static final String f_30155 = "DepthSampler";
   private static final String f_30156 = "dimasik/hit_sonnar";
   private static final String f_30157 = "hands_fullscreen";
   private static final String f_30158 = "hit_sonnar";
   private static final String f_30159 = "HitSonnar";
   private static final String f_30160 = "DepthSampler";
   private static final double f_30161 = 0.001;
   private static final double f_30162 = 0.45;
   private static final double f_30163 = -8.0;
   private static final double f_30164 = 0.025;
   private static final double f_30165 = 4096.0;
   private static final double f_30166 = 4096.0;
   private static final long f_30167 = 1000000L;
   private static final float f_30168 = 1000.0F;
   private static final float f_30169 = 0.1F;
   private static final float f_30170 = 255.0F;
   private static final float f_30171 = 255.0F;
   private static final float f_30172 = 255.0F;
   private static final float f_30173 = 1.2F;
   private static final float f_30174 = 0.58F;
   private static final float f_30175 = 1000.0F;
   private static final float f_30176 = 0.01F;
   private static final float f_30177 = 0.002F;
   private static final String f_30178 = "DepthSampler";
   private static final String f_30179 = "HitSonnar";
   private static final String f_30180 = "DepthSampler";
   private static final String f_30181 = "HitSonnar";
   private static final String f_30182 = "hit-sonnar-surface-mask";
   private static final float f_30183 = -10000.0F;
   private static final float f_30184 = -10000.0F;
   private static final float f_30185 = 1000.0F;
   private static final float f_30186 = 6.0F;
   private static final float f_30187 = 15.0F;
   private static final float f_30188 = 10.0F;
   private static final String f_30189 = "hitSonnarSurfaceCore";
   private static final String f_30190 = "hitSonnarSurfaceMask";
   private static final String f_30191 = "hitSonnarSurfaceUniforms";

   private float m_8393(float var1) {
      return var1 * var1 * var1 * (var1 * (var1 * f_30186 - f_30187) + f_30188);
   }

   public HitWave() {
      super(f_30122, f_30123, Category.RENDER);
      this.f_30109 = new SliderSetting(f_30124, f_30125, f_30126, f_30127).m_828(f_30128);
      this.f_30110 = new SliderSetting(f_30129, f_30130, f_30131, f_30132).m_828(f_30133);
      this.f_30111 = new SliderSetting(f_30134, f_30135, f_30136, f_30137).m_828(f_30138);
      this.f_30112 = new SliderSetting(f_30139, f_30140, f_30141, f_30142).m_828(f_30143);
      this.f_30113 = new SliderSetting(f_30144, f_30145, 2.0F, f_30146).m_828(f_30147);
      this.f_30114 = new CheckboxSetting(f_30148, true);
      this.f_30115 = new ColorSetting(f_30149, false, f_30150).m_822(() -> !this.f_30114.m_8768());
      this.f_30116 = new ArrayList<>();
      this.f_30117 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_30151)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_30152))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_30153))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2727()
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_30154, UniformType.UNIFORM_BUFFER)
         .m_2741(f_30155)
         .m_2722();
      this.f_30118 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_30156)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_30157))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_30158))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.ADDITIVE)
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_30159, UniformType.UNIFORM_BUFFER)
         .m_2741(f_30160)
         .m_2722();
      this.f_30120 = this::m_8406;
      this.f_30121 = this::m_8395;
      this.m_795(this.f_30109, this.f_30110, this.f_30111, this.f_30112, this.f_30113, this.f_30114, this.f_30115);
   }

   private void m_8395(Class_TZhU50s8XmBQCMP5 var1) {
      this.m_8398();
      if (!this.f_30116.isEmpty() && f_11537.level != null && var1.m_5009() != null && var1.m_5007() != null) {
         RenderTarget var2 = f_11537.gameRenderer.mainRenderTarget();
         if (var2 != null && var2.getColorTexture() != null && var2.getDepthTexture() != null && !var2.getDepthTexture().isClosed()) {
            GpuTextureView var3 = var2.getDepthTextureView();
            long var4 = System.currentTimeMillis();
            Vec3 var6 = f_11537.gameRenderer.mainCamera().position();
            List var7 = this.m_8408(var4, var6);
            if (!var7.isEmpty()) {
               this.m_8400(var2.width, var2.height);
               int var8 = this.m_8409();
               Matrix4f var9 = new Matrix4f(var1.m_5009()).invert();
               Matrix4f var10 = new Matrix4f(var1.m_5007()).invert();
               MemoryStack var11 = MemoryStack.stackPush();

               try {
                  Std140Builder var12 = Std140Builder.onStack(var11, 368)
                     .putMat4f(var9)
                     .putMat4f(var10)
                     .putVec4(this.m_8402(var6.x, f_30165), (float)var6.y, this.m_8402(var6.z, f_30166), (float)(var4 % f_30167) / f_30168)
                     .putVec4(var7.size(), this.f_30111.m_8768() / Math.max(this.f_30109.m_8768(), f_30169), this.f_30112.m_8768(), this.f_30110.m_8768())
                     .putVec4(
                        Class_BftdentXEtGbugJw.m_2309(var8) / f_30170,
                        Class_BftdentXEtGbugJw.m_2299(var8) / f_30171,
                        Class_BftdentXEtGbugJw.m_2308(var8) / f_30172,
                        this.m_8401(var1)
                     );

                  for (int var13 = 0; var13 < 6; var13++) {
                     HitWave.fQrqciDCfnN2pM13 var14 = var13 < var7.size() ? (HitWave.fQrqciDCfnN2pM13)var7.get(var13) : f_30108;
                     var12.putVec4(var14.x, var14.y, var14.z, var14.progress);
                  }

                  for (int var21 = 0; var21 < 6; var21++) {
                     HitWave.fQrqciDCfnN2pM13 var23 = var21 < var7.size() ? (HitWave.fQrqciDCfnN2pM13)var7.get(var21) : f_30108;
                     var12.putVec4(var23.envelope, var23.seed, 0.0F, 0.0F);
                  }

                  ByteBuffer var22 = var12.get();
                  GpuBuffer var24 = RenderSystem.getDevice().createBuffer(() -> f_30191, 128, var22);

                  try {
                     this.m_8407(var3, var24);
                     Class_rG6KJzJWXQjNHCHC.m_8389(this.f_30119, var2, var8, this.f_30113.m_8768(), f_30173 + this.f_30112.m_8768() * f_30174, 1.0F);
                     this.m_8404(var2, var3, var24);
                  } catch (Throwable var19) {
                     if (var24 != null) {
                        try {
                           var24.close();
                        } catch (Throwable var18) {
                           var19.addSuppressed(var18);
                        }
                     }

                     throw var19;
                  }

                  if (var24 != null) {
                     var24.close();
                  }
               } catch (Throwable var20) {
                  if (var11 != null) {
                     try {
                        var11.close();
                     } catch (Throwable var17) {
                        var20.addSuppressed(var17);
                     }
                  }

                  throw var20;
               }

               if (var11 != null) {
                  var11.close();
               }
            }
         }
      }
   }

   private Vec3 m_8396(Class_wjdoxQGtI8mFyL6U var1) {
      Entity var2 = var1.m_9370();
      Vec3 var3 = new Vec3(var2.getX(), var2.getBoundingBox().minY + f_30162, var2.getZ());
      BlockHitResult var4 = f_11537.level.clip(new ClipContext(var3, var3.add(0.0, f_30163, 0.0), Block.COLLIDER, Fluid.NONE, var2));
      return var4.getType() == Type.BLOCK ? var4.getLocation().add(0.0, f_30164, 0.0) : this.m_8397(var1);
   }

   @Override
   public void m_732() {
      this.f_30116.clear();
      if (this.f_30119 != null) {
         this.f_30119.destroyBuffers();
         this.f_30119 = null;
      }
   }

   private Vec3 m_8397(Class_wjdoxQGtI8mFyL6U var1) {
      if (f_11537.hitResult instanceof EntityHitResult var2 && var2.getEntity() == var1.m_9370()) {
         return var2.getLocation();
      } else {
         Entity var5 = var1.m_9370();
         AABB var6 = var5.getBoundingBox().inflate(f_30161);
         Vec3 var4 = var1.m_9371().getEyePosition();
         return var6.clip(var4, var6.getCenter()).orElse(var6.getCenter());
      }
   }

   @Override
   public void m_778() {
      this.f_30116.clear();
   }

   private void m_8398() {
      long var1 = System.currentTimeMillis();
      Iterator var3 = this.f_30116.iterator();

      while (var3.hasNext()) {
         HitWave.xgKBFFaXyR9fT4z8 var4 = (HitWave.xgKBFFaXyR9fT4z8)var3.next();
         if (var4.world != f_11537.level || (float)(var1 - var4.startedAt) >= (var4.duration + var4.flashDuration) * f_30185) {
            var3.remove();
         }
      }
   }

   private void m_8400(int var1, int var2) {
      if (this.f_30119 == null) {
         this.f_30119 = new TextureTarget(f_30182, var1, var2, false, GpuFormat.RGBA8_UNORM);
      } else if (this.f_30119.width != var1 || this.f_30119.height != var2) {
         this.f_30119.resize(var1, var2);
      }
   }

   private float m_8401(Class_TZhU50s8XmBQCMP5 var1) {
      if (f_11537.options.cloudStatus().get() == CloudStatus.OFF) {
         return f_30183;
      }

      float var2 = var1.m_5005().getGameTimeDeltaPartialTick(false);
      int var3 = (Integer)f_11537.gameRenderer.mainCamera().attributeProbe().getValue(EnvironmentAttributes.CLOUD_COLOR, var2);
      return var3 >>> 24 == 0 ? f_30184 : (Float)f_11537.gameRenderer.mainCamera().attributeProbe().getValue(EnvironmentAttributes.CLOUD_HEIGHT, var2);
   }

   private float m_8402(double var1, double var3) {
      double var5 = var1 % var3;
      return (float)(var5 < 0.0 ? var5 + var3 : var5);
   }

   private void m_8404(RenderTarget var1, GpuTextureView var2, GpuBuffer var3) {
      RenderPass var4 = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> f_30189, var1.getColorTextureView(), Optional.empty());

      try {
         var4.setPipeline(this.f_30118);
         var4.bindTexture(f_30180, var2, RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
         var4.setUniform(f_30181, var3);
         var4.draw(3, 1, 0, 0);
      } catch (Throwable var8) {
         if (var4 != null) {
            try {
               var4.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }
         }

         throw var8;
      }

      if (var4 != null) {
         var4.close();
      }
   }

   private void m_8406(Class_wjdoxQGtI8mFyL6U var1) {
      if (var1.m_9372() == Class_wjdoxQGtI8mFyL6U.Class_327mRdjAqNoPaemJ.POST
         && var1.m_9371() == f_11537.player
         && var1.m_9370() != null
         && f_11537.level != null) {
         this.f_30116
            .add(
               new HitWave.xgKBFFaXyR9fT4z8(
                  this.m_8396(var1),
                  System.currentTimeMillis(),
                  this.f_30109.m_8768(),
                  this.f_30111.m_8768(),
                  ThreadLocalRandom.current().nextFloat(),
                  f_11537.level
               )
            );

         while (this.f_30116.size() > 6) {
            this.f_30116.removeFirst();
         }
      }
   }

   private void m_8407(GpuTextureView var1, GpuBuffer var2) {
      RenderPass var3 = RenderSystem.getDevice()
         .createCommandEncoder()
         .createRenderPass(() -> f_30190, this.f_30119.getColorTextureView(), Optional.of(new Vector4f(0.0F)));

      try {
         var3.setPipeline(this.f_30117);
         var3.bindTexture(f_30178, var1, RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
         var3.setUniform(f_30179, var2);
         var3.draw(3, 1, 0, 0);
      } catch (Throwable var7) {
         if (var3 != null) {
            try {
               var3.close();
            } catch (Throwable var6) {
               var7.addSuppressed(var6);
            }
         }

         throw var7;
      }

      if (var3 != null) {
         var3.close();
      }
   }

   private List<HitWave.fQrqciDCfnN2pM13> m_8408(long var1, Vec3 var3) {
      ArrayList var4 = new ArrayList(6);

      for (HitWave.xgKBFFaXyR9fT4z8 var6 : this.f_30116) {
         if (var6.world == f_11537.level && var4.size() < 6) {
            float var7 = (float)(var1 - var6.startedAt) / f_30175;
            float var8 = Mth.clamp(var7 / var6.duration, 0.0F, 1.0F);
            float var9 = 1.0F - this.m_8393(Mth.clamp((var7 - var6.duration) / Math.max(var6.flashDuration, f_30176), 0.0F, 1.0F));
            if (!(var9 <= f_30177)) {
               Vec3 var10 = var6.position.subtract(var3);
               var4.add(new HitWave.fQrqciDCfnN2pM13((float)var10.x, (float)var10.y, (float)var10.z, var8, var9, var6.seed, 0.0F, 0.0F));
            }
         }
      }

      return var4;
   }

   private int m_8409() {
      return this.f_30114.m_8768() ? Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN) : this.f_30115.m_8768();
   }

   private record fQrqciDCfnN2pM13(float x, float y, float z, float progress, float envelope, float seed, float unusedX, float unusedY) {
   }

   private record xgKBFFaXyR9fT4z8(Vec3 position, long startedAt, float duration, float flashDuration, float seed, ClientLevel world) {
   }
}
