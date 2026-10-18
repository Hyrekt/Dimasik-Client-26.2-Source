package dev.dimasik.client.setting.impl;

import dev.dimasik.client.setting.Setting;
import java.util.function.BooleanSupplier;
import lombok.Generated;

public class ColorSetting extends Setting<Integer> {
   private final int f_6408;
   private final boolean f_6409;

   @Generated
   public boolean m_2447() {
      return this.f_6409;
   }

   public ColorSetting(String var1, boolean var2, int var3) {
      super(var1, var3);
      this.f_6408 = var3;
      this.f_6409 = var2;
   }

   public ColorSetting(String var1, int var2) {
      this(var1, true, var2);
   }

   public ColorSetting m_822(BooleanSupplier var1) {
      this.m_8763(var1);
      return this;
   }

   @Generated
   public int m_2448() {
      return this.f_6408;
   }

   public float m_2449() {
      return this.m_8768() >>> 24 & 0xFF;
   }
}
