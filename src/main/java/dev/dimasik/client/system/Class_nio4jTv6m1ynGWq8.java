package dev.dimasik.client.system;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntityTypes;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.chunk.status.ChunkStatus;

public final class Class_nio4jTv6m1ynGWq8 implements Class_NzJrN63M7QBpmAbi {
   private static final Pattern f_25975 = Pattern.compile(Class_nio4jTv6m1ynGWq8.f_25986);
   private final List<BlockPos> f_25976 = new ArrayList<>();
   private final List<Class_nio4jTv6m1ynGWq8.HZs4HwDaM8Wd3CUt> f_25977 = new ArrayList<>();
   private int f_25978;
   private static final int f_25979 = Integer.MIN_VALUE;
   private static final int f_25980 = Integer.MIN_VALUE;
   private static final long f_25981 = -1L;
   private static final long f_25982 = -1L;
   private static final long f_25983 = -1L;
   private static final long f_25984 = 60L;
   private static final long f_25985 = 1000L;
   private static final String f_25986 = "(\\d{2}):(\\d{2})";

   public List<BlockPos> m_7690() {
      return this.f_25976;
   }

   private void m_7691() {
      if (Class_Zqqahn7tp91I2xsr.m_5864(f_11537.level)) {
         for (Entity var2 : f_11537.level.entitiesForRendering()) {
            if (var2 instanceof ArmorStand var3) {
               long var4 = m_7692(var3);
               if (var4 >= 0L) {
                  BlockPos var6 = this.m_7697(var3.blockPosition());
                  if (var6 != null) {
                     Class_nio4jTv6m1ynGWq8.HZs4HwDaM8Wd3CUt var7 = this.m_7696(var6);
                     if (var7 != null) {
                        var7.m_7688(var4);
                     } else {
                        this.f_25977.add(new Class_nio4jTv6m1ynGWq8.HZs4HwDaM8Wd3CUt(var6, var4));
                     }
                  }
               }
            }
         }

         this.f_25977.removeIf(var0 -> var0.m_7689() <= 0L);
      }
   }

   public Class_nio4jTv6m1ynGWq8() {
      this.f_25978 = f_25979;
   }

   private static long m_7692(ArmorStand var0) {
      String var1 = var0.getCustomName() == null ? "" : var0.getCustomName().getString();
      Matcher var2 = f_25975.matcher(var1);
      return !var2.find() ? f_25983 : (Integer.parseInt(var2.group(1)) * f_25984 + Integer.parseInt(var2.group(2))) * f_25985;
   }

   private void m_7694() {
      this.f_25976.clear();
      if (Class_Zqqahn7tp91I2xsr.m_5864(f_11537.level)) {
         short var1 = -130;
         byte var2 = -121;
         short var3 = -130;
         byte var4 = -121;

         for (int var5 = var1; var5 <= var2; var5++) {
            for (int var6 = var3; var6 <= var4; var6++) {
               if (f_11537.level.hasChunk(var5, var6)) {
                  LevelChunk var7 = (LevelChunk)f_11537.level.getChunk(var5, var6, ChunkStatus.FULL, false);
                  if (var7 != null) {
                     for (BlockEntity var9 : var7.getBlockEntities().values()) {
                        BlockPos var10 = var9.getBlockPos();
                        if (Class_Zqqahn7tp91I2xsr.m_5858(var10)) {
                           BlockEntityType var11 = var9.getType();
                           if (var11 == BlockEntityTypes.CHEST || var11 == BlockEntityTypes.TRAPPED_CHEST) {
                              this.f_25976.add(var10.immutable());
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void m_7695() {
      if (f_11537.player == null || f_11537.level == null) {
         this.f_25976.clear();
         this.f_25977.clear();
         this.f_25978 = f_25980;
      } else if (f_11537.player.tickCount != this.f_25978) {
         this.f_25978 = f_11537.player.tickCount;
         this.m_7694();
         this.m_7691();
      }
   }

   public Class_nio4jTv6m1ynGWq8.HZs4HwDaM8Wd3CUt m_7696(BlockPos var1) {
      int var2 = Class_x2jMdN8LP1dDHVdL.m_9441();

      for (Class_nio4jTv6m1ynGWq8.HZs4HwDaM8Wd3CUt var4 : this.f_25977) {
         if (var4.f_25968.equals(var1) && var4.f_25971 == var2) {
            return var4;
         }
      }

      return null;
   }

   private BlockPos m_7697(BlockPos var1) {
      for (BlockPos var3 : this.f_25976) {
         if (var1.getX() == var3.getX() && var1.getZ() == var3.getZ()) {
            return var3;
         }
      }

      return null;
   }

   public long m_7698(BlockPos var1) {
      if (var1 != null && f_11537.level != null) {
         for (Entity var3 : f_11537.level.entitiesForRendering()) {
            if (var3 instanceof ArmorStand var4 && var4.blockPosition().getX() == var1.getX() && var4.blockPosition().getZ() == var1.getZ()) {
               long var5 = m_7692(var4);
               if (var5 >= 0L) {
                  return var5;
               }
            }
         }

         Class_nio4jTv6m1ynGWq8.HZs4HwDaM8Wd3CUt var7 = this.m_7696(var1);
         return var7 == null ? f_25982 : var7.m_7689();
      } else {
         return f_25981;
      }
   }

   public static final class HZs4HwDaM8Wd3CUt {
      public final BlockPos f_25968;
      public long f_25969;
      public long f_25970;
      public int f_25971;
      public static final long f_25972 = 1000L;
      public static final long f_25973 = 1000L;
      public static final long f_25974 = 5L;

      public void m_7688(long var1) {
         if (Math.abs(var1 / f_25972 - this.m_7689() / f_25973) > f_25974) {
            this.f_25969 = var1;
            this.f_25970 = System.currentTimeMillis();
            this.f_25971 = Class_x2jMdN8LP1dDHVdL.m_9441();
         }
      }

      public long m_7689() {
         return Math.max(0L, this.f_25969 - (System.currentTimeMillis() - this.f_25970));
      }

      public HZs4HwDaM8Wd3CUt(BlockPos var1, long var2) {
         this.f_25968 = var1.immutable();
         this.f_25969 = var2;
         this.f_25970 = System.currentTimeMillis();
         this.f_25971 = Class_x2jMdN8LP1dDHVdL.m_9441();
      }
   }
}
