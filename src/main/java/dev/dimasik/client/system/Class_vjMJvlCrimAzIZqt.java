package dev.dimasik.client.system;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.BlendFactor;
import com.mojang.blaze3d.platform.CompareOp;
import java.util.function.Function;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.renderer.rendertype.RenderSetup;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Util;

public class Class_vjMJvlCrimAzIZqt {
   private static final Function<Identifier, RenderType> f_34232 = Util.memoize(
      var0 -> RenderType.create(
         Class_vjMJvlCrimAzIZqt.f_34235,
         RenderSetup.builder(Class_vjMJvlCrimAzIZqt.f_34234).withTexture(Class_vjMJvlCrimAzIZqt.f_34236, var0).createRenderSetup()
      )
   );
   public static BlendFunction f_34233 = new BlendFunction(BlendFactor.SRC_ALPHA, BlendFactor.ONE);
   public static RenderPipeline f_34234 = RenderPipelines.register(
      Class_GEnQMkY73qXewYpU.m_2718(RenderPipelines.GUI_TEXTURED_SNIPPET)
         .m_2726(Class_vjMJvlCrimAzIZqt.f_34237)
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2732(f_34233)
         .m_2722()
   );
   private static final String f_34235 = "fire_screen_effect";
   private static final String f_34236 = "Sampler0";
   private static final String f_34237 = "pipeline/additive_particle_effect";

   public static RenderType m_9269(Identifier var0) {
      return f_34232.apply(var0);
   }
}
