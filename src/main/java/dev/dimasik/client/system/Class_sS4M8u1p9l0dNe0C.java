package dev.dimasik.client.system;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public final class Class_sS4M8u1p9l0dNe0C implements Class_NzJrN63M7QBpmAbi {
   private static final Map<UUID, Class_sS4M8u1p9l0dNe0C.Class_819uSMBcxgN8MeQK> f_31093 = new HashMap<>();
   private static ClientLevel f_31094;
   private static final double f_31095 = 1.0E-5;
   private static final double f_31096 = 1.0E-6;
   private static final double f_31097 = 16.0;
   private static final double f_31098 = 0.75;
   private static final double f_31099 = 0.25;
   private static final double f_31100 = 0.75;
   private static final double f_31101 = 0.25;
   private static final double f_31102 = 16.0;
   private static final double f_31103 = 1.0E-5;
   private static final double f_31104 = 1.0E-5;
   private static final double f_31105 = 1.0E-5;
   private static final double f_31106 = 1.0E-5;
   private static final double f_31107 = 1.0E-5;
   private static final double f_31108 = 1.0E-5;

   public static boolean m_8701(Player var0) {
      return var0 != null && m_8705(var0.getBoundingBox());
   }

   public static List<Class_Z0izWwXu9a1Si1AJ.EvMJrFDTQ1wRtmlQ> m_8702(Player var0, int var1) {
      return f_11537.level == null
         ? List.of(new Class_Z0izWwXu9a1Si1AJ.EvMJrFDTQ1wRtmlQ(0, var0.getBoundingBox(), var0.onGround()))
         : Class_Z0izWwXu9a1Si1AJ.m_5763(
            var0.getBoundingBox(),
            m_8704(var0),
            var0.onGround(),
            var0.isNoGravity() ? 0.0 : var0.getGravity(),
            var1,
            (var1x, var2) -> Entity.collideBoundingBox(var0, var2, var1x, f_11537.level, List.of()),
            Class_sS4M8u1p9l0dNe0C::m_8705
         );
   }

   private Class_sS4M8u1p9l0dNe0C() {
   }

   private static Vec3 m_8704(Player var0) {
      if (f_31094 != f_11537.level) {
         f_31093.clear();
         f_31094 = f_11537.level;
      }

      if (f_31093.size() > 128) {
         f_31093.clear();
      }

      int var1 = f_11537.player == null ? var0.tickCount : f_11537.player.tickCount;
      Vec3 var2 = var0.getPositionCodec().getBase();
      Class_sS4M8u1p9l0dNe0C.Class_819uSMBcxgN8MeQK var3 = f_31093.get(var0.getUUID());
      if (var3 != null && var3.tick == var1) {
         return var3.velocity;
      }

      Vec3 var4 = new Vec3(var0.getX() - var0.xo, var0.getY() - var0.yo, var0.getZ() - var0.zo);
      Vec3 var5 = var0.getDeltaMovement();
      Vec3 var6 = var5.lengthSqr() > f_31095 ? var5 : var4;
      int var7 = var1;
      if (var3 != null && var1 > var3.tick && var1 - var3.tick <= 5) {
         if (var2.distanceToSqr(var3.server) > f_31096) {
            int var8 = Math.max(1, var1 - var3.serverTick);
            Vec3 var9 = var2.subtract(var3.server).scale(1.0 / var8);
            if (var9.lengthSqr() <= f_31097) {
               var6 = new Vec3(var9.x * f_31098 + var3.velocity.x * f_31099, var9.y, var9.z * f_31100 + var3.velocity.z * f_31101);
            }
         } else {
            var7 = var3.serverTick;
            if (var1 - var7 <= 2) {
               var6 = var3.velocity;
            }
         }
      }

      if (!Double.isFinite(var6.lengthSqr()) || var6.lengthSqr() > f_31102) {
         var6 = Vec3.ZERO;
      }

      f_31093.put(var0.getUUID(), new Class_sS4M8u1p9l0dNe0C.Class_819uSMBcxgN8MeQK(var1, var7, var2, var6));
      return var6;
   }

   public static boolean m_8705(AABB var0) {
      if (f_11537.level == null) {
         return false;
      }

      for (BlockPos var2 : BlockPos.betweenClosed(
         Mth.floor(var0.minX + f_31103),
         Mth.floor(var0.minY + f_31104),
         Mth.floor(var0.minZ + f_31105),
         Mth.floor(var0.maxX - f_31106),
         Mth.floor(var0.maxY - f_31107),
         Mth.floor(var0.maxZ - f_31108)
      )) {
         if (f_11537.level.getBlockState(var2).is(Blocks.COBWEB)) {
            return true;
         }
      }

      return false;
   }

   public static AABB m_8706(Player var0, int var1) {
      return var0 == null ? null : m_8702(var0, var1).getLast().box();
   }

   private record Class_819uSMBcxgN8MeQK(int tick, int serverTick, Vec3 server, Vec3 velocity) {
   }
}
