package dev.dimasik.client.system;

import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.IndexType;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
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
import com.mojang.blaze3d.systems.RenderSystem.AutoStorageIndexBuffer;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.MeshData;
import com.mojang.blaze3d.vertex.MeshData.DrawState;
import java.nio.ByteBuffer;
import java.util.Optional;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;

public final class Class_tXNQy8JnA8G6nDOI implements Class_NzJrN63M7QBpmAbi {
   public static final Class_tXNQy8JnA8G6nDOI f_31830 = new Class_tXNQy8JnA8G6nDOI();
   private static final RenderPipeline f_31831 = m_8866(Class_tXNQy8JnA8G6nDOI.f_31845, PrimitiveTopology.QUADS);
   private static final RenderPipeline f_31832 = m_8866(Class_tXNQy8JnA8G6nDOI.f_31846, PrimitiveTopology.TRIANGLES);
   private static final RenderPipeline f_31833 = Class_GEnQMkY73qXewYpU.m_2718()
      .m_2726(Class_tXNQy8JnA8G6nDOI.f_31847)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_tXNQy8JnA8G6nDOI.f_31848))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_tXNQy8JnA8G6nDOI.f_31849))
      .m_2719(CompareOp.ALWAYS_PASS)
      .m_2737(false)
      .m_2725(false)
      .m_2727()
      .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
      .m_2729(Class_tXNQy8JnA8G6nDOI.f_31850, UniformType.UNIFORM_BUFFER)
      .m_2741(Class_tXNQy8JnA8G6nDOI.f_31851)
      .m_2741(Class_tXNQy8JnA8G6nDOI.f_31852)
      .m_2722();
   private TextureTarget f_31834;
   private TextureTarget f_31835;
   private static final String f_31836 = "dead_chams";
   private static final String f_31837 = "target_esp_rhomb_distortion_mask";
   private static final String f_31838 = "SceneSampler";
   private static final String f_31839 = "GlowSampler";
   private static final String f_31840 = "GlowDistortion";
   private static final String f_31841 = "glow-distortion-scene";
   private static final String f_31842 = "glow-distortion-mask";
   private static final String f_31843 = "glowDistortionComposite";
   private static final String f_31844 = "glowDistortionMask";
   private static final String f_31845 = "dimasik/glow_distortion_mask";
   private static final String f_31846 = "dimasik/glow_distortion_mask_triangles";
   private static final String f_31847 = "dimasik/glow_distortion";
   private static final String f_31848 = "hands_fullscreen";
   private static final String f_31849 = "target_esp_rhomb_distortion";
   private static final String f_31850 = "GlowDistortion";
   private static final String f_31851 = "SceneSampler";
   private static final String f_31852 = "GlowSampler";

   private static RenderPipeline m_8866(String var0, PrimitiveTopology var1) {
      return Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(var0)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_31836))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_31837))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.ADDITIVE)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, var1)
         .m_2722();
   }

   public void m_8867(BufferBuilder var1, float var2) {
      MeshData var3 = var1.build();
      if (var3 != null) {
         try {
            if (!(var2 <= 0.0F)) {
               DrawState var4 = var3.drawState();
               int var5 = var4.indexCount();
               AutoStorageIndexBuffer var6 = RenderSystem.getSequentialBuffer(var4.primitiveTopology());
               GpuBuffer var7 = var6.getBuffer(var5);
               IndexType var8 = var6.type();
               GpuBufferSlice var9 = Class_HtEPOqGrAYrUdumw.m_2944(var3.vertexBuffer(), var4.format().getVertexSize());
               this.m_8869(var9, var7, var8, var5, var2, var4.primitiveTopology());
               return;
            }
         } finally {
            var3.close();
         }
      }
   }

   public void m_8868(RenderTarget var1, float var2) {
      if (!(var2 <= 0.0F)) {
         RenderTarget var3 = f_11537.gameRenderer.mainRenderTarget();
         if (var3 != null && var3.getColorTextureView() != null && var1 != null && var1.getColorTextureView() != null) {
            this.m_8875(var3.width, var3.height, false);
            this.m_8872(var1, var3, var2, RenderSystem.getDevice().createCommandEncoder());
         }
      }
   }

   private Class_tXNQy8JnA8G6nDOI() {
   }

   private void m_8869(GpuBufferSlice var1, GpuBuffer var2, IndexType var3, int var4, float var5, PrimitiveTopology var6) {
      RenderTarget var7 = f_11537.gameRenderer.mainRenderTarget();
      if (var7 != null && var7.getColorTextureView() != null && var4 > 0 && !(var5 <= 0.0F)) {
         this.m_8875(var7.width, var7.height, true);
         CommandEncoder var8 = RenderSystem.getDevice().createCommandEncoder();
         RenderPass var9 = var8.createRenderPass(() -> f_31844, this.f_31834.getColorTextureView(), Optional.of(new Vector4f(0.0F)));

         try {
            RenderSystem.bindDefaultUniforms(var9);
            var9.setPipeline(var6 == PrimitiveTopology.TRIANGLES ? f_31832 : f_31831);
            var9.setVertexBuffer(0, var1);
            var9.setIndexBuffer(var2, var3);
            var9.drawIndexed(var4, 1, 0, 0, 0);
         } catch (Throwable var13) {
            if (var9 != null) {
               try {
                  var9.close();
               } catch (Throwable var12) {
                  var13.addSuppressed(var12);
               }
            }

            throw var13;
         }

         if (var9 != null) {
            var9.close();
         }

         this.m_8872(this.f_31834, var7, var5, var8);
      }
   }

   public void m_8871(GpuBuffer var1, GpuBuffer var2, IndexType var3, int var4, float var5, PrimitiveTopology var6) {
      this.m_8869(var1.slice(), var2, var3, var4, var5, var6);
   }

   private void m_8872(RenderTarget var1, RenderTarget var2, float var3, CommandEncoder var4) {
      var4.copyTextureToTexture(var2.getColorTexture(), this.f_31835.getColorTexture(), 0, 0, 0, 0, 0, var2.width, var2.height);
      MemoryStack var5 = MemoryStack.stackPush();

      try {
         ByteBuffer var6 = Std140Builder.onStack(var5, 16).putFloat(var3).align(16).get();
         GpuBufferSlice var7 = Class_HtEPOqGrAYrUdumw.m_2945(var6);
         RenderPass var8 = var4.createRenderPass(() -> f_31843, var2.getColorTextureView(), Optional.empty());

         try {
            var8.setPipeline(f_31833);
            var8.bindTexture(f_31838, this.f_31835.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
            var8.bindTexture(f_31839, var1.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
            var8.setUniform(f_31840, var7);
            var8.draw(3, 1, 0, 0);
         } catch (Throwable var13) {
            if (var8 != null) {
               try {
                  var8.close();
               } catch (Throwable var12) {
                  var13.addSuppressed(var12);
               }
            }

            throw var13;
         }

         if (var8 != null) {
            var8.close();
         }
      } catch (Throwable var14) {
         if (var5 != null) {
            try {
               var5.close();
            } catch (Throwable var11) {
               var14.addSuppressed(var11);
            }
         }

         throw var14;
      }

      if (var5 != null) {
         var5.close();
      }
   }

   public void m_8874(GpuBuffer var1, GpuBuffer var2, IndexType var3, int var4, float var5) {
      this.m_8871(var1, var2, var3, var4, var5, PrimitiveTopology.QUADS);
   }

   private void m_8875(int var1, int var2, boolean var3) {
      if (this.f_31835 == null) {
         this.f_31835 = new TextureTarget(f_31841, var1, var2, false, GpuFormat.RGBA8_UNORM);
      } else if (this.f_31835.width != var1 || this.f_31835.height != var2) {
         this.f_31835.resize(var1, var2);
      }

      if (var3) {
         if (this.f_31834 == null) {
            this.f_31834 = new TextureTarget(f_31842, var1, var2, false, GpuFormat.RGBA8_UNORM);
         } else if (this.f_31834.width != var1 || this.f_31834.height != var2) {
            this.f_31834.resize(var1, var2);
         }
      }
   }
}
