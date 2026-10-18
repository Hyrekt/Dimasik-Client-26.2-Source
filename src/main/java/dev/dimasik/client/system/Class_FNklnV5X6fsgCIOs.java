package dev.dimasik.client.system;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.HashMap;
import java.util.Map.Entry;
import lombok.Generated;

public class Class_FNklnV5X6fsgCIOs {
   private final HashMap<String, String> f_7480 = new HashMap<>();
   private Class_fCHjdXAWhJKgAVQd f_7481 = new Class_qz5xOUUFwlMAJLvd();

   @Generated
   public HashMap<String, String> m_2646() {
      return this.f_7480;
   }

   public Class_FNklnV5X6fsgCIOs() {
      this.m_2648();
   }

   public void m_2647(Class_fCHjdXAWhJKgAVQd var1) {
      this.f_7481 = var1;
      this.m_2648();
   }

   private void m_2648() {
      String var1 = this.f_7481.m_6460();
      if (var1 == null) {
         System.out.println("Error with language!");
      } else {
         JsonObject var2 = JsonParser.parseString(var1).getAsJsonObject();
         this.f_7480.clear();

         for (Entry var4 : var2.entrySet()) {
            this.f_7480.put((String)var4.getKey(), ((JsonElement)var4.getValue()).getAsString());
         }
      }
   }
}
