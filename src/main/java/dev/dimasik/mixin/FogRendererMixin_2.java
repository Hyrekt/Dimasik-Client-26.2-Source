package dev.dimasik.mixin;

import dev.dimasik.client.module.render.Removals;
import net.minecraft.client.Camera;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.fog.FogData;
import net.minecraft.client.renderer.fog.FogRenderer;
import net.minecraft.world.level.material.FogType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FogRenderer.class)
public class FogRendererMixin_2 {
   private static final float f_36643 = 1000000.0F;
   private static final float f_36644 = 1000001.0F;
   private static final float f_36645 = 1000000.0F;
   private static final float f_36646 = 1000001.0F;

   @Inject(method = "setupFog", at = @At("RETURN"))
   private void removeLiquidFog(Camera var1, int var2, DeltaTracker var3, float var4, ClientLevel var5, CallbackInfoReturnable<FogData> var6) {
      if (Removals.m_1465()) {
         FogType var7 = var1.getFluidInCamera();
         if (var7 == FogType.WATER || var7 == FogType.LAVA) {
            FogData var8 = (FogData)var6.getReturnValue();
            var8.environmentalStart = f_36643;
            var8.environmentalEnd = f_36644;
            var8.renderDistanceStart = f_36645;
            var8.renderDistanceEnd = f_36646;
         }
      }
   }
}
