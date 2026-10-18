package dev.dimasik.client.system;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.boss.enderdragon.EndCrystal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import org.jetbrains.annotations.Nullable;

public final class Class_izMBLqd5r0wrVpYz implements Class_NzJrN63M7QBpmAbi {
   private static final int f_24644 = 150;
   private static final int f_24645 = 3;
   private static final float f_24646 = 240.0F;
   private static final float f_24647 = 480.0F;
   public static boolean f_24648;
   public static String f_24649 = "";
   private static final float f_24650 = 240.0F;
   private static final double f_24651 = 0.02;
   private static final double f_24652 = 0.02;
   private static final double f_24653 = 0.02;
   private static final double f_24654 = 0.02;
   private static final double f_24655 = 0.02;
   private static final double f_24656 = 0.02;
   private static final float f_24657 = -Float.MAX_VALUE;
   private static final double f_24658 = 1.0E-4;
   private static final String f_24659 = "none";
   private static final double f_24660 = 2.0;
   private static final float f_24661 = 480.0F;
   private static final float f_24662 = -1.0F;
   private static final double f_24663 = 0.5;
   private static final double f_24664 = 0.5;

   public static boolean m_7327(BlockPos var0, Vec3 var1, float var2) {
      return f_11537.level != null && f_11537.level.getBlockState(var0).canBeReplaced() && !m_7343(var0) && m_7349(var0, var1, var2) != null;
   }

   @Nullable
   public static Class_Pz8IezfODFKid4ag m_7328(List<Player> var0, Vec3 var1, float var2, float var3, float var4, float var5, List<Player> var6) {
      if (f_11537.level != null && f_11537.player != null && !var0.isEmpty()) {
         Class_Pz8IezfODFKid4ag var7 = null;
         float var8 = f_24657;

         for (Entity var10 : f_11537.level.entitiesForRendering()) {
            if (var10 instanceof EndCrystal var11 && m_7345(var11, var1, var2) != null) {
               float var12 = m_7347(var11.position(), var0);
               if (!(var12 < var4)) {
                  float var13 = Class_54SEkpqYjEsUMrjI.m_1398(var11.position(), f_11537.player);
                  if (!(var13 >= var5) && !(var13 > var3)) {
                     float var14 = m_7330(var11.position(), var6, null, List.of(), var3);
                     if (!(var14 < 0.0F)) {
                        float var15 = var12 - var13 * 2.0F - var14 * 2.0F;
                        if (var15 > var8) {
                           var8 = var15;
                           var7 = new Class_Pz8IezfODFKid4ag(var11, var12, var13);
                        }
                     }
                  }
               }
            }
         }

         return var7;
      } else {
         return null;
      }
   }

