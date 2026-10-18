package dev.dimasik.client.module.movement;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.module.combat.ElytraTarget;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_3VHxwfI2NZKoxzIi;
import dev.dimasik.client.system.Class_MACPHdFZqVYaxUay;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;

public class ElytraMotion extends Module {
   private final SliderSetting f_25271;
   private final CheckboxSetting f_25272;
   private Vec3 f_25273;
   private final Class_gEPk7yDw6CwIte87<Class_MACPHdFZqVYaxUay> f_25274;
   private static final String f_25275 = "ElytraMotion";
   private static final String f_25276 = "Останавливает полёт рядом с целью";
   private static final String f_25277 = "Дистанция";
   private static final float f_25278 = 3.0F;
   private static final float f_25279 = 5.0F;
   private static final float f_25280 = 0.1F;
   private static final String f_25281 = "Возвращать скорость";
   private static final double f_25282 = 2.0;

   private void m_7531(Class_MACPHdFZqVYaxUay var1) {
      LivingEntity var2 = DimasikClient.m_9057().m_9049().m_2801().m_3576().m_1114();
      ElytraTarget var3 = DimasikClient.m_9057().m_9049().m_2801().m_3574();
      if (var2 != null
         && f_11537.player.isFallFlying()
         && f_11537.player.getEyePosition().distanceTo(var2.getBoundingBox().getCenter().add(0.0, (var2.getY() - var2.yo) * f_25282, 0.0))
            < this.f_25271.m_8768().floatValue()
         && (Class_3VHxwfI2NZKoxzIi.m_1306(var2) < var3.m_5076().m_8768().floatValue() || !var3.m_5086().m_8768())) {
         if (this.f_25272.m_8768() && this.f_25273 == null) {
            this.f_25273 = var1.m_3884();
         }

         var1.m_3883(Vec3.ZERO);
      } else if (this.f_25272.m_8768() && this.f_25273 != null) {
         var1.m_3883(this.f_25273);
         this.f_25273 = null;
      }
   }

   public ElytraMotion() {
      super(f_25275, f_25276, Category.MOVEMENT);
      this.f_25271 = new SliderSetting(f_25277, f_25278, 1.0F, f_25279).m_828(f_25280);
      this.f_25272 = new CheckboxSetting(f_25281, true);
      this.f_25273 = null;
      this.f_25274 = this::m_7531;
      this.m_795(this.f_25271, this.f_25272);
   }

   @Override
   public void m_732() {
      this.f_25273 = null;
   }
}
