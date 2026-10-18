package dev.dimasik.client.system;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import net.minecraft.world.item.Items;

public class Class_GRQY95wpFHZPswKx extends Class_wrlOrPdKXkgHMuew {
   private final Class_kPXtxQj0j9mBpxqt f_7759 = new Class_kPXtxQj0j9mBpxqt();
   private boolean f_7760 = false;
   private static final String f_7761 = "Кристаллы";
   private static final String f_7762 = "Золотые сердца";

   private float m_2798() {
      float var1 = f_11537.player.getHealth();
      if (this.f_34675.m_9524().m_7145(f_7762) && f_11537.player.hasEffect(MobEffects.ABSORPTION)) {
         var1 += f_11537.player.getAbsorptionAmount();
      }

      return var1;
   }

   @Override
   public boolean m_1753() {
      if (!this.f_34675.m_9524().m_7145(f_7761)) {
         return false;
      }

      if (!this.m_2799()) {
         for (Entity var2 : f_11537.level.entitiesForRendering()) {
            if (var2 instanceof EndCrystal var3 && var3.distanceTo(f_11537.player) <= this.f_34675.m_9509().m_8768()) {
               this.f_7759.m_7442();
               this.f_7760 = true;
               return true;
            }
         }
      }

      return this.f_7760 && !this.f_7759.m_7443(this.f_34675.m_9521().m_8768().intValue());
   }

   private boolean m_2799() {
      return this.f_34675.m_9537().m_8768()
         && f_11537.player.getOffhandItem().getItem() == Items.PLAYER_HEAD
         && (this.m_2798() > this.f_34675.m_9549().m_8768() || !this.f_34675.m_9540().m_8768());
   }
}
