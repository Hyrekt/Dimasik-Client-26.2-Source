package dev.dimasik.mixin;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.system.Class_iwAhvU3kT2OSICj4;
import net.minecraft.client.renderer.SectionOcclusionGraph;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.client.renderer.state.level.ChunkLoadingRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SectionOcclusionGraph.class)
public class SectionOcclusionGraphMixin {
   @Inject(method = "update", at = @At("HEAD"))
   private void updateSectionOcclusionGraph(CameraRenderState var1, int var2, ChunkLoadingRenderState var3, CallbackInfo var4) {
      Class_iwAhvU3kT2OSICj4 var5 = new Class_iwAhvU3kT2OSICj4();
      DimasikClient.m_9057().m_9051().m_9708(var5);
      var1.smartCull = !var5.m_1581() && var1.smartCull;
   }
}
