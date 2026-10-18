package dev.dimasik.client.system;

import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.ClipContext.Block;
import net.minecraft.world.level.ClipContext.Fluid;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.HitResult.Type;

public final class Class_criCmrqhnv0ahHh4 implements Class_NzJrN63M7QBpmAbi {
   private boolean f_18707;
   private BlockPos f_18708;
   private static final double f_18709 = 1.0E-8;
   private static final double f_18710 = 1.0E-8;
   private static final double f_18711 = 1.0E-4;
   private static final double f_18712 = 1.0E-4;
   private static final float f_18713 = (float) (Math.PI / 180.0);
   private static final float f_18714 = (float) Math.PI;
   private static final float f_18715 = (float) (Math.PI / 180.0);

   private Vec3 m_6249(Vec3 var1, Vec3 var2, BlockPos var3) {
      AABB var4 = new AABB(var3);
      double var5 = Double.POSITIVE_INFINITY;
      double var7 = f_18710;
      if (var2.x > var7) {
         var5 = Math.min(var5, (var4.maxX - var1.x) / var2.x);
      } else if (var2.x < -var7) {
         var5 = Math.min(var5, (var4.minX - var1.x) / var2.x);
      }

      if (var2.y > var7) {
         var5 = Math.min(var5, (var4.maxY - var1.y) / var2.y);
      } else if (var2.y < -var7) {
         var5 = Math.min(var5, (var4.minY - var1.y) / var2.y);
      }

      if (var2.z > var7) {
         var5 = Math.min(var5, (var4.maxZ - var1.z) / var2.z);
      } else if (var2.z < -var7) {
         var5 = Math.min(var5, (var4.minZ - var1.z) / var2.z);
      }

      return Double.isFinite(var5) && !(var5 < 0.0) ? var1.add(var2.scale(var5 + f_18712)) : var1.add(var2.scale(f_18711));
   }

   public void m_6250(BlockPos var1) {
      this.f_18707 = var1 != null;
      this.f_18708 = var1 == null ? null : var1.immutable();
   }

   public BlockHitResult m_6251(double var1) {
      return this.f_18707 ? this.m_6253(this.f_18708, var1) : null;
   }

   public void m_6252() {
      this.f_18707 = false;
      this.f_18708 = null;
   }

   public BlockHitResult m_6253(BlockPos var1, double var2) {
      return var1 != null && f_11537.player != null && f_11537.level != null && !(var2 <= 0.0)
         ? this.m_6256(var1, var2, this.m_6254(f_11537.player.getYRot(), f_11537.player.getXRot()))
         : null;
   }

   private Vec3 m_6254(float var1, float var2) {
      float var3 = -var1 * f_18713 - f_18714;
      float var4 = -var2 * f_18715;
      float var5 = Mth.cos(var3);
      float var6 = Mth.sin(var3);
      float var7 = -Mth.cos(var4);
      float var8 = Mth.sin(var4);
      return new Vec3(var6 * var7, var8, var5 * var7);
   }

   public BlockHitResult m_6255(BlockPos var1, double var2) {
      return this.m_6257(var1, var1 == null ? null : Vec3.atCenterOf(var1), var2);
   }

   private BlockHitResult m_6256(BlockPos var1, double var2, Vec3 var4) {
      Vec3 var5 = f_11537.player.getEyePosition();
      Vec3 var6 = var5.add(var4.scale(var2));
      Vec3 var7 = var5;
      double var8 = var2 * var2;

      for (int var10 = 0; var10 < 64; var10++) {
         BlockHitResult var11 = f_11537.level.clip(new ClipContext(var7, var6, Block.OUTLINE, Fluid.NONE, f_11537.player));
         if (var11.getType() == Type.MISS) {
            return null;
         }

         if (var1.equals(var11.getBlockPos())) {
            return var11;
         }

         Vec3 var12 = this.m_6249(var11.getLocation(), var4, var11.getBlockPos());
         if (var12 == null || var5.distanceToSqr(var12) >= var8) {
            return null;
         }

         var7 = var12;
      }

      return null;
   }

   public BlockHitResult m_6257(BlockPos var1, Vec3 var2, double var3) {
      if (var1 != null && var2 != null && f_11537.player != null && f_11537.level != null && !(var3 <= 0.0)) {
         Vec3 var5 = f_11537.player.getEyePosition();
         Vec3 var6 = var2.subtract(var5);
         return var6.lengthSqr() <= f_18709 ? null : this.m_6256(var1, var3, var6.normalize());
      } else {
         return null;
      }
   }
}
