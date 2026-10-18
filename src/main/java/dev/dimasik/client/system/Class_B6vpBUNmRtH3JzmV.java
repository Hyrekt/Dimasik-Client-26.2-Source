package dev.dimasik.client.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import lombok.Generated;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.protocol.game.ServerboundContainerClosePacket;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket;
import net.minecraft.network.protocol.game.ServerboundSetCarriedItemPacket;
import net.minecraft.network.protocol.game.ServerboundPlayerActionPacket.Action;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.level.block.state.BlockState;

public final class Class_B6vpBUNmRtH3JzmV implements Class_NzJrN63M7QBpmAbi {
   private static final List<Class_B6vpBUNmRtH3JzmV.V2smDySWLv9qpaBk> f_5329 = new ArrayList<>();
   private static int f_5330 = -1;
   private static final String f_5331 = "драконид";
   private static final String f_5332 = "This is a utility class and cannot be instantiated";

   public static void m_2123(int var0) {
      f_5330 = var0;
   }

   public static int m_2124() {
      return f_11537.player.getInventory().selected + 1 > 8 ? f_11537.player.getInventory().selected - 1 : f_11537.player.getInventory().selected + 1;
   }

   @Generated
   private Class_B6vpBUNmRtH3JzmV() {
      throw new UnsupportedOperationException(f_5332);
   }

   public static boolean m_2126(int var0) {
      return var0 >= 36 && var0 <= 44;
   }

   public static int m_2127(int var0) {
      return var0 >= 36 ? var0 - 36 : var0;
   }

   public static int m_2128(Item var0) {
      int var1 = -1;
      if (f_11537.player != null) {
         for (int var2 = 0; var2 < f_11537.player.getInventory().getNonEquipmentItems().size(); var2++) {
            if (((ItemStack)f_11537.player.getInventory().getNonEquipmentItems().get(var2)).getItem().equals(var0)) {
               var1 = var2;
               break;
            }
         }
      }

      if (var1 != -1 && var1 < 9) {
         var1 += 36;
      }

      return var1;
   }

   public static void m_2129(int var0, int var1) {
      if (f_11537.player != null
         && f_11537.gameMode != null
         && f_11537.player.isAlive()
         && f_11537.player.containerMenu == f_11537.player.inventoryMenu
         && f_11537.player.inventoryMenu.getCarried().isEmpty()
         && (var0 == 40 || var0 >= 0 && var0 <= 8)
         && var1 >= 0
         && var1 < f_11537.player.inventoryMenu.slots.size()) {
         f_11537.gameMode.handleContainerInput(0, var1, var0, ContainerInput.SWAP, f_11537.player);
         int var2 = var0 == 40 ? 45 : var0 + 36;
         f_5329.removeIf(var0x -> var0x.m_2119().m_7443(60));
         f_5329.add(
            new Class_B6vpBUNmRtH3JzmV.V2smDySWLv9qpaBk(
               var1, var2, f_11537.player.inventoryMenu.getSlot(var1).getItem().copy(), f_11537.player.inventoryMenu.getSlot(var2).getItem().copy()
            )
         );
      }
   }

   public static int m_2130(Holder<MobEffect> var0) {
      int var1 = -1;
      if (f_11537.player != null) {
         for (int var2 = 0; var2 < f_11537.player.getInventory().getNonEquipmentItems().size(); var2++) {
            if (((ItemStack)f_11537.player.getInventory().getNonEquipmentItems().get(var2)).has(DataComponents.POTION_CONTENTS)) {
               PotionContents var3 = (PotionContents)((ItemStack)f_11537.player.getInventory().getNonEquipmentItems().get(var2))
                  .get(DataComponents.POTION_CONTENTS);

               for (MobEffectInstance var5 : var3.getAllEffects()) {
                  if (var5.getEffect().equals(var0)) {
                     var1 = var2;
                     break;
                  }
               }
            }
         }
      }

      if (var1 != -1 && var1 < 9) {
         var1 += 36;
      }

      return var1;
   }

   public static void m_2131(int var0) {
      if (var0 != f_5330) {
         if (var0 >= 0 && var0 <= 9) {
            f_5330 = var0;
            f_11537.player.connection.send(new ServerboundSetCarriedItemPacket(f_5330));
         }
      }
   }

   public static int m_2132(Item var0, boolean var1) {
      int var2 = -1;
      if (f_11537.player != null) {
         for (int var3 = 0; var3 < f_11537.player.getInventory().getNonEquipmentItems().size(); var3++) {
            if (((ItemStack)f_11537.player.getInventory().getNonEquipmentItems().get(var3)).getItem().equals(var0)
               && (
                  !((ItemStack)f_11537.player.getInventory().getNonEquipmentItems().get(var3))
                        .getHoverName()
                        .getString()
                        .toLowerCase(Locale.ROOT)
                        .contains(f_5331)
                     || !var1
               )) {
               var2 = var3;
               break;
            }
         }
      }

      if (var2 != -1 && var2 < 9) {
         var2 += 36;
      }

      return var2;
   }

   public static void m_2133(int var0, int var1) {
      m_2129(var0, var1);
      Class_3LQSDrJ0WJYOQ7ck.m_1293(new ServerboundContainerClosePacket(0));
   }

   public static int m_2134(BlockState var0) {
      int var1 = -1;
      ItemStack var2 = null;

      for (int var3 = 0; var3 < 9; var3++) {
         ItemStack var4 = (ItemStack)f_11537.player.getInventory().getNonEquipmentItems().get(var3);
         if ((var2 == null || var2.getDestroySpeed(var0) < var4.getDestroySpeed(var0)) && var4.getDestroySpeed(var0) > 1.0F) {
            var2 = var4;
            var1 = var3;
         }
      }

      return var1;
   }

   public static void m_2135() {
      Class_3LQSDrJ0WJYOQ7ck.m_1293(new ServerboundPlayerActionPacket(Action.SWAP_ITEM_WITH_OFFHAND, new BlockPos(0, 0, 0), Direction.DOWN));
   }

   @Generated
   public static List<Class_B6vpBUNmRtH3JzmV.V2smDySWLv9qpaBk> m_2136() {
      return f_5329;
   }

   public static class V2smDySWLv9qpaBk {
      public final int f_5324;
      public final int f_5325;
      public final ItemStack f_5326;
      public final ItemStack f_5327;
      public final Class_kPXtxQj0j9mBpxqt f_5328 = new Class_kPXtxQj0j9mBpxqt();

      @Generated
      public V2smDySWLv9qpaBk(int var1, int var2, ItemStack var3, ItemStack var4) {
         this.f_5324 = var1;
         this.f_5325 = var2;
         this.f_5326 = var3;
         this.f_5327 = var4;
      }

      @Generated
      public ItemStack m_2118() {
         return this.f_5327;
      }

      @Generated
      public Class_kPXtxQj0j9mBpxqt m_2119() {
         return this.f_5328;
      }

      @Generated
      public int m_2120() {
         return this.f_5325;
      }

      @Generated
      public int m_2121() {
         return this.f_5324;
      }

      @Generated
      public ItemStack m_2122() {
         return this.f_5326;
      }
   }
}
