package dev.dimasik.client.system;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public final class Class_quxPIL1zsi4ypAOk extends Class_XWvsgVpnvA3CjeNU {
   private final Class_XHmGFP4pbXhGQRa5 f_30010;
   private static final String f_30011 = "dimasik/configs";
   private static final String f_30012 = "soundpad";
   private static final String f_30013 = "HearLocal";
   private static final String f_30014 = "LocalVolume";
   private static final String f_30015 = "Bindings";
   private static final String f_30016 = "HearLocal";
   private static final String f_30017 = "HearLocal";
   private static final String f_30018 = "LocalVolume";
   private static final String f_30019 = "LocalVolume";
   private static final float f_30020 = 0.8F;
   private static final String f_30021 = "Bindings";
   private static final String f_30022 = "Bindings";
   private static final String f_30023 = "Bindings";

   @Override
   protected void m_809() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(f_30013, this.f_30010.m_5551());
      var1.addProperty(f_30014, this.f_30010.m_5550());
      JsonObject var2 = new JsonObject();

      for (Entry var4 : this.f_30010.m_5547().entrySet()) {
         var2.addProperty((String)var4.getKey(), (Number)var4.getValue());
      }

      var1.add(f_30015, var2);
      this.m_5558(var1);
   }

   @Override
   protected void m_808() {
      String var1 = this.m_5557();
      if (!var1.isBlank()) {
         JsonObject var2 = new JsonParser().parse(var1).getAsJsonObject();
         boolean var3 = !var2.has(f_30016) || var2.get(f_30017).getAsBoolean();
         float var4 = var2.has(f_30018) ? var2.get(f_30019).getAsFloat() : f_30020;
         LinkedHashMap var5 = new LinkedHashMap();
         if (var2.has(f_30021) && var2.get(f_30022).isJsonObject()) {
            for (Entry var7 : var2.getAsJsonObject(f_30023).entrySet()) {
               var5.put((String)var7.getKey(), ((JsonElement)var7.getValue()).getAsInt());
            }
         }

         this.f_30010.m_5533(var5, var3, var4);
         this.f_30010.m_5541(false);
      }
   }

   public Class_quxPIL1zsi4ypAOk(Class_XHmGFP4pbXhGQRa5 var1) {
      super(f_30011, f_30012);
      this.f_30010 = var1;
   }
}
