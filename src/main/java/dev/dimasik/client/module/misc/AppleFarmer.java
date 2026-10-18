package dev.dimasik.client.module.misc;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.system.Class_I4ZLf1tdGfKiuaY4;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_h78PE30BIJJYoUEk;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import net.minecraft.client.gui.screens.inventory.ContainerScreen;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.inventory.InventoryMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;

public final class AppleFarmer extends Module {
   private final Class_I4ZLf1tdGfKiuaY4 f_17660 = new Class_I4ZLf1tdGfKiuaY4();
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_17661 = this::m_6048;
   private static final String f_17662 = "Apple Farmer";
   private static final String f_17663 = "Автоматически фармит яблоки";
   private static final double f_17664 = 5.0;
   private static final double f_17665 = 5.0;
   private static final double f_17666 = 16.0;
   private static final float f_17667 = 0.15F;
   private static final double f_17668 = 0.5;
   private static final double f_17669 = 0.5;
   private static final double f_17670 = 5.0;
   private static final String f_17671 = "chest";
   private static final float f_17672 = 10.0F;
   private static final float f_17673 = 4.0F;
   private static final float f_17674 = -30.0F;
   private static final float f_17675 = 30.0F;
   private static final double f_17676 = -1.0;
   private static final float f_17677 = 4.0F;
   private static final float f_17678 = -90.0F;
   private static final float f_17679 = 90.0F;
   private static final double f_17680 = 20.0;
   private static final float f_17681 = 0.31F;
   private static final double f_17682 = 0.5;
   private static final float f_17683 = 0.73F;
   private static final float f_17684 = 1.1F;
   private static final double f_17685 = 0.3;
   private static final float f_17686 = 1.7F;
   private static final float f_17687 = 2.6F;
   private static final double f_17688 = 0.2;
   private static final double f_17689 = 8.0;
   private static final double f_17690 = Double.MAX_VALUE;
   private static final double f_17691 = Double.MAX_VALUE;

   private void m_6035(BlockPos var1) {
      if (var1 != null && this.m_6046(Vec3.atCenterOf(var1)) && f_11537.player.tickCount % 4 == 0) {
         Vec3 var2 = Vec3.atCenterOf(var1);
         Vec3 var3 = new AABB(var1).clip(f_11537.player.getEyePosition(), var2).orElse(var2);
         f_11537.gameMode
            .useItemOn(f_11537.player, InteractionHand.MAIN_HAND, new BlockHitResult(var3, Direction.getApproximateNearest(var3.subtract(var2)), var1, false));
      }
   }

   private void m_6036(AbstractContainerMenu var1, int var2, int var3, ContainerInput var4) {
      f_11537.gameMode.handleContainerInput(var1.containerId, var2, var3, var4, f_11537.player);
   }

   private boolean m_6037() {
      return Class_h78PE30BIJJYoUEk.m_7078(Items.OAK_SAPLING) == 0 || Class_h78PE30BIJJYoUEk.m_7078(Items.BONE_MEAL) == 0;
   }

   private void m_6038() {
      float var1 = this.m_6063();
      this.m_6059(var1 * f_17672, Mth.clamp(var1 / f_17673, f_17674, f_17675));
      if (f_11537.player.tickCount % 5 == 0) {
         InventoryMenu var2 = f_11537.player.inventoryMenu;
         int var3 = -1;
         int var4 = -1;

         for (Slot var6 : var2.slots) {
            if (this.m_6041(var6) && var6.getItem().is(Items.OAK_SAPLING) && var6.getItem().getCount() > var4) {
               var4 = var6.getItem().getCount();
               var3 = var6.index;
            }
         }

         for (Slot var9 : var2.slots) {
            if (this.m_6041(var9)) {
               ItemStack var7 = var9.getItem();
               if (var7.is(Items.STICK) || var7.is(Items.OAK_SAPLING) && var9.index != var3) {
                  this.m_6036(var2, var9.index, 1, ContainerInput.THROW);
               }
            }
         }
      }
   }

   private boolean m_6039(Predicate<ItemStack> var1) {
      int var2 = -1;

      for (int var3 = 0; var3 < 36; var3++) {
         if (var1.test(f_11537.player.getInventory().getItem(var3))) {
            var2 = var3;
            break;
         }
      }

      if (var2 < 0) {
         return false;
      }

      if (var2 < 9) {
         f_11537.player.getInventory().selected = var2;
         return true;
      }

      if (f_11537.player.tickCount % 4 != 0) {
         return true;
      }

      int var5 = f_11537.player.getInventory().selected;

      for (int var4 = 0; var4 < 9; var4++) {
         if (f_11537.player.getInventory().getItem(var4).isEmpty()) {
            var5 = var4;
            break;
         }
      }

      int var6 = var2 < 9 ? var2 + 36 : var2;
      f_11537.gameMode.handleContainerInput(f_11537.player.inventoryMenu.containerId, var6, var5, ContainerInput.SWAP, f_11537.player);
      f_11537.player.getInventory().selected = var5;
      return true;
   }

