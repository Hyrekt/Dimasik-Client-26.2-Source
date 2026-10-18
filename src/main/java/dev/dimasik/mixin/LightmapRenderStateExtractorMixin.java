package dev.dimasik.mixin;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.render.FullBright;
import net.minecraft.client.renderer.LightmapRenderStateExtractor;
import net.minecraft.client.renderer.state.LightmapRenderState;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LightmapRenderStateExtractor.class)
public class LightmapRenderStateExtractorMixin {
   @Inject(method = "extract", at = @At("TAIL"))
   private void applyFullBright(LightmapRenderState var1, float var2, CallbackInfo var3) {
      if (var1.needsUpdate && DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
         FullBright var4 = DimasikClient.m_9057().m_9049().m_2801().m_3439();
         if (var4 != null) {
            var1.ambientColor = new Vector3f(var4.m_5866(var1.ambientColor.x()), var4.m_5866(var1.ambientColor.y()), var4.m_5866(var1.ambientColor.z()));
         }
      }
   }
}
