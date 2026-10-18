package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_CfVCvIKlP96CnB1Y;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.mixin.MultiPlayerGameModeMixin;

public class FastBreak extends Module {
   private final SliderSetting f_28008;
   private final Class_gEPk7yDw6CwIte87<Class_CfVCvIKlP96CnB1Y> f_28009;
   private static final String f_28010 = "FastBreak";
   private static final String f_28011 = "Позволяет быстро ломать блоки";
   private static final String f_28012 = "Скорость";
   private static final float f_28013 = 0.8F;
   private static final float f_28014 = 0.1F;
   private static final float f_28015 = 0.1F;

   public void m_7964(Class_CfVCvIKlP96CnB1Y var1) {
      if (f_11537.gameMode != null) {
         MultiPlayerGameModeMixin var2 = (MultiPlayerGameModeMixin)f_11537.gameMode;
         var2.setBlockBreakingCooldown(0);
         if (var2.getCurrentBreakingProgress() > this.f_28008.m_8768()) {
            var2.setCurrentBreakingProgress(1.0F);
         }
      }
   }

   public FastBreak() {
      super(f_28010, f_28011, Category.MISC);
      this.f_28008 = new SliderSetting(f_28012, f_28013, f_28014, 1.0F).m_828(f_28015);
      this.f_28009 = this::m_7964;
      this.m_795(this.f_28008);
   }
}
