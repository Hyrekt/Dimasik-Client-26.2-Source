package dev.dimasik.mixin;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack.Pose;
import dev.dimasik.client.system.Class_WREU7oMaYdkygWNg;
import net.minecraft.client.model.geom.ModelPart.Cube;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Cube.class)
public class ModelPart_CubeMixin {
   @Inject(method = "compile", at = @At("HEAD"), cancellable = true)
   private void renderBentCuboid(Pose var1, VertexConsumer var2, int var3, int var4, int var5, CallbackInfo var6) {
      if (Class_WREU7oMaYdkygWNg.m_5455((Cube)(Object)this, var1, var2, var3, var4, var5)) {
         var6.cancel();
      }
   }
}
