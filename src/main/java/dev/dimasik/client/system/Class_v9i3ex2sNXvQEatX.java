package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

public final class Class_v9i3ex2sNXvQEatX extends Class_N3SSqGnetdyAyMUH {
   private final Class_JtQh1r0P8b1y8XvD f_33280 = m_3989(0, 0);
   private final Class_JtQh1r0P8b1y8XvD f_33281 = m_3989(0, 0);
   private final Class_JtQh1r0P8b1y8XvD f_33282;
   private static final float f_33283 = -8.0F;
   private static final float f_33284 = 2.5F;
   private static final float f_33285 = -19.0F;
   private static final float f_33286 = -8.0F;
   private static final float f_33287 = 2.5F;

   public Class_v9i3ex2sNXvQEatX() {
      this.f_33281.m_3359(0.0F, f_33283, 0.0F, 19, 24, 0);
      this.f_33281.m_3361(0.0F, 2.0F, f_33284);
      this.f_33282 = m_3989(0, 24);
      this.f_33282.m_3359(f_33285, f_33286, 0.0F, 19, 24, 0);
      this.f_33282.m_3361(0.0F, 2.0F, f_33287);
      this.f_33280.m_3360(this.f_33281);
      this.f_33280.m_3360(this.f_33282);
   }

   @Override
   public void m_2482(
      Class_WzqIkwE6nF1UkDXB var1, float var2, PoseStack var3, VertexConsumer var4, int var5, int var6, float var7, float var8, float var9, float var10
   ) {
      Class_AcQu0tvtKKB6W63w var11 = (Class_AcQu0tvtKKB6W63w)var1;
      m_3990(this.f_33281, this.f_33282, var11.m_2093(var2));
      this.f_33280.m_3358(var3, var4, var5, var6, var7, var8, var9, var10);
   }
}
