package dev.dimasik.client.module.render;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_aY0wvCQAcpXsfK9C;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;

public class AspectRatio extends Module {
   private final SliderSetting f_30295;
   private final Class_gEPk7yDw6CwIte87<Class_aY0wvCQAcpXsfK9C> f_30296;
   private static final String f_30297 = "AspectRatio";
   private static final String f_30298 = "Изменяет соотношение сторон экрана";
   private static final String f_30299 = "Значение";
   private static final float f_30300 = 1.7F;
   private static final float f_30301 = 0.05F;

   public AspectRatio() {
      super(f_30297, f_30298, Category.RENDER);
      this.f_30295 = new SliderSetting(f_30299, f_30300, 1.0F, 2.0F).m_828(f_30301);
      this.f_30296 = this::m_8450;
      this.m_795(this.f_30295);
   }

   public void m_8450(Class_aY0wvCQAcpXsfK9C var1) {
      var1.m_5910(this.f_30295.m_8768());
   }
}
