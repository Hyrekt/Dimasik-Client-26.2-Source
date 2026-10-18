package dev.dimasik.mixin;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.mojang.blaze3d.vertex.PoseStack;
import dev.dimasik.client.module.movement.NoClip;
import dev.dimasik.client.module.render.GhostHit;
import dev.dimasik.client.system.Class_GGEo7U6LC2t9Tb5z;
import dev.dimasik.client.system.Class_WREU7oMaYdkygWNg;
import dev.dimasik.client.system.Class_binHXWny7kagd8ju;
import dev.dimasik.client.system.Class_smYfxG0Sb94s63Ts;
import net.minecraft.client.model.player.PlayerModel;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.HumanoidArm;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerModel.class)
public class PlayerModelMixin {
   private static final float f_36647 = 5.0F;
   private static final float f_36648 = 0.22F;
   private static final float f_36649 = -0.28F;
   private static final float f_36650 = -0.28F;
   private static final float f_36651 = 2.4F;
   private static final float f_36652 = 0.07F;

   @WrapMethod(
      method = "translateToHand(Lnet/minecraft/client/renderer/entity/state/AvatarRenderState;Lnet/minecraft/world/entity/HumanoidArm;Lcom/mojang/blaze3d/vertex/PoseStack;)V"
   )
   private void transformHeldItem(AvatarRenderState var1, HumanoidArm var2, PoseStack var3, Operation<Void> var4) {
      PlayerModel var5 = (PlayerModel)(Object)this;
      Object var6 = Class_WREU7oMaYdkygWNg.m_5456(var5.root());

      try {
         var4.call(new Object[]{var1, var2, var3});
         Class_GGEo7U6LC2t9Tb5z.m_2764(var1, var2, var3);
      } finally {
         Class_WREU7oMaYdkygWNg.m_5453(var6);
      }
   }

   @Inject(method = "setupAnim(Lnet/minecraft/client/renderer/entity/state/AvatarRenderState;)V", at = @At("TAIL"))
   private void animatePlayerModel(AvatarRenderState var1, CallbackInfo var2) {
      PlayerModel var3 = (PlayerModel)(Object)this;
      Class_GGEo7U6LC2t9Tb5z.m_2766(var3, var1);
      float var4 = GhostHit.m_9159(var1);
      if (var4 >= 0.0F) {
         float var5 = Mth.cos(var4 * f_36647) * f_36648;
         var3.rightArm.xRot = var3.rightArm.xRot + (f_36649 + var5);
         var3.leftArm.xRot = var3.leftArm.xRot + (f_36650 - var5);
         var3.head.zRot = Mth.sin(var4 * f_36651) * f_36652;
      }

      var3.hat.resetPose();
      var3.jacket.resetPose();
      var3.leftSleeve.resetPose();
      var3.rightSleeve.resetPose();
      var3.leftPants.resetPose();
      var3.rightPants.resetPose();
      if (NoClip.m_2405(((Class_smYfxG0Sb94s63Ts)var1).dimasik$getEntityId())) {
         var3.head.xRot = 0.0F;
         var3.hat.xRot = 0.0F;
      }

      Class_binHXWny7kagd8ju.m_6099(var1, var3);
   }
}
