package dev.dimasik.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.mojang.authlib.GameProfile;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.system.Class_EndlYW7bFBb6ZTsy;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_jfpiTZhNIuwDwqKr;
import dev.dimasik.client.system.Class_qPbJhurktO5IWlrv;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.player.ClientInput;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.player.Input;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LocalPlayer.class)
public abstract class LocalPlayerMixin extends AbstractClientPlayer {
   @Final
   @Shadow
   public ClientPacketListener connection;
   @Shadow
   public ClientInput input;
   @Unique
   private Class_jfpiTZhNIuwDwqKr eventSync;
   private static final String f_36612 = "Блоки";

   public LocalPlayerMixin(ClientLevel var1, GameProfile var2) {
      super(var1, var2);
   }

   @Shadow
   protected abstract void updateAutoJump(float var1, float var2);

   @ModifyExpressionValue(
      method = "pick(Lnet/minecraft/world/entity/Entity;DDF)Lnet/minecraft/world/phys/HitResult;",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/world/entity/projectile/ProjectileUtil;getEntityHitResult(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;D)Lnet/minecraft/world/phys/EntityHitResult;"
      )
   )
   private static EntityHitResult filterCrosshairTarget(EntityHitResult var0) {
      if (var0 == null) {
         return null;
      }

      boolean var1 = DimasikClient.m_9057().m_9049().m_2801().m_3445().m_776();
      boolean var2 = DimasikClient.m_9057().m_9049().m_2804().m_2877(var0.getEntity().getName().getString());
      if (var1 && var2) {
         return null;
      }

      boolean var3 = DimasikClient.m_9057().m_9049().m_2801().m_3501().m_776();
      return var3 ? null : var0;
   }

   @Inject(method = "moveTowardsClosestSpace", at = @At("HEAD"), cancellable = true)
   public void pushOutOfBlocks(double var1, double var3, CallbackInfo var5) {
      if (DimasikClient.m_9057().m_9049().m_2801().m_3542().m_776() && DimasikClient.m_9057().m_9049().m_2801().m_3542().f_1652.m_7145(f_36612)) {
         var5.cancel();
      }
   }

   @Inject(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/player/AbstractClientPlayer;tick()V"))
   public void tick(CallbackInfo var1) {
      DimasikClient.m_9057().m_9051().m_9708(new Class_Xu9btcIeUN33XnMK());
   }

   @Inject(method = "tick", at = @At("TAIL"))
   public void postTicks(CallbackInfo var1) {
      if (this.connection.hasClientLoaded()) {
         DimasikClient.m_9057().m_9051().m_9708(new Class_Xu9btcIeUN33XnMK.Class_07sbU45IoaK910B1());
      }
   }

   @Inject(
      method = "move",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/player/AbstractClientPlayer;move(Lnet/minecraft/world/entity/MoverType;Lnet/minecraft/world/phys/Vec3;)V"
      ),
      cancellable = true
   )
   public void onMoveHook(MoverType var1, Vec3 var2, CallbackInfo var3) {
      Class_EndlYW7bFBb6ZTsy var4 = new Class_EndlYW7bFBb6ZTsy(var2);
      DimasikClient.m_9057().m_9051().m_9708(var4);
      double var5 = this.getX();
      double var7 = this.getZ();
      super.move(var1, var4.m_2544());
      this.updateAutoJump((float)(this.getX() - var5), (float)(this.getZ() - var7));
      var3.cancel();
   }

   @ModifyExpressionValue(method = "modifyInput", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/player/LocalPlayer;itemUseSpeedMultiplier()F"))
   private float modifyItemSlowdown(float var1) {
      Class_qPbJhurktO5IWlrv var2 = new Class_qPbJhurktO5IWlrv();
      DimasikClient.m_9057().m_9051().m_9708(var2);
      return var2.m_1581() ? 1.0F : var1;
   }

   @Inject(method = "sendPosition", at = @At("HEAD"), cancellable = true)
   public void sendMovementPackets(CallbackInfo var1) {
      LocalPlayer var2 = (LocalPlayer)(Object)this;
      this.eventSync = new Class_jfpiTZhNIuwDwqKr(var2.position(), var2.getYRot(), var2.getXRot(), var2.onGround());
      DimasikClient.m_9057().m_9051().m_9708(this.eventSync);
      if (this.eventSync.m_1581()) {
         var1.cancel();
      }
   }

   @Redirect(
      method = "sendPosition",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/player/LocalPlayer;position()Lnet/minecraft/world/phys/Vec3;")
   )
   private Vec3 redirectGetEntityPos(LocalPlayer var1) {
      return this.eventSync != null ? this.eventSync.m_7399() : var1.position();
   }

   @Inject(method = "sendPosition", at = @At("RETURN"))
   public void post(CallbackInfo var1) {
      if (this.eventSync != null && !this.eventSync.m_1581()) {
         Class_jfpiTZhNIuwDwqKr.Class_13dQBetjQQOBNsco var2 = new Class_jfpiTZhNIuwDwqKr.Class_13dQBetjQQOBNsco(
            this.eventSync.m_7399(), this.eventSync.m_7396(), this.eventSync.m_7397(), this.eventSync.m_7394()
         );
         DimasikClient.m_9057().m_9051().m_9708(var2);
      }
   }

   @Redirect(method = "sendPosition", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/player/LocalPlayer;getYRot()F"))
   public float getYaw(LocalPlayer var1) {
      return this.eventSync != null ? this.eventSync.m_7396() : var1.getYRot();
   }

   @Redirect(method = "sendPosition", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/player/LocalPlayer;getXRot()F"))
   public float getPitch(LocalPlayer var1) {
      return this.eventSync != null ? this.eventSync.m_7397() : var1.getXRot();
   }

   @Inject(method = "sendPosition", at = @At("HEAD"), cancellable = true)
   private void cancelmovem(CallbackInfo var1) {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049().m_2801().m_3460().m_776()) {
         var1.cancel();
      }
   }

   @Inject(method = "sendIsSprintingIfNeeded", at = @At("HEAD"), cancellable = true)
   private void cancelsprint(CallbackInfo var1) {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049().m_2801().m_3460().m_776()) {
         var1.cancel();
      }
   }

   @Inject(method = "applyInput", at = @At("HEAD"), cancellable = true)
   private void cancelinput(CallbackInfo var1) {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049().m_2801().m_3460().m_776()) {
         LocalPlayer var2 = (LocalPlayer)(Object)this;
         var2.input.keyPresses = Input.EMPTY;
         var2.xxa = 0.0F;
         var2.zza = 0.0F;
         var2.yya = 0.0F;
         var2.setJumping(false);
         var1.cancel();
      }
   }
}
