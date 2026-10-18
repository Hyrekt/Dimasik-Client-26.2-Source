package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.player.PlayerModel;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.state.AvatarRenderState;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.player.Player;

public final class Class_qH48rpj3mSM0fCe0 extends RenderLayer<AvatarRenderState, PlayerModel> {
   private static final float f_29857 = 0.625F;
   private static final float f_29858 = 0.75F;
   private static final float f_29859 = 0.01F;
   private static final float f_29860 = 0.625F;
   private static final float f_29861 = 0.625F;
   private static final float f_29862 = 0.75F;
   private static final float f_29863 = 0.75F;
   private static final float f_29864 = 0.625F;
   private static final float f_29865 = 0.625F;
   private static final float f_29866 = 0.75F;
   private static final float f_29867 = 0.75F;
   private static final float f_29868 = -90.0F;
   private static final float f_29869 = 180.0F;
   private static final float f_29870 = 0.5F;
   private static final float f_29871 = 0.51F;
   private static final float f_29872 = 0.5F;
   private static final long f_29873 = 60000000000L;
   private static final float f_29874 = 1.0E9F;

   public Class_qH48rpj3mSM0fCe0(RenderLayerParent<AvatarRenderState, PlayerModel> var1) {
      super(var1);
   }

   private boolean visibleFor(Player var1, Minecraft var2) {
      return Class_rsrLB4fiDOF3z0YM.m_8489(var1, var2);
   }

   private void render(Class_CaVoGy5a20MKv97j var1, AvatarRenderState var2, PoseStack var3, SubmitNodeCollector var4, int var5, float var6) {
      PlayerModel var7 = (PlayerModel)this.getParentModel();
      switch (var1.attach()) {
         case HEAD:
            this.renderOn(var7.head, var1, var2, var3, var4, var5, var6, false, 0.0F, false);
            break;
         case BODY:
            this.renderOn(var7.body, var1, var2, var3, var4, var5, var6, false, 0.0F, false);
            break;
         case ARMS:
            this.renderOn(var7.rightArm, var1, var2, var3, var4, var5, var6, true, f_29860, false);
            this.renderOn(var7.leftArm, var1, var2, var3, var4, var5, var6, true, f_29861, false);
            break;
         case LEGS:
            this.renderOn(var7.rightLeg, var1, var2, var3, var4, var5, var6, true, f_29862, true);
            this.renderOn(var7.leftLeg, var1, var2, var3, var4, var5, var6, true, f_29863, true);
            break;
         case PAWS:
            this.renderOn(var7.rightArm, var1, var2, var3, var4, var5, var6, true, f_29864, false);
            this.renderOn(var7.leftArm, var1, var2, var3, var4, var5, var6, true, f_29865, false);
            this.renderOn(var7.rightLeg, var1, var2, var3, var4, var5, var6, true, f_29866, true);
            this.renderOn(var7.leftLeg, var1, var2, var3, var4, var5, var6, true, f_29867, true);
            break;
         case STOCKINGS:
            this.renderOn(var7.rightLeg, var1, var2, var3, var4, var5, var6, true, 0.0F, false);
            this.renderOn(var7.leftLeg, var1, var2, var3, var4, var5, var6, true, 0.0F, false);
         case WORLD:
      }
   }

   private void renderOn(
      ModelPart var1,
      Class_CaVoGy5a20MKv97j var2,
      AvatarRenderState var3,
      PoseStack var4,
      SubmitNodeCollector var5,
      int var6,
      float var7,
      boolean var8,
      float var9,
      boolean var10
   ) {
      var4.pushPose();
      var1.translateAndRotate(var4);
      PlayerModel var11 = (PlayerModel)this.getParentModel();
      if (var1 == var11.body) {
         Class_GGEo7U6LC2t9Tb5z.m_2750(var3, var4);
      } else if (var1 == var11.rightArm) {
         Class_GGEo7U6LC2t9Tb5z.m_2764(var3, HumanoidArm.RIGHT, var4);
      } else if (var1 == var11.leftArm) {
         Class_GGEo7U6LC2t9Tb5z.m_2764(var3, HumanoidArm.LEFT, var4);
      } else if (var10 && var1 == var11.rightLeg) {
         Class_GGEo7U6LC2t9Tb5z.m_2748(var3, false, var4);
      } else if (var10 && var1 == var11.leftLeg) {
         Class_GGEo7U6LC2t9Tb5z.m_2748(var3, true, var4);
      }

      if (var8) {
         var4.translate(0.0F, var9, 0.0F);
         if (var10) {
            var4.mulPose(Axis.XP.rotationDegrees(f_29868));
         }

         var4.scale(var2.scale(), var2.scale(), var2.scale());
         var4.translate(var2.x(), var2.y(), var2.z());
      } else {
         var4.mulPose(Axis.ZP.rotationDegrees(f_29869));
         var4.scale(var2.scale(), var2.scale(), var2.scale());
         var4.translate(var2.x(), var2.y(), var2.z());
         var4.translate(f_29870, f_29871, f_29872);
      }

      float var12 = (float)(System.nanoTime() % f_29873) / f_29874;
      var5.submitCustomGeometry(var4, RenderTypes.entityTranslucent(var2.texture()), (var4x, var5x) -> {
         PoseStack var6x = new PoseStack();
         var6x.mulPose(var4x.pose());
         Class_rlEjoVq6UqFoLGoE.m_8458(var6x, var5x, var2.model(), var2.animation(), var12, var6, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, var7);
      });
      var4.popPose();
   }

   public void submit(PoseStack var1, SubmitNodeCollector var2, int var3, AvatarRenderState var4, float var5, float var6) {
      Minecraft var7 = Minecraft.getInstance();
      if (var7.level != null && !var4.isInvisible) {
         if (var7.level.getEntity(var4.id) instanceof Player var8) {
            if (this.visibleFor(var8, var7)) {
               Object var19 = Class_WREU7oMaYdkygWNg.m_5456(((PlayerModel)this.getParentModel()).root());

               try {
                  for (Class_HSD91zSgdqsM5q0d var13 : Class_HSD91zSgdqsM5q0d.values()) {
                     Class_CaVoGy5a20MKv97j var14 = Class_rsrLB4fiDOF3z0YM.m_8477(var8, var13);
                     float var15 = var7.player != null && var8.getUUID().equals(var7.player.getUUID()) ? Class_rsrLB4fiDOF3z0YM.m_8475(var13) : 1.0F;
                     if (var14 != null && !(var15 < f_29859) && !var14.attach().m_3629()) {
                        this.render(var14, var4, var1, var2, var3, var15);
                     }
                  }
               } finally {
                  Class_WREU7oMaYdkygWNg.m_5453(var19);
               }
            }
         }
      }
   }
}
