package dev.dimasik.client.system;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public class Class_CrK5npDk5KUpJvhf {
   private final JsonObject f_6304;

   public Class_CrK5npDk5KUpJvhf(JsonObject var1) {
      this.f_6304 = var1;
   }

   @Class_FUILRKIQ6wtWry59
   public Object m_2443(String var1) {
      JsonElement var2 = this.f_6304.get(var1);
      if (var2 != null && !var2.isJsonNull()) {
         if (var2.isJsonPrimitive()) {
            JsonPrimitive var3 = var2.getAsJsonPrimitive();
            if (var3.isBoolean()) {
               return var3.getAsBoolean();
            }

            if (var3.isNumber()) {
               Number var4 = var3.getAsNumber();
               double var5 = var4.doubleValue();
               if (var5 == (int)var5) {
                  return (int)var5;
               }

               if (var5 == (long)var5) {
                  return (long)var5;
               }

               return var5;
            }

            if (var3.isString()) {
               return var3.getAsString();
            }
         }

         return null;
      } else {
         return null;
      }
   }

   @Class_FUILRKIQ6wtWry59
   public Class_CrK5npDk5KUpJvhf m_2444(String var1) {
      JsonElement var2 = this.f_6304.get(var1);
      return var2 != null && var2.isJsonObject() ? new Class_CrK5npDk5KUpJvhf(var2.getAsJsonObject()) : null;
   }
}
