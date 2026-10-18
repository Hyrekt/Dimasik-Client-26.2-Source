package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.setting.impl.SliderSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_QmNR03reugBgWiPr;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import net.minecraft.client.gui.screens.inventory.ContainerScreen;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

public final class ChestStealer extends Module {
   private final MultiChoiceSetting f_11661;
   private final SliderSetting f_11662;
   private final Set<Identifier> f_11663;
   private final Class_QmNR03reugBgWiPr f_11664;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_11665;
   private int f_11666;
   private static final String f_11667 = "ChestStealer";
   private static final String f_11668 = "Автоматически забирает предметы из контейнера";
   private static final String f_11669 = "Режим";
   private static final String f_11670 = "Все";
   private static final String f_11671 = "Кастом";
   private static final String f_11672 = "Задержка";
   private static final float f_11673 = 100.0F;
   private static final float f_11674 = 1000.0F;
   private static final float f_11675 = 10.0F;
   private static final String f_11676 = "Все";

   public boolean m_4079(Identifier var1) {
      return var1 != null && this.f_11663.remove(var1);
   }

   public void m_4080(Collection<Identifier> var1) {
      this.f_11663.clear();
      if (var1 != null) {
         this.f_11663.addAll(var1);
      }
   }

   public ChestStealer() {
      super(f_11667, f_11668, Category.MISC);
      this.f_11661 = new MultiChoiceSetting(f_11669, new Class_2ZaVm8TGDJ68TnJB(f_11670), new Class_2ZaVm8TGDJ68TnJB(f_11671));
      this.f_11662 = new SliderSetting(f_11672, f_11673, 0.0F, f_11674).m_828(f_11675);
      this.f_11663 = new LinkedHashSet<>();
      this.f_11664 = new Class_QmNR03reugBgWiPr();
      this.f_11665 = this::m_4081;
      this.f_11666 = -1;
      this.m_795(this.f_11661, this.f_11662);
   }

   private void m_4081(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player == null || f_11537.gameMode == null) {
         this.m_4087();
      } else if (!(f_11537.gui.screen() instanceof ContainerScreen)) {
         this.m_4087();
      } else if (f_11537.player.containerMenu instanceof ChestMenu var2) {
         if (var2.containerId != this.f_11666) {
            this.f_11666 = var2.containerId;
            this.f_11664.m_4459();
         } else if (this.f_11664.m_4463(this.f_11662.m_8768().longValue())) {
            int var7 = var2.getRowCount() * 9;

            for (int var4 = 0; var4 < var7; var4++) {
               Slot var5 = var2.getSlot(var4);
               if (var5.hasItem() && var5.mayPickup(f_11537.player)) {
                  ItemStack var6 = var5.getItem();
                  if (this.m_4088(var6) && this.m_4084(var6)) {
                     f_11537.gameMode.handleContainerInput(var2.containerId, var4, 0, ContainerInput.QUICK_MOVE, f_11537.player);
                     this.f_11664.m_4459();
                     return;
                  }
               }
            }
         }
      } else {
         this.m_4087();
      }
   }

   @Override
   public void m_732() {
      this.m_4087();
      super.m_732();
   }

   public boolean m_4082(Identifier var1) {
      return var1 != null && this.f_11663.add(var1);
   }

   public List<Identifier> m_4083() {
      return List.copyOf(this.f_11663);
   }

   private boolean m_4084(ItemStack var1) {
      for (int var2 = 0; var2 < 36; var2++) {
         ItemStack var3 = f_11537.player.getInventory().getItem(var2);
         if (var3.isEmpty()) {
            return true;
         }

         if (ItemStack.isSameItemSameComponents(var1, var3) && var3.getCount() < var3.getMaxStackSize()) {
            return true;
         }
      }

      return false;
   }

   public boolean m_4085(Identifier var1) {
      return this.f_11663.contains(var1);
   }

   public void m_4086() {
      this.f_11663.clear();
   }

   private void m_4087() {
      this.f_11666 = -1;
      this.f_11664.m_4459();
   }

   private boolean m_4088(ItemStack var1) {
      if (this.f_11661.m_7568(f_11676)) {
         return true;
      }

      Identifier var2 = BuiltInRegistries.ITEM.getKey(var1.getItem());
      return this.f_11663.contains(var2);
   }

   @Override
   public void m_778() {
      this.f_11664.m_4459();
      this.f_11666 = -1;
      super.m_778();
   }
}
