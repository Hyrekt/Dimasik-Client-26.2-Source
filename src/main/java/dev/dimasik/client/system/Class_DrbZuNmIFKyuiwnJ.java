package dev.dimasik.client.system;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dev.dimasik.client.DimasikClient;
import java.util.ArrayList;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

public final class Class_DrbZuNmIFKyuiwnJ extends Class_XWvsgVpnvA3CjeNU {
   private static final String f_6690 = "dimasik/client";
   private static final String f_6691 = "blockesp";
   private static final String f_6692 = "target";
   private static final String f_6693 = "color";
   private static final String f_6694 = "blockesp";
   private static final String f_6695 = "blockesp";
   private static final String f_6696 = "color";
   private static final String f_6697 = "target";
   private static final String f_6698 = "target";
   private static final String f_6699 = "block";
   private static final String f_6700 = "block";
   private static final String f_6701 = "color";
   private static final int f_6702 = 16777215;

   private Class_J32sUe2fy1OIemnb m_2484() {
      return DimasikClient.m_9057().m_9049().m_2810();
   }

   public Class_DrbZuNmIFKyuiwnJ() {
      super(f_6690, f_6691);
   }

   @Override
   protected void m_809() {
      JsonArray var1 = new JsonArray();

      for (Class_J32sUe2fy1OIemnb.Oybn1scxKSxj8sN9 var3 : this.m_2484().m_3166()) {
         JsonObject var4 = new JsonObject();
         var4.addProperty(f_6692, var3.target());
         var4.addProperty(f_6693, var3.color());
         var1.add(var4);
      }

      JsonObject var5 = new JsonObject();
      var5.add(f_6694, var1);
      this.m_5558(var5);
   }

   @Override
   protected void m_808() {
      String var1 = this.m_5557();
      if (!var1.isEmpty()) {
         JsonObject var2 = JsonParser.parseString(var1).getAsJsonObject();
         JsonArray var3 = var2.getAsJsonArray(f_6695);
         if (var3 != null) {
            ArrayList var4 = new ArrayList();

            for (JsonElement var6 : var3) {
               if (var6.isJsonObject()) {
                  JsonObject var7 = var6.getAsJsonObject();
                  if (var7.has(f_6696)) {
                     String var8 = var7.has(f_6697) ? f_6698 : (var7.has(f_6699) ? f_6700 : null);
                     if (var8 != null) {
                        String var9 = Class_J32sUe2fy1OIemnb.m_3169(var7.get(var8).getAsString());
                        if (var9 != null) {
                           Identifier var10 = Identifier.tryParse(var9);
                           if (var10 != null && (BuiltInRegistries.BLOCK.containsKey(var10) || BuiltInRegistries.ENTITY_TYPE.containsKey(var10))) {
                              var4.add(new Class_J32sUe2fy1OIemnb.Oybn1scxKSxj8sN9(var9, var7.get(f_6701).getAsInt() & f_6702));
                           }
                        }
                     }
                  }
               }
            }

            this.m_2484().m_3161(var4);
         }
      }
   }
}
