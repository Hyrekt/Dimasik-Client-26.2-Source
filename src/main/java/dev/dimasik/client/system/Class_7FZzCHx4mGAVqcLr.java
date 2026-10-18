package dev.dimasik.client.system;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.gui.GuiGraphicsExtractor;

public final class Class_7FZzCHx4mGAVqcLr {
   private final Map<Class_WzvV6cpDDR1F4aeD, Class_7FZzCHx4mGAVqcLr.K586g5keeSfxda4J> f_3198 = new EnumMap<>(Class_WzvV6cpDDR1F4aeD.class);
   private final List<Class_7FZzCHx4mGAVqcLr.Class_0wkXx73O5t5cbuxW> f_3199 = new ArrayList<>();
   private static final float f_3200 = 0.5F;
   private static final float f_3201 = 0.5F;

   public void m_1633(Class_WzvV6cpDDR1F4aeD var1, float var2, float var3, float var4, float var5, float var6) {
      Class_7FZzCHx4mGAVqcLr.K586g5keeSfxda4J var7 = this.f_3198
         .computeIfAbsent(var1, var0 -> new Class_7FZzCHx4mGAVqcLr.K586g5keeSfxda4J(var0.m_5498().m_8629()));
      this.f_3199.add(new Class_7FZzCHx4mGAVqcLr.Class_0wkXx73O5t5cbuxW(var1, var7, var2 + var4 * f_3200, var3 + var5 * f_3201, var4, var5, var6));
   }

   public void m_1634() {
      this.f_3199.clear();
   }

   public void m_1636(GuiGraphicsExtractor var1, float var2, float var3, float var4, float var5) {
      if (!this.f_3199.isEmpty()) {
         Class_xhirN7J7yHRyh6lR var6 = Class_xhirN7J7yHRyh6lR.m_9504(var2, var3, var4, var5);
         List var7 = this.f_3199
            .stream()
            .map(
               var1x -> new Class_s5Et3FmuBUH4bvsQ.zuGVqZ9Rt8YOeccM(
                  var1x.wing.m_5498(),
                  var1x.preview.f_3195,
                  var1x.preview.m_1631(),
                  var1x.alpha,
                  var6.localX(var1x.x),
                  var6.localY(var1x.y),
                  var1x.width * var6.scaleX(),
                  var1x.height * var6.scaleY()
               )
            )
            .toList();
         var1.guiRenderState
            .addPicturesInPictureState(new Class_s5Et3FmuBUH4bvsQ(var7, var6.m_9507(), var6.m_9506(), var6.m_9505(), var6.m_9503(), 1.0F, var6.clip()));
      }
   }

   private record Class_0wkXx73O5t5cbuxW(
      Class_WzvV6cpDDR1F4aeD wing, Class_7FZzCHx4mGAVqcLr.K586g5keeSfxda4J preview, float x, float y, float width, float height, float alpha
   ) {
   }

   private static final class K586g5keeSfxda4J {
      public final Class_WzqIkwE6nF1UkDXB f_3195;
      public long f_3196 = System.nanoTime();
      public static final long f_3197 = 50000000L;

      public K586g5keeSfxda4J(Class_WzqIkwE6nF1UkDXB var1) {
         this.f_3195 = var1;
         var1.m_2095();
      }

      public float m_1631() {
         long var1 = System.nanoTime();
         long var3 = f_3197;

         while (var1 - this.f_3196 >= var3) {
            this.f_3195.m_2098();
            this.f_3196 += var3;
         }

         return Math.min(1.0F, (float)(var1 - this.f_3196) / (float)var3);
      }
   }
}
