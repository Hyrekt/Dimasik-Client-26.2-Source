package dev.dimasik.mixin;

import com.mojang.blaze3d.shaders.ShaderType;
import dev.dimasik.client.system.Class_RzDLx31sJx5BAYMk;
import dev.dimasik.client.system.Class_kExOXkH43RbeAKdq;
import net.minecraft.resources.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(targets = "net.minecraft.client.renderer.ShaderManager$CompilationCache")
public class ShaderManager_CompilationCacheMixin {
   @Inject(method = "getShaderSource", at = @At("RETURN"), cancellable = true)
   private void prepareDepthConvention(Identifier var1, ShaderType var2, CallbackInfoReturnable<String> var3) {
      var3.setReturnValue(Class_kExOXkH43RbeAKdq.m_7412(var1, var2, Class_RzDLx31sJx5BAYMk.m_4659(var1, (String)var3.getReturnValue())));
   }
}
