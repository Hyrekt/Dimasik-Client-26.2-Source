package dev.dimasik.client.module.render;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_4cFOJQ5W3cnF4eSV;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;

public class Saturation extends Module {
   private final SliderSetting f_6305;
   private final SliderSetting f_6306;
   private final SliderSetting f_6307;
   private final SliderSetting f_6308;
   private final SliderSetting f_6309;
   private final SliderSetting f_6310;
   private final SliderSetting f_6311;
   private final SliderSetting f_6312;
   private final SliderSetting f_6313;
   private final SliderSetting f_6314;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_6315;
   private static final String f_6316 = "Saturation";
   private static final String f_6317 = "Расширенная цветокоррекция игры";
   private static final String f_6318 = "Сила эффекта";
   private static final float f_6319 = 0.05F;
   private static final String f_6320 = "Экспозиция";
   private static final float f_6321 = -2.0F;
   private static final float f_6322 = 0.05F;
   private static final String f_6323 = "Контрастность";
   private static final float f_6324 = -1.0F;
   private static final float f_6325 = 0.05F;
   private static final String f_6326 = "Насыщенность";
   private static final float f_6327 = -1.0F;
   private static final float f_6328 = 0.05F;
   private static final String f_6329 = "Сочность цветов";
   private static final float f_6330 = -1.0F;
   private static final float f_6331 = 0.05F;
   private static final String f_6332 = "Гамма";
   private static final float f_6333 = -1.0F;
   private static final float f_6334 = 0.05F;
   private static final String f_6335 = "Температура";
   private static final float f_6336 = -1.0F;
   private static final float f_6337 = 0.05F;
   private static final String f_6338 = "Оттенок";
   private static final float f_6339 = -1.0F;
   private static final float f_6340 = 0.05F;
   private static final String f_6341 = "Резкость";
   private static final float f_6342 = 0.05F;
   private static final String f_6343 = "Виньетка";
   private static final float f_6344 = 0.05F;

   public void m_2445(Class_bhRaN0YSSLQRYjPo var1) {
      if (f_11537.level != null && f_11537.player != null) {
         Class_4cFOJQ5W3cnF4eSV.f_2050
            .m_1348(
               this.f_6305.m_8768(),
               this.f_6306.m_8768(),
               this.f_6307.m_8768(),
               this.f_6308.m_8768(),
               this.f_6309.m_8768(),
               this.f_6310.m_8768(),
               this.f_6311.m_8768(),
               this.f_6312.m_8768(),
               this.f_6313.m_8768(),
               this.f_6314.m_8768()
            );
      }
   }

   public Saturation() {
      super(f_6316, f_6317, Category.RENDER);
      this.f_6305 = new SliderSetting(f_6318, 0.0F, 0.0F, 1.0F).m_828(f_6319);
      this.f_6306 = new SliderSetting(f_6320, 0.0F, f_6321, 2.0F).m_828(f_6322);
      this.f_6307 = new SliderSetting(f_6323, 0.0F, f_6324, 1.0F).m_828(f_6325);
      this.f_6308 = new SliderSetting(f_6326, 0.0F, f_6327, 2.0F).m_828(f_6328);
      this.f_6309 = new SliderSetting(f_6329, 0.0F, f_6330, 1.0F).m_828(f_6331);
      this.f_6310 = new SliderSetting(f_6332, 0.0F, f_6333, 1.0F).m_828(f_6334);
      this.f_6311 = new SliderSetting(f_6335, 0.0F, f_6336, 1.0F).m_828(f_6337);
      this.f_6312 = new SliderSetting(f_6338, 0.0F, f_6339, 1.0F).m_828(f_6340);
      this.f_6313 = new SliderSetting(f_6341, 0.0F, 0.0F, 1.0F).m_828(f_6342);
      this.f_6314 = new SliderSetting(f_6343, 0.0F, 0.0F, 1.0F).m_828(f_6344);
      this.f_6315 = this::m_2445;
      this.m_795(this.f_6305, this.f_6306, this.f_6307, this.f_6308, this.f_6309, this.f_6310, this.f_6311, this.f_6312, this.f_6313, this.f_6314);
   }
}
