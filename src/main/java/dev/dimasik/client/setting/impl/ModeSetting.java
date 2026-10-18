package dev.dimasik.client.setting.impl;

import dev.dimasik.client.setting.Setting;
import dev.dimasik.client.system.Class_GJIB3xPYdVkyLk0A;
import java.util.function.BooleanSupplier;
import lombok.Generated;

public class ModeSetting extends Setting<String> {
   private Class_GJIB3xPYdVkyLk0A f_1651;

   @Generated
   public Class_GJIB3xPYdVkyLk0A m_1344() {
      return this.f_1651;
   }

   public ModeSetting m_822(BooleanSupplier var1) {
      this.m_8763(var1);
      return this;
   }

   public ModeSetting(String var1, String var2) {
      super(var1, var2);
   }

   public ModeSetting m_1345(Class_GJIB3xPYdVkyLk0A var1) {
      this.f_1651 = var1;
      return this;
   }
}
