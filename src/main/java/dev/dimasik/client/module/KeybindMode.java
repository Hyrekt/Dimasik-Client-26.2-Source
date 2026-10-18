package dev.dimasik.client.module;

import lombok.Generated;

public enum KeybindMode {
   TOGGLE("Toggle"),
   HOLD("Hold");

   private final String f_16989;

   public static KeybindMode m_5839(String var0) {
      return var0.equals("Hold") ? HOLD : TOGGLE;
   }

   @Generated
   public String m_5840() {
      return this.f_16989;
   }

   @Generated
   KeybindMode(String var3) {
      this.f_16989 = var3;
   }
}
