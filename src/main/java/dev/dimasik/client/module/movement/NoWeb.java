package dev.dimasik.client.module.movement;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_ArgbZzNIUBY6lyfv;
import dev.dimasik.client.system.Class_QBKwWNWLlChWViO9;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_mZ6Q7gwh7mng3x8m;
import net.minecraft.core.Direction;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.Action;

public class NoWeb extends Module {
   private final MultiChoiceSetting f_23570;
   private final SliderSetting f_23571;
   private final SliderSetting f_23572;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_23573;
   private final Class_gEPk7yDw6CwIte87<Class_ArgbZzNIUBY6lyfv> f_23574;
   private static final String f_23575 = "NoWeb";
   private static final String f_23576 = "Свободное перемещение в паутине";
   private static final String f_23577 = "Мод";
   private static final String f_23578 = "ReallyWorld";
   private static final String f_23579 = "Break";
   private static final String f_23580 = "Custom";
   private static final String f_23581 = "Скорость";
   private static final float f_23582 = 0.21F;
   private static final float f_23583 = 0.1F;
   private static final float f_23584 = 0.01F;
   private static final String f_23585 = "Скорсть по Y";
   private static final float f_23586 = 0.9F;
   private static final float f_23587 = 0.1F;
   private static final float f_23588 = 0.01F;
   private static final String f_23589 = "ReallyWorld";
   private static final double f_23590 = 0.9F;
   private static final double f_23591 = -0.9F;
   private static final double f_23592 = 0.21F;
   private static final String f_23593 = "Custom";
   private static final String f_23594 = "Break";
   private static final String f_23595 = "Custom";
   private static final String f_23596 = "Custom";

   public void m_7242(Class_ArgbZzNIUBY6lyfv var1) {
      if (this.f_23570.m_7568(f_23594)) {
         f_11537.gameMode
            .startPrediction(f_11537.level, var1x -> new ServerboundPlayerActionPacket(Action.STOP_DESTROY_BLOCK, var1.m_2104(), Direction.UP, var1x));
         var1.m_1582(true);
      }
   }

   public NoWeb() {
      super(f_23575, f_23576, Category.MOVEMENT);
      this.f_23570 = new MultiChoiceSetting(
         f_23577, new Class_2ZaVm8TGDJ68TnJB(f_23578), new Class_2ZaVm8TGDJ68TnJB(f_23579), new Class_2ZaVm8TGDJ68TnJB(f_23580)
      );
      this.f_23571 = new SliderSetting(f_23581, f_23582, f_23583, 1.0F).m_828(f_23584).m_822(() -> this.f_23570.m_7568(f_23596));
      this.f_23572 = new SliderSetting(f_23585, f_23586, f_23587, 2.0F).m_828(f_23588).m_822(() -> this.f_23570.m_7568(f_23595));
      this.f_23573 = this::m_7245;
      this.f_23574 = this::m_7242;
      this.m_795(this.f_23570, this.f_23571, this.f_23572);
   }

   public void m_7245(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (this.f_23570.m_7568(f_23589) && ((Class_mZ6Q7gwh7mng3x8m)f_11537.player).dimas$isInWeb()) {
            f_11537.player.setDeltaMovement(f_11537.player.getDeltaMovement().x, 0.0, f_11537.player.getDeltaMovement().z);
            if (f_11537.options.keyJump.isDown()) {
               f_11537.player.setDeltaMovement(f_11537.player.getDeltaMovement().x, f_23590, f_11537.player.getDeltaMovement().z);
            }

            if (f_11537.options.keyShift.isDown()) {
               f_11537.player.setDeltaMovement(f_11537.player.getDeltaMovement().x, f_23591, f_11537.player.getDeltaMovement().z);
            }

            Class_QBKwWNWLlChWViO9.m_4264(f_23592);
         } else if (this.f_23570.m_7568(f_23593) && ((Class_mZ6Q7gwh7mng3x8m)f_11537.player).dimas$isInWeb()) {
            f_11537.player.setDeltaMovement(f_11537.player.getDeltaMovement().x, 0.0, f_11537.player.getDeltaMovement().z);
            if (f_11537.options.keyJump.isDown()) {
               f_11537.player.setDeltaMovement(f_11537.player.getDeltaMovement().x, this.f_23572.m_8768().floatValue(), f_11537.player.getDeltaMovement().z);
            }

            if (f_11537.options.keyShift.isDown()) {
               f_11537.player.setDeltaMovement(f_11537.player.getDeltaMovement().x, -this.f_23572.m_8768(), f_11537.player.getDeltaMovement().z);
            }

            Class_QBKwWNWLlChWViO9.m_4264(this.f_23571.m_8768().floatValue());
         }
      }
   }
}
