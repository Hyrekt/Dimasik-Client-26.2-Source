package dev.dimasik.mixin;

import dev.dimasik.client.system.Class_9ss0tyjuvOwGroin;
import net.minecraft.client.renderer.feature.RenderTypeFeatureRenderer;
import net.minecraft.client.renderer.rendertype.RenderType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(RenderTypeFeatureRenderer.class)
public class RenderTypeFeatureRendererMixin {
   @ModifyVariable(method = "getVertexBuilder", at = @At("HEAD"), argsOnly = true)
   private RenderType renderCompleteEntityEspMask(RenderType var1) {
      return Class_9ss0tyjuvOwGroin.m_2069(var1);
   }
}
