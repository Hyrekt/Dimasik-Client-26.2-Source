package dev.dimasik.client.module;

import dev.dimasik.client.system.Class_w8fCJQ5ZtH5lQbWc;
import lombok.Generated;

public enum Category {
   COMBAT("Combat", "b"),
   MOVEMENT("Movement", "c"),
   RENDER("Render", "d"),
   MISC("Misc", "f"),
   AUTOBUY("AutoBuy", "F"),
   COSMETICS("Cosmetics", "o"),
   THEMES("Themes", "e");

   private final String f_31065;
   private final String f_31066;
   private final Class_w8fCJQ5ZtH5lQbWc f_31067 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, 10.0F);

   @Generated
   public String m_8687() {
      return this.f_31065;
   }

   @Generated
   public String m_8688() {
      return this.f_31066;
   }

   @Generated
   public Class_w8fCJQ5ZtH5lQbWc m_8689() {
      return this.f_31067;
   }

   @Generated
   Category(String var3, String var4) {
      this.f_31065 = var3;
      this.f_31066 = var4;
   }
}
