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

public class Class_DciMSjssCmaKqGks implements Class_NzJrN63M7QBpmAbi, Class_b8v0o2NnCtANmOp9 {
   private final RenderPipeline f_6614;
   private final CommandEncoder f_6615;
   private static final String f_6616 = "dimasik/time_dial";
   private static final String f_6617 = "time_dial";
   private static final String f_6618 = "time_dial";
   private static final String f_6619 = "TimeDial";
   private static final String f_6620 = "Scissors";
   private static final float f_6621 = 255.0F;
   private static final String f_6622 = "TimeDial";
   private static final String f_6623 = "Scissors";
   private static final String f_6624 = "timeDialPass";

   public void m_2479(float var1, float var2, float var3, float var4, float var5, float var6) {
      if (!this.m_5994(var1, var2, var3, var4)) {
         BufferBuilder var7 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION);
         this.m_5999(var7, var1, var2, var3, var4);
         RenderPass var8 = this.f_6615.createRenderPass(() -> f_6624, f_11537.gameRenderer.mainRenderTarget().getColorTextureView(), Optional.empty());
         RenderSystem.bindDefaultUniforms(var8);
         MemoryStack var11 = MemoryStack.stackPush();

         try {
            ByteBuffer var12 = Std140Builder.onStack(var11, 32)
               .putVec2(var3, var4)
               .putFloat(var5)
               .putFloat(var6)
               .putFloat(Class_Ssh31B3ljfKeWsvS.m_4821() / f_6621)
               .align(16)
               .get();
            GpuBufferSlice var9 = Class_HtEPOqGrAYrUdumw.m_2945(var12);
            GpuBufferSlice var10 = this.m_5995(new Vector4f(var1, var2, var3, var4), var11);
            var8.setUniform(f_6622, var9);
            var8.setUniform(f_6623, var10);
         } catch (Throwable var15) {
            if (var11 != null) {
               try {
                  var11.close();
               } catch (Throwable var14) {
                  var15.addSuppressed(var14);
               }
            }

            throw var15;
         }

         if (var11 != null) {
            var11.close();
         }

         this.m_5998(var7, var8, this.f_6614);
      }
   }

   public Class_DciMSjssCmaKqGks() {
      this.f_6614 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_6616)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_6617))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_6618))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(DefaultVertexFormat.POSITION, PrimitiveTopology.QUADS)
         .m_2729(f_6619, UniformType.UNIFORM_BUFFER)
         .m_2729(f_6620, UniformType.UNIFORM_BUFFER)
         .m_2722();
      this.f_6615 = RenderSystem.getDevice().createCommandEncoder();
   }
}
