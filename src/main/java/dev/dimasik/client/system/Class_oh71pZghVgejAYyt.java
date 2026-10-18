package dev.dimasik.client.system;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.entity.vehicle.minecart.MinecartTNT;

public class Class_oh71pZghVgejAYyt extends Class_wrlOrPdKXkgHMuew {
   private static final String f_28045 = "Динамит";

   @Override
   public boolean m_1753() {
      if (!this.f_34675.m_9524().m_7145(f_28045)) {
         return false;
      }

      for (Entity var2 : f_11537.level.entitiesForRendering()) {
         if (var2 instanceof PrimedTnt var3 && var3.distanceTo(f_11537.player) <= this.f_34675.m_9531().m_8768()) {
            return true;
         }

         if (var2 instanceof MinecartTNT var4 && var4.distanceTo(f_11537.player) <= this.f_34675.m_9531().m_8768()) {
            return true;
         }
      }

      return false;
   }
}
