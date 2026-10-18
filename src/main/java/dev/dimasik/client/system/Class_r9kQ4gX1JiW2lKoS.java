package dev.dimasik.client.system;

import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.shaders.UniformType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Optional;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;

public final class Class_r9kQ4gX1JiW2lKoS implements AutoCloseable {
   private final RenderPipeline f_30025;
   private GpuBuffer f_30026;
   private GpuBuffer f_30027;
   private final Matrix4f f_30028;
   private final Matrix4f f_30029;
   private static final String f_30030 = "dimasik/nightix_aurora";
   private static final String f_30031 = "nightix_aurora";
   private static final String f_30032 = "nightix_aurora";
   private static final String f_30033 = "ShaderSkyData";
   private static final String f_30034 = "AuroraView";
   private static final long f_30035 = 96L;
   private static final long f_30036 = 128L;
   private static final float f_30037 = 0.78F;
   private static final float f_30038 = 1000.0F;
   private static final String f_30039 = "ShaderSkyData";
   private static final String f_30040 = "AuroraView";
   private static final String f_30041 = "Nightix Aurora";
   private static final String f_30042 = "Aurora camera";
   private static final String f_30043 = "Aurora settings";

   public Class_r9kQ4gX1JiW2lKoS() {
      this.f_30025 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_30030)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_30031))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_30032))
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2727()
         .m_2729(f_30033, UniformType.UNIFORM_BUFFER)
         .m_2729(f_30034, UniformType.UNIFORM_BUFFER)
         .m_2722();
      this.f_30028 = new Matrix4f();
      this.f_30029 = new Matrix4f();
   }

   public void m_8355(
      RenderTarget var1, Matrix4f var2, Matrix4f var3, long var4, float var6, float var7, float var8, float var9, int var10, int var11, boolean var12
   ) {
      if (this.f_30026 == null) {
         this.f_30026 = RenderSystem.getDevice().createBuffer(() -> f_30043, 136, f_30035);
         this.f_30027 = RenderSystem.getDevice().createBuffer(() -> f_30042, 136, f_30036);
      }

      Vector4f var13 = Class_BftdentXEtGbugJw.m_2298(var10);
      Vector4f var14 = Class_BftdentXEtGbugJw.m_2298(var11);
      float var15 = var12 ? f_30037 : 1.0F;
      CommandEncoder var16 = RenderSystem.getDevice().createCommandEncoder();
      MemoryStack var17 = MemoryStack.stackPush();

      try {
         var16.writeToBuffer(
            this.f_30026.slice(),
            Std140Builder.onStack(var17, 96)
               .putVec4(var1.width, var1.height, (float)(System.currentTimeMillis() - var4) / f_30038, var15)
               .putVec4(var13.x, var13.y, var13.z, var13.w * var15)
               .putVec4(var14.x, var14.y, var14.z, var14.w * var15)
               .putVec4(1.0F, 1.0F, 1.0F, var15)
               .putVec4(0.0F, var7, var8, var6)
               .putVec4(var9, var12 ? 1.0F : 0.0F, 0.0F, 0.0F)
               .get()
         );
         var16.writeToBuffer(
            this.f_30027.slice(), Std140Builder.onStack(var17, 128).putMat4f(this.f_30028.set(var2).invert()).putMat4f(this.f_30029.set(var3).invert()).get()
         );
      } catch (Throwable var23) {
         if (var17 != null) {
            try {
               var17.close();
            } catch (Throwable var21) {
               var23.addSuppressed(var21);
            }
         }

         throw var23;
      }

      if (var17 != null) {
         var17.close();
      }

      RenderPass var24 = var16.createRenderPass(() -> f_30041, var1.getColorTextureView(), Optional.empty());

      try {
         var24.setPipeline(this.f_30025);
         var24.setUniform(f_30039, this.f_30026);
         var24.setUniform(f_30040, this.f_30027);
         var24.draw(3, 1, 0, 0);
      } catch (Throwable var22) {
         if (var24 != null) {
            try {
               var24.close();
            } catch (Throwable var20) {
               var22.addSuppressed(var20);
            }
         }

         throw var22;
      }

      if (var24 != null) {
         var24.close();
      }
   }

   @Override
   public void close() {
      if (this.f_30026 != null) {
         this.f_30026.close();
      }

      if (this.f_30027 != null) {
         this.f_30027.close();
      }

      this.f_30026 = this.f_30027 = null;
   }
}