   private int m_6040(AbstractContainerMenu var1, boolean var2, int var3, Predicate<ItemStack> var4) {
      int var5 = 0;

      for (Slot var7 : var1.slots) {
         if (var5 >= var3) {
            break;
         }

         if (this.m_6041(var7) != var2 && var4.test(var7.getItem())) {
            this.m_6036(var1, var7.index, 0, ContainerInput.QUICK_MOVE);
            var5++;
         }
      }

      return var5;
   }

   private boolean m_6041(Slot var1) {
      return var1.container == f_11537.player.getInventory();
   }

   private double m_6042(BlockPos var1) {
      Vec3 var2 = f_11537.player.getEyePosition();
      Vec3 var3 = f_11537.player.getViewVector(1.0F);
      Vec3 var4 = Vec3.atCenterOf(var1).subtract(var2);
      double var5 = var4.dot(var3);
      return var5 <= 0.0 ? f_17690 : var4.subtract(var3.scale(var5)).lengthSqr();
   }

   private int m_6043(Item var1) {
      for (Slot var3 : f_11537.player.inventoryMenu.slots) {
         if (this.m_6041(var3) && var3.getItem().is(var1)) {
            return var3.index;
         }
      }

      return -1;
   }

   private void m_6044(BlockPos var1) {
      boolean var2 = f_11537.level.getBlockState(var1.above()).getBlock() instanceof SaplingBlock;
      Predicate<ItemStack> var3 = var2 ? (ItemStack var0) -> var0.is(Items.BONE_MEAL) : (ItemStack var0) -> var0.getItem() instanceof BlockItem var1x ? var1x.getBlock() instanceof SaplingBlock : false;
      if (!var3.test(f_11537.player.getMainHandItem())) {
         this.m_6039(var3);
      } else {
         Vec3 var4 = new Vec3(var1.getX() + f_17668, var1.getY() + 1, var1.getZ() + f_17669);
         if (this.m_6046(var4) && f_11537.player.tickCount % 4 == 0) {
            BlockPos var5 = var2 ? var1.above() : var1;
            f_11537.gameMode.useItemOn(f_11537.player, InteractionHand.MAIN_HAND, new BlockHitResult(var4, Direction.UP, var5, false));
            f_11537.player.swing(InteractionHand.MAIN_HAND);
         }
      }
   }

   private boolean m_6046(Vec3 var1) {
      Vec3 var2 = f_11537.player.getEyePosition();
      Vec3 var3 = var1.subtract(var2).normalize();
      float var4 = (float)Math.toDegrees(Math.atan2(-var3.x, var3.z));
      float var5 = (float)Math.toDegrees(-Math.asin(Mth.clamp(var3.y, f_17676, 1.0)));
      float var6 = this.m_6063();
      this.m_6059(var4 + var6 / 2.0F, Mth.clamp(var5 + var6 / f_17677, f_17678, f_17679));
      float var7 = Mth.wrapDegrees(var4 - f_11537.player.getYRot());
      float var8 = var5 - f_11537.player.getXRot();
      return Math.hypot(var7, var8) < f_17680;
   }

