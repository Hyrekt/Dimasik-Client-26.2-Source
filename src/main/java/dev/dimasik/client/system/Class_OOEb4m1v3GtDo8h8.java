package dev.dimasik.client.system;

import net.minecraft.client.Minecraft;

public class Class_OOEb4m1v3GtDo8h8 {
   @Class_FUILRKIQ6wtWry59
   public void m_4050(double var1, double var3, double var5) {
      if (Minecraft.getInstance().gameRenderer.mainCamera() instanceof Class_VUL8fOj2RfatZYAM var8) {
         var8.hMI5_0$setRotationValues((float)var1, (float)var3, (float)var5);
      }
   }

   @Class_FUILRKIQ6wtWry59
   public void m_4051(double var1, double var3, double var5) {
      if (Minecraft.getInstance().gameRenderer.mainCamera() instanceof Class_VUL8fOj2RfatZYAM var8) {
         var8.hMI5_0$setPosValues((float)var1, (float)var3, (float)var5);
      }
   }
}
