package dev.dimasik.client.module.misc;

import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_8UIDpbIRPAjhei7m;
import dev.dimasik.client.system.Class_BftdentXEtGbugJw;
import dev.dimasik.client.system.Class_MP0Q3Izlf2HSndyS;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_XzpX8S5F5zd9jbuE;
import dev.dimasik.client.system.Class_ftHu9o3WzCU3Adxm;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Style;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundBundlePacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.phys.Vec3;

public final class UseTracker extends Module {
   private static final String f_36123 = "Пить";
   private static final String f_36124 = "Выкидывать";
   private static final String f_36125 = "Использовать";
   private static final String f_36126 = "Уведомления";
   private static final String f_36127 = "Чат";
   private static final long f_36128 = 2000000000L;
   private final ItemListSetting f_36129;
   private final ItemListSetting f_36130;
   private final IntSet f_36131;
   private final Map<Integer, UseTracker.le6uNcSvDKCy6GPF> f_36132;
   private final Map<Integer, UseTracker.Qt9PUGp18aFuXMgr> f_36133;
   private ClientLevel f_36134;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_36135;
   private final Class_gEPk7yDw6CwIte87<Class_XzpX8S5F5zd9jbuE> f_36136;
   private static final String f_36137 = "UseTracker";
   private static final String f_36138 = "Уведомления об использовании предметов игроками";
   private static final String f_36139 = "Types";
   private static final String f_36140 = "Использовать";
   private static final String f_36141 = "Пить";
   private static final String f_36142 = "Выкидывать";
   private static final String f_36143 = "Вывод";
   private static final String f_36144 = "Уведомления";
   private static final String f_36145 = "Чат";
   private static final String f_36146 = "Выкидывать";
   private static final String f_36147 = "Выкидывать";
   private static final String f_36148 = "Выкидывать";
   private static final double f_36149 = 0.5;
   private static final double f_36150 = 0.5;
   private static final double f_36151 = 0.5;
   private static final String f_36152 = "Вы использовали ";
   private static final String f_36153 = " использовал ";
   private static final double f_36154 = 0.7;
   private static final double f_36155 = 0.3;
   private static final double f_36156 = 0.35;
   private static final double f_36157 = 0.35;
   private static final long f_36158 = 2000000000L;
   private static final String f_36159 = "Пить";
   private static final String f_36160 = "Использовать";
   private static final String f_36161 = "Вы выпили ";
   private static final String f_36162 = "Вы съели ";
   private static final String f_36163 = " выпил ";
   private static final String f_36164 = " съел ";
   private static final String f_36165 = "Уведомления";
   private static final String f_36166 = "Чат";
   private static final int f_36167 = 16777215;
   private static final long f_36168 = 2000000000L;

   private void m_9824(Packet<?> var1) {
      if (this.m_776() && this.f_36129.m_7145(f_36148) && f_11537.level != null) {
         if (var1 instanceof ClientboundBundlePacket var2) {
            for (Packet var5 : var2.subPackets()) {
               this.m_9824(var5);
            }
         } else if (var1 instanceof ClientboundLevelEventPacket var3) {
            this.m_9827(var3);
         }
      }
   }

   @Override
   public void m_732() {
      this.m_9835();
      super.m_732();
   }

   public UseTracker() {
      super(f_36137, f_36138, Category.MISC);
      this.f_36129 = new ItemListSetting(
         f_36139, new Class_2ZaVm8TGDJ68TnJB(f_36140, true), new Class_2ZaVm8TGDJ68TnJB(f_36141, true), new Class_2ZaVm8TGDJ68TnJB(f_36142, true)
      );
      this.f_36130 = new ItemListSetting(f_36143, new Class_2ZaVm8TGDJ68TnJB(f_36144, true), new Class_2ZaVm8TGDJ68TnJB(f_36145, false));
      this.f_36131 = new IntOpenHashSet();
      this.f_36132 = new HashMap<>();
      this.f_36133 = new HashMap<>();
      this.f_36135 = var1 -> this.m_9838();
      this.f_36136 = this::m_9833;
      this.m_795(this.f_36129, this.f_36130);
   }

