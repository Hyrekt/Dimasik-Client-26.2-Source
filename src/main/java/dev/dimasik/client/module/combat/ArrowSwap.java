package dev.dimasik.client.module.combat;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.IntegerSetting;
import dev.dimasik.client.system.Class_8UIDpbIRPAjhei7m;
import dev.dimasik.client.system.Class_8x4deAyjocMIBSj7;
import dev.dimasik.client.system.Class_B6JOzHnwhU3pe4AO;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_bhRaN0YSSLQRYjPo;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.ui.screen.Screen_6;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.multiplayer.MultiPlayerGameMode;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.NonNullList;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ArrowSwap extends Module {
   public static final int f_19251 = 2;
   public static final int f_19252 = 6;
   private static final int f_19253 = 9;
   private static final int f_19254 = 36;
   private final IntegerSetting f_19255;
   private final List<ItemStack> f_19256;
   private final List<String> f_19257;
   private final Class_8x4deAyjocMIBSj7 f_19258;
   private Screen_6 f_19259;
   private int f_19260;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_19261;
   private final Class_gEPk7yDw6CwIte87<Class_B6JOzHnwhU3pe4AO> f_19262;
   private final Class_gEPk7yDw6CwIte87<Class_bhRaN0YSSLQRYjPo> f_19263;
   private static final String f_19264 = "ArrowSwap";
   private static final String f_19265 = "Колесо для свапа стрел в инвентаре";
   private static final String f_19266 = "Клавиша свапа";
   private static final String f_19267 = "Легитный";
   private static final String f_19268 = "Рейджовый";
   private static final String f_19269 = "M";
   private static final String f_19270 = "Стрела в инве";

   private void m_6410() {
      if (this.f_19260 != -1) {
         this.m_6433();
         this.m_6416();
         this.f_19260 = -1;
      }
   }

   private void m_6411(Class_bhRaN0YSSLQRYjPo var1) {
      if (this.f_19259 != null && var1.m_6083() != null) {
         if (this.f_19259.renderClosing(var1.m_6083())) {
            this.f_19259 = null;
         }
      }
   }

   public int m_6412() {
      return this.f_19256.size();
   }

   public ItemStack m_6413(int var1) {
      return var1 >= 0 && var1 < this.f_19256.size() ? this.f_19256.get(var1) : ItemStack.EMPTY;
   }

   private int m_6414(ItemStack var1, String var2) {
      if (var1 != null && !var1.isEmpty() && f_11537.player != null) {
         int var3 = this.m_6420();
         NonNullList var4 = f_11537.player.getInventory().getNonEquipmentItems();

         for (int var5 = 0; var5 < var4.size(); var5++) {
            int var6 = this.m_6426(var5);
            if (var6 != var3) {
               ItemStack var7 = (ItemStack)var4.get(var5);
               if (this.m_6425(var7, var1, var2)) {
                  return var6;
               }
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public int m_6415() {
      if (this.f_19256.size() >= 6) {
         return Math.max(0, this.f_19256.size() - 1);
      }

      this.f_19256.add(ItemStack.EMPTY);
      this.f_19257.add("");
      return this.f_19256.size() - 1;
   }

   private void m_6416() {
      ItemStack var1 = f_11537.player.getInventory().getItem(this.m_6420());
      if (!var1.isEmpty()) {
         Class_8UIDpbIRPAjhei7m.m_1796(f_19269, var1.getHoverName(), f_19270, -1, var1);
      }
   }

   private int m_6417() {
      return this.m_6420();
   }

   public boolean m_6418(int var1) {
      return var1 >= 0
         && var1 < this.f_19256.size()
         && !this.f_19256.get(var1).isEmpty()
         && (this.m_6429(this.f_19256.get(var1), this.f_19257.get(var1)) || this.m_6414(this.f_19256.get(var1), this.f_19257.get(var1)) != -1);
   }

   public void m_6419(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.gui.screen() == null) {
         if (this.f_19260 != -1) {
            if (DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5152().m_7568(f_19267)) {
               this.m_6427();
            } else if (DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5152().m_7568(f_19268)) {
               this.m_6410();
            }
         }
      }
   }

   private int m_6420() {
      if (f_11537.player == null) {
         return 9;
      }

      for (int var1 = 9; var1 < 36; var1++) {
         if (m_6431(f_11537.player.getInventory().getItem(var1))) {
            return var1;
         }
      }

      return 9;
   }

   public void m_6421(int var1) {
      if (this.f_19256.size() > 2) {
         int var2 = var1 >= 0 && var1 < this.f_19256.size() ? var1 : this.f_19256.size() - 1;
         this.f_19256.remove(var2);
         this.f_19257.remove(var2);
      }
   }

   private void m_6422() {
      if (this.f_19256.isEmpty()) {
         for (int var1 = 0; var1 < 3; var1++) {
            this.f_19256.add(ItemStack.EMPTY);
            this.f_19257.add("");
         }
      }
   }

   private void m_6423(int var1, int var2) {
      MultiPlayerGameMode var3 = f_11537.gameMode;
      LocalPlayer var4 = f_11537.player;
      int var5 = var4.inventoryMenu.containerId;
      var3.handleContainerInput(var5, var1, 0, ContainerInput.PICKUP, var4);
      var3.handleContainerInput(var5, var2, 0, ContainerInput.PICKUP, var4);
      var3.handleContainerInput(var5, var1, 0, ContainerInput.PICKUP, var4);
   }

   public void m_6424(int var1, ItemStack var2) {
      if (var1 >= 0 && var1 < this.f_19256.size() && var2 != null && !var2.isEmpty() && m_6431(var2)) {
         ItemStack var3 = var2.copy();
         var3.setCount(1);
         this.f_19256.set(var1, var3);
         this.f_19257.set(var1, var2.getHoverName().getString());
      }
   }

   private boolean m_6425(ItemStack var1, ItemStack var2, String var3) {
      return ItemStack.isSameItemSameComponents(var1, var2) || !var3.isBlank() && var1.getHoverName().getString().equalsIgnoreCase(var3);
   }

   private int m_6426(int var1) {
      return var1 < 9 ? var1 + 36 : var1;
   }

   public ArrowSwap() {
      super(f_19264, f_19265, Category.COMBAT);
      this.f_19255 = new IntegerSetting(f_19266, -1);
      this.f_19256 = new ArrayList<>();
      this.f_19257 = new ArrayList<>();
      this.f_19258 = new Class_8x4deAyjocMIBSj7();
      this.f_19260 = -1;
      this.f_19261 = this::m_6419;
      this.f_19262 = this::m_6428;
      this.f_19263 = this::m_6411;
      this.m_795(this.f_19255);
      this.m_6422();
   }

   private void m_6427() {
      if (this.f_19260 != -1 && this.f_19258.m_1901(this::m_6433, true) == Class_8x4deAyjocMIBSj7.Class_8xzBZ83gOSc56UI6.SUCCESS) {
         this.m_6416();
         this.f_19260 = -1;
      }
   }

   public void m_6428(Class_B6JOzHnwhU3pe4AO var1) {
      if (var1.m_2117() == this.f_19255.m_8768() && this.f_19255.m_8768() >= 0) {
         if (var1.m_2116() == 1 && f_11537.gui.screen() == null) {
            this.m_6422();
            f_11537.gui.setScreen(new Screen_6(this, this.f_19255.m_8768()));
         } else if (var1.m_2116() == 0 && f_11537.gui.screen() instanceof Screen_6 var2) {
            var2.finish(true);
         }
      }
   }

   private boolean m_6429(ItemStack var1, String var2) {
      if (f_11537.player != null && var1 != null && !var1.isEmpty()) {
         ItemStack var3 = f_11537.player.getInventory().getItem(this.m_6420());
         return var3.isEmpty() ? false : this.m_6425(var3, var1, var2);
      } else {
         return false;
      }
   }

   public void m_6430(Screen_6 var1) {
      this.f_19259 = var1;
   }

   public static boolean m_6431(ItemStack var0) {
      return var0 != null && (var0.is(Items.ARROW) || var0.is(Items.SPECTRAL_ARROW) || var0.is(Items.TIPPED_ARROW));
   }

   public Screen_6 m_6432() {
      return this.f_19259;
   }

   private void m_6433() {
      int var1 = this.f_19260;
      int var2 = this.m_6417();
      if (var1 >= 0 && var2 >= 0 && var1 != var2) {
         this.m_6423(var1, var2);
      }
   }

   @Override
   public void m_732() {
      if (f_11537.gui.screen() instanceof Screen_6 var1) {
         var1.finish(false);
      }

      this.f_19259 = null;
      this.f_19260 = -1;
   }

   public void m_6434(int var1) {
      if (var1 >= 0 && var1 < this.f_19256.size() && !this.f_19256.get(var1).isEmpty()) {
         if (!this.m_6429(this.f_19256.get(var1), this.f_19257.get(var1))) {
            int var2 = this.m_6414(this.f_19256.get(var1), this.f_19257.get(var1));
            if (var2 != -1) {
               this.f_19260 = var2;
            }
         }
      }
   }
}
