package dev.dimasik.client.module.movement;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_EndlYW7bFBb6ZTsy;
import dev.dimasik.client.system.Class_QBKwWNWLlChWViO9;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import net.minecraft.world.phys.Vec3;

public class WaterSpeed extends Module {
   private final MultiChoiceSetting f_2136;
   private final SliderSetting f_2137;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_2138;
   private final Class_gEPk7yDw6CwIte87<Class_EndlYW7bFBb6ZTsy> f_2139;
   private static final String f_2140 = "WaterSpeed";
   private static final String f_2141 = "Ускорение в воде";
   private static final String f_2142 = "Режим";
   private static final String f_2143 = "HVH";
   private static final String f_2144 = "Скорость";
   private static final float f_2145 = 0.5F;
   private static final float f_2146 = 0.1F;
   private static final float f_2147 = 0.05F;
   private static final String f_2148 = "HVH";
   private static final String f_2149 = "HVH";
   private static final String f_2150 = "HVH";

   private void m_1363(Class_EndlYW7bFBb6ZTsy var1) {
      if (f_11537.player != null && f_11537.level != null && this.f_2136.m_7568(f_2149) && f_11537.player.isInWater()) {
         Vec3 var2 = f_11537.player.getDeltaMovement();
         Vec3 var3 = var1.m_2544();
         var1.m_2545(new Vec3(var2.x, var3.y, var2.z));
      }
   }

   private void m_1365(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null && this.f_2136.m_7568(f_2148)) {
         if (f_11537.player.isInWater() && (f_11537.player.isSprinting() || f_11537.player.isSwimming())) {
            if (Class_QBKwWNWLlChWViO9.m_4256()) {
               Class_QBKwWNWLlChWViO9.m_4264(this.f_2137.m_8768().floatValue());
            }
         }
      }
   }

   public WaterSpeed() {
      super(f_2140, f_2141, Category.MOVEMENT);
      this.f_2136 = new MultiChoiceSetting(f_2142, new Class_2ZaVm8TGDJ68TnJB(f_2143));
      this.f_2137 = new SliderSetting(f_2144, f_2145, f_2146, 2.0F).m_828(f_2147).m_822(() -> this.f_2136.m_7568(f_2150));
      this.f_2138 = this::m_1365;
      this.f_2139 = this::m_1363;
      this.m_795(this.f_2136, this.f_2137);
   }
}
