package dev.dimasik.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.Optimization;
import dev.dimasik.client.module.render.FullBright;
import dev.dimasik.client.system.Class_15puspGa4UwNUgkr;
import dev.dimasik.client.system.Class_29BIBbZyd5QWCwS1;
import dev.dimasik.client.system.Class_nulhzpfOWV9d1NBW;
import dev.dimasik.client.system.Class_smYfxG0Sb94s63Ts;
import dev.dimasik.client.system.Class_xYKqykPYp6IuC6PX;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EntityRenderer.class)
public class EntityRendererMixin {
   @Inject(method = "extractShadow", at = @At("HEAD"), cancellable = true, require = 0)
   private void skipShadow(CallbackInfo var1) {
      if (Optimization.m_5842()) {
         var1.cancel();
      }
   }

   @Inject(method = "getPackedLightCoords", at = @At("RETURN"), cancellable = true)
   private void applyAdaptiveFullBright(Entity var1, float var2, CallbackInfoReturnable<Integer> var3) {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
         FullBright var4 = DimasikClient.m_9057().m_9049().m_2801().m_3439();
         if (var4 != null) {
            var3.setReturnValue(var4.m_5875((Integer)var3.getReturnValue(), var1.getLightProbePosition(var2)));
         }
      }
   }

   @Inject(method = "extractRenderState", at = @At("RETURN"))
   private void updateEntityEspState(Entity var1, EntityRenderState var2, float var3, CallbackInfo var4) {
      ((Class_smYfxG0Sb94s63Ts)var2).dimasik$setEntityId(var1.getId());
      if (var2.nameTag != null) {
         var2.nameTag = Class_29BIBbZyd5QWCwS1.m_933(var2.nameTag);
      }

      if (var2 instanceof AvatarRenderState var5 && var5.scoreText != null) {
         var5.scoreText = Class_29BIBbZyd5QWCwS1.m_933(var5.scoreText);
      }

      Class_15puspGa4UwNUgkr var6 = new Class_15puspGa4UwNUgkr(var1, var2);
      DimasikClient.m_9057().m_9051().m_9708(var6);
   }

   @Inject(
      method = "submitNameDisplay(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V",
      at = @At("HEAD"),
      cancellable = true
   )
   private void renderLabelIfPresent(EntityRenderState var1, PoseStack var2, SubmitNodeCollector var3, CameraRenderState var4, CallbackInfo var5) {
      if (Class_nulhzpfOWV9d1NBW.m_7706(Class_xYKqykPYp6IuC6PX.QfQnMomAbf3hjvZP.HOLOGRAMS)) {
         var5.cancel();
      }
   }
}
