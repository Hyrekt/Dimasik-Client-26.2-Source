package dev.dimasik.client.system;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dev.dimasik.client.DimasikClient;
import java.util.Map.Entry;

public class Class_pZElkB6ygH79lgXP extends Class_XWvsgVpnvA3CjeNU {
   private static final String f_28488 = "dimasik/client";
   private static final String f_28489 = "macro";

   public Class_pZElkB6ygH79lgXP() {
      super(f_28488, f_28489);
   }

   @Override
   protected void m_808() {
      if (!this.m_5557().isEmpty()) {
         JsonParser var1 = new JsonParser();
         JsonObject var2 = var1.parse(this.m_5557()).getAsJsonObject();
         DimasikClient.m_9057().m_9049().m_2807().clear();

         for (Entry var4 : var2.entrySet()) {
            DimasikClient.m_9057().m_9049().m_2807().add(new Class_q5Do365fnkZh6Wbu((String)var4.getKey(), ((JsonElement)var4.getValue()).getAsInt()));
         }
      }
   }

   @Override
   protected void m_809() {
      JsonObject var1 = new JsonObject();

      for (Class_q5Do365fnkZh6Wbu var3 : DimasikClient.m_9057().m_9049().m_2807()) {
         var1.addProperty(var3.m_8325(), var3.m_8326());
      }

      this.m_5558(var1);
   }
}
