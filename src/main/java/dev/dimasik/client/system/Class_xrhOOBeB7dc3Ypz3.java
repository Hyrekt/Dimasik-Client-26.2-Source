package dev.dimasik.client.system;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.status.ChunkStatus;
import net.minecraft.world.level.levelgen.Heightmap.Types;
import net.minecraft.world.phys.AABB;

public final class Class_xrhOOBeB7dc3Ypz3 {
   public static final int f_35173 = 65;
   public static final double f_35174 = 1.0E-7;
   private static final int f_35175 = 1;
   private static final double f_35176 = 0.25;
   private static final double f_35177 = 0.29;
   private static final double f_35178 = 1.0;
   private static final double f_35179 = 1.8;
   private static final double f_35180 = 0.5;
   private static final double f_35181 = 1.0E-7;
   private static final double f_35182 = 1.0E-7;
   private static final double f_35183 = 65.0;
   private static final double f_35184 = 1.0E-7;
   private static final double f_35185 = Double.MAX_VALUE;
   private static final double f_35186 = 0.25;
   private static final double f_35187 = 0.29;
   private static final double f_35188 = 0.29;
   private static final double f_35189 = 0.29;
   private static final double f_35190 = 1.8;
   private static final double f_35191 = 0.29;
   private static final double f_35192 = 0.29;
   private static final double f_35193 = 0.29;
   private static final double f_35194 = 0.29;
   private static final double f_35195 = 1.8;
   private static final double f_35196 = 0.29;
   private static final double f_35197 = 65.0000001;

   private boolean m_9555(ClientLevel var1, LocalPlayer var2, double var3, double var5, double var7) {
      AABB var9 = new AABB(var3 - f_35187, var5 + 1.0, var7 - f_35188, var3 + f_35189, var5 + f_35190, var7 + f_35191);
      return var1.noCollision(var2, var9);
   }

   public Class_xrhOOBeB7dc3Ypz3.Class_5jfddM01kcv3NYub m_9556(ClientLevel var1, int var2, int var3) {
      int var4 = Math.min(var1.getHeight(Types.WORLD_SURFACE, var2, var3) - 1, var1.getMaxY());
      boolean var5 = false;

      for (int var6 = var4; var6 >= var1.getMinY(); var6--) {
         BlockPos var7 = new BlockPos(var2, var6, var3);
         BlockState var8 = var1.getBlockState(var7);
         if (var8.getFluidState().is(FluidTags.WATER)) {
            var5 = true;
         }

         if (!var8.getCollisionShape(var1, var7).isEmpty()) {
            return new Class_xrhOOBeB7dc3Ypz3.Class_5jfddM01kcv3NYub(var6, var5);
         }
      }

      return null;
   }

   private boolean m_9557(double var1, double var3, double var5, double var7) {
      return Math.hypot(var5 - var1, var7 - var3) <= f_35197;
   }

   private boolean m_9558(ClientLevel var1, LocalPlayer var2, double var3, double var5, double var7) {
      AABB var9 = new AABB(var3 - f_35192, var5, var7 - f_35193, var3 + f_35194, var5 + f_35195, var7 + f_35196);
      return var1.noCollision(var2, var9);
   }

   public boolean m_9559(ClientLevel var1, int var2, int var3) {
      return var1.getChunkSource().getChunk(var2 >> 4, var3 >> 4, ChunkStatus.FULL, false) != null;
   }

   private Class_xrhOOBeB7dc3Ypz3.GOXK1fVlpDV1VLLV m_9560(
      ClientLevel var1, LocalPlayer var2, double var3, double var5, double var7, double var9, double var11, double var13
   ) {
      int var15 = (int)Math.floor(var7);
      int var16 = (int)Math.floor(var9);
      double var17 = Math.hypot(var11 - var3, var13 - var5);
      Class_xrhOOBeB7dc3Ypz3.GOXK1fVlpDV1VLLV var19 = null;
      double var20 = f_35185;

      for (int var22 = -1; var22 <= 1; var22++) {
         for (int var23 = -1; var23 <= 1; var23++) {
            int var24 = var15 + var22;
            int var25 = var16 + var23;
            double var26 = this.m_9563(var24);
            double var28 = this.m_9563(var25);
            if (this.m_9557(var3, var5, var26, var28)) {
               double var30 = Math.hypot(var11 - var26, var13 - var28);
               if (!(var30 > var17 - f_35186) && this.m_9562(var1, var26, var28)) {
                  Class_xrhOOBeB7dc3Ypz3.Class_5jfddM01kcv3NYub var32 = this.m_9556(var1, var24, var25);
                  if (var32 != null && this.m_9555(var1, var2, var26, var32.y(), var28) && this.m_9558(var1, var2, var26, var32.y() + 1.0, var28)) {
                     double var33 = var26 - var7;
                     double var35 = var28 - var9;
                     double var37 = var33 * var33 + var35 * var35;
                     if (var37 < var20) {
                        var20 = var37;
                        var19 = new Class_xrhOOBeB7dc3Ypz3.GOXK1fVlpDV1VLLV(var26, var28, var32);
                     }
                  }
               }
            }
         }
      }

      return var19;
   }

   public Class_xrhOOBeB7dc3Ypz3.GOXK1fVlpDV1VLLV m_9561(ClientLevel var1, LocalPlayer var2, double var3, double var5, int var7, int var8) {
      double var9 = this.m_9563(var7);
      double var11 = this.m_9563(var8);
      double var13 = var9 - var3;
      double var15 = var11 - var5;
      double var17 = Math.hypot(var13, var15);
      if (var17 <= f_35182) {
         return null;
      }

      for (double var19 = Math.min(var17, f_35183); var19 > f_35184; var19 -= Math.min(1.0, var19)) {
         double var21 = var19 / var17;
         double var23 = var3 + var13 * var21;
         double var25 = var5 + var15 * var21;
         Class_xrhOOBeB7dc3Ypz3.GOXK1fVlpDV1VLLV var27 = this.m_9560(var1, var2, var3, var5, var23, var25, var9, var11);
         if (var27 != null) {
            return var27;
         }
      }

      return null;
   }

   private boolean m_9562(ClientLevel var1, double var2, double var4) {
      int var6 = (int)Math.floor(var2) >> 4;
      int var7 = (int)Math.floor(var4) >> 4;
      return var1.getChunkSource().getChunk(var6, var7, ChunkStatus.FULL, false) != null;
   }

   public double m_9563(int var1) {
      return var1 + f_35180;
   }

   public boolean m_9564(double var1, double var3, int var5, int var6) {
      return Math.hypot(this.m_9563(var5) - var1, this.m_9563(var6) - var3) <= f_35181;
   }

   record Class_5jfddM01kcv3NYub(int y, boolean underwater) {
   }

   record GOXK1fVlpDV1VLLV(double x, double z, Class_xrhOOBeB7dc3Ypz3.Class_5jfddM01kcv3NYub surface) {
   }
}
