package dev.dimasik.mixin;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.render.HitEffect;
import dev.dimasik.client.system.Class_6oHaOrvBEHvpIU9L;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Entity.RemovalReason;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientLevel.class)
public class ClientLevelMixin {
   @Inject(method = "removeEntity", at = @At("HEAD"))
   private void onRemoveEntity(int var1, RemovalReason var2, CallbackInfo var3) {
      ClientLevel var4 = (ClientLevel)(Object)this;
      Entity var5 = var4.getEntity(var1);
      if (var5 != null) {
         DimasikClient.m_9057().m_9051().m_9708(new Class_6oHaOrvBEHvpIU9L(var5));
      }
   }

   @Inject(method = "playLocalSound(DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V", at = @At("HEAD"), cancellable = true)
   private void hitEffectMuteVanillaAttack(
      double var1, double var3, double var5, SoundEvent var7, SoundSource var8, float var9, float var10, boolean var11, CallbackInfo var12
   ) {
      if (HitEffect.m_2604(var7)) {
         var12.cancel();
      }
   }

   @Inject(
      method = "playLocalSound(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V",
      at = @At("HEAD"),
      cancellable = true
   )
   private void hitEffectMuteVanillaAttackFromEntity(Entity var1, SoundEvent var2, SoundSource var3, float var4, float var5, CallbackInfo var6) {
      if (HitEffect.m_2604(var2)) {
         var6.cancel();
      }
   }
}
