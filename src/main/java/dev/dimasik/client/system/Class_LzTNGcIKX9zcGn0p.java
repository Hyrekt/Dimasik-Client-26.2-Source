package dev.dimasik.client.system;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gui.GuiGraphicsExtractor;

public final class Class_LzTNGcIKX9zcGn0p {
   private final List<Class_LzTNGcIKX9zcGn0p.uHTYkDeemuF5S8Ky> f_11046 = new ArrayList<>();
   private static final float f_11047 = 0.5F;
   private static final float f_11048 = 0.5F;

   public void m_3870() {
      this.f_11046.clear();
   }

   public void m_3871(GuiGraphicsExtractor var1, float var2, float var3, float var4, float var5) {
      if (!this.f_11046.isEmpty()) {
         Class_xhirN7J7yHRyh6lR var6 = Class_xhirN7J7yHRyh6lR.m_9504(var2, var3, var4, var5);
         List var7 = this.f_11046
            .stream()
            .map(
               var1x -> new Class_zcop3nhFFuuxjT2z.Foth96PKoIxKs5bh(
                  var1x.hat, var1x.alpha, var6.localX(var1x.x), var6.localY(var1x.y), var1x.width * var6.scaleX(), var1x.height * var6.scaleY()
               )
            )
            .toList();
         var1.guiRenderState
            .addPicturesInPictureState(new Class_zcop3nhFFuuxjT2z(var7, var6.m_9507(), var6.m_9506(), var6.m_9505(), var6.m_9503(), 1.0F, var6.clip()));
      }
   }

   public void m_3873(Class_LzYTXb7R2jug6Pep var1, float var2, float var3, float var4, float var5, float var6) {
      this.f_11046.add(new Class_LzTNGcIKX9zcGn0p.uHTYkDeemuF5S8Ky(var1, var2 + var4 * f_11047, var3 + var5 * f_11048, var6, var4, var5));
   }

   private record uHTYkDeemuF5S8Ky(Class_LzYTXb7R2jug6Pep hat, float x, float y, float alpha, float width, float height) {
   }
}
