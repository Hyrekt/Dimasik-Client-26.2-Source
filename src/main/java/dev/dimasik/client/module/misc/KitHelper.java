package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_Ssh31B3ljfKeWsvS;
import dev.dimasik.client.system.Class_U4Qsm43RVlUI3Pre;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_eXr9Fra2ad3yFXY8;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_w8fCJQ5ZtH5lQbWc;
import dev.dimasik.client.system.Class_y1y6QpONhWEUIdEB;
import java.util.ArrayList;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.core.Holder.Reference;
import net.minecraft.core.registries.Registries;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import org.joml.Matrix4f;

public class KitHelper extends Module {
   private static final int f_31853 = 10;
   private static final int f_31854 = 3;
   private static final int f_31855 = 2;
   private static final int f_31856 = 2;
   private static final EquipmentSlot[] f_31857 = new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET};
   private final ItemListSetting f_31858;
   private final Class_w8fCJQ5ZtH5lQbWc f_31859;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_31860;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_31861;
   private String f_31862;
   private static final String f_31863 = "KitHelper";
   private static final String f_31864 = "Предупреждает, если нет тотема или мало гепла, перлов и бафов";
   private static final String f_31865 = "Проверять";
   private static final String f_31866 = "Тотем";
   private static final String f_31867 = "Гепл";
   private static final String f_31868 = "Перлы";
   private static final String f_31869 = "Зелья";
   private static final float f_31870 = 12.0F;
   private static final float f_31871 = 0.01F;
   private static final float f_31872 = 0.82F;
   private static final float f_31873 = 0.18F;
   private static final float f_31874 = 280.0F;
   private static final float f_31875 = 18.0F;
   private static final float f_31876 = 11.0F;
   private static final float f_31877 = 0.18F;
   private static final float f_31878 = 200.0F;
   private static final float f_31879 = 255.0F;
   private static final String f_31880 = "Тотем";
   private static final String f_31881 = "тотем";
   private static final String f_31882 = "Гепл";
   private static final String f_31883 = "гепл";
   private static final String f_31884 = "Перлы";
   private static final String f_31885 = "перлы";
   private static final String f_31886 = "Зелья";
   private static final String f_31887 = "бафы";
   private static final String f_31888 = ", ";

   private String m_8876() {
      if (f_11537.player == null) {
         return "";
      }

      ArrayList var1 = new ArrayList();
      if (this.f_31858.m_7145(f_31880) && this.m_8885(Items.TOTEM_OF_UNDYING) <= 0) {
         var1.add(f_31881);
      }

      if (this.f_31858.m_7145(f_31882) && this.m_8885(Items.GOLDEN_APPLE, Items.ENCHANTED_GOLDEN_APPLE) < 10) {
         var1.add(f_31883);
      }

      if (this.f_31858.m_7145(f_31884) && this.m_8885(Items.ENDER_PEARL) < 3) {
         var1.add(f_31885);
      }

      if (this.f_31858.m_7145(f_31886) && this.m_8885(Items.SPLASH_POTION, Items.LINGERING_POTION, Items.POTION) < 2) {
         var1.add(f_31887);
      }

      return var1.isEmpty() ? "" : String.join(f_31888, var1) + "";
   }

   public KitHelper() {
      super(f_31863, f_31864, Category.MISC);
      this.f_31858 = new ItemListSetting(
         f_31865,
         new Class_2ZaVm8TGDJ68TnJB(f_31866, true),
         new Class_2ZaVm8TGDJ68TnJB(f_31867, true),
         new Class_2ZaVm8TGDJ68TnJB(f_31868, true),
         new Class_2ZaVm8TGDJ68TnJB(f_31869, true)
      );
      this.f_31859 = new Class_w8fCJQ5ZtH5lQbWc(0.0F, f_31870, Class_eXr9Fra2ad3yFXY8.f_19100);
      this.f_31860 = this::m_8881;
      this.f_31861 = this::m_8882;
      this.f_31862 = "";
      this.m_795(this.f_31858);
   }

   private int m_8877(ItemStack var1) {
      if (f_11537.level == null) {
         return 0;
      }

      try {
         Reference var2 = f_11537.level.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.PROTECTION);
         return EnchantmentHelper.getItemEnchantmentLevel(var2, var1);
      } catch (Throwable var3) {
         return 0;
      }
   }

   private boolean m_8878() {
      for (EquipmentSlot var4 : f_31857) {
         if (!this.m_8886(f_11537.player.getItemBySlot(var4))) {
            return false;
         }
      }

      return true;
   }

   private boolean m_8879() {
      return f_11537.gui.screen() instanceof InventoryScreen;
   }

   private static int m_8880(ItemStack var0, Item... var1) {
      if (var0 != null && !var0.isEmpty()) {
         for (Item var5 : var1) {
            if (var0.is(var5)) {
               return var0.getCount();
            }
         }

         return 0;
      } else {
         return 0;
      }
   }

   private void m_8881(Class_Xu9btcIeUN33XnMK var1) {
      this.f_31862 = this.m_8876();
      this.f_31859.m_9283(this.m_8883() ? 1.0F : 0.0F);
   }

   private void m_8882(Class_bhRaN0YSSLQRYjPo var1) {
      this.f_31862 = this.m_8876();
      this.f_31859.m_9283(this.m_8883() ? 1.0F : 0.0F);
      float var2 = this.f_31859.m_9288();
      if (!(var2 <= f_31871) && !this.f_31862.isBlank()) {
         float var3 = f_31872 + f_31873 * Mth.sin((float)System.currentTimeMillis() / f_31874);
         float var4 = var2 * var3;
         float var5 = f_11537.getWindow().getScreenWidth();
         float var6 = f_11537.getWindow().getScreenHeight();
         byte var7 = 16;
         float var8 = Class_y1y6QpONhWEUIdEB.m_9588().m_7383().m_2157(this.f_31862, var7, 0.0F);
         float var9 = Class_Ssh31B3ljfKeWsvS.m_4823(Class_y1y6QpONhWEUIdEB.m_9588(), var7);
         float var10 = f_31875;
         float var11 = f_31876;
         float var12 = var8 + var10 * 2.0F;
         float var13 = var9 + var11 * 2.0F;
         float var14 = (var5 - var12) / 2.0F;
         float var15 = var6 * f_31877;
         float var16 = var14 + var10;
         float var17 = Class_Ssh31B3ljfKeWsvS.m_4863(Class_y1y6QpONhWEUIdEB.m_9588(), this.f_31862, var15 + var13 / 2.0F, var7);
         Class_Ssh31B3ljfKeWsvS.m_4814(new Matrix4f());
         Class_U4Qsm43RVlUI3Pre.m_5201(Class_y1y6QpONhWEUIdEB.m_9588());

         try {
            Class_U4Qsm43RVlUI3Pre.m_5199(var14, var15, var12, var13, var13 / 2.0F, Class_BftdentXEtGbugJw.m_2303(28, 16, 4, (int)(f_31878 * var2)));
            Class_U4Qsm43RVlUI3Pre.m_5186(
               Class_y1y6QpONhWEUIdEB.m_9588(), this.f_31862, var16, var17, var7, Class_BftdentXEtGbugJw.m_2303(255, 196, 72, (int)(f_31879 * var4))
            );
         } finally {
            Class_U4Qsm43RVlUI3Pre.m_5193(Class_y1y6QpONhWEUIdEB.m_9588());
         }
      }
   }

   @Override
   public void m_732() {
      this.f_31859.m_9281(0.0F);
      this.f_31862 = "";
   }

   private boolean m_8883() {
      if (f_11537.player == null || f_11537.level == null) {
         return false;
      } else if (f_11537.player.isCreative() || f_11537.player.isSpectator()) {
         return false;
      } else {
         return this.f_31862.isBlank() ? false : this.m_8878() || this.m_8879();
      }
   }

   private static boolean m_8884(Item var0) {
      return var0 == Items.DIAMOND_HELMET
         || var0 == Items.DIAMOND_CHESTPLATE
         || var0 == Items.DIAMOND_LEGGINGS
         || var0 == Items.DIAMOND_BOOTS
         || var0 == Items.NETHERITE_HELMET
         || var0 == Items.NETHERITE_CHESTPLATE
         || var0 == Items.NETHERITE_LEGGINGS
         || var0 == Items.NETHERITE_BOOTS;
   }

   private int m_8885(Item... var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < f_11537.player.getInventory().getContainerSize(); var3++) {
         var2 += m_8880(f_11537.player.getInventory().getItem(var3), var1);
      }

      return var2;
   }

   private boolean m_8886(ItemStack var1) {
      return var1 != null && !var1.isEmpty() && m_8884(var1.getItem()) ? this.m_8877(var1) >= 2 : false;
   }
}
