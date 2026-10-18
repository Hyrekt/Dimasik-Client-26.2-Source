package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;

public class TapeMouse extends Module {
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_15465 = this::m_5402;
   private static final String f_15466 = "TapeMouse";
   private static final String f_15467 = "Автоматический клик левой кнопкой мыши";
   private static final float f_15468 = 0.5F;
   private static final float f_15469 = 0.9F;

   public TapeMouse() {
      super(f_15466, f_15467, Category.MISC);
   }

   public void m_5402(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player.getAttackStrengthScale(f_15468) > f_15469 && !f_11537.player.isUsingItem()) {
         f_11537.gameMode.attack(f_11537.player, f_11537.crosshairPickEntity);
      }
   }
}
