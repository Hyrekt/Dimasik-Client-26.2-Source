package dev.dimasik.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.dimasik.client.module.render.Chams;
import dev.dimasik.client.system.Class_rsrLB4fiDOF3z0YM;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.layers.WingsLayer;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WingsLayer.class)
public class WingsLayerMixin {
   @Inject(
      method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/HumanoidRenderState;FF)V",
      at = @At("HEAD"),
      cancellable = true
   )
   private void hideVanillaElytra(PoseStack var1, SubmitNodeCollector var2, int var3, HumanoidRenderState var4, float var5, float var6, CallbackInfo var7) {
      Chams var8 = Chams.m_9787();
      if (var8 != null && var8.m_9799(var4)) {
         var7.cancel();
      } else if (var4 instanceof AvatarRenderState var9) {
         Minecraft var10 = Minecraft.getInstance();
         if (var10.level != null) {
            if (var10.level.getEntity(var9.id) instanceof Player var11) {
               if (Class_rsrLB4fiDOF3z0YM.m_8515(var11, var10)) {
                  var7.cancel();
               }
            }
         }
      }
   }
}
