package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.IntegerSetting;
import dev.dimasik.client.system.Class_8x4deAyjocMIBSj7;
import dev.dimasik.client.system.Class_B6JOzHnwhU3pe4AO;
import dev.dimasik.client.system.Class_B6vpBUNmRtH3JzmV;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.ui.screen.Screen_4;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.core.NonNullList;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public final class PotionSwap extends Module {
   private static final int f_16459 = 8;
   private final IntegerSetting f_16460;
   private final List<ItemStack> f_16461;
   private PotionSwap.zbykevYTAvD7AXn8 f_16462;
   private int f_16463;
   private int f_16464;
   private int f_16465;
   private boolean f_16466;
   private boolean f_16467;
   private Screen_4 f_16468;
   private final Class_8x4deAyjocMIBSj7 f_16469;
   private final Class_gEPk7yDw6CwIte87<Class_B6JOzHnwhU3pe4AO> f_16470;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_16471;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_16472;
   private static final String f_16473 = "PotionSwap";
   private static final String f_16474 = "Колесо для быстрого выбора и броска зелий";
   private static final String f_16475 = "Колесо";

   public void m_5699(int var1) {
      if (this.m_5713() && this.f_16462 == PotionSwap.zbykevYTAvD7AXn8.IDLE && var1 >= 0 && var1 < this.f_16461.size()) {
         int var2 = this.m_5714(this.f_16461.get(var1));
         if (var2 != -1) {
            this.f_16463 = var2;
            this.f_16464 = f_11537.player.getInventory().getSelectedSlot();
            this.f_16466 = Class_B6vpBUNmRtH3JzmV.m_2126(var2);
            this.f_16462 = PotionSwap.zbykevYTAvD7AXn8.EQUIP;
         }
      }
   }

   public PotionSwap() {
      super(f_16473, f_16474, Category.MISC);
      this.f_16460 = new IntegerSetting(f_16475, -1);
      this.f_16461 = new ArrayList<>();
      this.f_16462 = PotionSwap.zbykevYTAvD7AXn8.IDLE;
      this.f_16463 = -1;
      this.f_16464 = -1;
      this.f_16469 = new Class_8x4deAyjocMIBSj7();
      this.f_16470 = this::m_5720;
      this.f_16471 = this::m_5707;
      this.f_16472 = this::m_5717;
      this.m_795(this.f_16460);
   }

   public int m_5700() {
      if (this.f_16461.size() >= 8) {
         return Math.max(0, this.f_16461.size() - 1);
      }

      this.f_16461.add(ItemStack.EMPTY);
      return this.f_16461.size() - 1;
   }

   private boolean m_5701(List<ItemStack> var1, ItemStack var2) {
      for (ItemStack var4 : var1) {
         if (ItemStack.isSameItemSameComponents(var4, var2)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void m_732() {
      if (f_11537.gui.screen() instanceof Screen_4 var1) {
         var1.finish(false);
      }

      this.f_16468 = null;
      if (this.f_16462 != PotionSwap.zbykevYTAvD7AXn8.IDLE && this.f_16467 && this.m_5713()) {
         if (this.f_16466) {
            Class_B6vpBUNmRtH3JzmV.m_2131(this.f_16464);
         } else if (this.f_16463 >= 0) {
            Class_B6vpBUNmRtH3JzmV.m_2129(8, this.f_16463);
         }
      }

      this.m_5710();
   }

   private void m_5703() {
      if (this.f_16466) {
         Class_B6vpBUNmRtH3JzmV.m_2131(this.f_16464);
         this.m_5710();
      } else {
         if (this.f_16469.m_1901(() -> Class_B6vpBUNmRtH3JzmV.m_2129(8, this.f_16463), true) == Class_8x4deAyjocMIBSj7.Class_8xzBZ83gOSc56UI6.SUCCESS) {
            Class_B6vpBUNmRtH3JzmV.m_2131(this.f_16464);
            this.m_5710();
         }
      }
   }

   public List<ItemStack> m_5704() {
      return this.f_16461;
   }

   public boolean m_5705(ItemStack var1) {
      return this.m_5714(var1) != -1;
   }

   private void m_5706() {
      if (this.f_16461.isEmpty()) {
         List var1 = this.m_5719();

         for (int var2 = 0; var2 < 3; var2++) {
            this.f_16461.add(var2 < var1.size() ? (ItemStack)var1.get(var2) : ItemStack.EMPTY);
         }
      }
   }

   private void m_5707(Class_Xu9btcIeUN33XnMK var1) {
      if (this.f_16462 != PotionSwap.zbykevYTAvD7AXn8.IDLE && this.m_5713()) {
         if (this.f_16465 > 0) {
            this.f_16465--;
         } else {
            switch (this.f_16462) {
               case EQUIP:
                  this.m_5721();
                  break;
               case THROW:
                  this.m_5708();
                  break;
               case RESTORE:
                  this.m_5703();
            }
         }
      }
   }

   private void m_5708() {
      f_11537.gameMode.useItem(f_11537.player, InteractionHand.MAIN_HAND);
      this.f_16465 = 1;
      this.f_16462 = PotionSwap.zbykevYTAvD7AXn8.RESTORE;
   }

   private boolean m_5709(ItemStack var1) {
      return var1 != null && (var1.is(Items.SPLASH_POTION) || var1.is(Items.LINGERING_POTION));
   }

   private void m_5710() {
      this.f_16462 = PotionSwap.zbykevYTAvD7AXn8.IDLE;
      this.f_16463 = -1;
      this.f_16464 = -1;
      this.f_16465 = 0;
      this.f_16466 = false;
      this.f_16467 = false;
   }

   public Screen_4 m_5712() {
      return this.f_16468;
   }

   private boolean m_5713() {
      return f_11537.player != null && f_11537.level != null && f_11537.gameMode != null;
   }

   private int m_5714(ItemStack var1) {
      if (var1 != null && !var1.isEmpty() && this.m_5713()) {
         NonNullList var2 = f_11537.player.getInventory().getNonEquipmentItems();

         for (int var3 = 0; var3 < var2.size(); var3++) {
            if (ItemStack.isSameItemSameComponents((ItemStack)var2.get(var3), var1)) {
               return var3 < 9 ? var3 + 36 : var3;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public void m_5715(int var1, ItemStack var2) {
      if (var1 >= 0 && var1 < this.f_16461.size() && this.m_5709(var2)) {
         ItemStack var3 = var2.copy();
         var3.setCount(1);
         this.f_16461.set(var1, var3);
      }
   }

   public void m_5716(Screen_4 var1) {
      this.f_16468 = var1;
   }

   private void m_5717(Class_bhRaN0YSSLQRYjPo var1) {
      if (this.f_16468 != null && var1.m_6083() != null) {
         if (this.f_16468.renderClosing(var1.m_6083())) {
            this.f_16468 = null;
         }
      }
   }

   public void m_5718(int var1) {
      if (var1 >= 0 && var1 < this.f_16461.size() && this.f_16461.size() > 2) {
         this.f_16461.remove(var1);
      }
   }

   public List<ItemStack> m_5719() {
      ArrayList var1 = new ArrayList();
      if (!this.m_5713()) {
         return var1;
      }

      for (ItemStack var3 : f_11537.player.getInventory().getNonEquipmentItems()) {
         if (this.m_5709(var3) && !this.m_5701(var1, var3)) {
            ItemStack var4 = var3.copy();
            var4.setCount(1);
            var1.add(var4);
         }
      }

      return var1;
   }

   private void m_5720(Class_B6JOzHnwhU3pe4AO var1) {
      if (var1.m_2117() == this.f_16460.m_8768() && this.f_16460.m_8768() >= 0) {
         if (var1.m_2116() == 1 && f_11537.gui.screen() == null && this.m_5713() && this.f_16462 == PotionSwap.zbykevYTAvD7AXn8.IDLE) {
            this.m_5706();
            f_11537.gui.setScreen(new Screen_4(this, this.f_16460.m_8768()));
         } else if (var1.m_2116() == 0 && f_11537.gui.screen() instanceof Screen_4 var2) {
            var2.finish(true);
         }
      }
   }

   private void m_5721() {
      if (this.f_16466) {
         Class_B6vpBUNmRtH3JzmV.m_2131(Class_B6vpBUNmRtH3JzmV.m_2127(this.f_16463));
         this.f_16467 = true;
         this.f_16465 = 1;
         this.f_16462 = PotionSwap.zbykevYTAvD7AXn8.THROW;
      } else {
         if (this.f_16469.m_1901(() -> Class_B6vpBUNmRtH3JzmV.m_2129(8, this.f_16463), true) == Class_8x4deAyjocMIBSj7.Class_8xzBZ83gOSc56UI6.SUCCESS) {
            Class_B6vpBUNmRtH3JzmV.m_2131(8);
            this.f_16467 = true;
            this.f_16465 = 1;
            this.f_16462 = PotionSwap.zbykevYTAvD7AXn8.THROW;
         }
      }
   }

   private enum zbykevYTAvD7AXn8 {
      IDLE,
      EQUIP,
      THROW,
      RESTORE;
   }
}
