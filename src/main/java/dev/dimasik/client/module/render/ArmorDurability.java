package dev.dimasik.client.module.render;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStack;

public final class ArmorDurability extends Module {
   private static ArmorDurability f_10074;
   private final CheckboxSetting f_10075;
   private final CheckboxSetting f_10076;
   private static final String f_10077 = "ArmorDurability";
   private static final String f_10078 = "Показывает прочность брони";
   private static final String f_10079 = "На себе";
   private static final String f_10080 = "На врагах";
   private static final double f_10081 = 255.0;
   private static final double f_10082 = 100.0;
   private static final float f_10083 = 9.0F;
   private static final float f_10084 = 8.0F;
   private static final float f_10085 = 0.5F;
   private static final float f_10086 = 16.0F;

   public int m_3363(ItemStack var1) {
      int var2 = var1.getMaxDamage();
      return var2 <= 0 ? 100 : (int)Math.round((var2 - var1.getDamageValue()) * f_10082 / var2);
   }

   public void m_3364(ItemStack var1, float var2, float var3, float var4, boolean var5) {
      String var6 = this.m_3363(var1) + "";
      int var7 = Math.max(7, Math.round(f_10083 * var4));
      float var8 = Class_Ssh31B3ljfKeWsvS.m_4847(Class_y1y6QpONhWEUIdEB.m_9588(), var6, var7);
      float var9 = var2 + f_10084 * var4 - var8 * f_10085;
      float var10 = var5 ? var3 - var7 - 1.0F * var4 : var3 + f_10086 * var4 + 1.0F * var4;
      Class_Ssh31B3ljfKeWsvS.m_4866(Class_y1y6QpONhWEUIdEB.m_9588(), var6, var9, var10, var7, this.m_3365(var1));
   }

   public int m_3365(ItemStack var1) {
      int var2 = var1.getBarColor();
      return Class_BftdentXEtGbugJw.m_2303(var2 >> 16 & 0xFF, var2 >> 8 & 0xFF, var2 & 0xFF, f_10081);
   }

   public boolean m_3366(ItemStack var1, boolean var2) {
      if (!this.m_776() || var1 == null || var1.isEmpty()) {
         return false;
      } else {
         return !var1.is(ItemTags.DURABILITY_ENCHANTABLE) ? false : var2 ? this.f_10075.m_8768() : this.f_10076.m_8768();
      }
   }

   public ArmorDurability() {
      super(f_10077, f_10078, Category.RENDER);
      this.f_10075 = new CheckboxSetting(f_10079, true);
      this.f_10076 = new CheckboxSetting(f_10080, true);
      f_10074 = this;
      this.m_795(this.f_10075, this.f_10076);
   }

   public static ArmorDurability m_3367() {
      return f_10074;
   }
}
