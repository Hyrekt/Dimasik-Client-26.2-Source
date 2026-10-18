package dev.dimasik.client.system;

import com.google.gson.JsonParser;
import dev.dimasik.client.DimasikClient;
import java.nio.file.Files;

public final class Class_XQX01nM8iTANXGPn extends Class_XWvsgVpnvA3CjeNU {
   private static final String f_15968 = "dimasik/client";
   private static final String f_15969 = "swing_animations";

   @Override
   protected void m_809() {
      this.m_5558(DimasikClient.m_9057().m_9049().m_2801().m_3563().m_782());
   }

   public Class_XQX01nM8iTANXGPn() {
      super(f_15968, f_15969);
   }

   @Override
   protected void m_808() {
      if (!Files.isRegularFile(this.m_5555())) {
         this.m_5559();
      } else {
         String var1 = this.m_5557();
         if (!var1.isBlank()) {
            DimasikClient.m_9057().m_9049().m_2801().m_3563().m_791(JsonParser.parseString(var1).getAsJsonObject());
         }
      }
   }
}
