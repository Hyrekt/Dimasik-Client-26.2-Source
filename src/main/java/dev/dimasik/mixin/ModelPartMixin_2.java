package dev.dimasik.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.dimasik.client.system.Class_WREU7oMaYdkygWNg;
import net.minecraft.client.model.geom.ModelPart;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ModelPart.class)
public class ModelPartMixin_2 {
   @Inject(method = "translateAndRotate", at = @At("HEAD"))
   private void applyEmoteUpperBodyBend(PoseStack var1, CallbackInfo var2) {
      Class_WREU7oMaYdkygWNg.m_5459((ModelPart)(Object)this, var1);
   }
}