   @Nullable
   public static Class_r4AHZOK7QWNZveVe m_7329(
      List<Class_KnZ6JjkNfseuDLb0> var0,
      Vec3 var1,
      float var2,
      float var3,
      float var4,
      float var5,
      boolean var6,
      boolean var7,
      float var8,
      List<Player> var9,
      @Nullable BlockPos var10,
      float var11,
      @Nullable BlockPos var12,
      Collection<BlockPos> var13
   ) {
      if (f_11537.level != null && f_11537.player != null && !var0.isEmpty()) {
         Collection var14 = var13 == null ? List.of() : var13;
         HashMap var15 = new HashMap();
         Class_54SEkpqYjEsUMrjI.m_1405();

         try {
            for (Class_KnZ6JjkNfseuDLb0 var17 : var0) {
               BlockPos var18 = BlockPos.containing(var17.center());

               for (int var19 = -3; var19 <= 3; var19++) {
                  for (int var20 = -3; var20 <= 3; var20++) {
                     for (int var21 = -4; var21 <= 1; var21++) {
                        BlockPos var22 = var18.offset(var19, var21, var20);
                        if (!var15.containsKey(var22) && !var14.contains(var22)) {
                           Class_izMBLqd5r0wrVpYz.DdiZhWPYPCZmduSK var23 = m_7333(var22, var18, var1, var2, var3, var6, var7, var10, var11, var12, var14);
                           if (var23 != null) {
                              var15.put(var22, var23);
                           }
                        }
                     }
                  }
               }
            }

            ArrayList var32 = new ArrayList(var15.values());
            var32.sort(
               Comparator.<Class_izMBLqd5r0wrVpYz.DdiZhWPYPCZmduSK, Class_xK0yIGGofTTVYU7O.Class_4Epr1VJXiN2Tcg12>comparing(var0x -> var0x.cost())
                  .thenComparingLong(var0x -> var0x.base().asLong())
            );
            Class_r4AHZOK7QWNZveVe var33 = null;
            Class_xK0yIGGofTTVYU7O.Class_4Epr1VJXiN2Tcg12 var34 = null;
            int var35 = 0;

            for (Object var37_obj : var32) {
            Class_izMBLqd5r0wrVpYz.DdiZhWPYPCZmduSK var37 = (Class_izMBLqd5r0wrVpYz.DdiZhWPYPCZmduSK)var37_obj;
               if (var35++ >= 150 || var34 != null && var34.blocks() == 0 && !var37.digs().isEmpty()) {
                  break;
               }

               Vec3 var38 = m_7335(var37.base());
               AABB var39 = var37.obsidian() ? new AABB(var37.base()).deflate(f_24658) : null;
               float var24 = 0.0F;

               for (Class_KnZ6JjkNfseuDLb0 var26 : var0) {
                  float var27 = Class_54SEkpqYjEsUMrjI.m_1402(var38, var26.player(), var26.box(), var39, var37.digs());
                  if (var26.box() != var26.player().getBoundingBox()) {
                     var27 = Math.min(var27, Class_54SEkpqYjEsUMrjI.m_1402(var38, var26.player(), var26.player().getBoundingBox(), var39, var37.digs()));
                  }

                  var24 = Math.max(var24, var27);
               }

               if (!(var24 < var5)) {
                  float var40 = Class_54SEkpqYjEsUMrjI.m_1402(var38, f_11537.player, f_11537.player.getBoundingBox(), var39, var37.digs());
                  if (!(var40 >= var8) && !(var40 > var4)) {
                     float var41 = m_7330(var38, var9, var39, var37.digs(), var4);
                     if (!(var41 < 0.0F)) {
                        float var42 = var24 - var40 * 2.0F - var41 * 2.0F - (var37.obsidian() ? 3 : 0);
                        Class_xK0yIGGofTTVYU7O.Class_4Epr1VJXiN2Tcg12 var28 = new Class_xK0yIGGofTTVYU7O.Class_4Epr1VJXiN2Tcg12(
                           var37.digs().size(), var37.cost().ticks(), var37.cost().current(), var37.cost().preferred(), var42
                        );
                        if (var34 == null || var28.compareTo(var34) < 0) {
                           var34 = var28;
                           var33 = new Class_r4AHZOK7QWNZveVe(
                              var37.base(), var38, var37.obsidian(), var37.digs().isEmpty() ? null : var37.digs().getFirst(), var24, var40
                           );
                        }
                     }
                  }
               }
            }

            f_24649 = "" + var32.size() + Math.min(var35, 150) + (var33 == null ? f_24659 : var33.pos().toShortString() + var33.digPos() + var34.ticks());
            return var33;
         } finally {
            Class_54SEkpqYjEsUMrjI.m_1414();
         }
      } else {
         return null;
      }
   }

   private static float m_7330(Vec3 var0, List<Player> var1, AABB var2, List<BlockPos> var3, float var4) {
      float var5 = 0.0F;
      if (var1 == null) {
         return var5;
      }

      for (Player var7 : var1) {
         if (var7 != f_11537.player && var7.isAlive()) {
            float var8 = Class_54SEkpqYjEsUMrjI.m_1402(var0, var7, var7.getBoundingBox(), var2, var3);
            if (var8 > var4 || var8 > 0.0F && var8 >= var7.getHealth() + var7.getAbsorptionAmount() - 1.0F) {
               return f_24662;
            }

            var5 = Math.max(var5, var8);
         }
      }

      return var5;
   }

   private Class_izMBLqd5r0wrVpYz() {
   }

