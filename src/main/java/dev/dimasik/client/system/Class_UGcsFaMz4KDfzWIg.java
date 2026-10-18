package dev.dimasik.client.system;

import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.TextureTarget;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.shaders.UniformType;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.nio.ByteBuffer;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Optional;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.state.gui.pip.GuiEntityRenderState;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryStack;

public final class Class_UGcsFaMz4KDfzWIg {
   private static final Map<EntityRenderState, Class_UGcsFaMz4KDfzWIg.ZDAp0e7QAqN7ewMh> f_14732 = new IdentityHashMap<>();
   private static final RenderPipeline f_14733 = Class_GEnQMkY73qXewYpU.m_2718()
      .m_2726(Class_UGcsFaMz4KDfzWIg.f_14745)
      .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(Class_UGcsFaMz4KDfzWIg.f_14746))
      .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(Class_UGcsFaMz4KDfzWIg.f_14747))
      .m_2719(CompareOp.ALWAYS_PASS)
      .m_2737(false)
      .m_2725(false)
      .m_2727()
      .m_2739(Class_GEnQMkY73qXewYpU.f_7670, PrimitiveTopology.TRIANGLES)
      .m_2729(Class_UGcsFaMz4KDfzWIg.f_14748, UniformType.UNIFORM_BUFFER)
      .m_2741(Class_UGcsFaMz4KDfzWIg.f_14749)
      .m_2722();
   private static TextureTarget f_14734;
   private static final float f_14735 = -1.0F;
   private static final float f_14736 = 0.001F;
   private static final float f_14737 = 0.5F;
   private static final float f_14738 = 0.5F;
   private static final float f_14739 = 0.001F;
   private static final String f_14740 = "InSampler";
   private static final String f_14741 = "PreviewFade";
   private static final String f_14742 = "entity-esp1-gui-preview-fade";
   private static final String f_14743 = "entityEsp1GuiPreviewFade";
   private static final String f_14744 = "entityEsp1GuiPreviewFadeUniforms";
   private static final String f_14745 = "dimasik/entity_esp1_gui_preview_fade";
   private static final String f_14746 = "hands_fullscreen";
   private static final String f_14747 = "gui_preview_fade";
   private static final String f_14748 = "PreviewFade";
   private static final String f_14749 = "InSampler";

   public static void m_5226(EntityRenderState var0, float var1) {
      f_14732.put(var0, new Class_UGcsFaMz4KDfzWIg.ZDAp0e7QAqN7ewMh(Math.clamp(var1, 0.0F, 1.0F), null, null));
   }

   public static void m_5228(EntityRenderState var0, float var1, Class_JYI3tOXLKmfxbnee var2, Class_y7LCUoWgFH6Mz8SR var3) {
      f_14732.put(var0, new Class_UGcsFaMz4KDfzWIg.ZDAp0e7QAqN7ewMh(Math.clamp(var1, 0.0F, 1.0F), var2, var3));
   }

   private Class_UGcsFaMz4KDfzWIg() {
   }

   public static GpuTextureView m_5230(GuiEntityRenderState var0, GpuTexture var1, GpuTextureView var2, GpuTextureView var3, Matrix4f var4, int var5) {
      Class_UGcsFaMz4KDfzWIg.ZDAp0e7QAqN7ewMh var6 = f_14732.remove(var0.renderState());
      if (var6 != null && var1 != null && var2 != null) {
         int var7 = var1.getWidth(0);
         int var8 = var1.getHeight(0);
         if (var7 > 0 && var8 > 0) {
            GpuTextureView var9 = var2;
            if (var6.renderer() != null && var6.settings() != null) {
               float var10 = Math.max(f_14736, var0.scale() * var5);
               Matrix4f var11 = new Matrix4f(RenderSystem.getModelViewStack())
                  .translate(var7 * f_14737, var8 * f_14738, 0.0F)
                  .scale(var10, var10, -var10)
                  .translate(var0.translation())
                  .rotate(var0.rotation());
               Matrix4f var12 = new Matrix4f(var4).mul(var11).invert();
               GpuTextureView var13 = var6.renderer()
                  .m_3275(var9, var7, var8, var6.settings(), var3, var12, Math.max(f_14739, var0.renderState().boundingBoxHeight));
               if (var13 != null) {
                  var9 = var13;
               }
            }

            return var9;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private static void m_5231(int var0, int var1) {
      if (f_14734 == null) {
         f_14734 = new TextureTarget(f_14742, var0, var1, false, GpuFormat.RGBA8_UNORM);
      } else if (f_14734.width != var0 || f_14734.height != var1) {
         f_14734.resize(var0, var1);
      }
   }

   public static float m_5232(EntityRenderState var0) {
      Class_UGcsFaMz4KDfzWIg.ZDAp0e7QAqN7ewMh var1 = f_14732.get(var0);
      return var1 == null ? f_14735 : var1.alpha();
   }

   public static void m_5233(EntityRenderState var0) {
      f_14732.remove(var0);
   }

   private static GpuTextureView m_5234(GpuTextureView var0, int var1, int var2, float var3) {
      m_5231(var1, var2);
      GpuBuffer var4 = null;

      GpuTextureView var22;
      try {
         MemoryStack var5 = MemoryStack.stackPush();

         try {
            ByteBuffer var6 = Std140Builder.onStack(var5, 16).putVec4(var3, 0.0F, 0.0F, 0.0F).get();
            var4 = RenderSystem.getDevice().createBuffer(() -> f_14744, 128, var6);
            CommandEncoder var7 = RenderSystem.getDevice().createCommandEncoder();
            RenderPass var8 = var7.createRenderPass(() -> f_14743, f_14734.getColorTextureView(), Optional.of(new Vector4f(0.0F)));

            try {
               var8.setPipeline(f_14733);
               var8.bindTexture(f_14740, var0, RenderSystem.getSamplerCache().getClampToEdge(FilterMode.LINEAR));
               var8.setUniform(f_14741, var4);
               var8.draw(3, 1, 0, 0);
            } catch (Throwable var19) {
               if (var8 != null) {
                  try {
                     var8.close();
                  } catch (Throwable var18) {
                     var19.addSuppressed(var18);
                  }
               }

               throw var19;
            }

            if (var8 != null) {
               var8.close();
            }

            var22 = f_14734.getColorTextureView();
         } catch (Throwable var20) {
            if (var5 != null) {
               try {
                  var5.close();
               } catch (Throwable var17) {
                  var20.addSuppressed(var17);
               }
            }

            throw var20;
         }

         if (var5 != null) {
            var5.close();
         }
      } finally {
         if (var4 != null) {
            var4.close();
         }
      }

      return var22;
   }

   public static GpuTextureView m_5235(GpuTexture var0, GpuTextureView var1, float var2) {
      if (var0 != null && var1 != null) {
         int var3 = var0.getWidth(0);
         int var4 = var0.getHeight(0);
         return var3 > 0 && var4 > 0 ? m_5234(var1, var3, var4, var2) : null;
      } else {
         return null;
      }
   }

   private record ZDAp0e7QAqN7ewMh(float alpha, Class_JYI3tOXLKmfxbnee renderer, Class_y7LCUoWgFH6Mz8SR settings) {
   }
}