   private void m_9827(ClientboundLevelEventPacket var1) {
      int var2 = var1.getType();
      if (var2 == 2002 || var2 == 2007) {
         BlockPos var3 = var1.getPos();
         Player var4 = this.m_9834(var3.getX() + f_36149, var3.getY() + f_36150, var3.getZ() + f_36151);
         if (var4 != null) {
            ItemStack var5 = this.m_9828(var4);
            if (!var5.isEmpty()) {
               String var6 = m_9836(var5);
               if (var6 == null) {
                  var6 = var5.getHoverName().getString();
               }

               MutableComponent var7 = Component.empty();
               if (var4 == f_11537.player) {
                  var7.append(Component.literal(f_36152));
               } else {
                  var7.append(m_9832(var4.getName().getString())).append(Component.literal(f_36153));
               }

               var7.append(m_9832(var6));
               this.m_9829(var7, var5, var4 == f_11537.player);
            }
         }
      }
   }

   private ItemStack m_9828(Player var1) {
      ItemStack var2 = var1.getMainHandItem();
      if (m_9837(var2)) {
         return var2;
      }

      UseTracker.le6uNcSvDKCy6GPF var3 = this.f_36132.get(var1.getId());
      return var3 != null && System.nanoTime() - var3.timeNs <= f_36158 ? var3.stack : ItemStack.EMPTY;
   }

   private void m_9829(Component var1, ItemStack var2, boolean var3) {
      if (this.f_36130.m_7145(f_36165)) {
         Class_8UIDpbIRPAjhei7m.m_1791(var1, var2, Class_BftdentXEtGbugJw.m_2304(0), var3 ? Class_MP0Q3Izlf2HSndyS.SELF_USE : Class_MP0Q3Izlf2HSndyS.PLAYER_USE);
      }

      if (this.f_36130.m_7145(f_36166)) {
         Class_ftHu9o3WzCU3Adxm.m_6731(var1);
      }
   }

   private void m_9831(Player var1, boolean var2, ItemStack var3, ItemUseAnimation var4) {
      if (var4 == ItemUseAnimation.EAT || var4 == ItemUseAnimation.DRINK) {
         boolean var5 = var4 == ItemUseAnimation.DRINK;
         if (this.f_36129.m_7145(var5 ? f_36159 : f_36160)) {
            MutableComponent var6 = Component.empty();
            if (var2) {
               var6.append(Component.literal(var5 ? f_36161 : f_36162));
            } else {
               var6.append(m_9832(var1.getName().getString())).append(Component.literal(var5 ? f_36163 : f_36164));
            }

            var6.append(m_9832(var3.getHoverName().getString()));
            this.m_9829(var6, var3, var2);
         }
      }
   }

   private static MutableComponent m_9832(String var0) {
      return Component.literal(var0).setStyle(Style.EMPTY.withColor(Class_BftdentXEtGbugJw.m_2304(0) & f_36167));
   }

   private void m_9833(Class_XzpX8S5F5zd9jbuE var1) {
      if (this.f_36129.m_7145(f_36147)) {
         Packet var2 = var1.m_5619();
         if (!f_11537.isSameThread()) {
            ClientLevel var3 = f_11537.level;
            f_11537.execute(() -> {
               if (f_11537.level == var3) {
                  this.m_9824(var2);
               }
            });
         } else {
            this.m_9824(var2);
         }
      }
   }

   private Player m_9834(double var1, double var3, double var5) {
      AbstractClientPlayer var7 = null;
      double var8 = f_36154;

      for (AbstractClientPlayer var11 : f_11537.level.players()) {
         Vec3 var12 = var11.getViewVector(1.0F);
         Vec3 var13 = var11.getEyePosition().add(var12.scale(f_36155)).add(-var12.x * f_36156, 0.0, var12.z * f_36157);
         double var14 = var13.distanceToSqr(var1, var3, var5);
         if (!(var14 >= var8)) {
            var8 = var14;
            var7 = var11;
         }
      }

      return var7;
   }

