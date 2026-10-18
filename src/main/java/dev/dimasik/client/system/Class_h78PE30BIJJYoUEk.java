package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.mixin.MultiPlayerGameModeMixin;
import lombok.Generated;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.protocol.game.ServerboundContainerClosePacket;
import net.minecraft.network.protocol.game.ServerboundSetCarriedItemPacket;
import net.minecraft.network.protocol.game.ServerboundSwingPacket;
import net.minecraft.network.protocol.game.ServerboundUseItemPacket;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.equipment.Equippable;
import net.minecraft.world.level.block.state.BlockState;

public final class Class_h78PE30BIJJYoUEk implements Class_NzJrN63M7QBpmAbi {
   private static final String f_23148 = "This is a utility class and cannot be instantiated";

   public static void m_7064(Item var0) {
      if (f_11537.player != null && f_11537.gameMode != null) {
         int var1 = m_7074(var0);
         if (var1 != -1) {
            int var2 = f_11537.player.getInventory().selected;
            boolean var3 = var1 < 9;
            if (var3 && var1 == var2) {
               if (f_11537.player.isUsingItem() && !f_11537.player.isBlocking()) {
                  f_11537.getConnection()
                     .send(
                        new ServerboundUseItemPacket(
                           InteractionHand.OFF_HAND,
                           f_11537.level.getBlockStatePredictionHandler().startPredicting().currentSequence(),
                           f_11537.player.getYRot(),
                           f_11537.player.getXRot()
                        )
                     );
               } else {
                  f_11537.getConnection()
                     .send(
                        new ServerboundUseItemPacket(
                           InteractionHand.MAIN_HAND,
                           f_11537.level.getBlockStatePredictionHandler().startPredicting().currentSequence(),
                           f_11537.player.getYRot(),
                           f_11537.player.getXRot()
                        )
                     );
               }
            } else if (var3) {
               m_7073(var1, var2);
            } else {
               int var4 = var2 % 8 + 1;
               f_11537.gameMode.handleContainerInput(0, var1, var4, ContainerInput.SWAP, f_11537.player);
               m_7073(var4, var2);
               f_11537.gameMode.handleContainerInput(0, var1, var4, ContainerInput.SWAP, f_11537.player);
            }
         }
      }
   }

   public static void m_7065(int var0, int var1) {
      if (var0 != var1) {
         var0 = var0 < 9 ? var0 + 36 : var0;
         f_11537.gameMode.handleContainerInput(0, var0, 0, ContainerInput.SWAP, f_11537.player);
         f_11537.gameMode.handleContainerInput(0, var1, 0, ContainerInput.SWAP, f_11537.player);
         f_11537.gameMode.handleContainerInput(0, var0, 0, ContainerInput.SWAP, f_11537.player);
      }
   }

   public static void m_7066(int var0, int var1) {
      if (var0 != -1 && var1 != -1) {
         f_11537.gameMode.handleContainerInput(f_11537.player.inventoryMenu.containerId, var0, var1, ContainerInput.SWAP, f_11537.player);
         f_11537.getConnection().send(new ServerboundContainerClosePacket(0));
      }
   }

   public static boolean m_7067(Item var0) {
      return f_11537.player == null ? false : f_11537.player.getMainHandItem().is(var0) || f_11537.player.getOffhandItem().is(var0);
   }

   public static int m_7068(Item var0) {
      return m_7077(var0, 0, 35);
   }

   @Generated
   private Class_h78PE30BIJJYoUEk() {
      throw new UnsupportedOperationException(f_23148);
   }

   public static int m_7069(int var0) {
      return var0 >= 0 && var0 <= 8 ? 36 + var0 : var0;
   }

   public static int m_7070() {
      int var0 = -1;
      int var1 = -1;

      for (int var2 = 0; var2 < f_11537.player.getInventory().getNonEquipmentItems().size(); var2++) {
         ItemStack var3 = (ItemStack)f_11537.player.getInventory().getNonEquipmentItems().get(var2);
         if (!var3.isEmpty() && !var3.is(Items.ELYTRA)) {
            Equippable var4 = (Equippable)var3.get(DataComponents.EQUIPPABLE);
            if (var4 != null && var4.slot() == EquipmentSlot.CHEST) {
               int var5 = m_7076(var3);
               if (var5 > var1) {
                  var1 = var5;
                  var0 = var2;
               }
            }
         }
      }

      return var0 >= 0 && var0 < 9 ? var0 + 36 : var0;
   }

