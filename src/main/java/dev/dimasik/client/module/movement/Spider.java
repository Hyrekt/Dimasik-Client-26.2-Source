package dev.dimasik.client.module.movement;

import com.mojang.blaze3d.platform.InputConstants;
import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.setting.impl.MultiChoiceSetting;
import dev.dimasik.client.system.Class_2ZaVm8TGDJ68TnJB;
import dev.dimasik.client.system.Class_QmNR03reugBgWiPr;
import dev.dimasik.client.system.Class_ftHu9o3WzCU3Adxm;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_jfpiTZhNIuwDwqKr;
import net.minecraft.client.KeyMapping;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ContainerInput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Spider extends Module {
   private final MultiChoiceSetting f_23512;
   private final Class_QmNR03reugBgWiPr f_23513;
   private final Class_gEPk7yDw6CwIte87<Class_jfpiTZhNIuwDwqKr> f_23514;
   private int f_23515;
   private int f_23516;
   private int f_23517;
   private boolean f_23518;
   private boolean f_23519;
   private int f_23520;
   private static final String f_23521 = "Spider";
   private static final String f_23522 = "Лазит по стенам";
   private static final String f_23523 = "Mode";
   private static final String f_23524 = "FunTimeV4";
   private static final String f_23525 = "WhiteFlags";
   private static final String f_23526 = "FunTime Прыжки";
   private static final String f_23527 = "FunTimeV4";
   private static final String f_23528 = "Нужен сахарный тростник!";
   private static final String f_23529 = "WhiteFlags";
   private static final String f_23530 = "Нужен белый флаг!";
   private static final String f_23531 = "FunTime Прыжки";
   private static final String f_23532 = "FunTimeV4";
   private static final String f_23533 = "WhiteFlags";
   private static final float f_23534 = 130.0F;
   private static final String f_23535 = "Нужен сахарный тростник!";
   private static final float f_23536 = 50.0F;
   private static final String f_23537 = "Нужен белый флаг!";
   private static final float f_23538 = 50.0F;
   private static final float f_23539 = 90.0F;
   private static final float f_23540 = 90.0F;
   private static final double f_23541 = 0.03;
   private static final double f_23542 = 0.01;
   private static final double f_23543 = 0.01;
   private static final double f_23544 = 0.01;
   private static final double f_23545 = 0.01;
   private static final double f_23546 = 0.9;
   private static final double f_23547 = 0.01;
   private static final double f_23548 = 0.5;
   private static final double f_23549 = 0.5;
   private static final float f_23550 = 90.0F;

   private void m_7202() {
      if (f_11537.player != null && f_11537.gameMode != null) {
         Inventory var1 = f_11537.player.getInventory();
         if (this.f_23518 && this.f_23516 != -1 && this.f_23517 != -1) {
            f_11537.gameMode.handleContainerInput(f_11537.player.inventoryMenu.containerId, this.f_23516, this.f_23517, ContainerInput.SWAP, f_11537.player);
         }

         if (this.f_23515 >= 0 && this.f_23515 < 9) {
            var1.setSelectedSlot(this.f_23515);
         }

         this.m_7207();
      } else {
         this.m_7207();
      }
   }

   private KeyMapping[] m_7203() {
      return new KeyMapping[]{
         f_11537.options.keyUp, f_11537.options.keyDown, f_11537.options.keyLeft, f_11537.options.keyRight, f_11537.options.keyJump, f_11537.options.keySprint
      };
   }

   private int m_7204() {
      if (f_11537.player == null) {
         return -1;
      }

      Inventory var1 = f_11537.player.getInventory();

      for (int var2 = 0; var2 < 36; var2++) {
         ItemStack var3 = var1.getItem(var2);
         if (!var3.isEmpty() && var3.is(Items.SUGAR_CANE)) {
            return var2;
         }
      }

      return -1;
   }

   private boolean m_7205() {
      BlockPos var1 = f_11537.player.blockPosition();
      BlockPos var2 = var1.above();
      return this.m_7206(var1) || this.m_7206(var2);
   }

   private boolean m_7206(BlockPos var1) {
      Block var2 = f_11537.level.getBlockState(var1).getBlock();
      return var2 == Blocks.BANNER.white() || var2 == Blocks.WALL_BANNER.white();
   }

   private void m_7207() {
      this.f_23518 = false;
      this.f_23516 = -1;
      this.f_23517 = -1;
   }

   private void m_7208(Class_jfpiTZhNIuwDwqKr var1) {
      int var2 = this.m_7204();
      if (var2 == -1) {
         Class_ftHu9o3WzCU3Adxm.m_6731(f_23535);
         this.m_777();
      } else {
         if (this.f_23513.m_4457(f_23536) && f_11537.player.horizontalCollision) {
            this.m_7219(var1, var2, Spider.If0SBZL4IOm4DaEO.REED);
            this.f_23513.m_4459();
         }
      }
   }

   private boolean m_7209() {
      AABB var1 = f_11537.player.getBoundingBox().inflate(f_23541);
      int var2 = Mth.floor(var1.minX - f_23542);
      int var3 = Mth.floor(var1.maxX + f_23543);
      int var4 = Mth.floor(var1.minY);
      int var5 = Mth.floor(var1.maxY);
      int var6 = Mth.floor(var1.minZ - f_23544);
      int var7 = Mth.floor(var1.maxZ + f_23545);

      for (int var8 = var2; var8 <= var3; var8++) {
         for (int var9 = var4; var9 <= var5; var9++) {
            for (int var10 = var6; var10 <= var7; var10++) {
               BlockPos var11 = new BlockPos(var8, var9, var10);
               BlockState var12 = f_11537.level.getBlockState(var11);
               if (!var12.isAir()) {
                  VoxelShape var13 = var12.getCollisionShape(f_11537.level, var11);
                  if (!var13.isEmpty()) {
                     AABB var14 = var13.bounds().move(var11);
                     double var15 = var14.getXsize();
                     double var17 = var14.getYsize();
                     double var19 = var14.getZsize();
                     boolean var21 = (var15 < 1.0 || var19 < 1.0) && var17 >= f_23546;
                     if (var21) {
                        AABB var22 = new AABB(var11.getX(), var11.getY(), var11.getZ(), var11.getX() + 1.0, var11.getY() + 1.0, var11.getZ() + 1.0);
                        if (var1.intersects(var14) || var1.intersects(var22)) {
                           return true;
                        }
                     }
                  }
               }
            }
         }
      }

      return false;
   }

   private void m_7210(int var1) {
      if (f_11537.player != null && f_11537.gameMode != null) {
         Inventory var2 = f_11537.player.getInventory();
         int var3 = var2.getSelectedSlot();
         if (var1 != var3) {
            if (this.f_23518) {
               this.m_7202();
               var3 = var2.getSelectedSlot();
            }

            this.f_23515 = var3;
            if (var1 < 9) {
               var2.setSelectedSlot(var1);
            } else {
               f_11537.gameMode.handleContainerInput(f_11537.player.inventoryMenu.containerId, var1, var3, ContainerInput.SWAP, f_11537.player);
               this.f_23516 = var1;
               this.f_23517 = var3;
               this.f_23518 = true;
            }
         }
      }
   }

   private void m_7211() {
      BlockPos var1 = BlockPos.containing(f_11537.player.getX(), f_11537.player.getY() - f_23547, f_11537.player.getZ());
      this.m_7220(var1);
   }

   private void m_7212(Class_jfpiTZhNIuwDwqKr var1) {
      if (this.f_23519) {
         this.m_7216(var1);
      } else {
         int var2 = this.m_7215();
         if (var2 == -1) {
            Class_ftHu9o3WzCU3Adxm.m_6731(f_23537);
            this.m_777();
         } else {
            boolean var3 = f_11537.player.horizontalCollision || this.m_7205();
            if (this.f_23513.m_4457(f_23538) && var3) {
               if (var2 >= 9) {
                  var1.m_7400(f_23539);
                  this.m_7217(var2);
               } else {
                  this.m_7219(var1, var2, Spider.If0SBZL4IOm4DaEO.WHITE_FLAG);
               }

               this.f_23513.m_4459();
            }
         }
      }
   }

   @Override
   public void m_778() {
      this.m_7207();
      this.f_23519 = false;
      if (f_11537.player != null) {
         this.f_23515 = f_11537.player.getInventory().getSelectedSlot();
         if (this.f_23512.m_7568(f_23527) && this.m_7204() == -1) {
            Class_ftHu9o3WzCU3Adxm.m_6731(f_23528);
            this.m_789();
            return;
         }

         if (this.f_23512.m_7568(f_23529) && this.m_7215() == -1) {
            Class_ftHu9o3WzCU3Adxm.m_6731(f_23530);
            this.m_789();
            return;
         }
      }

      super.m_778();
   }

   private void m_7213() {
      for (KeyMapping var4 : this.m_7203()) {
         var4.setDown(false);
      }

      DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5158(true);
   }

   public void m_7214(Class_jfpiTZhNIuwDwqKr var1) {
      if (f_11537.player != null && f_11537.level != null && f_11537.gameMode != null) {
         f_11537.options.keyUse.setDown(false);
         if (this.f_23512.m_7568(f_23531)) {
            this.m_7221(var1);
         } else if (this.f_23512.m_7568(f_23532)) {
            this.m_7208(var1);
         } else {
            if (this.f_23512.m_7568(f_23533)) {
               this.m_7212(var1);
            }
         }
      }
   }

   private int m_7215() {
      if (f_11537.player == null) {
         return -1;
      }

      Inventory var1 = f_11537.player.getInventory();

      for (int var2 = 0; var2 < 36; var2++) {
         ItemStack var3 = var1.getItem(var2);
         if (!var3.isEmpty() && var3.is((Item)Items.BANNER.white())) {
            return var2;
         }
      }

      return -1;
   }

   @Override
   public void m_732() {
      this.m_7202();
      this.m_7222();
      if (f_11537.options != null) {
         f_11537.options.keyUse.setDown(false);
      }

      super.m_732();
   }

   private void m_7216(Class_jfpiTZhNIuwDwqKr var1) {
      this.m_7213();
      var1.m_7400(f_23550);
      int var2 = DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5153().m_8768().intValue();
      if (f_11537.player.tickCount - this.f_23520 > var2) {
         int var3 = f_11537.player.getInventory().getSelectedSlot();
         this.m_7219(var1, var3, Spider.If0SBZL4IOm4DaEO.WHITE_FLAG);
         this.m_7222();
         this.f_23513.m_4459();
      }
   }

   public Spider() {
      super(f_23521, f_23522, Category.MOVEMENT);
      this.f_23512 = new MultiChoiceSetting(
         f_23523, new Class_2ZaVm8TGDJ68TnJB(f_23524), new Class_2ZaVm8TGDJ68TnJB(f_23525), new Class_2ZaVm8TGDJ68TnJB(f_23526)
      );
      this.f_23513 = new Class_QmNR03reugBgWiPr();
      this.f_23514 = this::m_7214;
      this.f_23515 = -1;
      this.f_23516 = -1;
      this.f_23517 = -1;
      this.f_23518 = false;
      this.m_795(this.f_23512);
   }

   private void m_7217(int var1) {
      this.m_7213();
      this.m_7210(var1);
      this.f_23520 = f_11537.player.tickCount;
      this.f_23519 = true;
   }

   private void m_7218() {
      BlockPos var1 = f_11537.player.blockPosition().below();

      for (int var2 = 0; var2 < 10; var2++) {
         BlockPos var3 = var1.above(var2);
         Block var4 = f_11537.level.getBlockState(var3).getBlock();
         if (var4 != Blocks.SUGAR_CANE) {
            break;
         }

         var1 = var3;
      }

      BlockPos var5 = var1.above();
      if (f_11537.level.getBlockState(var5).isAir()) {
         this.m_7220(var1);
      }
   }

   private void m_7219(Class_jfpiTZhNIuwDwqKr var1, int var2, Spider.If0SBZL4IOm4DaEO var3) {
      var1.m_7400(f_23540);
      var1.m_7393(true);
      f_11537.player.setOnGround(true);
      f_11537.player.verticalCollision = true;
      f_11537.player.needsSync = true;
      f_11537.player.jumpFromGround();
      this.m_7210(var2);
      switch (var3) {
         case REED:
            this.m_7218();
            break;
         case WHITE_FLAG:
            this.m_7211();
      }
   }

   private void m_7220(BlockPos var1) {
      if (f_11537.player != null && f_11537.gameMode != null) {
         Vec3 var2 = new Vec3(var1.getX() + f_23548, var1.getY() + 1.0, var1.getZ() + f_23549);
         BlockHitResult var3 = new BlockHitResult(var2, Direction.UP, var1, false);
         InteractionResult var4 = f_11537.gameMode.useItemOn(f_11537.player, InteractionHand.MAIN_HAND, var3);
         if (var4.consumesAction()) {
            f_11537.player.swing(InteractionHand.MAIN_HAND);
         }
      }
   }

   private void m_7221(Class_jfpiTZhNIuwDwqKr var1) {
      if (this.f_23513.m_4457(f_23534)) {
         if (this.m_7209()) {
            if (f_11537.options.keyJump.isDown()) {
               var1.m_7393(true);
               f_11537.player.setOnGround(true);
               f_11537.player.jumpFromGround();
            }
         }
      }
   }

   private void m_7222() {
      this.f_23519 = false;
      DimasikClient.m_9057().m_9049().m_2801().m_3455().m_5158(false);
      if (f_11537.gui.screen() == null && f_11537.options != null) {
         for (KeyMapping var4 : this.m_7203()) {
            var4.setDown(InputConstants.isKeyDown(f_11537.getWindow(), var4.key.getValue()));
         }
      }
   }

   private enum If0SBZL4IOm4DaEO {
      REED,
      WHITE_FLAG;
   }
}
