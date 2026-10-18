package dev.dimasik.client.system;

import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import org.joml.Matrix4f;

public final class Class_8eJhbT3fP9R0tMrZ {
   private static final String f_4103 = "dead_chams";
   private static final String f_4104 = "private_glow";
   private static final String f_4105 = "Sampler0";

   private Class_8eJhbT3fP9R0tMrZ() {
   }

   public static void m_1813(BufferBuilder var0, Matrix4f var1, float var2, int var3) {
      float var4 = var2 / 2.0F;
      var0.addVertex(var1, -var4, var4, 0.0F).setUv(0.0F, 1.0F).setColor(var3);
      var0.addVertex(var1, var4, var4, 0.0F).setUv(1.0F, 1.0F).setColor(var3);
      var0.addVertex(var1, var4, -var4, 0.0F).setUv(1.0F, 0.0F).setColor(var3);
      var0.addVertex(var1, -var4, -var4, 0.0F).setUv(0.0F, 0.0F).setColor(var3);
   }

   public static RenderPipeline m_1814(String var0, CompareOp var1) {
      return Class_GEnQMkY73qXewYpU.m_2718(Class_GEnQMkY73qXewYpU.f_7671)
         .m_2726(var0)
         .m_2734(Class_wHRRCm2tlLY7DN4I.m_9312(f_4103))
         .m_2740(Class_wHRRCm2tlLY7DN4I.m_9312(f_4104))
         .m_2719(var1)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.OVERLAY)
         .m_2739(DefaultVertexFormat.POSITION_TEX_COLOR, PrimitiveTopology.QUADS)
         .m_2741(f_4105)
         .m_2722();
   }
}
