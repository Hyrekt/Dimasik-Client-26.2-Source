package dev.dimasik.client.module.movement;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_3tFUGm5rgVT7VgqP;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;

public class PearlBoost extends Module {
   private final SliderSetting f_36479;
   private final Class_gEPk7yDw6CwIte87<Class_3tFUGm5rgVT7VgqP> f_36480;
   private static final String f_36481 = "PearlBoost";
   private static final String f_36482 = "Увеличивает буст эндер-жемчуга по Y";
   private static final String f_36483 = "Значение буста";
   private static final float f_36484 = 1.2F;
   private static final float f_36485 = 3.0F;
   private static final float f_36486 = 0.1F;

   public void m_9940(Class_3tFUGm5rgVT7VgqP var1) {
      f_11537.player.setPosRaw(f_11537.player.getX(), f_11537.player.getY() + this.f_36479.m_8768().floatValue(), f_11537.player.getZ());
   }

   public PearlBoost() {
      super(f_36481, f_36482, Category.MOVEMENT);
      this.f_36479 = new SliderSetting(f_36483, f_36484, 0.0F, f_36485).m_828(f_36486);
      this.f_36480 = this::m_9940;
      this.m_795(this.f_36479);
   }
}
