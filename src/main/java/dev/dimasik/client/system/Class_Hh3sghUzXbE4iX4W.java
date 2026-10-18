package dev.dimasik.client.system;

import com.google.gson.JsonObject;

public final class Class_Hh3sghUzXbE4iX4W {
   private final String f_8116;
   private final String f_8117;
   private static final String f_8118 = "label";
   private static final String f_8119 = "url";

   public static boolean m_2903(String var0) {
      return var0 == null || var0.isBlank();
   }

   public JsonObject m_2904() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(f_8118, this.f_8116);
      var1.addProperty(f_8119, this.f_8117);
      return var1;
   }

   public String m_2905() {
      return this.f_8116;
   }

   public boolean m_2906() {
      return !m_2903(this.f_8116) && !m_2903(this.f_8117);
   }

   public String m_2907() {
      return this.f_8117;
   }

   public Class_Hh3sghUzXbE4iX4W(String var1, String var2) {
      this.f_8116 = var1;
      this.f_8117 = var2;
   }
}
