package dev.dimasik.client.system;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.phys.AABB;

public final class Class_6Ip9yVjlyDc0jiat {
   private static final double f_2785 = 0.03;
   private static final Direction[] f_2786 = new Direction[]{Direction.DOWN, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST, Direction.UP};
   private static final double f_2787 = 1.0E-7;
   private static final double f_2788 = 0.03;
   private static final double f_2789 = 0.03;
   private static final double f_2790 = 1.0E-9;
   private static final double f_2791 = 1.0E-7;
   private static final double f_2792 = 0.2;
   private static final double f_2793 = 0.2;
   private static final double f_2794 = 0.8;
   private static final double f_2795 = 1.0E-5;
   private static final double f_2796 = 1.0E-5;
   private static final double f_2797 = 1.0E-5;
   private static final double f_2798 = 1.0E-5;
   private static final double f_2799 = 1.0E-5;
   private static final double f_2800 = 1.0E-5;
   private static final double f_2801 = 1.0E-5;
   private static final double f_2802 = 1.0E-5;
   private static final double f_2803 = 1.0E-5;
   private static final double f_2804 = 1.0E-5;

   public static boolean m_1534(AABB var0, Predicate<BlockPos> var1) {
      double var2 = var0.minY + Math.min(f_2792, var0.getYsize() * f_2793);
      double var4 = var0.minY + var0.getYsize() * f_2794;
      return m_1538(var0, var2, var1) && m_1538(var0, var4, var1);
   }

   public static Class_6Ip9yVjlyDc0jiat.Hrog8pZIHRFGqVca m_1535(List<AABB> var0, BlockPos var1, double var2, double var4) {
      double var6 = Math.max(0.0, var2);
      double var8 = Math.min(var4, var0.size() - 1);
      Class_6Ip9yVjlyDc0jiat.Hrog8pZIHRFGqVca var10 = null;

      for (int var11 = (int)Math.floor(var6); var11 < var8; var11++) {
         Class_6Ip9yVjlyDc0jiat.Hrog8pZIHRFGqVca var12 = m_1536(
            (AABB)var0.get(var11), (AABB)var0.get(var11 + 1), var1, Math.max(0.0, var6 - var11), Math.min(1.0, var8 - var11)
         );
         if (var12 == null) {
            if (var10 != null) {
               break;
            }
         } else {
            double var13 = var11 + var12.enter();
            double var15 = var11 + var12.exit();
            if (var10 != null && var13 > var10.exit() + f_2787) {
               break;
            }

            var10 = new Class_6Ip9yVjlyDc0jiat.Hrog8pZIHRFGqVca(var10 == null ? var13 : var10.enter(), var15);
         }
      }

      return var10;
   }

   private static Class_6Ip9yVjlyDc0jiat.Hrog8pZIHRFGqVca m_1536(AABB var0, AABB var1, BlockPos var2, double var3, double var5) {
      double[] var7 = new double[]{var0.minX, var0.minY, var0.minZ};
      double[] var8 = new double[]{var0.maxX, var0.maxY, var0.maxZ};
      double[] var9 = new double[]{var1.minX - var0.minX, var1.minY - var0.minY, var1.minZ - var0.minZ};
      double[] var10 = new double[]{var2.getX(), var2.getY(), var2.getZ()};

      for (int var11 = 0; var11 < 3; var11++) {
         double var12 = var10[var11] + f_2788 - var8[var11];
         double var14 = var10[var11] + 1.0 - f_2789 - var7[var11];
         if (Math.abs(var9[var11]) < f_2790) {
            if (var12 >= 0.0 || var14 <= 0.0) {
               return null;
            }
         } else {
            double var16 = var12 / var9[var11];
            double var18 = var14 / var9[var11];
            var3 = Math.max(var3, Math.min(var16, var18));
            var5 = Math.min(var5, Math.max(var16, var18));
         }

         if (var5 <= var3 + f_2791) {
            return null;
         }
      }

      return new Class_6Ip9yVjlyDc0jiat.Hrog8pZIHRFGqVca(var3, var5);
   }

   private Class_6Ip9yVjlyDc0jiat() {
   }

   public static List<BlockPos> m_1537(List<AABB> var0, double var1, double var3) {
      LinkedHashSet var5 = new LinkedHashSet();
      double var6 = Math.max(0.0, var1);
      double var8 = Math.min(var3, var0.size() - 1);

      for (int var10 = (int)Math.floor(var6); var10 < var8; var10++) {
         AABB var11 = (AABB)var0.get(var10);
         AABB var12 = (AABB)var0.get(var10 + 1);
         BlockPos var13 = BlockPos.containing(Math.min(var11.minX, var12.minX), Math.min(var11.minY, var12.minY), Math.min(var11.minZ, var12.minZ));
         BlockPos var14 = BlockPos.containing(Math.max(var11.maxX, var12.maxX), Math.max(var11.maxY, var12.maxY), Math.max(var11.maxZ, var12.maxZ));

         for (BlockPos var16 : BlockPos.betweenClosed(var13, var14)) {
            if (!var5.contains(var16) && m_1536(var11, var12, var16, Math.max(0.0, var6 - var10), Math.min(1.0, var8 - var10)) != null) {
               var5.add(var16.immutable());
            }
         }
      }

      return new ArrayList<>(var5);
   }

   private static boolean m_1538(AABB var0, double var1, Predicate<BlockPos> var3) {
      for (BlockPos var5 : BlockPos.betweenClosed(
         BlockPos.containing(var0.minX + f_2801, var1, var0.minZ + f_2802), BlockPos.containing(var0.maxX - f_2803, var1, var0.maxZ - f_2804)
      )) {
         if (var3.test(var5)) {
            return true;
         }
      }

      return false;
   }

   public static List<BlockPos> m_1539(BlockPos var0, int var1, Predicate<BlockPos> var2, Predicate<BlockPos> var3) {
      if (!var2.test(var0)) {
         return List.of();
      }

      ArrayDeque var4 = new ArrayDeque();
      HashSet var5 = new HashSet();
      var4.add(List.of(var0.immutable()));
      var5.add(var0);
      int var6 = 0;

      while (!var4.isEmpty() && var6++ < 64) {
         List var7 = (List)var4.removeFirst();
         BlockPos var8 = (BlockPos)var7.getLast();
         if (var3.test(var8)) {
            return new ArrayList<>(var7.reversed());
         }

         if (var7.size() < var1) {
            for (Direction var12 : f_2786) {
               BlockPos var13 = var8.relative(var12);
               if (var5.add(var13) && var2.test(var13)) {
                  ArrayList var14 = new ArrayList(var7);
                  var14.add(var13);
                  var4.addLast(var14);
               }
            }
         }
      }

      return List.of();
   }

   public static boolean m_1540(AABB var0, Predicate<BlockPos> var1) {
      for (BlockPos var3 : BlockPos.betweenClosed(
         BlockPos.containing(var0.minX + f_2795, var0.minY + f_2796, var0.minZ + f_2797),
         BlockPos.containing(var0.maxX - f_2798, var0.maxY - f_2799, var0.maxZ - f_2800)
      )) {
         if (var1.test(var3)) {
            return true;
         }
      }

      return false;
   }

   public record Hrog8pZIHRFGqVca(double enter, double exit) {
   }
}
