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

public final class Class_G9igPv6YqsJmODJA extends PictureInPictureRenderer<Class_s5Et3FmuBUH4bvsQ> {
   private final Map<Class_N3SSqGnetdyAyMUH, Class_b7DtWeeAjt1vCmtH> f_7659 = new WeakHashMap<>();
   private static final float f_7660 = 0.5F;
   private static final float f_7661 = 0.96F;
   private static final float f_7662 = 0.96F;
   private static final float f_7663 = 24.0F;
   private static final float f_7664 = 200.0F;
   private static final float f_7665 = 24.0F;
   private static final float f_7666 = 200.0F;
   private static final int f_7667 = 15728880;
   private static final String f_7668 = "wing preview";
   private static final int f_7669 = 15728880;

   protected float getTranslateY(int var1, int var2) {
      return 0.0F;
   }

   protected String getTextureLabel() {
      return f_7668;
   }

   private Class_b7DtWeeAjt1vCmtH measure(Class_s5qEamGcEs25C3d8 var1) {
      Class_b7DtWeeAjt1vCmtH var2 = new Class_b7DtWeeAjt1vCmtH();
      PoseStack var3 = new PoseStack();
      Class_b7DtWeeAjt1vCmtH.orient(var3, f_7665, f_7666, false);
      Class_WzqIkwE6nF1UkDXB var4 = var1.m_8629();
      var4.m_2095();

      for (int var5 = 0; var5 < 17; var5++) {
         var1.m_8630().m_2482(var4, 1.0F, var3, var2, f_7667, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);

         for (int var6 = 0; var6 < 8; var6++) {
            var4.m_2098();
         }
      }

      return var2;
   }

   protected void renderToTexture(Class_s5Et3FmuBUH4bvsQ var1, PoseStack var2, SubmitNodeCollector var3) {
      Minecraft.getInstance().gameRenderer.lighting().setupFor(Entry.ENTITY_IN_UI);
      float var4 = (var1.m_8623() - var1.m_8624()) * f_7660;

      for (Class_s5Et3FmuBUH4bvsQ.zuGVqZ9Rt8YOeccM var6 : var1.wings()) {
         Class_s5qEamGcEs25C3d8 var7 = var6.type();
         var2.pushPose();
         this.f_7659
            .computeIfAbsent(var7.m_8630(), var2x -> this.measure(var7))
            .fit(var2, var6.x() - var4, var6.y(), var6.width() * f_7661, var6.height() * f_7662);
         Class_b7DtWeeAjt1vCmtH.orient(var2, f_7663, f_7664, false);
         var3.submitCustomGeometry(var2, RenderTypes.entityTranslucent(var7.m_8628()), (var2x, var3x) -> {
            PoseStack var4x = new PoseStack();
            var4x.last().set(var2x);
            var7.m_8630().m_2482(var6.animator(), var6.delta(), var4x, var3x, f_7669, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, var6.alpha());
         });
         var2.popPose();
      }
   }

   public Class<Class_s5Et3FmuBUH4bvsQ> getRenderStateClass() {
      return Class_s5Et3FmuBUH4bvsQ.class;
   }
}
