package dev.dimasik.client.system;

import com.google.common.base.Suppliers;
import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.PrimitiveTopology;
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
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import java.nio.ByteBuffer;
import java.util.Optional;
import java.util.function.Supplier;
import org.joml.Vector4f;
import org.joml.Vector4i;
import org.lwjgl.system.MemoryStack;

public class Class_5cosmb3NJrfL8IQe implements Class_NzJrN63M7QBpmAbi, Class_b8v0o2NnCtANmOp9 {
   private final RenderPipeline f_2522;
   private final Supplier<TextureTarget> f_2523;
   private final RenderTarget f_2524;
   private final CommandEncoder f_2525;
   private static final String f_2526 = "dimasik/blur";
   private static final String f_2527 = "blur";
   private static final String f_2528 = "blur";
   private static final String f_2529 = "Forms";
   private static final String f_2530 = "Colors";
   private static final String f_2531 = "Scissors";
   private static final String f_2532 = "Sampler0";
   private static final String f_2533 = "Sampler0";
   private static final float f_2534 = 1.5F;
   private static final String f_2535 = "Forms";
   private static final String f_2536 = "Colors";
   private static final String f_2537 = "Scissors";
   private static final String f_2538 = "blurPass";
   private static final String f_2539 = "temp";

   public Class_5cosmb3NJrfL8IQe() {
      this.f_2522 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_2526)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_2527))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_2528))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2739(DefaultVertexFormat.POSITION, PrimitiveTopology.QUADS)
         .m_2729(f_2529, UniformType.UNIFORM_BUFFER)
         .m_2729(f_2530, UniformType.UNIFORM_BUFFER)
         .m_2729(f_2531, UniformType.UNIFORM_BUFFER)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2741(f_2532)
         .m_2722();
      this.f_2523 = Suppliers.memoize(() -> new TextureTarget(f_2539, 1920, 1024, false, GpuFormat.RGBA8_UNORM));
      this.f_2524 = f_11537.gameRenderer.mainRenderTarget();
      this.f_2525 = RenderSystem.getDevice().createCommandEncoder();
   }

   public void m_1491(float var1, float var2, float var3, float var4, float var5, Vector4f var6, Vector4i var7) {
      if (!this.m_5994(var1, var2, var3, var4) && !this.m_5997(var7)) {
         TextureTarget var8 = this.f_2523.get();
         if (var8.width != this.f_2524.width || var8.height != this.f_2524.height) {
            var8.resize(this.f_2524.width, this.f_2524.height);
         }

         this.f_2525.copyTextureToTexture(this.f_2524.getColorTexture(), var8.getColorTexture(), 0, 0, 0, 0, 0, this.f_2524.width, this.f_2524.height);
         Class_PoKta0VE7AdhY1En var9 = Class_PoKta0VE7AdhY1En.m_4161();
         BufferBuilder var10 = var9.m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION);
         this.m_5999(var10, var1, var2, var3, var4);
         RenderPass var11 = this.f_2525.createRenderPass(() -> f_2538, this.f_2524.getColorTextureView(), Optional.empty());
         var11.bindTexture(f_2533, var8.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
         RenderSystem.bindDefaultUniforms(var11);
         MemoryStack var15 = MemoryStack.stackPush();

         try {
            ByteBuffer var16 = Std140Builder.onStack(var15, 32).putVec4(var6).putVec2(var4, var3).putFloat(f_2534).putFloat(var5).get();
            GpuBufferSlice var12 = this.m_5995(new Vector4f(var1, var2, var3, var4), var15);
            GpuBufferSlice var13 = Class_HtEPOqGrAYrUdumw.m_2945(var16);
            GpuBufferSlice var14 = this.m_5993(var15, var7);
            var11.setUniform(f_2535, var13);
            var11.setUniform(f_2536, var14);
            var11.setUniform(f_2537, var12);
         } catch (Throwable var19) {
            if (var15 != null) {
               try {
                  var15.close();
               } catch (Throwable var18) {
                  var19.addSuppressed(var18);
               }
            }

            throw var19;
         }

         if (var15 != null) {
            var15.close();
         }

         this.m_5998(var10, var11, this.f_2522);
      }
   }
}