   public static void m_7071(Class_h78PE30BIJJYoUEk.N57SAhNAuO8NHWc1 var0, int var1, int var2) {
      if (var1 != -1 && var2 != -1 && var1 != DimasikClient.m_9057().m_9052().m_6338().m_1507()) {
         switch (var0) {
            case Normal:
               f_11537.player.getInventory().selected = var1;
               ((MultiPlayerGameModeMixin)f_11537.gameMode).syncSelectedSlot$drug();
               break;
            case Silent:
               f_11537.getConnection().send(new ServerboundSetCarriedItemPacket(var1));
               break;
            case Alternative:
               m_7075(Class_h78PE30BIJJYoUEk.F2lqPPWig467euUg.Swap, var1, var2);
         }
      }
   }

   public static void m_7072(Class_h78PE30BIJJYoUEk.dpblX4sGlSoWbrTC var0) {
      switch (var0) {
         case MainHand:
            f_11537.player.swing(InteractionHand.MAIN_HAND);
            break;
         case OffHand:
            f_11537.player.swing(InteractionHand.OFF_HAND);
            break;
         case Packet:
            f_11537.getConnection().send(new ServerboundSwingPacket(InteractionHand.MAIN_HAND));
      }
   }

   private static void m_7073(int var0, int var1) {
      if (f_11537.player != null) {
         if (f_11537.player.isUsingItem() && !f_11537.player.isBlocking()) {
            m_7065(var0, 45);
            f_11537.getConnection()
               .send(
                  new ServerboundUseItemPacket(
                     InteractionHand.OFF_HAND,
                     f_11537.level.getBlockStatePredictionHandler().startPredicting().currentSequence(),
                     f_11537.player.getYRot(),
                     f_11537.player.getXRot()
                  )
               );
            m_7065(var0, 45);
         } else {
            f_11537.getConnection().send(new ServerboundSetCarriedItemPacket(var0));
            f_11537.getConnection()
               .send(
                  new ServerboundUseItemPacket(
                     InteractionHand.MAIN_HAND,
                     f_11537.level.getBlockStatePredictionHandler().startPredicting().currentSequence(),
                     f_11537.player.getYRot(),
                     f_11537.player.getXRot()
                  )
               );
            f_11537.getConnection().send(new ServerboundSetCarriedItemPacket(var1));
         }
      }
   }

