package dev.dimasik.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.system.Class_K8M2SzUAxj6ae7uY;
import dev.dimasik.client.system.Class_XqyHOyiq0ROk9HLU;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.FireworkRocketEntity;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(FireworkRocketEntity.class)
public abstract class FireworkRocketEntityMixin extends Projectile {
   @Unique
   private Vec3 rotation;
   @Shadow
   private LivingEntity attachedToEntity;
   private static final float f_36601 = 1.5F;
   private static final float f_36602 = 1.5F;
   private static final float f_36603 = 1.5F;
   private static final double f_36604 = 0.1;
   private static final double f_36605 = 0.5;
   private static final double f_36606 = 0.1;
   private static final double f_36607 = 0.5;
   private static final double f_36608 = 0.1;
   private static final double f_36609 = 0.5;

   public FireworkRocketEntityMixin(EntityType<? extends Projectile> var1, Level var2) {
      super(var1, var2);
   }

   @ModifyExpressionValue(
      method = "tick",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/LivingEntity;getLookAngle()Lnet/minecraft/world/phys/Vec3;")
   )
   public Vec3 tick(Vec3 var1) {
      if (this.attachedToEntity == Minecraft.getInstance().player) {
         Class_K8M2SzUAxj6ae7uY var2 = new Class_K8M2SzUAxj6ae7uY(this.attachedToEntity.getYRot(), this.attachedToEntity.getXRot());
         DimasikClient.m_9057().m_9051().m_9708(var2);
         this.rotation = this.calculateViewVector(var2.m_3378(), var2.m_3376());
      } else {
         this.rotation = var1;
      }

      return this.rotation;
   }

   @Redirect(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/phys/Vec3;add(DDD)Lnet/minecraft/world/phys/Vec3;", ordinal = 0))
   public Vec3 tick(Vec3 var1, double var2, double var4, double var6) {
      Class_XqyHOyiq0ROk9HLU var8 = new Class_XqyHOyiq0ROk9HLU(this.attachedToEntity, f_36601, f_36602, f_36603);
      DimasikClient.m_9057().m_9051().m_9708(var8);
      return var1.add(
         this.rotation.x * f_36604 + (this.rotation.x * var8.m_5614() - var1.x) * f_36605,
         this.rotation.y * f_36606 + (this.rotation.y * var8.m_5613() - var1.y) * f_36607,
         this.rotation.z * f_36608 + (this.rotation.z * var8.m_5607() - var1.z) * f_36609
      );
   }
}
