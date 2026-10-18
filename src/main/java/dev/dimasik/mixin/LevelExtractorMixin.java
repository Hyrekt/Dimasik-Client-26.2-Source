package dev.dimasik.mixin;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.Optimization;
import net.minecraft.client.Camera;
import net.minecraft.client.renderer.extract.LevelExtractor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(LevelExtractor.class)
public class LevelExtractorMixin {
   @ModifyArg(
      method = "extractVisibleEntities",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/Entity;setViewScale(D)V"),
      index = 0,
      require = 0
   )
   private double scaleEntityDistance(double var1) {
      return Optimization.m_5857(var1);
   }

   @Redirect(
      method = "extractVisibleEntities(Lnet/minecraft/client/Camera;Lnet/minecraft/client/renderer/culling/Frustum;Lnet/minecraft/client/DeltaTracker;Lnet/minecraft/client/renderer/state/level/LevelRenderState;)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Camera;isDetached()Z", ordinal = 0),
      require = 1
   )
   private boolean playerrneder(Camera var1) {
      return var1.isDetached() || DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049().m_2801().m_3460().m_776();
   }
}
