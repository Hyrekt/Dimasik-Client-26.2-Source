package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

public final class Class_iZcH0Mb291bLfYnI extends Class_N3SSqGnetdyAyMUH {
   private final Class_JtQh1r0P8b1y8XvD f_24562 = m_3989(0, 0);
   private final Class_JtQh1r0P8b1y8XvD f_24563;
   private final Class_JtQh1r0P8b1y8XvD f_24564;
   private static final float f_24565 = -8.0F;
   private static final float f_24566 = 0.5F;
   private static final float f_24567 = -16.0F;
   private static final float f_24568 = -8.0F;
   private static final float f_24569 = -0.5F;

   public Class_iZcH0Mb291bLfYnI() {
      this.f_24563 = Class_tNlRpwRgzUrOo0Tc.m_8864(0.0F, f_24565, 0.0F, 16, 16, 0, 0, 64, 64);
      this.f_24563.m_3361(f_24566, 1.0F, 2.0F);
      this.f_24564 = Class_tNlRpwRgzUrOo0Tc.m_8864(f_24567, f_24568, 0.0F, 16, 16, 16, 0, 64, 64);
      this.f_24564.m_3361(f_24569, 1.0F, 2.0F);
      this.f_24562.m_3360(this.f_24563);
      this.f_24562.m_3360(this.f_24564);
   }

   @Override
   public void m_2482(
      Class_WzqIkwE6nF1UkDXB var1, float var2, PoseStack var3, VertexConsumer var4, int var5, int var6, float var7, float var8, float var9, float var10
   ) {
      Class_GgAv5LmRq7OHDViI var11 = (Class_GgAv5LmRq7OHDViI)var1;
      m_3990(this.f_24563, this.f_24564, var11.m_2842(0, var2));
      this.f_24562.m_3358(var3, var4, var5, var6, var7, var8, var9, var10);
   }
}
