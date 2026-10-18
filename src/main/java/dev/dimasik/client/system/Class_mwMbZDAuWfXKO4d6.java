package dev.dimasik.client.system;

import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.shaders.UniformType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import java.util.Optional;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;

public final class Class_mwMbZDAuWfXKO4d6 implements Class_NzJrN63M7QBpmAbi {
   public static final Class_mwMbZDAuWfXKO4d6 f_25551 = new Class_mwMbZDAuWfXKO4d6();
   private static final int f_25552 = 48;
   private final RenderPipeline f_25553;
   private static final String f_25554 = "dimasik/gravity_grid";
   private static final String f_25555 = "hands_fullscreen";
   private static final String f_25556 = "gravity_grid";
   private static final String f_25557 = "GravityGrid";
   private static final float f_25558 = 0.01F;
   private static final String f_25559 = "GravityGrid";
   private static final String f_25560 = "gravityGrid";
   private static final String f_25561 = "gravityGridUniforms";

   public void m_7635(float var1, float var2, float var3) {
      if (!(var3 <= f_25558) && !(var1 <= 0.0F) && !(var2 <= 0.0F)) {
         RenderTarget var4 = f_11537.gameRenderer.mainRenderTarget();
         if (var4 != null && var4.getColorTextureView() != null) {
            Vector4f var5 = Class_BftdentXEtGbugJw.m_2298(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN));
            Vector4f var6 = Class_BftdentXEtGbugJw.m_2298(Class_LsNSRvPKh5AwfAUe.m_3820(Class_y3cvEHXTSEF5dp8q.MAIN_TWO));
            CommandEncoder var7 = RenderSystem.getDevice().createCommandEncoder();
            MemoryStack var8 = MemoryStack.stackPush();

            try {
               Std140Builder var9 = Std140Builder.onStack(var8, 48)
                  .putVec4(var1, var2, Math.clamp(var3, 0.0F, 1.0F), 0.0F)
                  .putVec4(var5.x, var5.y, var5.z, 1.0F)
                  .putVec4(var6.x, var6.y, var6.z, 1.0F);
               ByteBuffer var10 = var9.get();
               GpuBuffer var11 = RenderSystem.getDevice().createBuffer(() -> f_25561, 128, var10);

               try {
                  RenderPass var12 = var7.createRenderPass(() -> f_25560, var4.getColorTextureView(), Optional.empty());

                  try {
                     RenderSystem.bindDefaultUniforms(var12);
                     var12.setPipeline(this.f_25553);
                     var12.setUniform(f_25559, var11);
                     var12.draw(3, 1, 0, 0);
                  } catch (Throwable var18) {
                     if (var12 != null) {
                        try {
                           var12.close();
                        } catch (Throwable var17) {
                           var18.addSuppressed(var17);
                        }
                     }

                     throw var18;
                  }

                  if (var12 != null) {
                     var12.close();
                  }
               } catch (Throwable var19) {
                  if (var11 != null) {
                     try {
                        var11.close();
                     } catch (Throwable var16) {
                        var19.addSuppressed(var16);
                     }
                  }

                  throw var19;
               }

               if (var11 != null) {
                  var11.close();
               }
            } catch (Throwable var20) {
               if (var8 != null) {
                  try {
                     var8.close();
                  } catch (Throwable var15) {
                     var20.addSuppressed(var15);
                  }
               }

               throw var20;
            }

            if (var8 != null) {
               var8.close();
            }
         }
      }
   }

   private Class_mwMbZDAuWfXKO4d6() {
      this.f_25553 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_25554)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_25555))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_25556))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2720(true, true)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_25557, UniformType.UNIFORM_BUFFER)
         .m_2722();
   }
}
