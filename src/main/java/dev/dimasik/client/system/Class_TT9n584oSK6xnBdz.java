package dev.dimasik.client.system;

import dev.dimasik.client.DimasikClient;
import dev.dimasik.client.module.misc.NoInteract;
import dev.dimasik.mixin.BlockStatePredictionHandlerMixin;
import net.minecraft.client.multiplayer.PlayerInfo;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.BedBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.LeverBlock;
import net.minecraft.world.level.block.NoteBlock;
import net.minecraft.world.level.block.RespawnAnchorBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;

public final class Class_TT9n584oSK6xnBdz implements Class_NzJrN63M7QBpmAbi {
   private static final double f_13996 = Double.MAX_VALUE;
   private static final double f_13997 = Double.MAX_VALUE;

   public static Class_BYfjHaSHGXpfcI6Q m_4985(BlockPos var0, Vec3 var1, double var2) {
      if (!Class_izMBLqd5r0wrVpYz.m_7332(var0)) {
         return null;
      }

      Class_BYfjHaSHGXpfcI6Q var4 = m_4993(var0, Direction.UP, var1, m_4989(var2));
      return var4 != null ? var4 : m_4992(var0, var1, var2);
   }

   private static boolean m_4986(Class_BYfjHaSHGXpfcI6Q var0, BlockHitResult var1) {
      return var1 != null && var1.getType() == Type.BLOCK && var1.getBlockPos().equals(var0.neighbor()) && var1.getDirection() == var0.side();
   }

   public static boolean m_4987(BlockPos var0, BlockHitResult var1, ItemStack var2) {
      if (var1 != null && f_11537.player != null && f_11537.level != null && !var2.isEmpty()) {
         BlockPlaceContext var3 = new BlockPlaceContext(f_11537.player, InteractionHand.MAIN_HAND, var2, var1);
         return var3.getClickedPos().equals(var0) && var3.canPlace();
      } else {
         return false;
      }
   }

   public static BlockHitResult m_4988(Class_BYfjHaSHGXpfcI6Q var0, double var1, Class_jfpiTZhNIuwDwqKr.Class_13dQBetjQQOBNsco var3) {
      if (var0 != null && f_11537.player != null && f_11537.level != null && !m_4995(var0.neighbor())) {
         double var4 = m_4989(var1);
         if (!(var4 <= 0.0) && !var3.m_1581()) {
            Vec3 var6 = var3.m_7399().add(0.0, f_11537.player.getEyeHeight(), 0.0);
            Vec3 var7 = Vec3.directionFromRotation(var3.m_7397(), var3.m_7396());
            BlockPos var8 = var0.neighbor();
            BlockHitResult var9 = f_11537.level.getBlockState(var8).getShape(f_11537.level, var8).clip(var6, var6.add(var7.scale(var4)), var8);
            return m_4986(var0, var9) && var6.distanceToSqr(var9.getLocation()) <= var4 * var4 ? var9 : null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public static double m_4989(double var0) {
      return f_11537.player == null ? 0.0 : Math.max(0.0, Math.min(var0, f_11537.player.blockInteractionRange()));
   }

   public static int m_4990() {
      if (f_11537.player != null && f_11537.getConnection() != null) {
         PlayerInfo var0 = f_11537.getConnection().getPlayerInfo(f_11537.player.getUUID());
         int var1 = var0 == null ? 0 : Math.max(0, var0.getLatency());
         return Mth.clamp(12 + (var1 + 49) / 50 * 2, 12, 60);
      } else {
         return 20;
      }
   }

   public static Class_BYfjHaSHGXpfcI6Q m_4991(BlockPos var0, Vec3 var1, double var2, boolean var4) {
      if (f_11537.level != null && f_11537.player != null && f_11537.level.getBlockState(var0).canBeReplaced()) {
         Class_BYfjHaSHGXpfcI6Q var5 = null;
         double var6 = f_13996;
         ItemStack var8 = (var4 ? Items.COBWEB : Items.OBSIDIAN).getDefaultInstance();

         for (Direction var12 : Direction.values()) {
            BlockPos var13 = var0.relative(var12.getOpposite());
            BlockState var14 = f_11537.level.getBlockState(var13);
            if (!var14.canBeReplaced() && !var14.isAir() && (var4 || !var14.is(Blocks.COBWEB)) && !m_4996(var13)) {
               Class_BYfjHaSHGXpfcI6Q var15 = m_4993(var13, var12, var1, m_4989(var2));
               if (var15 != null && m_4994(var0, var15, var8) && var1.distanceToSqr(var15.hitVec()) < var6) {
                  var5 = var15;
                  var6 = var1.distanceToSqr(var15.hitVec());
               }
            }
         }

         return var5;
      } else {
         return null;
      }
   }

   public static Class_BYfjHaSHGXpfcI6Q m_4992(BlockPos var0, Vec3 var1, double var2) {
      if (f_11537.level != null && f_11537.player != null) {
         Class_BYfjHaSHGXpfcI6Q var4 = null;
         double var5 = f_13997;

         for (Direction var10 : Direction.values()) {
            Class_BYfjHaSHGXpfcI6Q var11 = m_4993(var0, var10, var1, m_4989(var2));
            if (var11 != null && var1.distanceToSqr(var11.hitVec()) < var5) {
               var4 = var11;
               var5 = var1.distanceToSqr(var11.hitVec());
            }
         }

         return var4;
      } else {
         return null;
      }
   }

   private static Class_BYfjHaSHGXpfcI6Q m_4993(BlockPos var0, Direction var1, Vec3 var2, double var3) {
      return m_4995(var0) ? null : Class_jK02SoiaOvxc0VOJ.m_7368(f_11537.level.getBlockState(var0).getShape(f_11537.level, var0), var0, var1, var2, var3);
   }

   public static boolean m_4994(BlockPos var0, Class_BYfjHaSHGXpfcI6Q var1, ItemStack var2) {
      return var1 != null && m_4987(var0, new BlockHitResult(var1.hitVec(), var1.side(), var1.neighbor(), var1.inside()), var2);
   }

   public static boolean m_4995(BlockPos var0) {
      return f_11537.level != null
         && ((BlockStatePredictionHandlerMixin)f_11537.level.getBlockStatePredictionHandler()).dimasik$getPendingBlockStates().containsKey(var0.asLong());
   }

   private Class_TT9n584oSK6xnBdz() {
   }

   private static boolean m_4996(BlockPos var0) {
      if (f_11537.player.isSecondaryUseActive()) {
         return false;
      }

      BlockState var1 = f_11537.level.getBlockState(var0);
      Block var2 = var1.getBlock();
      NoInteract var3 = DimasikClient.m_9057().m_9049().m_2801().m_3586();
      return var1.getMenuProvider(f_11537.level, var0) != null
         || var2 instanceof DoorBlock
         || var2 instanceof TrapDoorBlock
         || var2 instanceof FenceGateBlock
         || var2 instanceof ButtonBlock
         || var2 instanceof BedBlock
         || var2 instanceof LeverBlock
         || var2 instanceof CakeBlock
         || var2 instanceof NoteBlock
         || var2 instanceof RespawnAnchorBlock
         || var1.is(Blocks.ENDER_CHEST)
         || var1.is(Blocks.JUKEBOX)
         || var3 != null && var3.m_776() && var2 instanceof FenceBlock;
   }
}
