package dev.dimasik.mixin;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.AutoBrewerBuilder;
import dev.dimasik.client.system.Class_JJO8ThL9zxz3U5JH;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Player.class)
public abstract class PlayerMixin {
   @Inject(method = "animateHurt", at = @At("HEAD"))
   private void onAnimateDamage(float var1, CallbackInfo var2) {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9051() != null) {
         DimasikClient.m_9057().m_9051().m_9708(new Class_JJO8ThL9zxz3U5JH((LivingEntity)(Object)this, var1));
      }
   }

   @Inject(method = "isSecondaryUseActive", at = @At("HEAD"), cancellable = true)
   private void autoBrewerInteractionOverride(CallbackInfoReturnable<Boolean> var1) {
      if (AutoBrewerBuilder.f_35031) {
         var1.setReturnValue(false);
      } else {
         if (AutoBrewerBuilder.f_35032) {
            var1.setReturnValue(true);
         }
      }
   }
}
