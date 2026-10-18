package dev.dimasik.client.system;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;

public final class Class_Zqqahn7tp91I2xsr implements Class_NzJrN63M7QBpmAbi {
   public static final int f_17018 = -2070;
   public static final int f_17019 = -1921;
   public static final int f_17020 = -2076;
   public static final int f_17021 = -1929;
   public static final int f_17022 = -60;
   public static final int f_17023 = -35;
   private static final String f_17024 = "minecraft:overworld";
   private static final double f_17025 = -2070.0;
   private static final double f_17026 = -1921.0;
   private static final double f_17027 = -2076.0;
   private static final double f_17028 = -1929.0;
   private static final double f_17029 = -2070.0;
   private static final double f_17030 = -2076.0;
   private static final double f_17031 = -1921.0;
   private static final double f_17032 = -1929.0;
   private static final double f_17033 = 10.0;
   private static final double f_17034 = 10.0;
   private static final double f_17035 = 10.0;
   private static final double f_17036 = 10.0;

   public static boolean m_5858(BlockPos var0) {
      return var0.getY() >= -60 && var0.getY() <= -35 && var0.getX() >= -2070 && var0.getX() <= -1921 && var0.getZ() >= -2076 && var0.getZ() <= -1929;
   }

   public static boolean m_5859() {
      return f_11537.player != null && f_11537.level != null && m_5864(f_11537.level) && m_5860(f_11537.player.getX(), f_11537.player.getZ());
   }

   public static boolean m_5860(double var0, double var2) {
      return var0 >= f_17025 && var0 <= f_17026 && var2 >= f_17027 && var2 <= f_17028;
   }

   public static int m_5861(int var0, AABB var1) {
      return var1 == null ? var0 : (int)Math.max(var1.minX + f_17033, Math.min(var1.maxX - f_17034, var0));
   }

   public static int m_5862(int var0, AABB var1) {
      return var1 == null ? var0 : (int)Math.max(var1.minZ + f_17035, Math.min(var1.maxZ - f_17036, var0));
   }

   private Class_Zqqahn7tp91I2xsr() {
   }

   public static AABB m_5863(int var0) {
      return new AABB(f_17029, var0, f_17030, f_17031, var0, f_17032);
   }

   public static boolean m_5864(Level var0) {
      return var0 != null && var0.dimension().identifier().toString().equals(f_17024);
   }
}
