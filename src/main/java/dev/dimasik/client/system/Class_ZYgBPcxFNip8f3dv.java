package dev.dimasik.client.system;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.ArrayList;
import java.util.List;

public final class Class_ZYgBPcxFNip8f3dv extends Class_XWvsgVpnvA3CjeNU {
   private final List<Class_ZYgBPcxFNip8f3dv.WwQ3Cc1ZPUG2jZTW> f_16936 = new ArrayList<>();
   private static final String f_16937 = "dimasik/client";
   private static final String f_16938 = "accounts";
   private static final String f_16939 = "name";
   private static final String f_16940 = "date";
   private static final String f_16941 = "favorite";
   private static final String f_16942 = "accounts";
   private static final String f_16943 = "accounts";
   private static final String f_16944 = "accounts";
   private static final String f_16945 = "accounts";
   private static final String f_16946 = "name";
   private static final String f_16947 = "date";
   private static final String f_16948 = "name";
   private static final String f_16949 = "date";
   private static final String f_16950 = "favorite";
   private static final String f_16951 = "favorite";

   public List<Class_ZYgBPcxFNip8f3dv.WwQ3Cc1ZPUG2jZTW> m_5823() {
      return List.copyOf(this.f_16936);
   }

   public void m_5824(List<Class_ZYgBPcxFNip8f3dv.WwQ3Cc1ZPUG2jZTW> var1) {
      this.f_16936.clear();
      this.f_16936.addAll(var1);
      this.m_5559();
   }

   @Override
   protected void m_809() {
      JsonObject var1 = new JsonObject();
      JsonArray var2 = new JsonArray();

      for (Class_ZYgBPcxFNip8f3dv.WwQ3Cc1ZPUG2jZTW var4 : this.f_16936) {
         JsonObject var5 = new JsonObject();
         var5.addProperty(f_16939, var4.name());
         var5.addProperty(f_16940, var4.date());
         var5.addProperty(f_16941, var4.favorite());
         var2.add(var5);
      }

      var1.add(f_16942, var2);
      this.m_5558(var1);
   }

   public Class_ZYgBPcxFNip8f3dv() {
      super(f_16937, f_16938);
   }

   @Override
   protected void m_808() {
      this.f_16936.clear();
      String var1 = this.m_5557();
      if (var1 != null && !var1.isBlank()) {
         JsonObject var2 = JsonParser.parseString(var1).getAsJsonObject();
         if (var2.has(f_16943) && var2.get(f_16944).isJsonArray()) {
            for (JsonElement var4 : var2.getAsJsonArray(f_16945)) {
               if (var4.isJsonObject()) {
                  JsonObject var5 = var4.getAsJsonObject();
                  if (var5.has(f_16946) && var5.has(f_16947)) {
                     String var6 = var5.get(f_16948).getAsString();
                     String var7 = var5.get(f_16949).getAsString();
                     boolean var8 = var5.has(f_16950) && var5.get(f_16951).getAsBoolean();
                     if (!var6.isBlank()) {
                        this.f_16936.add(new Class_ZYgBPcxFNip8f3dv.WwQ3Cc1ZPUG2jZTW(var6, var7, var8));
                     }
                  }
               }
            }
         }
      }
   }

   public record WwQ3Cc1ZPUG2jZTW(String name, String date, boolean favorite) {
   }
}
