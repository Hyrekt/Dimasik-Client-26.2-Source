package dev.dimasik.client.system;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public final class Class_Z0izWwXu9a1Si1AJ {
   private static final double f_16753 = -0.08;
   private static final double f_16754 = 0.25;
   private static final double f_16755 = 0.05;
   private static final double f_16756 = 0.25;
   private static final double f_16757 = 1.0E-7;
   private static final double f_16758 = 1.0E-7;
   private static final double f_16759 = 1.0E-7;
   private static final double f_16760 = 1.0E-7;
   private static final double f_16761 = 0.98;
   private static final double f_16762 = 0.98;
   private static final double f_16763 = 0.98;

   private Class_Z0izWwXu9a1Si1AJ() {
   }

   public static List<Class_Z0izWwXu9a1Si1AJ.EvMJrFDTQ1wRtmlQ> m_5763(
      AABB var0, Vec3 var1, boolean var2, double var3, int var5, Class_Z0izWwXu9a1Si1AJ.Class_3064DnT7TP2jFYCW var6, Predicate<AABB> var7
   ) {
      ArrayList var8 = new ArrayList();
      var8.add(new Class_Z0izWwXu9a1Si1AJ.EvMJrFDTQ1wRtmlQ(0, var0, var2));

      for (int var9 = 1; var9 <= Math.clamp(var5, 0, 12); var9++) {
         boolean var10 = var7.test(var0);
         Vec3 var11 = var1;
         if (var2 && var11.y <= 0.0) {
            var11 = new Vec3(var11.x, f_16753, var11.z);
         }

         if (var10) {
            var11 = var11.multiply(f_16754, f_16755, f_16756);
         }

         Vec3 var12 = var6.m_5762(var0, var11);
         var2 = var11.y < 0.0 && Math.abs(var12.y - var11.y) > f_16757;
         var0 = var0.move(var12);
         var8.add(new Class_Z0izWwXu9a1Si1AJ.EvMJrFDTQ1wRtmlQ(var9, var0, var2));
         double var13 = Math.abs(var12.x - var11.x) > f_16758 ? 0.0 : var11.x;
         double var15 = Math.abs(var12.z - var11.z) > f_16759 ? 0.0 : var11.z;
         double var17 = Math.abs(var12.y - var11.y) > f_16760 ? 0.0 : var11.y;
         var1 = new Vec3(var13 * (var2 ? 1.0 : f_16761), var2 ? 0.0 : (var17 - var3) * f_16762, var15 * (var2 ? 1.0 : f_16763));
      }

      return var8;
   }

   @FunctionalInterface
   public interface Class_3064DnT7TP2jFYCW {
      Vec3 m_5762(AABB var1, Vec3 var2);
   }

   public record EvMJrFDTQ1wRtmlQ(int tick, AABB box, boolean grounded) {
   }
}
