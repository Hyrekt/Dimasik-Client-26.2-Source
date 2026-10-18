package dev.dimasik.client.system;

import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.shaders.ShaderSource;
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

public class Class_t2AosHpvQKqedDqw implements Class_b8v0o2NnCtANmOp9, Class_NzJrN63M7QBpmAbi {
   private final RenderPipeline f_31513;
   private final CommandEncoder f_31514;
   private static final String f_31515 = "dimasik/rect";
   private static final String f_31516 = "rect";
   private static final String f_31517 = "rect";
   private static final String f_31518 = "AllInOne";
   private static final float f_31519 = 1.5F;
   private static final float f_31520 = 255.0F;
   private static final float f_31521 = 255.0F;
   private static final float f_31522 = 255.0F;
   private static final float f_31523 = 255.0F;
   private static final String f_31524 = "AllInOne";
   private static final String f_31525 = "rectPass";

   public void m_8782(ShaderSource var1) {
      RenderSystem.getDevice().precompilePipeline(this.f_31513, var1);
   }

   public void m_8783(float var1, float var2, float var3, float var4, Vector4f var5, Vector4i var6) {
      if (!this.m_5994(var1, var2, var3, var4) && !this.m_5997(var6)) {
         Class_PoKta0VE7AdhY1En var7 = Class_PoKta0VE7AdhY1En.m_4161();
         BufferBuilder var8 = var7.m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION);
         this.m_5999(var8, var1, var2, var3, var4);
         RenderPass var9 = this.f_31514.createRenderPass(() -> f_31525, f_11537.gameRenderer.mainRenderTarget().getColorTextureView(), Optional.empty());
         RenderSystem.bindDefaultUniforms(var9);
         MemoryStack var11 = MemoryStack.stackPush();

         try {
            float var12 = f_31519;
            if (var5.x == 0.0F && var5.y == 0.0F && var5.z == 0.0F && var5.w == 0.0F) {
               var12 = 0.0F;
            }

            Vector4f var13 = Class_BftdentXEtGbugJw.m_2298(var6.x);
            Vector4f var14 = Class_BftdentXEtGbugJw.m_2298(var6.y);
            Vector4f var15 = Class_BftdentXEtGbugJw.m_2298(var6.z);
            Vector4f var16 = Class_BftdentXEtGbugJw.m_2298(var6.w);
            var13.w = var13.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / f_31520);
            var14.w = var14.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / f_31521);
            var15.w = var15.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / f_31522);
            var16.w = var16.w * (Class_Ssh31B3ljfKeWsvS.m_4821() / f_31523);
            ByteBuffer var17 = Std140Builder.onStack(var11, 128)
               .putVec4(var5)
               .putVec2(var4, var3)
               .putFloat(var12)
               .putVec4(var13)
               .putVec4(var14)
               .putVec4(var15)
               .putVec4(var16)
               .putVec4(this.m_5996(new Vector4f(var1, var2, var3, var4)))
               .putFloat(Class_Ssh31B3ljfKeWsvS.m_4812() ? 1.0F : 0.0F)
               .get();
            GpuBufferSlice var10 = Class_HtEPOqGrAYrUdumw.m_2945(var17);
            var9.setUniform(f_31524, var10);
         } catch (Throwable var19) {
            if (var11 != null) {
               try {
                  var11.close();
               } catch (Throwable var18) {
                  var19.addSuppressed(var18);
               }
            }

            throw var19;
         }

         if (var11 != null) {
            var11.close();
         }

         this.m_5998(var8, var9, this.f_31513);
      }
   }

   public Class_t2AosHpvQKqedDqw() {
      this.f_31513 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_31515)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_31516))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_31517))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2739(DefaultVertexFormat.POSITION, PrimitiveTopology.QUADS)
         .m_2729(f_31518, UniformType.UNIFORM_BUFFER)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2722();
      this.f_31514 = RenderSystem.getDevice().createCommandEncoder();
   }
}
