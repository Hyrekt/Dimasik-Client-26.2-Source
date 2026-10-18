package dev.dimasik.client.system;

import com.mojang.blaze3d.platform.Lighting.Entry;
import com.mojang.blaze3d.vertex.PoseStack;
import java.util.Map;
import java.util.WeakHashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.render.pip.PictureInPictureRenderer;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import net.minecraft.client.renderer.texture.OverlayTexture;

public final class Class_aWLprtZpm5cB7Dha extends PictureInPictureRenderer<Class_zcop3nhFFuuxjT2z> {
   private final Map<Class_oAq4PeD1FSXoIaXR, Class_b7DtWeeAjt1vCmtH> f_17225 = new WeakHashMap<>();
   private static final float f_17226 = 0.5F;
   private static final float f_17227 = 15.0F;
   private static final float f_17228 = 205.0F;
   private static final float f_17229 = 15.0F;
   private static final float f_17230 = 205.0F;
   private static final int f_17231 = 15728880;
   private static final String f_17232 = "hat preview";
   private static final int f_17233 = 15728880;

   protected void renderToTexture(Class_zcop3nhFFuuxjT2z var1, PoseStack var2, SubmitNodeCollector var3) {
      Minecraft.getInstance().gameRenderer.lighting().setupFor(Entry.ENTITY_IN_UI);
      float var4 = (var1.m_9939() - var1.m_9938()) * f_17226;

      for (Class_zcop3nhFFuuxjT2z.Foth96PKoIxKs5bh var6 : var1.hats()) {
         Class_LzYTXb7R2jug6Pep var7 = var6.hat();
         var2.pushPose();
         this.f_17225.computeIfAbsent(var7.model(), this::measure).fit(var2, var6.x() - var4, var6.y(), var6.width(), var6.height());
         Class_b7DtWeeAjt1vCmtH.orient(var2, f_17227, f_17228, var7.model().f_26067);
         var3.submitCustomGeometry(var2, RenderTypes.entityTranslucent(var7.texture()), (var2x, var3x) -> {
            PoseStack var4x = new PoseStack();
            var4x.last().set(var2x);
            Class_rlEjoVq6UqFoLGoE.m_8461(var4x, var3x, var7.model(), f_17233, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, var6.alpha());
         });
         var2.popPose();
      }
   }

   protected String getTextureLabel() {
      return f_17232;
   }

   public Class<Class_zcop3nhFFuuxjT2z> getRenderStateClass() {
      return Class_zcop3nhFFuuxjT2z.class;
   }

   private Class_b7DtWeeAjt1vCmtH measure(Class_oAq4PeD1FSXoIaXR var1) {
      Class_b7DtWeeAjt1vCmtH var2 = new Class_b7DtWeeAjt1vCmtH();
      PoseStack var3 = new PoseStack();
      Class_b7DtWeeAjt1vCmtH.orient(var3, f_17229, f_17230, var1.f_26067);
      Class_rlEjoVq6UqFoLGoE.m_8461(var3, var2, var1, f_17231, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
      return var2;
   }

   protected float getTranslateY(int var1, int var2) {
      return 0.0F;
   }
}
