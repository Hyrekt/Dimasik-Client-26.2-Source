package dev.dimasik.mixin;

import com.llamalad7.mixinextras.injector.WrapWithCondition;
import dev.dimasik.client.system.Class_mzQ5t1DkueICIw6Q;
import net.minecraft.client.gui.render.GuiRenderer;
import net.minecraft.client.renderer.StagedVertexBuffer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(GuiRenderer.class)
public class GuiRendererMixin_2 {
   @WrapWithCondition(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/StagedVertexBuffer;endFrame()V"))
   private boolean endBuffersOnFinalPass(StagedVertexBuffer var1) {
      return !Class_mzQ5t1DkueICIw6Q.m_7639();
   }

   @WrapWithCondition(
      method = "render",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/render/GuiRenderer;clearUnusedOversizedItemRenderers()V")
   )
   private boolean releaseUnusedOnFinalPass(GuiRenderer var1) {
      return !Class_mzQ5t1DkueICIw6Q.m_7639();
   }
}
