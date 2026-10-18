package dev.dimasik.client.module.combat;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.CheckboxSetting;
import dev.dimasik.client.setting.impl.ItemListSetting;
import dev.dimasik.client.system.Class_0luV76OwW94UA9ep;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_3VHxwfI2NZKoxzIi;
import dev.dimasik.client.system.Class_GsbUtVYTQREvoZcW;
import dev.dimasik.client.system.Class_U3Ilecg2NrGaJJQx;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_h78PE30BIJJYoUEk;
import dev.dimasik.client.system.Class_jhduRFRSz3NXcVvu;
import dev.dimasik.client.system.Class_kkp256olqZ4F1qt3;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;

public class AutoExplosion extends Module {
   public final CheckboxSetting f_15525;
   public final ItemListSetting f_15526;
   private BlockPos f_15527;
   private int f_15528;
   private boolean f_15529;
   private int f_15530;
   private boolean f_15531;
   private AABB f_15532;
   private final Class_gEPk7yDw6CwIte87<Class_GsbUtVYTQREvoZcW> f_15533;
   private boolean f_15534;
   private boolean f_15535;
   private int f_15536;
   private BlockPos f_15537;
   private BlockHitResult f_15538;
   private Class_kkp256olqZ4F1qt3 f_15539;
   private final Class_gEPk7yDw6CwIte87<Class_jhduRFRSz3NXcVvu> f_15540;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_15541;
   private final Class_gEPk7yDw6CwIte87<Class_0luV76OwW94UA9ep> f_15542;
   private static final String f_15543 = "Auto Explosion";
   private static final String f_15544 = "Автоматически устанавливает и взрывает кристаллы";
   private static final String f_15545 = "Устанавливать по ПКМ";
   private static final String f_15546 = "Настройки";
   private static final String f_15547 = "Не взрывать себя";
   private static final String f_15548 = "Не взрывать друзей";
   private static final String f_15549 = "Не взрывать предметы";
   private static final String f_15550 = "Не взрывать себя";
   private static final String f_15551 = "Не взрывать друзей";
   private static final String f_15552 = "Не взрывать предметы";
   private static final double f_15553 = 3.0;
   private static final String f_15554 = "Не взрывать друзей";
   private static final String f_15555 = "Не взрывать предметы";
   private static final double f_15556 = 0.1;

