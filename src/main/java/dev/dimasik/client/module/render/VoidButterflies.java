package dev.dimasik.client.module.render;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_DcCQ4WatKHyfGvHx;
import dev.dimasik.client.system.Class_TZhU50s8XmBQCMP5;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;

public final class VoidButterflies extends Module {
   private final SliderSetting f_4775;
   private final SliderSetting f_4776;
   private final Class_DcCQ4WatKHyfGvHx f_4777;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_4778;
   private final Class_gEPk7yDw6CwIte87<Class_TZhU50s8XmBQCMP5> f_4779;
   private static final String f_4780 = "VoidButterflies";
   private static final String f_4781 = "Бабочки пустоты на всех гранях блоков";
   private static final String f_4782 = "Радиус";
   private static final float f_4783 = 12.0F;
   private static final float f_4784 = 4.0F;
   private static final float f_4785 = 24.0F;
   private static final String f_4786 = "Плотность";
   private static final float f_4787 = 0.25F;
   private static final float f_4788 = 0.25F;

   @Override
   public void m_778() {
      this.f_4777.m_2468();
   }

   public VoidButterflies() {
      super(f_4780, f_4781, Category.RENDER);
      this.f_4775 = new SliderSetting(f_4782, f_4783, f_4784, f_4785).m_828(1.0F);
      this.f_4776 = new SliderSetting(f_4786, 1.0F, f_4787, 2.0F).m_828(f_4788);
      this.f_4777 = new Class_DcCQ4WatKHyfGvHx();
      this.f_4778 = var1 -> this.f_4777.m_2469(this.f_4775.m_8768(), this.f_4776.m_8768());
      this.f_4779 = var1 -> this.f_4777.m_2471(var1, this.f_4775.m_8768());
      this.m_795(this.f_4775, this.f_4776);
   }

   @Override
   public void m_732() {
      this.f_4777.m_2468();
   }
}
