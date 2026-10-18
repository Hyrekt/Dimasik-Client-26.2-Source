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
import org.joml.Vector4i;
import org.lwjgl.system.MemoryStack;

public final class Class_pgtjhKJjK46C8cZl implements Class_NzJrN63M7QBpmAbi, Class_b8v0o2NnCtANmOp9 {
   private final RenderPipeline f_28767;
   private final RenderPipeline f_28768;
   private final CommandEncoder f_28769;
   private final Supplier<TextureTarget> f_28770;
   private static final String f_28771 = "dimasik/potion_wheel";
   private static final String f_28772 = "potion_wheel";
   private static final String f_28773 = "potion_wheel";
   private static final String f_28774 = "Wheel";
   private static final String f_28775 = "Colors";
   private static final String f_28776 = "dimasik/potion_wheel_blur";
   private static final String f_28777 = "potion_wheel";
   private static final String f_28778 = "potion_wheel_blur";
   private static final String f_28779 = "Wheel";
   private static final String f_28780 = "Colors";
   private static final String f_28781 = "Sampler0";
   private static final String f_28782 = "Sampler0";
   private static final String f_28783 = "Wheel";
   private static final String f_28784 = "Colors";
   private static final String f_28785 = "Wheel";
   private static final String f_28786 = "Colors";
   private static final String f_28787 = "potionWheelPass";
   private static final String f_28788 = "potionWheelBlurPass";
   private static final String f_28789 = "potion_wheel_blur";

   public void m_8198(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      if (!(var4 <= var3) && !(var4 <= 0.0F)) {
         float var10 = var4 * 2.0F;
         BufferBuilder var11 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION);
         this.m_5999(var11, var1 - var4, var2 - var4, var10, var10);
         RenderPass var12 = this.f_28769.createRenderPass(() -> f_28787, f_11537.gameRenderer.mainRenderTarget().getColorTextureView(), Optional.empty());
         RenderSystem.bindDefaultUniforms(var12);
         MemoryStack var15 = MemoryStack.stackPush();

         try {
            ByteBuffer var16 = Std140Builder.onStack(var15, 32)
               .putVec2(var10, var10)
               .putFloat(var3)
               .putFloat(var4)
               .putFloat(var5)
               .putFloat(var6)
               .putFloat(var7)
               .putFloat(var8)
               .get();
            GpuBufferSlice var13 = Class_HtEPOqGrAYrUdumw.m_2945(var16);
            GpuBufferSlice var14 = this.m_5993(var15, new Vector4i(var9));
            var12.setUniform(f_28785, var13);
            var12.setUniform(f_28786, var14);
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

         this.m_5998(var11, var12, this.f_28767);
      }
   }

   public void m_8199() {
      RenderTarget var1 = f_11537.gameRenderer.mainRenderTarget();
      TextureTarget var2 = this.f_28770.get();
      if (var2.width != var1.width || var2.height != var1.height) {
         var2.resize(var1.width, var1.height);
      }

      this.f_28769.copyTextureToTexture(var1.getColorTexture(), var2.getColorTexture(), 0, 0, 0, 0, 0, var1.width, var1.height);
   }

   public Class_pgtjhKJjK46C8cZl() {
      this.f_28767 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_28771)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_28772))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_28773))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2739(DefaultVertexFormat.POSITION, PrimitiveTopology.QUADS)
         .m_2729(f_28774, UniformType.UNIFORM_BUFFER)
         .m_2729(f_28775, UniformType.UNIFORM_BUFFER)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2722();
      this.f_28768 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_28776)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_28777))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_28778))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2739(DefaultVertexFormat.POSITION, PrimitiveTopology.QUADS)
         .m_2729(f_28779, UniformType.UNIFORM_BUFFER)
         .m_2729(f_28780, UniformType.UNIFORM_BUFFER)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2741(f_28781)
         .m_2722();
      this.f_28769 = RenderSystem.getDevice().createCommandEncoder();
      this.f_28770 = Suppliers.memoize(() -> new TextureTarget(f_28789, 1920, 1024, false, GpuFormat.RGBA8_UNORM));
   }

   public void m_8202(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      if (!(var4 <= var3) && !(var4 <= 0.0F)) {
         float var10 = var4 * 2.0F;
         BufferBuilder var11 = Class_PoKta0VE7AdhY1En.m_4161().m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION);
         this.m_5999(var11, var1 - var4, var2 - var4, var10, var10);
         RenderPass var12 = this.f_28769.createRenderPass(() -> f_28788, f_11537.gameRenderer.mainRenderTarget().getColorTextureView(), Optional.empty());
         var12.bindTexture(f_28782, this.f_28770.get().getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
         RenderSystem.bindDefaultUniforms(var12);
         MemoryStack var15 = MemoryStack.stackPush();

         try {
            ByteBuffer var16 = Std140Builder.onStack(var15, 32)
               .putVec2(var10, var10)
               .putFloat(var3)
               .putFloat(var4)
               .putFloat(var5)
               .putFloat(var6)
               .putFloat(var7)
               .putFloat(var8)
               .get();
            GpuBufferSlice var13 = Class_HtEPOqGrAYrUdumw.m_2945(var16);
            GpuBufferSlice var14 = this.m_5993(var15, new Vector4i(var9));
            var12.setUniform(f_28783, var13);
            var12.setUniform(f_28784, var14);
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

         this.m_5998(var11, var12, this.f_28768);
      }
   }
}
