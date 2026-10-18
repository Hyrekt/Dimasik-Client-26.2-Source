package dev.dimasik.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.render.CustomCrystal;
import net.minecraft.client.model.object.crystal.EndCrystalModel;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EndCrystalRenderer;
import net.minecraft.client.renderer.entity.state.EndCrystalRenderState;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EndCrystalRenderer.class)
public class EndCrystalRendererMixin_2 {
   @Unique
   private boolean dimasik$cubeVisible;
   @Unique
   private boolean dimasik$baseVisible;
   @Unique
   private float dimasik$outerGlassPivotY;
   @Unique
   private boolean dimasik$prepared;

   @Inject(
      method = "submit(Lnet/minecraft/client/renderer/entity/state/EndCrystalRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V",
      at = @At("HEAD")
   )
   private void prepareCustomCrystal(EndCrystalRenderState var1, PoseStack var2, SubmitNodeCollector var3, CameraRenderState var4, CallbackInfo var5) {
      CustomCrystal var6 = getModule();
      if (var6 != null) {
         EndCrystalModel var7 = ((EndCrystalRendererMixin)this).dimasik$getModel();
         this.dimasik$cubeVisible = var7.cube.visible;
         this.dimasik$baseVisible = var7.base.visible;
         this.dimasik$outerGlassPivotY = var7.outerGlass.y;
         var6.m_1195(var7);
         var6.m_1193(var2);
         this.dimasik$prepared = true;
      }
   }

   @Inject(
      method = "submit(Lnet/minecraft/client/renderer/entity/state/EndCrystalRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V",
      at = @At("RETURN")
   )
   private void restoreCustomCrystal(EndCrystalRenderState var1, PoseStack var2, SubmitNodeCollector var3, CameraRenderState var4, CallbackInfo var5) {
      if (this.dimasik$prepared) {
         CustomCrystal var6 = getModule();
         if (var6 == null) {
            this.dimasik$prepared = false;
         } else {
            EndCrystalModel var7 = ((EndCrystalRendererMixin)this).dimasik$getModel();
            var6.m_1196(var7, this.dimasik$cubeVisible, this.dimasik$baseVisible, this.dimasik$outerGlassPivotY);
            this.dimasik$prepared = false;
         }
      }
   }

   private static CustomCrystal getModule() {
      if (DimasikClient.m_9057() != null && DimasikClient.m_9057().m_9049() != null && DimasikClient.m_9057().m_9049().m_2801() != null) {
         CustomCrystal var0 = DimasikClient.m_9057().m_9049().m_2801().m_3521();
         return var0 != null && var0.m_776() ? var0 : null;
      } else {
         return null;
      }
   }
}
