package dev.dimasik.client.module.combat;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_wjdoxQGtI8mFyL6U;
import net.minecraft.world.entity.Entity.RemovalReason;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import net.minecraft.world.phys.HitResult;

public class CrystalOptimizer extends Module {
   private final Class_gEPk7yDw6CwIte87<Class_wjdoxQGtI8mFyL6U> f_26031 = this::m_7712;
   private static final String f_26032 = "CrystalOptimizer";
   private static final String f_26033 = "Мгновенно убирает кристалл на клиенте после удара";

   private void m_7712(Class_wjdoxQGtI8mFyL6U var1) {
      if (var1.m_9372() == Class_wjdoxQGtI8mFyL6U.Class_327mRdjAqNoPaemJ.POST) {
         if (f_11537.player != null && f_11537.level != null) {
            if (var1.m_9371() == f_11537.player) {
               if (var1.m_9370() instanceof EndCrystal var3 && !var3.isRemoved()) {
                  if (!(f_11537.player.getAttributeValue(Attributes.ATTACK_DAMAGE) <= 0.0)) {
                     var3.remove(RemovalReason.KILLED);
                     this.m_7713(var3);
                  }
               }
            }
         }
      }
   }

   public CrystalOptimizer() {
      super(f_26032, f_26033, Category.COMBAT);
   }

   private void m_7713(EndCrystal var1) {
      if (f_11537.crosshairPickEntity == var1) {
         HitResult var2 = f_11537.player.pick(f_11537.player.blockInteractionRange(), 1.0F, false);
         f_11537.crosshairPickEntity = null;
         f_11537.hitResult = var2;
      }
   }
}