   public static int m_7074(Item var0) {
      if (f_11537 != null && f_11537.player != null) {
         for (int var1 = 0; var1 < 36; var1++) {
            ItemStack var2 = f_11537.player.getInventory().getItem(var1);
            if (!var2.isEmpty() && var2.getItem() == var0) {
               return var1;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public static void m_7075(Class_h78PE30BIJJYoUEk.F2lqPPWig467euUg var0, int var1, int var2) {
      if (var1 != -1 && var2 != -1) {
         switch (var0) {
            case Pickup:
               f_11537.gameMode.handleContainerInput(f_11537.player.containerMenu.containerId, m_7069(var1), 0, ContainerInput.PICKUP, f_11537.player);
               f_11537.gameMode.handleContainerInput(f_11537.player.containerMenu.containerId, m_7069(var2), 0, ContainerInput.PICKUP, f_11537.player);
               f_11537.gameMode.handleContainerInput(f_11537.player.containerMenu.containerId, m_7069(var1), 0, ContainerInput.PICKUP, f_11537.player);
               break;
            case Swap:
               f_11537.gameMode.handleContainerInput(f_11537.player.containerMenu.containerId, var1, var2, ContainerInput.SWAP, f_11537.player);
         }
      }
   }

   private static int m_7076(ItemStack var0) {
      if (var0.is(Items.NETHERITE_CHESTPLATE)) {
         return 5;
      } else if (var0.is(Items.DIAMOND_CHESTPLATE)) {
         return 4;
      } else if (var0.is(Items.IRON_CHESTPLATE)) {
         return 3;
      } else if (var0.is(Items.CHAINMAIL_CHESTPLATE)) {
         return 2;
      } else if (var0.is(Items.GOLDEN_CHESTPLATE)) {
         return 1;
      } else {
         return var0.is(Items.LEATHER_CHESTPLATE) ? 0 : -1;
      }
   }

   public static int m_7077(Item var0, int var1, int var2) {
      for (int var3 = var2; var3 >= var1; var3--) {
         if (f_11537.player.getInventory().getItem(var3).getItem() == var0) {
            return var3;
         }
      }

      return -1;
   }

   public static int m_7078(Item var0) {
      if (f_11537.player == null) {
         return 0;
      }

      int var1 = 0;

      for (ItemStack var3 : f_11537.player.getInventory().getNonEquipmentItems()) {
         if (!var3.isEmpty() && var3.getItem().equals(var0)) {
            var1 += var3.getCount();
         }
      }

      return var1;
   }

   public static int m_7079() {
      for (int var0 = 0; var0 < 45; var0++) {
         ItemStack var1 = f_11537.player.getInventory().getItem(var0);
         if (!var1.isEmpty() && var1.getItem() instanceof AxeItem) {
            return var0;
         }
      }

      return -1;
   }

   public static void m_7080(Class_h78PE30BIJJYoUEk.N57SAhNAuO8NHWc1 var0, int var1, int var2) {
      if (var1 != -1 && var2 != -1 && var1 != DimasikClient.m_9057().m_9052().m_6338().m_1507()) {
         switch (var0) {
            case Normal:
               f_11537.player.getInventory().selected = var2;
               ((MultiPlayerGameModeMixin)f_11537.gameMode).syncSelectedSlot$drug();
               break;
            case Silent:
               f_11537.getConnection().send(new ServerboundSetCarriedItemPacket(var2));
               break;
            case Alternative:
               m_7075(Class_h78PE30BIJJYoUEk.F2lqPPWig467euUg.Swap, var1, var2);
         }
      }
   }

   public static int m_7081(BlockState var0, boolean var1) {
      if (f_11537.player == null) {
         return -1;
      }

      int var2 = -1;
      float var3 = 1.0F;
      int var4 = var1 ? 9 : 36;

      for (int var5 = 0; var5 < var4; var5++) {
         ItemStack var6 = f_11537.player.getInventory().getItem(var5);
         if (!var6.isEmpty()) {
            float var7 = var6.getDestroySpeed(var0);
            if (var7 > var3) {
               var3 = var7;
               var2 = var5;
            }
         }
      }

      return var2;
   }

   public static void m_7082(int var0) {
      if (var0 != -1 && var0 != DimasikClient.m_9057().m_9052().m_6338().m_1507()) {
         f_11537.getConnection().send(new ServerboundSetCarriedItemPacket(var0));
      }
   }

   public enum F2lqPPWig467euUg {
      Pickup,
      Swap;
   }

   public enum N57SAhNAuO8NHWc1 implements Class_5JDFChI6RMPqnBUe {
      Normal("settings.normal"),
      Silent("settings.switch.silent"),
      Alternative("settings.switch.alternative"),
      None("settings.none");

      public final String f_23146;

      @Override
      public String m_1470() {
         return this.f_23146;
      }

      @Generated
      N57SAhNAuO8NHWc1(String var3) {
         this.f_23146 = var3;
      }
   }

   public enum dpblX4sGlSoWbrTC implements Class_5JDFChI6RMPqnBUe {
      MainHand("settings.swing.mainhand"),
      OffHand("settings.swing.offhand"),
      Packet("settings.packet"),
      None("settings.none");

      public final String f_23147;

      @Override
      public String m_1470() {
         return this.f_23147;
      }

      @Generated
      dpblX4sGlSoWbrTC(String var3) {
         this.f_23147 = var3;
      }
   }
}
