package dev.dimasik.client.system;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;

public class Class_PlygiGahPfdzKz1A extends Class_hqBajCoIbZEUNpAH implements Class_3hjPQd7JhfrEK7JA {
   private float f_11794;
   private float f_11795;
   private float f_11796;
   private float f_11797;

   public Class_PlygiGahPfdzKz1A(float var1, float var2, float var3, float var4) {
      this.f_11797 = var1;
      this.f_11794 = var2;
      this.f_11795 = var3;
      this.f_11796 = var4;
   }

   @Override
   public void m_886(PoseStack var1) {
      var1.rotateAround(Axis.XP.rotationDegrees(this.f_11797), this.f_11794, this.f_11795, this.f_11796);
   }
}
