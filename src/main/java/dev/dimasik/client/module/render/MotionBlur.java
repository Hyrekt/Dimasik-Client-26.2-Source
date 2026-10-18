package dev.dimasik.client.module.render;

import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuFence;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.pipeline.TextureTarget;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.shaders.UniformType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.DeviceInfo;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_GEnQMkY73qXewYpU;
import dev.dimasik.client.system.Class_bYB5A9m3txWhzKnd;
import dev.dimasik.client.system.Class_wHRRCm2tlLY7DN4I;
import java.nio.ByteBuffer;
import java.util.Optional;
import net.minecraft.client.Camera;
import net.minecraft.client.CameraType;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.lwjgl.system.MemoryStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MotionBlur extends Module {
   private static final Logger f_2063 = LoggerFactory.getLogger(MotionBlur.class);
   private static final int f_2064 = 336;
   private static final float f_2065 = 0.24F;
   private final SliderSetting f_2066;
   private final RenderPipeline f_2067;
   private final Matrix4f f_2068;
   private final Matrix4f f_2069;
   private final Matrix4f f_2070;
   private final Matrix4f f_2071;
   private final Matrix4f f_2072;
   private final Matrix4f f_2073;
   private final Class_bYB5A9m3txWhzKnd f_2074;
   private final GpuBuffer[] f_2075;
   private final GpuFence[] f_2076;
   private TextureTarget f_2077;
   private int f_2078;
   private int f_2079;
   private int f_2080;
   private boolean f_2081;
   private Vec3 f_2082;
   private float f_2083;
   private float f_2084;
   private CameraType f_2085;
   private static final String f_2086 = "MotionBlur";
   private static final String f_2087 = "Физически основанный MotionBlur, очень сильно повышает плавность картинки.";
   private static final String f_2088 = "Плавность";
   private static final float f_2089 = 0.68F;
   private static final float f_2090 = 0.01F;
   private static final String f_2091 = "dimasik/motion_blur";
   private static final String f_2092 = "hands_fullscreen";
   private static final String f_2093 = "motion_blur";
   private static final String f_2094 = "MotionBlur";
   private static final String f_2095 = "SceneSampler";
   private static final String f_2096 = "DepthSampler";
   private static final float f_2097 = 1.0E-5F;
   private static final float f_2098 = 1.0E-8F;
   private static final float f_2099 = 1.0E-8F;
   private static final float f_2100 = 0.0062F;
   private static final float f_2101 = -0.0074F;
   private static final float f_2102 = 4.0E-5F;
   private static final String f_2103 = "MotionBlur shader pipeline is invalid";
   private static final String f_2104 = "MotionBlur output is unavailable";
   private static final long f_2105 = 336L;
   private static final String f_2106 = "SceneSampler";
   private static final String f_2107 = "DepthSampler";
   private static final String f_2108 = "MotionBlur";
   private static final String f_2109 = "MotionBlur apply failed on {} / {} ({})";
   private static final float f_2110 = 3.0F;
   private static final float f_2111 = 0.38F;
   private static final float f_2112 = 0.92F;
   private static final float f_2113 = 1.1F;
   private static final float f_2114 = 2.25F;
   private static final float f_2115 = 7.0F;
   private static final float f_2116 = 24.0F;
   private static final float f_2117 = 82.0F;
   private static final float f_2118 = 0.3F;
   private static final float f_2119 = 0.42F;
   private static final float f_2120 = 0.22F;
   private static final float f_2121 = 1.12F;
   private static final float f_2122 = 0.68F;
   private static final float f_2123 = 2.85F;
   private static final float f_2124 = 1.35F;
   private static final float f_2125 = 0.035F;
   private static final float f_2126 = 0.075F;
   private static final float f_2127 = 0.00175F;
   private static final float f_2128 = 0.00225F;
   private static final double f_2129 = 0.12;
   private static final double f_2130 = 0.045;
   private static final String f_2131 = "MotionBlur output";
   private static final float f_2132 = -0.24F;
   private static final float f_2133 = 0.24F;
   private static final String f_2134 = "MotionBlur";
   private static final String f_2135 = "MotionBlur uniforms";

   private float m_1351(Camera var1) {
      float var2 = m_1356(var1.yRot() - this.f_2083);
      float var3 = var1.xRot() - this.f_2084;
      double var4 = var1.position().distanceTo(this.f_2082);
      float var6 = Math.abs(var2) * f_2127 + Math.abs(var3) * f_2128;
      float var7 = (float)Math.min(f_2129, var4 * f_2130);
      return var6 + var7;
   }

   @Override
   public void m_778() {
      this.f_2081 = false;
      this.m_1362();
   }

   private void m_1352() {
      TextureTarget var1 = this.f_2077;
      this.f_2077 = null;
      if (var1 != null) {
         RenderSystem.queueFencedTask(var1::destroyBuffers);
      }
   }

   public void m_1354(Matrix4fc var1, Matrix4fc var2) {
      if (!this.f_2081
         && this.m_776()
         && f_11537.level != null
         && f_11537.player != null
         && f_11537.gui.screen() == null
         && var1 != null
         && var2 != null
         && var1.isFinite()
         && var2.isFinite()) {
         this.f_2068.set(var1);
         this.f_2069.set(var2);
         Camera var3 = f_11537.gameRenderer.mainCamera();
         RenderTarget var4 = f_11537.gameRenderer.mainRenderTarget();
         if (var4 != null && var3 != null) {
            GpuTexture var5 = var4.getColorTexture();
            GpuTextureView var6 = var4.getColorTextureView();
            GpuTexture var7 = var4.getDepthTexture();
            GpuTextureView var8 = var4.getDepthTextureView();
            if (var5 != null && !var5.isClosed() && var6 != null && !var6.isClosed() && var7 != null && !var7.isClosed() && var8 != null && !var8.isClosed()) {
               int var9 = var5.getWidth(0);
               int var10 = var5.getHeight(0);
               if (var9 > 1
                  && var10 > 1
                  && var4.width == var9
                  && var4.height == var10
                  && var7.getWidth(0) == var9
                  && var7.getHeight(0) == var10
                  && var5.getFormat() == GpuFormat.RGBA8_UNORM) {
                  MotionBlur.RLrXrDUY98ZnJhmD var11 = this.m_1360();
                  if (var11.strength <= f_2097) {
                     this.m_1362();
                  } else {
                     if (this.f_2079 != var9 || this.f_2080 != var10) {
                        this.m_1362();
                        this.f_2079 = var9;
                        this.f_2080 = var10;
                     }

                     if (!(Math.abs(this.f_2068.determinant()) <= f_2098) && !(Math.abs(this.f_2069.determinant()) <= f_2099)) {
                        if (this.f_2085 != f_11537.options.getCameraType()) {
                           this.m_1362();
                        }

                        this.f_2085 = f_11537.options.getCameraType();
                        Vec3 var12 = var3.position();
                        if (this.f_2074.m_6072(System.nanoTime(), this.f_2068, this.f_2069, var12.x, var12.y, var12.z, var3.yRot(), var3.xRot())) {
                           this.f_2070.set(this.f_2074.m_6067());
                           this.f_2071.set(this.f_2074.m_6066());
                           this.f_2082 = new Vec3(this.f_2074.m_6071().x(), this.f_2074.m_6071().y(), this.f_2074.m_6071().z());
                           this.f_2083 = this.f_2074.m_6068();
                           this.f_2084 = this.f_2074.m_6069();
                           float var13 = this.m_1351(var3);
                           float var14 = m_1361(m_1356(var3.yRot() - this.f_2083) * f_2100);
                           float var15 = m_1361((var3.xRot() - this.f_2084) * f_2101);
                           if (!(var13 < var11.activation * f_2102)) {
                              this.f_2072.set(this.f_2068).invert();
                              this.f_2073.set(this.f_2069).invert();
                              if (this.f_2072.isFinite() && this.f_2073.isFinite() && this.f_2070.isFinite() && this.f_2071.isFinite()) {
                                 Vec3 var16 = var12.subtract(this.f_2082);

                                 try {
                                    MemoryStack var17 = MemoryStack.stackPush();

                                    label203: {
                                       try {
                                          int var33 = this.m_1357();
                                          if (var33 < 0) {
                                             break label203;
                                          }

                                          if (!RenderSystem.getDevice().precompilePipeline(this.f_2067).isValid()) {
                                             throw new IllegalStateException(f_2103);
                                          }

                                          TextureTarget var19 = this.m_1359(var9, var10);
                                          GpuTexture var20 = var19.getColorTexture();
                                          GpuTextureView var21 = var19.getColorTextureView();
                                          if (var20 == null || var20.isClosed() || var21 == null || var21.isClosed()) {
                                             throw new IllegalStateException(f_2104);
                                          }

                                          CommandEncoder var22 = RenderSystem.getDevice().createCommandEncoder();
                                          ByteBuffer var23 = Std140Builder.onStack(var17, 336)
                                             .putMat4f(this.f_2072)
                                             .putMat4f(this.f_2073)
                                             .putMat4f(this.f_2070)
                                             .putMat4f(this.f_2071)
                                             .putVec4((float)var16.x, (float)var16.y, (float)var16.z, var11.strength)
                                             .putVec4(var11.temporalScale, 0.0F, 0.0F, 0.0F)
                                             .putVec4(var11.maxRadius, var11.edgeFocus, var11.chromatic, var11.depthGuard)
                                             .putVec4(var11.decay, var11.activation, var13, var11.samples)
                                             .putVec4(var14, var15, var9, var10)
                                             .get();
                                          GpuBuffer var24 = this.f_2075[var33];
                                          if (var24 == null || var24.isClosed()) {
                                             var24 = RenderSystem.getDevice().createBuffer(() -> f_2135, 136, f_2105);
                                             this.f_2075[var33] = var24;
                                          }

                                          var22.writeToBuffer(var24.slice(), var23);
                                          RenderPass var25 = var22.createRenderPass(() -> f_2134, var21, Optional.empty());

                                          try {
                                             var25.setPipeline(this.f_2067);
                                             var25.bindTexture(f_2106, var6, RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
                                             var25.bindTexture(f_2107, var8, RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
                                             var25.setUniform(f_2108, var24);
                                             var25.draw(3, 1, 0, 0);
                                          } catch (Throwable var30) {
                                             if (var25 != null) {
                                                try {
                                                   var25.close();
                                                } catch (Throwable var29) {
                                                   var30.addSuppressed(var29);
                                                }
                                             }

                                             throw var30;
                                          }

                                          if (var25 != null) {
                                             var25.close();
                                          }

                                          var22.copyTextureToTexture(var20, var5, 0, 0, 0, 0, 0, var9, var10);
                                          this.f_2076[var33] = var22.createFence();
                                          this.f_2078 = (var33 + 1) % this.f_2075.length;
                                       } catch (Throwable var31) {
                                          if (var17 != null) {
                                             try {
                                                var17.close();
                                             } catch (Throwable var28) {
                                                var31.addSuppressed(var28);
                                             }
                                          }

                                          throw var31;
                                       }

                                       if (var17 != null) {
                                          var17.close();
                                       }

                                       return;
                                    }

                                    if (var17 != null) {
                                       var17.close();
                                    }
                                 } catch (Throwable var32) {
                                    if (!this.f_2081) {
                                       DeviceInfo var18 = RenderSystem.getDevice().getDeviceInfo();
                                       f_2063.error(f_2109, new Object[]{var18.name(), var18.backendName(), var18.driverInfo(), var32});
                                       this.f_2081 = true;
                                    }

                                    this.m_1362();
                                 }
                              } else {
                                 this.m_1362();
                              }
                           }
                        }
                     } else {
                        this.m_1362();
                     }
                  }
               } else {
                  this.m_1362();
               }
            } else {
               this.m_1362();
            }
         } else {
            this.m_1362();
         }
      } else {
         this.m_1362();
      }
   }

   @Override
   public void m_732() {
      this.m_1358();
   }

   private static float m_1356(float var0) {
      return Mth.wrapDegrees(var0);
   }

   private int m_1357() {
      int var1 = 0;

      int var2;
      while (true) {
         if (var1 >= this.f_2075.length) {
            return -1;
         }

         var2 = (this.f_2078 + var1) % this.f_2075.length;
         GpuFence var3 = this.f_2076[var2];
         if (var3 == null) {
            break;
         }

         if (var3.awaitCompletion(0L)) {
            var3.close();
            this.f_2076[var2] = null;
            break;
         }

         var1++;
      }

      return var2;
   }

   public void m_1358() {
      if (!RenderSystem.isOnRenderThread()) {
         f_11537.execute(this::m_1358);
      } else {
         this.m_1362();
         this.f_2081 = false;
         this.f_2078 = 0;

         for (int var1 = 0; var1 < this.f_2075.length; var1++) {
            if (this.f_2076[var1] != null) {
               this.f_2076[var1].close();
               this.f_2076[var1] = null;
            }

            GpuBuffer var2 = this.f_2075[var1];
            this.f_2075[var1] = null;
            if (var2 != null && !var2.isClosed()) {
               RenderSystem.queueFencedTask(var2::close);
            }
         }

         this.m_1352();
      }
   }

   public MotionBlur() {
      super(f_2086, f_2087, Category.RENDER);
      this.f_2066 = new SliderSetting(f_2088, f_2089, 0.0F, 1.0F).m_828(f_2090);
      this.f_2067 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_2091)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_2092))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_2093))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2727()
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_2094, UniformType.UNIFORM_BUFFER)
         .m_2741(f_2095)
         .m_2741(f_2096)
         .m_2722();
      this.f_2068 = new Matrix4f();
      this.f_2069 = new Matrix4f();
      this.f_2070 = new Matrix4f();
      this.f_2071 = new Matrix4f();
      this.f_2072 = new Matrix4f();
      this.f_2073 = new Matrix4f();
      this.f_2074 = new Class_bYB5A9m3txWhzKnd();
      this.f_2075 = new GpuBuffer[3];
      this.f_2076 = new GpuFence[this.f_2075.length];
      this.f_2082 = Vec3.ZERO;
      this.m_795(this.f_2066);
   }

   private TextureTarget m_1359(int var1, int var2) {
      if (this.f_2077 != null && (this.f_2077.width != var1 || this.f_2077.height != var2)) {
         this.m_1352();
      }

      if (this.f_2077 == null) {
         this.f_2077 = new TextureTarget(f_2131, var1, var2, false, GpuFormat.RGBA8_UNORM);
      }

      return this.f_2077;
   }

   private MotionBlur.RLrXrDUY98ZnJhmD m_1360() {
      float var1 = Math.clamp(this.f_2066.m_8768(), 0.0F, 1.0F);
      float var2 = var1 * var1 * (f_2110 - 2.0F * var1);
      return new MotionBlur.RLrXrDUY98ZnJhmD(
         f_2111 + var2 * f_2112,
         f_2113 + var2 * f_2114,
         5 + Math.round(var2 * f_2115),
         f_2116 + var2 * f_2117,
         f_2118 + var2 * f_2119,
         f_2120 + var2 * f_2121,
         f_2122,
         f_2123 - var2 * f_2124,
         f_2125 + (1.0F - var2) * f_2126
      );
   }

   private static float m_1361(float var0) {
      return !Float.isFinite(var0) ? 0.0F : Math.clamp(var0, f_2132, f_2133);
   }

   private void m_1362() {
      this.f_2074.m_6065();
      this.f_2085 = null;
      this.f_2082 = Vec3.ZERO;
      this.f_2083 = 0.0F;
      this.f_2084 = 0.0F;
      this.f_2070.identity();
      this.f_2071.identity();
   }

   private record RLrXrDUY98ZnJhmD(
      float strength, float temporalScale, int samples, float maxRadius, float edgeFocus, float chromatic, float depthGuard, float decay, float activation
   ) {
   }
}
