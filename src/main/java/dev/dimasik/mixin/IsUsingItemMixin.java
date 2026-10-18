package dev.dimasik.mixin;

import dev.dimasik.client.system.Class_LRsxqvEkEcBPGPUf;
import dev.dimasik.client.system.Class_X574GcHt0SazS9zo;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.item.properties.conditional.IsUsingItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(IsUsingItem.class)
public class IsUsingItemMixin {
   @Inject(method = "get", at = @At("RETURN"), cancellable = true)
   private void hmiSwapProperty(ItemStack var1, ClientLevel var2, LivingEntity var3, int var4, ItemDisplayContext var5, CallbackInfoReturnable<Boolean> var6) {
      if (Class_X574GcHt0SazS9zo.m_5499()) {
         if (var3 != null && var3.getUseItem() == var1) {
            String var7 = var1.getItem().toString();
            if (Class_LRsxqvEkEcBPGPUf.f_10583.containsKey(var7)) {
               var6.setReturnValue(Class_LRsxqvEkEcBPGPUf.f_10583.get(var7));
            }
         }
      }
   }
}
