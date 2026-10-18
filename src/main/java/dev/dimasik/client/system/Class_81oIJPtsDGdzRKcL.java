package dev.dimasik.client.system;

import com.mojang.blaze3d.PrimitiveTopology;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.CompareOp;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import dev.dimasik.mixin.RenderPipelinesMixin;
import dev.dimasik.mixin.RenderTypeMixin;
import net.minecraft.client.renderer.rendertype.RenderSetup;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.resources.Identifier;

public final class Class_81oIJPtsDGdzRKcL {
   public static final RenderPipeline f_3815 = RenderPipelinesMixin.register(
      Class_GEnQMkY73qXewYpU.m_2718(RenderPipelinesMixin.getPositionColorSnippet())
         .m_2742(Identifier.fromNamespaceAndPath(Class_81oIJPtsDGdzRKcL.f_3819, Class_81oIJPtsDGdzRKcL.f_3820))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2739(DefaultVertexFormat.POSITION_COLOR, PrimitiveTopology.DEBUG_LINES)
         .m_2722()
   );
   public static final RenderType f_3816 = RenderTypeMixin.create(Class_81oIJPtsDGdzRKcL.f_3821, RenderSetup.builder(f_3815).createRenderSetup());
   public static final RenderPipeline f_3817 = RenderPipelinesMixin.register(
      Class_GEnQMkY73qXewYpU.m_2718(RenderPipelinesMixin.getPositionColorSnippet())
         .m_2742(Identifier.fromNamespaceAndPath(Class_81oIJPtsDGdzRKcL.f_3822, Class_81oIJPtsDGdzRKcL.f_3823))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2732(BlendFunction.TRANSLUCENT)
         .m_2739(DefaultVertexFormat.POSITION_COLOR, PrimitiveTopology.QUADS)
         .m_2722()
   );
   public static final RenderType f_3818 = RenderTypeMixin.create(Class_81oIJPtsDGdzRKcL.f_3824, RenderSetup.builder(f_3817).createRenderSetup());
   private static final String f_3819 = "dimasik";
   private static final String f_3820 = "pipeline/xray_lines";
   private static final String f_3821 = "dimasik_xray_lines";
   private static final String f_3822 = "dimasik";
   private static final String f_3823 = "pipeline/xray_quads";
   private static final String f_3824 = "dimasik_xray_quads";

   private Class_81oIJPtsDGdzRKcL() {
   }
}
