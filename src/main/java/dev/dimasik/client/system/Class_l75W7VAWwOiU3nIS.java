package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.player.PlayerModel;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.entity.player.Player;

public final class Class_l75W7VAWwOiU3nIS extends RenderLayer<AvatarRenderState, PlayerModel> {
   private static final float f_25168 = 0.01F;
   private static final float f_25169 = 0.01F;
   private static final float f_25170 = 0.01F;
   private static final float f_25171 = 0.01F;
   private static final double f_25172 = -0.5;
   private static final double f_25173 = 0.25;
   private static final float f_25174 = 1.005F;
   private static final float f_25175 = 1.005F;
   private static final float f_25176 = 1.005F;
   private static final double f_25177 = -0.25;

   public Class_l75W7VAWwOiU3nIS(RenderLayerParent<AvatarRenderState, PlayerModel> var1) {
      super(var1);
   }

   public void submit(PoseStack var1, SubmitNodeCollector var2, int var3, AvatarRenderState var4, float var5, float var6) {
      Minecraft var7 = Minecraft.getInstance();
      if (var7.level != null && !var4.isInvisible) {
         if (var7.level.getEntity(var4.id) instanceof Player var8) {
            if (this.shouldRenderFor(var8, var7)) {
               boolean var22 = Class_rsrLB4fiDOF3z0YM.m_8500(var8);
               String var10 = Class_rsrLB4fiDOF3z0YM.m_8501(var8, Class_HSD91zSgdqsM5q0d.HATS);
               String var11 = Class_rsrLB4fiDOF3z0YM.m_8501(var8, Class_HSD91zSgdqsM5q0d.MASKS);
               float var12 = var22 ? (var10 == null ? 0.0F : 1.0F) : Class_rsrLB4fiDOF3z0YM.m_8493();
               float var13 = var22 ? (var11 == null ? 0.0F : 1.0F) : Class_rsrLB4fiDOF3z0YM.m_8509();
               if (!(var12 < f_25168) || !(var13 < f_25169)) {
                  Object var14 = Class_WREU7oMaYdkygWNg.m_5456(((PlayerModel)this.getParentModel()).root());
                  var1.pushPose();

                  try {
                     ((PlayerModel)this.getParentModel()).head.translateAndRotate(var1);
                     if (var13 >= f_25170 && (var22 || !Class_rsrLB4fiDOF3z0YM.m_8473(Class_HSD91zSgdqsM5q0d.MASKS))) {
                        Class_MTimUzoN9N9ZQr5T var15;
                        try {
                           var15 = var11 == null ? Class_rsrLB4fiDOF3z0YM.m_8510() : Class_MTimUzoN9N9ZQr5T.valueOf(var11);
                        } catch (IllegalArgumentException var20) {
                           var15 = null;
                        }

                        if (var15 != null) {
                           var2.submitCustomGeometry(var1, RenderTypes.entityCutout(var15.m_3891()), (var2x, var3x) -> {
                              PoseStack var4x = new PoseStack();
                              var4x.mulPose(var2x.pose());
                              Class_aLEq7ZLFJoDDji0N.m_5907(var4x, var3x, var3, OverlayTexture.NO_OVERLAY, var13);
                           });
                        }
                     }

                     if (var12 >= f_25171 && (var22 || !Class_rsrLB4fiDOF3z0YM.m_8473(Class_HSD91zSgdqsM5q0d.HATS))) {
                        Class_LzYTXb7R2jug6Pep var23 = Class_isejn8Zjfd3YSXMb.m_7324(var10 == null ? Class_rsrLB4fiDOF3z0YM.m_8512() : var10);
                        if (var23 != null) {
                           var1.pushPose();
                           var1.translate(0.0, f_25172, 0.0);
                           var1.translate(0.0, f_25173, 0.0);
                           var1.scale(f_25174, f_25175, f_25176);
                           var1.translate(0.0, f_25177, 0.0);
                           var2.submitCustomGeometry(var1, RenderTypes.entityTranslucent(var23.texture()), (var3x, var4x) -> {
                              PoseStack var5x = new PoseStack();
                              var5x.mulPose(var3x.pose());
                              Class_rlEjoVq6UqFoLGoE.m_8461(var5x, var4x, var23.model(), var3, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, var12);
                           });
                           var1.popPose();
                        }
                     }
                  } finally {
                     var1.popPose();
                     Class_WREU7oMaYdkygWNg.m_5453(var14);
                  }
               }
            }
         }
      }
   }

   private boolean shouldRenderFor(Player var1, Minecraft var2) {
      return Class_rsrLB4fiDOF3z0YM.m_8489(var1, var2);
   }
}