   private void m_6048(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null && f_11537.gameMode != null) {
         if (f_11537.player.tickCount % 600 < 10) {
            if (f_11537.player.getMainHandItem().getItem() instanceof AxeItem) {
               f_11537.player.getInventory().selected = ThreadLocalRandom.current().nextInt(9);
            }
         } else {
            BlockPos var2 = this.m_6064(f_17664, var0 -> var0.is(BlockTags.LEAVES), this::m_6042);
            if (var2 != null) {
               this.m_6053(var2, var0 -> var0.getItem() instanceof ShearsItem);
            } else {
               BlockPos var3 = this.m_6064(f_17665, var0 -> var0.is(BlockTags.LOGS), var0 -> var0.getY());
               if (var3 != null) {
                  this.m_6053(var3, var0 -> var0.getItem() instanceof AxeItem);
               } else if (f_11537.gui.screen() instanceof ContainerScreen) {
                  this.m_6056();
               } else if (Class_h78PE30BIJJYoUEk.m_7078(Items.BONE) > 0 && Class_h78PE30BIJJYoUEk.m_7078(Items.BONE_MEAL) == 0) {
                  this.m_6055();
               } else if (!this.m_6051() && !this.m_6037()) {
                  BlockPos var4 = this.m_6064(f_17666, var0 -> var0.is(BlockTags.DIRT), this::m_6057);
                  if (var4 != null) {
                     if (Class_h78PE30BIJJYoUEk.m_7078(Items.STICK) <= 128 && Class_h78PE30BIJJYoUEk.m_7078(Items.OAK_SAPLING) <= 128) {
                        this.m_6044(var4);
                     } else {
                        this.m_6038();
                     }
                  }
               } else {
                  this.m_6056();
               }
            }
         }
      }
   }

   private boolean m_6051() {
      return Class_h78PE30BIJJYoUEk.m_7078(Items.APPLE) > 128 || Class_h78PE30BIJJYoUEk.m_7078(Items.OAK_LOG) > 192;
   }

   private void m_6053(BlockPos var1, Predicate<ItemStack> var2) {
      if (!var2.test(f_11537.player.getMainHandItem())) {
         this.m_6039(var2);
      } else if (!(f_11537.player.getMainHandItem().getItem() instanceof AxeItem) || !(f_11537.player.getAttackStrengthScale(0.0F) <= f_17667)) {
         Vec3 var3 = Vec3.atCenterOf(var1);
         if (this.m_6046(var3)) {
            Vec3 var4 = new AABB(var1).clip(f_11537.player.getEyePosition(), var3).orElse(var3);
            f_11537.gameMode.continueDestroyBlock(var1, Direction.getApproximateNearest(var4.subtract(var3)));
            f_11537.player.swing(InteractionHand.MAIN_HAND);
         }
      }
   }

   private void m_6055() {
      if (f_11537.player.tickCount % 2 == 0) {
         InventoryMenu var1 = f_11537.player.inventoryMenu;
         if (var1.getSlot(0).getItem().is(Items.BONE_MEAL)) {
            this.m_6036(var1, 0, 0, ContainerInput.QUICK_MOVE);
            f_11537.player.closeContainer();
         } else {
            int var2 = this.m_6043(Items.BONE);
            if (var2 >= 0) {
               this.m_6036(var1, var2, 0, ContainerInput.PICKUP);
               this.m_6036(var1, 1, 0, ContainerInput.PICKUP);
            }
         }
      }
   }

   public AppleFarmer() {
      super(f_17662, f_17663, Category.MISC);
   }

   private void m_6056() {
      if (!(f_11537.gui.screen() instanceof ContainerScreen var1)) {
         this.m_6035(this.m_6064(f_17670, var1x -> var1x.is(this.m_6051() ? Blocks.CHEST : Blocks.BARREL), this::m_6057));
      } else if (f_11537.player.tickCount % 50 == 0) {
         f_11537.player.closeContainer();
      } else if (f_11537.player.tickCount % 2 == 0) {
         AbstractContainerMenu var6 = var1.getMenu();
         boolean var3 = var1.getTitle().getContents() instanceof TranslatableContents var4 && var4.getKey().contains(f_17671);
         int var7 = var3
            ? this.m_6040(var6, false, 5, var0 -> var0.is(Items.APPLE) || var0.is(Items.OAK_LOG))
            : (this.m_6037() ? this.m_6040(var6, true, 3, this::m_6058) : 0);
         if (var7 == 0) {
            f_11537.player.closeContainer();
         }
      }
   }

   private double m_6057(BlockPos var1) {
      return f_11537.player.getEyePosition().distanceToSqr(Vec3.atCenterOf(var1));
   }

   private boolean m_6058(ItemStack var1) {
      return var1.getItem() instanceof BlockItem var2 && var2.getBlock() instanceof SaplingBlock ? true : var1.is(Items.BONE_MEAL);
   }

   private void m_6059(float var1, float var2) {
      this.f_17660.m_2950(var1, var2);
      DimasikClient.m_9057().m_9049().m_2813().m_5177(this.f_17660, 3, 1);
   }

   private float m_6063() {
      float var1 = f_11537.player.tickCount + f_11537.getDeltaTracker().getGameTimeDeltaPartialTick(false);
      return (float)(
         (Math.sin(var1 * f_17681) * f_17682 + Math.sin(var1 * f_17683 + f_17684) * f_17685 + Math.sin(var1 * f_17686 + f_17687) * f_17688) * f_17689
      );
   }

   private BlockPos m_6064(double var1, Predicate<BlockState> var3, ToDoubleFunction<BlockPos> var4) {
      BlockPos var5 = f_11537.player.blockPosition();
      BlockPos var6 = null;
      double var7 = f_17691;
      double var9 = var1 * var1;
      int var11 = (int)Math.ceil(var1);
      MutableBlockPos var12 = new MutableBlockPos();

      for (int var13 = -var11; var13 <= var11; var13++) {
         for (int var14 = -var11; var14 <= var11; var14++) {
            for (int var15 = -var11; var15 <= var11; var15++) {
               var12.set(var5.getX() + var13, var5.getY() + var14, var5.getZ() + var15);
               if (var3.test(f_11537.level.getBlockState(var12)) && !(this.m_6057(var12) > var9)) {
                  double var16 = var4.applyAsDouble(var12);
                  if (var16 < var7) {
                     var7 = var16;
                     var6 = var12.immutable();
                  }
               }
            }
         }
      }

      return var6;
   }

   @Override
   public void m_732() {
      DimasikClient.m_9057().m_9049().m_2813().m_5164(this.f_17660);
      super.m_732();
   }
}
