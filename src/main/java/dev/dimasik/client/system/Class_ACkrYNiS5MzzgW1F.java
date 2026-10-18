package dev.dimasik.client.system;

import net.minecraft.core.BlockPos;

public class Class_ACkrYNiS5MzzgW1F extends Class_4DhobBIM8lTNckKj {
   private boolean f_5095;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_5096 = this::m_2080;

   private void m_2080(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null) {
         if (f_11537.player.getHealth() <= 0.0F) {
            if (!this.f_5095) {
               this.f_5095 = true;
               BlockPos var2 = f_11537.player.blockPosition();
               Class_ftHu9o3WzCU3Adxm.m_6731("" + var2.getX() + var2.getY() + var2.getZ());
            }
         } else {
            this.f_5095 = false;
         }
      }
   }
}
