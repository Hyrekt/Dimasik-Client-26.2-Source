package dev.dimasik.client.module.combat;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_QmNR03reugBgWiPr;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_wjdoxQGtI8mFyL6U;
import net.minecraft.world.entity.LivingEntity;

public class AutoShift extends Module {
   private final SliderSetting f_30211;
   private final Class_QmNR03reugBgWiPr f_30212;
   private boolean f_30213;
   private final Class_gEPk7yDw6CwIte87<Class_wjdoxQGtI8mFyL6U> f_30214;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_30215;
   private static final String f_30216 = "AutoShift";
   private static final String f_30217 = "Автоматически приседает при ударе";
   private static final String f_30218 = "Задержка";
   private static final float f_30219 = 100.0F;
   private static final float f_30220 = 500.0F;
   private static final float f_30221 = 10.0F;

   private void m_8427() {
      if (this.f_30213) {
         if (f_11537.options != null) {
            f_11537.options.keyShift.setDown(false);
         }

         this.f_30213 = false;
      }
   }

   private void m_8428(Class_Xu9btcIeUN33XnMK var1) {
      if (this.f_30213) {
         if (this.f_30212.m_4464(this.f_30211.m_8768().longValue())) {
            this.m_8427();
         } else {
            f_11537.options.keyShift.setDown(true);
         }
      }
   }

   public AutoShift() {
      super(f_30216, f_30217, Category.COMBAT);
      this.f_30211 = new SliderSetting(f_30218, f_30219, 0.0F, f_30220).m_828(f_30221);
      this.f_30212 = new Class_QmNR03reugBgWiPr();
      this.f_30214 = this::m_8429;
      this.f_30215 = this::m_8428;
      this.m_795(this.f_30211);
   }

   private void m_8429(Class_wjdoxQGtI8mFyL6U var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (var1.m_9372() == Class_wjdoxQGtI8mFyL6U.Class_327mRdjAqNoPaemJ.POST && var1.m_9371() == f_11537.player) {
            if (var1.m_9370() instanceof LivingEntity var2 && var2.isAlive()) {
               f_11537.options.keyShift.setDown(true);
               this.f_30213 = true;
               this.f_30212.m_4459();
            }
         }
      }
   }

   @Override
   public void m_732() {
      this.m_8427();
   }
}
