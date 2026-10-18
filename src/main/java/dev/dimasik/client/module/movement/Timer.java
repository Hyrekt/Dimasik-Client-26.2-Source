package dev.dimasik.client.module.movement;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_NzJrN63M7QBpmAbi;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_ZPRMV6aCWVosHRWh;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_jfpiTZhNIuwDwqKr;
import net.minecraft.util.Mth;

public class Timer extends Module {
   private static final Timer.EOhdsHob2tAXHV7q f_20815 = new Timer.EOhdsHob2tAXHV7q();
   private final SliderSetting f_20816;
   private final CheckboxSetting f_20817;
   private final SliderSetting f_20818;
   public static float f_20819 = Timer.f_20840;
   public static float f_20820 = 0.0F;
   private float f_20821;
   private float f_20822;
   private float f_20823;
   private float f_20824;
   private float f_20825;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK.Class_07sbU45IoaK910B1> f_20826;
   private static final String f_20827 = "Timer";
   private static final String f_20828 = "Ускоряет вас на некоторое время";
   private static final String f_20829 = "Скорость";
   private static final float f_20830 = 1.8F;
   private static final float f_20831 = 5.0F;
   private static final float f_20832 = 0.1F;
   private static final String f_20833 = "Умный";
   private static final String f_20834 = "Скорость убывания";
   private static final float f_20835 = 0.5F;
   private static final float f_20836 = 3.0F;
   private static final float f_20837 = 0.1F;
   private static final float f_20838 = 10.0F;
   private static final float f_20839 = 10.0F;
   private static final float f_20840 = 100.0F;

   public Timer() {
      super(f_20827, f_20828, Category.MOVEMENT);
      this.f_20816 = new SliderSetting(f_20829, f_20830, 1.0F, f_20831).m_828(f_20832);
      this.f_20817 = new CheckboxSetting(f_20833, true);
      this.f_20818 = new SliderSetting(f_20834, 1.0F, f_20835, f_20836).m_828(f_20837).m_822(this.f_20817::m_8768);
      this.f_20826 = this::m_6756;
      this.m_795(this.f_20816, this.f_20817, this.f_20818);
      DimasikClient.m_9057().m_9051().m_9713(f_20815);
   }

   @Override
   public void m_732() {
      Class_ZPRMV6aCWVosHRWh.m_5820(1.0F);
      super.m_732();
   }

   public void m_6754(float var1, float var2, float var3, float var4, float var5) {
      if (this.m_6755(var3, var4, var5, var1, var2)) {
         f_20820 += 2.0F;
      } else if (this.m_776()) {
         f_20820 = f_20820 - this.f_20816.m_8768() * 2.0F * this.f_20818.m_8768();
      }

      f_20820 = Mth.clamp(f_20820, 0.0F, f_20819);
      this.f_20821 = var3;
      this.f_20822 = var4;
      this.f_20823 = var5;
      this.f_20824 = var1;
      this.f_20825 = var2;
   }

   private boolean m_6755(float var1, float var2, float var3, float var4, float var5) {
      return var1 == this.f_20821 && var2 == this.f_20822 && var3 == this.f_20823 && var4 == this.f_20824 && var5 == this.f_20825;
   }

   public void m_6756(Class_Xu9btcIeUN33XnMK.Class_07sbU45IoaK910B1 var1) {
      if (this.f_20817.m_8768()) {
         if (f_20820 > f_20838) {
            Class_ZPRMV6aCWVosHRWh.m_5820(this.f_20816.m_8768());
         } else {
            Class_ZPRMV6aCWVosHRWh.m_5820(1.0F);
         }

         if (f_20820 < f_20839) {
            this.m_789();
         }
      } else {
         Class_ZPRMV6aCWVosHRWh.m_5820(this.f_20816.m_8768());
      }
   }

   public static class EOhdsHob2tAXHV7q implements Class_NzJrN63M7QBpmAbi {
      public final Class_gEPk7yDw6CwIte87<Class_jfpiTZhNIuwDwqKr> f_20814 = this::m_6753;

      public void m_6753(Class_jfpiTZhNIuwDwqKr var1) {
         if (f_11537.player != null) {
            Timer var2 = DimasikClient.m_9057().m_9049().m_2801().m_3431();
            if (var2 != null) {
               var2.m_6754(var1.m_7396(), var1.m_7397(), (float)var1.m_7399().x, (float)var1.m_7399().y, (float)var1.m_7399().z);
            }
         }
      }
   }
}
