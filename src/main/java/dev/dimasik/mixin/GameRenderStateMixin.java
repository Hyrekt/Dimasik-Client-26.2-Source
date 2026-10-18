package dev.dimasik.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import dev.dimasik.client.module.misc.Optimization;
import net.minecraft.client.renderer.state.GameRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(GameRenderState.class)
public abstract class GameRenderStateMixin {
   @ModifyReturnValue(method = "useShaderTransparency", at = @At("RETURN"), require = 0)
   private boolean forceFastTransparency(boolean var1) {
      return Optimization.m_5854(var1);
   }
}
