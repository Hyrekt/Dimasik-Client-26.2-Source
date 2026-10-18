package dev.dimasik.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.mojang.blaze3d.GpuFormat;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.pipeline.TextureTarget;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.textures.GpuTexture;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.Optimization;
import dev.dimasik.client.module.render.CustomCrystal;
import dev.dimasik.client.module.render.EntityESP;
import dev.dimasik.client.module.render.ImpactNova;
import dev.dimasik.client.system.Class_JYI3tOXLKmfxbnee;
import dev.dimasik.client.system.Class_LnUzYZPp5plrnR0o;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.PostChain;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LevelRenderer.class)
public class LevelRendererMixin {
   @Shadow
   private RenderTarget entityOutlineTarget;
   @Unique
   private TextureTarget gizmoDepthBackup;
   @Unique
   private boolean restoreGizmoDepth;
   private static final String f_36616 = "dimasik-gizmo-depth";

   @ModifyArg(
      method = "invalidateCompiledGeometry",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/ViewArea;<init>(Lnet/minecraft/client/renderer/chunk/SectionRenderDispatcher;IIIIILnet/minecraft/client/renderer/SectionOcclusionGraph;)V"
      ),
      index = 5,
      require = 0
   )
   private int capBuiltChunkStorageDistance(int var1) {
      return Optimization.m_5845(var1);
   }

   @Inject(method = "addCloudsPass", at = @At("HEAD"), cancellable = true, require = 0)
   private void skipClouds(CallbackInfo var1) {
      if (Optimization.m_5841()) {
         var1.cancel();
      }
   }

   @Inject(
      method = "lambda$addMainPass$0",
      at = @At(
         value = "FIELD",
         target = "Lnet/minecraft/client/renderer/chunk/ChunkSectionLayerGroup;TRANSLUCENT:Lnet/minecraft/client/renderer/chunk/ChunkSectionLayerGroup;"
      )
   )
   private void renderWorldEffectsBeforeWater(CallbackInfo var1) {
      ((Class_LnUzYZPp5plrnR0o)Minecraft.getInstance().gameRenderer).dimasik$renderWorldEffects();
   }

   @ModifyExpressionValue(
      method = "render",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/ShaderManager;getPostChain(Lnet/minecraft/resources/Identifier;Ljava/util/Set;)Lnet/minecraft/client/renderer/PostChain;"
      )
   )
   private PostChain keepRawEntityEspMask(PostChain var1) {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
         EntityESP var2 = DimasikClient.m_9057().m_9049().m_2801().m_3436();
         Class_JYI3tOXLKmfxbnee var3 = var2 != null ? var2.m_4055() : null;
         ImpactNova var4 = DimasikClient.m_9057().m_9049().m_2801().m_3500();
         CustomCrystal var5 = DimasikClient.m_9057().m_9049().m_2801().m_3521();
         boolean var6 = var2 != null && var2.m_776() && var3 != null && var3.m_3330();
         boolean var7 = var4 != null && var4.m_5952();
         boolean var8 = var5 != null && var5.m_776();
         return !var6 && !var7 && !var8 ? var1 : null;
      } else {
         return var1;
      }
   }

   @Inject(method = "doEntityOutline", at = @At("HEAD"), cancellable = true)
   private void drawEntityEspEffects(CallbackInfo var1) {
      if (DimasikClient.m_9057() != null
         && DimasikClient.m_9057().m_9049() != null
         && DimasikClient.m_9057().m_9049().m_2801() != null
         && this.entityOutlineTarget != null) {
         EntityESP var2 = DimasikClient.m_9057().m_9049().m_2801().m_3436();
         Class_JYI3tOXLKmfxbnee var3 = var2 != null ? var2.m_4055() : null;
         ImpactNova var4 = DimasikClient.m_9057().m_9049().m_2801().m_3500();
         CustomCrystal var5 = DimasikClient.m_9057().m_9049().m_2801().m_3521();
         boolean var6 = var2 != null && var2.m_776() && var3 != null && var3.m_3330();
         boolean var7 = var6 && var3.m_3312();
         boolean var8 = var4 != null && var4.m_5952();
         boolean var9 = var5 != null && var5.m_776() && var5.m_1194();
         if (var7 || var8 || var9) {
            RenderTarget var10 = Minecraft.getInstance().gameRenderer.mainRenderTarget();
            if (var10 != null && var10.getColorTextureView() != null && this.entityOutlineTarget.getColorTextureView() != null) {
               var1.cancel();
               if (var7) {
                  var3.m_3298(this.entityOutlineTarget, var10);
               }

               if (var8) {
                  var4.m_5955(this.entityOutlineTarget, var10);
               }

               if (var9) {
                  var5.m_1192(this.entityOutlineTarget, var10);
               }
            }
         }
      }
   }

   @WrapOperation(
      method = "lambda$addAlwaysOnTopPass$0",
      at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/systems/CommandEncoder;clearDepthTexture(Lcom/mojang/blaze3d/textures/GpuTexture;D)V")
   )
   private void saveWorldDepthBeforeGizmoClear(CommandEncoder var1, GpuTexture var2, double var3, Operation<Void> var5) {
      RenderTarget var6 = Minecraft.getInstance().gameRenderer.mainRenderTarget();
      if (var6 != null && var6.getDepthTexture() == var2 && !var2.isClosed()) {
         this.ensureGizmoDepthBackup(var6);
         if (this.gizmoDepthBackup != null && this.gizmoDepthBackup.getDepthTexture() != null && !this.gizmoDepthBackup.getDepthTexture().isClosed()) {
            this.gizmoDepthBackup.copyDepthFrom(var6);
            this.restoreGizmoDepth = true;
         }
      }

      var5.call(new Object[]{var1, var2, var3});
   }

   @Inject(method = "lambda$addAlwaysOnTopPass$0", at = @At("RETURN"))
   private void restoreWorldDepthAfterGizmos(CallbackInfo var1) {
      if (this.restoreGizmoDepth && this.gizmoDepthBackup != null) {
         this.restoreGizmoDepth = false;
         RenderTarget var2 = Minecraft.getInstance().gameRenderer.mainRenderTarget();
         if (var2 != null && var2.getDepthTexture() != null && !var2.getDepthTexture().isClosed()) {
            var2.copyDepthFrom(this.gizmoDepthBackup);
         }
      }
   }

   @Inject(method = "close", at = @At("HEAD"))
   private void releaseGizmoDepthBackup(CallbackInfo var1) {
      this.restoreGizmoDepth = false;
      if (this.gizmoDepthBackup != null) {
         this.gizmoDepthBackup.destroyBuffers();
         this.gizmoDepthBackup = null;
      }
   }

   @Unique
   private void ensureGizmoDepthBackup(RenderTarget var1) {
      int var2 = Math.max(1, var1.width);
      int var3 = Math.max(1, var1.height);
      if (this.gizmoDepthBackup == null) {
         this.gizmoDepthBackup = new TextureTarget(f_36616, var2, var3, true, GpuFormat.RGBA8_UNORM);
      } else {
         if (this.gizmoDepthBackup.width != var2 || this.gizmoDepthBackup.height != var3) {
            this.gizmoDepthBackup.resize(var2, var3);
         }
      }
   }
}
