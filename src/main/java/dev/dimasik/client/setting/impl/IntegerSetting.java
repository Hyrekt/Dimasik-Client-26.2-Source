package dev.dimasik.client.setting.impl;

import dev.dimasik.client.setting.Setting;
import java.util.function.BooleanSupplier;

public class IntegerSetting extends Setting<Integer> {
   public IntegerSetting m_822(BooleanSupplier var1) {
      this.m_8763(var1);
      return this;
   }

   public IntegerSetting(String var1, int var2) {
      super(var1, var2);
   }

   public IntegerSetting(String var1, BooleanSupplier var2) {
      super(var1, -1);
      this.m_822(var2);
   }

   public IntegerSetting(String var1, int var2, BooleanSupplier var3) {
      super(var1, var2);
      this.m_822(var3);
   }

   public IntegerSetting(String var1) {
      super(var1, -1);
   }
}
