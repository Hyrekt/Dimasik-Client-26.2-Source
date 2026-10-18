package dev.dimasik.mixin;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.render.FullBright;
import net.minecraft.core.BlockPos;
import net.minecraft.util.LightCoordsUtil;
import net.minecraft.util.LightCoordsUtil.BrightnessGetter;
import net.minecraft.world.level.BlockAndLightGetter;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LightCoordsUtil.class)
public class LightCoordsUtilMixin {
   @Inject(
      method = "getLightCoords(Lnet/minecraft/util/LightCoordsUtil$BrightnessGetter;Lnet/minecraft/world/level/BlockAndLightGetter;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;)I",
      at = @At("RETURN"),
      cancellable = true
   )
   private static void applyAdaptiveFullBright(
      BrightnessGetter var0, BlockAndLightGetter var1, BlockState var2, BlockPos var3, CallbackInfoReturnable<Integer> var4
   ) {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
         FullBright var5 = DimasikClient.m_9057().m_9049().m_2801().m_3439();
         if (var5 != null) {
            var4.setReturnValue(var5.m_5870((Integer)var4.getReturnValue(), var3));
         }
      }
   }
}
