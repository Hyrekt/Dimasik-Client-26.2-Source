package dev.dimasik.mixin;

import dev.dimasik.client.system.Class_DNgAQHvIOjv6AdJX;
import dev.dimasik.client.system.Class_kmb9eogH8we2lnWk;
import net.minecraft.client.renderer.item.ItemStackRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemStackRenderState.class)
public class ItemStackRenderStateMixin {
   @Inject(method = "clear", at = @At("HEAD"))
   private void hmiClear(CallbackInfo var1) {
      Class_kmb9eogH8we2lnWk.m_7472();
      Class_DNgAQHvIOjv6AdJX.m_2452();
   }
}
