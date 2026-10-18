package dev.dimasik.client.system;

import java.util.List;
import lombok.Generated;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public final class Class_vHNpk6NDOYyuwWmv implements Class_NzJrN63M7QBpmAbi {
   public static final double f_33414 = 10.0;
   private static final int f_33415 = 2;
   private static final int f_33416 = -2;
   private static final int f_33417 = 2;
   private static final float f_33418 = -Float.MAX_VALUE;
   private static final double f_33419 = 0.5;
   private static final double f_33420 = 0.5;
   private static final double f_33421 = 0.5;
   private static final double f_33422 = 10.0;
   private static final float f_33423 = 0.5F;
   private static final double f_33424 = 10.0;
   private static final double f_33425 = 10.0;
   private static final String f_33426 = "This is a utility class and cannot be instantiated";

   @Generated
   private Class_vHNpk6NDOYyuwWmv() {
      throw new UnsupportedOperationException(f_33426);
   }

   private static float m_9252(Vec3 var0, List<Player> var1) {
      float var2 = 0.0F;

      for (Player var4 : var1) {
         if (var4 != null && var4.isAlive()) {
            var2 = Math.max(var2, Class_54SEkpqYjEsUMrjI.m_1404(var0, var4, var4.getBoundingBox(), null, List.of(), f_33424));
         }
      }

      return var2;
   }

   private static float m_9254(Vec3 var0, List<Player> var1) {
      if (var1 != null && !var1.isEmpty()) {
         float var2 = 0.0F;

         for (Player var4 : var1) {
            if (var4 != null && var4 != f_11537.player && var4.isAlive()) {
               var2 = Math.max(var2, Class_54SEkpqYjEsUMrjI.m_1404(var0, var4, var4.getBoundingBox(), null, List.of(), f_33425));
            }
         }

         return var2;
      } else {
         return 0.0F;
      }
   }

   private static boolean m_9255(BlockPos var0) {
      if (f_11537.level == null) {
         return true;
      }

      AABB var1 = new AABB(var0);
      return !f_11537.level.getEntities((Entity)null, var1, var0x -> var0x.isAlive() && !var0x.isSpectator()).isEmpty();
   }

   public static Class_vHNpk6NDOYyuwWmv.fga36R7KxHrH3aap m_9256(
      List<Player> var0, Vec3 var1, float var2, float var3, float var4, float var5, boolean var6, float var7, List<Player> var8
   ) {
      if (f_11537.level != null && f_11537.player != null && var0 != null && !var0.isEmpty()) {
         if (f_11537.level.dimension().identifier().equals(Level.NETHER.identifier())) {
            return null;
         }

         double var9 = var2 * var2;
         double var11 = var3 * var3;
         AABB var13 = f_11537.player.getBoundingBox();
         Class_vHNpk6NDOYyuwWmv.fga36R7KxHrH3aap var14 = null;
         float var15 = f_33418;

         for (Player var17 : var0) {
            BlockPos var18 = BlockPos.containing(var17.getX(), var17.getY(), var17.getZ());

            for (int var19 = -2; var19 <= 2; var19++) {
               for (int var20 = -2; var20 <= 2; var20++) {
                  if (var19 != 0 || var20 != 0) {
                     for (int var21 = -2; var21 <= 2; var21++) {
                        BlockPos var22 = var18.offset(var19, var21, var20);
                        BlockState var23 = f_11537.level.getBlockState(var22);
                        boolean var24;
                        if (!var23.isAir() && !var23.canBeReplaced()) {
                           var24 = false;
                        } else {
                           if (!var6 || !var23.canBeReplaced()) {
                              continue;
                           }

                           var24 = true;
                        }

                        BlockPos var25 = var22.above();
                        if (f_11537.level.getBlockState(var25).canBeReplaced()) {
                           Vec3 var26 = new Vec3(var25.getX() + f_33419, var25.getY() + f_33420, var25.getZ() + f_33421);
                           double var27 = var1.distanceToSqr(var26);
                           if (!(var27 > var9) && !(var27 > var11) && !m_9255(var25)) {
                              float var29 = m_9252(var26, var0);
                              if (!(var29 < var5)) {
                                 float var30 = Class_54SEkpqYjEsUMrjI.m_1404(var26, f_11537.player, var13, null, List.of(), f_33422);
                                 if (!(var30 >= var7) && (!(var30 > var4) || !(var30 >= var29))) {
                                    float var31 = m_9254(var26, var8);
                                    if (!(var31 > var4) || !(var31 >= var29)) {
                                       float var32 = var29 - var30 * 2.0F - var31 * 2.0F - (float)Math.sqrt(var27) * f_33423;
                                       if (var32 > var15) {
                                          var15 = var32;
                                          var14 = new Class_vHNpk6NDOYyuwWmv.fga36R7KxHrH3aap(var22.immutable(), var25.immutable(), var24);
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         return var14;
      } else {
         return null;
      }
   }

   public record fga36R7KxHrH3aap(BlockPos base, BlockPos anchorPos, boolean needsObsidian) {
   }
}
