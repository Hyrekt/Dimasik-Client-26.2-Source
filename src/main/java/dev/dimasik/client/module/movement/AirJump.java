package dev.dimasik.client.module.movement;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_jfpiTZhNIuwDwqKr;

public class AirJump extends Module {
   private final MultiChoiceSetting f_15985;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_15986;
   private final Class_gEPk7yDw6CwIte87<Class_jfpiTZhNIuwDwqKr> f_15987;
   private static final String f_15988 = "AirJump";
   private static final String f_15989 = "Прыжок в воздухе";
   private static final String f_15990 = "Обход";
   private static final String f_15991 = "Matrix";
   private static final String f_15992 = "Default";
   private static final String f_15993 = "Default";
   private static final String f_15994 = "Matrix";
   private static final String f_15995 = "Matrix";
   private static final double f_15996 = 0.5;
   private static final double f_15997 = 0.5;
   private static final double f_15998 = -1.0;

   private void m_5561(Class_jfpiTZhNIuwDwqKr var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (this.f_15985.m_7568(f_15995) && this.m_5563()) {
            var1.m_7393(true);
         }
      }
   }

   private void m_5562(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (this.f_15985.m_7568(f_15993)) {
            f_11537.player.setOnGround(true);
         }

         if (this.f_15985.m_7568(f_15994) && this.m_5563()) {
            f_11537.player.fallDistance = 0.0;
            f_11537.player.noJumpDelay = 0;
            f_11537.player.setOnGround(true);
         }
      }
   }

   private boolean m_5563() {
      return f_11537.level
            .getBlockCollisions(f_11537.player, f_11537.player.getBoundingBox().inflate(f_15996, 0.0, f_15997).move(0.0, f_15998, 0.0))
            .iterator()
            .hasNext()
         && f_11537.player.tickCount % 2 == 0;
   }

   public AirJump() {
      super(f_15988, f_15989, Category.MOVEMENT);
      this.f_15985 = new MultiChoiceSetting(f_15990, new Class_2ZaVm8TGDJ68TnJB(f_15991), new Class_2ZaVm8TGDJ68TnJB(f_15992));
      this.f_15986 = this::m_5562;
      this.f_15987 = this::m_5561;
      this.m_795(this.f_15985);
   }
}
