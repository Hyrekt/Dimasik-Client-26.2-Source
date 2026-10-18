package dev.dimasik.mixin;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.movement.NoPush;
import dev.dimasik.client.system.Class_3tFUGm5rgVT7VgqP;
import dev.dimasik.client.system.Class_lMF8QIjJz1IQgCZg;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.network.protocol.game.ClientboundEntityEventPacket;
import net.minecraft.network.protocol.game.ClientboundEntityPositionSyncPacket;
import net.minecraft.network.protocol.game.ClientboundMoveEntityPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.InterpolationHandler;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.FishingHook;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPacketListener.class)
public class ClientPacketListenerMixin {
   @Shadow
   private ClientLevel level;
   private static final String f_36600 = "Удочка";

   @Inject(method = "handleEntityEvent(Lnet/minecraft/network/protocol/game/ClientboundEntityEventPacket;)V", at = @At("HEAD"), cancellable = true)
   private void cancelFishingPull(ClientboundEntityEventPacket var1, CallbackInfo var2) {
      Minecraft var3 = Minecraft.getInstance();
      if (var3.level != null && var3.player != null) {
         NoPush var4 = DimasikClient.m_9057().m_9049().m_2801().m_3542();
         if (var4.m_776() && var4.f_1652.m_7145(f_36600)) {
            if (var1.getEventId() == 31) {
               Entity var5 = var1.getEntity(var3.level);
               if (var5 instanceof FishingHook) {
                  var2.cancel();
               }
            }
         }
      }
   }

   @Inject(method = "handleMoveEntity", at = @At("TAIL"))
   private void onEntity(ClientboundMoveEntityPacket var1, CallbackInfo var2) {
      Entity var3 = var1.getEntity(this.level);
      if (var3 != null) {
         InterpolationHandler var4 = var3.getInterpolation();
         float var5 = var1.hasRotation() ? var1.getYRot() : (var4 != null ? var4.yRot() : var3.getYRot());
         float var6 = var1.hasRotation() ? var1.getXRot() : (var4 != null ? var4.xRot() : var3.getXRot());
         ((Class_lMF8QIjJz1IQgCZg)var3).setResolvedYaw(var5);
         ((Class_lMF8QIjJz1IQgCZg)var3).setResolvedPitch(var6);
         if (var3 instanceof Player) {
            Vec3 var7 = var4 != null ? var4.position() : var3.position();
            ((Class_lMF8QIjJz1IQgCZg)var3).setResolvedPos(var7);
         }
      }
   }

   @Inject(method = "handleEntityPositionSync", at = @At("TAIL"))
   private void onEntityPositionSync(ClientboundEntityPositionSyncPacket var1, CallbackInfo var2) {
      Entity var3 = this.level.getEntity(var1.id());
      if (var3 != null) {
         float var4 = var1.values().yRot();
         float var5 = var1.values().xRot();
         if (var3 instanceof Player) {
            Vec3 var6 = var1.values().position();
            ((Class_lMF8QIjJz1IQgCZg)var3).setResolvedPos(var6);
            ((Class_lMF8QIjJz1IQgCZg)var3).setResolvedYaw(var4);
            ((Class_lMF8QIjJz1IQgCZg)var3).setResolvedPitch(var5);
         }
      }
   }

   @Inject(method = "handleMovePlayer", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/player/Player;getY()D"))
   private void onPlayerPositionLook(ClientboundPlayerPositionPacket var1, CallbackInfo var2) {
      Class_3tFUGm5rgVT7VgqP var3 = new Class_3tFUGm5rgVT7VgqP();
      DimasikClient.m_9057().m_9051().m_9708(var3);
   }
}
