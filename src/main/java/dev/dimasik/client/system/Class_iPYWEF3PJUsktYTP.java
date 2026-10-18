package dev.dimasik.client.system;

import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.pipeline.TextureTarget;
import com.mojang.blaze3d.platform.BlendFactor;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.shaders.UniformType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import java.nio.ByteBuffer;
import java.util.Optional;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.lwjgl.system.MemoryStack;

public final class Class_iPYWEF3PJUsktYTP implements AutoCloseable {
   private static final int f_24429 = 176;
   private final RenderPipeline f_24430;
   private final RenderPipeline f_24431;
   private final Matrix4f f_24432;
   private final Matrix4f f_24433;
   private GpuBuffer f_24434;
   private TextureTarget f_24435;
   private static final String f_24436 = "dimasik/ambience_volume_fog";
   private static final String f_24437 = "hands_fullscreen";
   private static final String f_24438 = "ambience_volume_fog";
   private static final String f_24439 = "DepthSampler";
   private static final String f_24440 = "DensitySampler";
   private static final String f_24441 = "VolumeFog";
   private static final String f_24442 = "dimasik/ambience_fog_density";
   private static final String f_24443 = "hands_fullscreen";
   private static final String f_24444 = "ambience_volume_fog";
   private static final String f_24445 = "FOG_DENSITY_PASS";
   private static final String f_24446 = "DepthSampler";
   private static final String f_24447 = "VolumeFog";
   private static final float f_24448 = 1.0E-8F;
   private static final float f_24449 = 1.0E-8F;
   private static final long f_24450 = 176L;
   private static final String f_24451 = "Ambience fog density";
   private static final double f_24452 = 8192.0;
   private static final double f_24453 = 8192.0;
   private static final double f_24454 = 8192.0;
   private static final float f_24455 = 255.0F;
   private static final float f_24456 = 255.0F;
   private static final float f_24457 = 255.0F;
   private static final float f_24458 = 3.0F;
   private static final String f_24459 = "VolumeFog";
   private static final String f_24460 = "DepthSampler";
   private static final String f_24461 = "VolumeFog";
   private static final String f_24462 = "DepthSampler";
   private static final String f_24463 = "DensitySampler";
   private static final String f_24464 = "Ambience volumetric fog";
   private static final String f_24465 = "Ambience fog density";
   private static final String f_24466 = "Ambience volume fog uniforms";

   public void m_7289(RenderTarget var1, Matrix4f var2, Matrix4f var3, Vec3 var4, float var5, int var6, float var7, float var8) {
      if (var1 != null
         && var1.getColorTextureView() != null
         && var1.getDepthTextureView() != null
         && !var1.getDepthTexture().isClosed()
         && var2 != null
         && var3 != null
         && !(Math.abs(var2.determinant()) < f_24448)
         && !(Math.abs(var3.determinant()) < f_24449)) {
         if (this.f_24434 == null || this.f_24434.isClosed()) {
            this.f_24434 = RenderSystem.getDevice().createBuffer(() -> f_24466, 136, f_24450);
         }

         int var9 = Math.max(1, (var1.width + 3) / 4);
         int var10 = Math.max(1, (var1.height + 3) / 4);
         if (this.f_24435 == null) {
            this.f_24435 = new TextureTarget(f_24451, var9, var10, false, GpuFormat.RGBA8_UNORM);
         } else if (this.f_24435.width != var9 || this.f_24435.height != var10) {
            this.f_24435.resize(var9, var10);
         }

         this.f_24432.set(var2).invert();
         this.f_24433.set(var3).invert();
         CommandEncoder var11 = RenderSystem.getDevice().createCommandEncoder();
         MemoryStack var12 = MemoryStack.stackPush();

         try {
            ByteBuffer var13 = Std140Builder.onStack(var12, 176)
               .putMat4f(this.f_24432)
               .putMat4f(this.f_24433)
               .putVec4((float)(var4.x % f_24452), (float)(var4.y % f_24453), (float)(var4.z % f_24454), var5)
               .putVec4((var6 >> 16 & 0xFF) / f_24455, (var6 >> 8 & 0xFF) / f_24456, (var6 & 0xFF) / f_24457, 1.0F)
               .putVec4(var7, var8 * 2.0F, f_24458 / Math.max(1.0F, var8 - var7), 0.0F)
               .get();
            var11.writeToBuffer(this.f_24434.slice(), var13);
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

         RenderPass var21 = var11.createRenderPass(() -> f_24465, this.f_24435.getColorTextureView(), Optional.empty());

         try {
            var21.setPipeline(this.f_24431);
            var21.setUniform(f_24459, this.f_24434);
            var21.bindTexture(f_24460, var1.getDepthTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
            var21.draw(3, 1, 0, 0);
         } catch (Throwable var19) {
            if (var21 != null) {
               try {
                  var21.close();
               } catch (Throwable var16) {
                  var19.addSuppressed(var16);
               }
            }

            throw var19;
         }

         if (var21 != null) {
            var21.close();
         }

         RenderPass var22 = var11.createRenderPass(() -> f_24464, var1.getColorTextureView(), Optional.empty());

         try {
            var22.setPipeline(this.f_24430);
            var22.setUniform(f_24461, this.f_24434);
            var22.bindTexture(f_24462, var1.getDepthTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.NEAREST));
            var22.bindTexture(f_24463, this.f_24435.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
            var22.draw(3, 1, 0, 0);
         } catch (Throwable var18) {
            if (var22 != null) {
               try {
                  var22.close();
               } catch (Throwable var15) {
                  var18.addSuppressed(var15);
               }
            }

            throw var18;
         }

         if (var22 != null) {
            var22.close();
         }
      }
   }

   public Class_iPYWEF3PJUsktYTP() {
      this.f_24430 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_24436)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_24437))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_24438))
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(new BlendFunction(BlendFactor.SRC_ALPHA, BlendFactor.ONE_MINUS_SRC_ALPHA, BlendFactor.ZERO, BlendFactor.ONE))
         .m_2741(f_24439)
         .m_2741(f_24440)
         .m_2729(f_24441, UniformType.UNIFORM_BUFFER)
         .m_2722();
      this.f_24431 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_24442)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_24443))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_24444))
         .m_2736(f_24445)
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2727()
         .m_2741(f_24446)
         .m_2729(f_24447, UniformType.UNIFORM_BUFFER)
         .m_2722();
      this.f_24432 = new Matrix4f();
      this.f_24433 = new Matrix4f();
   }

   @Override
   public void close() {
      if (this.f_24435 != null) {
         this.f_24435.destroyBuffers();
         this.f_24435 = null;
      }

      if (this.f_24434 != null) {
         this.f_24434.close();
         this.f_24434 = null;
      }
   }
}
