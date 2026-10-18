package dev.dimasik.client.setting.impl;

import dev.dimasik.client.setting.Setting;
import java.util.function.BooleanSupplier;

public class BooleanSetting extends Setting<Boolean> {
   private Runnable f_2505;
   private boolean f_2506 = true;

   public Runnable m_1471() {
      return this.f_2505;
   }

   public BooleanSetting m_1472() {
      this.f_2506 = false;
      return this;
   }

   public boolean m_1473() {
      return this.f_2506;
   }

   public BooleanSetting m_822(BooleanSupplier var1) {
      this.m_8763(var1);
      return this;
   }

   public BooleanSetting m_1474(Runnable var1) {
      this.f_2505 = var1;
      return this;
   }

   public BooleanSetting(String var1) {
      super(var1, false);
   }
}
