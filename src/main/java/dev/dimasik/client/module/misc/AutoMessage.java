package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.ModeSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_QmNR03reugBgWiPr;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_ftHu9o3WzCU3Adxm;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;

public class AutoMessage extends Module {
   private final ModeSetting f_2177;
   private final SliderSetting f_2178;
   private final Class_QmNR03reugBgWiPr f_2179;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_2180;
   private static final String f_2181 = "AutoMessage";
   private static final String f_2182 = "Отправляет сообщение";
   private static final String f_2183 = "Message";
   private static final String f_2184 = "Hello!";
   private static final String f_2185 = "Delay";
   private static final float f_2186 = 30.0F;
   private static final float f_2187 = 120.0F;
   private static final long f_2188 = 1000L;

   public void m_1372(Class_Xu9btcIeUN33XnMK var1) {
      if (this.f_2179.m_4458(this.f_2178.m_8768().longValue() * f_2188)) {
         Class_ftHu9o3WzCU3Adxm.m_6723(this.f_2177.m_8768());
         this.f_2179.m_4459();
      }
   }

   public AutoMessage() {
      super(f_2181, f_2182, Category.MISC);
      this.f_2177 = new ModeSetting(f_2183, f_2184);
      this.f_2178 = new SliderSetting(f_2185, f_2186, 1.0F, f_2187).m_828(1.0F);
      this.f_2179 = new Class_QmNR03reugBgWiPr();
      this.f_2180 = this::m_1372;
      this.m_795(this.f_2177, this.f_2178);
   }
}
