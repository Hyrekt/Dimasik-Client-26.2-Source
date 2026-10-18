package dev.dimasik.client.system;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dev.dimasik.client.DimasikClient;

public class Class_8jWMtShKXpT6Bwm7 extends Class_XWvsgVpnvA3CjeNU {
   private static final String f_4293 = "dimasik/client";
   private static final String f_4294 = "draggable";
   private static final String f_4295 = "hud_without_config";
   private static final String f_4296 = "x";
   private static final String f_4297 = "y";
   private static final String f_4298 = "locked";
   private static final String f_4299 = "x";
   private static final String f_4300 = "x";
   private static final String f_4301 = "y";
   private static final String f_4302 = "y";
   private static final String f_4303 = "locked";
   private static final String f_4304 = "locked";
   private static final String f_4305 = ":";

   @Override
   protected void m_808() {
      if (!this.m_5557().isEmpty()) {
         JsonParser var1 = new JsonParser();
         JsonObject var2 = var1.parse(this.m_5557()).getAsJsonObject();
         m_1867(var2);
      }
   }

   public Class_8jWMtShKXpT6Bwm7() {
      super(f_4293, f_4294);
   }

   public static void m_1867(JsonObject var0) {
      for (Class_NO6SuGqq3FB7jQDZ var2 : DimasikClient.m_9057().m_9049().m_2808()) {
         if (var0.has(var2.m_4006())) {
            if (var0.get(var2.m_4006()).isJsonObject()) {
               JsonObject var3 = var0.getAsJsonObject(var2.m_4006());
               if (var3.has(f_4299)) {
                  var2.m_3997(var3.get(f_4300).getAsFloat());
               }

               if (var3.has(f_4301)) {
                  var2.m_4008(var3.get(f_4302).getAsFloat());
               }

               if (var2 instanceof Class_UiQ3442HnvvsK2qb var4 && var3.has(f_4303)) {
                  var4.m_5275(var3.get(f_4304).getAsBoolean());
               }
            } else {
               String[] var5 = var0.get(var2.m_4006()).getAsString().split(f_4305);
               if (var5.length == 2) {
                  var2.m_3997(Float.parseFloat(var5[0]));
                  var2.m_4008(Float.parseFloat(var5[1]));
               }
            }
         }
      }
   }

   public static JsonObject m_1868() {
      JsonObject var0 = new JsonObject();

      for (Class_NO6SuGqq3FB7jQDZ var2 : DimasikClient.m_9057().m_9049().m_2808()) {
         if (!var2.m_4006().equals(f_4295) && !(var2 instanceof Class_UiQ3442HnvvsK2qb var3 && !var3.m_5280())) {
            JsonObject var5 = new JsonObject();
            var5.addProperty(f_4296, var2.m_3998());
            var5.addProperty(f_4297, var2 instanceof Class_ND5nzva71juYlk72 var4 ? var4.m_3991() : var2.m_3993());
            if (var2 instanceof Class_UiQ3442HnvvsK2qb var6) {
               var5.addProperty(f_4298, var6.m_5270());
            }

            var0.add(var2.m_4006(), var5);
         }
      }

      return var0;
   }

   @Override
   protected void m_809() {
      this.m_5558(m_1868());
   }
}
