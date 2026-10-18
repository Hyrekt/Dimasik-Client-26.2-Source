package dev.dimasik.client.module.movement;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_3LQSDrJ0WJYOQ7ck;
import dev.dimasik.client.system.Class_QmNR03reugBgWiPr;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_lTzchJDbvRVrnXlw;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.network.protocol.Packet;

public class FakeLag extends Module {
   private final MultiChoiceSetting f_12398;
   private final SliderSetting f_12399;
   private final CopyOnWriteArrayList<FakeLag.ypykO8QT6Tsn7P1r> f_12400;
   private final Class_QmNR03reugBgWiPr f_12401;
   private final Class_gEPk7yDw6CwIte87<Class_lTzchJDbvRVrnXlw> f_12402;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_12403;
   private static final String f_12404 = "FakeLag";
   private static final String f_12405 = "Добавляет лаги для игрока";
   private static final String f_12406 = "Режим";
   private static final String f_12407 = "Задержка";
   private static final String f_12408 = "Лаги";
   private static final String f_12409 = "Задержка";
   private static final float f_12410 = 100.0F;
   private static final float f_12411 = 1000.0F;
   private static final float f_12412 = 50.0F;
   private static final String f_12413 = "Задержка";
   private static final String f_12414 = "Лаги";

   public void m_4471(Class_lTzchJDbvRVrnXlw var1) {
      this.m_4472(var1.m_7532());
      if (this.f_12398.m_7568(f_12413)) {
         this.m_4473();
      } else if (this.f_12398.m_7568(f_12414)) {
         this.m_4475();
      }

      var1.m_1582(true);
   }

   private void m_4472(Packet<?> var1) {
      this.f_12400.add(new FakeLag.ypykO8QT6Tsn7P1r(var1, System.currentTimeMillis() + this.f_12399.m_8768().longValue()));
   }

   private void m_4473() {
      if (!this.f_12400.isEmpty()) {
         for (FakeLag.ypykO8QT6Tsn7P1r var2 : this.f_12400) {
            if (var2.delay <= System.currentTimeMillis()) {
               Class_3LQSDrJ0WJYOQ7ck.m_1293(var2.packet);
               this.f_12400.remove(var2);
            }
         }
      }
   }

   public void m_4474(Class_XzpX8S5F5zd9jbuE var1) {
   }

   public FakeLag() {
      super(f_12404, f_12405, Category.MOVEMENT);
      this.f_12398 = new MultiChoiceSetting(f_12406, new Class_2ZaVm8TGDJ68TnJB(f_12407), new Class_2ZaVm8TGDJ68TnJB(f_12408));
      this.f_12399 = new SliderSetting(f_12409, f_12410, 0.0F, f_12411).m_828(f_12412);
      this.f_12400 = new CopyOnWriteArrayList<>();
      this.f_12401 = new Class_QmNR03reugBgWiPr();
      this.f_12402 = this::m_4471;
      this.f_12403 = this::m_4474;
      this.m_795(this.f_12398, this.f_12399);
   }

   @Override
   public void m_732() {
      if (!this.f_12400.isEmpty()) {
         for (FakeLag.ypykO8QT6Tsn7P1r var2 : this.f_12400) {
            Class_3LQSDrJ0WJYOQ7ck.m_1293(var2.packet);
            this.f_12400.remove(var2);
         }
      }
   }

   private void m_4475() {
      if (!this.f_12400.isEmpty() && this.f_12401.m_4463(this.f_12399.m_8768().longValue())) {
         for (FakeLag.ypykO8QT6Tsn7P1r var2 : this.f_12400) {
            Class_3LQSDrJ0WJYOQ7ck.m_1293(var2.packet);
            this.f_12400.remove(var2);
         }

         this.f_12401.m_4459();
      }
   }

   public record ypykO8QT6Tsn7P1r(Packet<?> packet, long delay) {
   }
}
