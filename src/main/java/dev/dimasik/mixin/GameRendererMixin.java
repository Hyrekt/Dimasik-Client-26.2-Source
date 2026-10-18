package dev.dimasik.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.manager.ModuleManager;
import dev.dimasik.client.module.combat.Aura;
import dev.dimasik.client.module.render.Ambience;
import dev.dimasik.client.module.render.BlockOverlay;
import dev.dimasik.client.module.render.FogAtmosphere;
import dev.dimasik.client.module.render.FullBright;
import dev.dimasik.client.module.render.Hands;
import dev.dimasik.client.module.render.Invoker;
import dev.dimasik.client.module.render.MotionBlur;
import dev.dimasik.client.module.render.Rain;
import dev.dimasik.client.module.render.ShaderMist;
import dev.dimasik.client.module.render.ViewModel;
import dev.dimasik.client.system.Class_1x5Fn2q4kmtD2Zmq;
import dev.dimasik.client.system.Class_2UsRDX6cw62X5Rqa;
import dev.dimasik.client.system.Class_81oIJPtsDGdzRKcL;
import dev.dimasik.client.system.Class_FvJXUGWpZo3zYBW4;
import dev.dimasik.client.system.Class_HKVFPtZz5yGHYty6;
import dev.dimasik.client.system.Class_LnUzYZPp5plrnR0o;
import dev.dimasik.client.system.Class_MVSd3mwdK6LBOLSC;
import dev.dimasik.client.system.Class_MudbbdJ9NuNWUNPe;
import dev.dimasik.client.system.Class_NzJrN63M7QBpmAbi;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_X574GcHt0SazS9zo;
import dev.dimasik.client.system.Class_nulhzpfOWV9d1NBW;
import dev.dimasik.client.system.Class_oV1nLcU0paHSE9Oj;
import dev.dimasik.client.system.Class_tjdtKxsAEogQMtun;
import dev.dimasik.client.system.Class_xYKqykPYp6IuC6PX;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.SubmitNodeStorage;
import net.minecraft.client.renderer.feature.FeatureRenderDispatcher;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GameRenderer.class)
public class GameRendererMixin implements Class_LnUzYZPp5plrnR0o {
   @Shadow
   @Final
   private FeatureRenderDispatcher featureRenderDispatcher;
   @Shadow
   @Final
   private SubmitNodeStorage handAndScreenSubmitNodeStorage;
   @Shadow
   @Final
   private Minecraft minecraft;
   @Unique
   private final Matrix4f fogProjection = new Matrix4f();
   @Unique
   private DeltaTracker worldEffectsTickCounter;
   @Unique
   private Class_TZhU50s8XmBQCMP5 worldEffectsEvent;
   private static final double f_36654 = 0.05;

   @Inject(method = "render", at = @At("HEAD"))
   private void hmiDeltaTime(DeltaTracker var1, boolean var2, CallbackInfo var3) {
      Class_X574GcHt0SazS9zo.m_5500();
      if (Class_X574GcHt0SazS9zo.m_5499()) {
         float var4 = (float)GLFW.glfwGetTime();
         Class_tjdtKxsAEogQMtun.f_32100 = var4 - Class_tjdtKxsAEogQMtun.f_32099;
         Class_tjdtKxsAEogQMtun.f_32099 = var4;
         if (Minecraft.getInstance().isPaused()) {
            Class_tjdtKxsAEogQMtun.f_32100 = 0.0F;
         } else {
            Class_tjdtKxsAEogQMtun.f_32100 = (float)Math.min(f_36654, Class_tjdtKxsAEogQMtun.f_32100);
         }
      }
   }

   @Inject(method = "displayItemActivation", at = @At("HEAD"), cancellable = true)
   private void showFloatingItem(ItemStack var1, CallbackInfo var2) {
      if (var1.is(Items.TOTEM_OF_UNDYING) && Class_nulhzpfOWV9d1NBW.m_7706(Class_xYKqykPYp6IuC6PX.QfQnMomAbf3hjvZP.TOTEM)) {
         var2.cancel();
      }
   }

