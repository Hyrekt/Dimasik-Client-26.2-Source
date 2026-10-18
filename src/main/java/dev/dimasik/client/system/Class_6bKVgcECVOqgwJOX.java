package dev.dimasik.client.system;

import lombok.Generated;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public final class Class_6bKVgcECVOqgwJOX implements Class_NzJrN63M7QBpmAbi {
   private static final String f_2839 = "This is a utility class and cannot be instantiated";

   public static BlockState m_1547(Block var0, int var1) {
      BlockPos var2 = f_11537.player.getBlockPosBelowThatAffectsMyMovement().offset(-var1, -var1, -var1);
      BlockPos var3 = f_11537.player.getBlockPosBelowThatAffectsMyMovement().offset(var1, var1, var1);

      for (int var4 = var2.getX(); var4 < var3.getX(); var4++) {
         for (int var5 = var2.getY(); var5 < var3.getY(); var5++) {
            for (int var6 = var2.getZ(); var6 < var3.getZ(); var6++) {
               BlockPos var7 = new BlockPos(var4, var5, var6);
               BlockState var8 = f_11537.level.getBlockState(var7);
               if (var8.getBlock().equals(var0)) {
                  return var8;
               }
            }
         }
      }

      return null;
   }

   @Generated
   private Class_6bKVgcECVOqgwJOX() {
      throw new UnsupportedOperationException(f_2839);
   }
}
