package dev.dimasik.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.mojang.blaze3d.pipeline.BindGroupLayout;
import com.mojang.blaze3d.pipeline.BindGroupLayout.Builder;
import com.mojang.blaze3d.shaders.UniformType;
import dev.dimasik.client.system.Class_kExOXkH43RbeAKdq;
import dev.dimasik.mixin.annotation.IfModLoaded;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@IfModLoaded("sodium")
@Pseudo
@Mixin(targets = "net.caffeinemc.mods.sodium.client.render.chunk.ShaderChunkRenderer", remap = false)
public class ShaderChunkRendererMixin {
   @WrapOperation(
      method = "<clinit>",
      at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/pipeline/BindGroupLayout$Builder;build()Lcom/mojang/blaze3d/pipeline/BindGroupLayout;")
   )
   private static BindGroupLayout dimasik$chunkAnimationLayout(Builder var0, Operation<BindGroupLayout> var1) {
      var0.withUniform(Class_kExOXkH43RbeAKdq.m_7418(), UniformType.UNIFORM_BUFFER);
      return (BindGroupLayout)var1.call(new Object[]{var0});
   }

   @Inject(method = "delete", at = @At("HEAD"))
   private void dimasik$releaseAnimationBuffers(CallbackInfo var1) {
      if (this instanceof Class_kExOXkH43RbeAKdq.Class_6RZFeINBnYKmF9rg var2) {
         var2.dimasik$closeChunkAnimation();
      }
   }
}
