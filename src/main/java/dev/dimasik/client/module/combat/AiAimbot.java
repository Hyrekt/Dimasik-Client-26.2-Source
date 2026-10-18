package dev.dimasik.client.module.combat;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.system.Class_CnKFiqMeTMD39m4H;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_pYAz0kgoyIbaaR5n;

public class AiAimbot extends Module {
   private final Class_CnKFiqMeTMD39m4H f_14606;
   private final Class_gEPk7yDw6CwIte87<Class_pYAz0kgoyIbaaR5n> f_14607 = this::m_5159;
   private static final String f_14608 = "AiAimbot";
   private static final String f_14609 = "Функция для разработчиков";

   public void m_5159(Class_pYAz0kgoyIbaaR5n var1) {
      this.f_14606.m_2439();
      Class_CnKFiqMeTMD39m4H.m_2435(f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true));
   }

   public AiAimbot() {
      super(f_14608, f_14609, Category.COMBAT);
      this.f_14606 = new Class_CnKFiqMeTMD39m4H();
      this.f_14606.m_2437();
   }
}
