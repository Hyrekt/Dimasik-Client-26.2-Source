package dev.dimasik.mixin;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.HpHelper;
import dev.dimasik.client.module.render.Ambience;
import dev.dimasik.client.module.render.ShaderMist;
import net.minecraft.client.renderer.CloudRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CloudRenderer.class)
public abstract class CloudRendererMixin {
   @ModifyVariable(method = "render", at = @At("HEAD"), argsOnly = true, ordinal = 0)
   private int ghoulCloudColor(int var1) {
      return HpHelper.m_7672() ? HpHelper.m_7674() : var1;
   }

   @Inject(method = "render", at = @At("HEAD"), cancellable = true)
   private void removeClouds(CallbackInfo var1) {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
         Ambience var2 = DimasikClient.m_9057().m_9049().m_2801().m_3511();
         if (var2 != null && var2.m_3026()) {
            var1.cancel();
         } else {
            ShaderMist var3 = DimasikClient.m_9057().m_9049().m_2801().m_3450();
            if (var3 != null && var3.m_6122()) {
               var1.cancel();
            }
         }
      }
   }
}
