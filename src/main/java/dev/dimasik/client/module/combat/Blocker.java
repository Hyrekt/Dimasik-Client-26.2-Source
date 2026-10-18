package dev.dimasik.client.module.combat;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.Category;
import dev.dimasik.client.module.Module;
import dev.dimasik.client.system.Class_B6vpBUNmRtH3JzmV;
import dev.dimasik.client.system.Class_Xu9btcIeUN33XnMK;
import dev.dimasik.client.system.Class_criCmrqhnv0ahHh4;
import dev.dimasik.client.system.Class_gEPk7yDw6CwIte87;
import dev.dimasik.client.system.Class_kkp256olqZ4F1qt3;
import dev.dimasik.client.system.Class_uHPXr81r5AZlFeJr;
import dev.dimasik.mixin.MultiPlayerGameModeMixin;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector2f;

public class Blocker extends Module {
   private static final int f_2255 = 3;
   private static final int f_2256 = 40;
   private static final float f_2257 = 180.0F;
   private static final double f_2258 = 6.0;
   private final Class_gEPk7yDw6CwIte87<Class_Xu9btcIeUN33XnMK> f_2259 = this::m_1423;
   private final Blocker.HjnK2XgzwqZ9iCu8 f_2260 = new Blocker.HjnK2XgzwqZ9iCu8();
   private final Class_criCmrqhnv0ahHh4 f_2261 = new Class_criCmrqhnv0ahHh4();
   private BlockPos f_2262;
   private BlockPos f_2263;
   private int f_2264 = -1;
   private static final String f_2265 = "Blocker";
   private static final String f_2266 = "Застраивает ноги обсидианом со всех сторон чтоб не бахали ";
   private static final double f_2267 = 36.0;
   private static final double f_2268 = 6.0;
   private static final double f_2269 = 0.5;
   private static final double f_2270 = 0.5;
   private static final double f_2271 = 0.5;
   private static final double f_2272 = 0.5;
   private static final double f_2273 = 0.5;
   private static final double f_2274 = 0.5;
   private static final double f_2275 = 36.0;
   private static final float f_2276 = 90.0F;
   private static final float f_2277 = -90.0F;
   private static final float f_2278 = 90.0F;

   private boolean m_1418(BlockPos var1, int var2) {
      BlockPos var3 = this.m_1425(var1);
      if (var3 == null) {
         return false;
      }

      Direction var4 = this.m_1419(var1, var3);
      Vec3 var5 = new Vec3(
         var3.getX() + f_2269 + var4.getStepX() * f_2270, var3.getY() + f_2271 + var4.getStepY() * f_2272, var3.getZ() + f_2273 + var4.getStepZ() * f_2274
      );
      if (f_11537.player.getEyePosition().distanceToSqr(var5) > f_2275) {
         return false;
      }

      this.m_1424(var5);
      this.m_1427();
      if (f_11537.player.getInventory().selected != var2) {
         f_11537.player.getInventory().selected = var2;
         f_11537.gameMode.ensureHasSentCarriedItem();
      }

      InteractionResult var6 = f_11537.gameMode.useItemOn(f_11537.player, InteractionHand.MAIN_HAND, new BlockHitResult(var5, var4, var3, false));
      if (var6.consumesAction()) {
         f_11537.player.swing(InteractionHand.MAIN_HAND);
      }

      this.m_1420();
      return var6.consumesAction();
   }

   private Direction m_1419(BlockPos var1, BlockPos var2) {
      if (var2.equals(var1.below())) {
         return Direction.UP;
      } else if (var2.equals(var1.above())) {
         return Direction.DOWN;
      } else if (var2.equals(var1.north())) {
         return Direction.SOUTH;
      } else if (var2.equals(var1.south())) {
         return Direction.NORTH;
      } else if (var2.equals(var1.west())) {
         return Direction.EAST;
      } else {
         return var2.equals(var1.east()) ? Direction.WEST : Direction.UP;
      }
   }