   private static boolean m_7331(BlockPos var0, List<BlockPos> var1) {
      for (Direction var5 : Direction.values()) {
         BlockPos var6 = var0.relative(var5);
         BlockState var7 = f_11537.level.getBlockState(var6);
         if (!var1.contains(var6) && !var7.canBeReplaced() && !var7.is(Blocks.COBWEB) && !var7.getShape(f_11537.level, var6).isEmpty()) {
            return true;
         }
      }

      return false;
   }

   public static boolean m_7332(BlockPos var0) {
      return f_11537.level != null && (f_11537.level.getBlockState(var0).is(Blocks.OBSIDIAN) || f_11537.level.getBlockState(var0).is(Blocks.BEDROCK));
   }

   private static Class_izMBLqd5r0wrVpYz.DdiZhWPYPCZmduSK m_7333(
      BlockPos var0,
      BlockPos var1,
      Vec3 var2,
      float var3,
      float var4,
      boolean var5,
      boolean var6,
      BlockPos var7,
      float var8,
      BlockPos var9,
      Collection<BlockPos> var10
   ) {
      BlockPos var11 = var0.above();
      if (m_7340(var2, var0) > var3 * var3) {
         return null;
      }

      Vec3 var12 = m_7335(var0);
      AABB var13 = new AABB(var12.x - 1.0, var12.y, var12.z - 1.0, var12.x + 1.0, var12.y + f_24660, var12.z + 1.0);
      if (m_7339(var2, var13) > var4 * var4) {
         return null;
      }

      BlockState var14 = f_11537.level.getBlockState(var0);
      BlockState var15 = f_11537.level.getBlockState(var11);
      ArrayList var16 = new ArrayList(2);
      if (!var15.isAir()) {
         if (!var6 || !m_7338(var15, var11)) {
            return null;
         }

         var16.add(var11);
      }

      boolean var17 = !m_7332(var0);
      if (var17) {
         if (!var5) {
            return null;
         }

         if (!var14.canBeReplaced()) {
            if (!var6 || !m_7338(var14, var0)) {
               return null;
            }

            var16.add(var0);
         }
      }

      if (!m_7342(var11) && (!var17 || m_7331(var0, var16))) {
         float var18 = 0.0F;

         for (Object var20_obj : var16) {
            BlockPos var20 = (BlockPos)var20_obj;
            if (var10.contains(var20) || var20.getY() > var1.getY() + 1 || var20.getY() < var1.getY() - 4 || m_7340(var2, var20) > var3 * var3) {
               return null;
            }

            float var21 = Class_54SEkpqYjEsUMrjI.m_1401(f_11537.level.getBlockState(var20), var20);
            if (var20.equals(var7)) {
               var21 *= 1.0F - Mth.clamp(var8, 0.0F, 1.0F);
            }

            var18 += var21;
         }

         if (var18 > f_24661) {
            return null;
         }

         if (var16.isEmpty()) {
            if (var17 ? !m_7327(var0, var2, var3) : Class_TT9n584oSK6xnBdz.m_4985(var0, var2, var3) == null) {
               return null;
            }
         } else if (Class_TT9n584oSK6xnBdz.m_4992((BlockPos)var16.getFirst(), var2, var3) == null) {
            if (var16.size() != 2 || Class_TT9n584oSK6xnBdz.m_4992((BlockPos)var16.getLast(), var2, var3) == null) {
               return null;
            }

            BlockPos var22 = (BlockPos)var16.removeLast();
            var16.addFirst(var22);
         }

         return new Class_izMBLqd5r0wrVpYz.DdiZhWPYPCZmduSK(
            var0.immutable(),
            var17,
            List.copyOf(var16),
            new Class_xK0yIGGofTTVYU7O.Class_4Epr1VJXiN2Tcg12(var16.size(), var18, var16.contains(var7), var0.equals(var9), -((float)var2.distanceToSqr(var12)))
         );
      } else {
         return null;
      }
   }

   public static boolean m_7334(BlockState var0) {
      return var0 != null
         && f_11537.level != null
         && !var0.isAir()
         && !(var0.getBlock() instanceof LiquidBlock)
         && var0.getDestroySpeed(f_11537.level, BlockPos.ZERO) >= 0.0F;
   }

   private static Vec3 m_7335(BlockPos var0) {
      return new Vec3(var0.getX() + f_24663, var0.getY() + 1, var0.getZ() + f_24664);
   }

