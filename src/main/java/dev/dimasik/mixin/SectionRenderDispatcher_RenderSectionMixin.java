package dev.dimasik.mixin;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.render.BetterMinecraft;
import dev.dimasik.mixin.annotation.IfModLoaded;
import net.minecraft.client.renderer.chunk.SectionRenderDispatcher.RenderSection;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@IfModLoaded("!sodium")
@Mixin(RenderSection.class)
public class SectionRenderDispatcher_RenderSectionMixin {
   @Inject(method = "setSectionNode", at = @At("TAIL"))
   private void movedSection(long var1, CallbackInfo var3) {
      DimasikClient var4 = DimasikClient.m_9057();
      if (var4 != null && var4.m_9049() != null && var4.m_9049().m_2801() != null) {
         BetterMinecraft var5 = var4.m_9049().m_2801().m_3478();
         if (var5.m_776() && var5.f_16480.m_8768()) {
            var5.f_16484.m_4617((RenderSection)(Object)this);
         }
      }
   }
}
