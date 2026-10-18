package dev.dimasik.client.system;

import net.minecraft.world.item.AirItem;
import net.minecraft.world.item.ItemStack;

public class Class_AB6qRaTZkKrfTtQk extends Class_wrlOrPdKXkgHMuew {
   private static final String f_5094 = "Броня";

   @Override
   public boolean m_1753() {
      if (!this.f_34675.m_9524().m_7145(f_5094)) {
         return false;
      }

      for (ItemStack var2 : Class_Gdq0gG4caGaUMlXb.m_2800(f_11537.player)) {
         if (var2.getItem() instanceof AirItem) {
            return true;
         }
      }

      return false;
   }
}
