package dev.dimasik.client.system;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gui.GuiGraphicsExtractor;

public final class Class_Pko7z8Gp1S0OsRzK {
   private final List<Class_Pko7z8Gp1S0OsRzK.vuJ8QRjFFhgKOFcw> f_11791 = new ArrayList<>();
   private static final float f_11792 = 0.5F;
   private static final float f_11793 = 0.5F;

   public void m_4156(GuiGraphicsExtractor var1, float var2, float var3, float var4, float var5) {
      if (!this.f_11791.isEmpty()) {
         Class_xhirN7J7yHRyh6lR var6 = Class_xhirN7J7yHRyh6lR.m_9504(var2, var3, var4, var5);
         List var7 = this.f_11791
            .stream()
            .map(
               var1x -> new Class_CWsov3cJu2mwXMhM.FmHMh8tB8MnHgILT(
                  var1x.variant, var1x.alpha, var6.localX(var1x.x), var6.localY(var1x.y), var1x.width * var6.scaleX(), var1x.height * var6.scaleY()
               )
            )
            .toList();
         var1.guiRenderState
            .addPicturesInPictureState(new Class_CWsov3cJu2mwXMhM(var7, var6.m_9507(), var6.m_9506(), var6.m_9505(), var6.m_9503(), var6.clip()));
      }
   }

   public void m_4157() {
      this.f_11791.clear();
   }

   public void m_4158(Class_LdeJaBYCxAYq5SO6 var1, float var2, float var3, float var4, float var5, float var6) {
      this.f_11791.add(new Class_Pko7z8Gp1S0OsRzK.vuJ8QRjFFhgKOFcw(var1, var2 + var4 * f_11792, var3 + var5 * f_11793, var6, var4, var5));
   }

   private record vuJ8QRjFFhgKOFcw(Class_LdeJaBYCxAYq5SO6 variant, float x, float y, float alpha, float width, float height) {
   }
}
