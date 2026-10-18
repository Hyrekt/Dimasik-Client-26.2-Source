package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.IntegerSetting;
import dev.dimasik.client.system.Class_8UIDpbIRPAjhei7m;
import dev.dimasik.client.system.Class_B6JOzHnwhU3pe4AO;
import dev.dimasik.client.system.Class_JG8EQkxMGm8yNbUr;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;

public class MusicPlayer extends Module {
   private final IntegerSetting f_31068;
   private final IntegerSetting f_31069;
   private final IntegerSetting f_31070;
   private final CheckboxSetting f_31071;
   private final Class_gEPk7yDw6CwIte87<Class_B6JOzHnwhU3pe4AO> f_31072;
   private static final String f_31073 = "MusicPlayer";
   private static final String f_31074 = "Плеер того, что играет в браузере";
   private static final String f_31075 = "Кнопка плей/пауза";
   private static final String f_31076 = "Кнопка следующего трека";
   private static final String f_31077 = "Кнопка предыдущего трека";
   private static final String f_31078 = "Уведомления";
   private static final String f_31079 = "Пауза";
   private static final String f_31080 = "Следующий трек";
   private static final String f_31081 = "Предыдущий трек";
   private static final String f_31082 = "Воспроизведение";
   private static final String f_31083 = "M";
   private static final String f_31084 = "Музыка";

   private void m_8690(Class_B6JOzHnwhU3pe4AO var1) {
      if (f_11537.gui.screen() == null && var1.m_2116() == 1) {
         int var2 = var1.m_2117();
         if (var2 != -1) {
            if (var2 == this.f_31068.m_8768()) {
               this.m_8694();
            } else if (var2 == this.f_31069.m_8768()) {
               this.m_8692();
            } else if (var2 == this.f_31070.m_8768()) {
               this.m_8696();
            }
         }
      }
   }

   public MusicPlayer() {
      super(f_31073, f_31074, Category.MISC);
      this.f_31068 = new IntegerSetting(f_31075, -1);
      this.f_31069 = new IntegerSetting(f_31076, -1);
      this.f_31070 = new IntegerSetting(f_31077, -1);
      this.f_31071 = new CheckboxSetting(f_31078, true);
      this.f_31072 = this::m_8690;
      this.m_795(this.f_31068, this.f_31069, this.f_31070, this.f_31071);
   }

   private String m_8691(Class_JG8EQkxMGm8yNbUr var1) {
      return var1.m_3213() ? var1.m_3237() : f_31082;
   }

   public void m_8692() {
      Class_JG8EQkxMGm8yNbUr.m_3226().m_3219();
      this.m_8693(f_31080);
   }

   private void m_8693(String var1) {
      if (this.f_31071.m_8768()) {
         Class_8UIDpbIRPAjhei7m.m_1786(f_31083, var1, f_31084, -1);
      }
   }

   public void m_8694() {
      Class_JG8EQkxMGm8yNbUr var1 = Class_JG8EQkxMGm8yNbUr.m_3226();
      boolean var2 = var1.m_3245();
      var1.m_3251();
      this.m_8693(var2 ? f_31079 : this.m_8691(var1));
   }

   @Override
   public void m_778() {
      Class_JG8EQkxMGm8yNbUr.m_3226().m_3217();
   }

   public void m_8695(int var1) {
      Class_JG8EQkxMGm8yNbUr.m_3226().m_3249(var1);
   }

   @Override
   public void m_732() {
      Class_JG8EQkxMGm8yNbUr.m_3226().m_3209();
   }

   public void m_8696() {
      Class_JG8EQkxMGm8yNbUr.m_3226().m_3211();
      this.m_8693(f_31081);
   }
}