   @Inject(method = "bobHurt", at = @At("HEAD"), cancellable = true)
   private void tiltViewWhenHurt(CameraRenderState var1, PoseStack var2, CallbackInfo var3) {
      if (Class_nulhzpfOWV9d1NBW.m_7706(Class_xYKqykPYp6IuC6PX.QfQnMomAbf3hjvZP.HURT_TIME)) {
         var3.cancel();
      }
   }

   @Inject(method = "extractOptions", at = @At("TAIL"))
   private void dimasik$removeNauseaDistortion(CallbackInfo var1) {
      if (Class_nulhzpfOWV9d1NBW.m_7706(Class_xYKqykPYp6IuC6PX.QfQnMomAbf3hjvZP.BAD_EFFECTS)) {
         this.minecraft.gameRenderer.gameRenderState().optionsRenderState.screenEffectScale = 0.0F;
      }
   }

   @Inject(method = "shouldRenderBlockOutline", at = @At("HEAD"), cancellable = true)
   private void hideVanillaBlockOutline(CallbackInfoReturnable<Boolean> var1) {
      if (BlockOverlay.m_859()) {
         var1.setReturnValue(false);
      }
   }

   @Inject(method = "renderLevel", at = @At("HEAD"))
   private void resetChamsFrameState(DeltaTracker var1, CallbackInfo var2) {
      Class_MudbbdJ9NuNWUNPe.m_3972();
   }

