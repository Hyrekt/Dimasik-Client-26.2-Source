package dev.dimasik.client.system;

import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.GpuBufferSlice.MappedView;
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
import java.nio.ByteBuffer;
import java.util.Optional;
import java.util.function.Consumer;
import org.joml.Vector2f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;

public final class Class_Y1xeT7bRYGLzwOe2 {
   public static final Class_Y1xeT7bRYGLzwOe2 f_16090 = new Class_Y1xeT7bRYGLzwOe2();
   private static final RenderPipeline f_16091 = Class_GEnQMkY73qXewYpU.m_2718()
      .m_2726(Class_Y1xeT7bRYGLzwOe2.f_16112)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_Y1xeT7bRYGLzwOe2.f_16113))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_Y1xeT7bRYGLzwOe2.f_16114))
      .m_2719(CompareOp.ALWAYS_PASS)
      .m_2737(false)
      .m_2725(false)
      .m_2732(BlendFunction.TRANSLUCENT)
      .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
      .m_2729(Class_Y1xeT7bRYGLzwOe2.f_16115, UniformType.UNIFORM_BUFFER)
      .m_2741(Class_Y1xeT7bRYGLzwOe2.f_16116)
      .m_2741(Class_Y1xeT7bRYGLzwOe2.f_16117)
      .m_2741(Class_Y1xeT7bRYGLzwOe2.f_16118)
      .m_2741(Class_Y1xeT7bRYGLzwOe2.f_16119)
      .m_2722();
   private TextureTarget f_16092;
   private TextureTarget f_16093;
   private GpuBuffer f_16094;
   private GpuBuffer f_16095;
   private boolean f_16096;
   private boolean f_16097;
   private static final String f_16098 = "view-model-editor-hands";
   private static final String f_16099 = "view-model-editor-items";
   private static final float f_16100 = 255.0F;
   private static final float f_16101 = 255.0F;
   private static final float f_16102 = 255.0F;
   private static final float f_16103 = 255.0F;
   private static final String f_16104 = "HandSampler";
   private static final String f_16105 = "ItemSampler";
   private static final String f_16106 = "HandDepthSampler";
   private static final String f_16107 = "ItemDepthSampler";
   private static final String f_16108 = "ViewModelEditor";
   private static final String f_16109 = "viewModelEditorHitReadback";
   private static final String f_16110 = "viewModelEditorComposite";
   private static final String f_16111 = "viewModelEditorUniforms";
   private static final String f_16112 = "dimasik/view_model_editor";
   private static final String f_16113 = "hands_fullscreen";
   private static final String f_16114 = "view_model_editor";
   private static final String f_16115 = "ViewModelEditor";
   private static final String f_16116 = "HandSampler";
   private static final String f_16117 = "ItemSampler";
   private static final String f_16118 = "HandDepthSampler";
   private static final String f_16119 = "ItemDepthSampler";

   public RenderTarget m_5621() {
      RenderSystem.getDevice()
         .createCommandEncoder()
         .clearColorAndDepthTextures(this.f_16093.getColorTexture(), new Vector4f(0.0F), this.f_16093.getDepthTexture(), 0.0);
      return this.f_16093;
   }

   private Class_Y1xeT7bRYGLzwOe2() {
   }

   public RenderTarget m_5625() {
      RenderSystem.getDevice()
         .createCommandEncoder()
         .clearColorAndDepthTextures(this.f_16092.getColorTexture(), new Vector4f(0.0F), this.f_16092.getDepthTexture(), 0.0);
      return this.f_16092;
   }

   public void m_5626() {
      if (this.f_16092 != null) {
         this.f_16092.destroyBuffers();
         this.f_16092 = null;
      }

      if (this.f_16093 != null) {
         this.f_16093.destroyBuffers();
         this.f_16093 = null;
      }

      if (this.f_16094 != null) {
         this.f_16094.close();
      }

      if (this.f_16095 != null) {
         this.f_16095.close();
      }

      this.f_16094 = null;
      this.f_16095 = null;
      this.f_16096 = false;
      this.f_16097 = false;
   }

   private GpuBuffer m_5627(TextureTarget var1, GpuBuffer var2, int var3, int var4, Consumer<Boolean> var5, Runnable var6) {
      if (var1 != null && var1.getColorTexture() != null) {
         int var7 = var1.width;
         int var8 = var1.height;
         int var9 = Math.clamp(var3 - 2, 0, Math.max(0, var7 - 1));
         int var10 = Math.clamp(var4 - 2, 0, Math.max(0, var8 - 1));
         int var11 = Math.min(5, var7 - var9);
         int var12 = Math.min(5, var8 - var10);
         int var13 = var1.getColorTexture().getFormat().blockSize();
         long var14 = (long)var7 * var8 * var13;
         if (var2 == null || var2.size() < var14) {
            if (var2 != null) {
               var2.close();
            }

            var2 = RenderSystem.getDevice().createBuffer(() -> f_16109, 9, var14);
         }

         GpuBuffer var16 = var2;
         CommandEncoder var17 = RenderSystem.getDevice().createCommandEncoder();
         RenderSystem.getDevice().createCommandEncoder().copyTextureToBuffer(var1.getColorTexture(), var16, 0L, () -> {
            boolean var6x = false;

            try {
               MappedView var7x = var16.slice().map(true, false);

               try {
                  ByteBuffer var8x = var7x.data();
                  int var9x = var11 * var12;

                  for (int var10x = 0; var10x < var9x; var10x++) {
                     int var11x = var10x * var13;

                     for (int var12x = 0; var12x < var13; var12x++) {
                        if (var8x.get(var11x + var12x) != 0) {
                           var6x = true;
                           break;
                        }
                     }

                     if (var6x) {
                        break;
                     }
                  }
               } catch (Throwable var18) {
                  if (var7x != null) {
                     try {
                        var7x.close();
                     } catch (Throwable var17x) {
                        var18.addSuppressed(var17x);
                     }
                  }

                  throw var18;
               }

               if (var7x != null) {
                  var7x.close();
               }
            } finally {
               var6.run();
            }

            var5.accept(var6x);
         }, 0, var9, var10, var11, var12);
         return var2;
      } else {
         var6.run();
         return var2;
      }
   }

   public void m_5628(int var1, int var2, Consumer<Boolean> var3) {
      if (!this.f_16096) {
         this.f_16096 = true;
         this.f_16094 = this.m_5627(this.f_16092, this.f_16094, var1, var2, var3, () -> this.f_16096 = false);
      }
   }

   public void m_5629(int var1, int var2) {
      if (this.f_16092 == null) {
         this.f_16092 = new TextureTarget(f_16098, var1, var2, true, GpuFormat.RGBA8_UNORM);
         this.f_16093 = new TextureTarget(f_16099, var1, var2, true, GpuFormat.RGBA8_UNORM);
      } else if (this.f_16092.width != var1 || this.f_16092.height != var2) {
         this.f_16092.resize(var1, var2);
         this.f_16093.resize(var1, var2);
      }
   }

   public void m_5632(RenderTarget var1, float var2, float var3, float var4, float var5, Vector2f var6, Vector2f var7, int var8) {
      if (this.f_16092 != null
         && this.f_16093 != null
         && var1 != null
         && this.f_16092.getColorTextureView() != null
         && this.f_16093.getColorTextureView() != null
         && this.f_16092.getDepthTextureView() != null
         && this.f_16093.getDepthTextureView() != null
         && var1.getColorTextureView() != null) {
         CommandEncoder var9 = RenderSystem.getDevice().createCommandEncoder();
         MemoryStack var10 = MemoryStack.stackPush();

         try {
            ByteBuffer var11 = Std140Builder.onStack(var10, 48)
               .putVec4(var2, var3, var4, var5)
               .putVec4(var6.x, var6.y, var7.x, var7.y)
               .putVec4(
                  Class_BftdentXEtGbugJw.m_2309(var8) / f_16100,
                  Class_BftdentXEtGbugJw.m_2299(var8) / f_16101,
                  Class_BftdentXEtGbugJw.m_2308(var8) / f_16102,
                  Class_BftdentXEtGbugJw.m_2297(var8) / f_16103
               )
               .get();
            GpuBuffer var12 = RenderSystem.getDevice().createBuffer(() -> f_16111, 128, var11);

            try {
               RenderPass var13 = var9.createRenderPass(() -> f_16110, var1.getColorTextureView(), Optional.empty());

               try {
                  var13.setPipeline(f_16091);
                  var13.bindTexture(f_16104, this.f_16092.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
                  var13.bindTexture(f_16105, this.f_16093.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
                  var13.bindTexture(f_16106, this.f_16092.getDepthTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
                  var13.bindTexture(f_16107, this.f_16093.getDepthTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
                  var13.setUniform(f_16108, var12);
                  var13.draw(3, 1, 0, 0);
               } catch (Throwable var19) {
                  if (var13 != null) {
                     try {
                        var13.close();
                     } catch (Throwable var18) {
                        var19.addSuppressed(var18);
                     }
                  }

                  throw var19;
               }

               if (var13 != null) {
                  var13.close();
               }
            } catch (Throwable var20) {
               if (var12 != null) {
                  try {
                     var12.close();
                  } catch (Throwable var17) {
                     var20.addSuppressed(var17);
                  }
               }

               throw var20;
            }

            if (var12 != null) {
               var12.close();
            }
         } catch (Throwable var21) {
            if (var10 != null) {
               try {
                  var10.close();
               } catch (Throwable var16) {
                  var21.addSuppressed(var16);
               }
            }

            throw var21;
         }

         if (var10 != null) {
            var10.close();
         }
      }
   }

   public void m_5633(int var1, int var2, Consumer<Boolean> var3) {
      if (!this.f_16097) {
         this.f_16097 = true;
         this.f_16095 = this.m_5627(this.f_16093, this.f_16095, var1, var2, var3, () -> this.f_16097 = false);
      }
   }
}
