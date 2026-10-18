package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;

public class Class_rwJJYPA55BER998F extends Class_hqBajCoIbZEUNpAH implements Class_3hjPQd7JhfrEK7JA {
   private float f_30491;
   private float f_30492;
   private float f_30493;
   private float f_30494;

   public Class_rwJJYPA55BER998F(float var1, float var2, float var3, float var4) {
      this.f_30494 = var1;
      this.f_30491 = var2;
      this.f_30492 = var3;
      this.f_30493 = var4;
   }

   @Override
   public void m_886(PoseStack var1) {
      var1.rotateAround(Axis.ZP.rotationDegrees(this.f_30494), this.f_30491, this.f_30492, this.f_30493);
   }
}
