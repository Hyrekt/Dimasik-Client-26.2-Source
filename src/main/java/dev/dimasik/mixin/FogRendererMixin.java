package dev.dimasik.mixin;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_hE5HYN1IW4q63o2z;
import net.minecraft.client.Camera;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.fog.FogData;
import net.minecraft.client.renderer.fog.FogRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FogRenderer.class)
public class FogRendererMixin {
   private static final float f_36617 = 16.0F;
   private static final float f_36618 = 1.0E7F;
   private static final float f_36619 = 1.0E7F;

   @Inject(method = "setupFog", at = @At("RETURN"))
   private void modifyFog(Camera var1, int var2, DeltaTracker var3, float var4, ClientLevel var5, CallbackInfoReturnable<FogData> var6) {
      if (DimasikClient.m_9057() != null) {
         FogData var7 = (FogData)var6.getReturnValue();
         Class_hE5HYN1IW4q63o2z var8 = new Class_hE5HYN1IW4q63o2z(var1, Math.max(f_36617, var7.renderDistanceEnd));
         DimasikClient.m_9057().m_9051().m_9708(var8);
         if (var8.m_1581()) {
            if (var8.m_7138()) {
               var7.color.set(Class_BftdentXEtGbugJw.m_2298(var8.m_7140()));
               if (var7.color.w == 0.0F) {
                  var7.color.w = 1.0F;
               }
            }

            if (var8.m_7136()) {
               var7.environmentalStart = f_36618;
               var7.environmentalEnd = f_36619;
               var7.renderDistanceStart = var8.m_7144();
               var7.renderDistanceEnd = var8.m_7137();
               var7.skyEnd = var8.m_7137();
               var7.cloudEnd = var8.m_7137();
            }
         }
      }
   }
}
