package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.IntegerSetting;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_B6JOzHnwhU3pe4AO;
import dev.dimasik.client.system.Class_IJNgfuPB2JDUg8Ln;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.ui.screen.Screen_9;

public final class PlayerEmotes extends Module {
   private final IntegerSetting f_25998;
   private final CheckboxSetting f_25999;
   private final MultiChoiceSetting f_26000;
   private final Class_gEPk7yDw6CwIte87<Class_B6JOzHnwhU3pe4AO> f_26001;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_26002;
   private Screen_9 f_26003;
   private static final String f_26004 = "PlayerEmotes";
   private static final String f_26005 = "Колесо эмоций";
   private static final String f_26006 = "Emote menu";
   private static final String f_26007 = "Keep While Moving";
   private static final String f_26008 = "Видимость";
   private static final String f_26009 = "Все";
   private static final String f_26010 = "Только пати";
   private static final String f_26011 = "Только пати";

   private void m_7707(Class_B6JOzHnwhU3pe4AO var1) {
      if (var1.m_2117() == this.f_25998.m_8768()) {
         if (var1.m_2116() == 1 && f_11537.gui.screen() == null && f_11537.player != null && f_11537.player == f_11537.getCameraEntity()) {
            f_11537.gui.setScreen(new Screen_9(this, this.f_25998.m_8768()));
         } else if (var1.m_2116() == 0 && f_11537.gui.screen() instanceof Screen_9 var2) {
            var2.finish(true);
         }
      }
   }

   public void m_7708(Screen_9 var1) {
      this.f_26003 = var1;
   }

   public PlayerEmotes() {
      super(f_26004, f_26005, Category.MISC);
      this.f_25998 = new IntegerSetting(f_26006, 66);
      this.f_25999 = new CheckboxSetting(f_26007, false);
      this.f_26000 = new MultiChoiceSetting(f_26008, new Class_2ZaVm8TGDJ68TnJB(f_26009), new Class_2ZaVm8TGDJ68TnJB(f_26010));
      this.f_26001 = this::m_7707;
      this.f_26002 = this::m_7710;
      this.m_795(this.f_25998, this.f_25999, this.f_26000);
      Class_IJNgfuPB2JDUg8Ln.m_2973().m_2970(this::m_776, () -> this.f_26000.m_7568(f_26011), this.f_25999::m_8768);
   }

   @Override
   public void m_732() {
      Class_IJNgfuPB2JDUg8Ln.m_2973().m_2971();
      if (f_11537.gui.screen() instanceof Screen_9 var1) {
         var1.finish(false);
      }

      this.f_26003 = null;
   }

   private void m_7710(Class_bhRaN0YSSLQRYjPo var1) {
      if (this.f_26003 != null && var1.m_6083() != null) {
         if (this.f_26003.renderClosing(var1.m_6083())) {
            this.f_26003 = null;
         }
      }
   }
}
