package dev.dimasik.client.system;

import dev.dimasik.client.module.combat.AutoSwap;
import dev.dimasik.client.ui.screen.Screen_5;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.inventory.Slot;

public final class Class_ucjlq1kQnFTjSi07 extends InventoryScreen {
   private final AutoSwap f_33156;
   private final int f_33157;
   private final Screen_5 f_33158;
   private final int f_33159;

   public boolean keyReleased(KeyEvent var1) {
      if (var1.key() == this.f_33159) {
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
         && this.f_33156.m_7497(this.f_33157, var1.getItem())) {
         this.minecraft.gui.setScreen(this.f_33158);
      }
   }

   public Class_ucjlq1kQnFTjSi07(AutoSwap var1, int var2, Screen_5 var3, int var4) {
      super(Minecraft.getInstance().player);
      this.f_33156 = var1;
      this.f_33157 = var2;
      this.f_33158 = var3;
      this.f_33159 = var4;
   }

   public void onClose() {
      this.minecraft.gui.setScreen(this.f_33158);
   }
}
