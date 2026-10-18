package dev.dimasik.client.system;

import com.mojang.blaze3d.platform.Lighting.Entry;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.render.pip.PictureInPictureRenderer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.texture.OverlayTexture;

public final class Class_c1vfJn2bkwGOckqu extends PictureInPictureRenderer<Class_CWsov3cJu2mwXMhM> {
   private Class_b7DtWeeAjt1vCmtH f_17913;
   private static final float f_17914 = 0.5F;
   private static final float f_17915 = 15.0F;
   private static final float f_17916 = 205.0F;
   private static final float f_17917 = 15.0F;
   private static final float f_17918 = 205.0F;
   private static final int f_17919 = 15728880;
   private static final int f_17920 = 15728880;
   private static final String f_17921 = "backpack preview";
   private static final int f_17922 = 15728880;
   private static final int f_17923 = 15728880;

   protected void renderToTexture(Class_CWsov3cJu2mwXMhM var1, PoseStack var2, SubmitNodeCollector var3) {
      Minecraft.getInstance().gameRenderer.lighting().setupFor(Entry.ENTITY_IN_UI);
      float var4 = (var1.m_2420() - var1.m_2421()) * f_17914;

      for (Class_CWsov3cJu2mwXMhM.FmHMh8tB8MnHgILT var6 : var1.previews()) {
         var2.pushPose();
         if (this.f_17913 == null) {
            this.f_17913 = this.measure(var6.variant());
         }

         this.f_17913.fit(var2, var6.x() - var4, var6.y(), var6.width(), var6.height());
         Class_b7DtWeeAjt1vCmtH.orient(var2, f_17915, f_17916, false);
         var3.submitCustomGeometry(var2, RenderTypes.entityTranslucent(Class_x4to6Nwlvbuq8fWW.f_34714), (var1x, var2x) -> {
            PoseStack var3x = new PoseStack();
            var3x.last().set(var1x);
            Class_x4to6Nwlvbuq8fWW.m_9447(var3x, var2x, f_17923, OverlayTexture.NO_OVERLAY, var6.variant(), var6.alpha());
         });
         var3.submitCustomGeometry(var2, RenderTypes.entityTranslucent(Class_x4to6Nwlvbuq8fWW.f_34715), (var1x, var2x) -> {
            PoseStack var3x = new PoseStack();
            var3x.last().set(var1x);
            Class_x4to6Nwlvbuq8fWW.m_9451(var3x, var2x, f_17922, OverlayTexture.NO_OVERLAY, var6.alpha());
         });
         var2.popPose();
      }
   }

   protected float getTranslateY(int var1, int var2) {
      return 0.0F;
   }

   public Class<Class_CWsov3cJu2mwXMhM> getRenderStateClass() {
      return Class_CWsov3cJu2mwXMhM.class;
   }

   private Class_b7DtWeeAjt1vCmtH measure(Class_LdeJaBYCxAYq5SO6 var1) {
      Class_b7DtWeeAjt1vCmtH var2 = new Class_b7DtWeeAjt1vCmtH();
      PoseStack var3 = new PoseStack();
      Class_b7DtWeeAjt1vCmtH.orient(var3, f_17917, f_17918, false);
      Class_x4to6Nwlvbuq8fWW.m_9447(var3, var2, f_17919, OverlayTexture.NO_OVERLAY, var1, 1.0F);
      Class_x4to6Nwlvbuq8fWW.m_9451(var3, var2, f_17920, OverlayTexture.NO_OVERLAY, 1.0F);
      return var2;
   }

   protected String getTextureLabel() {
      return f_17921;
   }
}