   @Inject(
      method = "renderLevel",
      at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/systems/CommandEncoder;clearDepthTexture(Lcom/mojang/blaze3d/textures/GpuTexture;D)V")
   )
   private void applyMotionBlurBeforeHands(DeltaTracker var1, CallbackInfo var2, @Local(ordinal = 0) Matrix4f var3) {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
         MotionBlur var4 = DimasikClient.m_9057().m_9049().m_2801().m_3526();
         if (var4 != null) {
            var4.m_1354(var3, this.minecraft.gameRenderer.gameRenderState().levelRenderState.cameraRenderState.viewRotationMatrix);
         }
      }
   }

   @Inject(
      method = "renderLevel",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/GameRenderer;renderItemInHand(Lnet/minecraft/client/renderer/state/level/CameraRenderState;FLorg/joml/Matrix4fc;)V",
         shift = Shift.BEFORE
      )
   )
   private void flushBeforeHandsCapture(DeltaTracker var1, CallbackInfo var2) {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
         Hands var3 = DimasikClient.m_9057().m_9049().m_2801().m_3577();
         if (var3 != null && var3.m_8181()) {
            this.featureRenderDispatcher.renderAllFeatures(this.handAndScreenSubmitNodeStorage);
            Class_1x5Fn2q4kmtD2Zmq.m_885().m_884();
         }
      }
   }

   @Inject(
      method = "renderLevel",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/GameRenderer;renderItemInHand(Lnet/minecraft/client/renderer/state/level/CameraRenderState;FLorg/joml/Matrix4fc;)V",
         shift = Shift.AFTER
      )
   )
   private void flushAndCompositeHands(DeltaTracker var1, CallbackInfo var2) {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
         Hands var3 = DimasikClient.m_9057().m_9049().m_2801().m_3577();
         ViewModel var4 = DimasikClient.m_9057().m_9049().m_2801().m_3546();
         boolean var5 = var4 != null && ViewModel.f_7981;
         boolean var6 = var3 != null && Hands.f_28498;
         if (var5 || var6) {
            this.featureRenderDispatcher.renderAllFeatures(this.handAndScreenSubmitNodeStorage);
            Class_1x5Fn2q4kmtD2Zmq.m_885().m_884();
            if (var5) {
               var4.m_2860();
            } else {
               var3.m_8130();
            }
         }
      }
   }

   @Inject(
      method = "renderLevel",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/GameRenderer;renderItemInHand(Lnet/minecraft/client/renderer/state/level/CameraRenderState;FLorg/joml/Matrix4fc;)V"
      )
   )
   private void compositeTargetEspCube(DeltaTracker var1, CallbackInfo var2) {
      if (Class_oV1nLcU0paHSE9Oj.m_7940()) {
         this.featureRenderDispatcher.renderAllFeatures(this.handAndScreenSubmitNodeStorage);
         Class_1x5Fn2q4kmtD2Zmq.m_885().m_884();
         Class_oV1nLcU0paHSE9Oj.m_7876();
      }
   }

   @Inject(
      method = "renderLevel",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/LevelRenderer;render(Lcom/mojang/blaze3d/resource/GraphicsResourceAllocator;Lnet/minecraft/client/DeltaTracker;ZLnet/minecraft/client/renderer/state/level/CameraRenderState;Lorg/joml/Matrix4fc;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Vector4f;Z)V"
      )
   )
   private void hook(DeltaTracker var1, CallbackInfo var2, @Local(ordinal = 0) Matrix4f var3) {
      Matrix4f var4 = new Matrix4f(this.minecraft.gameRenderer.gameRenderState().levelRenderState.cameraRenderState.viewRotationMatrix);
      this.fogProjection.set(var3);
      this.worldEffectsTickCounter = var1;
      this.worldEffectsEvent = null;
      Class_FvJXUGWpZo3zYBW4.m_2695(var4, var3);
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
         FullBright var5 = DimasikClient.m_9057().m_9049().m_2801().m_3439();
         if (var5 != null && var5.m_776()) {
            var5.m_5869(var1.getGameTimeDeltaPartialTick(false));
         }
      }
   }

   @Inject(
      method = "renderLevel",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/LevelRenderer;render(Lcom/mojang/blaze3d/resource/GraphicsResourceAllocator;Lnet/minecraft/client/DeltaTracker;ZLnet/minecraft/client/renderer/state/level/CameraRenderState;Lorg/joml/Matrix4fc;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Vector4f;Z)V",
         shift = Shift.AFTER
      )
   )
   private void renderWorldEffectsFallback(DeltaTracker var1, CallbackInfo var2) {
      this.dimasik$renderWorldEffects();
      this.renderSceneEffects();
   }

   @Unique
   private void renderSceneEffects() {
      Class_TZhU50s8XmBQCMP5 var1 = this.worldEffectsEvent;
      this.worldEffectsEvent = null;
      if (var1 != null) {
         if (DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
            ModuleManager var2 = DimasikClient.m_9057().m_9049().m_2801();
            FogAtmosphere var3 = var2.m_3464();
            if (var3 != null) {
               var3.m_8664(var1.m_5009(), var1.m_5007(), var1.m_5005());
            }

            Ambience var4 = var2.m_3511();
            if (var4 != null) {
               var4.m_3099(var1.m_5009(), var1.m_5007(), var1.m_5005());
            }
         }

         DimasikClient.m_9057().m_9051().m_9708(new Class_2UsRDX6cw62X5Rqa(var1));
         Class_1x5Fn2q4kmtD2Zmq.m_885().m_884();
      }
   }

   @Override
   public void dimasik$renderWorldEffects() {
      if (this.worldEffectsTickCounter != null && !Rain.m_6679()) {
         DeltaTracker var1 = this.worldEffectsTickCounter;
         this.worldEffectsTickCounter = null;
         Matrix4f var2 = new Matrix4f(this.fogProjection);
         if (!Class_HKVFPtZz5yGHYty6.m_2883()) {
            Matrix4f var3 = new Matrix4f(this.minecraft.gameRenderer.gameRenderState().levelRenderState.cameraRenderState.viewRotationMatrix);
            if (DimasikClient.m_9057() != null) {
               Class_MudbbdJ9NuNWUNPe.m_3980();
               if (DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
                  Ambience var4 = DimasikClient.m_9057().m_9049().m_2801().m_3511();
                  if (var4 != null) {
                     var4.m_3035(var2, var3, var1);
                  }

                  ShaderMist var5 = DimasikClient.m_9057().m_9049().m_2801().m_3450();
                  if (var5 != null) {
                     var5.m_6120(var2, var3, var1);
                  }

                  if (var4 != null) {
                     var4.m_3109(var2, var3, RenderSystem.getShaderFog());
                     var4.m_3075(var2, var3);
                  }
               }

               Class_oV1nLcU0paHSE9Oj.m_7901();
               Aura var10 = null;
               if (DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
                  var10 = DimasikClient.m_9057().m_9049().m_2801().m_3576();
               }

               PoseStack var11 = new PoseStack();
               var11.mulPose(new Matrix4f(var3));
               Class_1x5Fn2q4kmtD2Zmq.EGrtL3OkTEhswyKz var6 = Class_1x5Fn2q4kmtD2Zmq.m_885();
               Vec3 var7 = Class_NzJrN63M7QBpmAbi.f_11537.gameRenderer.mainCamera().position();
               float var8 = var1.getGameTimeDeltaPartialTick(false);
               Class_MudbbdJ9NuNWUNPe.m_3984();
               Class_TZhU50s8XmBQCMP5 var9 = new Class_TZhU50s8XmBQCMP5(var1, var11, var6, var7, var8, new Matrix4f(var2), new Matrix4f(var3));
               this.worldEffectsEvent = var9;
               DimasikClient.m_9057().m_9051().m_9708(var9);
               var6.m_882(RenderTypes.lines());
               var6.m_882(Class_81oIJPtsDGdzRKcL.f_3816);
               var6.m_882(Class_81oIJPtsDGdzRKcL.f_3818);
               var6.m_882(Invoker.f_25672);
               var6.m_882(Invoker.f_25674);
               if (var10 != null && !var10.m_776()) {
                  Class_oV1nLcU0paHSE9Oj.m_7925(var9);
               }
            }
         }
      }
   }

   @Inject(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/LevelRenderer;doEntityOutline()V", shift = Shift.AFTER))
   private void renderTargetEspAboveEntityEsp(DeltaTracker var1, boolean var2, CallbackInfo var3) {
      Class_oV1nLcU0paHSE9Oj.m_7857();
   }

   @Inject(method = "render", at = @At("RETURN"))
   private void endRenderResources(DeltaTracker var1, boolean var2, CallbackInfo var3) {
      Class_MVSd3mwdK6LBOLSC.m_3893();
   }

   @Inject(method = "mainRenderTarget", at = @At("RETURN"), cancellable = true)
   private void routeHandsFramebuffer(CallbackInfoReturnable<RenderTarget> var1) {
      if (Rain.m_6679() && Rain.m_6653() != null) {
         var1.setReturnValue(Rain.m_6653());
      } else if (ViewModel.f_7981 && ViewModel.f_7982 != null) {
         var1.setReturnValue(ViewModel.f_7982);
      } else if (Hands.f_28498 && Hands.f_28499 != null) {
         var1.setReturnValue(Hands.f_28499);
      }
   }

   @WrapOperation(
      method = "extract",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/Gui;extractRenderState(Lnet/minecraft/client/DeltaTracker;ZZ)V")
   )
   private void dimasik$deferGui(Gui var1, DeltaTracker var2, boolean var3, boolean var4, Operation<Void> var5) {
      this.minecraft.gameRenderer.gameRenderState().guiRenderState.isHudHidden = var1.hud.isHidden();
   }

   @Inject(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/render/GuiRenderer;render()V"))
   private void dimasik$extractGuiBeforeDrawing(DeltaTracker var1, boolean var2, CallbackInfo var3) {
      boolean var4 = this.minecraft.isGameLoadFinished();
      this.minecraft.gui.extractRenderState(var1, var4 && var2 && this.minecraft.level != null, var4);
   }
}
