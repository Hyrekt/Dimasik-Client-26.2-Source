package dev.dimasik.client.module.combat;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.IntegerSetting;
import dev.dimasik.client.system.Class_B6JOzHnwhU3pe4AO;
import dev.dimasik.client.system.Class_EELhdLEtuZYiR6rw;
import dev.dimasik.client.system.Class_ftHu9o3WzCU3Adxm;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_pYAz0kgoyIbaaR5n;

public class AiTester extends Module {
   private final IntegerSetting f_34413;
   private final Class_EELhdLEtuZYiR6rw f_34414;
   private boolean f_34415;
   private final Class_gEPk7yDw6CwIte87<Class_B6JOzHnwhU3pe4AO> f_34416;
   private final Class_gEPk7yDw6CwIte87<Class_pYAz0kgoyIbaaR5n> f_34417;
   private static final String f_34418 = "AiTester";
   private static final String f_34419 = "Функция для разработчиков";
   private static final String f_34420 = "Record Bind";
   private static final String f_34421 = "Stopped recording";
   private static final String f_34422 = "Started recording";

   public void m_9344(Class_B6JOzHnwhU3pe4AO var1) {
      if (f_11537.gui.screen() == null && var1.m_2116() == 1 && var1.m_2117() == this.f_34413.m_8768()) {
         if (this.f_34415) {
            Class_ftHu9o3WzCU3Adxm.m_6731(f_34421);
            this.f_34414.m_2501();
            this.f_34415 = false;
         } else {
            Class_ftHu9o3WzCU3Adxm.m_6731(f_34422);
            this.f_34414.m_2490();
            this.f_34415 = true;
         }
      }
   }

   public void m_9345(Class_pYAz0kgoyIbaaR5n var1) {
      this.f_34414.m_2497(f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(true));
   }

   public AiTester() {
      super(f_34418, f_34419, Category.COMBAT);
      this.f_34413 = new IntegerSetting(f_34420, -1);
      this.f_34414 = new Class_EELhdLEtuZYiR6rw();
      this.f_34415 = false;
      this.f_34416 = this::m_9344;
      this.f_34417 = this::m_9345;
      this.m_795(this.f_34413);
   }
}
