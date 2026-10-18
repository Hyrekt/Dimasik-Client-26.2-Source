package dev.dimasik.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.QuadInstance;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack.Pose;
import dev.dimasik.client.system.Class_4jILs03bXRDH6BlD;
import dev.dimasik.client.system.Class_DNgAQHvIOjv6AdJX;
import dev.dimasik.client.system.Class_LRsxqvEkEcBPGPUf;
import dev.dimasik.client.system.Class_OadJxIIiAHkVgpNi;
import dev.dimasik.client.system.Class_X574GcHt0SazS9zo;
import dev.dimasik.client.system.Class_kmb9eogH8we2lnWk;
import dev.dimasik.client.system.Class_uxCxe8d1qdBSkRXf;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.feature.FeatureFrameContext;
import net.minecraft.client.renderer.feature.ItemFeatureRenderer;
import net.minecraft.client.renderer.feature.ItemFeatureRenderer.Submit;
import net.minecraft.client.resources.model.geometry.BakedQuad;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemFeatureRenderer.class)
public class ItemFeatureRendererMixin {
   @Unique
   private final Map<Submit, Map<BakedQuad, Pose>> dimasik$poses = new IdentityHashMap<>();

   @WrapOperation(
      method = {"prepareMainSubmit", "prepareOutlineSubmit", "prepareFoilSubmit"},
      at = @At(
         value = "INVOKE",
         target = "Lcom/mojang/blaze3d/vertex/VertexConsumer;putBakedQuad(Lcom/mojang/blaze3d/vertex/PoseStack$Pose;Lnet/minecraft/client/resources/model/geometry/BakedQuad;Lcom/mojang/blaze3d/vertex/QuadInstance;)V"
      )
   )
   private void dimasik$animateQuad(VertexConsumer var1, Pose var2, BakedQuad var3, QuadInstance var4, Operation<Void> var5, Submit var6) {
      if (!Class_X574GcHt0SazS9zo.m_5499()) {
         var5.call(new Object[]{var1, var2, var3, var4});
      } else {
         Map var7 = this.dimasik$poses.computeIfAbsent(var6, this::dimasik$preparePoses);
         var5.call(new Object[]{var1, var7.getOrDefault(var3, var2), var3, var4});
      }
   }

   @Unique
   private Map<BakedQuad, Pose> dimasik$preparePoses(Submit var1) {
      Minecraft var2 = Minecraft.getInstance();
      ItemDisplayContext var3 = var1.displayContext();
      if (var2.player != null
         && var2.options.getCameraType().isFirstPerson()
         && (var3 == ItemDisplayContext.THIRD_PERSON_LEFT_HAND || var3 == ItemDisplayContext.THIRD_PERSON_RIGHT_HAND)) {
         Class_OadJxIIiAHkVgpNi var4 = Class_DNgAQHvIOjv6AdJX.m_2450();
         ItemStack var5 = Class_kmb9eogH8we2lnWk.m_7473();
         Class_uxCxe8d1qdBSkRXf.f_33275.m_1366(var4, var5, var2.player, Class_LRsxqvEkEcBPGPUf.f_10586);

         for (Class_4jILs03bXRDH6BlD var7 : Class_uxCxe8d1qdBSkRXf.f_33271) {
            var7.m_1366(var4, var5, var2.player, Class_LRsxqvEkEcBPGPUf.f_10586);
         }
      }

      IdentityHashMap var8 = new IdentityHashMap();
      PoseStack var9 = new PoseStack();
      var9.last().set(var1.pose());

      for (int var10 = 0; var10 < var1.quads().size(); var10++) {
         var9.pushPose();
         Class_LRsxqvEkEcBPGPUf.f_10586.m_3617(var10, var9);
         var8.put((BakedQuad)var1.quads().get(var10), var9.last().copy());
         var9.popPose();
      }

      return var8;
   }

   @Inject(method = "buildGroup", at = @At("TAIL"))
   private void dimasik$finishAnimations(FeatureFrameContext var1, List<Submit> var2, CallbackInfo var3) {
      this.dimasik$poses.clear();
      Class_LRsxqvEkEcBPGPUf.f_10586.m_3612();
   }
}
