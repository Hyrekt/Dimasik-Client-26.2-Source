package dev.dimasik.client.setting.impl;

import dev.dimasik.client.module.KeyBind;
import dev.dimasik.client.module.KeybindMode;
import dev.dimasik.client.setting.Setting;
import java.util.function.BooleanSupplier;
import lombok.Generated;

public class CheckboxSetting extends Setting<Boolean> {
   private final KeyBind f_14626 = new KeyBind(KeybindMode.TOGGLE, -1);

   @Generated
   public KeyBind m_5183() {
      return this.f_14626;
   }

   public CheckboxSetting(String var1, boolean var2) {
      super(var1, var2);
   }

   public CheckboxSetting m_822(BooleanSupplier var1) {
      this.m_8763(var1);
      return this;
   }
}
