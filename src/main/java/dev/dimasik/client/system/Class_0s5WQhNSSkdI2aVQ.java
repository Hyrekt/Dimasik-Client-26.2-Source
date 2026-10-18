package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import net.minecraft.network.protocol.game.ServerboundSetCarriedItemPacket;
import net.minecraft.world.entity.player.Player;

public final class Class_0s5WQhNSSkdI2aVQ implements Class_NzJrN63M7QBpmAbi {
   private int f_453 = -1;
   private int f_454 = -1;
   private int f_455 = -1;
   private Player f_456;

   private static void m_810(int var0) {
      f_11537.player.getInventory().setSelectedSlot(var0);
      f_11537.gameMode.ensureHasSentCarriedItem();
      if (DimasikClient.m_9057().m_9052().m_6338().m_1507() != var0) {
         f_11537.player.connection.send(new ServerboundSetCarriedItemPacket(var0));
      }
   }

   public void m_811() {
      if (this.f_453 != -1
         && f_11537.player != null
         && f_11537.player == this.f_456
         && f_11537.gameMode != null
         && f_11537.player.getInventory().getSelectedSlot() == this.f_454) {
         m_810(this.f_453);
      }

      this.f_453 = this.f_454 = this.f_455 = -1;
      this.f_456 = null;
   }

   public boolean m_812(int var1, boolean var2) {
      if (f_11537.player != null && f_11537.gameMode != null && var1 >= 0 && var1 <= 8) {
         if (this.f_456 != f_11537.player) {
            this.f_453 = this.f_454 = this.f_455 = -1;
            this.f_456 = f_11537.player;
         }

         int var3 = f_11537.player.getInventory().getSelectedSlot();
         boolean var4 = this.f_454 != var1 || var3 != var1 || DimasikClient.m_9057().m_9052().m_6338().m_1507() != var1;
         if (this.f_453 == -1 || var3 != this.f_454) {
            this.f_453 = var3;
         }

         this.f_454 = var1;
         if (var4) {
            this.f_455 = f_11537.player.tickCount;
         }

         m_810(var1);
         return !var2 || f_11537.player.tickCount > this.f_455;
      } else {
         return false;
      }
   }
}
