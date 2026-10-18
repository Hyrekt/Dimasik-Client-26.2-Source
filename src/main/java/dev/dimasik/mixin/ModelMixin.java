package dev.dimasik.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import dev.dimasik.client.system.Class_WREU7oMaYdkygWNg;
import net.minecraft.client.model.Model;
import net.minecraft.client.model.geom.ModelPart;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(Model.class)
public class ModelMixin {
   @WrapOperation(
      method = "renderToBuffer(Lcom/mojang/blaze3d/vertex/PoseStack;Lcom/mojang/blaze3d/vertex/VertexConsumer;III)V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/model/geom/ModelPart;render(Lcom/mojang/blaze3d/vertex/PoseStack;Lcom/mojang/blaze3d/vertex/VertexConsumer;III)V"
      )
   )
   private void renderEmoteModel(ModelPart var1, PoseStack var2, VertexConsumer var3, int var4, int var5, int var6, Operation<Void> var7) {
      Object var8 = Class_WREU7oMaYdkygWNg.m_5456(var1);

      try {
         var7.call(new Object[]{var1, var2, var3, var4, var5, var6});
      } finally {
         Class_WREU7oMaYdkygWNg.m_5453(var8);
      }
   }
}
