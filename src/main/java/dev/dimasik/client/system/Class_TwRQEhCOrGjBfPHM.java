package dev.dimasik.client.system;

import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import java.util.List;
import java.util.function.BooleanSupplier;

public class Class_TwRQEhCOrGjBfPHM extends MultiChoiceSetting {
   private static final String f_14558 = "Обычное";
   private static final String f_14559 = "Утро";
   private static final String f_14560 = "День";
   private static final String f_14561 = "Вечер";
   private static final String f_14562 = "Закат";
   private static final String f_14563 = "Ночь";
   private static final long f_14564 = 1000L;
   private static final long f_14565 = 6000L;
   private static final long f_14566 = 10000L;
   private static final long f_14567 = 12000L;
   private static final long f_14568 = 21000L;
   private static final long f_14569 = 24000L;
   private static final float f_14570 = 24000.0F;
   private static final String f_14571 = "Обычное";
   private static final String f_14572 = "Утро";
   private static final String f_14573 = "Авто";
   private static final String f_14574 = "Рассвет";
   private static final float f_14575 = Float.MAX_VALUE;
   private static final String f_14576 = "Утро";
   private static final String f_14577 = "День";
   private static final String f_14578 = "Вечер";
   private static final String f_14579 = "Закат";
   private static final String f_14580 = "Ночь";
   private static final long f_14581 = 1000L;
   private static final long f_14582 = 6000L;
   private static final long f_14583 = 10000L;
   private static final long f_14584 = 12000L;
   private static final long f_14585 = 21000L;
   private static final long f_14586 = -1L;
   private static final float f_14587 = 24000.0F;

   public boolean m_5142() {
      return this.m_7568(f_14558);
   }

   public void m_5143(int var1) {
      List var2 = this.m_8768();
      if (!var2.isEmpty()) {
         int var3 = Math.max(0, var2.indexOf(this.m_7564()));
         this.m_1767((Class_2ZaVm8TGDJ68TnJB)var2.get(Math.floorMod(var3 + var1, var2.size())));
      }
   }

   public long m_5144(long var1) {
      return switch (this.m_7564().m_1181()) {
         case f_14559 -> f_14564;
         case f_14560 -> f_14565;
         case f_14561 -> f_14566;
         case f_14562 -> f_14567;
         case f_14563 -> f_14568;
         default -> Math.floorMod(var1, f_14569);
      };
   }

   public Class_TwRQEhCOrGjBfPHM(String var1, Class_2ZaVm8TGDJ68TnJB... var2) {
      super(var1, var2);
   }

   public Class_TwRQEhCOrGjBfPHM m_822(BooleanSupplier var1) {
      this.m_8763(var1);
      return this;
   }

   public String m_5145() {
      return switch (this.m_7564().m_1181()) {
         case f_14571 -> f_14573;
         case f_14572 -> f_14574;
         default -> this.m_7564().m_1181();
      };
   }

   public float m_5146(long var1) {
      return (float)this.m_5144(var1) / f_14570;
   }

   public void m_5147(float var1) {
      float var2 = var1 - (float)Math.floor(var1);
      Class_2ZaVm8TGDJ68TnJB var3 = null;
      float var4 = f_14575;

      for (Class_2ZaVm8TGDJ68TnJB var6 : this.m_8768()) {
         long var7 = switch (var6.m_1181()) {
            case f_14576 -> f_14581;
            case f_14577 -> f_14582;
            case f_14578 -> f_14583;
            case f_14579 -> f_14584;
            case f_14580 -> f_14585;
            default -> f_14586;
         };
         if (var7 >= 0L) {
            float var11 = (float)var7 / f_14587;
            float var12 = Math.abs(var11 - var2);
            var12 = Math.min(var12, 1.0F - var12);
            if (var12 < var4) {
               var4 = var12;
               var3 = var6;
            }
         }
      }

      if (var3 != null) {
         this.m_1767(var3);
      }
   }
}
