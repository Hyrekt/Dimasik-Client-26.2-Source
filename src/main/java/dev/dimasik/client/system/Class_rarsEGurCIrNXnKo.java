package dev.dimasik.client.system;

import dev.dimasik.client.module.combat.ArrowSwap;
import dev.dimasik.client.ui.screen.Screen_6;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.inventory.Slot;

public final class Class_rarsEGurCIrNXnKo extends InventoryScreen {
   private final ArrowSwap f_30291;
   private final int f_30292;
   private final Screen_6 f_30293;
   private final int f_30294;

   public Class_rarsEGurCIrNXnKo(ArrowSwap var1, int var2, Screen_6 var3, int var4) {
      super(Minecraft.getInstance().player);
      this.f_30291 = var1;
      this.f_30292 = var2;
      this.f_30293 = var3;
      this.f_30294 = var4;
   }

   public void onClose() {
      this.minecraft.gui.setScreen(this.f_30293);
   }

   public boolean keyReleased(KeyEvent var1) {
      if (var1.key() == this.f_30294) {
         this.minecraft.gui.setScreen(null);
         return true;
      } else {
         return super.keyReleased(var1);
      }
   }

   protected void slotClicked(Slot var1, int var2, int var3, ContainerInput var4) {
      if (var1 != null
         && var1.container == this.minecraft.player.getInventory()
         && var1.getContainerSlot() >= 0
         && var1.getContainerSlot() < 36
         && var1.hasItem()
         && ArrowSwap.m_6431(var1.getItem())) {
         this.f_30291.m_6424(this.f_30292, var1.getItem());
         this.minecraft.gui.setScreen(this.f_30293);
      }
   }
}