   private void m_1420() {
      if (this.f_2264 != -1 && f_11537.player != null && f_11537.gameMode != null) {
         if (f_11537.player.getInventory().selected != this.f_2264) {
            f_11537.player.getInventory().selected = this.f_2264;
            f_11537.gameMode.ensureHasSentCarriedItem();
         }

         this.f_2264 = -1;
      }
   }

   private Vector2f m_1421(Vec3 var1) {
      Vec3 var2 = var1.subtract(f_11537.player.getEyePosition());
      double var3 = Math.hypot(var2.x, var2.z);
      float var5 = (float)Math.toDegrees(Math.atan2(var2.z, var2.x)) - f_2276;
      float var6 = (float)(-Math.toDegrees(Math.atan2(var2.y, var3)));
      return new Vector2f(Mth.wrapDegrees(var5), Mth.clamp(var6, f_2277, f_2278));
   }

   public Blocker() {
      super(f_2265, f_2266, Category.COMBAT);
   }

   public boolean m_1422() {
      return this.f_2263 != null;
   }

   @Override
   public void m_732() {
      if (f_11537.gameMode != null && f_11537.gameMode.isDestroying()) {
         f_11537.gameMode.stopDestroyBlock();
      }

      this.m_1420();
      DimasikClient.m_9057().m_9049().m_2813().m_5164(this.f_2260);
      this.f_2261.m_6252();
      this.f_2262 = null;
      this.f_2263 = null;
      super.m_732();
   }

   private void m_1423(Class_Xu9btcIeUN33XnMK var1) {
      if (f_11537.player != null && f_11537.level != null && f_11537.gameMode != null && this.f_2262 != null) {
         BlockPos[] var2 = this.m_1431();
         if (!this.m_1430(var2)) {
            int var3 = this.m_1429();
            if (var3 != -1) {
               if (this.f_2263 != null) {
                  BlockState var4 = f_11537.level.getBlockState(this.f_2263);
                  if (!var4.is(Blocks.OBSIDIAN) && !var4.canBeReplaced()) {
                     if (this.m_1428(var4, this.f_2263)) {
                        this.m_1426(this.f_2263, var4);
                        return;
                     }

                     this.f_2263 = null;
                  } else {
                     BlockPos var5 = this.f_2263;
                     if (f_11537.gameMode.isDestroying()) {
                        f_11537.gameMode.stopDestroyBlock();
                     }

                     this.f_2263 = null;
                     this.m_1420();
                     if (var4.canBeReplaced() && this.m_1418(var5, var3)) {
                        return;
                     }
                  }
               }

               for (BlockPos var7 : var2) {
                  BlockState var8 = f_11537.level.getBlockState(var7);
                  if (!var8.is(Blocks.OBSIDIAN)) {
                     if (!var8.canBeReplaced()) {
                        if (this.m_1428(var8, var7)) {
                           this.f_2263 = var7.immutable();
                           this.m_1426(this.f_2263, var8);
                           return;
                        }
                     } else if (this.m_1418(var7, var3)) {
                        return;
                     }
                  }
               }

               if (this.m_1430(var2)) {
               }
            }
         }
      }
   }

   private void m_1424(Vec3 var1) {
      this.f_2260.m_7466(var1);
      this.f_2260.m_1416(this.m_1421(var1));
      DimasikClient.m_9057().m_9049().m_2813().m_5177(this.f_2260, 3, 40);
   }

   private BlockPos m_1425(BlockPos var1) {
      BlockPos[] var2 = new BlockPos[]{var1.below(), var1.north(), var1.south(), var1.west(), var1.east(), var1.above()};

      for (BlockPos var6 : var2) {
         BlockState var7 = f_11537.level.getBlockState(var6);
         if (!var7.isAir() && var7.isRedstoneConductor(f_11537.level, var6)) {
            return var6;
         }
      }

      return null;
   }

