package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;

public final class IRC extends Module {
   private static final String f_20864 = "IRC";
   private static final String f_20865 = "Глобальный чат пользователей клиента";

   public IRC() {
      super(f_20864, f_20865, Category.MISC);
      this.m_790(true);
   }
}
