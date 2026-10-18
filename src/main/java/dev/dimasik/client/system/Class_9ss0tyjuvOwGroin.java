package dev.dimasik.client.system;

import com.mojang.blaze3d.IndexType;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.CompareOp;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.render.EntityESP;
import dev.dimasik.mixin.RenderPipelinesMixin;
import dev.dimasik.mixin.RenderSetupMixin;
import dev.dimasik.mixin.RenderTypeMixin;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import net.minecraft.client.renderer.rendertype.OutputTarget;
import net.minecraft.client.renderer.rendertype.PreparedRenderType;
import net.minecraft.client.renderer.rendertype.RenderSetup;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderSetup.OutlineProperty;
import net.minecraft.client.renderer.rendertype.RenderSetup.TextureBinding;
import net.minecraft.resources.Identifier;
import net.minecraft.util.Util;

public final class Class_9ss0tyjuvOwGroin {
   private static final RenderPipeline f_5078 = RenderPipelinesMixin.register(
      Class_GEnQMkY73qXewYpU.m_2718(RenderPipelinesMixin.getOutlineSnippet())
         .m_2742(Identifier.fromNamespaceAndPath(Class_9ss0tyjuvOwGroin.f_5084, Class_9ss0tyjuvOwGroin.f_5085))
         .m_2719(CompareOp.ALWAYS_PASS)
         .m_2737(false)
         .m_2725(false)
         .m_2722()
   );
   private static final Function<Identifier, RenderType> f_5079 = Util.memoize(Class_9ss0tyjuvOwGroin::m_2071);
   private static final Map<RenderType, RenderType> f_5080 = new ConcurrentHashMap<>();
   private static final String f_5081 = "dimasik_entity_esp1_outline_complete";
   private static final String f_5082 = "Sampler0";
   private static final String f_5083 = "Sampler0";
   private static final String f_5084 = "dimasik";
   private static final String f_5085 = "pipeline/entity_esp1_outline_complete";

   public static void m_2065() {
      f_5080.clear();
   }

   public static RenderType m_2066(Identifier var0) {
      return f_5079.apply(var0);
   }

   public static void m_2067(PreparedRenderType var0, GpuBuffer var1, GpuBuffer var2, IndexType var3, int var4, int var5, int var6) {
      if (var0.pipeline() == f_5078 && m_2068()) {
         DimasikClient.m_9057().m_9049().m_2801().m_3436().m_4055().m_3311(var0, var1, var2, var3, var4, var5, var6);
      }
   }

   private Class_9ss0tyjuvOwGroin() {
   }

   public static boolean m_2068() {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
         EntityESP var0 = DimasikClient.m_9057().m_9049().m_2801().m_3436();
         return var0 != null && var0.m_776() && var0.m_4055() != null && var0.m_4055().m_3330();
      } else {
         return false;
      }
   }

   public static RenderType m_2069(RenderType var0) {
      if (var0 != null && var0.isOutline() && m_2068()) {
         RenderType var1 = f_5080.get(var0);
         if (var1 != null) {
            return var1;
         }

         Identifier var2 = m_2070(var0);
         RenderType var3 = var2 == null ? var0 : m_2066(var2);
         if (f_5080.size() >= 1024) {
            f_5080.clear();
         }

         f_5080.put(var0, var3);
         f_5080.put(var3, var3);
         return var3;
      } else {
         return var0;
      }
   }

   private static Identifier m_2070(RenderType var0) {
      RenderSetup var1 = ((RenderTypeMixin)var0).getRenderSetup();
      if (var1 == null) {
         return null;
      }

      Map var2 = ((RenderSetupMixin)(Object)var1).getTextures();
      if (var2 == null) {
         return null;
      }

      TextureBinding var3 = (TextureBinding)var2.get(f_5083);
      return var3 == null ? null : var3.location();
   }

   private static RenderType m_2071(Identifier var0) {
      return RenderTypeMixin.create(
         f_5081,
         RenderSetup.builder(f_5078)
            .withTexture(f_5082, var0)
            .setOutputTarget(OutputTarget.OUTLINE_TARGET)
            .setOutline(OutlineProperty.IS_OUTLINE)
            .createRenderSetup()
      );
   }
}
