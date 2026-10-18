package dev.dimasik.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.PoseStack.Pose;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.render.AntiAim;
import dev.dimasik.client.module.render.Chams;
import dev.dimasik.client.module.render.GhostHit;
import dev.dimasik.client.system.Class_81oIJPtsDGdzRKcL;
import dev.dimasik.client.system.Class_MudbbdJ9NuNWUNPe;
import dev.dimasik.client.system.Class_binHXWny7kagd8ju;
import dev.dimasik.client.system.Class_nulhzpfOWV9d1NBW;
import dev.dimasik.client.system.Class_xYKqykPYp6IuC6PX;
import net.minecraft.client.model.Model;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer.CrumblingOverlay;
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntityRenderer.class)
public class LivingEntityRendererMixin {
   @Unique
   private float prev = 0.0F;

   @ModifyExpressionValue(
      method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/LivingEntity;getXRot(F)F")
   )
   private float getLerpedPitchHook(float var1, @Local(ordinal = 0, argsOnly = true) LivingEntity var2, @Local(ordinal = 0, argsOnly = true) float var3) {
      return var2 instanceof LocalPlayer var4
         ? Mth.lerp(var3, DimasikClient.m_9057().m_9052().m_6340().m_1751().y, DimasikClient.m_9057().m_9052().m_6340().m_1751().x)
         : var1;
   }

   @Inject(
      method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V",
      at = @At("RETURN")
   )
   private void applyVisualAntiAim(LivingEntity var1, LivingEntityRenderState var2, float var3, CallbackInfo var4) {
      AntiAim.m_8226(var1, var2);
      Class_binHXWny7kagd8ju.m_6118(var1, var2);
   }

   @ModifyConstant(
      method = "submit(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V",
      constant = @Constant(intValue = 654311423)
   )
   private int changeGhostHitGhostColor(int var1) {
      return GhostHit.m_9191(var1);
   }

   @ModifyExpressionValue(
      method = "submit(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/entity/LivingEntityRenderer;getRenderType(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;ZZZ)Lnet/minecraft/client/renderer/rendertype/RenderType;"
      )
   )
   private RenderType useCleanGhostLayer(RenderType var1, @Local(ordinal = 0, argsOnly = true) LivingEntityRenderState var2) {
      if (var2 instanceof AvatarRenderState var3 && GhostHit.m_9179(var3)) {
         return GhostHit.m_9177(var3.skin.body().texturePath());
      } else {
         Chams var4 = Chams.m_9787();
         if (var4 != null && var4.m_9800(var2)) {
            return var1 != null ? var1 : Class_81oIJPtsDGdzRKcL.f_3818;
         } else {
            return var1;
         }
      }
   }

   @WrapOperation(
      method = "submit(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/SubmitNodeCollector;submitModel(Lnet/minecraft/client/model/Model;Ljava/lang/Object;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/rendertype/RenderType;IIILnet/minecraft/client/renderer/texture/TextureAtlasSprite;ILnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V"
      )
   )
   private void submitPrismaticChams(
      SubmitNodeCollector var1,
      Model var2,
      Object var3,
      PoseStack var4,
      RenderType var5,
      int var6,
      int var7,
      int var8,
      TextureAtlasSprite var9,
      int var10,
      CrumblingOverlay var11,
      Operation<Void> var12
   ) {
      if (var3 instanceof LivingEntityRenderState var13) {
         Class_binHXWny7kagd8ju.m_6095(var13, var2);
      }

      if (this.submitChams(var2, var3, var4, var6, var7, var8)) {
         if (var3 instanceof LivingEntityRenderState var15) {
            Class_binHXWny7kagd8ju.m_6103(var15, var2);
         }
      } else {
         var12.call(new Object[]{var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11});
         if (var3 instanceof LivingEntityRenderState var14) {
            Class_binHXWny7kagd8ju.m_6103(var14, var2);
         }
      }
   }

   @Unique
   private boolean submitChams(Model var1, Object var2, PoseStack var3, int var4, int var5, int var6) {
      if (var2 instanceof LivingEntityRenderState var7) {
         if (var7 instanceof AvatarRenderState var8 && GhostHit.m_9179(var8)) {
            return false;
         } else {
            Chams var11 = Chams.m_9787();
            if (var11 != null && var11.m_9800(var7)) {
               Pose var9 = var3.last().copy();
               if (var11.m_9785()) {
                  Class_MudbbdJ9NuNWUNPe.m_3978(var1, var7, var9, var4, var5, var6, 2.0F);
                  return true;
               } else {
                  float var10 = var11.m_9788() ? 0.0F : 1.0F;
                  Class_MudbbdJ9NuNWUNPe.m_3978(var1, var7, var9, var4, var5, var6, var10);
                  return true;
               }
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   @ModifyReturnValue(method = "shouldRenderLayers(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Z", at = @At("RETURN"))
   private boolean hideChamsFeatures(boolean var1, LivingEntityRenderState var2) {
      if (!var1) {
         return false;
      }

      Chams var3 = Chams.m_9787();
      return var3 == null || !var3.m_9799(var2);
   }

   @ModifyReturnValue(method = "getShadowRadius(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;)F", at = @At("RETURN"))
   private float removeShadow(float var1, EntityRenderState var2) {
      if (Class_nulhzpfOWV9d1NBW.m_7706(Class_xYKqykPYp6IuC6PX.QfQnMomAbf3hjvZP.SHADOWS)) {
         return 0.0F;
      }

      if (var2 instanceof LivingEntityRenderState var3) {
         Chams var4 = Chams.m_9787();
         if (var4 != null && var4.m_9791(var3)) {
            return 0.0F;
         }
      }

      return var1;
   }
}
