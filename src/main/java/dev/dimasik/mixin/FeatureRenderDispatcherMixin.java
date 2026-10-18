package dev.dimasik.mixin;

import dev.dimasik.client.system.Class_A8m8kXn9Wd0osexh;
import dev.dimasik.client.system.Class_DNgAQHvIOjv6AdJX;
import dev.dimasik.client.system.Class_kmb9eogH8we2lnWk;
import net.minecraft.client.renderer.SubmitNodeStorage;
import net.minecraft.client.renderer.feature.FeatureRenderDispatcher;
import net.minecraft.client.renderer.feature.FeatureRenderDispatcher.PreparedFrame;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FeatureRenderDispatcher.class)
public class FeatureRenderDispatcherMixin {
   @Inject(method = "prepareFrame", at = @At("HEAD"))
   private void dimasik$submitWingOutlines(SubmitNodeStorage var1, CallbackInfoReturnable<PreparedFrame> var2) {
      Class_A8m8kXn9Wd0osexh.m_2078(var1);
   }

   @Inject(method = "renderAllFeatures", at = @At("TAIL"))
   private void dimasik$clearRenderStorage(SubmitNodeStorage var1, CallbackInfo var2) {
      Class_kmb9eogH8we2lnWk.m_7472();
      Class_DNgAQHvIOjv6AdJX.m_2452();
   }
}