   private void m_5430(Class_0luV76OwW94UA9ep var1) {
      if (this.f_15525.m_8768()) {
         if (f_11537.player != null && f_11537.level != null && f_11537.gameMode != null) {
            ItemStack var2 = f_11537.player.getMainHandItem();
            ItemStack var3 = f_11537.player.getOffhandItem();
            if (!var2.has(DataComponents.FOOD) && !var3.has(DataComponents.FOOD)) {
               if (f_11537.hitResult instanceof BlockHitResult var4) {
                  BlockPos var9 = var4.getBlockPos();
                  BlockState var6 = f_11537.level.getBlockState(var9);
                  if (!var6.is(Blocks.OBSIDIAN) && !var6.is(Blocks.BEDROCK) && !var6.isAir()) {
                     BlockPos var7 = var9.relative(var4.getDirection());
                     if (f_11537.level.getBlockState(var7).canBeReplaced()) {
                        int var8 = Class_h78PE30BIJJYoUEk.m_7068(Items.OBSIDIAN);
                        if (var8 >= 0 && var8 <= 8) {
                           var1.m_1582(true);
                           this.f_15536 = f_11537.player.getInventory().selected;
                           this.f_15537 = var7;
                           this.f_15538 = new BlockHitResult(var4.getLocation(), var4.getDirection(), var9, false);
                           this.f_15535 = true;
                           this.m_5439(var4.getLocation());
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void m_5431(Class_jhduRFRSz3NXcVvu var1) {
      if (!f_11537.player.getCooldowns().isOnCooldown(Items.END_CRYSTAL.getDefaultInstance())) {
         int var2 = this.m_5437(Items.END_CRYSTAL, true);
         if (var2 != -1) {
            this.f_15527 = var1.m_7402();
            this.f_15528 = var2;
            this.f_15534 = true;
            this.m_5439(this.m_5438(this.f_15527));
         }
      }
   }

   private void m_5432(Class_GsbUtVYTQREvoZcW var1) {
      if (var1.m_2866() == InteractionHand.OFF_HAND && f_11537.player.getOffhandItem().getItem() == Items.PLAYER_HEAD) {
         var1.m_1582(true);
      }

      if (!f_11537.player.getCooldowns().isOnCooldown(Items.END_CRYSTAL.getDefaultInstance())) {
         BlockPos var2 = var1.m_2868().getBlockPos();
         Block var3 = f_11537.level.getBlockState(var2).getBlock();
         if (var3 == Blocks.OBSIDIAN || var3 == Blocks.BEDROCK) {
            this.f_15532 = new AABB(var2.above()).inflate(f_15556);
         }
      }
   }

   private void m_5433() {
      if (this.f_15535 && this.f_15537 != null && this.f_15538 != null) {
         int var1 = Class_h78PE30BIJJYoUEk.m_7068(Items.OBSIDIAN);
         if (var1 >= 0 && var1 <= 8 && f_11537.level.getBlockState(this.f_15537).canBeReplaced()) {
            this.m_5439(this.f_15538.getLocation());
            f_11537.player.getInventory().selected = var1;
            InteractionResult var2 = f_11537.gameMode.useItemOn(f_11537.player, InteractionHand.MAIN_HAND, this.f_15538);
            if (var2.consumesAction()) {
               f_11537.player.swing(InteractionHand.MAIN_HAND);
            }

            this.m_5440();
         } else {
            this.m_5440();
         }
      }
   }

   private void m_5434() {
      if (this.f_15532 != null) {
         for (Entity var2 : f_11537.level.entitiesForRendering()) {
            if (var2 instanceof EndCrystal && this.f_15532.contains(var2.position())) {
               if (this.f_15526.m_7145(f_15550)) {
                  double var3 = f_11537.player.getY();
                  double var5 = var2.getY();
                  if (Math.abs(var3 - var5) < 1.0) {
                     this.f_15532 = null;
                     return;
                  }
               }

               if (this.f_15526.m_7145(f_15551) || this.f_15526.m_7145(f_15552)) {
                  for (Entity var4 : f_11537.level.entitiesForRendering()) {
                     if (!(var2.distanceTo(var4) > f_15553)) {
                        if (this.f_15526.m_7145(f_15554)
                           && var4 instanceof Player var8
                           && var8 != f_11537.player
                           && DimasikClient.m_9057().m_9049().m_2804().m_2877(var8.getName().getString())) {
                           this.f_15532 = null;
                           return;
                        }

                        if (this.f_15526.m_7145(f_15555) && var4 instanceof ItemEntity) {
                           this.f_15532 = null;
                           return;
                        }
                     }
                  }
               }

               this.m_5439(var2.getBoundingBox().getCenter());
               f_11537.gameMode.attack(f_11537.player, var2);
               f_11537.player.swing(InteractionHand.MAIN_HAND);
               this.f_15532 = null;
               this.m_5435();
               return;
            }
         }
      }
   }

   private void m_5435() {
      if (this.f_15539 != null) {
         Class_U3Ilecg2NrGaJJQx var1 = DimasikClient.m_9057().m_9049().m_2813();
         if (var1.m_5180() == this.f_15539) {
            var1.m_5162(null);
         }

         this.f_15539 = null;
      }
   }

   private void m_5436(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null && f_11537.gameMode != null) {
         this.m_5433();
         this.m_5434();
         if (this.f_15531) {
            this.f_15531 = false;
            f_11537.player.getInventory().selected = this.f_15530;
            f_11537.gameMode.ensureHasSentCarriedItem();
            this.m_5435();
         } else if (this.f_15527 != null) {
            if (f_11537.level.getBlockState(this.f_15527).isAir()) {
               this.f_15527 = null;
               this.f_15534 = false;
               this.m_5435();
            } else {
               Vec3 var2 = this.m_5438(this.f_15527);
               this.m_5439(var2);
               if (this.f_15534) {
                  this.f_15534 = false;
               } else {
                  this.f_15530 = f_11537.player.getInventory().selected;
                  f_11537.player.getInventory().selected = this.f_15528;
                  f_11537.gameMode.ensureHasSentCarriedItem();
                  Vec3 var3 = f_11537.player.getEyePosition().subtract(var2);
                  InteractionResult var4 = f_11537.gameMode
                     .useItemOn(
                        f_11537.player,
                        InteractionHand.MAIN_HAND,
                        new BlockHitResult(var2, Direction.getApproximateNearest((float)var3.x, (float)var3.y, (float)var3.z), this.f_15527, false)
                     );
                  if (var4.consumesAction()) {
                     f_11537.player.swing(InteractionHand.MAIN_HAND);
                  }

                  this.f_15531 = true;
                  if (this.f_15529) {
                     this.f_15528 = this.f_15530;
                     this.f_15529 = false;
                  } else {
                     this.f_15527 = null;
                  }
               }
            }
         }
      }
   }

   public AutoExplosion() {
      super(f_15543, f_15544, Category.COMBAT);
      this.f_15525 = new CheckboxSetting(f_15545, true);
      this.f_15526 = new ItemListSetting(
         f_15546, new Class_2ZaVm8TGDJ68TnJB(f_15547, true), new Class_2ZaVm8TGDJ68TnJB(f_15548, true), new Class_2ZaVm8TGDJ68TnJB(f_15549, true)
      );
      this.f_15533 = this::m_5432;
      this.f_15536 = -1;
      this.f_15540 = this::m_5431;
      this.f_15541 = this::m_5436;
      this.f_15542 = this::m_5430;
      this.m_795(this.f_15526, this.f_15525);
   }

   private int m_5437(Item var1, boolean var2) {
      int var3 = var2 ? 9 : 36;

      for (int var4 = 0; var4 < var3; var4++) {
         if (f_11537.player.getInventory().getItem(var4).is(var1)) {
            return var4;
         }
      }

      return -1;
   }

   private Vec3 m_5438(BlockPos var1) {
      return Class_3VHxwfI2NZKoxzIi.m_1307(f_11537.player.getEyePosition(), new AABB(var1));
   }

   private void m_5439(Vec3 var1) {
      this.f_15539 = DimasikClient.m_9057().m_9049().m_2813().m_5178();
      this.f_15539.m_7466(var1);
      DimasikClient.m_9057().m_9049().m_2813().m_5162(this.f_15539);
   }

   private void m_5440() {
      if (this.f_15536 >= 0 && this.f_15536 <= 8) {
         f_11537.player.getInventory().selected = this.f_15536;
      }

      this.f_15536 = -1;
      this.f_15537 = null;
      this.f_15538 = null;
      this.f_15535 = false;
      if (this.f_15527 == null) {
         this.m_5435();
      }
   }

   @Override
   public void m_732() {
      this.m_5435();
      this.f_15527 = null;
      this.f_15528 = -1;
      this.f_15529 = false;
      this.f_15531 = false;
      this.f_15534 = false;
      this.f_15532 = null;
      this.f_15535 = false;
      this.f_15536 = -1;
      this.f_15537 = null;
      this.f_15538 = null;
   }
}
