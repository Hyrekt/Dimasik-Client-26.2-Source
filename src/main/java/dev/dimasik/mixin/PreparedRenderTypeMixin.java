package dev.dimasik.mixin;

import com.mojang.blaze3d.IndexType;
import com.mojang.blaze3d.buffers.GpuBuffer;
import dev.dimasik.client.system.Class_9ss0tyjuvOwGroin;
import net.minecraft.client.renderer.rendertype.PreparedRenderType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PreparedRenderType.class)
public class PreparedRenderTypeMixin {
   @Inject(
      method = "drawFromBuffer(Lcom/mojang/blaze3d/buffers/GpuBuffer;Lcom/mojang/blaze3d/buffers/GpuBuffer;Lcom/mojang/blaze3d/IndexType;III)V",
      at = @At("RETURN")
   )
   private void captureEntityEspSurface(GpuBuffer var1, GpuBuffer var2, IndexType var3, int var4, int var5, int var6, CallbackInfo var7) {
      Class_9ss0tyjuvOwGroin.m_2067((PreparedRenderType)(Object)this, var1, var2, var3, var4, var5, var6);
   }
}
