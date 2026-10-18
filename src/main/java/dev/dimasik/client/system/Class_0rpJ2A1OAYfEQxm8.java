package dev.dimasik.client.system;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.ChestStealer;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

public final class Class_0rpJ2A1OAYfEQxm8 extends Class_XWvsgVpnvA3CjeNU {
   private static final String f_451 = "dimasik/client";
   private static final String f_452 = "stealer";

   private ChestStealer m_807() {
      return DimasikClient.m_9057().m_9049().m_2801().m_3533();
   }

   @Override
   protected void m_808() {
      String var1 = this.m_5557();
      if (!var1.isEmpty()) {
         JsonObject var2 = JsonParser.parseString(var1).getAsJsonObject();
         LinkedHashSet var3 = new LinkedHashSet();

         for (Entry var5 : var2.entrySet()) {
            if (!((JsonElement)var5.getValue()).isJsonPrimitive()
               || !((JsonElement)var5.getValue()).getAsJsonPrimitive().isBoolean()
               || ((JsonElement)var5.getValue()).getAsBoolean()) {
               Identifier var6 = Identifier.tryParse((String)var5.getKey());
               if (var6 != null && BuiltInRegistries.ITEM.containsKey(var6)) {
                  var3.add(var6);
               }
            }
         }

         this.m_807().m_4080(var3);
      }
   }

   @Override
   protected void m_809() {
      JsonObject var1 = new JsonObject();

      for (Identifier var3 : this.m_807().m_4083()) {
         var1.addProperty(var3.toString(), true);
      }

      this.m_5558(var1);
   }

   public Class_0rpJ2A1OAYfEQxm8() {
      super(f_451, f_452);
   }
}
