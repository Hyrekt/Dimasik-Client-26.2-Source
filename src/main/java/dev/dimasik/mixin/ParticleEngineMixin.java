package dev.dimasik.mixin;

import dev.dimasik.client.module.misc.Optimization;
import dev.dimasik.client.system.Class_nulhzpfOWV9d1NBW;
import dev.dimasik.client.system.Class_rj7yTIJUyflxIxTs;
import dev.dimasik.client.system.Class_xYKqykPYp6IuC6PX;
import net.minecraft.client.Camera;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleEngine;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.state.level.ParticlesRenderState;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.world.phys.AABB;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ParticleEngine.class)
public class ParticleEngineMixin {
   private static final double f_36504 = 0.5;
   private static final double f_36505 = 0.5;
   private static final double f_36506 = 0.5;

   @Inject(method = "add(Lnet/minecraft/client/particle/Particle;)V", at = @At("HEAD"), cancellable = true, require = 0)
   private void cullDistantParticle(Particle var1, CallbackInfo var2) {
      AABB var3 = var1.getBoundingBox();
      double var4 = (var3.minX + var3.maxX) * f_36504;
      double var6 = (var3.minY + var3.maxY) * f_36505;
      double var8 = (var3.minZ + var3.maxZ) * f_36506;
      if (!Optimization.m_5849(var4, var6, var8)) {
         var2.cancel();
      }
   }

   @Inject(
      method = "createParticle(Lnet/minecraft/core/particles/ParticleOptions;DDDDDD)Lnet/minecraft/client/particle/Particle;",
      at = @At("HEAD"),
      cancellable = true
   )
   private void addParticle(
      ParticleOptions var1, double var2, double var4, double var6, double var8, double var10, double var12, CallbackInfoReturnable<Particle> var14
   ) {
      if (var1 instanceof BlockParticleOption) {
         if (Class_rj7yTIJUyflxIxTs.m_8451(BlockPos.containing(var2, var4, var6))) {
            var14.setReturnValue(null);
            return;
         }

         if (Class_nulhzpfOWV9d1NBW.m_7706(Class_xYKqykPYp6IuC6PX.QfQnMomAbf3hjvZP.DESTROY_PARTICLES)) {
            var14.setReturnValue(null);
         }
      }
   }

   @Inject(method = "extract", at = @At("HEAD"), cancellable = true)
   private void addToBatch(ParticlesRenderState var1, Frustum var2, Camera var3, float var4, CallbackInfo var5) {
      if (Optimization.m_5856() || Class_nulhzpfOWV9d1NBW.m_7706(Class_xYKqykPYp6IuC6PX.QfQnMomAbf3hjvZP.SMOKE)) {
         var5.cancel();
      }
   }
}
