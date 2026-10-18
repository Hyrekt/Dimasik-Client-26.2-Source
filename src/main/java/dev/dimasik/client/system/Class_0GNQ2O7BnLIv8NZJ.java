package dev.dimasik.client.system;

import net.minecraft.world.entity.player.Player;

public final class Class_0GNQ2O7BnLIv8NZJ {
   private final Class_s5qEamGcEs25C3d8 f_165;
   private final Class_WzqIkwE6nF1UkDXB f_166;
   private Class_upIrnGbaEqjksjxz f_167;
   private int f_168;
   private static final int f_169 = Integer.MIN_VALUE;

   public Class_WzqIkwE6nF1UkDXB m_684() {
      return this.f_166;
   }

   public Class_s5qEamGcEs25C3d8 m_685() {
      return this.f_165;
   }

   public Class_0GNQ2O7BnLIv8NZJ(Class_s5qEamGcEs25C3d8 var1) {
      this.f_168 = f_169;
      this.f_165 = var1;
      this.f_166 = var1.m_8629();
      this.f_167 = new Class_upIrnGbaEqjksjxz.sJwIQAiyBepuCTt1();
   }

   public void m_686(Player var1) {
      if (var1.tickCount != this.f_168) {
         this.f_168 = var1.tickCount;
         this.f_166.m_2098();
         double var2 = var1.getX() - var1.xo;
         double var4 = var1.getY() - var1.yo;
         double var6 = var1.getZ() - var1.zo;
         Class_upIrnGbaEqjksjxz var8 = this.f_167.m_9249(!var1.onGround(), var2, var4, var6, var1);
         if (var8 != this.f_167) {
            var8.m_9247(this.f_166);
            this.f_167 = var8;
         }
      }
   }
}
