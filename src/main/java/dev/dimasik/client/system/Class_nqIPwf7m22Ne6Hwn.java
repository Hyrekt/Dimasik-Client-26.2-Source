package dev.dimasik.client.system;

import com.google.gson.JsonObject;

public class Class_nqIPwf7m22Ne6Hwn {
   private String f_25993;
   private String f_25994;
   private Class_nqIPwf7m22Ne6Hwn.QmxbiXdy7zEJZU53 f_25995;
   private Class_nqIPwf7m22Ne6Hwn.Class_3EwvsJGSdcPpbQc4 f_25996;

   public void m_7699(String var1, String var2) {
      if (this.f_25995 == null) {
         this.f_25995 = new Class_nqIPwf7m22Ne6Hwn.QmxbiXdy7zEJZU53();
      }

      this.f_25995.f_25991 = var1;
      this.f_25995.f_25992 = var2;
   }

   public void m_7700(String var1) {
      this.f_25994 = var1;
   }

   public void m_7701(String var1) {
      this.f_25993 = var1;
   }

   public void m_7702(long var1) {
      if (this.f_25996 == null) {
         this.f_25996 = new Class_nqIPwf7m22Ne6Hwn.Class_3EwvsJGSdcPpbQc4();
      }

      this.f_25996.f_25988 = var1;
   }

   public void m_7703(String var1, String var2) {
      if (this.f_25995 == null) {
         this.f_25995 = new Class_nqIPwf7m22Ne6Hwn.QmxbiXdy7zEJZU53();
      }

      this.f_25995.f_25989 = var1;
      this.f_25995.f_25990 = var2;
   }

   public void m_7704(long var1) {
      if (this.f_25996 == null) {
         this.f_25996 = new Class_nqIPwf7m22Ne6Hwn.Class_3EwvsJGSdcPpbQc4();
      }

      this.f_25996.f_25987 = var1;
   }

   public JsonObject m_2880() {
      JsonObject var1 = new JsonObject();
      if (this.f_25993 != null) {
         var1.addProperty("details", this.f_25993);
      }

      if (this.f_25994 != null) {
         var1.addProperty("state", this.f_25994);
      }

      if (this.f_25995 != null) {
         JsonObject var2 = new JsonObject();
         if (this.f_25995.f_25989 != null) {
            var2.addProperty("large_image", this.f_25995.f_25989);
         }

         if (this.f_25995.f_25990 != null) {
            var2.addProperty("large_text", this.f_25995.f_25990);
         }

         if (this.f_25995.f_25991 != null) {
            var2.addProperty("small_image", this.f_25995.f_25991);
         }

         if (this.f_25995.f_25992 != null) {
            var2.addProperty("small_text", this.f_25995.f_25992);
         }

         var1.add("assets", var2);
      }

      if (this.f_25996 != null) {
         JsonObject var3 = new JsonObject();
         if (this.f_25996.f_25987 != null) {
            var3.addProperty("start", this.f_25996.f_25987);
         }

         if (this.f_25996.f_25988 != null) {
            var3.addProperty("end", this.f_25996.f_25988);
         }

         var1.add("timestamps", var3);
      }

      return var1;
   }

   public static class Class_3EwvsJGSdcPpbQc4 {
      public Long f_25987;
      public Long f_25988;
   }

   public static class QmxbiXdy7zEJZU53 {
      public String f_25989;
      public String f_25990;
      public String f_25991;
      public String f_25992;
   }
}
