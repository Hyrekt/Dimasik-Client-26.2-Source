package dev.dimasik.client.system;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.VoxelShape;

public final class Class_jK02SoiaOvxc0VOJ {
   private static final double[][] f_24697 = new double[][]{
      {Class_jK02SoiaOvxc0VOJ.f_24710, Class_jK02SoiaOvxc0VOJ.f_24711},
      {Class_jK02SoiaOvxc0VOJ.f_24712, Class_jK02SoiaOvxc0VOJ.f_24713},
      {Class_jK02SoiaOvxc0VOJ.f_24714, Class_jK02SoiaOvxc0VOJ.f_24715},
      {Class_jK02SoiaOvxc0VOJ.f_24716, Class_jK02SoiaOvxc0VOJ.f_24717},
      {Class_jK02SoiaOvxc0VOJ.f_24718, Class_jK02SoiaOvxc0VOJ.f_24719}
   };
   private static final double f_24698 = 0.1;
   private static final double f_24699 = 0.1;
   private static final double f_24700 = 0.1;
   private static final double f_24701 = 1.0E-7;
   private static final double f_24702 = 1.0E-7;
   private static final double f_24703 = 1.0E-7;
   private static final double f_24704 = 1.0E-7;
   private static final double f_24705 = 1.0E-7;
   private static final double f_24706 = 1.0E-7;
   private static final double f_24707 = 1.0E-10;
   private static final double f_24708 = 0.001;
   private static final double f_24709 = 1.0E-6;
   private static final double f_24710 = 0.5;
   private static final double f_24711 = 0.5;
   private static final double f_24712 = 0.25;
   private static final double f_24713 = 0.5;
   private static final double f_24714 = 0.75;
   private static final double f_24715 = 0.5;
   private static final double f_24716 = 0.5;
   private static final double f_24717 = 0.25;
   private static final double f_24718 = 0.5;
   private static final double f_24719 = 0.75;

   private Class_jK02SoiaOvxc0VOJ() {
   }

   public static Class_BYfjHaSHGXpfcI6Q m_7368(VoxelShape var0, BlockPos var1, Direction var2, Vec3 var3, double var4) {
      if (var0.isEmpty()) {
         return null;
      }

      AABB var6 = var0.bounds().move(var1);
      if (var6.contains(var3)) {
         Vec3 var7 = var3.add(-var2.getStepX() * f_24698, -var2.getStepY() * f_24699, -var2.getStepZ() * f_24700);
         BlockHitResult var8 = var0.clip(var3, var7, var1);
         if (var8 != null && var8.isInside() && var8.getDirection() == var2 && var3.distanceToSqr(var8.getLocation()) <= var4 * var4) {
            return new Class_BYfjHaSHGXpfcI6Q(var1.immutable(), var2, var8.getLocation(), true);
         }
      }
      boolean var18 = switch (var2) {
         case UP -> var3.y >= var6.maxY - f_24701;
         case DOWN -> var3.y <= var6.minY + f_24702;
         case EAST -> var3.x >= var6.maxX - f_24703;
         case WEST -> var3.x <= var6.minX + f_24704;
         case SOUTH -> var3.z >= var6.maxZ - f_24705;
         case NORTH -> var3.z <= var6.minZ + f_24706;
         default -> throw new MatchException(null, null);
      };
      if (!var6.contains(var3) && !var18) {
         return null;
      }

      for (AABB var9 : var0.toAabbs()) {
         AABB var10 = var9.move(var1);

         for (double[] var14 : f_24697) {
            Vec3 var15 = switch (var2) {
               case UP -> new Vec3(Mth.lerp(var14[0], var10.minX, var10.maxX), var10.maxY, Mth.lerp(var14[1], var10.minZ, var10.maxZ));
               case DOWN -> new Vec3(Mth.lerp(var14[0], var10.minX, var10.maxX), var10.minY, Mth.lerp(var14[1], var10.minZ, var10.maxZ));
               case EAST -> new Vec3(var10.maxX, Mth.lerp(var14[1], var10.minY, var10.maxY), Mth.lerp(var14[0], var10.minZ, var10.maxZ));
               case WEST -> new Vec3(var10.minX, Mth.lerp(var14[1], var10.minY, var10.maxY), Mth.lerp(var14[0], var10.minZ, var10.maxZ));
               case SOUTH -> new Vec3(Mth.lerp(var14[0], var10.minX, var10.maxX), Mth.lerp(var14[1], var10.minY, var10.maxY), var10.maxZ);
               case NORTH -> new Vec3(Mth.lerp(var14[0], var10.minX, var10.maxX), Mth.lerp(var14[1], var10.minY, var10.maxY), var10.minZ);
               default -> throw new MatchException(null, null);
            };
            Vec3 var16 = var15.subtract(var3);
            if (!(var16.lengthSqr() < f_24707) && !(var16.lengthSqr() > var4 * var4)) {
               BlockHitResult var17 = var0.clip(var3, var15.add(var16.normalize().scale(f_24708)), var1);
               if (var17 != null
                  && var17.getDirection() == var2
                  && !(var3.distanceToSqr(var17.getLocation()) > var4 * var4)
                  && (var17.isInside() || !(var17.getLocation().distanceToSqr(var15) > f_24709))) {
                  return new Class_BYfjHaSHGXpfcI6Q(var1.immutable(), var2, var17.getLocation(), var17.isInside());
               }
            }
         }
      }

      return null;
   }
}
