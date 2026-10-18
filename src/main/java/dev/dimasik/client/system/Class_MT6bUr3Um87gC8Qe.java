package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;

public class Class_MT6bUr3Um87gC8Qe extends Class_hqBajCoIbZEUNpAH implements Class_3hjPQd7JhfrEK7JA {
   private float f_11143;
   private float f_11144;
   private float f_11145;
   private float f_11146;

   @Override
   public void m_886(PoseStack var1) {
      var1.rotateAround(Axis.YP.rotationDegrees(this.f_11146), this.f_11143, this.f_11144, this.f_11145);
   }

   public Class_MT6bUr3Um87gC8Qe(float var1, float var2, float var3, float var4) {
      this.f_11146 = var1;
      this.f_11143 = var2;
      this.f_11144 = var3;
      this.f_11145 = var4;
   }
}
