package dev.dimasik.client.system;

import dev.dimasik.client.setting.impl.ItemListSetting;

public enum Class_MP0Q3Izlf2HSndyS {
   ARMOR("Броня"),
   EFFECTS("Эффекты зелий"),
   SELF_USE("Мои предметы"),
   PLAYER_USE("Предметы игроков"),
   TNT("TNT рядом"),
   MODULES("Модули"),
   OTHER("Прочее");

   private final String f_11142;

   Class_MP0Q3Izlf2HSndyS(String var3) {
      this.f_11142 = var3;
   }

   public boolean m_3887(ItemListSetting var1) {
      return var1.m_7145(this.f_11142);
   }

   public static ItemListSetting m_3888() {
      Class_MP0Q3Izlf2HSndyS[] var0 = values();
      Class_2ZaVm8TGDJ68TnJB[] var1 = new Class_2ZaVm8TGDJ68TnJB[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2] = new Class_2ZaVm8TGDJ68TnJB(var0[var2].f_11142, true);
      }

      return new ItemListSetting("Типы уведомлений", var1);
   }
}
