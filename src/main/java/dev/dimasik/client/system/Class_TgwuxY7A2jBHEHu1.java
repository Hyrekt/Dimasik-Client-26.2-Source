package dev.dimasik.client.system;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.HeadSwap;
import net.minecraft.resources.Identifier;

public final class Class_TgwuxY7A2jBHEHu1 extends Class_XWvsgVpnvA3CjeNU {
   private static final String f_14037 = "dimasik/client";
   private static final String f_14038 = "headswap";
   private static final String f_14039 = "item";
   private static final String f_14040 = "name";
   private static final String f_14041 = "item";
   private static final String f_14042 = "name";
   private static final String f_14043 = "item";
   private static final String f_14044 = "name";

   @Override
   protected void m_809() {
      JsonObject var1 = new JsonObject();
      HeadSwap var2 = this.m_5019();
      if (var2.m_5410()) {
         Identifier var3 = var2.m_5422();
         if (var3 != null) {
            var1.addProperty(f_14039, var3.toString());
         }

         var1.addProperty(f_14040, var2.m_5411());
      }

      this.m_5558(var1);
   }

   public Class_TgwuxY7A2jBHEHu1() {
      super(f_14037, f_14038);
   }

   @Override
   protected void m_808() {
      String var1 = this.m_5557();
      if (!var1.isEmpty()) {
         JsonObject var2 = JsonParser.parseString(var1).getAsJsonObject();
         if (var2.has(f_14041) && var2.has(f_14042)) {
            Identifier var3 = Identifier.tryParse(var2.get(f_14043).getAsString());
            String var4 = var2.get(f_14044).getAsString();
            this.m_5019().m_5409(var3, var4);
         } else {
            this.m_5019().m_5407();
         }
      }
   }

   private HeadSwap m_5019() {
      return DimasikClient.m_9057().m_9049().m_2801().m_3466();
   }
}
