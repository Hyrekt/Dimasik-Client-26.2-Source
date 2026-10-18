package dev.dimasik.client.setting.impl;

import dev.dimasik.client.setting.Setting;
import java.util.function.BooleanSupplier;

public class StringSetting extends Setting<String> {
   public StringSetting(String var1) {
      super(var1, "");
   }

   public StringSetting(String var1, BooleanSupplier var2) {
      this(var1);
      this.m_822(var2);
   }

   public StringSetting m_822(BooleanSupplier var1) {
      this.m_8763(var1);
      return this;
   }
}
