package dev.dimasik.client.system;

import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.pipeline.TextureTarget;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.shaders.UniformType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import java.nio.ByteBuffer;
import java.util.Optional;
import org.lwjgl.system.MemoryStack;

public final class Class_4cFOJQ5W3cnF4eSV implements Class_NzJrN63M7QBpmAbi {
   public static final Class_4cFOJQ5W3cnF4eSV f_2050 = new Class_4cFOJQ5W3cnF4eSV();
   private final RenderPipeline f_2051;
   private TextureTarget f_2052;
   private static final String f_2053 = "dimasik/color_plus_grade";
   private static final String f_2054 = "world_grade";
   private static final String f_2055 = "world_grade";
   private static final String f_2056 = "ColorPlusGrade";
   private static final String f_2057 = "Sampler0";
   private static final String f_2058 = "Sampler0";
   private static final String f_2059 = "ColorPlusGrade";
   private static final String f_2060 = "color-plus-scene";
   private static final String f_2061 = "colorPlusGrade";
   private static final String f_2062 = "colorPlusGradeData";

   private void m_1346(
      CommandEncoder var1,
      RenderTarget var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12
   ) {
      MemoryStack var13 = MemoryStack.stackPush();

      try {
         ByteBuffer var14 = Std140Builder.onStack(var13, 112)
            .putVec2(var2.width, var2.height)
            .putVec4(var3, var4, var5, var6)
            .putVec4(var7, var8, var9, var10)
            .putVec4(0.0F, 0.0F, 0.0F, 0.0F)
            .putVec4(0.0F, 0.0F, 0.0F, 0.0F)
            .putVec4(0.0F, 0.0F, 0.0F, 0.0F)
            .putVec4(var11, var12, 0.0F, 0.0F)
            .get();
         GpuBuffer var15 = RenderSystem.getDevice().createBuffer(() -> f_2062, 128, var14);

         try {
            RenderPass var16 = var1.createRenderPass(() -> f_2061, var2.getColorTextureView(), Optional.empty());

            try {
               var16.setPipeline(this.f_2051);
               var16.bindTexture(f_2058, this.f_2052.getColorTextureView(), RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
               var16.setUniform(f_2059, var15);
               var16.draw(3, 1, 0, 0);
            } catch (Throwable var22) {
               if (var16 != null) {
                  try {
                     var16.close();
                  } catch (Throwable var21) {
                     var22.addSuppressed(var21);
                  }
               }

               throw var22;
            }

            if (var16 != null) {
               var16.close();
            }
         } catch (Throwable var23) {
            if (var15 != null) {
               try {
                  var15.close();
               } catch (Throwable var20) {
                  var23.addSuppressed(var20);
               }
            }

            throw var23;
         }

         if (var15 != null) {
            var15.close();
         }
      } catch (Throwable var24) {
         if (var13 != null) {
            try {
               var13.close();
            } catch (Throwable var19) {
               var24.addSuppressed(var19);
            }
         }

         throw var24;
      }

      if (var13 != null) {
         var13.close();
      }
   }

   public void m_1348(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      RenderTarget var11 = f_11537.gameRenderer.mainRenderTarget();
      this.m_1350(var11.width, var11.height);
      CommandEncoder var12 = RenderSystem.getDevice().createCommandEncoder();
      var12.copyTextureToTexture(var11.getColorTexture(), this.f_2052.getColorTexture(), 0, 0, 0, 0, 0, var11.width, var11.height);
      this.m_1346(var12, var11, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   private void m_1350(int var1, int var2) {
      if (this.f_2052 == null) {
         this.f_2052 = new TextureTarget(f_2060, var1, var2, false, GpuFormat.RGBA8_UNORM);
      } else {
         if (this.f_2052.width != var1 || this.f_2052.height != var2) {
            this.f_2052.resize(var1, var2);
         }
      }
   }

   private Class_4cFOJQ5W3cnF4eSV() {
      this.f_2051 = Class_GEnQMkY73qXewYpU.m_2718()
         .m_2726(f_2053)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_2054))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_2055))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2727()
         .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
         .m_2729(f_2056, UniformType.UNIFORM_BUFFER)
         .m_2741(f_2057)
         .m_2722();
   }
}