   private void m_1426(BlockPos var1, BlockState var2) {
      Vec3 var3 = Vec3.atCenterOf(var1);
      if (!(f_11537.player.getEyePosition().distanceToSqr(var3) > f_2267)) {
         this.m_1424(var3);
         int var4 = Class_B6vpBUNmRtH3JzmV.m_2134(var2);
         if (var4 >= 0 && var4 <= 8) {
            this.m_1427();
            if (f_11537.player.getInventory().selected != var4) {
               f_11537.player.getInventory().selected = var4;
               f_11537.gameMode.ensureHasSentCarriedItem();
            }
         }

         this.f_2261.m_6250(var1);

         BlockHitResult var5;
         try {
            var5 = this.f_2261.m_6255(var1, f_2268);
         } finally {
            this.f_2261.m_6252();
         }

         if (var5 != null) {
            ((MultiPlayerGameModeMixin)f_11537.gameMode).setBlockBreakingCooldown(0);
            boolean var6 = f_11537.gameMode.continueDestroyBlock(var1, var5.getDirection());
            if (var6) {
               f_11537.player.swing(InteractionHand.MAIN_HAND);
            }

            if (f_11537.level.getBlockState(var1).canBeReplaced()) {
               this.f_2263 = null;
               this.m_1420();
               int var7 = this.m_1429();
               if (var7 != -1) {
                  this.m_1418(var1, var7);
               }
            }
         }
      }
   }

   @Override
   public void m_778() {
      this.f_2262 = f_11537.player == null ? null : f_11537.player.blockPosition().immutable();
      this.f_2263 = null;
      this.f_2264 = -1;
      super.m_778();
   }

   private void m_1427() {
      if (this.f_2264 == -1 && f_11537.player != null) {
         this.f_2264 = f_11537.player.getInventory().selected;
      }
   }

   private boolean m_1428(BlockState var1, BlockPos var2) {
      return !var1.isAir() && var1.getFluidState().isEmpty() && var1.getDestroySpeed(f_11537.level, var2) >= 0.0F && !var1.is(Blocks.BEDROCK);
   }

   private int m_1429() {
      for (int var1 = 0; var1 < 9; var1++) {
         if (f_11537.player.getInventory().getItem(var1).is(Items.OBSIDIAN)) {
            return var1;
         }
      }

      return -1;
   }

   private boolean m_1430(BlockPos[] var1) {
      for (BlockPos var5 : var1) {
         BlockState var6 = f_11537.level.getBlockState(var5);
         if (!var6.is(Blocks.OBSIDIAN) && !var6.is(Blocks.BEDROCK)) {
            return false;
         }
      }

      return true;
   }

   private BlockPos[] m_1431() {
      return new BlockPos[]{this.f_2262.below(), this.f_2262.north(), this.f_2262.south(), this.f_2262.west(), this.f_2262.east()};
   }

   private static final class HjnK2XgzwqZ9iCu8 extends Class_kkp256olqZ4F1qt3 {
      public final Vector2f f_2250 = new Vector2f();
      public static final float f_2251 = 180.0F;
      public static final float f_2252 = 180.0F;
      public static final float f_2253 = -90.0F;
      public static final float f_2254 = 90.0F;

      @Override
      public Vector2f m_1007() {
         return new Vector2f(this.f_2250);
      }

      public HjnK2XgzwqZ9iCu8() {
         super(null);
         this.m_7471(false);
      }

      @Override
      public Vector2f m_1006(Vector2f var1, Vector2f var2) {
         float var3 = Mth.wrapDegrees(var2.x - var1.x);
         float var4 = var2.y - var1.y;
         float var5 = Math.abs(var3) + Math.abs(var4);
         float var6 = var5 == 0.0F ? 0.0F : Math.abs(var3 / var5) * f_2251;
         float var7 = var5 == 0.0F ? 0.0F : Math.abs(var4 / var5) * f_2252;
         float var8 = var1.x + this.m_1417(Mth.clamp(var3, -var6, var6));
         float var9 = Mth.clamp(var1.y + this.m_1417(Mth.clamp(var4, -var7, var7)), f_2253, f_2254);
         return new Vector2f(var8, var9);
      }

      public void m_1416(Vector2f var1) {
         this.f_2250.set(var1);
      }

      public float m_1417(float var1) {
         float var2 = Class_uHPXr81r5AZlFeJr.m_9139();
         return var2 <= 0.0F ? var1 : Class_uHPXr81r5AZlFeJr.m_9134(var1) * var2;
      }
   }
}
