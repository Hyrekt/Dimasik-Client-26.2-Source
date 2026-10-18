package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.player.PlayerModel;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;

public final class Class_vf016r24hrMO4mCD extends RenderLayer<AvatarRenderState, PlayerModel> {
   private final Map<UUID, Class_0GNQ2O7BnLIv8NZJ> f_34157 = new HashMap<>();
   private static final float f_34158 = 0.01F;
   private static final double f_34159 = -0.0625;
   private static final double f_34160 = 0.0625;

   public void submit(PoseStack var1, SubmitNodeCollector var2, int var3, AvatarRenderState var4, float var5, float var6) {
      Minecraft var7 = Minecraft.getInstance();
      if (var7.level != null) {
         if (var7.level.getEntity(var4.id) instanceof Player var8) {
            String var24 = Class_rsrLB4fiDOF3z0YM.m_8501(var8, Class_HSD91zSgdqsM5q0d.WINGS);
            if (!Class_rsrLB4fiDOF3z0YM.m_8500(var8) || var24 != null) {
               if (var24 != null || !Class_rsrLB4fiDOF3z0YM.m_8473(Class_HSD91zSgdqsM5q0d.WINGS)) {
                  float var10 = var24 == null ? Class_rsrLB4fiDOF3z0YM.m_8490() : 1.0F;
                  if (!(var10 < f_34158) && Class_rsrLB4fiDOF3z0YM.m_8515(var8, var7)) {
                     Class_s5qEamGcEs25C3d8 var11;
                     try {
                        var11 = var24 == null ? Class_rsrLB4fiDOF3z0YM.m_8484().m_5498() : Class_WzvV6cpDDR1F4aeD.valueOf(var24).m_5498();
                     } catch (IllegalArgumentException var22) {
                        return;
                     }

                     Class_0GNQ2O7BnLIv8NZJ var12 = this.f_34157.computeIfAbsent(var8.getUUID(), var1x -> new Class_0GNQ2O7BnLIv8NZJ(var11));
                     if (var12.m_685() != var11) {
                        var12 = new Class_0GNQ2O7BnLIv8NZJ(var11);
                        this.f_34157.put(var8.getUUID(), var12);
                     }

                     var12.m_686(var8);
                     Object var13 = Class_WREU7oMaYdkygWNg.m_5456(((PlayerModel)this.getParentModel()).root());
                     var1.pushPose();

                     try {
                        var1.translate(0.0, f_34159, var8.getItemBySlot(EquipmentSlot.CHEST).isEmpty() ? 0.0 : f_34160);
                        ((PlayerModel)this.getParentModel()).body.translateAndRotate(var1);
                        Class_GGEo7U6LC2t9Tb5z.m_2750(var4, var1);
                        Class_0GNQ2O7BnLIv8NZJ var14 = var12;
                        float var15 = var10;
                        float var16 = Minecraft.getInstance().getDeltaTracker().getGameTimeDeltaPartialTick(false);
                        boolean var17 = var4.outlineColor != 0;
                        boolean var18 = var4.isInvisible;
                        if (!var18) {
                           var2.submitCustomGeometry(var1, RenderTypes.entityCutout(var11.m_8628()), (var5x, var6x) -> {
                              PoseStack var7x = new PoseStack();
                              var7x.mulPose(var5x.pose());
                              var11.m_8630().m_2482(var14.m_684(), var16, var7x, var6x, var3, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, var15);
                           });
                        }

                        if (var17) {
                           Class_A8m8kXn9Wd0osexh.m_2079(var1.last(), var11, var14.m_684(), var16, var4.outlineColor);
                        }
                     } finally {
                        var1.popPose();
                        Class_WREU7oMaYdkygWNg.m_5453(var13);
                     }
                  }
               }
            }
         }
      }
   }

   public Class_vf016r24hrMO4mCD(RenderLayerParent<AvatarRenderState, PlayerModel> var1) {
      super(var1);
   }
}
