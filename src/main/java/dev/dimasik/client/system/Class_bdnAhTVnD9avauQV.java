package dev.dimasik.client.system;

import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.shaders.UniformType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import java.nio.ByteBuffer;
import java.util.Optional;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;

public class Class_bdnAhTVnD9avauQV implements Class_b8v0o2NnCtANmOp9, Class_NzJrN63M7QBpmAbi {
   private final RenderPipeline f_17733;
   private final CommandEncoder f_17734;
   private static final String f_17735 = "dimasik/module_glare";
   private static final String f_17736 = "module_glare";
   private static final String f_17737 = "module_glare";
   private static final String f_17738 = "GlareData";
   private static final String f_17739 = "Scissors";
   private static final String f_17740 = "GlareData";
   private static final String f_17741 = "Scissors";
   private static final String f_17742 = "moduleGlarePass";

   public Class_bdnAhTVnD9avauQV() {
      this.f_17733 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_17735)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_17736))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_17737))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2739(DefaultVertexFormat.POSITION, PrimitiveTopology.QUADS)
         .m_2729(f_17738, UniformType.UNIFORM_BUFFER)
         .m_2729(f_17739, UniformType.UNIFORM_BUFFER)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2722();
      this.f_17734 = RenderSystem.getDevice().createCommandEncoder();
   }

   public void m_6080(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      Class_PoKta0VE7AdhY1En var9 = Class_PoKta0VE7AdhY1En.m_4161();
      BufferBuilder var10 = var9.m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION);
      this.m_5999(var10, var1, var2, var3, var4);
      RenderPass var11 = this.f_17734.createRenderPass(() -> f_17742, f_11537.gameRenderer.mainRenderTarget().getColorTextureView(), Optional.empty());
      RenderSystem.bindDefaultUniforms(var11);
      MemoryStack var14 = MemoryStack.stackPush();

      try {
         ByteBuffer var15 = Std140Builder.onStack(var14, 48)
            .putVec4(new Vector4f(var8))
            .putVec4(new Vector4f(var4, var3, var5, var6))
            .putVec4(new Vector4f(var7, 0.0F, 0.0F, 0.0F))
            .get();
         GpuBufferSlice var12 = this.m_5995(new Vector4f(var1, var2, var3, var4), var14);
         GpuBufferSlice var13 = Class_HtEPOqGrAYrUdumw.m_2945(var15);
         var11.setUniform(f_17740, var13);
         var11.setUniform(f_17741, var12);
      } catch (Throwable var18) {
         if (var14 != null) {
            try {
               var14.close();
            } catch (Throwable var17) {
               var18.addSuppressed(var17);
            }
         }

         throw var18;
      }

      if (var14 != null) {
         var14.close();
      }

      this.m_5998(var10, var11, this.f_17733);
   }
}
