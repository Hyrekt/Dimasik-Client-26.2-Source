package dev.dimasik.client.system;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.nio.file.Files;
import java.util.ArrayList;

public class Class_JJ2rV4BR05zxdDVz extends Class_XWvsgVpnvA3CjeNU {
   private final Class_3DEWOEl8zI8DBsJL f_9633;
   private boolean f_9634;
   private static final String f_9635 = "dimasik/configs";
   private static final String f_9636 = "themes";
   private static final String f_9637 = "current";
   private static final String f_9638 = "active";
   private static final String f_9639 = "name";
   private static final String f_9640 = "creator";
   private static final String f_9641 = "colors";
   private static final String f_9642 = "themes";
   private static final String f_9643 = "current";
   private static final String f_9644 = "current";
   private static final String f_9645 = "themes";
   private static final String f_9646 = "themes";
   private static final String f_9647 = "themes";
   private static final String f_9648 = "name";
   private static final String f_9649 = "colors";
   private static final String f_9650 = "colors";
   private static final String f_9651 = "name";
   private static final String f_9652 = "creator";
   private static final String f_9653 = "creator";
   private static final String f_9654 = "Unknown";
   private static final String f_9655 = "colors";
   private static final String f_9656 = "active";
   private static final String f_9657 = "active";
   private static final String f_9658 = "active";

   @Override
   protected void m_809() {
      if (this.f_9634) {
         JsonObject var1 = new JsonObject();
         var1.addProperty(f_9637, this.f_9633.m_1220());
         var1.add(f_9638, this.f_9633.m_1234());
         JsonArray var2 = new JsonArray();

         for (Class_TLKj0wt8AJxKO3Vd var4 : this.f_9633.m_1246()) {
            JsonObject var5 = new JsonObject();
            var5.addProperty(f_9639, var4.m_4983());
            var5.addProperty(f_9640, var4.m_4984());
            JsonArray var6 = new JsonArray();

            for (int var10 : var4.m_4982()) {
               var6.add(var10);
            }

            var5.add(f_9641, var6);
            var2.add(var5);
         }

         var1.add(f_9642, var2);
         this.m_5558(var1);
      }
   }

   public Class_JJ2rV4BR05zxdDVz(Class_3DEWOEl8zI8DBsJL var1) {
      super(f_9635, f_9636);
      this.f_9633 = var1;
   }

   @Override
   protected void m_808() {
      this.f_9634 = false;
      String var1 = this.m_5557();
      if (var1 != null && !var1.isBlank()) {
         JsonElement var2 = JsonParser.parseString(var1);
         if (var2.isJsonObject()) {
            JsonObject var3 = var2.getAsJsonObject();
            String var4 = var3.has(f_9643) ? var3.get(f_9644).getAsString() : "";
            ArrayList var5 = new ArrayList();
            if (var3.has(f_9645) && var3.get(f_9646).isJsonArray()) {
               for (JsonElement var8 : var3.getAsJsonArray(f_9647)) {
                  if (var8.isJsonObject()) {
                     JsonObject var9 = var8.getAsJsonObject();
                     if (var9.has(f_9648) && var9.has(f_9649) && var9.get(f_9650).isJsonArray()) {
                        String var10 = var9.get(f_9651).getAsString();
                        String var11 = var9.has(f_9652) ? var9.get(f_9653).getAsString() : f_9654;
                        JsonArray var12 = var9.getAsJsonArray(f_9655);
                        int[] var13 = new int[var12.size()];

                        for (int var14 = 0; var14 < var12.size(); var14++) {
                           var13[var14] = var12.get(var14).getAsInt();
                        }

                        var5.add(new Class_TLKj0wt8AJxKO3Vd(var10, var11, true, var13));
                     }
                  }
               }
            }

            JsonObject var15 = var3.has(f_9656) && var3.get(f_9657).isJsonObject() ? var3.getAsJsonObject(f_9658) : null;
            this.f_9633.m_1259(var5, var4, var15);
            this.f_9634 = true;
         }
      } else {
         this.f_9634 = !Files.exists(this.m_5555());
      }
   }
}
