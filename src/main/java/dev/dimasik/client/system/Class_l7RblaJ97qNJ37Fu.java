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
import org.joml.Vector4i;
import org.lwjgl.system.MemoryStack;

public class Class_l7RblaJ97qNJ37Fu implements Class_b8v0o2NnCtANmOp9, Class_NzJrN63M7QBpmAbi {
   private final RenderPipeline f_25178;
   private final CommandEncoder f_25179;
   private static final String f_25180 = "dimasik/outline";
   private static final String f_25181 = "outline";
   private static final String f_25182 = "outline";
   private static final String f_25183 = "Forms";
   private static final String f_25184 = "Colors";
   private static final String f_25185 = "Scissors";
   private static final float f_25186 = 1.5F;
   private static final float f_25187 = 1.5F;
   private static final String f_25188 = "Forms";
   private static final String f_25189 = "Colors";
   private static final String f_25190 = "Scissors";
   private static final String f_25191 = "outlinePass";

   public Class_l7RblaJ97qNJ37Fu() {
      this.f_25178 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_25180)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_25181))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_25182))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2739(DefaultVertexFormat.POSITION, PrimitiveTopology.QUADS)
         .m_2729(f_25183, UniformType.UNIFORM_BUFFER)
         .m_2729(f_25184, UniformType.UNIFORM_BUFFER)
         .m_2729(f_25185, UniformType.UNIFORM_BUFFER)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2722();
      this.f_25179 = RenderSystem.getDevice().createCommandEncoder();
   }

   public void m_7487(float var1, float var2, float var3, float var4, float var5, Vector4f var6, Vector4i var7) {
      if (!this.m_5994(var1, var2, var3, var4) && !this.m_5997(var7)) {
         Class_PoKta0VE7AdhY1En var8 = Class_PoKta0VE7AdhY1En.m_4161();
         BufferBuilder var9 = var8.m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION);
         this.m_5999(var9, var1, var2, var3, var4);
         RenderPass var10 = this.f_25179.createRenderPass(() -> f_25191, f_11537.gameRenderer.mainRenderTarget().getColorTextureView(), Optional.empty());
         RenderSystem.bindDefaultUniforms(var10);
         MemoryStack var14 = MemoryStack.stackPush();

         try {
            float var15 = f_25186;
            if (var6.x == 0.0F && var6.y == 0.0F && var6.z == 0.0F && var6.w == 0.0F) {
               var15 = 0.0F;
            }

            ByteBuffer var16 = Std140Builder.onStack(var14, 32).putVec4(var6).putVec2(var4, var3).putFloat(var15).putFloat(var5 - f_25187).get();
            GpuBufferSlice var11 = this.m_5995(new Vector4f(var1, var2, var3, var4), var14);
            GpuBufferSlice var12 = Class_HtEPOqGrAYrUdumw.m_2945(var16);
            GpuBufferSlice var13 = this.m_5993(var14, var7);
            var10.setUniform(f_25188, var12);
            var10.setUniform(f_25189, var13);
            var10.setUniform(f_25190, var11);
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

         this.m_5998(var9, var10, this.f_25178);
      }
   }
}
