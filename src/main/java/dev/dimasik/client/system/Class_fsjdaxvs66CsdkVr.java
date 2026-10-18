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
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import java.nio.ByteBuffer;
import java.util.Optional;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.resources.Identifier;
import org.joml.Vector4f;
import org.joml.Vector4i;
import org.lwjgl.system.MemoryStack;

public class Class_fsjdaxvs66CsdkVr implements Class_NzJrN63M7QBpmAbi, Class_b8v0o2NnCtANmOp9 {
   private final RenderPipeline f_20486;
   private final CommandEncoder f_20487;
   private static final String f_20488 = "dimasik/texture";
   private static final String f_20489 = "texture";
   private static final String f_20490 = "texture";
   private static final String f_20491 = "Forms";
   private static final String f_20492 = "Colors";
   private static final String f_20493 = "Scissors";
   private static final String f_20494 = "Sampler0";
   private static final String f_20495 = "Sampler0";
   private static final float f_20496 = 1.5F;
   private static final String f_20497 = "Forms";
   private static final String f_20498 = "Colors";
   private static final String f_20499 = "Scissors";
   private static final float f_20500 = -1.0F;
   private static final String f_20501 = "texturePass";

   public void m_6686(float var1, float var2, float var3, float var4, Vector4f var5, Vector4f var6, Vector4i var7, Identifier var8, FilterMode var9) {
      if (!this.m_5994(var1, var2, var3, var4) && !this.m_5997(var7)) {
         Class_PoKta0VE7AdhY1En var10 = Class_PoKta0VE7AdhY1En.m_4161();
         BufferBuilder var11 = var10.m_4162(PrimitiveTopology.QUADS, DefaultVertexFormat.POSITION_TEX);
         this.m_6689(var11, var1, var2, var3, var4, var6);
         AbstractTexture var12 = Class_UixIfwZ91bKWkmFz.m_5288(var8);
         RenderPass var13 = this.f_20487.createRenderPass(() -> f_20501, f_11537.gameRenderer.mainRenderTarget().getColorTextureView(), Optional.empty());
         RenderSystem.bindDefaultUniforms(var13);
         var13.bindTexture(f_20495, var12.getTextureView(), var9 != null ? RenderSystem.getSamplerCache().getClampToEdge(var9) : var12.getSampler());
         MemoryStack var17 = MemoryStack.stackPush();

         try {
            float var18 = f_20496;
            if (var5.x == 0.0F && var5.y == 0.0F && var5.z == 0.0F && var5.w == 0.0F) {
               var18 = 0.0F;
            }

            ByteBuffer var19 = Std140Builder.onStack(var17, 32).putVec4(var5).putVec2(var4, var3).putFloat(var18).get();
            GpuBufferSlice var14 = this.m_5995(new Vector4f(var1, var2, var3, var4), var17);
            GpuBufferSlice var15 = Class_HtEPOqGrAYrUdumw.m_2945(var19);
            GpuBufferSlice var16 = this.m_5993(var17, var7);
            var13.setUniform(f_20497, var15);
            var13.setUniform(f_20498, var16);
            var13.setUniform(f_20499, var14);
         } catch (Throwable var21) {
            if (var17 != null) {
               try {
                  var17.close();
               } catch (Throwable var20) {
                  var21.addSuppressed(var20);
               }
            }

            throw var21;
         }

         if (var17 != null) {
            var17.close();
         }

         this.m_5998(var11, var13, this.f_20486);
      }
   }

   public void m_6687(float var1, float var2, float var3, float var4, Vector4f var5, Vector4f var6, Vector4i var7, Identifier var8) {
      this.m_6686(var1, var2, var3, var4, var5, var6, var7, var8, null);
   }

   public Class_fsjdaxvs66CsdkVr() {
      this.f_20486 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_20488)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_20489))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_20490))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2739(DefaultVertexFormat.POSITION_TEX, PrimitiveTopology.QUADS)
         .m_2729(f_20491, UniformType.UNIFORM_BUFFER)
         .m_2729(f_20492, UniformType.UNIFORM_BUFFER)
         .m_2729(f_20493, UniformType.UNIFORM_BUFFER)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2741(f_20494)
         .m_2722();
      this.f_20487 = RenderSystem.getDevice().createCommandEncoder();
   }

   public void m_6689(BufferBuilder var1, float var2, float var3, float var4, float var5, Vector4f var6) {
      float var7 = 2.0F / Minecraft.getInstance().getWindow().getScreenWidth() * var4;
      float var8 = 2.0F / Minecraft.getInstance().getWindow().getScreenHeight() * var5;
      float var9 = f_20500 + var2 * 2.0F / Minecraft.getInstance().getWindow().getScreenWidth();
      float var10 = 1.0F - var3 * 2.0F / Minecraft.getInstance().getWindow().getScreenHeight() - var8;
      var1.addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var9, var10, 0.0F).setUv(var6.x, var6.y + var6.w);
      var1.addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var9 + var7, var10, 0.0F).setUv(var6.x + var6.z, var6.y + var6.w);
      var1.addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var9 + var7, var10 + var8, 0.0F).setUv(var6.x + var6.z, var6.y);
      var1.addVertex(Class_Ssh31B3ljfKeWsvS.m_4853(), var9, var10 + var8, 0.0F).setUv(var6.x, var6.y);
   }

   public void m_6690(ShaderSource var1) {
      RenderSystem.getDevice().precompilePipeline(this.f_20486, var1);
   }
}
