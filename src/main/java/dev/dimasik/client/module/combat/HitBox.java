package dev.dimasik.client.module.combat;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.AABB;

public final class HitBox extends Module {
   private final SliderSetting f_1400;
   private final SliderSetting f_1401;
   private final CheckboxSetting f_1402;
   private static final String f_1403 = "HitBox";
   private static final String f_1404 = "Расширяет хитбоксы игроков по X и Y";
   private static final String f_1405 = "Размер X";
   private static final float f_1406 = 0.25F;
   private static final float f_1407 = 0.05F;
   private static final String f_1408 = "Размер Y";
   private static final float f_1409 = 0.05F;
   private static final String f_1410 = "Видимые";

   public AABB m_1296(Entity var1, AABB var2) {
      return this.f_1402.m_8768() ? var2 : this.m_1299(var1, var2);
   }

   public AABB m_1297(Entity var1, AABB var2) {
      return !this.f_1402.m_8768() ? var2 : this.m_1299(var1, var2);
   }

   private boolean m_1298(Entity var1) {
      return var1 instanceof Player && var1 != f_11537.player && var1.isAlive() && !var1.isSpectator();
   }

   private AABB m_1299(Entity var1, AABB var2) {
      if (this.m_776() && var2 != null && this.m_1298(var1)) {
         double var3 = Math.max(0.0, this.f_1400.m_8768().floatValue());
         double var5 = Math.max(0.0, this.f_1401.m_8768().floatValue());
         return var3 == 0.0 && var5 == 0.0
            ? var2
            : new AABB(var2.minX - var3, var2.minY - var5, var2.minZ - var3, var2.maxX + var3, var2.maxY + var5, var2.maxZ + var3);
      } else {
         return var2;
      }
   }

   public HitBox() {
      super(f_1403, f_1404, Category.COMBAT);
      this.f_1400 = new SliderSetting(f_1405, f_1406, 0.0F, 2.0F).m_828(f_1407);
      this.f_1401 = new SliderSetting(f_1408, 0.0F, 0.0F, 2.0F).m_828(f_1409);
      this.f_1402 = new CheckboxSetting(f_1410, false);
      this.m_795(this.f_1400, this.f_1401, this.f_1402);
   }
}
