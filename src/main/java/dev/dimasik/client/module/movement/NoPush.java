package dev.dimasik.client.module.movement;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;

public class NoPush extends Module {
   public ItemListSetting f_1652;
   private static final String f_1653 = "NoPush";
   private static final String f_1654 = "Убирает отталкивание от блоков и игроков";
   private static final String f_1655 = "Отталкивания";
   private static final String f_1656 = "Игроки";
   private static final String f_1657 = "Блоки";
   private static final String f_1658 = "Вода";
   private static final String f_1659 = "Удочка";

   public NoPush() {
      super(f_1653, f_1654, Category.MOVEMENT);
      this.f_1652 = new ItemListSetting(
         f_1655,
         new Class_2ZaVm8TGDJ68TnJB(f_1656, true),
         new Class_2ZaVm8TGDJ68TnJB(f_1657, false),
         new Class_2ZaVm8TGDJ68TnJB(f_1658, false),
         new Class_2ZaVm8TGDJ68TnJB(f_1659, false)
      );
      this.m_795(this.f_1652);
   }
}
