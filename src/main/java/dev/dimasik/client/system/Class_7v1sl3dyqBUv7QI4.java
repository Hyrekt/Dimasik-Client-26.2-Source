package dev.dimasik.client.system;

import net.minecraft.world.effect.MobEffects;

public class Class_7v1sl3dyqBUv7QI4 extends Class_wrlOrPdKXkgHMuew {
   private static final String f_3814 = "Золотые сердца";

   @Override
   public boolean m_1753() {
      float var1 = f_11537.player.isFallFlying() ? this.f_34675.m_9523().m_8768() : this.f_34675.m_9514().m_8768();
      return this.m_1754() <= var1;
   }

   private float m_1754() {
      float var1 = f_11537.player.getHealth();
      if (this.f_34675.m_9524().m_7145(f_3814) && f_11537.player.hasEffect(MobEffects.ABSORPTION)) {
         var1 += f_11537.player.getAbsorptionAmount();
      }

      return var1;
   }
}
