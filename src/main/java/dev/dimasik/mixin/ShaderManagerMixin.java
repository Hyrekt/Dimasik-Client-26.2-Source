package dev.dimasik.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.mojang.blaze3d.systems.GpuDevice;
import dev.dimasik.client.system.Class_3dmyjp6zjiPOb8Hv;
import dev.dimasik.client.system.Class_9ss0tyjuvOwGroin;
import dev.dimasik.client.system.Class_OueIwWsHk2sz6LiR;
import dev.dimasik.client.system.Class_Trm8dR6i9vMfnZEG;
import net.minecraft.client.renderer.ShaderManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ShaderManager.class)
public abstract class ShaderManagerMixin {
   private static final String f_36637 = "Vulkan";

   @WrapOperation(
      method = "apply(Lnet/minecraft/client/renderer/ShaderManager$Configs;Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/util/profiling/ProfilerFiller;)V",
      at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/systems/GpuDevice;clearPipelineCache()V")
   )
   private void dimasik$submitBeforeShaderReload(GpuDevice var1, Operation<Void> var2) {
      if (f_36637.equals(var1.getDeviceInfo().backendName())) {
         var1.createCommandEncoder().submit();
      }

      var2.call(new Object[]{var1});
      Class_Trm8dR6i9vMfnZEG.m_5061();
      Class_OueIwWsHk2sz6LiR.m_4078();
      Class_9ss0tyjuvOwGroin.m_2065();
      Class_3dmyjp6zjiPOb8Hv.m_1317();
   }
}
