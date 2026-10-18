package dev.dimasik.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.systems.RenderPass;
import dev.dimasik.client.system.Class_kExOXkH43RbeAKdq;
import dev.dimasik.mixin.annotation.IfModLoaded;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Coerce;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@IfModLoaded("sodium")
@Pseudo
@Mixin(targets = "net.caffeinemc.mods.sodium.client.render.chunk.DefaultChunkRenderer", remap = false)
public class DefaultChunkRendererMixin implements Class_kExOXkH43RbeAKdq.Class_6RZFeINBnYKmF9rg {
   @Unique
   private Class_kExOXkH43RbeAKdq dimasik$chunkAnimation;

   @Inject(method = "render", at = @At("HEAD"))
   private void dimasik$prepareChunkOffsets(CallbackInfo var1) {
      if (this.dimasik$chunkAnimation == null) {
         this.dimasik$chunkAnimation = new Class_kExOXkH43RbeAKdq();
      }

      this.dimasik$chunkAnimation.m_7411();
   }

   @WrapOperation(
      method = "render",
      at = @At(
         value = "INVOKE",
         target = "Lnet/caffeinemc/mods/sodium/client/render/chunk/lists/ChunkRenderList;getRegion()Lnet/caffeinemc/mods/sodium/client/render/chunk/region/RenderRegion;",
         ordinal = 0
      )
   )
   @Coerce
   private Object dimasik$prepareRegionOffsets(@Coerce Object var1, Operation<Object> var2) {
      Object var3 = var2.call(new Object[]{var1});
      this.dimasik$chunkAnimation.m_7414((Class_kExOXkH43RbeAKdq.uQ9fNUWc63j0tkTA)var3);
      return var3;
   }

   @WrapOperation(
      method = "render",
      at = @At(
         value = "INVOKE",
         target = "Lnet/caffeinemc/mods/sodium/client/gpu/device/context/DrawContext;updateData(Lnet/caffeinemc/mods/sodium/client/render/chunk/region/RenderRegion;Lnet/caffeinemc/mods/sodium/client/render/viewport/CameraTransform;)V"
      )
   )
   private void dimasik$bindChunkOffsets(@Coerce Object var1, @Coerce Object var2, @Coerce Object var3, Operation<Void> var4, @Local RenderPass var5) {
      var5.setUniform(Class_kExOXkH43RbeAKdq.m_7418(), this.dimasik$chunkAnimation.m_7414((Class_kExOXkH43RbeAKdq.uQ9fNUWc63j0tkTA)var2));
      var4.call(new Object[]{var1, var2, var3});
   }

   @Inject(method = "rotate", at = @At("HEAD"))
   private void dimasik$nextAnimationFrame(CallbackInfo var1) {
      if (this.dimasik$chunkAnimation != null) {
         this.dimasik$chunkAnimation.m_7410();
      }
   }

   @Override
   public void dimasik$closeChunkAnimation() {
      if (this.dimasik$chunkAnimation != null) {
         this.dimasik$chunkAnimation.close();
         this.dimasik$chunkAnimation = null;
      }
   }
}
