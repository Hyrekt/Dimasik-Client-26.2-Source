package dev.dimasik.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.system.Class_29BIBbZyd5QWCwS1;
import dev.dimasik.client.system.Class_4ME0aEy5IMLZdY99;
import dev.dimasik.client.system.Class_GGEo7U6LC2t9Tb5z;
import dev.dimasik.client.system.Class_Ky3KUwF3IHVodjQH;
import dev.dimasik.client.system.Class_Xc9oMkiIE6eeApEo;
import dev.dimasik.client.system.Class_l75W7VAWwOiU3nIS;
import dev.dimasik.client.system.Class_qH48rpj3mSM0fCe0;
import dev.dimasik.client.system.Class_vf016r24hrMO4mCD;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.player.PlayerModel;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.player.AvatarRenderer;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.world.entity.Avatar;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AvatarRenderer.class)
public class AvatarRendererMixin {
   @Inject(method = "<init>", at = @At("TAIL"))
   private void addCosmeticWings(Context var1, boolean var2, CallbackInfo var3) {
      ((LivingEntityRendererMixin_2)this).invokeAddFeature(new Class_vf016r24hrMO4mCD((RenderLayerParent<AvatarRenderState, PlayerModel>)this));
      ((LivingEntityRendererMixin_2)this).invokeAddFeature(new Class_l75W7VAWwOiU3nIS((RenderLayerParent<AvatarRenderState, PlayerModel>)this));
      ((LivingEntityRendererMixin_2)this).invokeAddFeature(new Class_Ky3KUwF3IHVodjQH((RenderLayerParent<AvatarRenderState, PlayerModel>)this));
      ((LivingEntityRendererMixin_2)this).invokeAddFeature(new Class_qH48rpj3mSM0fCe0((RenderLayerParent<AvatarRenderState, PlayerModel>)this));
   }

   @Inject(
      method = "extractRenderState(Lnet/minecraft/world/entity/Avatar;Lnet/minecraft/client/renderer/entity/state/AvatarRenderState;F)V",
      at = @At("RETURN")
   )
   private void protectPlayerName(Avatar var1, AvatarRenderState var2, float var3, CallbackInfo var4) {
      String var5 = var1 instanceof Player var6 ? var6.getGameProfile().name() : var1.getName().getString();
      if (var2.nameTag != null) {
         Minecraft var8 = Minecraft.getInstance();
         boolean var7 = var8.player != null && var1.getUUID().equals(var8.player.getUUID());
         var2.nameTag = var7 ? Class_29BIBbZyd5QWCwS1.m_931(var2.nameTag) : Class_29BIBbZyd5QWCwS1.m_981(var2.nameTag, var5);
      }

      if (var2.scoreText != null) {
         Minecraft var9 = Minecraft.getInstance();
         boolean var10 = var9.player != null && var1.getUUID().equals(var9.player.getUUID());
         var2.scoreText = var10 ? Class_29BIBbZyd5QWCwS1.m_931(var2.scoreText) : Class_29BIBbZyd5QWCwS1.m_981(var2.scoreText, var5);
      }

      if (Class_Xc9oMkiIE6eeApEo.m_5564(var5)) {
         if (var2.nameTag != null) {
            var2.nameTag = Class_Xc9oMkiIE6eeApEo.m_5569(var2.nameTag);
         }

         if (var2.scoreText != null) {
            var2.scoreText = Class_Xc9oMkiIE6eeApEo.m_5569(var2.scoreText);
         }
      }

      Class_GGEo7U6LC2t9Tb5z.m_2761(var2, var1.getUUID());
   }

   @Inject(method = "setupRotations(Lnet/minecraft/client/renderer/entity/state/AvatarRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;FF)V", at = @At("TAIL"))
   private void applyEmoteBodyTransform(AvatarRenderState var1, PoseStack var2, float var3, float var4, CallbackInfo var5) {
      Class_GGEo7U6LC2t9Tb5z.m_2757(var1, var2);
   }

   @Inject(
      method = "submitNameDisplay(Lnet/minecraft/client/renderer/entity/state/AvatarRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V",
      at = @At("HEAD"),
      cancellable = true
   )
   private void renderLabel(AvatarRenderState var1, PoseStack var2, SubmitNodeCollector var3, CameraRenderState var4, CallbackInfo var5) {
      Class_4ME0aEy5IMLZdY99 var6 = new Class_4ME0aEy5IMLZdY99();
      DimasikClient.m_9057().m_9051().m_9708(var6);
      if (var6.m_1581()) {
         var5.cancel();
      }
   }
}
