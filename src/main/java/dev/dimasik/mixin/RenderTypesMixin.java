package dev.dimasik.mixin;

import dev.dimasik.client.system.Class_9ss0tyjuvOwGroin;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.resources.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(RenderTypes.class)
public class RenderTypesMixin {
   @Inject(method = "outline", at = @At("HEAD"), cancellable = true)
   private static void renderCompleteEntityEspMask(Identifier var0, CallbackInfoReturnable<RenderType> var1) {
      if (Class_9ss0tyjuvOwGroin.m_2068()) {
         var1.setReturnValue(Class_9ss0tyjuvOwGroin.m_2066(var0));
      }
   }
}
