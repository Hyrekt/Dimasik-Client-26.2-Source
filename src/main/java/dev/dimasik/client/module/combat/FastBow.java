package dev.dimasik.client.module.combat;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import net.minecraft.world.item.BowItem;

public class FastBow extends Module {
   private final SliderSetting f_5126;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_5127;
   private static final String f_5128 = "FastBow";
   private static final String f_5129 = "Убирает задержку при стрельбе из лука";
   private static final String f_5130 = "Задержка";
   private static final float f_5131 = 3.0F;
   private static final float f_5132 = 10.0F;

   public void m_2084(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null) {
         if (f_11537.player.getInventory().getSelectedItem().getItem() instanceof BowItem
            && f_11537.player.isUsingItem()
            && f_11537.player.getTicksUsingItem() >= this.f_5126.m_8768()
            && f_11537.player.getTicksUsingItem() >= this.f_5126.m_8768()) {
            f_11537.gameMode.releaseUsingItem(f_11537.player);
         }
      }
   }

   public FastBow() {
      super(f_5128, f_5129, Category.COMBAT);
      this.f_5126 = new SliderSetting(f_5130, f_5131, 1.0F, f_5132).m_828(1.0F);
      this.f_5127 = this::m_2084;
      this.m_795(this.f_5126);
   }
}
