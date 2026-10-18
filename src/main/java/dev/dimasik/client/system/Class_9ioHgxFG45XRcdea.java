package dev.dimasik.client.system;

import dev.dimasik.client.setting.impl.ItemListSetting;
import lombok.Generated;

public enum Class_9ioHgxFG45XRcdea {
   CLIENT("Клиент", true),
   USERNAME("Ник", true),
   FPS("FPS", true),
   PING("Пинг", true),
   CFG("Конфиг", false),
   f_4789("Айпи сервера", false),
   LOSS("MS Loss", false),
   USEMEMORY("Используемая память", false),
   TPS("ТПС", false),
   GPU("GPU", false),
   TIME("Время", false),
   BRAND("Версия клиента", false);

   private final String f_4790;
   private final boolean f_4791;

   public boolean m_1985(ItemListSetting var1) {
      return var1.m_7145(this.f_4790);
   }

   public static ItemListSetting m_1986() {
      Class_2ZaVm8TGDJ68TnJB[] var0 = new Class_2ZaVm8TGDJ68TnJB[values().length];

      for (int var1 = 0; var1 < var0.length; var1++) {
         var0[var1] = new Class_2ZaVm8TGDJ68TnJB(values()[var1].f_4790, values()[var1].f_4791);
      }

      return new ItemListSetting("Элементы WaterMark", var0);
   }

   @Generated
   public String m_1987() {
      return this.f_4790;
   }

   @Generated
   public boolean m_1988() {
      return this.f_4791;
   }

   @Generated
   Class_9ioHgxFG45XRcdea(String var3, boolean var4) {
      this.f_4790 = var3;
      this.f_4791 = var4;
   }
}