   public static boolean m_7337(BlockState var0) {
      return m_7338(var0, BlockPos.ZERO);
   }

   private static boolean m_7338(BlockState var0, BlockPos var1) {
      if (m_7334(var0) && f_11537.player != null && !var0.is(Blocks.COBWEB) && !var0.is(Blocks.SWEET_BERRY_BUSH)) {
         float var2 = Class_54SEkpqYjEsUMrjI.m_1401(var0, var1);
         boolean var3 = var0.is(Blocks.OBSIDIAN) || var0.is(Blocks.CRYING_OBSIDIAN);
         boolean var4 = !f_11537.player.onGround();
         return var2 <= f_24650 && Class_xK0yIGGofTTVYU7O.m_9464(var3, var4, var3 && var4 && Class_sS4M8u1p9l0dNe0C.m_8701(f_11537.player), var2);
      } else {
         return false;
      }
   }

   public static double m_7339(Vec3 var0, AABB var1) {
      return var0.distanceToSqr(Mth.clamp(var0.x, var1.minX, var1.maxX), Mth.clamp(var0.y, var1.minY, var1.maxY), Mth.clamp(var0.z, var1.minZ, var1.maxZ));
   }

   public static double m_7340(Vec3 var0, BlockPos var1) {
      return m_7339(var0, new AABB(var1));
   }

   private static boolean m_7342(BlockPos var0) {
      return !f_11537.level
         .getEntities(
            (Entity)null,
            new AABB(var0.getX(), var0.getY(), var0.getZ(), var0.getX() + 1, var0.getY() + 2, var0.getZ() + 1),
            var0x -> var0x.isAlive() && !var0x.isSpectator()
         )
         .isEmpty();
   }

   public static boolean m_7343(BlockPos var0) {
      return f_11537.player == null
         || f_11537.level == null
         || f_11537.player.getBoundingBox().intersects(new AABB(var0))
         || !f_11537.level.isUnobstructed(Blocks.OBSIDIAN.defaultBlockState(), var0, CollisionContext.empty());
   }

   @Nullable
   public static Vec3 m_7345(EndCrystal var0, Vec3 var1, double var2) {
      if (var0 != null && var0.isAlive()) {
         AABB var4 = var0.getBoundingBox();
         Vec3 var5 = new Vec3(
            Mth.clamp(var1.x, var4.minX + f_24651, var4.maxX - f_24652),
            Mth.clamp(var1.y, var4.minY + f_24653, var4.maxY - f_24654),
            Mth.clamp(var1.z, var4.minZ + f_24655, var4.maxZ - f_24656)
         );
         return m_7339(var1, var4) <= var2 * var2 ? var5 : null;
      } else {
         return null;
      }
   }

   public static boolean m_7346(EndCrystal var0, List<Player> var1, float var2, float var3, float var4, List<Player> var5) {
      if (var0 != null && var0.isAlive() && f_11537.player != null && f_11537.level != null) {
         if (m_7347(var0.position(), var1) < var3) {
            return false;
         }

         float var6 = Class_54SEkpqYjEsUMrjI.m_1398(var0.position(), f_11537.player);
         return var6 < var4 && var6 <= var2 && m_7330(var0.position(), var5, null, List.of(), var2) >= 0.0F;
      } else {
         return false;
      }
   }

   private static float m_7347(Vec3 var0, List<Player> var1) {
      float var2 = 0.0F;

      for (Player var4 : var1) {
         if (var4.isAlive()) {
            var2 = Math.max(var2, Class_54SEkpqYjEsUMrjI.m_1398(var0, var4));
         }
      }

      return var2;
   }

   public static boolean m_7348(BlockPos var0) {
      return m_7332(var0) && f_11537.level.getBlockState(var0.above()).isAir() && !m_7342(var0.above());
   }

   @Nullable
   public static Class_BYfjHaSHGXpfcI6Q m_7349(BlockPos var0, Vec3 var1, float var2) {
      return Class_TT9n584oSK6xnBdz.m_4991(var0, var1, var2, false);
   }

   private record DdiZhWPYPCZmduSK(BlockPos base, boolean obsidian, List<BlockPos> digs, Class_xK0yIGGofTTVYU7O.Class_4Epr1VJXiN2Tcg12 cost) {
   }
}