   private void m_9835() {
      this.f_36131.clear();
      this.f_36132.clear();
      this.f_36133.clear();
      this.f_36134 = null;
   }

   private static String m_9836(ItemStack var0) {
      PotionContents var1 = (PotionContents)var0.get(DataComponents.POTION_CONTENTS);
      return var1 == null ? null : var0.getHoverName().getString();
   }

   private static boolean m_9837(ItemStack var0) {
      return var0 != null && (var0.is(Items.SPLASH_POTION) || var0.is(Items.LINGERING_POTION));
   }

   private void m_9838() {
      if (f_11537.player != null && f_11537.level != null) {
         if (this.f_36134 != f_11537.level) {
            this.m_9835();
            this.f_36134 = f_11537.level;
         }

         this.m_9842();
         if (this.f_36129.m_7145(f_36146)) {
            this.m_9840();
         } else {
            this.f_36132.clear();
         }
      } else {
         this.m_9835();
      }
   }

   private void m_9840() {
      long var1 = System.nanoTime();
      this.f_36131.clear();

      for (AbstractClientPlayer var4 : f_11537.level.players()) {
         this.f_36131.add(var4.getId());
         ItemStack var5 = var4.getMainHandItem();
         if (m_9837(var5)) {
            this.f_36132.put(var4.getId(), new UseTracker.le6uNcSvDKCy6GPF(var5.copy(), var1));
         }
      }

      this.f_36132.entrySet().removeIf(var3 -> !this.f_36131.contains(var3.getKey()) || var1 - var3.getValue().timeNs > f_36168);
   }

   private void m_9842() {
      this.f_36131.clear();

      for (AbstractClientPlayer var2 : f_11537.level.players()) {
         if (var2.isAlive() && !var2.isRemoved()) {
            this.f_36131.add(var2.getId());
            this.f_36133.computeIfAbsent(var2.getId(), var1 -> new UseTracker.Qt9PUGp18aFuXMgr()).m_9822(var2, var2 == f_11537.player);
         }
      }

      this.f_36133.keySet().removeIf(var1 -> !this.f_36131.contains(var1));
   }

   private final class Qt9PUGp18aFuXMgr {
      public int f_36119;
      public int f_36120;
      public ItemStack f_36121 = ItemStack.EMPTY;

      public void m_9822(Player var1, boolean var2) {
         if (var1.isUsingItem()) {
            ItemStack var3 = var1.getUseItem();
            ItemUseAnimation var4 = var3.getUseAnimation();
            if (var4 != ItemUseAnimation.EAT && var4 != ItemUseAnimation.DRINK) {
               this.m_9823();
            } else {
               int var5 = var1.getTicksUsingItem();
               if (this.f_36121.isEmpty() || var5 < this.f_36119 || !ItemStack.isSameItemSameComponents(this.f_36121, var3)) {
                  this.f_36121 = var3.copyWithCount(1);
               }

               this.f_36119 = var5;
               this.f_36120 = this.f_36121.getUseDuration(var1);
            }
         } else {
            if (this.f_36119 > 0 && this.f_36120 > 0 && this.f_36119 >= this.f_36120 - 1 && !this.f_36121.isEmpty()) {
               UseTracker.this.m_9831(var1, var2, this.f_36121, this.f_36121.getUseAnimation());
            }

            this.m_9823();
         }
      }

      public Qt9PUGp18aFuXMgr() {
      }

      public void m_9823() {
         this.f_36119 = 0;
         this.f_36120 = 0;
         this.f_36121 = ItemStack.EMPTY;
      }
   }

   private record le6uNcSvDKCy6GPF(ItemStack stack, long timeNs) {
   }
}
