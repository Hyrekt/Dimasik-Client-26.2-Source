package dev.dimasik.client.system;

public class Class_Y2w8qnM3woIvNUVP extends Class_wrlOrPdKXkgHMuew {
   private static final float f_16120 = 5.0F;
   private static final String f_16121 = "Падение";

   @Override
   public boolean m_1753() {
      boolean var1 = f_11537.player.fallDistance >= this.f_34675.m_9535().m_8768().floatValue()
         || f_11537.player.getDeltaMovement().y <= -(this.f_34675.m_9535().m_8768() / f_16120);
      return this.f_34675.m_9524().m_7145(f_16121) && var1;
   }
}
