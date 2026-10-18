package dev.dimasik.mixin;

import dev.dimasik.client.system.Class_GGEo7U6LC2t9Tb5z;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.player.PlayerModel;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(HumanoidModel.class)
public class HumanoidModelMixin {
   @Inject(method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/HumanoidRenderState;)V", at = @At("TAIL"))
   private void animateEmoteArmor(HumanoidRenderState var1, CallbackInfo var2) {
      if (!((Object)this instanceof PlayerModel)) {
         if (var1 instanceof AvatarRenderState var3) {
            Class_GGEo7U6LC2t9Tb5z.m_2766((HumanoidModel<?>)(Object)this, var3);
         }
      }
   }
}
