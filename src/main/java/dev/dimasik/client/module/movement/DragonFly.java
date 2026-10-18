package dev.dimasik.client.module.movement;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_QBKwWNWLlChWViO9;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;

public class DragonFly extends Module {
   private final SliderSetting f_30716;
   private final SliderSetting f_30717;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_30718;
   private static final String f_30719 = "DragonFly";
   private static final String f_30720 = "Ускоряет полет на /fly";
   private static final String f_30721 = "Speed XZ";
   private static final float f_30722 = 1.012F;
   private static final float f_30723 = 0.1F;
   private static final float f_30724 = 5.0F;
   private static final float f_30725 = 0.1F;
   private static final String f_30726 = "Speed Y";
   private static final float f_30727 = 0.1F;
   private static final float f_30728 = 5.0F;
   private static final float f_30729 = 0.1F;

   public DragonFly() {
      super(f_30719, f_30720, Category.MOVEMENT);
      this.f_30716 = new SliderSetting(f_30721, f_30722, f_30723, f_30724).m_828(f_30725);
      this.f_30717 = new SliderSetting(f_30726, 1.0F, f_30727, f_30728).m_828(f_30729);
      this.f_30718 = this::m_8640;
      this.m_795(this.f_30716, this.f_30717);
   }

   public void m_8640(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player.getAbilities().flying) {
         Class_QBKwWNWLlChWViO9.m_4259(this.f_30716.m_8768().floatValue(), this.f_30717.m_8768().floatValue());
      }
   }
}
