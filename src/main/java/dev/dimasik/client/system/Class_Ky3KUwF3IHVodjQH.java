package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.player.PlayerModel;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.entity.player.Player;

public final class Class_Ky3KUwF3IHVodjQH extends RenderLayer<AvatarRenderState, PlayerModel> {
   private static final float f_10274 = 0.01F;
   private static final double f_10275 = 0.18;
   private static final float f_10276 = 180.0F;
   private static final float f_10277 = 0.8F;
   private static final float f_10278 = 0.8F;
   private static final float f_10279 = 0.8F;

   private boolean visibleFor(Player var1, Minecraft var2) {
      return Class_rsrLB4fiDOF3z0YM.m_8489(var1, var2);
   }

   public void submit(PoseStack var1, SubmitNodeCollector var2, int var3, AvatarRenderState var4, float var5, float var6) {
      Minecraft var7 = Minecraft.getInstance();
      if (var7.level != null && !var4.isInvisible && var7.level.getEntity(var4.id) instanceof Player var8 && this.visibleFor(var8, var7)) {
         String var18 = Class_rsrLB4fiDOF3z0YM.m_8501(var8, Class_HSD91zSgdqsM5q0d.BACKPACKS);
         if ((!Class_rsrLB4fiDOF3z0YM.m_8500(var8) || var18 != null) && (var18 != null || !Class_rsrLB4fiDOF3z0YM.m_8473(Class_HSD91zSgdqsM5q0d.BACKPACKS))) {
            float var10 = var18 == null ? Class_rsrLB4fiDOF3z0YM.m_8491() : 1.0F;
            if (!(var10 < f_10274)) {
               Class_LdeJaBYCxAYq5SO6 var11;
               try {
                  var11 = var18 == null ? Class_rsrLB4fiDOF3z0YM.m_8518() : Class_LdeJaBYCxAYq5SO6.valueOf(var18);
               } catch (IllegalArgumentException var17) {
                  return;
               }

               Object var12 = Class_WREU7oMaYdkygWNg.m_5456(((PlayerModel)this.getParentModel()).root());
               var1.pushPose();

               try {
                  ((PlayerModel)this.getParentModel()).body.translateAndRotate(var1);
                  Class_GGEo7U6LC2t9Tb5z.m_2750(var4, var1);
                  var1.translate(0.0, 0.0, f_10275);
                  var1.mulPose(Axis.YP.rotationDegrees(f_10276));
                  var1.scale(f_10277, f_10278, f_10279);
                  var2.submitCustomGeometry(var1, RenderTypes.entityTranslucent(Class_x4to6Nwlvbuq8fWW.f_34714), (var3x, var4x) -> {
                     PoseStack var5x = new PoseStack();
                     var5x.mulPose(var3x.pose());
                     Class_x4to6Nwlvbuq8fWW.m_9447(var5x, var4x, var3, OverlayTexture.NO_OVERLAY, var11, var10);
                  });
                  var2.submitCustomGeometry(var1, RenderTypes.entityTranslucent(Class_x4to6Nwlvbuq8fWW.f_34715), (var2x, var3x) -> {
                     PoseStack var4x = new PoseStack();
                     var4x.mulPose(var2x.pose());
                     Class_x4to6Nwlvbuq8fWW.m_9451(var4x, var3x, var3, OverlayTexture.NO_OVERLAY, var10);
                  });
               } finally {
                  var1.popPose();
                  Class_WREU7oMaYdkygWNg.m_5453(var12);
               }
            }
         }
      }
   }

   public Class_Ky3KUwF3IHVodjQH(RenderLayerParent<AvatarRenderState, PlayerModel> var1) {
      super(var1);
   }
}
