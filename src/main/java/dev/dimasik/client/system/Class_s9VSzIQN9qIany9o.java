package dev.dimasik.client.system;

import java.util.Map;
import java.util.Map.Entry;

public record Class_s9VSzIQN9qIany9o(int version, Map<String, String> models) {
   public boolean valid() {
      if (this.version == 1 && this.models != null && this.models.size() <= Class_HSD91zSgdqsM5q0d.values().length) {
         for (Entry var2 : this.models.entrySet()) {
            if (var2.getKey() == null
               || ((String)var2.getKey()).isBlank()
               || ((String)var2.getKey()).length() > 24
               || var2.getValue() == null
               || ((String)var2.getValue()).isBlank()
               || ((String)var2.getValue()).length() > 64) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
