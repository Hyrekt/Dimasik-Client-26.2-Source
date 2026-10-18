package dev.dimasik.client.module.movement;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import net.minecraft.world.item.Items;

public class NoDelay extends Module {
   private final ItemListSetting f_34449;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_34450;
   private static final String f_34451 = "NoDelay";
   private static final String f_34452 = "Убирает задержки";
   private static final String f_34453 = "Элементы";
   private static final String f_34454 = "Прыжок";
   private static final String f_34455 = "ПКМ";
   private static final String f_34456 = "Бутыльки с опытом";
   private static final String f_34457 = "Прыжок";
   private static final String f_34458 = "ПКМ";
   private static final String f_34459 = "Бутыльки с опытом";

   public void m_9359(Class_Xu9btcIeUN33XnMK var1) {
      if (this.f_34449.m_7145(f_34457)) {
         f_11537.player.noJumpDelay = 0;
      }

      if (this.f_34449.m_7145(f_34458)) {
         f_11537.rightClickDelay = 0;
      }

      if (this.f_34449.m_7145(f_34459)) {
         boolean var2 = f_11537.player.getMainHandItem().getItem() == Items.EXPERIENCE_BOTTLE
            || f_11537.player.getOffhandItem().getItem() == Items.EXPERIENCE_BOTTLE;
         if (var2) {
            f_11537.rightClickDelay = 0;
         }
      }
   }

   public NoDelay() {
      super(f_34451, f_34452, Category.MOVEMENT);
      this.f_34449 = new ItemListSetting(
         f_34453, new Class_2ZaVm8TGDJ68TnJB(f_34454, true), new Class_2ZaVm8TGDJ68TnJB(f_34455, false), new Class_2ZaVm8TGDJ68TnJB(f_34456, true)
      );
      this.f_34450 = this::m_9359;
      this.m_795(this.f_34449);
   }
}
