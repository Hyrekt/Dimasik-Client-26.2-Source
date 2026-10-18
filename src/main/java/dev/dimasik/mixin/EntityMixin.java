package dev.dimasik.mixin;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.combat.Aura;
import dev.dimasik.client.module.combat.HitBox;
import dev.dimasik.client.module.movement.NoPush;
import dev.dimasik.client.system.Class_J4cQIb7yfObhq6oF;
import dev.dimasik.client.system.Class_csLPJQP5MlbvexJJ;
import dev.dimasik.client.system.Class_j2JBuvODdMpDiDiw;
import dev.dimasik.client.system.Class_lMF8QIjJz1IQgCZg;
import dev.dimasik.client.system.Class_mZ6Q7gwh7mng3x8m;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public class EntityMixin implements Class_lMF8QIjJz1IQgCZg, Class_mZ6Q7gwh7mng3x8m {
   @Unique
   private Vec3 velocityBeforeFluid;
   @Unique
   private boolean restoreFluidVelocity;
   @Unique
   private float resolvedYaw;
   @Unique
   private float resolvedPitch;
   @Unique
   private Vec3 resolvedPos;
   @Unique
   private boolean dimas$inWeb;
   private static final String f_36656 = "Игроки";
   private static final String f_36657 = "Вода";

   @Override
   public boolean dimas$isInWeb() {
      return this.dimas$inWeb;
   }

   @Override
   public void dimas$setInWeb(boolean var1) {
      this.dimas$inWeb = var1;
   }

   @Override
   public void setResolvedYaw(float var1) {
      this.resolvedYaw = var1;
   }

   @Override
   public void setResolvedPitch(float var1) {
      this.resolvedPitch = var1;
   }

   @Override
   public float getResolvedYaw() {
      return this.resolvedYaw;
   }

   @Override
   public float getResolvedPitch() {
      return this.resolvedPitch;
   }

   @Override
   public void setResolvedPos(Vec3 var1) {
      this.resolvedPos = var1;
   }

   @Override
   public Vec3 getResolvedPos() {
      return this.resolvedPos;
   }

   public Vec3 getResolvedRotationVector() {
      return ((Entity)(Object)this).calculateViewVector(this.resolvedPitch, this.resolvedYaw);
   }

   @Override
   public Vec3 getResolvedForward() {
      return ((Entity)(Object)this).calculateViewVector(this.resolvedPitch, this.resolvedYaw);
   }

   @Inject(method = "move", at = @At("HEAD"))
   private void resetWebState(MoverType var1, Vec3 var2, CallbackInfo var3) {
      this.dimas$inWeb = false;
   }

   @Inject(method = "push(Lnet/minecraft/world/entity/Entity;)V", at = @At("HEAD"), cancellable = true)
   private void noPlayerPush(Entity var1, CallbackInfo var2) {
      Minecraft var3 = Minecraft.getInstance();
      if (var3.player != null) {
         NoPush var4 = DimasikClient.m_9057().m_9049().m_2801().m_3542();
         if (var4.m_776() && var4.f_1652.m_7145(f_36656)) {
            if ((Object)this == var3.player || var1 == var3.player) {
               var2.cancel();
            }
         } else {
            Aura var5 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
            if (var5 != null && (var5.m_1066(var1) || var5.m_1066((Entity)(Object)this)) && ((Object)this == var3.player || var1 == var3.player)) {
               var2.cancel();
            }
         }
      }
   }

   @Inject(method = "updateFluidInteraction()Z", at = @At("HEAD"))
   private void beforeFluidPush(CallbackInfoReturnable<Boolean> var1) {
      Minecraft var2 = Minecraft.getInstance();
      this.restoreFluidVelocity = false;
      if (var2.player != null && (Object)this == var2.player) {
         NoPush var3 = DimasikClient.m_9057().m_9049().m_2801().m_3542();
         if (var3.m_776() && var3.f_1652.m_7145(f_36657)) {
            Entity var4 = (Entity)(Object)this;
            this.velocityBeforeFluid = var4.getDeltaMovement();
            this.restoreFluidVelocity = true;
         }
      }
   }

   @Inject(method = "updateFluidInteraction()Z", at = @At("RETURN"))
   private void afterFluidPush(CallbackInfoReturnable<Boolean> var1) {
      if (this.restoreFluidVelocity && this.velocityBeforeFluid != null) {
         Entity var2 = (Entity)(Object)this;
         var2.setDeltaMovement(this.velocityBeforeFluid);
         this.restoreFluidVelocity = false;
         this.velocityBeforeFluid = null;
      }
   }

   @ModifyVariable(method = "move", at = @At("HEAD"), argsOnly = true, ordinal = 0)
   private Vec3 move(Vec3 var1) {
      Entity var3 = (Entity)(Object)this;
      if (var3 instanceof LocalPlayer var2) {
         Class_j2JBuvODdMpDiDiw var4 = new Class_j2JBuvODdMpDiDiw();
         DimasikClient.m_9057().m_9051().m_9708(var4);
         if (var4.m_1581()) {
            var1 = Vec3.ZERO;
         }
      }

      return var1;
   }

   @Inject(method = "moveRelative", at = @At("TAIL"))
   private void moves(float var1, Vec3 var2, CallbackInfo var3) {
      if ((Object)this == Minecraft.getInstance().player) {
         Class_J4cQIb7yfObhq6oF var4 = new Class_J4cQIb7yfObhq6oF();
         DimasikClient.m_9057().m_9051().m_9708(var4);
      }
   }

   @Inject(method = "collide(Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", at = @At("HEAD"), cancellable = true)
   private void adjustMovementForCollisions(Vec3 var1, CallbackInfoReturnable<Vec3> var2) {
      Class_csLPJQP5MlbvexJJ var3 = new Class_csLPJQP5MlbvexJJ();
      DimasikClient.m_9057().m_9051().m_9708(var3);
      if (var3.m_1581()) {
         var2.setReturnValue(var1);
      }
   }

   @Inject(method = "getBoundingBox", at = @At("RETURN"), cancellable = true)
   private void dimas$visibleHitBox(CallbackInfoReturnable<AABB> var1) {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
         HitBox var2 = DimasikClient.m_9057().m_9049().m_2801().m_3561();
         if (var2 != null) {
            Entity var3 = (Entity)(Object)this;
            var1.setReturnValue(var2.m_1297(var3, (AABB)var1.getReturnValue()));
         }
      }
   }

   @Inject(method = "getDeltaMovement", at = @At("HEAD"), cancellable = true)
   private void freeCampasta(CallbackInfoReturnable<Vec3> var1) {
      Entity var2 = (Entity)(Object)this;
      Minecraft var3 = Minecraft.getInstance();
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049().m_2801().m_3460().m_776() && var2 instanceof LocalPlayer && var2 == var3.player) {
         var1.setReturnValue(Vec3.ZERO);
      }
   }
}
