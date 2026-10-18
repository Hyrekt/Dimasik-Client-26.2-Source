package dev.dimasik.client.module.misc;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.IntegerSetting;
import dev.dimasik.client.system.Class_8x4deAyjocMIBSj7;
import dev.dimasik.client.system.Class_B6JOzHnwhU3pe4AO;
import dev.dimasik.client.system.Class_B6vpBUNmRtH3JzmV;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import lombok.Generated;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class HeadSwap extends Module {
   private static final int f_15470 = 5;
   private final IntegerSetting f_15471;
   private ItemStack f_15472;
   private String f_15473;
   private final Class_8x4deAyjocMIBSj7 f_15474;
   private boolean f_15475;
   private int f_15476;
   private ItemStack f_15477;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_15478;
   private final Class_gEPk7yDw6CwIte87<Class_B6JOzHnwhU3pe4AO> f_15479;
   private static final String f_15480 = "HeadSwap";
   private static final String f_15481 = "Свапает добавленный предмет на голову и обратно";
   private static final String f_15482 = "Бинд";
   private static final String f_15483 = "Легитный";

   public HeadSwap() {
      super(f_15480, f_15481, Category.MISC);
      this.f_15471 = new IntegerSetting(f_15482, -1);
      this.f_15472 = ItemStack.EMPTY;
      this.f_15473 = "";
      this.f_15474 = new Class_8x4deAyjocMIBSj7();
      this.f_15476 = -1;
      this.f_15477 = ItemStack.EMPTY;
      this.f_15478 = this::m_5420;
      this.f_15479 = this::m_5417;
      this.m_795(this.f_15471);
   }

   private int m_5403() {
      for (int var1 = 0; var1 < f_11537.player.getInventory().getNonEquipmentItems().size(); var1++) {
         if (this.m_5418((ItemStack)f_11537.player.getInventory().getNonEquipmentItems().get(var1))) {
            return m_5414(var1);
         }
      }

      return -1;
   }

   private int m_5404() {
      if (!this.f_15477.isEmpty()) {
         int var1 = this.m_5412(this.f_15477);
         if (var1 >= 0) {
            this.f_15477 = ItemStack.EMPTY;
            return var1;
         }
      }

      int var2 = this.m_5408();
      this.f_15477 = ItemStack.EMPTY;
      return var2;
   }

   private boolean m_5406() {
      return this.m_5418(f_11537.player.getItemBySlot(EquipmentSlot.HEAD));
   }

   public void m_5407() {
      this.f_15472 = ItemStack.EMPTY;
      this.f_15473 = "";
      this.f_15477 = ItemStack.EMPTY;
   }

   private int m_5408() {
      for (int var1 = 0; var1 < 9; var1++) {
         if (f_11537.player.getInventory().getItem(var1).isEmpty()) {
            return var1 + 36;
         }
      }

      for (int var2 = 9; var2 < 36; var2++) {
         if (f_11537.player.getInventory().getItem(var2).isEmpty()) {
            return var2;
         }
      }

      return -1;
   }

   public void m_5409(Identifier var1, String var2) {
      if (var1 != null && BuiltInRegistries.ITEM.containsKey(var1) && var2 != null && !var2.isBlank()) {
         Item var3 = (Item)BuiltInRegistries.ITEM.getValue(var1);
         this.f_15472 = new ItemStack(var3);
         this.f_15473 = var2;
      } else {
         this.m_5407();
      }
   }

   public boolean m_5410() {
      return this.f_15472 != null && !this.f_15472.isEmpty() && !this.f_15473.isBlank();
   }

   @Generated
   public String m_5411() {
      return this.f_15473;
   }

   private int m_5412(ItemStack var1) {
      if (var1 != null && !var1.isEmpty()) {
         for (int var2 = 0; var2 < f_11537.player.getInventory().getNonEquipmentItems().size(); var2++) {
            ItemStack var3 = (ItemStack)f_11537.player.getInventory().getNonEquipmentItems().get(var2);
            if (ItemStack.isSameItemSameComponents(var3, var1)) {
               return m_5414(var2);
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public boolean m_5413(ItemStack var1) {
      if (var1 != null && !var1.isEmpty()) {
         ItemStack var2 = var1.copy();
         var2.setCount(1);
         this.f_15472 = var2;
         this.f_15473 = var1.getHoverName().getString();
         this.f_15477 = ItemStack.EMPTY;
         return true;
      } else {
         return false;
      }
   }

   private static int m_5414(int var0) {
      return var0 < 9 ? var0 + 36 : var0;
   }

   @Generated
   public ItemStack m_5415() {
      return this.f_15472;
   }

   private void m_5416() {
      if (Class_B6vpBUNmRtH3JzmV.m_2126(this.f_15476)) {
         if (this.f_15474.m_1901(() -> Class_B6vpBUNmRtH3JzmV.m_2129(Class_B6vpBUNmRtH3JzmV.m_2127(this.f_15476), 5), true)
            == Class_8x4deAyjocMIBSj7.Class_8xzBZ83gOSc56UI6.SUCCESS) {
            this.f_15476 = -1;
         }
      } else if (this.f_15474.m_1901(this::m_5423, true) == Class_8x4deAyjocMIBSj7.Class_8xzBZ83gOSc56UI6.SUCCESS) {
         this.f_15476 = -1;
      }
   }

   private void m_5417(Class_B6JOzHnwhU3pe4AO var1) {
      if (f_11537.gui.screen() == null) {
         if (this.f_15471.m_8768() >= 0) {
            if (var1.m_2116() == 1 && var1.m_2117() == this.f_15471.m_8768()) {
               this.f_15475 = true;
            }
         }
      }
   }

   @Override
   public void m_732() {
      this.f_15475 = false;
      this.f_15476 = -1;
      this.f_15477 = ItemStack.EMPTY;
   }

   private boolean m_5418(ItemStack var1) {
      return this.m_5410() && var1 != null && !var1.isEmpty()
         ? ItemStack.isSameItemSameComponents(var1, this.f_15472) || var1.getHoverName().getString().equalsIgnoreCase(this.f_15473)
         : false;
   }

   private void m_5419() {
      if (this.f_15475) {
         this.f_15475 = false;
         if (this.m_5410()) {
            if (this.m_5406()) {
               this.f_15476 = this.m_5404();
            } else {
               this.f_15477 = f_11537.player.getItemBySlot(EquipmentSlot.HEAD).copy();
               this.f_15476 = this.m_5403();
            }
         }
      }
   }

   private void m_5420(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null) {
         if (f_11537.gui.screen() == null) {
            this.m_5419();
            if (this.f_15476 >= 0) {
               if (DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5152().m_7568(f_15483)) {
                  this.m_5416();
               } else {
                  this.m_5421();
               }
            }
         }
      }
   }

   private void m_5421() {
      if (Class_B6vpBUNmRtH3JzmV.m_2126(this.f_15476)) {
         Class_B6vpBUNmRtH3JzmV.m_2129(Class_B6vpBUNmRtH3JzmV.m_2127(this.f_15476), 5);
      } else {
         this.m_5423();
      }

      this.f_15476 = -1;
   }

   public Identifier m_5422() {
      return !this.m_5410() ? null : BuiltInRegistries.ITEM.getKey(this.f_15472.getItem());
   }

   private void m_5423() {
      Class_B6vpBUNmRtH3JzmV.m_2129(8, this.f_15476);
      Class_B6vpBUNmRtH3JzmV.m_2129(8, 5);
      Class_B6vpBUNmRtH3JzmV.m_2129(8, this.f_15476);
   }
}
