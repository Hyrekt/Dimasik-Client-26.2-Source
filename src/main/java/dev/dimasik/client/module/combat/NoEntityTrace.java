package dev.dimasik.client.module.combat;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;

public class NoEntityTrace extends Module {
   private static final String f_8239 = "NoEntityTrace";
   private static final String f_8240 = "Отменяет урон по сущностям";

   public NoEntityTrace() {
      super(f_8239, f_8240, Category.COMBAT);
   }
}
