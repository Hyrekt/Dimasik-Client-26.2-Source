package dev.dimasik.client.system;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import lombok.Generated;

public class Class_NemBs7k8zCRBUucm extends Class_XWvsgVpnvA3CjeNU {
   private String f_11527 = Class_cYd7Th4h1RbBLorm.CLASSIC.m_6196();
   private static final String f_11528 = "dimasik/client";
   private static final String f_11529 = "mainmenu";
   private static final String f_11530 = "theme";
   private static final String f_11531 = "theme";
   private static final String f_11532 = "theme";
   private static final String f_11533 = "theme";

   public Class_NemBs7k8zCRBUucm() {
      super(f_11528, f_11529);
   }

   public void m_4022(String var1) {
      this.f_11527 = Class_cYd7Th4h1RbBLorm.m_6214(var1).m_6196();
      this.m_5559();
   }

   @Override
   protected void m_809() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(f_11530, this.f_11527);
      this.m_5558(var1);
   }

   public Class_cYd7Th4h1RbBLorm m_4023() {
      return Class_cYd7Th4h1RbBLorm.m_6214(this.f_11527);
   }

   @Override
   protected void m_808() {
      String var1 = this.m_5557();
      if (var1 != null && !var1.isBlank()) {
         JsonObject var2 = JsonParser.parseString(var1).getAsJsonObject();
         if (var2.has(f_11531) && !var2.get(f_11532).isJsonNull()) {
            this.f_11527 = Class_cYd7Th4h1RbBLorm.m_6214(var2.get(f_11533).getAsString()).m_6196();
         }
      }
   }

   @Generated
   public String m_4024() {
      return this.f_11527;
   }
}
