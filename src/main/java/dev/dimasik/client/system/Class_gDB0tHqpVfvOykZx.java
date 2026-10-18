package dev.dimasik.client.system;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dev.dimasik.client.DimasikClient;
import java.util.Map.Entry;

public class Class_gDB0tHqpVfvOykZx extends Class_XWvsgVpnvA3CjeNU {
   private static final String f_20848 = "dimasik/client";
   private static final String f_20849 = "friend";
   private static final String f_20850 = "name";
   private static final String f_20851 = "fakeName";
   private static final String f_20852 = "name";
   private static final String f_20853 = "name";
   private static final String f_20854 = "name";
   private static final String f_20855 = "fakeName";
   private static final String f_20856 = "fakeName";
   private static final String f_20857 = "fakeName";

   @Override
   protected void m_808() {
      if (!this.m_5557().isEmpty()) {
         JsonParser var1 = new JsonParser();
         JsonObject var2 = var1.parse(this.m_5557()).getAsJsonObject();
         DimasikClient.m_9057().m_9049().m_2804().clear();

         for (Entry var4 : var2.entrySet()) {
            String var5 = (String)var4.getKey();
            String var6 = null;
            JsonElement var7 = (JsonElement)var4.getValue();
            if (var7.isJsonObject()) {
               JsonObject var8 = var7.getAsJsonObject();
               if (var8.has(f_20852) && !var8.get(f_20853).isJsonNull()) {
                  var5 = var8.get(f_20854).getAsString();
               }

               if (var8.has(f_20855) && !var8.get(f_20856).isJsonNull()) {
                  var6 = var8.get(f_20857).getAsString();
               }
            } else if (var7.isJsonPrimitive()) {
               String var9 = var7.getAsString();
               if (!var9.equalsIgnoreCase(var5)) {
                  var6 = var9;
               }
            }

            DimasikClient.m_9057().m_9049().m_2804().m_2873(var5, var6);
         }
      }
   }

   public Class_gDB0tHqpVfvOykZx() {
      super(f_20848, f_20849);
   }

   @Override
   protected void m_809() {
      JsonObject var1 = new JsonObject();

      for (Class_GOZclSP08fljqFSO var3 : DimasikClient.m_9057().m_9049().m_2804()) {
         JsonObject var4 = new JsonObject();
         var4.addProperty(f_20850, var3.m_2795());
         if (var3.m_2796()) {
            var4.addProperty(f_20851, var3.m_2797());
         }

         var1.add(var3.m_2795(), var4);
      }

      this.m_5558(var1);
   }
}
